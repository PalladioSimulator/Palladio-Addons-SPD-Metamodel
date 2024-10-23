/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.RandomModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Random Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.impl.RandomModelImpl#getMinAdjustment <em>Min Adjustment</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.RandomModelImpl#getMaxAdjustment <em>Max Adjustment</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.RandomModelImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomModelImpl extends BaseModelImpl implements RandomModel {
	/**
	 * The default value of the '{@link #getMinAdjustment() <em>Min Adjustment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinAdjustment()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ADJUSTMENT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMaxAdjustment() <em>Max Adjustment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxAdjustment()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ADJUSTMENT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.RANDOM_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinAdjustment() {
		return (Integer) eDynamicGet(ModelsPackage.RANDOM_MODEL__MIN_ADJUSTMENT,
				ModelsPackage.Literals.RANDOM_MODEL__MIN_ADJUSTMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinAdjustment(int newMinAdjustment) {
		eDynamicSet(ModelsPackage.RANDOM_MODEL__MIN_ADJUSTMENT, ModelsPackage.Literals.RANDOM_MODEL__MIN_ADJUSTMENT,
				newMinAdjustment);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxAdjustment() {
		return (Integer) eDynamicGet(ModelsPackage.RANDOM_MODEL__MAX_ADJUSTMENT,
				ModelsPackage.Literals.RANDOM_MODEL__MAX_ADJUSTMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAdjustment(int newMaxAdjustment) {
		eDynamicSet(ModelsPackage.RANDOM_MODEL__MAX_ADJUSTMENT, ModelsPackage.Literals.RANDOM_MODEL__MAX_ADJUSTMENT,
				newMaxAdjustment);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbability() {
		return (Double) eDynamicGet(ModelsPackage.RANDOM_MODEL__PROBABILITY,
				ModelsPackage.Literals.RANDOM_MODEL__PROBABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(double newProbability) {
		eDynamicSet(ModelsPackage.RANDOM_MODEL__PROBABILITY, ModelsPackage.Literals.RANDOM_MODEL__PROBABILITY,
				newProbability);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelsPackage.RANDOM_MODEL__MIN_ADJUSTMENT:
			return getMinAdjustment();
		case ModelsPackage.RANDOM_MODEL__MAX_ADJUSTMENT:
			return getMaxAdjustment();
		case ModelsPackage.RANDOM_MODEL__PROBABILITY:
			return getProbability();
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
		case ModelsPackage.RANDOM_MODEL__MIN_ADJUSTMENT:
			setMinAdjustment((Integer) newValue);
			return;
		case ModelsPackage.RANDOM_MODEL__MAX_ADJUSTMENT:
			setMaxAdjustment((Integer) newValue);
			return;
		case ModelsPackage.RANDOM_MODEL__PROBABILITY:
			setProbability((Double) newValue);
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
		case ModelsPackage.RANDOM_MODEL__MIN_ADJUSTMENT:
			setMinAdjustment(MIN_ADJUSTMENT_EDEFAULT);
			return;
		case ModelsPackage.RANDOM_MODEL__MAX_ADJUSTMENT:
			setMaxAdjustment(MAX_ADJUSTMENT_EDEFAULT);
			return;
		case ModelsPackage.RANDOM_MODEL__PROBABILITY:
			setProbability(PROBABILITY_EDEFAULT);
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
		case ModelsPackage.RANDOM_MODEL__MIN_ADJUSTMENT:
			return getMinAdjustment() != MIN_ADJUSTMENT_EDEFAULT;
		case ModelsPackage.RANDOM_MODEL__MAX_ADJUSTMENT:
			return getMaxAdjustment() != MAX_ADJUSTMENT_EDEFAULT;
		case ModelsPackage.RANDOM_MODEL__PROBABILITY:
			return getProbability() != PROBABILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // RandomModelImpl
