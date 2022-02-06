/**
 */
package spd.scalingtrigger.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spd.palladio.PCMOperationSignature;

import spd.scalingtrigger.ResponseTimeTrigger;
import spd.scalingtrigger.ScalingtriggerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.impl.ResponseTimeTriggerImpl#getOperationSignature <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseTimeTriggerImpl extends TimeBasedTriggerImpl implements ResponseTimeTrigger {
	/**
	 * The cached value of the '{@link #getOperationSignature() <em>Operation Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMOperationSignature> operationSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseTimeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalingtriggerPackage.Literals.RESPONSE_TIME_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCMOperationSignature> getOperationSignature() {
		if (operationSignature == null) {
			operationSignature = new EObjectResolvingEList<PCMOperationSignature>(PCMOperationSignature.class, this, ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE);
		}
		return operationSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE:
				return getOperationSignature();
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
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE:
				getOperationSignature().clear();
				getOperationSignature().addAll((Collection<? extends PCMOperationSignature>)newValue);
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
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE:
				getOperationSignature().clear();
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
			case ScalingtriggerPackage.RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE:
				return operationSignature != null && !operationSignature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResponseTimeTriggerImpl
