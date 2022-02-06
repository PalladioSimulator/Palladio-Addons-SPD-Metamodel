/**
 */
package spd.scalingtrigger;

import org.eclipse.emf.common.util.EList;

import spd.palladio.PCMResourceContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Count Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}</li>
 *   <li>{@link spd.scalingtrigger.TaskCountTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger()
 * @model
 * @generated
 */
public interface TaskCountTrigger extends ThresholdBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' reference list.
	 * The list contents are of type {@link spd.palladio.PCMResourceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of resource containers for which task count is used. If left empty, all resource containers as referenced by the TargetGroup are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Container</em>' reference list.
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_ResourceContainer()
	 * @model
	 * @generated
	 */
	EList<PCMResourceContainer> getResourceContainer();

	/**
	 * Returns the value of the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.AGGREGATIONMETHOD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregation for monitors inside a single resource container. Since a resource container may consists of multiple resources of same type (e.g., several CPUs) then the specified aggregation method determines how multiple monitors should be aggregated within a single resource container.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processing Resource Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #setProcessingResourceAggregation(AGGREGATIONMETHOD)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_ProcessingResourceAggregation()
	 * @model
	 * @generated
	 */
	AGGREGATIONMETHOD getProcessingResourceAggregation();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.TaskCountTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Resource Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #getProcessingResourceAggregation()
	 * @generated
	 */
	void setProcessingResourceAggregation(AGGREGATIONMETHOD value);

	/**
	 * Returns the value of the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.AGGREGATIONMETHOD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregation accross different resource containers in the Target Group. For example if two containers C1 and C2 have a resource utilizaiton of 0.6, respectively 0.8, then choosing AVERAGE as an aggreagtion method then it determines that the value of 0.7 should be compared against the threshold value. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Container Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #setResourceContainerAggregation(AGGREGATIONMETHOD)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getTaskCountTrigger_ResourceContainerAggregation()
	 * @model
	 * @generated
	 */
	AGGREGATIONMETHOD getResourceContainerAggregation();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.TaskCountTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #getResourceContainerAggregation()
	 * @generated
	 */
	void setResourceContainerAggregation(AGGREGATIONMETHOD value);

} // TaskCountTrigger
