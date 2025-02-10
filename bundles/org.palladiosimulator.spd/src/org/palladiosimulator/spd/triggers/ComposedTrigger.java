/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Composed Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A ComposedTrigger composes two or more ScalingTriggers through a logical
 * operator (i.e., AND, OR, XOR). This enables the defintion of composed triggers which encapsulate
 * more advanced conditions on the state to fire the trigger. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.ComposedTrigger#getScalingtrigger
 * <em>Scalingtrigger</em>}</li>
 * <li>{@link org.palladiosimulator.spd.triggers.ComposedTrigger#getLogicalOperator <em>Logical
 * Operator</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getComposedTrigger()
 * @model
 * @generated
 */
public interface ComposedTrigger extends ScalingTrigger {
    /**
     * Returns the value of the '<em><b>Scalingtrigger</b></em>' containment reference list. The
     * list contents are of type {@link org.palladiosimulator.spd.triggers.ScalingTrigger}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Scalingtrigger</em>' containment reference list.
     * @see org.palladiosimulator.spd.triggers.TriggersPackage#getComposedTrigger_Scalingtrigger()
     * @model containment="true" lower="2"
     * @generated
     */
    EList<ScalingTrigger> getScalingtrigger();

    /**
     * Returns the value of the '<em><b>Logical Operator</b></em>' attribute. The literals are from
     * the enumeration {@link org.palladiosimulator.spd.triggers.LogicalOperator}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Logical Operator</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.LogicalOperator
     * @see #setLogicalOperator(LogicalOperator)
     * @see org.palladiosimulator.spd.triggers.TriggersPackage#getComposedTrigger_LogicalOperator()
     * @model
     * @generated
     */
    LogicalOperator getLogicalOperator();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.ComposedTrigger#getLogicalOperator <em>Logical
     * Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Logical Operator</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.LogicalOperator
     * @see #getLogicalOperator()
     * @generated
     */
    void setLogicalOperator(LogicalOperator value);

} // ComposedTrigger
