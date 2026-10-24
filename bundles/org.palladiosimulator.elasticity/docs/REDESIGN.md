# Elasticity 2.0 — Metamodel redesign

Branch: `feature/elasticity-metamodel-v2`  
Bundle: `org.palladiosimulator.elasticity`  
NS URI: `http://palladiosimulator.org/Elasticity/2.0`

This is the **successor design** to SPD 1.0 (`org.palladiosimulator.spd`). SPD remains unchanged on this branch; Elasticity 2.0 is additive so tooling can migrate gradually.

## Motivation (short)

SPD encodes reactive threshold policies well, but:

1. `ScalingPolicy` always requires trigger + adjustment (blocks RL / model-based policies).
2. `TargetGroup` subclasses hardcode PCM pattern + type + enactment wiring.
3. Stimulus catalog is a closed inheritance tree.
4. The sibling `Palladio-Addons-Elasticity-Metamodel` already forked SPD for Fuzzy Q-Learning / SARSA — this metamodel **unifies** that direction.

## Conceptual model

```
ElasticityViewpoint
├── ScalableArchitecture          # plant
│     └── ScalableGroup*
│           ├── cardinalitySemantics
│           ├── binding (ArchitecturalBinding)
│           ├── enactmentHints*
│           └── groupConstraints*
└── ElasticityPolicySet           # controllers
      └── ElasticityPolicy*
            ├── target → ScalableGroup
            ├── decision → DecisionProcedure
            │     ├── ReactiveRuleProcedure (SPD-compatible)
            │     ├── LearningProcedure (RL)
            │     ├── ScheduledProcedure
            │     └── CompositeProcedure
            └── policyConstraints*
```

Shared control cycle: **observe → decide → filter(constraints) → enact → (learn)**.

## Package map

| Package | Role |
|---------|------|
| `core` | `NamedEntity` (PCM Entity–shaped id/name) |
| `scalable` | Groups, bindings, enactment hints |
| `policies` | Policy set, policies, decision procedures |
| `reactive` | Triggers / expectations (SPD SimpleFire*) |
| `observations` | MetricKind + ObservationSpec (replaces Stimulus hierarchy) |
| `actions` | ActionSpec + ActionSpace (replaces AdjustmentType) |
| `learning` | Reward, hyper-parameters, algorithms |
| `constraints` | Policy + group constraints |

## Before / after examples

| Concern | SPD 1.0 | Elasticity 2.0 |
|---------|---------|----------------|
| Reactive infra ASG | `examples/before-spd/InfrastructureSPD.xmi` | `examples/after-elasticity/InfrastructureReactive.elasticity` |
| Fuzzy Q-Learning | *(not expressible cleanly in SPD)* | `examples/after-elasticity/FuzzyQLearning.elasticity` |

See [COMPARISON.md](COMPARISON.md) for a side-by-side walkthrough.

## Migration

```bash
python3 migration/migrate_spd_to_elasticity.py \
  examples/before-spd/InfrastructureSPD.xmi \
  /tmp/migrated.elasticity

python3 migration/validate_elasticity.py /tmp/migrated.elasticity
```

Mapping rules are documented in [MIGRATION.md](MIGRATION.md).

## Validation

```bash
python3 migration/validate_elasticity.py
```

Checks Ecore structure + OCL-inspired instance rules without requiring Eclipse.

## Status / non-goals of this branch

**In scope:** abstract syntax, OCL sketch, examples, migrator, validation script, design docs.  
**Out of scope (follow-ups):** GenModel/Java codegen, QVTo semantics rewrite, Slingshot interpreter, measuring-point regen, web-editor palette.
