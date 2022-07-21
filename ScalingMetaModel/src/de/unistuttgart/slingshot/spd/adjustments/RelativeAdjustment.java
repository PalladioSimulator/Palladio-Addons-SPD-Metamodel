/**
 * Copyright SQA 2022
 */
package de.unistuttgart.slingshot.spd.adjustments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RelativeAdjustment denotes that the group should is adjusted relatively to the current number of elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.slingshot.spd.adjustments.RelativeAdjustment#getPercentageValue <em>Percentage Value</em>}</li>
 *   <li>{@link de.unistuttgart.slingshot.spd.adjustments.RelativeAdjustment#getMinAdjustmentValue <em>Min Adjustment Value</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.slingshot.spd.adjustments.AdjustmentsPackage#getRelativeAdjustment()
 * @model
 * @generated
 */
public interface RelativeAdjustment extends AdjustmentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright SQA 2022";

	/**
	 * Returns the value of the '<em><b>Percentage Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percantage value of adjustment e.g., a value of 10 denotes that 10% should be added to the existing capacity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percentage Value</em>' attribute.
	 * @see #setPercentageValue(double)
	 * @see de.unistuttgart.slingshot.spd.adjustments.AdjustmentsPackage#getRelativeAdjustment_PercentageValue()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getPercentageValue();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.adjustments.RelativeAdjustment#getPercentageValue <em>Percentage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Value</em>' attribute.
	 * @see #getPercentageValue()
	 * @generated
	 */
	void setPercentageValue(double value);

	/**
	 * Returns the value of the '<em><b>Min Adjustment Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A minimum adjustment value in case the percentage is 0. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Adjustment Value</em>' attribute.
	 * @see #setMinAdjustmentValue(int)
	 * @see de.unistuttgart.slingshot.spd.adjustments.AdjustmentsPackage#getRelativeAdjustment_MinAdjustmentValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinAdjustmentValue();

	/**
	 * Sets the value of the '{@link de.unistuttgart.slingshot.spd.adjustments.RelativeAdjustment#getMinAdjustmentValue <em>Min Adjustment Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Adjustment Value</em>' attribute.
	 * @see #getMinAdjustmentValue()
	 * @generated
	 */
	void setMinAdjustmentValue(int value);

} // RelativeAdjustment
