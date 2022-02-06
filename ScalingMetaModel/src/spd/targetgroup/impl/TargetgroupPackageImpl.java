/**
 */
package spd.targetgroup.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import spd.SpdPackage;

import spd.adjustmenttype.AdjustmenttypePackage;

import spd.adjustmenttype.impl.AdjustmenttypePackageImpl;

import spd.impl.SpdPackageImpl;

import spd.palladio.PalladioPackage;

import spd.palladio.impl.PalladioPackageImpl;

import spd.policyconstraint.PolicyconstraintPackage;

import spd.policyconstraint.impl.PolicyconstraintPackageImpl;

import spd.scalingtrigger.ScalingtriggerPackage;

import spd.scalingtrigger.impl.ScalingtriggerPackageImpl;

import spd.targetgroup.TargetGroup;
import spd.targetgroup.TargetgroupFactory;
import spd.targetgroup.TargetgroupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetgroupPackageImpl extends EPackageImpl implements TargetgroupPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetGroupEClass = null;

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
	 * @see spd.targetgroup.TargetgroupPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TargetgroupPackageImpl() {
		super(eNS_URI, TargetgroupFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TargetgroupPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TargetgroupPackage init() {
		if (isInited) return (TargetgroupPackage)EPackage.Registry.INSTANCE.getEPackage(TargetgroupPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTargetgroupPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TargetgroupPackageImpl theTargetgroupPackage = registeredTargetgroupPackage instanceof TargetgroupPackageImpl ? (TargetgroupPackageImpl)registeredTargetgroupPackage : new TargetgroupPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmenttypePackage.eNS_URI);
		AdjustmenttypePackageImpl theAdjustmenttypePackage = (AdjustmenttypePackageImpl)(registeredPackage instanceof AdjustmenttypePackageImpl ? registeredPackage : AdjustmenttypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyconstraintPackage.eNS_URI);
		PolicyconstraintPackageImpl thePolicyconstraintPackage = (PolicyconstraintPackageImpl)(registeredPackage instanceof PolicyconstraintPackageImpl ? registeredPackage : PolicyconstraintPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScalingtriggerPackage.eNS_URI);
		ScalingtriggerPackageImpl theScalingtriggerPackage = (ScalingtriggerPackageImpl)(registeredPackage instanceof ScalingtriggerPackageImpl ? registeredPackage : ScalingtriggerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PalladioPackage.eNS_URI);
		PalladioPackageImpl thePalladioPackage = (PalladioPackageImpl)(registeredPackage instanceof PalladioPackageImpl ? registeredPackage : PalladioPackage.eINSTANCE);

		// Create package meta-data objects
		theTargetgroupPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theAdjustmenttypePackage.createPackageContents();
		thePolicyconstraintPackage.createPackageContents();
		theScalingtriggerPackage.createPackageContents();
		thePalladioPackage.createPackageContents();

		// Initialize created meta-data
		theTargetgroupPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theAdjustmenttypePackage.initializePackageContents();
		thePolicyconstraintPackage.initializePackageContents();
		theScalingtriggerPackage.initializePackageContents();
		thePalladioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTargetgroupPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TargetgroupPackage.eNS_URI, theTargetgroupPackage);
		return theTargetgroupPackage;
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
	public EAttribute getTargetGroup_Name() {
		return (EAttribute)targetGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetGroup_ResourceEnvironment() {
		return (EReference)targetGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetgroupFactory getTargetgroupFactory() {
		return (TargetgroupFactory)getEFactoryInstance();
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
		targetGroupEClass = createEClass(TARGET_GROUP);
		createEAttribute(targetGroupEClass, TARGET_GROUP__NAME);
		createEReference(targetGroupEClass, TARGET_GROUP__RESOURCE_ENVIRONMENT);
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
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetGroupEClass.getESuperTypes().add(theSpdPackage.getTargetGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(targetGroupEClass, TargetGroup.class, "TargetGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, TargetGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetGroup_ResourceEnvironment(), theResourceenvironmentPackage.getResourceEnvironment(), null, "resourceEnvironment", null, 0, 1, TargetGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTargetGroup_ResourceEnvironment().getEKeys().add(theEntityPackage.getNamedElement_EntityName());
	}

} //TargetgroupPackageImpl
