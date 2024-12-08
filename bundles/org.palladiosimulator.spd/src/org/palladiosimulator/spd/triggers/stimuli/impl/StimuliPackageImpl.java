/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
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
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.impl.ModelsPackageImpl;
import org.palladiosimulator.spd.targets.TargetsPackage;
import org.palladiosimulator.spd.targets.impl.TargetsPackageImpl;
import org.palladiosimulator.spd.triggers.TriggersPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl;
import org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl;
import org.palladiosimulator.spd.triggers.stimuli.CPUUtilization;
import org.palladiosimulator.spd.triggers.stimuli.HDDUtilization;
import org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus;
import org.palladiosimulator.spd.triggers.stimuli.MemoryUtilization;
import org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization;
import org.palladiosimulator.spd.triggers.stimuli.NumberOfElements;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.QueueLength;
import org.palladiosimulator.spd.triggers.stimuli.ResourceUtilizationStimulus;
import org.palladiosimulator.spd.triggers.stimuli.SimulationStateStimulus;
import org.palladiosimulator.spd.triggers.stimuli.SimulationTime;
import org.palladiosimulator.spd.triggers.stimuli.SourceInterfaceStimulus;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;
import org.palladiosimulator.spd.triggers.stimuli.TargetGroupStateStimulus;
import org.palladiosimulator.spd.triggers.stimuli.TaskCount;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class StimuliPackageImpl extends EPackageImpl implements StimuliPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass stimulusEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass targetGroupStateStimulusEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass simulationStateStimulusEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass sourceInterfaceStimulusEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass operationResponseTimeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numberOfElementsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass managedElementsStateStimulusEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass cpuUtilizationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass memoryUtilizationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass simulationTimeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass hddUtilizationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resourceUtilizationStimulusEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass taskCountEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass queueLengthEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass networkUtilizationEClass = null;

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
     * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private StimuliPackageImpl() {
        super(eNS_URI, StimuliFactory.eINSTANCE);
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
     * This method is used to initialize {@link StimuliPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static StimuliPackage init() {
        if (isInited) {
            return (StimuliPackage) EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredStimuliPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final StimuliPackageImpl theStimuliPackage = registeredStimuliPackage instanceof StimuliPackageImpl
                ? (StimuliPackageImpl) registeredStimuliPackage
                : new StimuliPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpectationsPackage.eNS_URI);
        final ExpectationsPackageImpl theExpectationsPackage = (ExpectationsPackageImpl) (registeredPackage instanceof ExpectationsPackageImpl
                ? registeredPackage
                : ExpectationsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        final ModelsPackageImpl theModelsPackage = (ModelsPackageImpl) (registeredPackage instanceof ModelsPackageImpl
                ? registeredPackage
                : ModelsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
        final DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (registeredPackage instanceof DatatypesPackageImpl
                ? registeredPackage
                : DatatypesPackage.eINSTANCE);

        // Create package meta-data objects
        theStimuliPackage.createPackageContents();
        theSpdPackage.createPackageContents();
        theTargetsPackage.createPackageContents();
        theAdjustmentsPackage.createPackageContents();
        theConstraintsPackage.createPackageContents();
        thePolicyPackage.createPackageContents();
        theTargetPackage.createPackageContents();
        theTriggersPackage.createPackageContents();
        theExpectationsPackage.createPackageContents();
        theModelsPackage.createPackageContents();
        theDatatypesPackage.createPackageContents();

        // Initialize created meta-data
        theStimuliPackage.initializePackageContents();
        theSpdPackage.initializePackageContents();
        theTargetsPackage.initializePackageContents();
        theAdjustmentsPackage.initializePackageContents();
        theConstraintsPackage.initializePackageContents();
        thePolicyPackage.initializePackageContents();
        theTargetPackage.initializePackageContents();
        theTriggersPackage.initializePackageContents();
        theExpectationsPackage.initializePackageContents();
        theModelsPackage.initializePackageContents();
        theDatatypesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theStimuliPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(StimuliPackage.eNS_URI, theStimuliPackage);
        return theStimuliPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStimulus() {
        return this.stimulusEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTargetGroupStateStimulus() {
        return this.targetGroupStateStimulusEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSimulationStateStimulus() {
        return this.simulationStateStimulusEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSourceInterfaceStimulus() {
        return this.sourceInterfaceStimulusEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOperationResponseTime() {
        return this.operationResponseTimeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOperationResponseTime_OperationSignature() {
        return (EReference) this.operationResponseTimeEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumberOfElements() {
        return this.numberOfElementsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getManagedElementsStateStimulus() {
        return this.managedElementsStateStimulusEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getManagedElementsStateStimulus_AggregationOverElements() {
        return (EAttribute) this.managedElementsStateStimulusEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCPUUtilization() {
        return this.cpuUtilizationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMemoryUtilization() {
        return this.memoryUtilizationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSimulationTime() {
        return this.simulationTimeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getHDDUtilization() {
        return this.hddUtilizationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getHDDUtilization_UsageType() {
        return (EAttribute) this.hddUtilizationEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceUtilizationStimulus() {
        return this.resourceUtilizationStimulusEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTaskCount() {
        return this.taskCountEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getQueueLength() {
        return this.queueLengthEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getQueueLength_PassiveResource() {
        return (EReference) this.queueLengthEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNetworkUtilization() {
        return this.networkUtilizationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getNetworkUtilization_UsageType() {
        return (EAttribute) this.networkUtilizationEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StimuliFactory getStimuliFactory() {
        return (StimuliFactory) this.getEFactoryInstance();
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
        this.stimulusEClass = this.createEClass(STIMULUS);

        this.targetGroupStateStimulusEClass = this.createEClass(TARGET_GROUP_STATE_STIMULUS);

        this.simulationStateStimulusEClass = this.createEClass(SIMULATION_STATE_STIMULUS);

        this.sourceInterfaceStimulusEClass = this.createEClass(SOURCE_INTERFACE_STIMULUS);

        this.operationResponseTimeEClass = this.createEClass(OPERATION_RESPONSE_TIME);
        this.createEReference(this.operationResponseTimeEClass, OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE);

        this.numberOfElementsEClass = this.createEClass(NUMBER_OF_ELEMENTS);

        this.managedElementsStateStimulusEClass = this.createEClass(MANAGED_ELEMENTS_STATE_STIMULUS);
        this.createEAttribute(this.managedElementsStateStimulusEClass,
                MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS);

        this.cpuUtilizationEClass = this.createEClass(CPU_UTILIZATION);

        this.memoryUtilizationEClass = this.createEClass(MEMORY_UTILIZATION);

        this.simulationTimeEClass = this.createEClass(SIMULATION_TIME);

        this.hddUtilizationEClass = this.createEClass(HDD_UTILIZATION);
        this.createEAttribute(this.hddUtilizationEClass, HDD_UTILIZATION__USAGE_TYPE);

        this.resourceUtilizationStimulusEClass = this.createEClass(RESOURCE_UTILIZATION_STIMULUS);

        this.taskCountEClass = this.createEClass(TASK_COUNT);

        this.queueLengthEClass = this.createEClass(QUEUE_LENGTH);
        this.createEReference(this.queueLengthEClass, QUEUE_LENGTH__PASSIVE_RESOURCE);

        this.networkUtilizationEClass = this.createEClass(NETWORK_UTILIZATION);
        this.createEAttribute(this.networkUtilizationEClass, NETWORK_UTILIZATION__USAGE_TYPE);
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
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
            .getEPackage(RepositoryPackage.eNS_URI);
        final TriggersPackage theTriggersPackage = (TriggersPackage) EPackage.Registry.INSTANCE
            .getEPackage(TriggersPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.targetGroupStateStimulusEClass.getESuperTypes()
            .add(this.getStimulus());
        this.simulationStateStimulusEClass.getESuperTypes()
            .add(this.getStimulus());
        this.sourceInterfaceStimulusEClass.getESuperTypes()
            .add(this.getStimulus());
        this.operationResponseTimeEClass.getESuperTypes()
            .add(this.getSourceInterfaceStimulus());
        this.numberOfElementsEClass.getESuperTypes()
            .add(this.getTargetGroupStateStimulus());
        this.managedElementsStateStimulusEClass.getESuperTypes()
            .add(this.getTargetGroupStateStimulus());
        this.cpuUtilizationEClass.getESuperTypes()
            .add(this.getResourceUtilizationStimulus());
        this.memoryUtilizationEClass.getESuperTypes()
            .add(this.getResourceUtilizationStimulus());
        this.simulationTimeEClass.getESuperTypes()
            .add(this.getSimulationStateStimulus());
        this.hddUtilizationEClass.getESuperTypes()
            .add(this.getResourceUtilizationStimulus());
        this.resourceUtilizationStimulusEClass.getESuperTypes()
            .add(this.getManagedElementsStateStimulus());
        this.taskCountEClass.getESuperTypes()
            .add(this.getManagedElementsStateStimulus());
        this.queueLengthEClass.getESuperTypes()
            .add(this.getSourceInterfaceStimulus());
        this.networkUtilizationEClass.getESuperTypes()
            .add(this.getResourceUtilizationStimulus());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.stimulusEClass, Stimulus.class, "Stimulus", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.targetGroupStateStimulusEClass, TargetGroupStateStimulus.class, "TargetGroupStateStimulus",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.simulationStateStimulusEClass, SimulationStateStimulus.class, "SimulationStateStimulus",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.sourceInterfaceStimulusEClass, SourceInterfaceStimulus.class, "SourceInterfaceStimulus",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.operationResponseTimeEClass, OperationResponseTime.class, "OperationResponseTime",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getOperationResponseTime_OperationSignature(),
                theRepositoryPackage.getOperationSignature(), null, "operationSignature", null, 0, 1,
                OperationResponseTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.numberOfElementsEClass, NumberOfElements.class, "NumberOfElements", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.managedElementsStateStimulusEClass, ManagedElementsStateStimulus.class,
                "ManagedElementsStateStimulus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getManagedElementsStateStimulus_AggregationOverElements(),
                theTriggersPackage.getAGGREGATIONMETHOD(), "aggregationOverElements", null, 0, 1,
                ManagedElementsStateStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.cpuUtilizationEClass, CPUUtilization.class, "CPUUtilization", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.memoryUtilizationEClass, MemoryUtilization.class, "MemoryUtilization", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.simulationTimeEClass, SimulationTime.class, "SimulationTime", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.hddUtilizationEClass, HDDUtilization.class, "HDDUtilization", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getHDDUtilization_UsageType(), theTriggersPackage.getHDDUSAGETYPE(), "usageType", null,
                0, 1, HDDUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.resourceUtilizationStimulusEClass, ResourceUtilizationStimulus.class,
                "ResourceUtilizationStimulus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.taskCountEClass, TaskCount.class, "TaskCount", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.queueLengthEClass, QueueLength.class, "QueueLength", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getQueueLength_PassiveResource(), theRepositoryPackage.getPassiveResource(), null,
                "passiveResource", null, 0, 1, QueueLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.networkUtilizationEClass, NetworkUtilization.class, "NetworkUtilization", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNetworkUtilization_UsageType(), theTriggersPackage.getNETWORKUSAGETYPE(),
                "usageType", null, 0, 1, NetworkUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} // StimuliPackageImpl
