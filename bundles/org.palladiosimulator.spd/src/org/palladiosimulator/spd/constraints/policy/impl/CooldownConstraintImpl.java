/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.constraints.impl.TemporalConstraintImpl;
import org.palladiosimulator.spd.constraints.policy.CooldownConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cooldown
 * Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.constraints.policy.impl.CooldownConstraintImpl#getCooldownTime
 * <em>Cooldown Time</em>}</li>
 * <li>{@link org.palladiosimulator.spd.constraints.policy.impl.CooldownConstraintImpl#getMaxScalingOperations
 * <em>Max Scaling Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CooldownConstraintImpl extends TemporalConstraintImpl implements CooldownConstraint {
    /**
     * The default value of the '{@link #getCooldownTime() <em>Cooldown Time</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCooldownTime()
     * @generated
     * @ordered
     */
    protected static final double COOLDOWN_TIME_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getMaxScalingOperations() <em>Max Scaling Operations</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMaxScalingOperations()
     * @generated
     * @ordered
     */
    protected static final int MAX_SCALING_OPERATIONS_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CooldownConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PolicyPackage.Literals.COOLDOWN_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getCooldownTime() {
        return (Double) this.eDynamicGet(PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME,
                PolicyPackage.Literals.COOLDOWN_CONSTRAINT__COOLDOWN_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCooldownTime(final double newCooldownTime) {
        this.eDynamicSet(PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME,
                PolicyPackage.Literals.COOLDOWN_CONSTRAINT__COOLDOWN_TIME, newCooldownTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getMaxScalingOperations() {
        return (Integer) this.eDynamicGet(PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS,
                PolicyPackage.Literals.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMaxScalingOperations(final int newMaxScalingOperations) {
        this.eDynamicSet(PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS,
                PolicyPackage.Literals.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS, newMaxScalingOperations);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
            return this.getCooldownTime();
        case PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
            return this.getMaxScalingOperations();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
            this.setCooldownTime((Double) newValue);
            return;
        case PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
            this.setMaxScalingOperations((Integer) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
            this.setCooldownTime(COOLDOWN_TIME_EDEFAULT);
            return;
        case PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
            this.setMaxScalingOperations(MAX_SCALING_OPERATIONS_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case PolicyPackage.COOLDOWN_CONSTRAINT__COOLDOWN_TIME:
            return this.getCooldownTime() != COOLDOWN_TIME_EDEFAULT;
        case PolicyPackage.COOLDOWN_CONSTRAINT__MAX_SCALING_OPERATIONS:
            return this.getMaxScalingOperations() != MAX_SCALING_OPERATIONS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // CooldownConstraintImpl
