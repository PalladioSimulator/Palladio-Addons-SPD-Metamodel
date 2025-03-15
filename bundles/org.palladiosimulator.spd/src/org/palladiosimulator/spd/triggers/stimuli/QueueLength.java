/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli;

import org.palladiosimulator.pcm.repository.PassiveResource;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Queue Length</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> A queue length based stimulus from the source of the target group. A
 * precondition is that the target group is of type CompetingConsumers. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.QueueLength#getPassiveResource <em>Passive
 * Resource</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getQueueLength()
 * @model
 * @generated
 */
public interface QueueLength extends SourceInterfaceStimulus {
    /**
     * Returns the value of the '<em><b>Passive Resource</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Passive Resource</em>' reference.
     * @see #setPassiveResource(PassiveResource)
     * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getQueueLength_PassiveResource()
     * @model
     * @generated
     */
    PassiveResource getPassiveResource();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.QueueLength#getPassiveResource <em>Passive
     * Resource</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Passive Resource</em>' reference.
     * @see #getPassiveResource()
     * @generated
     */
    void setPassiveResource(PassiveResource value);

} // QueueLength
