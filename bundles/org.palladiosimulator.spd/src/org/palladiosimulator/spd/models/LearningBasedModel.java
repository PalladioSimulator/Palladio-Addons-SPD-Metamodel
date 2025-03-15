/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Learning Based
 * Model</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Learning-based models have at least one stimulus as input and some
 * reward that is used for the learning process. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.LearningBasedModel#getLearningRate <em>Learning
 * Rate</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getLearningBasedModel()
 * @model abstract="true"
 * @generated
 */
public interface LearningBasedModel extends BaseModel {

    /**
     * Returns the value of the '<em><b>Learning Rate</b></em>' attribute. The default value is
     * <code>"0.7"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Learning Rate</em>' attribute.
     * @see #setLearningRate(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getLearningBasedModel_LearningRate()
     * @model default="0.7" dataType="org.palladiosimulator.spd.datatypes.PercentDouble"
     *        required="true"
     * @generated
     */
    double getLearningRate();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.models.LearningBasedModel#getLearningRate <em>Learning
     * Rate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Learning Rate</em>' attribute.
     * @see #getLearningRate()
     * @generated
     */
    void setLearningRate(double value);

} // LearningBasedModel
