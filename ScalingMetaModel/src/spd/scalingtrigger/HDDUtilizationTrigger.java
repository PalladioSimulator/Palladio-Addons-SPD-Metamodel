/**
 */
package spd.scalingtrigger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HDD Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A utilization based trigger based on the HDD resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.HDDUtilizationTrigger#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getHDDUtilizationTrigger()
 * @model
 * @generated
 */
public interface HDDUtilizationTrigger extends ProcessingResourceUtilizationBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.HDDUSAGETYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see spd.scalingtrigger.HDDUSAGETYPE
	 * @see #setUsageType(HDDUSAGETYPE)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getHDDUtilizationTrigger_UsageType()
	 * @model
	 * @generated
	 */
	HDDUSAGETYPE getUsageType();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.HDDUtilizationTrigger#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see spd.scalingtrigger.HDDUSAGETYPE
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(HDDUSAGETYPE value);

} // HDDUtilizationTrigger
