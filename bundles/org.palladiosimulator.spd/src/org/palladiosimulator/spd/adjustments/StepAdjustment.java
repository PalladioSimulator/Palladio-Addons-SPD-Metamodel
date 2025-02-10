/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Step Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The StepAdjustment denotes that the group is adjusted by adding or
 * removing a fixed amount of elements. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.adjustments.StepAdjustment#getStepValue <em>Step
 * Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.adjustments.AdjustmentsPackage#getStepAdjustment()
 * @model
 * @generated
 */
public interface StepAdjustment extends AdjustmentType {
    /**
     * Returns the value of the '<em><b>Step Value</b></em>' attribute. The default value is
     * <code>"0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * stepValue describes how many elements in the group should be added or removed. For example, a
     * vallue of -1 determines that one element should be removed from the group. <!-- end-model-doc
     * -->
     *
     * @return the value of the '<em>Step Value</em>' attribute.
     * @see #setStepValue(int)
     * @see org.palladiosimulator.spd.adjustments.AdjustmentsPackage#getStepAdjustment_StepValue()
     * @model default="0" required="true"
     * @generated
     */
    int getStepValue();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.adjustments.StepAdjustment#getStepValue <em>Step
     * Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Step Value</em>' attribute.
     * @see #getStepValue()
     * @generated
     */
    void setStepValue(int value);

} // StepAdjustment
