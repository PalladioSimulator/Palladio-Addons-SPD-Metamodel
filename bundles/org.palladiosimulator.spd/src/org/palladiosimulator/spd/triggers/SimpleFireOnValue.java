/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Simple Fire On
 * Value</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The SimpleFireOnValue trigger the most simplistic BaseTrigger that works
 * on the fed stimulus through a relational operator with an expected value. In case 'LessThen' is
 * specified then the the trigger will fire upon stiumuls < expectedValue. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.SimpleFireOnValue#getRelationalOperator
 * <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getSimpleFireOnValue()
 * @model
 * @generated
 */
public interface SimpleFireOnValue extends BaseTrigger {
    /**
     * Returns the value of the '<em><b>Relational Operator</b></em>' attribute. The literals are
     * from the enumeration {@link org.palladiosimulator.spd.triggers.RelationalOperator}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Relational Operator</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.RelationalOperator
     * @see #setRelationalOperator(RelationalOperator)
     * @see org.palladiosimulator.spd.triggers.TriggersPackage#getSimpleFireOnValue_RelationalOperator()
     * @model
     * @generated
     */
    RelationalOperator getRelationalOperator();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.SimpleFireOnValue#getRelationalOperator
     * <em>Relational Operator</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Relational Operator</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.RelationalOperator
     * @see #getRelationalOperator()
     * @generated
     */
    void setRelationalOperator(RelationalOperator value);

} // SimpleFireOnValue
