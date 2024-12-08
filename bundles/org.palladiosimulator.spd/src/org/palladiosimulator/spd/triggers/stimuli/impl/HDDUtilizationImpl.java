/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.triggers.HDDUSAGETYPE;
import org.palladiosimulator.spd.triggers.stimuli.HDDUtilization;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HDD Utilization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.HDDUtilizationImpl#getUsageType
 * <em>Usage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDDUtilizationImpl extends ResourceUtilizationStimulusImpl implements HDDUtilization {
    /**
     * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUsageType()
     * @generated
     * @ordered
     */
    protected static final HDDUSAGETYPE USAGE_TYPE_EDEFAULT = HDDUSAGETYPE.READ;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected HDDUtilizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StimuliPackage.Literals.HDD_UTILIZATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public HDDUSAGETYPE getUsageType() {
        return (HDDUSAGETYPE) this.eDynamicGet(StimuliPackage.HDD_UTILIZATION__USAGE_TYPE,
                StimuliPackage.Literals.HDD_UTILIZATION__USAGE_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsageType(final HDDUSAGETYPE newUsageType) {
        this.eDynamicSet(StimuliPackage.HDD_UTILIZATION__USAGE_TYPE,
                StimuliPackage.Literals.HDD_UTILIZATION__USAGE_TYPE, newUsageType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case StimuliPackage.HDD_UTILIZATION__USAGE_TYPE:
            return this.getUsageType();
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
        case StimuliPackage.HDD_UTILIZATION__USAGE_TYPE:
            this.setUsageType((HDDUSAGETYPE) newValue);
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
        case StimuliPackage.HDD_UTILIZATION__USAGE_TYPE:
            this.setUsageType(USAGE_TYPE_EDEFAULT);
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
        case StimuliPackage.HDD_UTILIZATION__USAGE_TYPE:
            return this.getUsageType() != USAGE_TYPE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // HDDUtilizationImpl
