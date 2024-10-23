/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.palladiosimulator.spd.models.ModelsFactory
 * @model kind="package"
 * @generated
 */
public interface ModelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "models";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Adjustments/Models/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ModelsPackage eINSTANCE = org.palladiosimulator.spd.models.impl.ModelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.BaseModelImpl <em>Base Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.BaseModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getBaseModel()
	 * @generated
	 */
	int BASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL__INITAL_INTERVAL_DELAY = 1;

	/**
	 * The number of structural features of the '<em>Base Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl <em>Learning Based Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.LearningBasedModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getLearningBasedModel()
	 * @generated
	 */
	int LEARNING_BASED_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_BASED_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY = BASE_MODEL__INITAL_INTERVAL_DELAY;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl <em>QThresholds Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.QThresholdsModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getQThresholdsModel()
	 * @generated
	 */
	int QTHRESHOLDS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__INTERVAL = LEARNING_BASED_MODEL__INTERVAL;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__INITAL_INTERVAL_DELAY = LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__LEARNING_RATE = LEARNING_BASED_MODEL__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__INPUT = LEARNING_BASED_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Response Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME = LEARNING_BASED_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Response Time Stimulus</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS = LEARNING_BASED_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exponential Steepness</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS = LEARNING_BASED_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Epsilon</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__EPSILON = LEARNING_BASED_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Discount Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__DISCOUNT_FACTOR = LEARNING_BASED_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allocated Resources Stimulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS = LEARNING_BASED_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Utilization Stimulus</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS = LEARNING_BASED_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Response Time Aggregation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD = LEARNING_BASED_MODEL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>QThresholds Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int QTHRESHOLDS_MODEL_FEATURE_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.RandomModelImpl <em>Random Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.RandomModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getRandomModel()
	 * @generated
	 */
	int RANDOM_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__INTERVAL = BASE_MODEL__INTERVAL;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__INITAL_INTERVAL_DELAY = BASE_MODEL__INITAL_INTERVAL_DELAY;

	/**
	 * The feature id for the '<em><b>Min Adjustment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__MIN_ADJUSTMENT = BASE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Adjustment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__MAX_ADJUSTMENT = BASE_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL__PROBABILITY = BASE_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Random Model</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MODEL_FEATURE_COUNT = BASE_MODEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl <em>Improved QLearning Model</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl
	 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getImprovedQLearningModel()
	 * @generated
	 */
	int IMPROVED_QLEARNING_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__INTERVAL = LEARNING_BASED_MODEL__INTERVAL;

	/**
	 * The feature id for the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__INITAL_INTERVAL_DELAY = LEARNING_BASED_MODEL__INITAL_INTERVAL_DELAY;

	/**
	 * The feature id for the '<em><b>Learning Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__LEARNING_RATE = LEARNING_BASED_MODEL__LEARNING_RATE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__INPUT = LEARNING_BASED_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Epsilon</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__EPSILON = LEARNING_BASED_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Count</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__ACTION_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Response Time</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME = LEARNING_BASED_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Time Stimulus</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS = LEARNING_BASED_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exponential Steepness</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS = LEARNING_BASED_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Utilization Stimulus</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS = LEARNING_BASED_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Discount Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR = LEARNING_BASED_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Response Time Aggregation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD = LEARNING_BASED_MODEL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Improved QLearning Model</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IMPROVED_QLEARNING_MODEL_FEATURE_COUNT = LEARNING_BASED_MODEL_FEATURE_COUNT + 9;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.BaseModel <em>Base Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.BaseModel#getInitalIntervalDelay <em>Inital Interval Delay</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inital Interval Delay</em>'.
	 * @see org.palladiosimulator.spd.models.BaseModel#getInitalIntervalDelay()
	 * @see #getBaseModel()
	 * @generated
	 */
	EAttribute getBaseModel_InitalIntervalDelay();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.QThresholdsModel <em>QThresholds Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>QThresholds Model</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel
	 * @generated
	 */
	EClass getQThresholdsModel();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getInput <em>Input</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getInput()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EReference getQThresholdsModel_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.QThresholdsModel#getTargetResponseTime <em>Target Response Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Response Time</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getTargetResponseTime()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EAttribute getQThresholdsModel_TargetResponseTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.spd.models.QThresholdsModel#getResponseTimeStimulus <em>Response Time Stimulus</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Time Stimulus</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getResponseTimeStimulus()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EReference getQThresholdsModel_ResponseTimeStimulus();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.QThresholdsModel#getExponentialSteepness <em>Exponential Steepness</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponential Steepness</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getExponentialSteepness()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EAttribute getQThresholdsModel_ExponentialSteepness();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.spd.models.QThresholdsModel#getUtilizationStimulus <em>Utilization Stimulus</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Utilization Stimulus</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getUtilizationStimulus()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EReference getQThresholdsModel_UtilizationStimulus();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.QThresholdsModel#getResponseTimeAggregationMethod <em>Response Time Aggregation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time Aggregation Method</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getResponseTimeAggregationMethod()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EAttribute getQThresholdsModel_ResponseTimeAggregationMethod();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.palladiosimulator.spd.models.QThresholdsModel#getEpsilon <em>Epsilon</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Epsilon</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getEpsilon()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EAttribute getQThresholdsModel_Epsilon();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.QThresholdsModel#getDiscountFactor <em>Discount Factor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Factor</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getDiscountFactor()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EAttribute getQThresholdsModel_DiscountFactor();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.spd.models.QThresholdsModel#getAllocatedResourcesStimulus <em>Allocated Resources Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocated Resources Stimulus</em>'.
	 * @see org.palladiosimulator.spd.models.QThresholdsModel#getAllocatedResourcesStimulus()
	 * @see #getQThresholdsModel()
	 * @generated
	 */
	EReference getQThresholdsModel_AllocatedResourcesStimulus();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.RandomModel <em>Random Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Model</em>'.
	 * @see org.palladiosimulator.spd.models.RandomModel
	 * @generated
	 */
	EClass getRandomModel();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.RandomModel#getMinAdjustment <em>Min Adjustment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Adjustment</em>'.
	 * @see org.palladiosimulator.spd.models.RandomModel#getMinAdjustment()
	 * @see #getRandomModel()
	 * @generated
	 */
	EAttribute getRandomModel_MinAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment <em>Max Adjustment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Adjustment</em>'.
	 * @see org.palladiosimulator.spd.models.RandomModel#getMaxAdjustment()
	 * @see #getRandomModel()
	 * @generated
	 */
	EAttribute getRandomModel_MaxAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.RandomModel#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.palladiosimulator.spd.models.RandomModel#getProbability()
	 * @see #getRandomModel()
	 * @generated
	 */
	EAttribute getRandomModel_Probability();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel <em>Improved QLearning Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Improved QLearning Model</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel
	 * @generated
	 */
	EClass getImprovedQLearningModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getInput()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EReference getImprovedQLearningModel_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getEpsilon <em>Epsilon</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epsilon</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getEpsilon()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EAttribute getImprovedQLearningModel_Epsilon();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getActionCount <em>Action Count</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Count</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getActionCount()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EAttribute getImprovedQLearningModel_ActionCount();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getTargetResponseTime <em>Target Response Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Response Time</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getTargetResponseTime()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EAttribute getImprovedQLearningModel_TargetResponseTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getResponseTimeStimulus <em>Response Time Stimulus</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Time Stimulus</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getResponseTimeStimulus()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EReference getImprovedQLearningModel_ResponseTimeStimulus();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getExponentialSteepness <em>Exponential Steepness</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponential Steepness</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getExponentialSteepness()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EAttribute getImprovedQLearningModel_ExponentialSteepness();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getUtilizationStimulus <em>Utilization Stimulus</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Utilization Stimulus</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getUtilizationStimulus()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EReference getImprovedQLearningModel_UtilizationStimulus();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getDiscountFactor <em>Discount Factor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Factor</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getDiscountFactor()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EAttribute getImprovedQLearningModel_DiscountFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.ImprovedQLearningModel#getResponseTimeAggregationMethod <em>Response Time Aggregation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time Aggregation Method</em>'.
	 * @see org.palladiosimulator.spd.models.ImprovedQLearningModel#getResponseTimeAggregationMethod()
	 * @see #getImprovedQLearningModel()
	 * @generated
	 */
	EAttribute getImprovedQLearningModel_ResponseTimeAggregationMethod();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.spd.models.LearningBasedModel <em>Learning Based Model</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Based Model</em>'.
	 * @see org.palladiosimulator.spd.models.LearningBasedModel
	 * @generated
	 */
	EClass getLearningBasedModel();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.spd.models.LearningBasedModel#getLearningRate <em>Learning Rate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Learning Rate</em>'.
	 * @see org.palladiosimulator.spd.models.LearningBasedModel#getLearningRate()
	 * @see #getLearningBasedModel()
	 * @generated
	 */
	EAttribute getLearningBasedModel_LearningRate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.BaseModelImpl <em>Base Model</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		 * The meta object literal for the '<em><b>Inital Interval Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_MODEL__INITAL_INTERVAL_DELAY = eINSTANCE.getBaseModel_InitalIntervalDelay();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.QThresholdsModelImpl <em>QThresholds Model</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.impl.QThresholdsModelImpl
		 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getQThresholdsModel()
		 * @generated
		 */
		EClass QTHRESHOLDS_MODEL = eINSTANCE.getQThresholdsModel();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference QTHRESHOLDS_MODEL__INPUT = eINSTANCE.getQThresholdsModel_Input();

		/**
		 * The meta object literal for the '<em><b>Target Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME = eINSTANCE.getQThresholdsModel_TargetResponseTime();

		/**
		 * The meta object literal for the '<em><b>Response Time Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS = eINSTANCE.getQThresholdsModel_ResponseTimeStimulus();

		/**
		 * The meta object literal for the '<em><b>Exponential Steepness</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS = eINSTANCE.getQThresholdsModel_ExponentialSteepness();

		/**
		 * The meta object literal for the '<em><b>Utilization Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS = eINSTANCE.getQThresholdsModel_UtilizationStimulus();

		/**
		 * The meta object literal for the '<em><b>Response Time Aggregation Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD = eINSTANCE
				.getQThresholdsModel_ResponseTimeAggregationMethod();

		/**
		 * The meta object literal for the '<em><b>Epsilon</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QTHRESHOLDS_MODEL__EPSILON = eINSTANCE.getQThresholdsModel_Epsilon();

		/**
		 * The meta object literal for the '<em><b>Discount Factor</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute QTHRESHOLDS_MODEL__DISCOUNT_FACTOR = eINSTANCE.getQThresholdsModel_DiscountFactor();

		/**
		 * The meta object literal for the '<em><b>Allocated Resources Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS = eINSTANCE
				.getQThresholdsModel_AllocatedResourcesStimulus();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.RandomModelImpl <em>Random Model</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl <em>Improved QLearning Model</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.spd.models.impl.ImprovedQLearningModelImpl
		 * @see org.palladiosimulator.spd.models.impl.ModelsPackageImpl#getImprovedQLearningModel()
		 * @generated
		 */
		EClass IMPROVED_QLEARNING_MODEL = eINSTANCE.getImprovedQLearningModel();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPROVED_QLEARNING_MODEL__INPUT = eINSTANCE.getImprovedQLearningModel_Input();

		/**
		 * The meta object literal for the '<em><b>Epsilon</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IMPROVED_QLEARNING_MODEL__EPSILON = eINSTANCE.getImprovedQLearningModel_Epsilon();

		/**
		 * The meta object literal for the '<em><b>Action Count</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IMPROVED_QLEARNING_MODEL__ACTION_COUNT = eINSTANCE.getImprovedQLearningModel_ActionCount();

		/**
		 * The meta object literal for the '<em><b>Target Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME = eINSTANCE
				.getImprovedQLearningModel_TargetResponseTime();

		/**
		 * The meta object literal for the '<em><b>Response Time Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS = eINSTANCE
				.getImprovedQLearningModel_ResponseTimeStimulus();

		/**
		 * The meta object literal for the '<em><b>Exponential Steepness</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS = eINSTANCE
				.getImprovedQLearningModel_ExponentialSteepness();

		/**
		 * The meta object literal for the '<em><b>Utilization Stimulus</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS = eINSTANCE
				.getImprovedQLearningModel_UtilizationStimulus();

		/**
		 * The meta object literal for the '<em><b>Discount Factor</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR = eINSTANCE.getImprovedQLearningModel_DiscountFactor();

		/**
		 * The meta object literal for the '<em><b>Response Time Aggregation Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD = eINSTANCE
				.getImprovedQLearningModel_ResponseTimeAggregationMethod();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.spd.models.impl.LearningBasedModelImpl <em>Learning Based Model</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

	}

} // ModelsPackage
