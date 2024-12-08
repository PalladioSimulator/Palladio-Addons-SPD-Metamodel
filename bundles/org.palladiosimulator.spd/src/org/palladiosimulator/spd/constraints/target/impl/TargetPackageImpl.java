/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target.impl;

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
import org.palladiosimulator.spd.constraints.target.TargetConstraint;
import org.palladiosimulator.spd.constraints.target.TargetFactory;
import org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint;
import org.palladiosimulator.spd.constraints.target.TargetPackage;
import org.palladiosimulator.spd.constraints.target.ThrashingConstraint;
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
public class TargetPackageImpl extends EPackageImpl implements TargetPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass targetConstraintEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass targetGroupSizeConstraintEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass thrashingConstraintEClass = null;

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
     * @see org.palladiosimulator.spd.constraints.target.TargetPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TargetPackageImpl() {
        super(eNS_URI, TargetFactory.eINSTANCE);
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
     * This method is used to initialize {@link TargetPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TargetPackage init() {
        if (isInited) {
            return (TargetPackage) EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredTargetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final TargetPackageImpl theTargetPackage = registeredTargetPackage instanceof TargetPackageImpl
                ? (TargetPackageImpl) registeredTargetPackage
                : new TargetPackageImpl();

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
        theTargetPackage.createPackageContents();
        theSpdPackage.createPackageContents();
        theTargetsPackage.createPackageContents();
        theAdjustmentsPackage.createPackageContents();
        theConstraintsPackage.createPackageContents();
        thePolicyPackage.createPackageContents();
        theTriggersPackage.createPackageContents();
        theStimuliPackage.createPackageContents();
        theExpectationsPackage.createPackageContents();
        theModelsPackage.createPackageContents();
        theDatatypesPackage.createPackageContents();

        // Initialize created meta-data
        theTargetPackage.initializePackageContents();
        theSpdPackage.initializePackageContents();
        theTargetsPackage.initializePackageContents();
        theAdjustmentsPackage.initializePackageContents();
        theConstraintsPackage.initializePackageContents();
        thePolicyPackage.initializePackageContents();
        theTriggersPackage.initializePackageContents();
        theStimuliPackage.initializePackageContents();
        theExpectationsPackage.initializePackageContents();
        theModelsPackage.initializePackageContents();
        theDatatypesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTargetPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TargetPackage.eNS_URI, theTargetPackage);
        return theTargetPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTargetConstraint() {
        return this.targetConstraintEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTargetGroupSizeConstraint() {
        return this.targetGroupSizeConstraintEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTargetGroupSizeConstraint_MinSize() {
        return (EAttribute) this.targetGroupSizeConstraintEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTargetGroupSizeConstraint_MaxSize() {
        return (EAttribute) this.targetGroupSizeConstraintEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getThrashingConstraint() {
        return this.thrashingConstraintEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getThrashingConstraint_MinimumTimeNoThrashing() {
        return (EAttribute) this.thrashingConstraintEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TargetFactory getTargetFactory() {
        return (TargetFactory) this.getEFactoryInstance();
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
        this.targetConstraintEClass = this.createEClass(TARGET_CONSTRAINT);

        this.targetGroupSizeConstraintEClass = this.createEClass(TARGET_GROUP_SIZE_CONSTRAINT);
        this.createEAttribute(this.targetGroupSizeConstraintEClass, TARGET_GROUP_SIZE_CONSTRAINT__MIN_SIZE);
        this.createEAttribute(this.targetGroupSizeConstraintEClass, TARGET_GROUP_SIZE_CONSTRAINT__MAX_SIZE);

        this.thrashingConstraintEClass = this.createEClass(THRASHING_CONSTRAINT);
        this.createEAttribute(this.thrashingConstraintEClass, THRASHING_CONSTRAINT__MINIMUM_TIME_NO_THRASHING);
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
        final ConstraintsPackage theConstraintsPackage = (ConstraintsPackage) EPackage.Registry.INSTANCE
            .getEPackage(ConstraintsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.targetConstraintEClass.getESuperTypes()
            .add(theConstraintsPackage.getAbstractConstraint());
        this.targetGroupSizeConstraintEClass.getESuperTypes()
            .add(this.getTargetConstraint());
        this.targetGroupSizeConstraintEClass.getESuperTypes()
            .add(theConstraintsPackage.getStateBasedContraint());
        this.thrashingConstraintEClass.getESuperTypes()
            .add(theConstraintsPackage.getTemporalConstraint());
        this.thrashingConstraintEClass.getESuperTypes()
            .add(this.getTargetConstraint());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.targetConstraintEClass, TargetConstraint.class, "TargetConstraint", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.targetGroupSizeConstraintEClass, TargetGroupSizeConstraint.class,
                "TargetGroupSizeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getTargetGroupSizeConstraint_MinSize(), this.ecorePackage.getEInt(), "minSize", null,
                1, 1, TargetGroupSizeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTargetGroupSizeConstraint_MaxSize(), this.ecorePackage.getEInt(), "maxSize", null,
                1, 1, TargetGroupSizeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.thrashingConstraintEClass, ThrashingConstraint.class, "ThrashingConstraint", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getThrashingConstraint_MinimumTimeNoThrashing(), this.ecorePackage.getEDouble(),
                "minimumTimeNoThrashing", null, 0, 1, ThrashingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} // TargetPackageImpl
