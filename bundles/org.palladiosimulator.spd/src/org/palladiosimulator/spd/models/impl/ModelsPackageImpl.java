/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl;
import org.palladiosimulator.spd.constraints.ConstraintsPackage;
import org.palladiosimulator.spd.constraints.impl.ConstraintsPackageImpl;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;
import org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl;
import org.palladiosimulator.spd.constraints.target.TargetPackage;
import org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl;
import org.palladiosimulator.spd.datatypes.DatatypesPackage;
import org.palladiosimulator.spd.datatypes.impl.DatatypesPackageImpl;
import org.palladiosimulator.spd.impl.SpdPackageImpl;
import org.palladiosimulator.spd.models.BaseModel;
import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsFactory;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.models.RandomModel;
import org.palladiosimulator.spd.targets.TargetsPackage;
import org.palladiosimulator.spd.targets.impl.TargetsPackageImpl;
import org.palladiosimulator.spd.triggers.TriggersPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl;
import org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ModelsPackageImpl extends EPackageImpl implements ModelsPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qThresholdsModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass improvedQLearningModelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningBasedModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.spd.models.ModelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelsPackageImpl() {
		super(eNS_URI, ModelsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelsPackage init() {
		if (isInited) {
			return (ModelsPackage) EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredModelsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelsPackageImpl theModelsPackage = registeredModelsPackage instanceof ModelsPackageImpl
				? (ModelsPackageImpl) registeredModelsPackage
				: new ModelsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);
		SpdPackageImpl theSpdPackage = (SpdPackageImpl) (registeredPackage instanceof SpdPackageImpl ? registeredPackage
				: SpdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl) (registeredPackage instanceof TargetsPackageImpl
				? registeredPackage
				: TargetsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
		AdjustmentsPackageImpl theAdjustmentsPackage = (AdjustmentsPackageImpl) (registeredPackage instanceof AdjustmentsPackageImpl
				? registeredPackage
				: AdjustmentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl) (registeredPackage instanceof ConstraintsPackageImpl
				? registeredPackage
				: ConstraintsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
				? registeredPackage
				: PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
		TargetPackageImpl theTargetPackage = (TargetPackageImpl) (registeredPackage instanceof TargetPackageImpl
				? registeredPackage
				: TargetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl) (registeredPackage instanceof TriggersPackageImpl
				? registeredPackage
				: TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI);
		StimuliPackageImpl theStimuliPackage = (StimuliPackageImpl) (registeredPackage instanceof StimuliPackageImpl
				? registeredPackage
				: StimuliPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpectationsPackage.eNS_URI);
		ExpectationsPackageImpl theExpectationsPackage = (ExpectationsPackageImpl) (registeredPackage instanceof ExpectationsPackageImpl
				? registeredPackage
				: ExpectationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (registeredPackage instanceof DatatypesPackageImpl
				? registeredPackage
				: DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelsPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		theAdjustmentsPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theTargetPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theStimuliPackage.createPackageContents();
		theExpectationsPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelsPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		theAdjustmentsPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theTargetPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theStimuliPackage.initializePackageContents();
		theExpectationsPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelsPackage.eNS_URI, theModelsPackage);
		return theModelsPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseModel() {
		return baseModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseModel_Interval() {
		return (EAttribute) baseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseModel_InitalIntervalDelay() {
		return (EAttribute) baseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQThresholdsModel() {
		return qThresholdsModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQThresholdsModel_Input() {
		return (EReference) qThresholdsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQThresholdsModel_TargetResponseTime() {
		return (EAttribute) qThresholdsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQThresholdsModel_ResponseTimeStimulus() {
		return (EReference) qThresholdsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQThresholdsModel_ExponentialSteepness() {
		return (EAttribute) qThresholdsModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQThresholdsModel_UtilizationStimulus() {
		return (EReference) qThresholdsModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQThresholdsModel_ResponseTimeAggregationMethod() {
		return (EAttribute) qThresholdsModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQThresholdsModel_Epsilon() {
		return (EAttribute) qThresholdsModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQThresholdsModel_DiscountFactor() {
		return (EAttribute) qThresholdsModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQThresholdsModel_AllocatedResourcesStimulus() {
		return (EReference) qThresholdsModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRandomModel() {
		return randomModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomModel_MinAdjustment() {
		return (EAttribute) randomModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomModel_MaxAdjustment() {
		return (EAttribute) randomModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomModel_Probability() {
		return (EAttribute) randomModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImprovedQLearningModel() {
		return improvedQLearningModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImprovedQLearningModel_Input() {
		return (EReference) improvedQLearningModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImprovedQLearningModel_Epsilon() {
		return (EAttribute) improvedQLearningModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImprovedQLearningModel_ActionCount() {
		return (EAttribute) improvedQLearningModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImprovedQLearningModel_TargetResponseTime() {
		return (EAttribute) improvedQLearningModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImprovedQLearningModel_ResponseTimeStimulus() {
		return (EReference) improvedQLearningModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImprovedQLearningModel_ExponentialSteepness() {
		return (EAttribute) improvedQLearningModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImprovedQLearningModel_UtilizationStimulus() {
		return (EReference) improvedQLearningModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImprovedQLearningModel_DiscountFactor() {
		return (EAttribute) improvedQLearningModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImprovedQLearningModel_ResponseTimeAggregationMethod() {
		return (EAttribute) improvedQLearningModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLearningBasedModel() {
		return learningBasedModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLearningBasedModel_LearningRate() {
		return (EAttribute) learningBasedModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelsFactory getModelsFactory() {
		return (ModelsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		baseModelEClass = createEClass(BASE_MODEL);
		createEAttribute(baseModelEClass, BASE_MODEL__INTERVAL);
		createEAttribute(baseModelEClass, BASE_MODEL__INITAL_INTERVAL_DELAY);

		qThresholdsModelEClass = createEClass(QTHRESHOLDS_MODEL);
		createEReference(qThresholdsModelEClass, QTHRESHOLDS_MODEL__INPUT);
		createEAttribute(qThresholdsModelEClass, QTHRESHOLDS_MODEL__TARGET_RESPONSE_TIME);
		createEReference(qThresholdsModelEClass, QTHRESHOLDS_MODEL__RESPONSE_TIME_STIMULUS);
		createEAttribute(qThresholdsModelEClass, QTHRESHOLDS_MODEL__EXPONENTIAL_STEEPNESS);
		createEAttribute(qThresholdsModelEClass, QTHRESHOLDS_MODEL__EPSILON);
		createEAttribute(qThresholdsModelEClass, QTHRESHOLDS_MODEL__DISCOUNT_FACTOR);
		createEReference(qThresholdsModelEClass, QTHRESHOLDS_MODEL__ALLOCATED_RESOURCES_STIMULUS);
		createEReference(qThresholdsModelEClass, QTHRESHOLDS_MODEL__UTILIZATION_STIMULUS);
		createEAttribute(qThresholdsModelEClass, QTHRESHOLDS_MODEL__RESPONSE_TIME_AGGREGATION_METHOD);

		randomModelEClass = createEClass(RANDOM_MODEL);
		createEAttribute(randomModelEClass, RANDOM_MODEL__MIN_ADJUSTMENT);
		createEAttribute(randomModelEClass, RANDOM_MODEL__MAX_ADJUSTMENT);
		createEAttribute(randomModelEClass, RANDOM_MODEL__PROBABILITY);

		improvedQLearningModelEClass = createEClass(IMPROVED_QLEARNING_MODEL);
		createEReference(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__INPUT);
		createEAttribute(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__EPSILON);
		createEAttribute(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__ACTION_COUNT);
		createEAttribute(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__TARGET_RESPONSE_TIME);
		createEReference(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_STIMULUS);
		createEAttribute(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__EXPONENTIAL_STEEPNESS);
		createEReference(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__UTILIZATION_STIMULUS);
		createEAttribute(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__DISCOUNT_FACTOR);
		createEAttribute(improvedQLearningModelEClass, IMPROVED_QLEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD);

		learningBasedModelEClass = createEClass(LEARNING_BASED_MODEL);
		createEAttribute(learningBasedModelEClass, LEARNING_BASED_MODEL__LEARNING_RATE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		StimuliPackage theStimuliPackage = (StimuliPackage) EPackage.Registry.INSTANCE
				.getEPackage(StimuliPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage) EPackage.Registry.INSTANCE
				.getEPackage(DatatypesPackage.eNS_URI);
		TriggersPackage theTriggersPackage = (TriggersPackage) EPackage.Registry.INSTANCE
				.getEPackage(TriggersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qThresholdsModelEClass.getESuperTypes().add(this.getLearningBasedModel());
		randomModelEClass.getESuperTypes().add(this.getBaseModel());
		improvedQLearningModelEClass.getESuperTypes().add(this.getLearningBasedModel());
		learningBasedModelEClass.getESuperTypes().add(this.getBaseModel());

		// Initialize classes and features; add operations and parameters
		initEClass(baseModelEClass, BaseModel.class, "BaseModel", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseModel_Interval(), ecorePackage.getEDouble(), "interval", "1.0", 0, 1, BaseModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseModel_InitalIntervalDelay(), theEcorePackage.getEDouble(), "initalIntervalDelay", "0", 0,
				1, BaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(qThresholdsModelEClass, QThresholdsModel.class, "QThresholdsModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQThresholdsModel_Input(), theStimuliPackage.getStimulus(), null, "input", null, 1, 1,
				QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQThresholdsModel_TargetResponseTime(), theEcorePackage.getEDouble(), "targetResponseTime",
				"1.0", 1, 1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQThresholdsModel_ResponseTimeStimulus(), theStimuliPackage.getOperationResponseTime(), null,
				"responseTimeStimulus", null, 1, 1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQThresholdsModel_ExponentialSteepness(), theEcorePackage.getEDouble(), "exponentialSteepness",
				"2", 1, 1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQThresholdsModel_Epsilon(), theDatatypesPackage.getPercentDouble(), "epsilon", "0.05", 1, 1,
				QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQThresholdsModel_DiscountFactor(), theDatatypesPackage.getPercentDouble(), "discountFactor",
				"0.5", 1, 1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQThresholdsModel_AllocatedResourcesStimulus(), theStimuliPackage.getNumberOfElements(), null,
				"allocatedResourcesStimulus", null, 1, 1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQThresholdsModel_UtilizationStimulus(), theStimuliPackage.getStimulus(), null,
				"utilizationStimulus", null, 1, 1, QThresholdsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQThresholdsModel_ResponseTimeAggregationMethod(), theTriggersPackage.getAGGREGATIONMETHOD(),
				"responseTimeAggregationMethod", "PERCENTILE95", 1, 1, QThresholdsModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomModelEClass, RandomModel.class, "RandomModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRandomModel_MinAdjustment(), theEcorePackage.getEInt(), "minAdjustment", null, 1, 1,
				RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomModel_MaxAdjustment(), theEcorePackage.getEInt(), "maxAdjustment", null, 1, 1,
				RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomModel_Probability(), theEcorePackage.getEDouble(), "probability", "1.0", 1, 1,
				RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(improvedQLearningModelEClass, ImprovedQLearningModel.class, "ImprovedQLearningModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImprovedQLearningModel_Input(), theStimuliPackage.getStimulus(), null, "input", null, 1, 1,
				ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImprovedQLearningModel_Epsilon(), theDatatypesPackage.getPercentDouble(), "epsilon", "0.05",
				1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImprovedQLearningModel_ActionCount(), theDatatypesPackage.getPositiveInteger(), "actionCount",
				"5", 1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImprovedQLearningModel_TargetResponseTime(), theEcorePackage.getEDouble(),
				"targetResponseTime", "1.0", 1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImprovedQLearningModel_ResponseTimeStimulus(), theStimuliPackage.getOperationResponseTime(),
				null, "responseTimeStimulus", null, 1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImprovedQLearningModel_ExponentialSteepness(), theEcorePackage.getEDouble(),
				"exponentialSteepness", "2.0", 1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImprovedQLearningModel_UtilizationStimulus(), theStimuliPackage.getStimulus(), null,
				"utilizationStimulus", null, 1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImprovedQLearningModel_DiscountFactor(), theDatatypesPackage.getPercentDouble(),
				"discountFactor", "0.5", 1, 1, ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImprovedQLearningModel_ResponseTimeAggregationMethod(),
				theTriggersPackage.getAGGREGATIONMETHOD(), "responseTimeAggregationMethod", "PERCENTILE95", 1, 1,
				ImprovedQLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningBasedModelEClass, LearningBasedModel.class, "LearningBasedModel", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningBasedModel_LearningRate(), theDatatypesPackage.getPercentDouble(), "learningRate",
				"0.7", 1, 1, LearningBasedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} // ModelsPackageImpl
