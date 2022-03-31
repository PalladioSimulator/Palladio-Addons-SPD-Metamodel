/**
 */
package spd.scalingtrigger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ScalingTrigger encapsulates both what is observed on the modeled system (the monitoring) as well as how such observation lead to a trigger (the analysis part). 
 * For example, a CPUThresholdBasedTrigger (a possible implementation of this class) defines both how CPU is going to be monitored from the TargetGroup as well as that it is a simple threshold based trigger.
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getScalingTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ScalingTrigger extends spd.ScalingTrigger {
} // ScalingTrigger
