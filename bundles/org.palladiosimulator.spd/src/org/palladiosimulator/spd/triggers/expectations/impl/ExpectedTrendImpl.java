/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.triggers.TrendPattern;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTrend;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Expected Trend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTrendImpl#getTrend
 * <em>Trend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpectedTrendImpl extends ExpectedValueImpl implements ExpectedTrend {
    /**
     * The default value of the '{@link #getTrend() <em>Trend</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getTrend()
     * @generated
     * @ordered
     */
    protected static final TrendPattern TREND_EDEFAULT = TrendPattern.INCREASING;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExpectedTrendImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpectationsPackage.Literals.EXPECTED_TREND;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TrendPattern getTrend() {
        return (TrendPattern) this.eDynamicGet(ExpectationsPackage.EXPECTED_TREND__TREND,
                ExpectationsPackage.Literals.EXPECTED_TREND__TREND, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTrend(final TrendPattern newTrend) {
        this.eDynamicSet(ExpectationsPackage.EXPECTED_TREND__TREND, ExpectationsPackage.Literals.EXPECTED_TREND__TREND,
                newTrend);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExpectationsPackage.EXPECTED_TREND__TREND:
            return this.getTrend();
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
        case ExpectationsPackage.EXPECTED_TREND__TREND:
            this.setTrend((TrendPattern) newValue);
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
        case ExpectationsPackage.EXPECTED_TREND__TREND:
            this.setTrend(TREND_EDEFAULT);
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
        case ExpectationsPackage.EXPECTED_TREND__TREND:
            return this.getTrend() != TREND_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ExpectedTrendImpl
