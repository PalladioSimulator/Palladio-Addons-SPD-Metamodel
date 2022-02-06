/**
 */
package spd.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;
import spd.AdjustmentType;
import spd.PolicyConstraint;
import spd.ScalingPolicy;
import spd.ScalingTrigger;
import spd.SpdFactory;
import spd.SpdPackage;
import spd.TargetGroup;

import spd.adjustmenttype.AdjustmenttypePackage;

import spd.adjustmenttype.impl.AdjustmenttypePackageImpl;

import spd.palladio.PalladioPackage;

import spd.palladio.impl.PalladioPackageImpl;

import spd.policyconstraint.PolicyconstraintPackage;

import spd.policyconstraint.impl.PolicyconstraintPackageImpl;

import spd.scalingtrigger.ScalingtriggerPackage;

import spd.scalingtrigger.impl.ScalingtriggerPackageImpl;

import spd.targetgroup.TargetgroupPackage;

import spd.targetgroup.impl.TargetgroupPackageImpl;

import spd.util.SpdValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdPackageImpl extends EPackageImpl implements SpdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetGroupEClass = null;

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
	private EClass scalingTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyConstraintEClass = null;

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
	 * @see spd.SpdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpdPackageImpl() {
		super(eNS_URI, SpdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpdPackage init() {
		if (isInited) return (SpdPackage)EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpdPackageImpl theSpdPackage = registeredSpdPackage instanceof SpdPackageImpl ? (SpdPackageImpl)registeredSpdPackage : new SpdPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetgroupPackage.eNS_URI);
		TargetgroupPackageImpl theTargetgroupPackage = (TargetgroupPackageImpl)(registeredPackage instanceof TargetgroupPackageImpl ? registeredPackage : TargetgroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmenttypePackage.eNS_URI);
		AdjustmenttypePackageImpl theAdjustmenttypePackage = (AdjustmenttypePackageImpl)(registeredPackage instanceof AdjustmenttypePackageImpl ? registeredPackage : AdjustmenttypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyconstraintPackage.eNS_URI);
		PolicyconstraintPackageImpl thePolicyconstraintPackage = (PolicyconstraintPackageImpl)(registeredPackage instanceof PolicyconstraintPackageImpl ? registeredPackage : PolicyconstraintPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScalingtriggerPackage.eNS_URI);
		ScalingtriggerPackageImpl theScalingtriggerPackage = (ScalingtriggerPackageImpl)(registeredPackage instanceof ScalingtriggerPackageImpl ? registeredPackage : ScalingtriggerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PalladioPackage.eNS_URI);
		PalladioPackageImpl thePalladioPackage = (PalladioPackageImpl)(registeredPackage instanceof PalladioPackageImpl ? registeredPackage : PalladioPackage.eINSTANCE);

		// Create package meta-data objects
		theSpdPackage.createPackageContents();
		theTargetgroupPackage.createPackageContents();
		theAdjustmenttypePackage.createPackageContents();
		thePolicyconstraintPackage.createPackageContents();
		theScalingtriggerPackage.createPackageContents();
		thePalladioPackage.createPackageContents();

		// Initialize created meta-data
		theSpdPackage.initializePackageContents();
		theTargetgroupPackage.initializePackageContents();
		theAdjustmenttypePackage.initializePackageContents();
		thePolicyconstraintPackage.initializePackageContents();
		theScalingtriggerPackage.initializePackageContents();
		thePalladioPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSpdPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return SpdValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSpdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpdPackage.eNS_URI, theSpdPackage);
		return theSpdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScalingPolicy() {
		return scalingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScalingPolicy_Targetgroup() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScalingPolicy_Adjustmenttype() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScalingPolicy_Scalingtrigger() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScalingPolicy_Policyconstraint() {
		return (EReference)scalingPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalingPolicy_PolicyName() {
		return (EAttribute)scalingPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalingPolicy_Active() {
		return (EAttribute)scalingPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSPD() {
		return spdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSPD_Scalingpolicy() {
		return (EReference)spdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSPD_Name() {
		return (EAttribute)spdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetGroup() {
		return targetGroupEClass;
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
	public EClass getScalingTrigger() {
		return scalingTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyConstraint() {
		return policyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpdFactory getSpdFactory() {
		return (SpdFactory)getEFactoryInstance();
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
		scalingPolicyEClass = createEClass(SCALING_POLICY);
		createEReference(scalingPolicyEClass, SCALING_POLICY__TARGETGROUP);
		createEReference(scalingPolicyEClass, SCALING_POLICY__ADJUSTMENTTYPE);
		createEReference(scalingPolicyEClass, SCALING_POLICY__SCALINGTRIGGER);
		createEReference(scalingPolicyEClass, SCALING_POLICY__POLICYCONSTRAINT);
		createEAttribute(scalingPolicyEClass, SCALING_POLICY__POLICY_NAME);
		createEAttribute(scalingPolicyEClass, SCALING_POLICY__ACTIVE);

		spdEClass = createEClass(SPD);
		createEReference(spdEClass, SPD__SCALINGPOLICY);
		createEAttribute(spdEClass, SPD__NAME);

		targetGroupEClass = createEClass(TARGET_GROUP);

		adjustmentTypeEClass = createEClass(ADJUSTMENT_TYPE);

		scalingTriggerEClass = createEClass(SCALING_TRIGGER);

		policyConstraintEClass = createEClass(POLICY_CONSTRAINT);
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
		TargetgroupPackage theTargetgroupPackage = (TargetgroupPackage)EPackage.Registry.INSTANCE.getEPackage(TargetgroupPackage.eNS_URI);
		AdjustmenttypePackage theAdjustmenttypePackage = (AdjustmenttypePackage)EPackage.Registry.INSTANCE.getEPackage(AdjustmenttypePackage.eNS_URI);
		PolicyconstraintPackage thePolicyconstraintPackage = (PolicyconstraintPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyconstraintPackage.eNS_URI);
		ScalingtriggerPackage theScalingtriggerPackage = (ScalingtriggerPackage)EPackage.Registry.INSTANCE.getEPackage(ScalingtriggerPackage.eNS_URI);
		PalladioPackage thePalladioPackage = (PalladioPackage)EPackage.Registry.INSTANCE.getEPackage(PalladioPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTargetgroupPackage);
		getESubpackages().add(theAdjustmenttypePackage);
		getESubpackages().add(thePolicyconstraintPackage);
		getESubpackages().add(theScalingtriggerPackage);
		getESubpackages().add(thePalladioPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(scalingPolicyEClass, ScalingPolicy.class, "ScalingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScalingPolicy_Targetgroup(), this.getTargetGroup(), null, "targetgroup", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalingPolicy_Adjustmenttype(), this.getAdjustmentType(), null, "adjustmenttype", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalingPolicy_Scalingtrigger(), this.getScalingTrigger(), null, "scalingtrigger", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScalingPolicy_Policyconstraint(), this.getPolicyConstraint(), null, "policyconstraint", null, 0, -1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingPolicy_PolicyName(), ecorePackage.getEString(), "policyName", null, 0, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScalingPolicy_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spdEClass, spd.SPD.class, "SPD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPD_Scalingpolicy(), this.getScalingPolicy(), null, "scalingpolicy", null, 1, -1, spd.SPD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPD_Name(), ecorePackage.getEString(), "name", null, 0, 1, spd.SPD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetGroupEClass, TargetGroup.class, "TargetGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adjustmentTypeEClass, AdjustmentType.class, "AdjustmentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scalingTriggerEClass, ScalingTrigger.class, "ScalingTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(policyConstraintEClass, PolicyConstraint.class, "PolicyConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (scalingPolicyEClass,
		   source,
		   new String[] {
			   "constraints", "policyNameInvariant"
		   });
		addAnnotation
		  (spdEClass,
		   source,
		   new String[] {
			   "constraints", "nameInvariant noSameTargetGroup"
		   });
	}

} //SpdPackageImpl
