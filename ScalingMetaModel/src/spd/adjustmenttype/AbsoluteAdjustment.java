/**
 */
package spd.adjustmenttype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The AbsoluteAdjustment denotes that the group is adjusted to a goal value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.adjustmenttype.AbsoluteAdjustment#getGoalValue <em>Goal Value</em>}</li>
 * </ul>
 *
 * @see spd.adjustmenttype.AdjustmenttypePackage#getAbsoluteAdjustment()
 * @model
 * @generated
 */
public interface AbsoluteAdjustment extends AdjustmentType {
	/**
	 * Returns the value of the '<em><b>Goal Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The goalValue determines the target number of elements for a particular group, e.g., a value 5 means that the group will have 5 elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal Value</em>' attribute.
	 * @see #setGoalValue(int)
	 * @see spd.adjustmenttype.AdjustmenttypePackage#getAbsoluteAdjustment_GoalValue()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getGoalValue();

	/**
	 * Sets the value of the '{@link spd.adjustmenttype.AbsoluteAdjustment#getGoalValue <em>Goal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Value</em>' attribute.
	 * @see #getGoalValue()
	 * @generated
	 */
	void setGoalValue(int value);

} // AbsoluteAdjustment
