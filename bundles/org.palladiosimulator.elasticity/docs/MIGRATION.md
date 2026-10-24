# Migrating SPD 1.0 → Elasticity 2.0

## Automated migrator

```bash
cd bundles/org.palladiosimulator.elasticity
python3 migration/migrate_spd_to_elasticity.py path/to/model.spd path/to/model.elasticity
python3 migration/validate_elasticity.py path/to/model.elasticity
```

Round-trip smoke test used in this branch:

```bash
python3 migration/migrate_spd_to_elasticity.py \
  examples/before-spd/InfrastructureSPD.xmi \
  /tmp/InfrastructureSPD.migrated.elasticity
python3 migration/validate_elasticity.py /tmp/InfrastructureSPD.migrated.elasticity
```

## Mapping table

| SPD 1.0 | Elasticity 2.0 |
|---------|----------------|
| `SPD` | `ElasticityViewpoint` |
| `SPD.targetGroups` | `scalableArchitecture.groups` |
| `SPD.scalingPolicies` | `policySet.policies` |
| `ElasticInfrastructure` | `ScalableGroup(INFRASTRUCTURE_POOL)` + `ResourceContainerTemplateBinding` |
| `ServiceGroup` | `ScalableGroup(HOMOGENEOUS_REPLICA)` + `AssemblyReplicaBinding` |
| `CompetingConsumersGroup` | `ScalableGroup(CONSUMER_POOL)` + `CompetingConsumerBinding` |
| `unit` / `unitAssembly` | `*Ref` string attributes on binding |
| `ScalingPolicy` | `ElasticityPolicy` + `ReactiveRuleProcedure` |
| `scalingTrigger` + `adjustmentType` | `decision.trigger` + `decision.effect` |
| `SimpleFireOnValue` | `ComparisonTrigger` |
| `SimpleFireOnTrend` | `TrendTrigger` |
| `CPUUtilization` etc. | `ObservationSpec.metric` enum |
| `StepAdjustment` | `StepAction` |
| `RelativeAdjustment` | `RelativeAction` |
| `AbsoluteAdjustment` | `AbsoluteAction` |
| `TargetGroupSizeConstraint` | same name under `groupConstraints` |
| `CooldownConstraint` / `IntervalConstraint` | same under `policyConstraints` |

## Not migrated automatically

| Artifact | Action |
|----------|--------|
| `semantic.ecore` configurations | Rebuild from groups + hints; keep live `elements` at runtime |
| Measuring points | Regenerate from `ObservationSpec` × `ScalableGroup` |
| ComposedTrigger trees | Partial — complex trees may need hand fix |
| Model-based / RL policies (Elasticity-Metamodel fork) | Hand-map to `LearningProcedure` (see FuzzyQLearning example) |
| GenModel / Java API clients | Regenerate against new packages; keep SPD plugins until cutover |

## Suggested migration phases

1. **Coexistence** — ship Elasticity bundle beside SPD; migrator for examples.
2. **Semantics** — retarget QVTo to bindings + cardinality (dispatch table).
3. **Simulator** — Slingshot interprets `DecisionProcedure` subtypes.
4. **Tooling** — editors / web palette: Reactive vs Learning.
5. **Deprecate SPD** — read-only import path via migrator.

## Compatibility with Palladio-Addons-Elasticity-Metamodel

That repo’s `TriggerBasedScalingPolicy` / `ModelBasedScalingPolicy` / `IScalable` are **conceptual predecessors**. Elasticity 2.0 in this repo should supersede them:

| Elasticity-Metamodel | This Elasticity 2.0 |
|----------------------|---------------------|
| `TriggerBasedScalingPolicy` | `ReactiveRuleProcedure` |
| `ModelBasedScalingPolicy` + `FuzzyQLearningModel` | `LearningProcedure` + `FuzzyQLearning` |
| `TargetGroup.scalableTarget → IScalable` | `ScalableGroup.binding` (+ optional runtime `IScalable` projection) |
