/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import org.palladiosimulator.spd.triggers.expectations.ExpectedValue;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Base Trigger</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> A BaseTrigger is a class of ScalingTrigger that works on a Stimulus
 * (that entails the information gathered from the environment) and an ExpectedValue. Once the
 * Stimulus 'matches' the ExpectedValue the trigger fires and an adjustment to the model is made.
 * The matching of Stimulus with an ExpectedValue is determined by the subclasses. This can entail
 * simple analysis through relational operators or more advanced transformation/aggregation of the
 * Stimulus and the ExpectedValue. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.BaseTrigger#getStimulus <em>Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.triggers.BaseTrigger#getExpectedValue <em>Expected
 * Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getBaseTrigger()
 * @model abstract="true"
 * @generated
 */
public interface BaseTrigger extends ScalingTrigger {
    /**
     * Returns the value of the '<em><b>Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Stimulus</em>' containment reference.
     * @see #setStimulus(Stimulus)
     * @see org.palladiosimulator.spd.triggers.TriggersPackage#getBaseTrigger_Stimulus()
     * @model containment="true" required="true"
     * @generated
     */
    Stimulus getStimulus();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.triggers.BaseTrigger#getStimulus
     * <em>Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Stimulus</em>' containment reference.
     * @see #getStimulus()
     * @generated
     */
    void setStimulus(Stimulus value);

    /**
     * Returns the value of the '<em><b>Expected Value</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Expected Value</em>' containment reference.
     * @see #setExpectedValue(ExpectedValue)
     * @see org.palladiosimulator.spd.triggers.TriggersPackage#getBaseTrigger_ExpectedValue()
     * @model containment="true" required="true"
     * @generated
     */
    ExpectedValue getExpectedValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.triggers.BaseTrigger#getExpectedValue
     * <em>Expected Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Expected Value</em>' containment reference.
     * @see #getExpectedValue()
     * @generated
     */
    void setExpectedValue(ExpectedValue value);

} // BaseTrigger
