/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.models.FuzzyLearningModel;
import org.palladiosimulator.spd.models.InitializationType;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fuzzy Learning
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getWorkloadStimulus
 * <em>Workload Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getResponseTimeStimulus
 * <em>Response Time Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getTargetResponseTime
 * <em>Target Response Time</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getResponseTimeAggregationMethod
 * <em>Response Time Aggregation Method</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getEpsilon
 * <em>Epsilon</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getDiscountFactor
 * <em>Discount Factor</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getInitializationType
 * <em>Initialization Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FuzzyLearningModelImpl extends LearningBasedModelImpl implements FuzzyLearningModel {
    /**
     * The default value of the '{@link #getTargetResponseTime() <em>Target Response Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTargetResponseTime()
     * @generated
     * @ordered
     */
    protected static final double TARGET_RESPONSE_TIME_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getResponseTimeAggregationMethod() <em>Response Time
     * Aggregation Method</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResponseTimeAggregationMethod()
     * @generated
     * @ordered
     */
    protected static final AGGREGATIONMETHOD RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT = AGGREGATIONMETHOD.AVERAGE;

    /**
     * The default value of the '{@link #getEpsilon() <em>Epsilon</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEpsilon()
     * @generated
     * @ordered
     */
    protected static final double EPSILON_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getDiscountFactor() <em>Discount Factor</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDiscountFactor()
     * @generated
     * @ordered
     */
    protected static final double DISCOUNT_FACTOR_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getInitializationType() <em>Initialization Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInitializationType()
     * @generated
     * @ordered
     */
    protected static final InitializationType INITIALIZATION_TYPE_EDEFAULT = InitializationType.OPTIMISTIC;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FuzzyLearningModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.FUZZY_LEARNING_MODEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getWorkloadStimulus() {
        return (Stimulus) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetWorkloadStimulus(final Stimulus newWorkloadStimulus, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newWorkloadStimulus,
                ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWorkloadStimulus(final Stimulus newWorkloadStimulus) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS, newWorkloadStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OperationResponseTime getResponseTimeStimulus() {
        return (OperationResponseTime) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetResponseTimeStimulus(final OperationResponseTime newResponseTimeStimulus,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newResponseTimeStimulus,
                ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResponseTimeStimulus(final OperationResponseTime newResponseTimeStimulus) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS, newResponseTimeStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getTargetResponseTime() {
        return (Double) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTargetResponseTime(final double newTargetResponseTime) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME, newTargetResponseTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AGGREGATIONMETHOD getResponseTimeAggregationMethod() {
        return (AGGREGATIONMETHOD) this.eDynamicGet(
                ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResponseTimeAggregationMethod(final AGGREGATIONMETHOD newResponseTimeAggregationMethod) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD,
                newResponseTimeAggregationMethod);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getEpsilon() {
        return (Double) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__EPSILON, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEpsilon(final double newEpsilon) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__EPSILON, newEpsilon);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getDiscountFactor() {
        return (Double) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDiscountFactor(final double newDiscountFactor) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR, newDiscountFactor);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InitializationType getInitializationType() {
        return (InitializationType) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInitializationType(final InitializationType newInitializationType) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE, newInitializationType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            return this.basicSetWorkloadStimulus(null, msgs);
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            return this.basicSetResponseTimeStimulus(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            return this.getWorkloadStimulus();
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            return this.getResponseTimeStimulus();
        case ModelsPackage.FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME:
            return this.getTargetResponseTime();
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
            return this.getResponseTimeAggregationMethod();
        case ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON:
            return this.getEpsilon();
        case ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR:
            return this.getDiscountFactor();
        case ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE:
            return this.getInitializationType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            this.setWorkloadStimulus((Stimulus) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            this.setResponseTimeStimulus((OperationResponseTime) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME:
            this.setTargetResponseTime((Double) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
            this.setResponseTimeAggregationMethod((AGGREGATIONMETHOD) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON:
            this.setEpsilon((Double) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR:
            this.setDiscountFactor((Double) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE:
            this.setInitializationType((InitializationType) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            this.setWorkloadStimulus((Stimulus) null);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            this.setResponseTimeStimulus((OperationResponseTime) null);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME:
            this.setTargetResponseTime(TARGET_RESPONSE_TIME_EDEFAULT);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
            this.setResponseTimeAggregationMethod(RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON:
            this.setEpsilon(EPSILON_EDEFAULT);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR:
            this.setDiscountFactor(DISCOUNT_FACTOR_EDEFAULT);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE:
            this.setInitializationType(INITIALIZATION_TYPE_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            return this.getWorkloadStimulus() != null;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS:
            return this.getResponseTimeStimulus() != null;
        case ModelsPackage.FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME:
            return this.getTargetResponseTime() != TARGET_RESPONSE_TIME_EDEFAULT;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD:
            return this.getResponseTimeAggregationMethod() != RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT;
        case ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON:
            return this.getEpsilon() != EPSILON_EDEFAULT;
        case ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR:
            return this.getDiscountFactor() != DISCOUNT_FACTOR_EDEFAULT;
        case ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE:
            return this.getInitializationType() != INITIALIZATION_TYPE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // FuzzyLearningModelImpl
