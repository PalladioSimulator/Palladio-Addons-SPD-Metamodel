/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedCount;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Expected Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedCountImpl#getCount
 * <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpectedCountImpl extends ExpectedPrimitiveImpl implements ExpectedCount {
    /**
     * The default value of the '{@link #getCount() <em>Count</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getCount()
     * @generated
     * @ordered
     */
    protected static final int COUNT_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExpectedCountImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpectationsPackage.Literals.EXPECTED_COUNT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getCount() {
        return (Integer) this.eDynamicGet(ExpectationsPackage.EXPECTED_COUNT__COUNT,
                ExpectationsPackage.Literals.EXPECTED_COUNT__COUNT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCount(final int newCount) {
        this.eDynamicSet(ExpectationsPackage.EXPECTED_COUNT__COUNT, ExpectationsPackage.Literals.EXPECTED_COUNT__COUNT,
                newCount);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExpectationsPackage.EXPECTED_COUNT__COUNT:
            return this.getCount();
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
        case ExpectationsPackage.EXPECTED_COUNT__COUNT:
            this.setCount((Integer) newValue);
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
        case ExpectationsPackage.EXPECTED_COUNT__COUNT:
            this.setCount(COUNT_EDEFAULT);
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
        case ExpectationsPackage.EXPECTED_COUNT__COUNT:
            return this.getCount() != COUNT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ExpectedCountImpl
