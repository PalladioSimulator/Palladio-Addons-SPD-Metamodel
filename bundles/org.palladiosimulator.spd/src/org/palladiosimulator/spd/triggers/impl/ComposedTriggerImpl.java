/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.spd.triggers.ComposedTrigger;
import org.palladiosimulator.spd.triggers.LogicalOperator;
import org.palladiosimulator.spd.triggers.ScalingTrigger;
import org.palladiosimulator.spd.triggers.TriggersPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Composed Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.impl.ComposedTriggerImpl#getScalingtrigger
 * <em>Scalingtrigger</em>}</li>
 * <li>{@link org.palladiosimulator.spd.triggers.impl.ComposedTriggerImpl#getLogicalOperator
 * <em>Logical Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposedTriggerImpl extends ScalingTriggerImpl implements ComposedTrigger {
    /**
     * The default value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLogicalOperator()
     * @generated
     * @ordered
     */
    protected static final LogicalOperator LOGICAL_OPERATOR_EDEFAULT = LogicalOperator.AND;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedTriggerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TriggersPackage.Literals.COMPOSED_TRIGGER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ScalingTrigger> getScalingtrigger() {
        return (EList<ScalingTrigger>) this.eDynamicGet(TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER,
                TriggersPackage.Literals.COMPOSED_TRIGGER__SCALINGTRIGGER, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public LogicalOperator getLogicalOperator() {
        return (LogicalOperator) this.eDynamicGet(TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR,
                TriggersPackage.Literals.COMPOSED_TRIGGER__LOGICAL_OPERATOR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLogicalOperator(final LogicalOperator newLogicalOperator) {
        this.eDynamicSet(TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR,
                TriggersPackage.Literals.COMPOSED_TRIGGER__LOGICAL_OPERATOR, newLogicalOperator);
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
        case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
            return ((InternalEList<?>) this.getScalingtrigger()).basicRemove(otherEnd, msgs);
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
        case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
            return this.getScalingtrigger();
        case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
            return this.getLogicalOperator();
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
        case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
            this.getScalingtrigger()
                .clear();
            this.getScalingtrigger()
                .addAll((Collection<? extends ScalingTrigger>) newValue);
            return;
        case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
            this.setLogicalOperator((LogicalOperator) newValue);
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
        case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
            this.getScalingtrigger()
                .clear();
            return;
        case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
            this.setLogicalOperator(LOGICAL_OPERATOR_EDEFAULT);
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
        case TriggersPackage.COMPOSED_TRIGGER__SCALINGTRIGGER:
            return !this.getScalingtrigger()
                .isEmpty();
        case TriggersPackage.COMPOSED_TRIGGER__LOGICAL_OPERATOR:
            return this.getLogicalOperator() != LOGICAL_OPERATOR_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ComposedTriggerImpl
