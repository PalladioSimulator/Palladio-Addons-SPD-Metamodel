/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.adjustments.AbsoluteAdjustment;
import org.palladiosimulator.spd.adjustments.AdjustmentType;
import org.palladiosimulator.spd.adjustments.AdjustmentsFactory;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;
import org.palladiosimulator.spd.adjustments.StepAdjustment;
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
public class AdjustmentsPackageImpl extends EPackageImpl implements AdjustmentsPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass adjustmentTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass relativeAdjustmentEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass absoluteAdjustmentEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass stepAdjustmentEClass = null;

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
     * @see org.palladiosimulator.spd.adjustments.AdjustmentsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private AdjustmentsPackageImpl() {
        super(eNS_URI, AdjustmentsFactory.eINSTANCE);
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
     * This method is used to initialize {@link AdjustmentsPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static AdjustmentsPackage init() {
        if (isInited) {
            return (AdjustmentsPackage) EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredAdjustmentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final AdjustmentsPackageImpl theAdjustmentsPackage = registeredAdjustmentsPackage instanceof AdjustmentsPackageImpl
                ? (AdjustmentsPackageImpl) registeredAdjustmentsPackage
                : new AdjustmentsPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        final ModelsPackageImpl theModelsPackage = (ModelsPackageImpl) (registeredPackage instanceof ModelsPackageImpl
                ? registeredPackage
                : ModelsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
        final DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (registeredPackage instanceof DatatypesPackageImpl
                ? registeredPackage
                : DatatypesPackage.eINSTANCE);

        // Create package meta-data objects
        theAdjustmentsPackage.createPackageContents();
        theSpdPackage.createPackageContents();
        theTargetsPackage.createPackageContents();
        theConstraintsPackage.createPackageContents();
        thePolicyPackage.createPackageContents();
        theTargetPackage.createPackageContents();
        theTriggersPackage.createPackageContents();
        theStimuliPackage.createPackageContents();
        theExpectationsPackage.createPackageContents();
        theModelsPackage.createPackageContents();
        theDatatypesPackage.createPackageContents();

        // Initialize created meta-data
        theAdjustmentsPackage.initializePackageContents();
        theSpdPackage.initializePackageContents();
        theTargetsPackage.initializePackageContents();
        theConstraintsPackage.initializePackageContents();
        thePolicyPackage.initializePackageContents();
        theTargetPackage.initializePackageContents();
        theTriggersPackage.initializePackageContents();
        theStimuliPackage.initializePackageContents();
        theExpectationsPackage.initializePackageContents();
        theModelsPackage.initializePackageContents();
        theDatatypesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theAdjustmentsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(AdjustmentsPackage.eNS_URI, theAdjustmentsPackage);
        return theAdjustmentsPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAdjustmentType() {
        return this.adjustmentTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRelativeAdjustment() {
        return this.relativeAdjustmentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRelativeAdjustment_PercentageGrowthValue() {
        return (EAttribute) this.relativeAdjustmentEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRelativeAdjustment_MinAdjustmentValue() {
        return (EAttribute) this.relativeAdjustmentEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAbsoluteAdjustment() {
        return this.absoluteAdjustmentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getAbsoluteAdjustment_GoalValue() {
        return (EAttribute) this.absoluteAdjustmentEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStepAdjustment() {
        return this.stepAdjustmentEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getStepAdjustment_StepValue() {
        return (EAttribute) this.stepAdjustmentEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AdjustmentsFactory getAdjustmentsFactory() {
        return (AdjustmentsFactory) this.getEFactoryInstance();
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
        this.adjustmentTypeEClass = this.createEClass(ADJUSTMENT_TYPE);

        this.relativeAdjustmentEClass = this.createEClass(RELATIVE_ADJUSTMENT);
        this.createEAttribute(this.relativeAdjustmentEClass, RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE);
        this.createEAttribute(this.relativeAdjustmentEClass, RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE);

        this.absoluteAdjustmentEClass = this.createEClass(ABSOLUTE_ADJUSTMENT);
        this.createEAttribute(this.absoluteAdjustmentEClass, ABSOLUTE_ADJUSTMENT__GOAL_VALUE);

        this.stepAdjustmentEClass = this.createEClass(STEP_ADJUSTMENT);
        this.createEAttribute(this.stepAdjustmentEClass, STEP_ADJUSTMENT__STEP_VALUE);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.relativeAdjustmentEClass.getESuperTypes()
            .add(this.getAdjustmentType());
        this.absoluteAdjustmentEClass.getESuperTypes()
            .add(this.getAdjustmentType());
        this.stepAdjustmentEClass.getESuperTypes()
            .add(this.getAdjustmentType());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.adjustmentTypeEClass, AdjustmentType.class, "AdjustmentType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.relativeAdjustmentEClass, RelativeAdjustment.class, "RelativeAdjustment", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRelativeAdjustment_PercentageGrowthValue(), this.ecorePackage.getEInt(),
                "percentageGrowthValue", "100", 1, 1, RelativeAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getRelativeAdjustment_MinAdjustmentValue(), this.ecorePackage.getEInt(),
                "minAdjustmentValue", "0", 1, 1, RelativeAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.absoluteAdjustmentEClass, AbsoluteAdjustment.class, "AbsoluteAdjustment", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getAbsoluteAdjustment_GoalValue(), this.ecorePackage.getEInt(), "goalValue", "0", 1, 1,
                AbsoluteAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.stepAdjustmentEClass, StepAdjustment.class, "StepAdjustment", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getStepAdjustment_StepValue(), this.ecorePackage.getEInt(), "stepValue", "0", 1, 1,
                StepAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
    }

} // AdjustmentsPackageImpl
