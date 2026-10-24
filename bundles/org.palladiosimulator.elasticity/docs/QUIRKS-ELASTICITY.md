# SimOxide / Slingshot SPD quirks vs Elasticity 2.0

This note maps SimOxide’s documented Slingshot SPD quirks (Q1–Q16) onto the Elasticity 2.0 metamodel (`model/Elasticity.ecore`) and records what still needs language rules vs runtime work.

**Sources (read-only):**

- `simoxide/docs/spec/slingshot/quirks.md` — SPD quirks Q1–Q16
- `simoxide/DESIGN-SPD.md` §1 — SPD semantics and quirk rationale
- `simoxide/docs/spec/slingshot/spd.md` — rules `SS-SPD-*`
- Upstream Slingshot SPD interpreter + QVTo under Palladio-Analyzer-Slingshot / SPD-Metamodel transformations

**Layers:**

| Layer | What it is | Can Elasticity 2.0 fix it alone? |
|-------|------------|----------------------------------|
| **L-MM** | Metamodel / OCL / docs | Yes, by clarifying or restructuring concepts |
| **L-TR** | QVTo adjustment transformations | No — retarget / patch transformations |
| **L-SIM** | Slingshot / SimOxide SPD interpreter | No — new decision pipeline |

Elasticity 2.0 is **abstract syntax + migration target**. Quirks marked *runtime* remain until SimOxide/Slingshot are updated; quirks marked *specify now* should get OCL/profile text in this bundle before claiming semantic parity.

---

## Status legend

| Status | Meaning |
|--------|---------|
| **cleared (MM)** | Language no longer encodes the bad assumption |
| **improved (MM)** | Structure helps; runtime must still implement intent |
| **carried** | Same concept / ambiguity as SPD 1.0 |
| **runtime** | Pure interpreter or QVTo; metamodel irrelevant until port |
| **new gap** | Introduced or enlarged by Elasticity 2.0 |

---

## Q1–Q16 matrix

| # | Quirk (SimOxide short name) | Layer | Status in Elasticity 2.0 | Notes |
|---|----------------------------|-------|--------------------------|-------|
| Q1 | `doOnDisregard` does not restore adjustor state | L-SIM | **runtime** | Still relevant for cooldown / thrashing state on `ElasticityPolicy`. Fix in interpreter (`Quirks::q1_*`). |
| Q2 | Constraint state commits on request even if QVTo fails | L-SIM | **runtime** | More dangerous with `LearningProcedure` (spurious updates). Spec: commit only after successful enact. |
| Q3 | `AVERAGE` is EMA(60s, 10s, α=0.2); others last 10 samples | L-SIM (+ underspecified MM) | **carried** | Same `AggregationMethod` enum; no window/EMA parameters. **Specify now:** aggregation is runtime-defined *or* add `AggregationSpec`. |
| Q4 | Relative 0% can become non-zero via `minAdjustmentValue` | L-TR (+ MM) | **carried** | `RelativeAction` keeps both attributes. **Specify now:** OCL/docs — desired Δ = 0 ⇒ enacted Δ = 0. |
| Q5 | Scale-in aborts one job, loses others | L-SIM | **runtime** | Drain semantics (SimOxide “defined”); orthogonal to language. |
| Q6 | After adjust, every link connects every container | L-TR | **runtime** | Unchanged until `ResourceEnvironmentTransformation` uses bindings/hints. |
| Q7 | Top-down scale-in removes emptied containers one enactment late | L-TR | **runtime** | Same for `INFRASTRUCTURE_POOL` groups. |
| Q8 | Placement `->any(true)` / Java-hash Set order | L-TR | **runtime** | Determinism; QVTo ordered mode. |
| Q9 | Only thrashing in filter chain; size only clamps in QVTo | L-SIM (+ MM silence) | **carried** / **improved (MM)** | Split `GroupConstraint` vs `PolicyConstraint` is clearer. **Specify now:** all group constraints filter *before* commit (SimOxide proposed fix). |
| Q10 | Static fields in `TargetGroupUtils` | L-SIM | **runtime** | N/A in SimOxide; ignore for Elasticity. |
| Q11 | Unsupported stimuli → NPE at setup | L-SIM (+ closed MM catalog) | **improved (MM)** | `ObservationSpec` + `MetricKind` / `CUSTOM`. Interpreter must fail closed on unknown kinds (config error, not NPE). |
| Q12 | Composed AND/OR/XOR triggers broken | L-SIM (+ MM allows composition) | **carried** | `ComposedTrigger` retained. **Specify now:** normative child evaluation; XOR = exactly one true. |
| Q13 | Instantaneous samples merged; aggregate on wrong events | L-SIM (+ MM) | **carried** | Needs per-element windows × `aggregation`. Tie to Q3 spec. |
| Q14 | Deleted elements not reported; CCG population ineffective | L-SIM / apply | **runtime** | Still required for assembly/consumer bindings. |
| Q15 | Policies react to each other’s `SimulationTimeReached` | L-SIM | **runtime** | Also hits `ScheduledProcedure` / learning ticks. Spec: event owns one policy id. |
| Q16 | Container order follows identity hashes | L-TR | **runtime** | Insertion order under det/ordered QVTo. |

---

## Metamodel topics outside the Q-numbers

| Topic | SPD 1.0 | Elasticity 2.0 | Status |
|-------|---------|----------------|--------|
| Antinomical XOR (EI ⊕ service/CCG) | Hard OCL `antinomicalTargets` | Not in Elasticity OCL; groups are uniform | **cleared (MM)** as a hard ban; mixed plants are **undefined** until QVTo composition exists → use profile `SinglePatternOnly` until then |
| Monolithic `ScalingPolicy` (always trigger+adjustment) | Blocks RL | `DecisionProcedure` subtypes | **cleared (MM)** for expressiveness; dispatch must be closed on unknown subtypes (Q11-style) |
| Stimulus EClass explosion | Closed hierarchy | `ObservationSpec` | **improved (MM)** |
| Target subclasses mix pattern + PCM type + wiring | EI / Service / CCG | Binding + `cardinalitySemantics` + `EnactmentHint` | **improved (MM)**; QVTo must key off these, not old EClass names |
| IntervalConstraint meaning | “Inactive window” in filter (easy to misread) | Same attrs + `ScheduledProcedure` | **carried** — **specify now:** blackout vs active vs schedule |
| Trend triggers | Stub comparator | `TrendTrigger` under-parameterised | **carried** — require / document `ObservationSpec.windowLength` |
| Relative / absolute / step OCL | SPD.ocl: non-zero step, same-sign relative, goal > 0 | Only `nonZeroStep` + ordered action space today | **carried** / slight **regression** — port remaining invariants |
| Name / uniqueness validators | Ecore stubs `if (false)` | Named constraints, no Java yet | **carried** (validation gap) |

---

## New gaps (not in SPD Q1–Q16)

| Gap | Why it matters | Mitigation |
|-----|----------------|------------|
| **LearningProcedure** × Q2/Q9 | Reward / Q-update must not run on disregarded or failed enact | Spec section `SS-EL-LEARN-*`: observe → decide → filter → enact → update |
| **ActionSpace** vs size constraints | Discrete Δ may be infeasible | Filter/clamp rule shared with reactive `ActionSpec` |
| **Mixed bindings** in one viewpoint | Language allows; stock QVTo is antinomical | Profile `SinglePatternOnly` (default for migration) vs `AllowMixedTargets` |
| **String `*Ref` bindings** | No EMF type check on PCM elements | Optional PCM-typed overlay; migrator validates refs when ResourceSet available |
| **DecisionProcedure** extensibility | Old interpreter only knows reactive | Unknown subtype = configuration error at setup |

---

## Profiles (recommended)

Declare as documentation now; encode as OCL/Ecore profiles when tooling lands:

| Profile | Intent |
|---------|--------|
| `ReactiveOnly` | Only `ReactiveRuleProcedure`; SPD-parity migration |
| `SinglePatternOnly` | All groups share one `CardinalityKind` / binding family (temporary stand-in for antinomical XOR) |
| `AllowMixedTargets` | Mixed infra + service groups; requires multi-pattern enactment |
| `Learning` | Allows `LearningProcedure`; requires learn-cycle rules |

---

## Specify-now checklist (metamodel docs / OCL)

Do these in this bundle without waiting for a full SimOxide port:

1. **Aggregation** — document EMA vs window mean, or add `AggregationSpec`.
2. **RelativeAction** — zero desired change stays zero (Q4 intent).
3. **ComposedTrigger / TrendTrigger** — evaluation rules + required windows.
4. **IntervalConstraint vs ScheduledProcedure** — disjoint meanings.
5. **Constraint filter order** — group constraints before policy state commit (Q9 intent).
6. **Port SPD.ocl** — relative same-sign, absolute goal > 0, ≤1 size constraint (already sketched).
7. **Learning cycle** — short normative paragraph in this file or `REDESIGN.md`.
8. **Default profile** — migrations emit `SinglePatternOnly` + `ReactiveOnly` unless stated.

---

## Runtime port checklist (SimOxide / Slingshot)

When implementing Elasticity:

| Phase | Work | Clears |
|-------|------|--------|
| Interpreter dispatch on `DecisionProcedure` | Reactive first | — |
| Observation registry by `MetricKind` | Fail closed | Q11 (fixed intent) |
| Composed / trend evaluators | Match SS-SPD-2.6 intent | Q12 |
| Constraint chain: size + thrashing + cooldown | Commit on success only | Q9, Q2 |
| Per-policy time / schedule events | | Q15 |
| QVTo keyed by binding + cardinality + hints | Patched spd-fixed lineage | Q4, Q6, Q7 |
| Ordered QVTo / insertion order | | Q8, Q16 |
| Drain on scale-in | | Q5 |
| Report deletions / drop monitors | | Q14 |
| Learning update after successful enact | | new gap |

---

## Summary

| | Count (approx.) |
|--|-----------------|
| Cleared or improved by Elasticity MM alone | Antinomical hard-ban, stimulus catalog, policy shape, target factoring |
| Carried semantic debt (specify in MM) | Q3/Q4/Q9/Q12/Q13-related underspec, interval/trend, OCL gaps |
| Pure runtime (unchanged by MM) | Q1, Q2, Q5–Q8, Q10, Q14–Q16 |
| New Elasticity obligations | Learning cycle, action spaces, mixed plants, ref typing |

**Bottom line:** Elasticity 2.0 does **not** retire the SimOxide quirk list. It removes a few language traps and makes the right runtime fixes *expressible*. Treat this document as the Elasticity column next to `quirks.md` until those fixes land.
