/**
 */
package spd.palladio.impl;

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

import spd.adjustmenttype.AdjustmenttypePackage;

import spd.adjustmenttype.impl.AdjustmenttypePackageImpl;

import spd.impl.SpdPackageImpl;

import spd.palladio.PCMLinkingResource;
import spd.palladio.PCMOperationSignature;
import spd.palladio.PCMResourceContainer;
import spd.palladio.PCMResourceEnvironment;
import spd.palladio.PalladioFactory;
import spd.palladio.PalladioPackage;

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
public class PalladioPackageImpl extends EPackageImpl implements PalladioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmResourceEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmResourceContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmLinkingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmOperationSignatureEClass = null;

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
	 * @see spd.palladio.PalladioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PalladioPackageImpl() {
		super(eNS_URI, PalladioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PalladioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PalladioPackage init() {
		if (isInited) return (PalladioPackage)EPackage.Registry.INSTANCE.getEPackage(PalladioPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPalladioPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PalladioPackageImpl thePalladioPackage = registeredPalladioPackage instanceof PalladioPackageImpl ? (PalladioPackageImpl)registeredPalladioPackage : new PalladioPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmenttypePackage.eNS_URI);
		AdjustmenttypePackageImpl theAdjustmenttypePackage = (AdjustmenttypePackageImpl)(registeredPackage instanceof AdjustmenttypePackageImpl ? registeredPackage : AdjustmenttypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyconstraintPackage.eNS_URI);
		PolicyconstraintPackageImpl thePolicyconstraintPackage = (PolicyconstraintPackageImpl)(registeredPackage instanceof PolicyconstraintPackageImpl ? registeredPackage : PolicyconstraintPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScalingtriggerPackage.eNS_URI);
		ScalingtriggerPackageImpl theScalingtriggerPackage = (ScalingtriggerPackageImpl)(registeredPackage instanceof ScalingtriggerPackageImpl ? registeredPackage : ScalingtriggerPackage.eINSTANCE);

		// Create package meta-data objects
		thePalladioPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetgroupPackage.createPackageContents();
		theAdjustmenttypePackage.createPackageContents();
		thePolicyconstraintPackage.createPackageContents();
		theScalingtriggerPackage.createPackageContents();

		// Initialize created meta-data
		thePalladioPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetgroupPackage.initializePackageContents();
		theAdjustmenttypePackage.initializePackageContents();
		thePolicyconstraintPackage.initializePackageContents();
		theScalingtriggerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePalladioPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PalladioPackage.eNS_URI, thePalladioPackage);
		return thePalladioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMResourceEnvironment() {
		return pcmResourceEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPCMResourceEnvironment_Name() {
		return (EAttribute)pcmResourceEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMResourceContainer() {
		return pcmResourceContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPCMResourceContainer_Name() {
		return (EAttribute)pcmResourceContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMLinkingResource() {
		return pcmLinkingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPCMLinkingResource_Name() {
		return (EAttribute)pcmLinkingResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMOperationSignature() {
		return pcmOperationSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPCMOperationSignature_Name() {
		return (EAttribute)pcmOperationSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PalladioFactory getPalladioFactory() {
		return (PalladioFactory)getEFactoryInstance();
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
		pcmResourceEnvironmentEClass = createEClass(PCM_RESOURCE_ENVIRONMENT);
		createEAttribute(pcmResourceEnvironmentEClass, PCM_RESOURCE_ENVIRONMENT__NAME);

		pcmResourceContainerEClass = createEClass(PCM_RESOURCE_CONTAINER);
		createEAttribute(pcmResourceContainerEClass, PCM_RESOURCE_CONTAINER__NAME);

		pcmLinkingResourceEClass = createEClass(PCM_LINKING_RESOURCE);
		createEAttribute(pcmLinkingResourceEClass, PCM_LINKING_RESOURCE__NAME);

		pcmOperationSignatureEClass = createEClass(PCM_OPERATION_SIGNATURE);
		createEAttribute(pcmOperationSignatureEClass, PCM_OPERATION_SIGNATURE__NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pcmResourceEnvironmentEClass, PCMResourceEnvironment.class, "PCMResourceEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCMResourceEnvironment_Name(), ecorePackage.getEString(), "name", null, 0, 1, PCMResourceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmResourceContainerEClass, PCMResourceContainer.class, "PCMResourceContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCMResourceContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, PCMResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmLinkingResourceEClass, PCMLinkingResource.class, "PCMLinkingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCMLinkingResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, PCMLinkingResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmOperationSignatureEClass, PCMOperationSignature.class, "PCMOperationSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCMOperationSignature_Name(), ecorePackage.getEString(), "name", null, 0, 1, PCMOperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PalladioPackageImpl
