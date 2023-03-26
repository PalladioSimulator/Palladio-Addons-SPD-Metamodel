/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.constraints.impl.TemporalConstraintImpl;
import org.palladiosimulator.spd.constraints.policy.IntervallConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervall Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.constraints.policy.impl.IntervallConstraintImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.constraints.policy.impl.IntervallConstraintImpl#getIntervallDuration <em>Intervall Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervallConstraintImpl extends TemporalConstraintImpl implements IntervallConstraint {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getIntervallDuration() <em>Intervall Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervallDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVALL_DURATION_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervallConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyPackage.Literals.INTERVALL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOffset() {
		return (Integer) eDynamicGet(PolicyPackage.INTERVALL_CONSTRAINT__OFFSET,
				PolicyPackage.Literals.INTERVALL_CONSTRAINT__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(int newOffset) {
		eDynamicSet(PolicyPackage.INTERVALL_CONSTRAINT__OFFSET, PolicyPackage.Literals.INTERVALL_CONSTRAINT__OFFSET,
				newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIntervallDuration() {
		return (Integer) eDynamicGet(PolicyPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION,
				PolicyPackage.Literals.INTERVALL_CONSTRAINT__INTERVALL_DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervallDuration(int newIntervallDuration) {
		eDynamicSet(PolicyPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION,
				PolicyPackage.Literals.INTERVALL_CONSTRAINT__INTERVALL_DURATION, newIntervallDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolicyPackage.INTERVALL_CONSTRAINT__OFFSET:
			return getOffset();
		case PolicyPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION:
			return getIntervallDuration();
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
		case PolicyPackage.INTERVALL_CONSTRAINT__OFFSET:
			setOffset((Integer) newValue);
			return;
		case PolicyPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION:
			setIntervallDuration((Integer) newValue);
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
		case PolicyPackage.INTERVALL_CONSTRAINT__OFFSET:
			setOffset(OFFSET_EDEFAULT);
			return;
		case PolicyPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION:
			setIntervallDuration(INTERVALL_DURATION_EDEFAULT);
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
		case PolicyPackage.INTERVALL_CONSTRAINT__OFFSET:
			return getOffset() != OFFSET_EDEFAULT;
		case PolicyPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION:
			return getIntervallDuration() != INTERVALL_DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //IntervallConstraintImpl
