#!/usr/bin/env python3
"""
Migrate SPD 1.0 (.spd / .xmi) instances to Elasticity 2.0 (.elasticity) XMI.

Usage:
  python3 migrate_spd_to_elasticity.py INPUT.spd [OUTPUT.elasticity]

Limitations (v1 of the migrator):
  - Handles ElasticInfrastructure / ServiceGroup / CompetingConsumersGroup
  - Handles SimpleFireOnValue + Step/Relative/Absolute adjustments
  - ComposedTrigger / SimpleFireOnTrend / policy constraints are best-effort
  - Does not migrate semantic.ecore / measuring-point models
  - Learning policies did not exist in SPD 1.0 — create LearningProcedure by hand
    (see examples/after-elasticity/FuzzyQLearning.elasticity)

The script is intentionally dependency-light (stdlib XML only) so it can run
without Eclipse/EMF. Pair with validate_elasticity.py for structural checks.
"""

from __future__ import annotations

import argparse
import sys
import xml.etree.ElementTree as ET
from pathlib import Path
from typing import Optional
from xml.dom import minidom

NS = {
    "spd": "http://palladiosimulator.org/ScalingPolicyDefinition/1.0",
    "targets": "http://palladiosimulator.org/ScalingPolicyDefinition/Targets/1.0",
    "adjustments": "http://palladiosimulator.org/ScalingPolicyDefinition/Adjustments/1.0",
    "triggers": "http://palladiosimulator.org/ScalingPolicyDefinition/Triggers/1.0",
    "stimuli": "http://palladiosimulator.org/ScalingPolicyDefinition/Triggers/Stimuli/1.0",
    "expectations": "http://palladiosimulator.org/ScalingPolicyDefinition/Triggers/Expectations/1.0",
    "xsi": "http://www.w3.org/2001/XMLSchema-instance",
}

STIMULUS_TO_METRIC = {
    "CPUUtilization": "CPU_UTILIZATION",
    "MemoryUtilization": "MEMORY_UTILIZATION",
    "HDDUtilization": "HDD_UTILIZATION",
    "NetworkUtilization": "NETWORK_UTILIZATION",
    "TaskCount": "TASK_COUNT",
    "NumberOfElements": "NUMBER_OF_ELEMENTS",
    "OperationResponseTime": "OPERATION_RESPONSE_TIME",
    "QueueLength": "QUEUE_LENGTH",
    "SimulationTime": "SIMULATION_TIME",
}

AGG = {
    "AVERAGE": "AVERAGE",
    "MAX": "MAX",
    "MIN": "MIN",
    "MEDIAN": "MEDIAN",
    "SUM": "SUM",
}


def local(tag: str) -> str:
    if "}" in tag:
        return tag.rsplit("}", 1)[-1]
    if ":" in tag:
        return tag.split(":", 1)[-1]
    return tag


def xsi_type(el: ET.Element) -> str:
    raw = el.get(f"{{{NS['xsi']}}}type") or el.get("xsi:type") or ""
    return raw.split(":")[-1] if raw else local(el.tag)


def attr(el: ET.Element, *names: str, default: str = "") -> str:
    for n in names:
        if el.get(n) is not None:
            return el.get(n)  # type: ignore
    return default


def find_child(parent: ET.Element, name: str) -> Optional[ET.Element]:
    for c in parent:
        if local(c.tag) == name:
            return c
    return None


def migrate_stimulus(stim: ET.Element) -> dict:
    kind = xsi_type(stim)
    metric = STIMULUS_TO_METRIC.get(kind, "CUSTOM")
    out = {
        "metric": metric,
        "scope": "TARGET_GROUP_AGGREGATE",
        "aggregation": AGG.get(attr(stim, "aggregationOverElements"), "") or None,
    }
    if metric == "CUSTOM":
        out["customMetricId"] = kind
    if kind == "OperationResponseTime":
        out["scope"] = "PCM_ELEMENT"
        out["pcmElementRef"] = attr(stim, "operationSignature", default="")
    if kind == "QueueLength":
        out["scope"] = "PCM_ELEMENT"
        out["pcmElementRef"] = attr(stim, "passiveResource", default="")
    if kind == "SimulationTime":
        out["scope"] = "SIMULATION"
    return {k: v for k, v in out.items() if v not in (None, "")}


def migrate_expected(exp: ET.Element) -> tuple[str, dict]:
    kind = xsi_type(exp)
    if kind == "ExpectedPercentage":
        return "ExpectedPercentage", {"value": attr(exp, "value", default="0")}
    if kind == "ExpectedCount":
        return "ExpectedCount", {"count": attr(exp, "count", default="0")}
    if kind == "ExpectedTime":
        return "ExpectedTime", {"value": attr(exp, "value", default="0")}
    return "ExpectedPercentage", {"value": "0"}


def migrate_adjustment(adj: ET.Element) -> tuple[str, dict]:
    kind = xsi_type(adj)
    if kind == "RelativeAdjustment":
        return "RelativeAction", {
            "percentageGrowthValue": attr(adj, "percentageGrowthValue", default="100"),
            "minAdjustmentValue": attr(adj, "minAdjustmentValue", default="0"),
        }
    if kind == "AbsoluteAdjustment":
        return "AbsoluteAction", {"goalValue": attr(adj, "goalValue", default="1")}
    return "StepAction", {"stepValue": attr(adj, "stepValue", default="1")}


def migrate_target(tg: ET.Element, index: int) -> dict:
    kind = xsi_type(tg)
    tid = attr(tg, "id", default=f"_tg_{index}")
    name = attr(tg, "entityName", default=kind or "Target")
    group: dict = {
        "id": tid,
        "entityName": name,
        "constraints": [],
        "hints": [],
    }
    if kind == "ElasticInfrastructure":
        group["cardinalitySemantics"] = "INFRASTRUCTURE_POOL"
        group["binding"] = {
            "type": "ResourceContainerTemplateBinding",
            "unitResourceContainerRef": attr(tg, "unit", default="UNKNOWN_RC"),
        }
    elif kind == "ServiceGroup":
        group["cardinalitySemantics"] = "HOMOGENEOUS_REPLICA"
        group["binding"] = {
            "type": "AssemblyReplicaBinding",
            "unitAssemblyRef": attr(tg, "unitAssembly", default="UNKNOWN_ASSEMBLY"),
        }
    elif kind == "CompetingConsumersGroup":
        group["cardinalitySemantics"] = "CONSUMER_POOL"
        group["binding"] = {
            "type": "CompetingConsumerBinding",
            "unitAssemblyRef": attr(tg, "unitAssembly", default="UNKNOWN_ASSEMBLY"),
        }
    else:
        group["cardinalitySemantics"] = "CUSTOM"
        group["binding"] = {
            "type": "AssemblyReplicaBinding",
            "unitAssemblyRef": "UNKNOWN",
        }

    for c in tg:
        if local(c.tag) != "targetConstraints":
            continue
        ck = xsi_type(c)
        if ck == "TargetGroupSizeConstraint":
            group["constraints"].append(
                {
                    "type": "TargetGroupSizeConstraint",
                    "id": attr(c, "id", default=f"_sz_{index}"),
                    "entityName": attr(c, "entityName", default="size"),
                    "minSize": attr(c, "minSize", default="1"),
                    "maxSize": attr(c, "maxSize", default="10"),
                }
            )
        elif ck == "ThrashingConstraint":
            group["constraints"].append(
                {
                    "type": "ThrashingConstraint",
                    "id": attr(c, "id", default=f"_th_{index}"),
                    "entityName": attr(c, "entityName", default="thrashing"),
                    "minimumTimeNoThrashing": attr(c, "minimumTimeNoThrashing", default="0"),
                }
            )
    return group


def migrate_policy(pol: ET.Element, group_index_by_ref: dict) -> dict:
    pid = attr(pol, "id", default="policy")
    name = attr(pol, "entityName", default=pid)
    active = attr(pol, "active", default="true")
    tg_ref = attr(pol, "targetGroup", default="//@targetGroups.0")
    # Resolve //@targetGroups.N
    gidx = 0
    if "targetGroups." in tg_ref:
        try:
            gidx = int(tg_ref.rsplit(".", 1)[-1])
        except ValueError:
            gidx = 0
    elif tg_ref in group_index_by_ref:
        gidx = group_index_by_ref[tg_ref]

    adj = find_child(pol, "adjustmentType")
    trig = find_child(pol, "scalingTrigger")
    effect_type, effect_attrs = migrate_adjustment(adj) if adj is not None else ("StepAction", {"stepValue": "1"})

    trigger_xml: dict = {"type": "ComparisonTrigger", "relationalOperator": "GreaterThan"}
    if trig is not None:
        tk = xsi_type(trig)
        if tk == "SimpleFireOnValue":
            trigger_xml["relationalOperator"] = attr(trig, "relationalOperator", default="GreaterThan")
            stim = find_child(trig, "stimulus")
            exp = find_child(trig, "expectedValue")
            if stim is not None:
                trigger_xml["observation"] = migrate_stimulus(stim)
            if exp is not None:
                et, ea = migrate_expected(exp)
                trigger_xml["expectedType"] = et
                trigger_xml["expected"] = ea
        elif tk == "SimpleFireOnTrend":
            stim = find_child(trig, "stimulus")
            exp = find_child(trig, "expectedValue")
            trigger_xml = {"type": "TrendTrigger", "trend": "Increasing"}
            if exp is not None and attr(exp, "trend"):
                trigger_xml["trend"] = attr(exp, "trend")
            if stim is not None:
                trigger_xml["observation"] = migrate_stimulus(stim)
        else:
            # Composed / unknown → emit Comparison with CPU placeholder and note
            trigger_xml["observation"] = {"metric": "CPU_UTILIZATION", "scope": "TARGET_GROUP_AGGREGATE"}
            trigger_xml["expectedType"] = "ExpectedPercentage"
            trigger_xml["expected"] = {"value": "80"}
            trigger_xml["migrationNote"] = f"Unsupported trigger {tk}; placeholder emitted"

    constraints = []
    for c in pol:
        if local(c.tag) != "policyConstraints":
            continue
        ck = xsi_type(c)
        if ck == "CooldownConstraint":
            constraints.append(
                {
                    "type": "CooldownConstraint",
                    "id": attr(c, "id", default="_cd"),
                    "entityName": attr(c, "entityName", default="cooldown"),
                    "cooldownTime": attr(c, "cooldownTime", default="0"),
                    "maxScalingOperations": attr(c, "maxScalingOperations", default="1"),
                }
            )
        elif ck == "IntervalConstraint":
            constraints.append(
                {
                    "type": "IntervalConstraint",
                    "id": attr(c, "id", default="_iv"),
                    "entityName": attr(c, "entityName", default="interval"),
                    "offset": attr(c, "offset", default="0"),
                    "intervalDuration": attr(c, "intervalDuration", default="60"),
                    "repeat": attr(c, "repeat", default="true"),
                }
            )

    return {
        "id": pid,
        "entityName": name,
        "active": active,
        "groupIndex": gidx,
        "effectType": effect_type,
        "effect": effect_attrs,
        "trigger": trigger_xml,
        "constraints": constraints,
    }


def escape(s: str) -> str:
    return (
        s.replace("&", "&amp;")
        .replace('"', "&quot;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
    )


def render(model: dict) -> str:
    lines = [
        '<?xml version="1.0" encoding="UTF-8"?>',
        "<!-- Migrated from SPD 1.0 by migrate_spd_to_elasticity.py -->",
        '<elasticity:ElasticityViewpoint xmi:version="2.0"',
        '    xmlns:xmi="http://www.omg.org/XMI"',
        '    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"',
        '    xmlns:elasticity="http://palladiosimulator.org/Elasticity/2.0"',
        '    xmlns:scalable="http://palladiosimulator.org/Elasticity/Scalable/2.0"',
        '    xmlns:policies="http://palladiosimulator.org/Elasticity/Policies/2.0"',
        '    xmlns:reactive="http://palladiosimulator.org/Elasticity/Reactive/2.0"',
        '    xmlns:observations="http://palladiosimulator.org/Elasticity/Observations/2.0"',
        '    xmlns:actions="http://palladiosimulator.org/Elasticity/Actions/2.0"',
        '    xmlns:elconstraints="http://palladiosimulator.org/Elasticity/Constraints/2.0"',
        f'    id="{escape(model["id"])}" entityName="{escape(model["entityName"])}">',
        f'  <scalableArchitecture id="_sa" entityName="ScalableArchitecture">',
    ]
    for g in model["groups"]:
        lines.append(
            f'    <groups id="{escape(g["id"])}" entityName="{escape(g["entityName"])}" '
            f'cardinalitySemantics="{g["cardinalitySemantics"]}">'
        )
        b = g["binding"]
        bt = b["type"]
        if bt == "ResourceContainerTemplateBinding":
            lines.append(
                f'      <binding xsi:type="scalable:ResourceContainerTemplateBinding" '
                f'unitResourceContainerRef="{escape(b["unitResourceContainerRef"])}"/>'
            )
        elif bt == "CompetingConsumerBinding":
            lines.append(
                f'      <binding xsi:type="scalable:CompetingConsumerBinding" '
                f'unitAssemblyRef="{escape(b["unitAssemblyRef"])}"/>'
            )
        else:
            lines.append(
                f'      <binding xsi:type="scalable:AssemblyReplicaBinding" '
                f'unitAssemblyRef="{escape(b["unitAssemblyRef"])}"/>'
            )
        for c in g["constraints"]:
            if c["type"] == "TargetGroupSizeConstraint":
                lines.append(
                    f'      <groupConstraints xsi:type="elconstraints:TargetGroupSizeConstraint" '
                    f'id="{escape(c["id"])}" entityName="{escape(c["entityName"])}" '
                    f'minSize="{c["minSize"]}" maxSize="{c["maxSize"]}"/>'
                )
            elif c["type"] == "ThrashingConstraint":
                lines.append(
                    f'      <groupConstraints xsi:type="elconstraints:ThrashingConstraint" '
                    f'id="{escape(c["id"])}" entityName="{escape(c["entityName"])}" '
                    f'minimumTimeNoThrashing="{c["minimumTimeNoThrashing"]}"/>'
                )
        lines.append("    </groups>")
    lines.append("  </scalableArchitecture>")
    lines.append('  <policySet id="_ps" entityName="Policies">')
    for p in model["policies"]:
        href = f"//@scalableArchitecture/@groups.{p['groupIndex']}"
        lines.append(
            f'    <policies id="{escape(p["id"])}" entityName="{escape(p["entityName"])}" '
            f'active="{p["active"]}" target="{href}">'
        )
        lines.append('      <decision xsi:type="policies:ReactiveRuleProcedure">')
        t = p["trigger"]
        if t["type"] == "TrendTrigger":
            lines.append(f'        <trigger xsi:type="reactive:TrendTrigger" trend="{t.get("trend", "Increasing")}">')
            obs = t.get("observation", {"metric": "CPU_UTILIZATION", "scope": "TARGET_GROUP_AGGREGATE"})
            obs_attrs = " ".join(f'{k}="{escape(str(v))}"' for k, v in obs.items())
            lines.append(f"          <observation {obs_attrs}/>")
            lines.append("        </trigger>")
        else:
            lines.append(
                f'        <trigger xsi:type="reactive:ComparisonTrigger" '
                f'relationalOperator="{t.get("relationalOperator", "GreaterThan")}">'
            )
            obs = t.get("observation", {"metric": "CPU_UTILIZATION", "scope": "TARGET_GROUP_AGGREGATE"})
            obs_attrs = " ".join(f'{k}="{escape(str(v))}"' for k, v in obs.items())
            lines.append(f"          <observation {obs_attrs}/>")
            et = t.get("expectedType", "ExpectedPercentage")
            ea = t.get("expected", {"value": "80"})
            ea_attrs = " ".join(f'{k}="{escape(str(v))}"' for k, v in ea.items())
            lines.append(f'          <expected xsi:type="reactive:{et}" {ea_attrs}/>')
            lines.append("        </trigger>")
        ea = " ".join(f'{k}="{escape(str(v))}"' for k, v in p["effect"].items())
        lines.append(f'        <effect xsi:type="actions:{p["effectType"]}" {ea}/>')
        lines.append("      </decision>")
        for c in p["constraints"]:
            if c["type"] == "CooldownConstraint":
                lines.append(
                    f'      <policyConstraints xsi:type="elconstraints:CooldownConstraint" '
                    f'id="{escape(c["id"])}" entityName="{escape(c["entityName"])}" '
                    f'cooldownTime="{c["cooldownTime"]}" maxScalingOperations="{c["maxScalingOperations"]}"/>'
                )
            elif c["type"] == "IntervalConstraint":
                lines.append(
                    f'      <policyConstraints xsi:type="elconstraints:IntervalConstraint" '
                    f'id="{escape(c["id"])}" entityName="{escape(c["entityName"])}" '
                    f'offset="{c["offset"]}" intervalDuration="{c["intervalDuration"]}" repeat="{c["repeat"]}"/>'
                )
        lines.append("    </policies>")
    lines.append("  </policySet>")
    lines.append("</elasticity:ElasticityViewpoint>")
    return "\n".join(lines) + "\n"


def migrate_file(src: Path) -> str:
    # Register namespaces so ElementTree keeps prefixes where possible
    for prefix, uri in NS.items():
        ET.register_namespace(prefix, uri)
    tree = ET.parse(src)
    root = tree.getroot()
    if local(root.tag) != "SPD":
        raise SystemExit(f"Expected root SPD, got {root.tag}")

    groups = []
    id_to_index: dict[str, int] = {}
    for i, tg in enumerate(c for c in root if local(c.tag) == "targetGroups"):
        g = migrate_target(tg, i)
        groups.append(g)
        if g["id"]:
            id_to_index[g["id"]] = i

    policies = []
    for pol in (c for c in root if local(c.tag) == "scalingPolicies"):
        policies.append(migrate_policy(pol, id_to_index))

    model = {
        "id": attr(root, "id", default="_migrated"),
        "entityName": attr(root, "entityName", default=src.stem),
        "groups": groups,
        "policies": policies,
    }
    if not groups:
        raise SystemExit("SPD has no targetGroups")
    if not policies:
        raise SystemExit("SPD has no scalingPolicies")
    return render(model)


def main() -> None:
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("input", type=Path, help="SPD .xmi / .spd file")
    ap.add_argument("output", type=Path, nargs="?", help="Output .elasticity path")
    args = ap.parse_args()
    text = migrate_file(args.input)
    out = args.output or args.input.with_suffix(".elasticity")
    out.write_text(text, encoding="utf-8")
    print(f"Wrote {out}")


if __name__ == "__main__":
    main()
