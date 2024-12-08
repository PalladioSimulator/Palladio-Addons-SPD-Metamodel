/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Random Model</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.RandomModel#getMinAdjustment <em>Min
 * Adjustment</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment <em>Max
 * Adjustment</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.RandomModel#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getRandomModel()
 * @model
 * @generated
 */
public interface RandomModel extends BaseModel {
    /**
     * Returns the value of the '<em><b>Min Adjustment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Min Adjustment</em>' attribute.
     * @see #setMinAdjustment(int)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getRandomModel_MinAdjustment()
     * @model required="true"
     * @generated
     */
    int getMinAdjustment();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.RandomModel#getMinAdjustment
     * <em>Min Adjustment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Min Adjustment</em>' attribute.
     * @see #getMinAdjustment()
     * @generated
     */
    void setMinAdjustment(int value);

    /**
     * Returns the value of the '<em><b>Max Adjustment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Max Adjustment</em>' attribute.
     * @see #setMaxAdjustment(int)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getRandomModel_MaxAdjustment()
     * @model required="true"
     * @generated
     */
    int getMaxAdjustment();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment
     * <em>Max Adjustment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Max Adjustment</em>' attribute.
     * @see #getMaxAdjustment()
     * @generated
     */
    void setMaxAdjustment(int value);

    /**
     * Returns the value of the '<em><b>Probability</b></em>' attribute. The default value is
     * <code>"1.0"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Probability</em>' attribute.
     * @see #setProbability(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getRandomModel_Probability()
     * @model default="1.0" dataType="org.palladiosimulator.spd.datatypes.PercentDouble"
     *        required="true"
     * @generated
     */
    double getProbability();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.RandomModel#getProbability
     * <em>Probability</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Probability</em>' attribute.
     * @see #getProbability()
     * @generated
     */
    void setProbability(double value);

} // RandomModel
