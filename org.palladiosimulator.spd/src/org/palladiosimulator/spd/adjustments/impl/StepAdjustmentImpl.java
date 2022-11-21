/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.StepAdjustment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.adjustments.impl.StepAdjustmentImpl#getStepValue <em>Step Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepAdjustmentImpl extends AdjustmentTypeImpl implements StepAdjustment {
	/**
	 * The default value of the '{@link #getStepValue() <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepValue()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_VALUE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdjustmentsPackage.Literals.STEP_ADJUSTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStepValue() {
		return (Integer) eDynamicGet(AdjustmentsPackage.STEP_ADJUSTMENT__STEP_VALUE,
				AdjustmentsPackage.Literals.STEP_ADJUSTMENT__STEP_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepValue(int newStepValue) {
		eDynamicSet(AdjustmentsPackage.STEP_ADJUSTMENT__STEP_VALUE,
				AdjustmentsPackage.Literals.STEP_ADJUSTMENT__STEP_VALUE, newStepValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AdjustmentsPackage.STEP_ADJUSTMENT__STEP_VALUE:
			return getStepValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AdjustmentsPackage.STEP_ADJUSTMENT__STEP_VALUE:
			setStepValue((Integer) newValue);
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
		case AdjustmentsPackage.STEP_ADJUSTMENT__STEP_VALUE:
			setStepValue(STEP_VALUE_EDEFAULT);
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
		case AdjustmentsPackage.STEP_ADJUSTMENT__STEP_VALUE:
			return getStepValue() != STEP_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //StepAdjustmentImpl
