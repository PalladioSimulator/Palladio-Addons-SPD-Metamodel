/**
 */
package spd.adjustmenttype.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;
import spd.SpdPackage;

import spd.adjustmenttype.AbsoluteAdjustment;
import spd.adjustmenttype.AdjustmentType;
import spd.adjustmenttype.AdjustmenttypeFactory;
import spd.adjustmenttype.AdjustmenttypePackage;
import spd.adjustmenttype.RelativeAdjustment;
import spd.adjustmenttype.StepAdjustment;

import spd.impl.SpdPackageImpl;

import spd.palladio.PalladioPackage;

import spd.palladio.impl.PalladioPackageImpl;

import spd.policyconstraint.PolicyconstraintPackage;

import spd.policyconstraint.impl.PolicyconstraintPackageImpl;

import spd.scalingtrigger.ScalingtriggerPackage;

import spd.scalingtrigger.impl.ScalingtriggerPackageImpl;

import spd.targetgroup.TargetgroupPackage;

import spd.targetgroup.impl.TargetgroupPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdjustmenttypePackageImpl extends EPackageImpl implements AdjustmenttypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjustmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeAdjustmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteAdjustmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepAdjustmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see spd.adjustmenttype.AdjustmenttypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdjustmenttypePackageImpl() {
		super(eNS_URI, AdjustmenttypeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AdjustmenttypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdjustmenttypePackage init() {
		if (isInited) return (AdjustmenttypePackage)EPackage.Registry.INSTANCE.getEPackage(AdjustmenttypePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdjustmenttypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdjustmenttypePackageImpl theAdjustmenttypePackage = registeredAdjustmenttypePackage instanceof AdjustmenttypePackageImpl ? (AdjustmenttypePackageImpl)registeredAdjustmenttypePackage : new AdjustmenttypePackageImpl();

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
		SpdPackageImpl theSpdPackage = (SpdPackageImpl)(registeredPackage instanceof SpdPackageImpl ? registeredPackage : SpdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetgroupPackage.eNS_URI);
		TargetgroupPackageImpl theTargetgroupPackage = (TargetgroupPackageImpl)(registeredPackage instanceof TargetgroupPackageImpl ? registeredPackage : TargetgroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyconstraintPackage.eNS_URI);
		PolicyconstraintPackageImpl thePolicyconstraintPackage = (PolicyconstraintPackageImpl)(registeredPackage instanceof PolicyconstraintPackageImpl ? registeredPackage : PolicyconstraintPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScalingtriggerPackage.eNS_URI);
		ScalingtriggerPackageImpl theScalingtriggerPackage = (ScalingtriggerPackageImpl)(registeredPackage instanceof ScalingtriggerPackageImpl ? registeredPackage : ScalingtriggerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PalladioPackage.eNS_URI);
		PalladioPackageImpl thePalladioPackage = (PalladioPackageImpl)(registeredPackage instanceof PalladioPackageImpl ? registeredPackage : PalladioPackage.eINSTANCE);

		// Create package meta-data objects
		theAdjustmenttypePackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetgroupPackage.createPackageContents();
		thePolicyconstraintPackage.createPackageContents();
		theScalingtriggerPackage.createPackageContents();
		thePalladioPackage.createPackageContents();

		// Initialize created meta-data
		theAdjustmenttypePackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetgroupPackage.initializePackageContents();
		thePolicyconstraintPackage.initializePackageContents();
		theScalingtriggerPackage.initializePackageContents();
		thePalladioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdjustmenttypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdjustmenttypePackage.eNS_URI, theAdjustmenttypePackage);
		return theAdjustmenttypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdjustmentType() {
		return adjustmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelativeAdjustment() {
		return relativeAdjustmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelativeAdjustment_PercentageValue() {
		return (EAttribute)relativeAdjustmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelativeAdjustment_MinAdjustmentValue() {
		return (EAttribute)relativeAdjustmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsoluteAdjustment() {
		return absoluteAdjustmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsoluteAdjustment_GoalValue() {
		return (EAttribute)absoluteAdjustmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepAdjustment() {
		return stepAdjustmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepAdjustment_StepValue() {
		return (EAttribute)stepAdjustmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdjustmenttypeFactory getAdjustmenttypeFactory() {
		return (AdjustmenttypeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adjustmentTypeEClass = createEClass(ADJUSTMENT_TYPE);

		relativeAdjustmentEClass = createEClass(RELATIVE_ADJUSTMENT);
		createEAttribute(relativeAdjustmentEClass, RELATIVE_ADJUSTMENT__PERCENTAGE_VALUE);
		createEAttribute(relativeAdjustmentEClass, RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE);

		absoluteAdjustmentEClass = createEClass(ABSOLUTE_ADJUSTMENT);
		createEAttribute(absoluteAdjustmentEClass, ABSOLUTE_ADJUSTMENT__GOAL_VALUE);

		stepAdjustmentEClass = createEClass(STEP_ADJUSTMENT);
		createEAttribute(stepAdjustmentEClass, STEP_ADJUSTMENT__STEP_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpdPackage theSpdPackage = (SpdPackage)EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adjustmentTypeEClass.getESuperTypes().add(theSpdPackage.getAdjustmentType());
		relativeAdjustmentEClass.getESuperTypes().add(this.getAdjustmentType());
		absoluteAdjustmentEClass.getESuperTypes().add(this.getAdjustmentType());
		stepAdjustmentEClass.getESuperTypes().add(this.getAdjustmentType());

		// Initialize classes, features, and operations; add parameters
		initEClass(adjustmentTypeEClass, AdjustmentType.class, "AdjustmentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relativeAdjustmentEClass, RelativeAdjustment.class, "RelativeAdjustment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeAdjustment_PercentageValue(), ecorePackage.getEDouble(), "percentageValue", "0.0", 1, 1, RelativeAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeAdjustment_MinAdjustmentValue(), ecorePackage.getEInt(), "minAdjustmentValue", "0", 1, 1, RelativeAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteAdjustmentEClass, AbsoluteAdjustment.class, "AbsoluteAdjustment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsoluteAdjustment_GoalValue(), ecorePackage.getEInt(), "goalValue", "0", 1, 1, AbsoluteAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepAdjustmentEClass, StepAdjustment.class, "StepAdjustment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStepAdjustment_StepValue(), ecorePackage.getEInt(), "stepValue", "0", 1, 1, StepAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AdjustmenttypePackageImpl
