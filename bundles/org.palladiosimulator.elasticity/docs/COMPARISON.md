# Before (SPD 1.0) vs After (Elasticity 2.0)

## 1. Reactive infrastructure policy

### Before — SPD

```xml
<spd:SPD ... entityName="InfrastructureSPD">
  <targetGroups xsi:type="targets:ElasticInfrastructure"
      id="_tg_infra" entityName="AppASG"
      unit="default.resourceenvironment#_rc_app"/>
  <scalingPolicies id="scaleOut" targetGroup="//@targetGroups.0" active="true">
    <adjustmentType xsi:type="adjustments:StepAdjustment" stepValue="1"/>
    <scalingTrigger xsi:type="triggers:SimpleFireOnValue" relationalOperator="GreaterThan">
      <stimulus xsi:type="stimuli:CPUUtilization" aggregationOverElements="MAX"/>
      <expectedValue xsi:type="expectations:ExpectedPercentage" value="80.0"/>
    </scalingTrigger>
  </scalingPolicies>
  <!-- scaleIn similarly with stepValue="-1" and threshold 30% -->
</spd:SPD>
```

**What is coupled:** target *kind* = `ElasticInfrastructure` EClass; sensor = `CPUUtilization` EClass; control law = mandatory trigger+adjustment on the same `ScalingPolicy`.

### After — Elasticity

```xml
<elasticity:ElasticityViewpoint ... entityName="InfrastructureSPD">
  <scalableArchitecture>
    <groups id="_tg_infra" entityName="AppASG" cardinalitySemantics="INFRASTRUCTURE_POOL">
      <binding xsi:type="scalable:ResourceContainerTemplateBinding"
          unitResourceContainerRef="default.resourceenvironment#_rc_app"/>
    </groups>
  </scalableArchitecture>
  <policySet>
    <policies id="scaleOut" target="//@scalableArchitecture/@groups.0">
      <decision xsi:type="policies:ReactiveRuleProcedure">
        <trigger xsi:type="reactive:ComparisonTrigger" relationalOperator="GreaterThan">
          <observation metric="CPU_UTILIZATION" aggregation="MAX"/>
          <expected xsi:type="reactive:ExpectedPercentage" value="80.0"/>
        </trigger>
        <effect xsi:type="actions:StepAction" stepValue="1"/>
      </decision>
    </policies>
  </policySet>
</elasticity:ElasticityViewpoint>
```

**What changed**

| SPD concept | Elasticity concept |
|-------------|--------------------|
| `SPD` | `ElasticityViewpoint` (+ split plant/controller) |
| `ElasticInfrastructure` | `ScalableGroup` + `INFRASTRUCTURE_POOL` + `ResourceContainerTemplateBinding` |
| `ScalingPolicy` | `ElasticityPolicy` + `ReactiveRuleProcedure` |
| `CPUUtilization` | `ObservationSpec(metric=CPU_UTILIZATION)` |
| `StepAdjustment` | `StepAction` |

---

## 2. Learning policy (SPD could not express this cleanly)

In `Palladio-Addons-Elasticity-Metamodel`, learning was bolted on as:

```text
ModelBasedScalingPolicy
  └── model: FuzzyQLearningModel
        ├── workloadStimulus, responseTimeSpecification, …
        └── adjustment: EInt   // awkward vs AdjustmentType
```

### After — Elasticity first-class `LearningProcedure`

```xml
<policies id="fuzzy_q" target="//@scalableArchitecture/@groups.0">
  <decision xsi:type="policies:LearningProcedure" interval="30.0">
    <observations metric="OPERATION_RESPONSE_TIME" .../>
    <observations metric="NUMBER_OF_ELEMENTS" .../>
    <actionSpace xsi:type="actions:DiscreteStepActionSpace" minDelta="-2" maxDelta="2"/>
    <reward xsi:type="learning:ResponseTimeTargetReward" targetResponseTime="0.5" .../>
    <hyperParameters learningRate="0.7" discountFactor="0.5" epsilon="0.01"/>
    <algorithm xsi:type="learning:FuzzyQLearning"/>
  </decision>
</policies>
```

Reactive and learning share the same `ElasticityPolicy` / `ScalableGroup` / constraints pipeline.

---

## 3. Service group + load balancer

### Before

```xml
<targetGroups xsi:type="targets:ServiceGroup" unitAssembly="...#_assembly"/>
```

LB wiring lived only in the **semantic** model (`ServiceGroupCfg.loadBalancingAssembly`).

### After

```xml
<groups cardinalitySemantics="HOMOGENEOUS_REPLICA">
  <binding xsi:type="scalable:AssemblyReplicaBinding" unitAssemblyRef="...#_assembly"/>
  <enactmentHints xsi:type="scalable:LoadBalancerHint"
      loadBalancingAssemblyRef="...#_assembly_lb"/>
</groups>
```

Design-time model can carry enactment hints; semantic runtime still tracks live `elements[*]`.
