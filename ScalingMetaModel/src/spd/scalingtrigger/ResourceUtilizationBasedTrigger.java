/**
 */
package spd.scalingtrigger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Utilization Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.ResourceUtilizationBasedTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}</li>
 *   <li>{@link spd.scalingtrigger.ResourceUtilizationBasedTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getResourceUtilizationBasedTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ResourceUtilizationBasedTrigger extends ThresholdBasedTrigger {
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
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getResourceUtilizationBasedTrigger_ProcessingResourceAggregation()
	 * @model
	 * @generated
	 */
	AGGREGATIONMETHOD getProcessingResourceAggregation();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.ResourceUtilizationBasedTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}' attribute.
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
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getResourceUtilizationBasedTrigger_ResourceContainerAggregation()
	 * @model
	 * @generated
	 */
	AGGREGATIONMETHOD getResourceContainerAggregation();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.ResourceUtilizationBasedTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container Aggregation</em>' attribute.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see #getResourceContainerAggregation()
	 * @generated
	 */
	void setResourceContainerAggregation(AGGREGATIONMETHOD value);

} // ResourceUtilizationBasedTrigger
