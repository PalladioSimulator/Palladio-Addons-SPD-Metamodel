/**
 */
package spd.scalingtrigger.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import spd.scalingtrigger.ScalingtriggerPackage;
import spd.scalingtrigger.THRESHOLDDIRECTION;
import spd.scalingtrigger.ThresholdBasedTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threshold Based Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.impl.ThresholdBasedTriggerImpl#getThresholdDirection <em>Threshold Direction</em>}</li>
 *   <li>{@link spd.scalingtrigger.impl.ThresholdBasedTriggerImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link spd.scalingtrigger.impl.ThresholdBasedTriggerImpl#getViolationWindow <em>Violation Window</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ThresholdBasedTriggerImpl extends ScalingTriggerImpl implements ThresholdBasedTrigger {
	/**
	 * The default value of the '{@link #getThresholdDirection() <em>Threshold Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDirection()
	 * @generated
	 * @ordered
	 */
	protected static final THRESHOLDDIRECTION THRESHOLD_DIRECTION_EDEFAULT = THRESHOLDDIRECTION.EXCEDEED;
	/**
	 * The cached value of the '{@link #getThresholdDirection() <em>Threshold Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdDirection()
	 * @generated
	 * @ordered
	 */
	protected THRESHOLDDIRECTION thresholdDirection = THRESHOLD_DIRECTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;
	/**
	 * The default value of the '{@link #getViolationWindow() <em>Violation Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationWindow()
	 * @generated
	 * @ordered
	 */
	protected static final double VIOLATION_WINDOW_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getViolationWindow() <em>Violation Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationWindow()
	 * @generated
	 * @ordered
	 */
	protected double violationWindow = VIOLATION_WINDOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThresholdBasedTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalingtriggerPackage.Literals.THRESHOLD_BASED_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public THRESHOLDDIRECTION getThresholdDirection() {
		return thresholdDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholdDirection(THRESHOLDDIRECTION newThresholdDirection) {
		THRESHOLDDIRECTION oldThresholdDirection = thresholdDirection;
		thresholdDirection = newThresholdDirection == null ? THRESHOLD_DIRECTION_EDEFAULT : newThresholdDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION, oldThresholdDirection, thresholdDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreshold(double newThreshold) {
		double oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getViolationWindow() {
		return violationWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViolationWindow(double newViolationWindow) {
		double oldViolationWindow = violationWindow;
		violationWindow = newViolationWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW, oldViolationWindow, violationWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION:
				return getThresholdDirection();
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD:
				return getThreshold();
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW:
				return getViolationWindow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION:
				setThresholdDirection((THRESHOLDDIRECTION)newValue);
				return;
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD:
				setThreshold((Double)newValue);
				return;
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW:
				setViolationWindow((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION:
				setThresholdDirection(THRESHOLD_DIRECTION_EDEFAULT);
				return;
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW:
				setViolationWindow(VIOLATION_WINDOW_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION:
				return thresholdDirection != THRESHOLD_DIRECTION_EDEFAULT;
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__THRESHOLD:
				return threshold != THRESHOLD_EDEFAULT;
			case ScalingtriggerPackage.THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW:
				return violationWindow != VIOLATION_WINDOW_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (thresholdDirection: ");
		result.append(thresholdDirection);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", violationWindow: ");
		result.append(violationWindow);
		result.append(')');
		return result.toString();
	}

} //ThresholdBasedTriggerImpl
