/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.triggers.RelationalOperator;
import org.palladiosimulator.spd.triggers.SimpleFireOnValue;
import org.palladiosimulator.spd.triggers.TriggersPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Simple Fire On
 * Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.impl.SimpleFireOnValueImpl#getRelationalOperator
 * <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleFireOnValueImpl extends BaseTriggerImpl implements SimpleFireOnValue {
    /**
     * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRelationalOperator()
     * @generated
     * @ordered
     */
    protected static final RelationalOperator RELATIONAL_OPERATOR_EDEFAULT = RelationalOperator.LESS_THAN;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SimpleFireOnValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TriggersPackage.Literals.SIMPLE_FIRE_ON_VALUE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RelationalOperator getRelationalOperator() {
        return (RelationalOperator) this.eDynamicGet(TriggersPackage.SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR,
                TriggersPackage.Literals.SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRelationalOperator(final RelationalOperator newRelationalOperator) {
        this.eDynamicSet(TriggersPackage.SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR,
                TriggersPackage.Literals.SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR, newRelationalOperator);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TriggersPackage.SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR:
            return this.getRelationalOperator();
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
        case TriggersPackage.SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR:
            this.setRelationalOperator((RelationalOperator) newValue);
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
        case TriggersPackage.SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR:
            this.setRelationalOperator(RELATIONAL_OPERATOR_EDEFAULT);
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
        case TriggersPackage.SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR:
            return this.getRelationalOperator() != RELATIONAL_OPERATOR_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // SimpleFireOnValueImpl
