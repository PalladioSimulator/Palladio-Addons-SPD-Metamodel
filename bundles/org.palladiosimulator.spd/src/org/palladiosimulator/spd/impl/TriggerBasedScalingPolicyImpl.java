/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.TriggerBasedScalingPolicy;
import org.palladiosimulator.spd.adjustments.AdjustmentType;
import org.palladiosimulator.spd.triggers.ScalingTrigger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Trigger Based Scaling
 * Policy</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.impl.TriggerBasedScalingPolicyImpl#getAdjustmentType
 * <em>Adjustment Type</em>}</li>
 * <li>{@link org.palladiosimulator.spd.impl.TriggerBasedScalingPolicyImpl#getScalingTrigger
 * <em>Scaling Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerBasedScalingPolicyImpl extends ScalingPolicyImpl implements TriggerBasedScalingPolicy {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TriggerBasedScalingPolicyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AdjustmentType getAdjustmentType() {
        return (AdjustmentType) this.eDynamicGet(SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE,
                SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetAdjustmentType(final AdjustmentType newAdjustmentType, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newAdjustmentType,
                SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAdjustmentType(final AdjustmentType newAdjustmentType) {
        this.eDynamicSet(SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE,
                SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE, newAdjustmentType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ScalingTrigger getScalingTrigger() {
        return (ScalingTrigger) this.eDynamicGet(SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER,
                SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetScalingTrigger(final ScalingTrigger newScalingTrigger, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newScalingTrigger,
                SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setScalingTrigger(final ScalingTrigger newScalingTrigger) {
        this.eDynamicSet(SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER,
                SpdPackage.Literals.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER, newScalingTrigger);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE:
            return this.basicSetAdjustmentType(null, msgs);
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER:
            return this.basicSetScalingTrigger(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE:
            return this.getAdjustmentType();
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER:
            return this.getScalingTrigger();
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
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE:
            this.setAdjustmentType((AdjustmentType) newValue);
            return;
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER:
            this.setScalingTrigger((ScalingTrigger) newValue);
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
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE:
            this.setAdjustmentType((AdjustmentType) null);
            return;
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER:
            this.setScalingTrigger((ScalingTrigger) null);
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
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE:
            return this.getAdjustmentType() != null;
        case SpdPackage.TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER:
            return this.getScalingTrigger() != null;
        }
        return super.eIsSet(featureID);
    }

} // TriggerBasedScalingPolicyImpl
