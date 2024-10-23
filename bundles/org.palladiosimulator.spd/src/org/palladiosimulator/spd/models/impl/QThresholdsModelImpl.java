/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.NumberOfElements;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>QThresholds
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getTargetResponseTime <em>Target Response Time</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getResponseTimeStimulus <em>Response Time Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getExponentialSteepness <em>Exponential Steepness</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getDiscountFactor <em>Discount Factor</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getAllocatedResourcesStimulus <em>Allocated Resources Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getUtilizationStimulus <em>Utilization Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl#getResponseTimeAggregationMethod <em>Response Time Aggregation Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QThresholdsModelImpl extends LearningBasedModelImpl implements QThresholdsModel {
	/**
	 * The default value of the '{@link #getTargetResponseTime() <em>Target Response Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTargetResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_RESPONSE_TIME_EDEFAULT = 1.0;
	/**
	 * The default value of the '{@link #getExponentialSteepness() <em>Exponential Steepness</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExponentialSteepness()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPONENTIAL_STEEPNESS_EDEFAULT = 2.0;

	/**
	 * The default value of the '{@link #getEpsilon() <em>Epsilon</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEpsilon()
	 * @generated
	 * @ordered
	 */
	protected static final double EPSILON_EDEFAULT = 0.05;

	/**
	 * The default value of the '{@link #getDiscountFactor() <em>Discount Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDiscountFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOUNT_FACTOR_EDEFAULT = 0.5;

	/**
	 * The default value of the '{@link #getResponseTimeAggregationMethod() <em>Response Time Aggregation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTimeAggregationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final AGGREGATIONMETHOD RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT = AGGREGATIONMETHOD.PERCENTILE95;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected QThresholdsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.QTHRESHOLDS_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stimulus getInput() {
		return (Stimulus) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__INPUT,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Stimulus newInput, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newInput, ModelsPackage.QTHRESHOLDS_MODEL__INPUT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(Stimulus newInput) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__INPUT, ModelsPackage.Literals.QTHRESHOLDS_MODEL__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTargetResponseTime() {
		return (Double) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetResponseTime(double newTargetResponseTime) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME, newTargetResponseTime);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationResponseTime getResponseTimeStimulus() {
		return (OperationResponseTime) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseTimeStimulus(OperationResponseTime newResponseTimeStimulus,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newResponseTimeStimulus,
				ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseTimeStimulus(OperationResponseTime newResponseTimeStimulus) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS, newResponseTimeStimulus);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExponentialSteepness() {
		return (Double) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponentialSteepness(double newExponentialSteepness) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS, newExponentialSteepness);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stimulus getUtilizationStimulus() {
		return (Stimulus) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtilizationStimulus(Stimulus newUtilizationStimulus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newUtilizationStimulus,
				ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtilizationStimulus(Stimulus newUtilizationStimulus) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS, newUtilizationStimulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AGGREGATIONMETHOD getResponseTimeAggregationMethod() {
		return (AGGREGATIONMETHOD) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseTimeAggregationMethod(AGGREGATIONMETHOD newResponseTimeAggregationMethod) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
				newResponseTimeAggregationMethod);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEpsilon() {
		return (Double) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__EPSILON,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__EPSILON, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEpsilon(double newEpsilon) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__EPSILON, ModelsPackage.Literals.QTHRESHOLDS_MODEL__EPSILON,
				newEpsilon);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiscountFactor() {
		return (Double) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__DISCOUNT_FACTOR,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__DISCOUNT_FACTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscountFactor(double newDiscountFactor) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__DISCOUNT_FACTOR,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__DISCOUNT_FACTOR, newDiscountFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberOfElements getAllocatedResourcesStimulus() {
		return (NumberOfElements) eDynamicGet(ModelsPackage.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedResourcesStimulus(NumberOfElements newAllocatedResourcesStimulus,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newAllocatedResourcesStimulus,
				ModelsPackage.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocatedResourcesStimulus(NumberOfElements newAllocatedResourcesStimulus) {
		eDynamicSet(ModelsPackage.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS,
				ModelsPackage.Literals.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS, newAllocatedResourcesStimulus);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
			return basicSetInput(null, msgs);
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
			return basicSetResponseTimeStimulus(null, msgs);
		case ModelsPackage.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS:
			return basicSetAllocatedResourcesStimulus(null, msgs);
		case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
			return basicSetUtilizationStimulus(null, msgs);
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
		case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
			return getInput();
		case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
			return getTargetResponseTime();
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
			return getResponseTimeStimulus();
		case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
			return getExponentialSteepness();
		case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
			return getEpsilon();
		case ModelsPackage.QTHRESHOLDS_MODEL__DISCOUNT_FACTOR:
			return getDiscountFactor();
		case ModelsPackage.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS:
			return getAllocatedResourcesStimulus();
		case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
			return getUtilizationStimulus();
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
			return getResponseTimeAggregationMethod();
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
		case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
			setInput((Stimulus) newValue);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
			setTargetResponseTime((Double) newValue);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
			setResponseTimeStimulus((OperationResponseTime) newValue);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
			setExponentialSteepness((Double) newValue);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
			setEpsilon((Double) newValue);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__DISCOUNT_FACTOR:
			setDiscountFactor((Double) newValue);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS:
			setAllocatedResourcesStimulus((NumberOfElements) newValue);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
			setUtilizationStimulus((Stimulus) newValue);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
			setResponseTimeAggregationMethod((AGGREGATIONMETHOD) newValue);
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
		case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
			setInput((Stimulus) null);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
			setTargetResponseTime(TARGET_RESPONSE_TIME_EDEFAULT);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
			setResponseTimeStimulus((OperationResponseTime) null);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
			setExponentialSteepness(EXPONENTIAL_STEEPNESS_EDEFAULT);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
			setEpsilon(EPSILON_EDEFAULT);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__DISCOUNT_FACTOR:
			setDiscountFactor(DISCOUNT_FACTOR_EDEFAULT);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS:
			setAllocatedResourcesStimulus((NumberOfElements) null);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
			setUtilizationStimulus((Stimulus) null);
			return;
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
			setResponseTimeAggregationMethod(RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT);
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
		case ModelsPackage.QTHRESHOLDS_MODEL__INPUT:
			return getInput() != null;
		case ModelsPackage.QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME:
			return getTargetResponseTime() != TARGET_RESPONSE_TIME_EDEFAULT;
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS:
			return getResponseTimeStimulus() != null;
		case ModelsPackage.QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS:
			return getExponentialSteepness() != EXPONENTIAL_STEEPNESS_EDEFAULT;
		case ModelsPackage.QTHRESHOLDS_MODEL__EPSILON:
			return getEpsilon() != EPSILON_EDEFAULT;
		case ModelsPackage.QTHRESHOLDS_MODEL__DISCOUNT_FACTOR:
			return getDiscountFactor() != DISCOUNT_FACTOR_EDEFAULT;
		case ModelsPackage.QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS:
			return getAllocatedResourcesStimulus() != null;
		case ModelsPackage.QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS:
			return getUtilizationStimulus() != null;
		case ModelsPackage.QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
			return getResponseTimeAggregationMethod() != RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // QThresholdsModelImpl
