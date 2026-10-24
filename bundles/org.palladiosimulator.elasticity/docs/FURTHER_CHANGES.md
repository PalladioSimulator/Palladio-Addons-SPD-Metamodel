# Further potential changes (beyond this branch)

## Metamodel

1. **PCM-typed binding overlay** — optional fragment that replaces string `*Ref` with typed EReferences to `ResourceContainer` / `AssemblyContext` (like SPD today), activated when PCM is on the classpath.
2. **Metric registry** — EPackage of reusable `MetricDefinition` instances instead of only an enum + `CUSTOM`.
3. **Expression language** for rewards/triggers (or reuse StoEx) for multi-objective rewards without new EClasses.
4. **Profiles** — Ecore/OCL profiles: `ReactiveOnly`, `Learning`, `AllowMixedTargets` (retire antinomical XOR as a hard invariant).
5. **Knowledge resources** — external URI for Q-tables / fuzzy rule bases (do not embed matrices in XMI).
6. **Vertical / migration actions** — `VerticalScaleAction`, `MigrateAllocationAction` once enactment supports them.

## Semantics & simulation

1. Unify QVTo on `cardinalitySemantics + binding + hints` (delete per-EClass target switches).
2. Single MAPE cycle in Slingshot for all `DecisionProcedure` subtypes.
3. Semantic model = runtime projection of `ScalableGroup` (merge with `IScalable` / `scalablepcmgroups`).
4. Constraint filter shared by reactive and learning before enact.

## Tooling

1. GenModel + Java API generation for Elasticity 2.0.
2. Eclipse tree editor / diagram notation update (view type visual language).
3. Web editor: palette modes Reactive vs Learning; keep policy→group connector.
4. Measuring-point generator from observations.

## Process

1. ADF / architecture decision records for nsURI versioning (`…/2.0`).
2. Contract tests: migrate all `spd-instances/**` and validate.
3. Deprecation timeline for SPD 1.0 plugins.
