/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.spd.constraints.target.TargetConstraint;
import org.palladiosimulator.spd.targets.TargetGroup;
import org.palladiosimulator.spd.targets.TargetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.targets.impl.TargetGroupImpl#getTargetConstraints <em>Target
 * Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TargetGroupImpl extends EntityImpl implements TargetGroup {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TargetGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetsPackage.Literals.TARGET_GROUP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<TargetConstraint> getTargetConstraints() {
        return (EList<TargetConstraint>) this.eDynamicGet(TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS,
                TargetsPackage.Literals.TARGET_GROUP__TARGET_CONSTRAINTS, true, true);
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
        case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
            return ((InternalEList<?>) this.getTargetConstraints()).basicRemove(otherEnd, msgs);
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
        case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
            return this.getTargetConstraints();
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
        case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
            this.getTargetConstraints()
                .clear();
            this.getTargetConstraints()
                .addAll((Collection<? extends TargetConstraint>) newValue);
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
        case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
            this.getTargetConstraints()
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
        case TargetsPackage.TARGET_GROUP__TARGET_CONSTRAINTS:
            return !this.getTargetConstraints()
                .isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // TargetGroupImpl
