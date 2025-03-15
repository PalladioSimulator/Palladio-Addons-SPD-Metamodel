/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.spd.SPD;
import org.palladiosimulator.spd.ScalingPolicy;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.targets.TargetGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>SPD</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.impl.SPDImpl#getScalingPolicies <em>Scaling
 * Policies</em>}</li>
 * <li>{@link org.palladiosimulator.spd.impl.SPDImpl#getTargetGroups <em>Target Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPDImpl extends EntityImpl implements SPD {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SPDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdPackage.Literals.SPD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ScalingPolicy> getScalingPolicies() {
        return (EList<ScalingPolicy>) this.eDynamicGet(SpdPackage.SPD__SCALING_POLICIES,
                SpdPackage.Literals.SPD__SCALING_POLICIES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<TargetGroup> getTargetGroups() {
        return (EList<TargetGroup>) this.eDynamicGet(SpdPackage.SPD__TARGET_GROUPS,
                SpdPackage.Literals.SPD__TARGET_GROUPS, true, true);
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
        case SpdPackage.SPD__SCALING_POLICIES:
            return ((InternalEList<?>) this.getScalingPolicies()).basicRemove(otherEnd, msgs);
        case SpdPackage.SPD__TARGET_GROUPS:
            return ((InternalEList<?>) this.getTargetGroups()).basicRemove(otherEnd, msgs);
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
        case SpdPackage.SPD__SCALING_POLICIES:
            return this.getScalingPolicies();
        case SpdPackage.SPD__TARGET_GROUPS:
            return this.getTargetGroups();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case SpdPackage.SPD__SCALING_POLICIES:
            this.getScalingPolicies()
                .clear();
            this.getScalingPolicies()
                .addAll((Collection<? extends ScalingPolicy>) newValue);
            return;
        case SpdPackage.SPD__TARGET_GROUPS:
            this.getTargetGroups()
                .clear();
            this.getTargetGroups()
                .addAll((Collection<? extends TargetGroup>) newValue);
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
        case SpdPackage.SPD__SCALING_POLICIES:
            this.getScalingPolicies()
                .clear();
            return;
        case SpdPackage.SPD__TARGET_GROUPS:
            this.getTargetGroups()
                .clear();
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
        case SpdPackage.SPD__SCALING_POLICIES:
            return !this.getScalingPolicies()
                .isEmpty();
        case SpdPackage.SPD__TARGET_GROUPS:
            return !this.getTargetGroups()
                .isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SPDImpl
