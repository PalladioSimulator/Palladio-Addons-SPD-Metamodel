/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE;
import org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Network
 * Utilization</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.NetworkUtilizationImpl#getUsageType
 * <em>Usage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkUtilizationImpl extends ResourceUtilizationStimulusImpl implements NetworkUtilization {
    /**
     * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUsageType()
     * @generated
     * @ordered
     */
    protected static final NETWORKUSAGETYPE USAGE_TYPE_EDEFAULT = NETWORKUSAGETYPE.SEND;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NetworkUtilizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StimuliPackage.Literals.NETWORK_UTILIZATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NETWORKUSAGETYPE getUsageType() {
        return (NETWORKUSAGETYPE) this.eDynamicGet(StimuliPackage.NETWORK_UTILIZATION__USAGE_TYPE,
                StimuliPackage.Literals.NETWORK_UTILIZATION__USAGE_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsageType(final NETWORKUSAGETYPE newUsageType) {
        this.eDynamicSet(StimuliPackage.NETWORK_UTILIZATION__USAGE_TYPE,
                StimuliPackage.Literals.NETWORK_UTILIZATION__USAGE_TYPE, newUsageType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case StimuliPackage.NETWORK_UTILIZATION__USAGE_TYPE:
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
        case StimuliPackage.NETWORK_UTILIZATION__USAGE_TYPE:
            this.setUsageType((NETWORKUSAGETYPE) newValue);
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
        case StimuliPackage.NETWORK_UTILIZATION__USAGE_TYPE:
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
        case StimuliPackage.NETWORK_UTILIZATION__USAGE_TYPE:
            return this.getUsageType() != USAGE_TYPE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // NetworkUtilizationImpl
