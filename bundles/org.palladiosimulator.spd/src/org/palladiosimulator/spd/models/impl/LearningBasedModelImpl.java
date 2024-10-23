/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Learning Based
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl#getLearningRate <em>Learning Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LearningBasedModelImpl extends BaseModelImpl implements LearningBasedModel {
	/**
	 * The default value of the '{@link #getLearningRate() <em>Learning Rate</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getLearningRate()
	 * @generated
	 * @ordered
	 */
	protected static final double LEARNING_RATE_EDEFAULT = 0.7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LearningBasedModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.LEARNING_BASED_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLearningRate() {
		return (Double) eDynamicGet(ModelsPackage.LEARNING_BASED_MODEL__LEARNING_RATE,
				ModelsPackage.Literals.LEARNING_BASED_MODEL__LEARNING_RATE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLearningRate(double newLearningRate) {
		eDynamicSet(ModelsPackage.LEARNING_BASED_MODEL__LEARNING_RATE,
				ModelsPackage.Literals.LEARNING_BASED_MODEL__LEARNING_RATE, newLearningRate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelsPackage.LEARNING_BASED_MODEL__LEARNING_RATE:
			return getLearningRate();
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
		case ModelsPackage.LEARNING_BASED_MODEL__LEARNING_RATE:
			setLearningRate((Double) newValue);
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
		case ModelsPackage.LEARNING_BASED_MODEL__LEARNING_RATE:
			setLearningRate(LEARNING_RATE_EDEFAULT);
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
		case ModelsPackage.LEARNING_BASED_MODEL__LEARNING_RATE:
			return getLearningRate() != LEARNING_RATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // LearningBasedModelImpl
