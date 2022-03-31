/**
 */
package spd.scalingtrigger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ThresholdBasedTrigger is the supertype of triggers that for analysis has a simple threshold check for breach or undercut. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.ThresholdBasedTrigger#getThresholdDirection <em>Threshold Direction</em>}</li>
 *   <li>{@link spd.scalingtrigger.ThresholdBasedTrigger#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link spd.scalingtrigger.ThresholdBasedTrigger#getViolationWindow <em>Violation Window</em>}</li>
 * </ul>
 *
 * @see spd.scalingtrigger.ScalingtriggerPackage#getThresholdBasedTrigger()
 * @model abstract="true"
 * @generated
 */
public interface ThresholdBasedTrigger extends ScalingTrigger {

	/**
	 * Returns the value of the '<em><b>Threshold Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link spd.scalingtrigger.THRESHOLDDIRECTION}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Direction</em>' attribute.
	 * @see spd.scalingtrigger.THRESHOLDDIRECTION
	 * @see #setThresholdDirection(THRESHOLDDIRECTION)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getThresholdBasedTrigger_ThresholdDirection()
	 * @model
	 * @generated
	 */
	THRESHOLDDIRECTION getThresholdDirection();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.ThresholdBasedTrigger#getThresholdDirection <em>Threshold Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Direction</em>' attribute.
	 * @see spd.scalingtrigger.THRESHOLDDIRECTION
	 * @see #getThresholdDirection()
	 * @generated
	 */
	void setThresholdDirection(THRESHOLDDIRECTION value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getThresholdBasedTrigger_Threshold()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.ThresholdBasedTrigger#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violation Window</em>' attribute.
	 * @see #setViolationWindow(double)
	 * @see spd.scalingtrigger.ScalingtriggerPackage#getThresholdBasedTrigger_ViolationWindow()
	 * @model required="true"
	 * @generated
	 */
	double getViolationWindow();

	/**
	 * Sets the value of the '{@link spd.scalingtrigger.ThresholdBasedTrigger#getViolationWindow <em>Violation Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Violation Window</em>' attribute.
	 * @see #getViolationWindow()
	 * @generated
	 */
	void setViolationWindow(double value);
} // ThresholdBasedTrigger
