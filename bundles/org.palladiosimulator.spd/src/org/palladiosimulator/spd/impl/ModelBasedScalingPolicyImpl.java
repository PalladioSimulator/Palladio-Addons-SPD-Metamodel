/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.ModelBasedScalingPolicy;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.models.BaseModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Model Based Scaling
 * Policy</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.impl.ModelBasedScalingPolicyImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.impl.ModelBasedScalingPolicyImpl#getAdjustment <em>Adjustment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelBasedScalingPolicyImpl extends ScalingPolicyImpl implements ModelBasedScalingPolicy {
	/**
	 * The default value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected static final int ADJUSTMENT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelBasedScalingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdPackage.Literals.MODEL_BASED_SCALING_POLICY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseModel getModel() {
		return (BaseModel) eDynamicGet(SpdPackage.MODEL_BASED_SCALING_POLICY__MODEL,
				SpdPackage.Literals.MODEL_BASED_SCALING_POLICY__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(BaseModel newModel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newModel, SpdPackage.MODEL_BASED_SCALING_POLICY__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(BaseModel newModel) {
		eDynamicSet(SpdPackage.MODEL_BASED_SCALING_POLICY__MODEL, SpdPackage.Literals.MODEL_BASED_SCALING_POLICY__MODEL,
				newModel);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAdjustment() {
		return (Integer) eDynamicGet(SpdPackage.MODEL_BASED_SCALING_POLICY__ADJUSTMENT,
				SpdPackage.Literals.MODEL_BASED_SCALING_POLICY__ADJUSTMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdjustment(int newAdjustment) {
		eDynamicSet(SpdPackage.MODEL_BASED_SCALING_POLICY__ADJUSTMENT,
				SpdPackage.Literals.MODEL_BASED_SCALING_POLICY__ADJUSTMENT, newAdjustment);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdPackage.MODEL_BASED_SCALING_POLICY__MODEL:
			return basicSetModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdPackage.MODEL_BASED_SCALING_POLICY__MODEL:
			return getModel();
		case SpdPackage.MODEL_BASED_SCALING_POLICY__ADJUSTMENT:
			return getAdjustment();
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
		case SpdPackage.MODEL_BASED_SCALING_POLICY__MODEL:
			setModel((BaseModel) newValue);
			return;
		case SpdPackage.MODEL_BASED_SCALING_POLICY__ADJUSTMENT:
			setAdjustment((Integer) newValue);
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
		case SpdPackage.MODEL_BASED_SCALING_POLICY__MODEL:
			setModel((BaseModel) null);
			return;
		case SpdPackage.MODEL_BASED_SCALING_POLICY__ADJUSTMENT:
			setAdjustment(ADJUSTMENT_EDEFAULT);
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
		case SpdPackage.MODEL_BASED_SCALING_POLICY__MODEL:
			return getModel() != null;
		case SpdPackage.MODEL_BASED_SCALING_POLICY__ADJUSTMENT:
			return getAdjustment() != ADJUSTMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // ModelBasedScalingPolicyImpl
