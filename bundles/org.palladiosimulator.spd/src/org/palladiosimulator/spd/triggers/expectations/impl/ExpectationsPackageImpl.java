/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.impl.ModelsPackageImpl;
import org.palladiosimulator.spd.targets.TargetsPackage;
import org.palladiosimulator.spd.targets.impl.TargetsPackageImpl;
import org.palladiosimulator.spd.triggers.TriggersPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsFactory;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedCount;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPrimitive;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTime;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTrend;
import org.palladiosimulator.spd.triggers.expectations.ExpectedValue;
import org.palladiosimulator.spd.triggers.expectations.NoExpectation;
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
public class ExpectationsPackageImpl extends EPackageImpl implements ExpectationsPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass expectedValueEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass expectedPrimitiveEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass noExpectationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass expectedPercentageEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass expectedCountEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass expectedTimeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass expectedTrendEClass = null;

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
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ExpectationsPackageImpl() {
        super(eNS_URI, ExpectationsFactory.eINSTANCE);
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
     * This method is used to initialize {@link ExpectationsPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ExpectationsPackage init() {
        if (isInited) {
            return (ExpectationsPackage) EPackage.Registry.INSTANCE.getEPackage(ExpectationsPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredExpectationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final ExpectationsPackageImpl theExpectationsPackage = registeredExpectationsPackage instanceof ExpectationsPackageImpl
                ? (ExpectationsPackageImpl) registeredExpectationsPackage
                : new ExpectationsPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        final ModelsPackageImpl theModelsPackage = (ModelsPackageImpl) (registeredPackage instanceof ModelsPackageImpl
                ? registeredPackage
                : ModelsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
        final DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (registeredPackage instanceof DatatypesPackageImpl
                ? registeredPackage
                : DatatypesPackage.eINSTANCE);

        // Create package meta-data objects
        theExpectationsPackage.createPackageContents();
        theSpdPackage.createPackageContents();
        theTargetsPackage.createPackageContents();
        theAdjustmentsPackage.createPackageContents();
        theConstraintsPackage.createPackageContents();
        thePolicyPackage.createPackageContents();
        theTargetPackage.createPackageContents();
        theTriggersPackage.createPackageContents();
        theStimuliPackage.createPackageContents();
        theModelsPackage.createPackageContents();
        theDatatypesPackage.createPackageContents();

        // Initialize created meta-data
        theExpectationsPackage.initializePackageContents();
        theSpdPackage.initializePackageContents();
        theTargetsPackage.initializePackageContents();
        theAdjustmentsPackage.initializePackageContents();
        theConstraintsPackage.initializePackageContents();
        thePolicyPackage.initializePackageContents();
        theTargetPackage.initializePackageContents();
        theTriggersPackage.initializePackageContents();
        theStimuliPackage.initializePackageContents();
        theModelsPackage.initializePackageContents();
        theDatatypesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theExpectationsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ExpectationsPackage.eNS_URI, theExpectationsPackage);
        return theExpectationsPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExpectedValue() {
        return this.expectedValueEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExpectedPrimitive() {
        return this.expectedPrimitiveEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNoExpectation() {
        return this.noExpectationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExpectedPercentage() {
        return this.expectedPercentageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getExpectedPercentage_Value() {
        return (EAttribute) this.expectedPercentageEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExpectedCount() {
        return this.expectedCountEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getExpectedCount_Count() {
        return (EAttribute) this.expectedCountEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExpectedTime() {
        return this.expectedTimeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getExpectedTime_Value() {
        return (EAttribute) this.expectedTimeEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExpectedTrend() {
        return this.expectedTrendEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getExpectedTrend_Trend() {
        return (EAttribute) this.expectedTrendEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExpectationsFactory getExpectationsFactory() {
        return (ExpectationsFactory) this.getEFactoryInstance();
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
        this.expectedValueEClass = this.createEClass(EXPECTED_VALUE);

        this.expectedPrimitiveEClass = this.createEClass(EXPECTED_PRIMITIVE);

        this.noExpectationEClass = this.createEClass(NO_EXPECTATION);

        this.expectedPercentageEClass = this.createEClass(EXPECTED_PERCENTAGE);
        this.createEAttribute(this.expectedPercentageEClass, EXPECTED_PERCENTAGE__VALUE);

        this.expectedCountEClass = this.createEClass(EXPECTED_COUNT);
        this.createEAttribute(this.expectedCountEClass, EXPECTED_COUNT__COUNT);

        this.expectedTimeEClass = this.createEClass(EXPECTED_TIME);
        this.createEAttribute(this.expectedTimeEClass, EXPECTED_TIME__VALUE);

        this.expectedTrendEClass = this.createEClass(EXPECTED_TREND);
        this.createEAttribute(this.expectedTrendEClass, EXPECTED_TREND__TREND);
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
        final TriggersPackage theTriggersPackage = (TriggersPackage) EPackage.Registry.INSTANCE
            .getEPackage(TriggersPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.expectedPrimitiveEClass.getESuperTypes()
            .add(this.getExpectedValue());
        this.noExpectationEClass.getESuperTypes()
            .add(this.getExpectedValue());
        this.expectedPercentageEClass.getESuperTypes()
            .add(this.getExpectedPrimitive());
        this.expectedCountEClass.getESuperTypes()
            .add(this.getExpectedPrimitive());
        this.expectedTimeEClass.getESuperTypes()
            .add(this.getExpectedPrimitive());
        this.expectedTrendEClass.getESuperTypes()
            .add(this.getExpectedValue());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.expectedValueEClass, ExpectedValue.class, "ExpectedValue", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.expectedPrimitiveEClass, ExpectedPrimitive.class, "ExpectedPrimitive", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.noExpectationEClass, NoExpectation.class, "NoExpectation", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.expectedPercentageEClass, ExpectedPercentage.class, "ExpectedPercentage", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getExpectedPercentage_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1,
                ExpectedPercentage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.expectedCountEClass, ExpectedCount.class, "ExpectedCount", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getExpectedCount_Count(), theEcorePackage.getEInt(), "count", null, 0, 1,
                ExpectedCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.expectedTimeEClass, ExpectedTime.class, "ExpectedTime", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getExpectedTime_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1,
                ExpectedTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.expectedTrendEClass, ExpectedTrend.class, "ExpectedTrend", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getExpectedTrend_Trend(), theTriggersPackage.getTrendPattern(), "trend", null, 0, 1,
                ExpectedTrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
    }

} // ExpectationsPackageImpl
