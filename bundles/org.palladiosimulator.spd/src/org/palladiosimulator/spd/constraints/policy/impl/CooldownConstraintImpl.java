/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.constraints.impl.TemporalConstraintImpl;
import org.palladiosimulator.spd.constraints.policy.CooldownConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cooldown Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.constraints.policy.impl.CooldownConstraintImpl#getCooldownTime <em>Cooldown Time</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.constraints.policy.impl.CooldownConstraintImpl#getMaxScalingOperations <em>Max Scaling Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CooldownConstraintImpl extends TemporalConstraintImpl implements CooldownConstraint {
	/**
	 * The default value of the '{@link #getCooldownTime() <em>Cooldown Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldownTime()
	 * @generated
	 * @ordered
	 */
	protected static final double COOLDOWN_TIME_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxScalingOperations() <em>Max Scaling Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScalingOperations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SCALING_OPERATIONS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CooldownConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyPackage.Literals.COOLDOWN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCooldownTime() {
		return (Double) eDynamicGet(PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME,
				PolicyPackage.Literals.COOLDOWN_CONSTRAINT__COOLDOWN_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCooldownTime(double newCooldownTime) {
		eDynamicSet(PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME,
				PolicyPackage.Literals.COOLDOWN_CONSTRAINT__COOLDOWN_TIME, newCooldownTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxScalingOperations() {
		return (Integer) eDynamicGet(PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS,
				PolicyPackage.Literals.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxScalingOperations(int newMaxScalingOperations) {
		eDynamicSet(PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS,
				PolicyPackage.Literals.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS, newMaxScalingOperations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
			return getCooldownTime();
		case PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
			return getMaxScalingOperations();
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
		case PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
			setCooldownTime((Double) newValue);
			return;
		case PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
			setMaxScalingOperations((Integer) newValue);
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
		case PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
			setCooldownTime(COOLDOWN_TIME_EDEFAULT);
			return;
		case PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
			setMaxScalingOperations(MAX_SCALING_OPERATIONS_EDEFAULT);
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
		case PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
			return getCooldownTime() != COOLDOWN_TIME_EDEFAULT;
		case PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
			return getMaxScalingOperations() != MAX_SCALING_OPERATIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CooldownConstraintImpl
