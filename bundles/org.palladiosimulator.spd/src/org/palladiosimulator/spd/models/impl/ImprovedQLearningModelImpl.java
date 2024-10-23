/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Improved QLearning
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getActionCount <em>Action Count</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getTargetResponseTime <em>Target Response Time</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getResponseTimeStimulus <em>Response Time Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getExponentialSteepness <em>Exponential Steepness</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getUtilizationStimulus <em>Utilization Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getDiscountFactor <em>Discount Factor</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl#getResponseTimeAggregationMethod <em>Response Time Aggregation Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImprovedQLearningModelImpl extends LearningBasedModelImpl implements ImprovedQLearningModel {
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
	 * The default value of the '{@link #getActionCount() <em>Action Count</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getActionCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTION_COUNT_EDEFAULT = 5;
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
	protected ImprovedQLearningModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stimulus getInput() {
		return (Stimulus) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Stimulus newInput, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newInput, ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(Stimulus newInput) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEpsilon() {
		return (Double) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EPSILON, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEpsilon(double newEpsilon) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EPSILON, newEpsilon);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getActionCount() {
		return (Integer) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__ACTION_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionCount(int newActionCount) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__ACTION_COUNT, newActionCount);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTargetResponseTime() {
		return (Double) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetResponseTime(double newTargetResponseTime) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME, newTargetResponseTime);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationResponseTime getResponseTimeStimulus() {
		return (OperationResponseTime) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseTimeStimulus(OperationResponseTime newResponseTimeStimulus,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newResponseTimeStimulus,
				ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseTimeStimulus(OperationResponseTime newResponseTimeStimulus) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS, newResponseTimeStimulus);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExponentialSteepness() {
		return (Double) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponentialSteepness(double newExponentialSteepness) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS, newExponentialSteepness);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stimulus getUtilizationStimulus() {
		return (Stimulus) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtilizationStimulus(Stimulus newUtilizationStimulus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newUtilizationStimulus,
				ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtilizationStimulus(Stimulus newUtilizationStimulus) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS, newUtilizationStimulus);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiscountFactor() {
		return (Double) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscountFactor(double newDiscountFactor) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR, newDiscountFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AGGREGATIONMETHOD getResponseTimeAggregationMethod() {
		return (AGGREGATIONMETHOD) eDynamicGet(ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseTimeAggregationMethod(AGGREGATIONMETHOD newResponseTimeAggregationMethod) {
		eDynamicSet(ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
				ModelsPackage.Literals.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
				newResponseTimeAggregationMethod);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
			return basicSetInput(null, msgs);
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
			return basicSetResponseTimeStimulus(null, msgs);
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
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
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
			return getInput();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
			return getEpsilon();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
			return getActionCount();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME:
			return getTargetResponseTime();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
			return getResponseTimeStimulus();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS:
			return getExponentialSteepness();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
			return getUtilizationStimulus();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR:
			return getDiscountFactor();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
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
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
			setInput((Stimulus) newValue);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
			setEpsilon((Double) newValue);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
			setActionCount((Integer) newValue);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME:
			setTargetResponseTime((Double) newValue);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
			setResponseTimeStimulus((OperationResponseTime) newValue);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS:
			setExponentialSteepness((Double) newValue);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
			setUtilizationStimulus((Stimulus) newValue);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR:
			setDiscountFactor((Double) newValue);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
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
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
			setInput((Stimulus) null);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
			setEpsilon(EPSILON_EDEFAULT);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
			setActionCount(ACTION_COUNT_EDEFAULT);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME:
			setTargetResponseTime(TARGET_RESPONSE_TIME_EDEFAULT);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
			setResponseTimeStimulus((OperationResponseTime) null);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS:
			setExponentialSteepness(EXPONENTIAL_STEEPNESS_EDEFAULT);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
			setUtilizationStimulus((Stimulus) null);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR:
			setDiscountFactor(DISCOUNT_FACTOR_EDEFAULT);
			return;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
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
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__INPUT:
			return getInput() != null;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__EPSILON:
			return getEpsilon() != EPSILON_EDEFAULT;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__ACTION_COUNT:
			return getActionCount() != ACTION_COUNT_EDEFAULT;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME:
			return getTargetResponseTime() != TARGET_RESPONSE_TIME_EDEFAULT;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS:
			return getResponseTimeStimulus() != null;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS:
			return getExponentialSteepness() != EXPONENTIAL_STEEPNESS_EDEFAULT;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS:
			return getUtilizationStimulus() != null;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR:
			return getDiscountFactor() != DISCOUNT_FACTOR_EDEFAULT;
		case ModelsPackage.IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
			return getResponseTimeAggregationMethod() != RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // ImprovedQLearningModelImpl
