/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
import org.palladiosimulator.spd.models.FuzzyLearningModel;
import org.palladiosimulator.spd.models.FuzzyQLearningModel;
import org.palladiosimulator.spd.models.FuzzySARSAModel;
import org.palladiosimulator.spd.models.InitializationType;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsFactory;
import org.palladiosimulator.spd.models.ModelsPackage;
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
 *
 * @generated
 */
public class ModelsPackageImpl extends EPackageImpl implements ModelsPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass baseModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass randomModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass fuzzyQLearningModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass learningBasedModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass fuzzyLearningModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass fuzzySARSAModelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum initializationTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link ModelsPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
        final Object registeredModelsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final ModelsPackageImpl theModelsPackage = registeredModelsPackage instanceof ModelsPackageImpl
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
        final SpdPackageImpl theSpdPackage = (SpdPackageImpl) (registeredPackage instanceof SpdPackageImpl
                ? registeredPackage
                : SpdPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
        final TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl) (registeredPackage instanceof TargetsPackageImpl
                ? registeredPackage
                : TargetsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
        final AdjustmentsPackageImpl theAdjustmentsPackage = (AdjustmentsPackageImpl) (registeredPackage instanceof AdjustmentsPackageImpl
                ? registeredPackage
                : AdjustmentsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
        final ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl) (registeredPackage instanceof ConstraintsPackageImpl
                ? registeredPackage
                : ConstraintsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
        final PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
                ? registeredPackage
                : PolicyPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
        final TargetPackageImpl theTargetPackage = (TargetPackageImpl) (registeredPackage instanceof TargetPackageImpl
                ? registeredPackage
                : TargetPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
        final TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl) (registeredPackage instanceof TriggersPackageImpl
                ? registeredPackage
                : TriggersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI);
        final StimuliPackageImpl theStimuliPackage = (StimuliPackageImpl) (registeredPackage instanceof StimuliPackageImpl
                ? registeredPackage
                : StimuliPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpectationsPackage.eNS_URI);
        final ExpectationsPackageImpl theExpectationsPackage = (ExpectationsPackageImpl) (registeredPackage instanceof ExpectationsPackageImpl
                ? registeredPackage
                : ExpectationsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
        final DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (registeredPackage instanceof DatatypesPackageImpl
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
     *
     * @generated
     */
    @Override
    public EClass getBaseModel() {
        return this.baseModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBaseModel_Interval() {
        return (EAttribute) this.baseModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBaseModel_IntervalOffset() {
        return (EAttribute) this.baseModelEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRandomModel() {
        return this.randomModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRandomModel_MinAdjustment() {
        return (EAttribute) this.randomModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRandomModel_MaxAdjustment() {
        return (EAttribute) this.randomModelEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRandomModel_Probability() {
        return (EAttribute) this.randomModelEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFuzzyQLearningModel() {
        return this.fuzzyQLearningModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLearningBasedModel() {
        return this.learningBasedModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getLearningBasedModel_LearningRate() {
        return (EAttribute) this.learningBasedModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFuzzyLearningModel() {
        return this.fuzzyLearningModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getFuzzyLearningModel_WorkloadStimulus() {
        return (EReference) this.fuzzyLearningModelEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getFuzzyLearningModel_ResponseTimeStimulus() {
        return (EReference) this.fuzzyLearningModelEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFuzzyLearningModel_TargetResponseTime() {
        return (EAttribute) this.fuzzyLearningModelEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFuzzyLearningModel_ResponseTimeAggregationMethod() {
        return (EAttribute) this.fuzzyLearningModelEClass.getEStructuralFeatures()
            .get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFuzzyLearningModel_Epsilon() {
        return (EAttribute) this.fuzzyLearningModelEClass.getEStructuralFeatures()
            .get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFuzzyLearningModel_DiscountFactor() {
        return (EAttribute) this.fuzzyLearningModelEClass.getEStructuralFeatures()
            .get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFuzzyLearningModel_InitializationType() {
        return (EAttribute) this.fuzzyLearningModelEClass.getEStructuralFeatures()
            .get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFuzzySARSAModel() {
        return this.fuzzySARSAModelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getInitializationType() {
        return this.initializationTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ModelsFactory getModelsFactory() {
        return (ModelsFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.baseModelEClass = this.createEClass(BASE_MODEL);
        this.createEAttribute(this.baseModelEClass, BASE_MODEL__INTERVAL);
        this.createEAttribute(this.baseModelEClass, BASE_MODEL__INTERVAL_OFFSET);

        this.randomModelEClass = this.createEClass(RANDOM_MODEL);
        this.createEAttribute(this.randomModelEClass, RANDOM_MODEL__MIN_ADJUSTMENT);
        this.createEAttribute(this.randomModelEClass, RANDOM_MODEL__MAX_ADJUSTMENT);
        this.createEAttribute(this.randomModelEClass, RANDOM_MODEL__PROBABILITY);

        this.fuzzyQLearningModelEClass = this.createEClass(FUZZY_QLEARNING_MODEL);

        this.learningBasedModelEClass = this.createEClass(LEARNING_BASED_MODEL);
        this.createEAttribute(this.learningBasedModelEClass, LEARNING_BASED_MODEL__LEARNING_RATE);

        this.fuzzyLearningModelEClass = this.createEClass(FUZZY_LEARNING_MODEL);
        this.createEReference(this.fuzzyLearningModelEClass, FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS);
        this.createEReference(this.fuzzyLearningModelEClass, FUZZY_LEARNING_MODEL__RESPONSE_TIME_STIMULUS);
        this.createEAttribute(this.fuzzyLearningModelEClass, FUZZY_LEARNING_MODEL__TARGET_RESPONSE_TIME);
        this.createEAttribute(this.fuzzyLearningModelEClass, FUZZY_LEARNING_MODEL__RESPONSE_TIME_AGGREGATION_METHOD);
        this.createEAttribute(this.fuzzyLearningModelEClass, FUZZY_LEARNING_MODEL__EPSILON);
        this.createEAttribute(this.fuzzyLearningModelEClass, FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR);
        this.createEAttribute(this.fuzzyLearningModelEClass, FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE);

        this.fuzzySARSAModelEClass = this.createEClass(FUZZY_SARSA_MODEL);

        // Create enums
        this.initializationTypeEEnum = this.createEEnum(INITIALIZATION_TYPE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
            .getEPackage(EcorePackage.eNS_URI);
        final DatatypesPackage theDatatypesPackage = (DatatypesPackage) EPackage.Registry.INSTANCE
            .getEPackage(DatatypesPackage.eNS_URI);
        final StimuliPackage theStimuliPackage = (StimuliPackage) EPackage.Registry.INSTANCE
            .getEPackage(StimuliPackage.eNS_URI);
        final TriggersPackage theTriggersPackage = (TriggersPackage) EPackage.Registry.INSTANCE
            .getEPackage(TriggersPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.randomModelEClass.getESuperTypes()
            .add(this.getBaseModel());
        this.fuzzyQLearningModelEClass.getESuperTypes()
            .add(this.getFuzzyLearningModel());
        this.learningBasedModelEClass.getESuperTypes()
            .add(this.getBaseModel());
        this.fuzzyLearningModelEClass.getESuperTypes()
            .add(this.getLearningBasedModel());
        this.fuzzySARSAModelEClass.getESuperTypes()
            .add(this.getFuzzyLearningModel());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.baseModelEClass, BaseModel.class, "BaseModel", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getBaseModel_Interval(), theDatatypesPackage.getPositiveDouble(), "interval", null, 1,
                1, BaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getBaseModel_IntervalOffset(), theDatatypesPackage.getPositiveDouble(),
                "intervalOffset", null, 1, 1, BaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.randomModelEClass, RandomModel.class, "RandomModel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRandomModel_MinAdjustment(), theEcorePackage.getEInt(), "minAdjustment", null, 1, 1,
                RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getRandomModel_MaxAdjustment(), theEcorePackage.getEInt(), "maxAdjustment", null, 1, 1,
                RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getRandomModel_Probability(), theDatatypesPackage.getPercentDouble(), "probability",
                "1.0", 1, 1, RandomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.fuzzyQLearningModelEClass, FuzzyQLearningModel.class, "FuzzyQLearningModel", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.learningBasedModelEClass, LearningBasedModel.class, "LearningBasedModel", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getLearningBasedModel_LearningRate(), theDatatypesPackage.getPercentDouble(),
                "learningRate", "0.7", 1, 1, LearningBasedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.fuzzyLearningModelEClass, FuzzyLearningModel.class, "FuzzyLearningModel", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getFuzzyLearningModel_WorkloadStimulus(), theStimuliPackage.getStimulus(), null,
                "workloadStimulus", null, 1, 1, FuzzyLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getFuzzyLearningModel_ResponseTimeStimulus(),
                theStimuliPackage.getOperationResponseTime(), null, "responseTimeStimulus", null, 1, 1,
                FuzzyLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getFuzzyLearningModel_TargetResponseTime(), theDatatypesPackage.getPositiveDouble(),
                "targetResponseTime", null, 1, 1, FuzzyLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getFuzzyLearningModel_ResponseTimeAggregationMethod(),
                theTriggersPackage.getAGGREGATIONMETHOD(), "responseTimeAggregationMethod", null, 0, 1,
                FuzzyLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getFuzzyLearningModel_Epsilon(), theDatatypesPackage.getPercentDouble(), "epsilon",
                "0.01", 0, 1, FuzzyLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getFuzzyLearningModel_DiscountFactor(), theDatatypesPackage.getPercentDouble(),
                "discountFactor", "0.5", 0, 1, FuzzyLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getFuzzyLearningModel_InitializationType(), this.getInitializationType(),
                "initializationType", null, 0, 1, FuzzyLearningModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.fuzzySARSAModelEClass, FuzzySARSAModel.class, "FuzzySARSAModel", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        this.initEEnum(this.initializationTypeEEnum, InitializationType.class, "InitializationType");
        this.addEEnumLiteral(this.initializationTypeEEnum, InitializationType.OPTIMISTIC);
        this.addEEnumLiteral(this.initializationTypeEEnum, InitializationType.PESSIMISTIC);
        this.addEEnumLiteral(this.initializationTypeEEnum, InitializationType.KNOWLEDGE);
    }

} // ModelsPackageImpl
