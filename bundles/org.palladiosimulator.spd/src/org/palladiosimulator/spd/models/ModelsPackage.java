/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.models.ModelsFactory
 * @model kind="package"
 * @generated
 */
public interface ModelsPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "models";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Adjustments/Models/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "models";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ModelsPackage eINSTANCE = org.palladiosimulator.spd.models.impl.ModelsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.BaseModelImpl
     * <em>Base Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.BaseModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getBaseModel()
     * @generated
     */
    int BASE_MODEL = 0;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL__INTERVAL = 0;

    /**
     * The feature id for the '<em><b>Interval Offset</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL__INTERVAL_OFFSET = 1;

    /**
     * The number of structural features of the '<em>Base Model</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_MODEL_FEATURE_COUNT = 2;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl <em>Learning Based
     * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.LearningBasedModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getLearningBasedModel()
     * @generated
     */
    int LEARNING_BASED_MODEL = 3;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl <em>Fuzzy Learning
     * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getFuzzyLearningModel()
     * @generated
     */
    int FUZZY_LEARNING_MODEL = 4;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.models.impl.FuzzyQLearningModelImpl <em>Fuzzy QLearning
     * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.FuzzyQLearningModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getFuzzyQLearningModel()
     * @generated
     */
    int FUZZY_QLEARNING_MODEL = 2;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.FuzzySARSAModelImpl
     * <em>Fuzzy SARSA Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.FuzzySARSAModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getFuzzySARSAModel()
     * @generated
     */
    int FUZZY_SARSA_MODEL = 5;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.RandomModelImpl
     * <em>Random Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.impl.RandomModelImpl
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getRandomModel()
     * @generated
     */
    int RANDOM_MODEL = 1;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Interval Offset</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__INTERVAL_OFFSET = BASE_MODEL__INTERVAL_OFFSET;

    /**
     * The feature id for the '<em><b>Min Adjustment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__MIN_ADJUSTMENT = BASE_MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Adjustment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__MAX_ADJUSTMENT = BASE_MODEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL__PROBABILITY = BASE_MODEL_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Random Model</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RANDOM_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEARNING_BASED_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Interval Offset</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEARNING_BASED_MODEL__INTERVAL_OFFSET = BASE_MODEL__INTERVAL_OFFSET;

    /**
     * The feature id for the '<em><b>Learning Rate</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEARNING_BASED_MODEL__LEARNING_RATE = BASE_MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Learning Based Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int LEARNING_BASED_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__INTERVAL = LEARNING_BASED_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Interval Offset</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__INTERVAL_OFFSET = LEARNING_BASED_MODEL__INTERVAL_OFFSET;

    /**
     * The feature id for the '<em><b>Learning Rate</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__LEARNING_RATE = LEARNING_BASED_MODEL__LEARNING_RATE;

    /**
     * The feature id for the '<em><b>Workload Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS = LEARNING_BASED_MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Response Time Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS = LEARNING_BASED_MODEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Target Response Time</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME = LEARNING_BASED_MODEL_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Response Time Aggregation Method</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD = LEARNING_BASED_MODEL_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Epsilon</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__EPSILON = LEARNING_BASED_MODEL_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Discount Factor</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR = LEARNING_BASED_MODEL_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Initialization Type</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE = LEARNING_BASED_MODEL_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Fuzzy Learning Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_LEARNING_MODEL_FEATURE_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__INTERVAL = FUZZY_LEARNING_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Interval Offset</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__INTERVAL_OFFSET = FUZZY_LEARNING_MODEL__INTERVAL_OFFSET;

    /**
     * The feature id for the '<em><b>Learning Rate</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__LEARNING_RATE = FUZZY_LEARNING_MODEL__LEARNING_RATE;

    /**
     * The feature id for the '<em><b>Workload Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__WORKLOAD_STIMULUS = FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS;

    /**
     * The feature id for the '<em><b>Response Time Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS = FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS;

    /**
     * The feature id for the '<em><b>Target Response Time</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__TARGET_RESPONSE_TIME = FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME;

    /**
     * The feature id for the '<em><b>Response Time Aggregation Method</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD = FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD;

    /**
     * The feature id for the '<em><b>Epsilon</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__EPSILON = FUZZY_LEARNING_MODEL__EPSILON;

    /**
     * The feature id for the '<em><b>Discount Factor</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__DISCOUNT_FACTOR = FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR;

    /**
     * The feature id for the '<em><b>Initialization Type</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL__INITIALIZATION_TYPE = FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE;

    /**
     * The number of structural features of the '<em>Fuzzy QLearning Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_QLEARNING_MODEL_FEATURE_COUNT = FUZZY_LEARNING_MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__INTERVAL = FUZZY_LEARNING_MODEL__INTERVAL;

    /**
     * The feature id for the '<em><b>Interval Offset</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__INTERVAL_OFFSET = FUZZY_LEARNING_MODEL__INTERVAL_OFFSET;

    /**
     * The feature id for the '<em><b>Learning Rate</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__LEARNING_RATE = FUZZY_LEARNING_MODEL__LEARNING_RATE;

    /**
     * The feature id for the '<em><b>Workload Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__WORKLOAD_STIMULUS = FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS;

    /**
     * The feature id for the '<em><b>Response Time Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__RESPONSE_TIME_STIMULUS = FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS;

    /**
     * The feature id for the '<em><b>Target Response Time</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__TARGET_RESPONSE_TIME = FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME;

    /**
     * The feature id for the '<em><b>Response Time Aggregation Method</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__RESPONSE_TIME_AGGREGATION_METHOD = FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD;

    /**
     * The feature id for the '<em><b>Epsilon</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__EPSILON = FUZZY_LEARNING_MODEL__EPSILON;

    /**
     * The feature id for the '<em><b>Discount Factor</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__DISCOUNT_FACTOR = FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR;

    /**
     * The feature id for the '<em><b>Initialization Type</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL__INITIALIZATION_TYPE = FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE;

    /**
     * The number of structural features of the '<em>Fuzzy SARSA Model</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FUZZY_SARSA_MODEL_FEATURE_COUNT = FUZZY_LEARNING_MODEL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.models.InitializationType
     * <em>Initialization Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.models.InitializationType
     * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getInitializationType()
     * @generated
     */
    int INITIALIZATION_TYPE = 6;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.BaseModel <em>Base
     * Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Base Model</em>'.
     * @see org.palladiosimulator.spd.models.BaseModel
     * @generated
     */
    EClass getBaseModel();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.BaseModel#getInterval <em>Interval</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Interval</em>'.
     * @see org.palladiosimulator.spd.models.BaseModel#getInterval()
     * @see #getBaseModel()
     * @generated
     */
    EAttribute getBaseModel_Interval();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.BaseModel#getIntervalOffset <em>Interval
     * Offset</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Interval Offset</em>'.
     * @see org.palladiosimulator.spd.models.BaseModel#getIntervalOffset()
     * @see #getBaseModel()
     * @generated
     */
    EAttribute getBaseModel_IntervalOffset();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.RandomModel
     * <em>Random Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Random Model</em>'.
     * @see org.palladiosimulator.spd.models.RandomModel
     * @generated
     */
    EClass getRandomModel();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.RandomModel#getMinAdjustment <em>Min
     * Adjustment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Min Adjustment</em>'.
     * @see org.palladiosimulator.spd.models.RandomModel#getMinAdjustment()
     * @see #getRandomModel()
     * @generated
     */
    EAttribute getRandomModel_MinAdjustment();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment <em>Max
     * Adjustment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Max Adjustment</em>'.
     * @see org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment()
     * @see #getRandomModel()
     * @generated
     */
    EAttribute getRandomModel_MaxAdjustment();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.RandomModel#getProbability <em>Probability</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Probability</em>'.
     * @see org.palladiosimulator.spd.models.RandomModel#getProbability()
     * @see #getRandomModel()
     * @generated
     */
    EAttribute getRandomModel_Probability();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.models.FuzzyQLearningModel <em>Fuzzy QLearning
     * Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Fuzzy QLearning Model</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyQLearningModel
     * @generated
     */
    EClass getFuzzyQLearningModel();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.LearningBasedModel
     * <em>Learning Based Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Learning Based Model</em>'.
     * @see org.palladiosimulator.spd.models.LearningBasedModel
     * @generated
     */
    EClass getLearningBasedModel();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.LearningBasedModel#getLearningRate <em>Learning
     * Rate</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Learning Rate</em>'.
     * @see org.palladiosimulator.spd.models.LearningBasedModel#getLearningRate()
     * @see #getLearningBasedModel()
     * @generated
     */
    EAttribute getLearningBasedModel_LearningRate();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.FuzzyLearningModel
     * <em>Fuzzy Learning Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Fuzzy Learning Model</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel
     * @generated
     */
    EClass getFuzzyLearningModel();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getWorkloadStimulus <em>Workload
     * Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Workload Stimulus</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel#getWorkloadStimulus()
     * @see #getFuzzyLearningModel()
     * @generated
     */
    EReference getFuzzyLearningModel_WorkloadStimulus();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getResponseTimeStimulus
     * <em>Response Time Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Response Time Stimulus</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel#getResponseTimeStimulus()
     * @see #getFuzzyLearningModel()
     * @generated
     */
    EReference getFuzzyLearningModel_ResponseTimeStimulus();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getTargetResponseTime <em>Target
     * Response Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Target Response Time</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel#getTargetResponseTime()
     * @see #getFuzzyLearningModel()
     * @generated
     */
    EAttribute getFuzzyLearningModel_TargetResponseTime();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getResponseTimeAggregationMethod
     * <em>Response Time Aggregation Method</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Response Time Aggregation Method</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel#getResponseTimeAggregationMethod()
     * @see #getFuzzyLearningModel()
     * @generated
     */
    EAttribute getFuzzyLearningModel_ResponseTimeAggregationMethod();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getEpsilon <em>Epsilon</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Epsilon</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel#getEpsilon()
     * @see #getFuzzyLearningModel()
     * @generated
     */
    EAttribute getFuzzyLearningModel_Epsilon();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getDiscountFactor <em>Discount
     * Factor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Discount Factor</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel#getDiscountFactor()
     * @see #getFuzzyLearningModel()
     * @generated
     */
    EAttribute getFuzzyLearningModel_DiscountFactor();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel#getInitializationType
     * <em>Initialization Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Initialization Type</em>'.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel#getInitializationType()
     * @see #getFuzzyLearningModel()
     * @generated
     */
    EAttribute getFuzzyLearningModel_InitializationType();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.models.FuzzySARSAModel
     * <em>Fuzzy SARSA Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Fuzzy SARSA Model</em>'.
     * @see org.palladiosimulator.spd.models.FuzzySARSAModel
     * @generated
     */
    EClass getFuzzySARSAModel();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.spd.models.InitializationType
     * <em>Initialization Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Initialization Type</em>'.
     * @see org.palladiosimulator.spd.models.InitializationType
     * @generated
     */
    EEnum getInitializationType();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelsFactory getModelsFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.BaseModelImpl <em>Base Model</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.BaseModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getBaseModel()
         * @generated
         */
        EClass BASE_MODEL = eINSTANCE.getBaseModel();

        /**
         * The meta object literal for the '<em><b>Interval</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BASE_MODEL__INTERVAL = eINSTANCE.getBaseModel_Interval();

        /**
         * The meta object literal for the '<em><b>Interval Offset</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute BASE_MODEL__INTERVAL_OFFSET = eINSTANCE.getBaseModel_IntervalOffset();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.RandomModelImpl <em>Random Model</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.RandomModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getRandomModel()
         * @generated
         */
        EClass RANDOM_MODEL = eINSTANCE.getRandomModel();

        /**
         * The meta object literal for the '<em><b>Min Adjustment</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_MODEL__MIN_ADJUSTMENT = eINSTANCE.getRandomModel_MinAdjustment();

        /**
         * The meta object literal for the '<em><b>Max Adjustment</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_MODEL__MAX_ADJUSTMENT = eINSTANCE.getRandomModel_MaxAdjustment();

        /**
         * The meta object literal for the '<em><b>Probability</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RANDOM_MODEL__PROBABILITY = eINSTANCE.getRandomModel_Probability();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.FuzzyQLearningModelImpl <em>Fuzzy QLearning
         * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.FuzzyQLearningModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getFuzzyQLearningModel()
         * @generated
         */
        EClass FUZZY_QLEARNING_MODEL = eINSTANCE.getFuzzyQLearningModel();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl <em>Learning Based
         * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.LearningBasedModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getLearningBasedModel()
         * @generated
         */
        EClass LEARNING_BASED_MODEL = eINSTANCE.getLearningBasedModel();

        /**
         * The meta object literal for the '<em><b>Learning Rate</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute LEARNING_BASED_MODEL__LEARNING_RATE = eINSTANCE.getLearningBasedModel_LearningRate();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl <em>Fuzzy Learning
         * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getFuzzyLearningModel()
         * @generated
         */
        EClass FUZZY_LEARNING_MODEL = eINSTANCE.getFuzzyLearningModel();

        /**
         * The meta object literal for the '<em><b>Workload Stimulus</b></em>' containment reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS = eINSTANCE.getFuzzyLearningModel_WorkloadStimulus();

        /**
         * The meta object literal for the '<em><b>Response Time Stimulus</b></em>' containment
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS = eINSTANCE
            .getFuzzyLearningModel_ResponseTimeStimulus();

        /**
         * The meta object literal for the '<em><b>Target Response Time</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME = eINSTANCE.getFuzzyLearningModel_TargetResponseTime();

        /**
         * The meta object literal for the '<em><b>Response Time Aggregation Method</b></em>'
         * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD = eINSTANCE
            .getFuzzyLearningModel_ResponseTimeAggregationMethod();

        /**
         * The meta object literal for the '<em><b>Epsilon</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FUZZY_LEARNING_MODEL__EPSILON = eINSTANCE.getFuzzyLearningModel_Epsilon();

        /**
         * The meta object literal for the '<em><b>Discount Factor</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR = eINSTANCE.getFuzzyLearningModel_DiscountFactor();

        /**
         * The meta object literal for the '<em><b>Initialization Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE = eINSTANCE.getFuzzyLearningModel_InitializationType();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.impl.FuzzySARSAModelImpl <em>Fuzzy SARSA
         * Model</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.impl.FuzzySARSAModelImpl
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getFuzzySARSAModel()
         * @generated
         */
        EClass FUZZY_SARSA_MODEL = eINSTANCE.getFuzzySARSAModel();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.models.InitializationType <em>Initialization
         * Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.models.InitializationType
         * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getInitializationType()
         * @generated
         */
        EEnum INITIALIZATION_TYPE = eINSTANCE.getInitializationType();

    }

} // ModelsPackage
