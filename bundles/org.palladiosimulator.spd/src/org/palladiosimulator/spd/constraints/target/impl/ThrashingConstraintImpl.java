/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.constraints.impl.TemporalConstraintImpl;
import org.palladiosimulator.spd.constraints.target.TargetPackage;
import org.palladiosimulator.spd.constraints.target.ThrashingConstraint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Thrashing
 * Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.constraints.target.impl.ThrashingConstraintImpl#getMinimumTimeNoThrashing
 * <em>Minimum Time No Thrashing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrashingConstraintImpl extends TemporalConstraintImpl implements ThrashingConstraint {
    /**
     * The default value of the '{@link #getMinimumTimeNoThrashing() <em>Minimum Time No
     * Thrashing</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMinimumTimeNoThrashing()
     * @generated
     * @ordered
     */
    protected static final double MINIMUM_TIME_NO_THRASHING_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ThrashingConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetPackage.Literals.THRASHING_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getMinimumTimeNoThrashing() {
        return (Double) this.eDynamicGet(TargetPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING,
                TargetPackage.Literals.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMinimumTimeNoThrashing(final double newMinimumTimeNoThrashing) {
        this.eDynamicSet(TargetPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING,
                TargetPackage.Literals.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING, newMinimumTimeNoThrashing);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TargetPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING:
            return this.getMinimumTimeNoThrashing();
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
        case TargetPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING:
            this.setMinimumTimeNoThrashing((Double) newValue);
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
        case TargetPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING:
            this.setMinimumTimeNoThrashing(MINIMUM_TIME_NO_THRASHING_EDEFAULT);
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
        case TargetPackage.THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING:
            return this.getMinimumTimeNoThrashing() != MINIMUM_TIME_NO_THRASHING_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ThrashingConstraintImpl
