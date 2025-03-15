/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli;

import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Operation Response
 * Time</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A stimulus based on the response time of a given operation. It requires
 * specifying the operationSignature. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime#getOperationSignature
 * <em>Operation Signature</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getOperationResponseTime()
 * @model
 * @generated
 */
public interface OperationResponseTime extends SourceInterfaceStimulus {
    /**
     * Returns the value of the '<em><b>Operation Signature</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> The operation from which the response time
     * is used. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Operation Signature</em>' reference.
     * @see #setOperationSignature(OperationSignature)
     * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#getOperationResponseTime_OperationSignature()
     * @model
     * @generated
     */
    OperationSignature getOperationSignature();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime#getOperationSignature
     * <em>Operation Signature</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Operation Signature</em>' reference.
     * @see #getOperationSignature()
     * @generated
     */
    void setOperationSignature(OperationSignature value);

} // OperationResponseTime
