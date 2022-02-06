/**
 */
package spd.policyconstraint.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spd.policyconstraint.IntervallConstraint;
import spd.policyconstraint.PolicyconstraintPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervall Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.policyconstraint.impl.IntervallConstraintImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link spd.policyconstraint.impl.IntervallConstraintImpl#getIntervallDuration <em>Intervall Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervallConstraintImpl extends TemporalConstraintImpl implements IntervallConstraint {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntervallDuration() <em>Intervall Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervallDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVALL_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntervallDuration() <em>Intervall Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervallDuration()
	 * @generated
	 * @ordered
	 */
	protected int intervallDuration = INTERVALL_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervallConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyconstraintPackage.Literals.INTERVALL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyconstraintPackage.INTERVALL_CONSTRAINT__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIntervallDuration() {
		return intervallDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervallDuration(int newIntervallDuration) {
		int oldIntervallDuration = intervallDuration;
		intervallDuration = newIntervallDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyconstraintPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION, oldIntervallDuration, intervallDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT__OFFSET:
				return getOffset();
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION:
				return getIntervallDuration();
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
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT__OFFSET:
				setOffset((Integer)newValue);
				return;
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION:
				setIntervallDuration((Integer)newValue);
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
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION:
				setIntervallDuration(INTERVALL_DURATION_EDEFAULT);
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
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case PolicyconstraintPackage.INTERVALL_CONSTRAINT__INTERVALL_DURATION:
				return intervallDuration != INTERVALL_DURATION_EDEFAULT;
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
		result.append(" (offset: ");
		result.append(offset);
		result.append(", intervallDuration: ");
		result.append(intervallDuration);
		result.append(')');
		return result.toString();
	}

} //IntervallConstraintImpl
