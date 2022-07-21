/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.adjustments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The StepAdjustment denotes that the group is adjusted by adding or removing a fixed amount of elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.adjustments.StepAdjustment#getStepValue <em>Step Value</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.adjustments.AdjustmentsPackage#getStepAdjustment()
 * @model
 * @generated
 */
public interface StepAdjustment extends AdjustmentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * Returns the value of the '<em><b>Step Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stepValue describes how many elements in the group should be added or removed. For example, a vallue of -1 determines that one element should be removed from the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Value</em>' attribute.
	 * @see #setStepValue(int)
	 * @see de.unistuttgart.slingshot.spd.adjustments.AdjustmentsPackage#getStepAdjustment_StepValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getStepValue();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.adjustments.StepAdjustment#getStepValue <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Value</em>' attribute.
	 * @see #getStepValue()
	 * @generated
	 */
	void setStepValue(int value);

} // StepAdjustment
