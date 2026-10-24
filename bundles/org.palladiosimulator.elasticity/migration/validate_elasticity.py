#!/usr/bin/env python3
"""
Validate Elasticity.ecore structural integrity and example/migrated instances.

Checks (no Eclipse required):
  1. Elasticity.ecore is well-formed XML and declares expected packages/classes
  2. Instance documents reference Elasticity 2.0 NS and required roots
  3. Lightweight well-formedness mirroring Elasticity.ocl:
       - viewpoint has groups + policies
       - each policy has target + decision
       - each group has binding
       - StepAction stepValue != 0
       - LearningProcedure has observations / actionSpace / reward / algorithm

Exit code 0 = all ok.
"""

from __future__ import annotations

import argparse
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
ECORE = ROOT / "model" / "Elasticity.ecore"
EXAMPLES = ROOT / "examples" / "after-elasticity"

REQUIRED_NS = {
    "http://palladiosimulator.org/Elasticity/2.0",
    "http://palladiosimulator.org/Elasticity/Scalable/2.0",
    "http://palladiosimulator.org/Elasticity/Policies/2.0",
}

REQUIRED_ECLASSES = {
    "ElasticityViewpoint",
    "ScalableGroup",
    "ArchitecturalBinding",
    "ElasticityPolicy",
    "DecisionProcedure",
    "ReactiveRuleProcedure",
    "LearningProcedure",
    "ObservationSpec",
    "StepAction",
    "FuzzyQLearning",
}


def local(tag: str) -> str:
    return tag.rsplit("}", 1)[-1] if "}" in tag else tag.split(":")[-1]


def validate_ecore(path: Path) -> list[str]:
    errors: list[str] = []
    try:
        root = ET.parse(path).getroot()
    except ET.ParseError as e:
        return [f"Ecore XML parse error: {e}"]
    if local(root.tag) != "EPackage":
        errors.append(f"Root is not EPackage: {root.tag}")
    ns_uri = root.get("nsURI", "")
    if ns_uri != "http://palladiosimulator.org/Elasticity/2.0":
        errors.append(f"Unexpected root nsURI: {ns_uri}")
    names: set[str] = set()
    for el in root.iter():
        tag = local(el.tag)
        xt = el.get("{http://www.w3.org/2001/XMLSchema-instance}type") or el.get("xsi:type") or ""
        # Serialized Ecore uses <eClassifiers xsi:type="ecore:EClass" name="..."/>
        if tag in ("EClass", "eClassifiers") and el.get("name"):
            if tag == "EClass" or "EClass" in xt:
                names.add(el.get("name"))  # type: ignore
    missing = REQUIRED_ECLASSES - names
    if missing:
        errors.append(f"Missing EClasses: {sorted(missing)}")
    if len(names) < 20:
        errors.append(f"Suspiciously few EClasses ({len(names)}); found={sorted(names)[:10]}...")
    return errors


def validate_instance(path: Path) -> list[str]:
    errors: list[str] = []
    try:
        root = ET.parse(path).getroot()
    except ET.ParseError as e:
        return [f"{path.name}: XML parse error: {e}"]

    if local(root.tag) != "ElasticityViewpoint":
        errors.append(f"{path.name}: root must be ElasticityViewpoint, got {local(root.tag)}")
        return errors

    text = path.read_text(encoding="utf-8")
    for ns in REQUIRED_NS:
        if ns not in text:
            errors.append(f"{path.name}: missing namespace {ns}")

    groups = [c for c in root.iter() if local(c.tag) == "groups"]
    policies = [c for c in root.iter() if local(c.tag) == "policies" and c.get("target")]
    # ElementTree: policySet/policies — also match nested
    if not groups:
        # try direct
        sa = next((c for c in root if local(c.tag) == "scalableArchitecture"), None)
        if sa is not None:
            groups = [c for c in sa if local(c.tag) == "groups"]
    if not groups:
        errors.append(f"{path.name}: no ScalableGroup (groups)")
    if not policies:
        ps = next((c for c in root if local(c.tag) == "policySet"), None)
        if ps is not None:
            policies = [c for c in ps if local(c.tag) == "policies"]
    if not policies:
        errors.append(f"{path.name}: no ElasticityPolicy")

    for g in groups:
        bindings = [c for c in g if local(c.tag) == "binding"]
        if not bindings:
            errors.append(f"{path.name}: group {g.get('id')} missing binding")

    for p in policies:
        if not p.get("target"):
            errors.append(f"{path.name}: policy {p.get('id')} missing target")
        decisions = [c for c in p if local(c.tag) == "decision"]
        if not decisions:
            errors.append(f"{path.name}: policy {p.get('id')} missing decision")
            continue
        d = decisions[0]
        dtype = (d.get("{http://www.w3.org/2001/XMLSchema-instance}type") or d.get("xsi:type") or "")
        if "LearningProcedure" in dtype:
            if not any(local(c.tag) == "observations" for c in d):
                errors.append(f"{path.name}: LearningProcedure without observations")
            if not any(local(c.tag) == "actionSpace" for c in d):
                errors.append(f"{path.name}: LearningProcedure without actionSpace")
            if not any(local(c.tag) == "reward" for c in d):
                errors.append(f"{path.name}: LearningProcedure without reward")
            if not any(local(c.tag) == "algorithm" for c in d):
                errors.append(f"{path.name}: LearningProcedure without algorithm")
        if "ReactiveRuleProcedure" in dtype:
            if not any(local(c.tag) == "trigger" for c in d):
                errors.append(f"{path.name}: ReactiveRuleProcedure without trigger")
            if not any(local(c.tag) == "effect" for c in d):
                errors.append(f"{path.name}: ReactiveRuleProcedure without effect")

    for el in root.iter():
        xt = el.get("{http://www.w3.org/2001/XMLSchema-instance}type") or el.get("xsi:type") or ""
        # Exact type endswith :StepAction (avoid matching DiscreteStepActionSpace)
        if xt.endswith(":StepAction") or xt == "StepAction":
            try:
                if int(el.get("stepValue", "0")) == 0:
                    errors.append(f"{path.name}: StepAction stepValue must be non-zero")
            except ValueError:
                errors.append(f"{path.name}: StepAction stepValue not an int")

    return errors


def main() -> int:
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("paths", nargs="*", type=Path, help="Extra .elasticity files to validate")
    args = ap.parse_args()

    all_errors: list[str] = []
    print(f"Validating ecore: {ECORE}")
    all_errors.extend(validate_ecore(ECORE))

    instances = list(EXAMPLES.glob("*.elasticity")) + list(args.paths)
    for inst in instances:
        print(f"Validating instance: {inst}")
        all_errors.extend(validate_instance(inst))

    if all_errors:
        print("\nFAILED:")
        for e in all_errors:
            print(f"  - {e}")
        return 1
    print("\nOK: Elasticity.ecore and instances passed structural validation.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
