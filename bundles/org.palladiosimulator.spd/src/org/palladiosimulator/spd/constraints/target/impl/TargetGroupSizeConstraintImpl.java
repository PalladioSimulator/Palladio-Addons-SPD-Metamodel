/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint;
import org.palladiosimulator.spd.constraints.target.TargetPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Group Size
 * Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.constraints.target.impl.TargetGroupSizeConstraintImpl#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.constraints.target.impl.TargetGroupSizeConstraintImpl#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetGroupSizeConstraintImpl extends TargetConstraintImpl implements TargetGroupSizeConstraint {
	/**
	 * The default value of the '{@link #getMinSize() <em>Min Size</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SIZE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SIZE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetGroupSizeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.TARGET_GROUP_SIZE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinSize() {
		return (Integer) eDynamicGet(TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE,
				TargetPackage.Literals.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSize(int newMinSize) {
		eDynamicSet(TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE,
				TargetPackage.Literals.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE, newMinSize);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxSize() {
		return (Integer) eDynamicGet(TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE,
				TargetPackage.Literals.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSize(int newMaxSize) {
		eDynamicSet(TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE,
				TargetPackage.Literals.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE, newMaxSize);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
			return getMinSize();
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
			return getMaxSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
			setMinSize((Integer) newValue);
			return;
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
			setMaxSize((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
			setMinSize(MIN_SIZE_EDEFAULT);
			return;
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
			setMaxSize(MAX_SIZE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE:
			return getMinSize() != MIN_SIZE_EDEFAULT;
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE:
			return getMaxSize() != MAX_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // TargetGroupSizeConstraintImpl
