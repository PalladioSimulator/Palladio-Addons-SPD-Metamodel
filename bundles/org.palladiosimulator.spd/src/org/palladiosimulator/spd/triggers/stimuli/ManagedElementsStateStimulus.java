/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli;

import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Managed Elements State
 * Stimulus</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The ManagedElementsStateStiumlus classifies the stimuli that has the
 * source in the managed elements. A ManagedElementsStateStimulus has to specify how the aggregation
 * across elements is performed. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus#getAggregationOverElements
 * <em>Aggregation Over Elements</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getManagedElementsStateStimulus()
 * @model abstract="true"
 * @generated
 */
public interface ManagedElementsStateStimulus extends TargetGroupStateStimulus {
    /**
     * Returns the value of the '<em><b>Aggregation Over Elements</b></em>' attribute. The literals
     * are from the enumeration {@link org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The aggregation accross
     * different resource containers in the Target Group. For example if two containers C1 and C2
     * have a resource utilizaiton of 0.6, respectively 0.8, then choosing AVERAGE as an aggreagtion
     * method then it determines that the value of 0.7 should be compared against the threshold
     * value. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Aggregation Over Elements</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
     * @see #setAggregationOverElements(AGGREGATIONMETHOD)
     * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getManagedElementsStateStimulus_AggregationOverElements()
     * @model
     * @generated
     */
    AGGREGATIONMETHOD getAggregationOverElements();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus#getAggregationOverElements
     * <em>Aggregation Over Elements</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Aggregation Over Elements</em>' attribute.
     * @see org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
     * @see #getAggregationOverElements()
     * @generated
     */
    void setAggregationOverElements(AGGREGATIONMETHOD value);

} // ManagedElementsStateStimulus
