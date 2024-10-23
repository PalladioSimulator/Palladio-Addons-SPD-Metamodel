/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.spd.models.BaseModel;
import org.palladiosimulator.spd.models.ModelsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Base Model</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.impl.BaseModelImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.BaseModelImpl#getInitalIntervalDelay <em>Inital Interval Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseModelImpl extends CDOObjectImpl implements BaseModel {
	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERVAL_EDEFAULT = 1.0;

	/**
	 * The default value of the '{@link #getInitalIntervalDelay() <em>Inital Interval Delay</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInitalIntervalDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double INITAL_INTERVAL_DELAY_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.BASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getInterval() {
		return (Double) eDynamicGet(ModelsPackage.BASE_MODEL__INTERVAL, ModelsPackage.Literals.BASE_MODEL__INTERVAL,
				true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterval(double newInterval) {
		eDynamicSet(ModelsPackage.BASE_MODEL__INTERVAL, ModelsPackage.Literals.BASE_MODEL__INTERVAL, newInterval);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getInitalIntervalDelay() {
		return (Double) eDynamicGet(ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY,
				ModelsPackage.Literals.BASE_MODEL__INITAL_INTERVAL_DELAY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitalIntervalDelay(double newInitalIntervalDelay) {
		eDynamicSet(ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY,
				ModelsPackage.Literals.BASE_MODEL__INITAL_INTERVAL_DELAY, newInitalIntervalDelay);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelsPackage.BASE_MODEL__INTERVAL:
			return getInterval();
		case ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY:
			return getInitalIntervalDelay();
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
		case ModelsPackage.BASE_MODEL__INTERVAL:
			setInterval((Double) newValue);
			return;
		case ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY:
			setInitalIntervalDelay((Double) newValue);
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
		case ModelsPackage.BASE_MODEL__INTERVAL:
			setInterval(INTERVAL_EDEFAULT);
			return;
		case ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY:
			setInitalIntervalDelay(INITAL_INTERVAL_DELAY_EDEFAULT);
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
		case ModelsPackage.BASE_MODEL__INTERVAL:
			return getInterval() != INTERVAL_EDEFAULT;
		case ModelsPackage.BASE_MODEL__INITAL_INTERVAL_DELAY:
			return getInitalIntervalDelay() != INITAL_INTERVAL_DELAY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // BaseModelImpl
