/**
 */
package spd.scalingtrigger;

import org.eclipse.emf.common.util.EList;

import spd.palladio.PCMLinkingResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NetworkUtilizationTrigger is a specialized ResourceUtilizationBasedTrigger that bases the trigger on the utilization of the network link as specified by the linkingResource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.NetworkUtilizationTrigger#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link spd.scalingtrigger.NetworkUtilizationTrigger#getLinkingResource <em>Linking Resource</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getNetworkUtilizationTrigger()
 * @model
 * @generated
 */
public interface NetworkUtilizationTrigger extends ResourceUtilizationBasedTrigger {
	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.NETWORKUSAGETYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of network usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see spd.scalingtrigger.NETWORKUSAGETYPE
	 * @see #setUsageType(NETWORKUSAGETYPE)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getNetworkUtilizationTrigger_UsageType()
	 * @model
	 * @generated
	 */
	NETWORKUSAGETYPE getUsageType();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.NetworkUtilizationTrigger#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see spd.scalingtrigger.NETWORKUSAGETYPE
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(NETWORKUSAGETYPE value);

	/**
	 * Returns the value of the '<em><b>Linking Resource</b></em>' reference list.
	 * The list contents are of type {@link spd.palladio.PCMLinkingResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific linking resource for which the utilization is used to trigger an adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linking Resource</em>' reference list.
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getNetworkUtilizationTrigger_LinkingResource()
	 * @model
	 * @generated
	 */
	EList<PCMLinkingResource> getLinkingResource();

} // NetworkUtilizationTrigger
