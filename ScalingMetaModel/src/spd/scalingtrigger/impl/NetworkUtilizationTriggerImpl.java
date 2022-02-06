/**
 */
package spd.scalingtrigger.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spd.palladio.PCMLinkingResource;

import spd.scalingtrigger.NETWORKUSAGETYPE;
import spd.scalingtrigger.NetworkUtilizationTrigger;
import spd.scalingtrigger.ScalingtriggerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Utilization Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.impl.NetworkUtilizationTriggerImpl#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link spd.scalingtrigger.impl.NetworkUtilizationTriggerImpl#getLinkingResource <em>Linking Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkUtilizationTriggerImpl extends ResourceUtilizationBasedTriggerImpl implements NetworkUtilizationTrigger {
	/**
	 * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected static final NETWORKUSAGETYPE USAGE_TYPE_EDEFAULT = NETWORKUSAGETYPE.SEND;

	/**
	 * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected NETWORKUSAGETYPE usageType = USAGE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkingResource() <em>Linking Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkingResource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMLinkingResource> linkingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkUtilizationTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalingtriggerPackage.Literals.NETWORK_UTILIZATION_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NETWORKUSAGETYPE getUsageType() {
		return usageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageType(NETWORKUSAGETYPE newUsageType) {
		NETWORKUSAGETYPE oldUsageType = usageType;
		usageType = newUsageType == null ? USAGE_TYPE_EDEFAULT : newUsageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE, oldUsageType, usageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCMLinkingResource> getLinkingResource() {
		if (linkingResource == null) {
			linkingResource = new EObjectResolvingEList<PCMLinkingResource>(PCMLinkingResource.class, this, ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE);
		}
		return linkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE:
				return getUsageType();
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE:
				return getLinkingResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE:
				setUsageType((NETWORKUSAGETYPE)newValue);
				return;
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE:
				getLinkingResource().clear();
				getLinkingResource().addAll((Collection<? extends PCMLinkingResource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE:
				setUsageType(USAGE_TYPE_EDEFAULT);
				return;
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE:
				getLinkingResource().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE:
				return usageType != USAGE_TYPE_EDEFAULT;
			case ScalingtriggerPackage.NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE:
				return linkingResource != null && !linkingResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (usageType: ");
		result.append(usageType);
		result.append(')');
		return result.toString();
	}

} //NetworkUtilizationTriggerImpl
