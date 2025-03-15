/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.adjustments.AbsoluteAdjustment;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Absolute
 * Adjustment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.adjustments.impl.AbsoluteAdjustmentImpl#getGoalValue
 * <em>Goal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbsoluteAdjustmentImpl extends AdjustmentTypeImpl implements AbsoluteAdjustment {
    /**
     * The default value of the '{@link #getGoalValue() <em>Goal Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getGoalValue()
     * @generated
     * @ordered
     */
    protected static final int GOAL_VALUE_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AbsoluteAdjustmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AdjustmentsPackage.Literals.ABSOLUTE_ADJUSTMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getGoalValue() {
        return (Integer) this.eDynamicGet(AdjustmentsPackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE,
                AdjustmentsPackage.Literals.ABSOLUTE_ADJUSTMENT__GOAL_VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setGoalValue(final int newGoalValue) {
        this.eDynamicSet(AdjustmentsPackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE,
                AdjustmentsPackage.Literals.ABSOLUTE_ADJUSTMENT__GOAL_VALUE, newGoalValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case AdjustmentsPackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
            return this.getGoalValue();
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
        case AdjustmentsPackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
            this.setGoalValue((Integer) newValue);
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
        case AdjustmentsPackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
            this.setGoalValue(GOAL_VALUE_EDEFAULT);
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
        case AdjustmentsPackage.ABSOLUTE_ADJUSTMENT__GOAL_VALUE:
            return this.getGoalValue() != GOAL_VALUE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // AbsoluteAdjustmentImpl
