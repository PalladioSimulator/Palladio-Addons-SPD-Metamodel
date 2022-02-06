/**
 */
package spd.policyconstraint.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spd.policyconstraint.PolicyconstraintPackage;
import spd.policyconstraint.TargetGroupSizeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Group Size Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.policyconstraint.impl.TargetGroupSizeConstraintImpl#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link spd.policyconstraint.impl.TargetGroupSizeConstraintImpl#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetGroupSizeConstraintImpl extends StateBasedContraintImpl implements TargetGroupSizeConstraint {
	/**
	 * The default value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected int minSize = MIN_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected int maxSize = MAX_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetGroupSizeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolicyconstraintPackage.Literals.TARGET_GROUP_SIZE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinSize() {
		return minSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSize(int newMinSize) {
		int oldMinSize = minSize;
		minSize = newMinSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE, oldMinSize, minSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSize(int newMaxSize) {
		int oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE, oldMaxSize, maxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
				return getMinSize();
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
				return getMaxSize();
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
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
				setMinSize((Integer)newValue);
				return;
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
				setMaxSize((Integer)newValue);
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
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
				setMinSize(MIN_SIZE_EDEFAULT);
				return;
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
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
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
				return minSize != MIN_SIZE_EDEFAULT;
			case PolicyconstraintPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
				return maxSize != MAX_SIZE_EDEFAULT;
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
		result.append(" (minSize: ");
		result.append(minSize);
		result.append(", maxSize: ");
		result.append(maxSize);
		result.append(')');
		return result.toString();
	}

} //TargetGroupSizeConstraintImpl
