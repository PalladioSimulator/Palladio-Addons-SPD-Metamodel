/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd;

import org.palladiosimulator.spd.models.BaseModel;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Model Based Scaling
 * Policy</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A model-based scaling policy contains a model that determines both
 * whether any scaling should occur and the type of adjustment by itself. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.ModelBasedScalingPolicy#getModel <em>Model</em>}</li>
 * <li>{@link org.palladiosimulator.spd.ModelBasedScalingPolicy#getAdjustment
 * <em>Adjustment</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.SpdPackage#getModelBasedScalingPolicy()
 * @model
 * @generated
 */
public interface ModelBasedScalingPolicy extends ScalingPolicy {
    /**
     * Returns the value of the '<em><b>Model</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Model</em>' containment reference.
     * @see #setModel(BaseModel)
     * @see org.palladiosimulator.spd.SpdPackage#getModelBasedScalingPolicy_Model()
     * @model containment="true" required="true"
     * @generated
     */
    BaseModel getModel();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.ModelBasedScalingPolicy#getModel
     * <em>Model</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(BaseModel value);

    /**
     * Returns the value of the '<em><b>Adjustment</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Adjustment</em>' attribute.
     * @see #setAdjustment(int)
     * @see org.palladiosimulator.spd.SpdPackage#getModelBasedScalingPolicy_Adjustment()
     * @model transient="true"
     * @generated
     */
    int getAdjustment();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.ModelBasedScalingPolicy#getAdjustment
     * <em>Adjustment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Adjustment</em>' attribute.
     * @see #getAdjustment()
     * @generated
     */
    void setAdjustment(int value);

} // ModelBasedScalingPolicy
