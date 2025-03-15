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
import org.palladiosimulator.spd.ScalingPolicy;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.constraints.policy.PolicyConstraint;
import org.palladiosimulator.spd.targets.TargetGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#isActive <em>Active</em>}</li>
 * <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#getPolicyConstraints <em>Policy
 * Constraints</em>}</li>
 * <li>{@link org.palladiosimulator.spd.impl.ScalingPolicyImpl#getTargetGroup <em>Target
 * Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScalingPolicyImpl extends EntityImpl implements ScalingPolicy {
    /**
     * The default value of the '{@link #isActive() <em>Active</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean ACTIVE_EDEFAULT = false;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ScalingPolicyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdPackage.Literals.SCALING_POLICY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isActive() {
        return (Boolean) this.eDynamicGet(SpdPackage.SCALING_POLICY__ACTIVE, SpdPackage.Literals.SCALING_POLICY__ACTIVE,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setActive(final boolean newActive) {
        this.eDynamicSet(SpdPackage.SCALING_POLICY__ACTIVE, SpdPackage.Literals.SCALING_POLICY__ACTIVE, newActive);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TargetGroup getTargetGroup() {
        return (TargetGroup) this.eDynamicGet(SpdPackage.SCALING_POLICY__TARGET_GROUP,
                SpdPackage.Literals.SCALING_POLICY__TARGET_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TargetGroup basicGetTargetGroup() {
        return (TargetGroup) this.eDynamicGet(SpdPackage.SCALING_POLICY__TARGET_GROUP,
                SpdPackage.Literals.SCALING_POLICY__TARGET_GROUP, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTargetGroup(final TargetGroup newTargetGroup) {
        this.eDynamicSet(SpdPackage.SCALING_POLICY__TARGET_GROUP, SpdPackage.Literals.SCALING_POLICY__TARGET_GROUP,
                newTargetGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<PolicyConstraint> getPolicyConstraints() {
        return (EList<PolicyConstraint>) this.eDynamicGet(SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS,
                SpdPackage.Literals.SCALING_POLICY__POLICY_CONSTRAINTS, true, true);
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
        case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
            return ((InternalEList<?>) this.getPolicyConstraints()).basicRemove(otherEnd, msgs);
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
        case SpdPackage.SCALING_POLICY__ACTIVE:
            return this.isActive();
        case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
            return this.getPolicyConstraints();
        case SpdPackage.SCALING_POLICY__TARGET_GROUP:
            if (resolve) {
                return this.getTargetGroup();
            }
            return this.basicGetTargetGroup();
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
        case SpdPackage.SCALING_POLICY__ACTIVE:
            this.setActive((Boolean) newValue);
            return;
        case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
            this.getPolicyConstraints()
                .clear();
            this.getPolicyConstraints()
                .addAll((Collection<? extends PolicyConstraint>) newValue);
            return;
        case SpdPackage.SCALING_POLICY__TARGET_GROUP:
            this.setTargetGroup((TargetGroup) newValue);
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
        case SpdPackage.SCALING_POLICY__ACTIVE:
            this.setActive(ACTIVE_EDEFAULT);
            return;
        case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
            this.getPolicyConstraints()
                .clear();
            return;
        case SpdPackage.SCALING_POLICY__TARGET_GROUP:
            this.setTargetGroup((TargetGroup) null);
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
        case SpdPackage.SCALING_POLICY__ACTIVE:
            return this.isActive() != ACTIVE_EDEFAULT;
        case SpdPackage.SCALING_POLICY__POLICY_CONSTRAINTS:
            return !this.getPolicyConstraints()
                .isEmpty();
        case SpdPackage.SCALING_POLICY__TARGET_GROUP:
            return this.basicGetTargetGroup() != null;
        }
        return super.eIsSet(featureID);
    }

} // ScalingPolicyImpl
