/**
 */
package spd.scalingtrigger.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import spd.SpdPackage;

import spd.adjustmenttype.AdjustmenttypePackage;

import spd.adjustmenttype.impl.AdjustmenttypePackageImpl;

import spd.impl.SpdPackageImpl;

import spd.palladio.PalladioPackage;
import spd.palladio.impl.PalladioPackageImpl;
import spd.policyconstraint.PolicyconstraintPackage;

import spd.policyconstraint.impl.PolicyconstraintPackageImpl;

import spd.scalingtrigger.CPUUtilizationTrigger;
import spd.scalingtrigger.HDDUtilizationTrigger;
import spd.scalingtrigger.IdleTimeTrigger;
import spd.scalingtrigger.NetworkUtilizationTrigger;
import spd.scalingtrigger.PointInTimeTrigger;
import spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger;
import spd.scalingtrigger.RAMUtilizationTrigger;
import spd.scalingtrigger.ResourceUtilizationBasedTrigger;
import spd.scalingtrigger.ResponseTimeTrigger;
import spd.scalingtrigger.ScalingTrigger;
import spd.scalingtrigger.ScalingtriggerFactory;
import spd.scalingtrigger.ScalingtriggerPackage;
import spd.scalingtrigger.TaskCountTrigger;
import spd.scalingtrigger.ThresholdBasedTrigger;
import spd.scalingtrigger.TimeBasedTrigger;

import spd.targetgroup.TargetgroupPackage;

import spd.targetgroup.impl.TargetgroupPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalingtriggerPackageImpl extends EPackageImpl implements ScalingtriggerPackage {
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
	private EClass thresholdBasedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuUtilizationTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramUtilizationTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hddUtilizationTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBasedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointInTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idleTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskCountTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkUtilizationTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceUtilizationBasedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceUtilizationBasedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationmethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hddusagetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkusagetypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum thresholddirectionEEnum = null;

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
	 * @see spd.scalingtrigger.ScalingtriggerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScalingtriggerPackageImpl() {
		super(eNS_URI, ScalingtriggerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScalingtriggerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScalingtriggerPackage init() {
		if (isInited) return (ScalingtriggerPackage)EPackage.Registry.INSTANCE.getEPackage(ScalingtriggerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScalingtriggerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ScalingtriggerPackageImpl theScalingtriggerPackage = registeredScalingtriggerPackage instanceof ScalingtriggerPackageImpl ? (ScalingtriggerPackageImpl)registeredScalingtriggerPackage : new ScalingtriggerPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);
		SpdPackageImpl theSpdPackage = (SpdPackageImpl)(registeredPackage instanceof SpdPackageImpl ? registeredPackage : SpdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetgroupPackage.eNS_URI);
		TargetgroupPackageImpl theTargetgroupPackage = (TargetgroupPackageImpl)(registeredPackage instanceof TargetgroupPackageImpl ? registeredPackage : TargetgroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmenttypePackage.eNS_URI);
		AdjustmenttypePackageImpl theAdjustmenttypePackage = (AdjustmenttypePackageImpl)(registeredPackage instanceof AdjustmenttypePackageImpl ? registeredPackage : AdjustmenttypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyconstraintPackage.eNS_URI);
		PolicyconstraintPackageImpl thePolicyconstraintPackage = (PolicyconstraintPackageImpl)(registeredPackage instanceof PolicyconstraintPackageImpl ? registeredPackage : PolicyconstraintPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PalladioPackage.eNS_URI);
		PalladioPackageImpl thePalladioPackage = (PalladioPackageImpl)(registeredPackage instanceof PalladioPackageImpl ? registeredPackage : PalladioPackage.eINSTANCE);

		// Create package meta-data objects
		theScalingtriggerPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetgroupPackage.createPackageContents();
		theAdjustmenttypePackage.createPackageContents();
		thePolicyconstraintPackage.createPackageContents();
		thePalladioPackage.createPackageContents();

		// Initialize created meta-data
		theScalingtriggerPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetgroupPackage.initializePackageContents();
		theAdjustmenttypePackage.initializePackageContents();
		thePolicyconstraintPackage.initializePackageContents();
		thePalladioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScalingtriggerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScalingtriggerPackage.eNS_URI, theScalingtriggerPackage);
		return theScalingtriggerPackage;
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
	public EClass getThresholdBasedTrigger() {
		return thresholdBasedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThresholdBasedTrigger_ThresholdDirection() {
		return (EAttribute)thresholdBasedTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThresholdBasedTrigger_Threshold() {
		return (EAttribute)thresholdBasedTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThresholdBasedTrigger_ViolationWindow() {
		return (EAttribute)thresholdBasedTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCPUUtilizationTrigger() {
		return cpuUtilizationTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRAMUtilizationTrigger() {
		return ramUtilizationTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHDDUtilizationTrigger() {
		return hddUtilizationTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHDDUtilizationTrigger_UsageType() {
		return (EAttribute)hddUtilizationTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeBasedTrigger() {
		return timeBasedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointInTimeTrigger() {
		return pointInTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointInTimeTrigger_PointInTime() {
		return (EAttribute)pointInTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdleTimeTrigger() {
		return idleTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdleTimeTrigger_ResourceContainer() {
		return (EReference)idleTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskCountTrigger() {
		return taskCountTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskCountTrigger_ResourceContainer() {
		return (EReference)taskCountTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskCountTrigger_ProcessingResourceAggregation() {
		return (EAttribute)taskCountTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskCountTrigger_ResourceContainerAggregation() {
		return (EAttribute)taskCountTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkUtilizationTrigger() {
		return networkUtilizationTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkUtilizationTrigger_UsageType() {
		return (EAttribute)networkUtilizationTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkUtilizationTrigger_LinkingResource() {
		return (EReference)networkUtilizationTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseTimeTrigger() {
		return responseTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseTimeTrigger_OperationSignature() {
		return (EReference)responseTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceUtilizationBasedTrigger() {
		return resourceUtilizationBasedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceUtilizationBasedTrigger_ProcessingResourceAggregation() {
		return (EAttribute)resourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceUtilizationBasedTrigger_ResourceContainerAggregation() {
		return (EAttribute)resourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingResourceUtilizationBasedTrigger() {
		return processingResourceUtilizationBasedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingResourceUtilizationBasedTrigger_ResourceContainer() {
		return (EReference)processingResourceUtilizationBasedTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAGGREGATIONMETHOD() {
		return aggregationmethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHDDUSAGETYPE() {
		return hddusagetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNETWORKUSAGETYPE() {
		return networkusagetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTHRESHOLDDIRECTION() {
		return thresholddirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalingtriggerFactory getScalingtriggerFactory() {
		return (ScalingtriggerFactory)getEFactoryInstance();
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
		scalingTriggerEClass = createEClass(SCALING_TRIGGER);

		thresholdBasedTriggerEClass = createEClass(THRESHOLD_BASED_TRIGGER);
		createEAttribute(thresholdBasedTriggerEClass, THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION);
		createEAttribute(thresholdBasedTriggerEClass, THRESHOLD_BASED_TRIGGER__THRESHOLD);
		createEAttribute(thresholdBasedTriggerEClass, THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW);

		cpuUtilizationTriggerEClass = createEClass(CPU_UTILIZATION_TRIGGER);

		ramUtilizationTriggerEClass = createEClass(RAM_UTILIZATION_TRIGGER);

		hddUtilizationTriggerEClass = createEClass(HDD_UTILIZATION_TRIGGER);
		createEAttribute(hddUtilizationTriggerEClass, HDD_UTILIZATION_TRIGGER__USAGE_TYPE);

		timeBasedTriggerEClass = createEClass(TIME_BASED_TRIGGER);

		pointInTimeTriggerEClass = createEClass(POINT_IN_TIME_TRIGGER);
		createEAttribute(pointInTimeTriggerEClass, POINT_IN_TIME_TRIGGER__POINT_IN_TIME);

		idleTimeTriggerEClass = createEClass(IDLE_TIME_TRIGGER);
		createEReference(idleTimeTriggerEClass, IDLE_TIME_TRIGGER__RESOURCE_CONTAINER);

		taskCountTriggerEClass = createEClass(TASK_COUNT_TRIGGER);
		createEReference(taskCountTriggerEClass, TASK_COUNT_TRIGGER__RESOURCE_CONTAINER);
		createEAttribute(taskCountTriggerEClass, TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION);
		createEAttribute(taskCountTriggerEClass, TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION);

		networkUtilizationTriggerEClass = createEClass(NETWORK_UTILIZATION_TRIGGER);
		createEAttribute(networkUtilizationTriggerEClass, NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE);
		createEReference(networkUtilizationTriggerEClass, NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE);

		responseTimeTriggerEClass = createEClass(RESPONSE_TIME_TRIGGER);
		createEReference(responseTimeTriggerEClass, RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE);

		resourceUtilizationBasedTriggerEClass = createEClass(RESOURCE_UTILIZATION_BASED_TRIGGER);
		createEAttribute(resourceUtilizationBasedTriggerEClass, RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION);
		createEAttribute(resourceUtilizationBasedTriggerEClass, RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION);

		processingResourceUtilizationBasedTriggerEClass = createEClass(PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER);
		createEReference(processingResourceUtilizationBasedTriggerEClass, PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER);

		// Create enums
		aggregationmethodEEnum = createEEnum(AGGREGATIONMETHOD);
		hddusagetypeEEnum = createEEnum(HDDUSAGETYPE);
		networkusagetypeEEnum = createEEnum(NETWORKUSAGETYPE);
		thresholddirectionEEnum = createEEnum(THRESHOLDDIRECTION);
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
		PalladioPackage thePalladioPackage = (PalladioPackage)EPackage.Registry.INSTANCE.getEPackage(PalladioPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scalingTriggerEClass.getESuperTypes().add(theSpdPackage.getScalingTrigger());
		thresholdBasedTriggerEClass.getESuperTypes().add(this.getScalingTrigger());
		cpuUtilizationTriggerEClass.getESuperTypes().add(this.getProcessingResourceUtilizationBasedTrigger());
		ramUtilizationTriggerEClass.getESuperTypes().add(this.getProcessingResourceUtilizationBasedTrigger());
		hddUtilizationTriggerEClass.getESuperTypes().add(this.getProcessingResourceUtilizationBasedTrigger());
		timeBasedTriggerEClass.getESuperTypes().add(this.getThresholdBasedTrigger());
		pointInTimeTriggerEClass.getESuperTypes().add(this.getScalingTrigger());
		idleTimeTriggerEClass.getESuperTypes().add(this.getTimeBasedTrigger());
		taskCountTriggerEClass.getESuperTypes().add(this.getThresholdBasedTrigger());
		networkUtilizationTriggerEClass.getESuperTypes().add(this.getResourceUtilizationBasedTrigger());
		responseTimeTriggerEClass.getESuperTypes().add(this.getTimeBasedTrigger());
		resourceUtilizationBasedTriggerEClass.getESuperTypes().add(this.getThresholdBasedTrigger());
		processingResourceUtilizationBasedTriggerEClass.getESuperTypes().add(this.getResourceUtilizationBasedTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(scalingTriggerEClass, ScalingTrigger.class, "ScalingTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thresholdBasedTriggerEClass, ThresholdBasedTrigger.class, "ThresholdBasedTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThresholdBasedTrigger_ThresholdDirection(), this.getTHRESHOLDDIRECTION(), "thresholdDirection", null, 0, 1, ThresholdBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThresholdBasedTrigger_Threshold(), ecorePackage.getEDouble(), "threshold", "0.0", 1, 1, ThresholdBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThresholdBasedTrigger_ViolationWindow(), ecorePackage.getEDouble(), "violationWindow", null, 1, 1, ThresholdBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuUtilizationTriggerEClass, CPUUtilizationTrigger.class, "CPUUtilizationTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ramUtilizationTriggerEClass, RAMUtilizationTrigger.class, "RAMUtilizationTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hddUtilizationTriggerEClass, HDDUtilizationTrigger.class, "HDDUtilizationTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHDDUtilizationTrigger_UsageType(), this.getHDDUSAGETYPE(), "usageType", null, 0, 1, HDDUtilizationTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeBasedTriggerEClass, TimeBasedTrigger.class, "TimeBasedTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointInTimeTriggerEClass, PointInTimeTrigger.class, "PointInTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointInTimeTrigger_PointInTime(), ecorePackage.getEDouble(), "pointInTime", null, 1, 1, PointInTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idleTimeTriggerEClass, IdleTimeTrigger.class, "IdleTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdleTimeTrigger_ResourceContainer(), thePalladioPackage.getPCMResourceContainer(), null, "resourceContainer", null, 0, -1, IdleTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskCountTriggerEClass, TaskCountTrigger.class, "TaskCountTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskCountTrigger_ResourceContainer(), thePalladioPackage.getPCMResourceContainer(), null, "resourceContainer", null, 0, -1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCountTrigger_ProcessingResourceAggregation(), this.getAGGREGATIONMETHOD(), "processingResourceAggregation", null, 0, 1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCountTrigger_ResourceContainerAggregation(), this.getAGGREGATIONMETHOD(), "resourceContainerAggregation", null, 0, 1, TaskCountTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkUtilizationTriggerEClass, NetworkUtilizationTrigger.class, "NetworkUtilizationTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkUtilizationTrigger_UsageType(), this.getNETWORKUSAGETYPE(), "usageType", null, 0, 1, NetworkUtilizationTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkUtilizationTrigger_LinkingResource(), thePalladioPackage.getPCMLinkingResource(), null, "linkingResource", null, 0, -1, NetworkUtilizationTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseTimeTriggerEClass, ResponseTimeTrigger.class, "ResponseTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseTimeTrigger_OperationSignature(), thePalladioPackage.getPCMOperationSignature(), null, "operationSignature", null, 0, -1, ResponseTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceUtilizationBasedTriggerEClass, ResourceUtilizationBasedTrigger.class, "ResourceUtilizationBasedTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceUtilizationBasedTrigger_ProcessingResourceAggregation(), this.getAGGREGATIONMETHOD(), "processingResourceAggregation", null, 0, 1, ResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceUtilizationBasedTrigger_ResourceContainerAggregation(), this.getAGGREGATIONMETHOD(), "resourceContainerAggregation", null, 0, 1, ResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceUtilizationBasedTriggerEClass, ProcessingResourceUtilizationBasedTrigger.class, "ProcessingResourceUtilizationBasedTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingResourceUtilizationBasedTrigger_ResourceContainer(), thePalladioPackage.getPCMResourceContainer(), null, "resourceContainer", null, 0, -1, ProcessingResourceUtilizationBasedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.class, "AGGREGATIONMETHOD");
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.AVERAGE);
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.MAX);
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.MIN);
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.MEDIAN);
		addEEnumLiteral(aggregationmethodEEnum, spd.scalingtrigger.AGGREGATIONMETHOD.SUM);

		initEEnum(hddusagetypeEEnum, spd.scalingtrigger.HDDUSAGETYPE.class, "HDDUSAGETYPE");
		addEEnumLiteral(hddusagetypeEEnum, spd.scalingtrigger.HDDUSAGETYPE.READ);
		addEEnumLiteral(hddusagetypeEEnum, spd.scalingtrigger.HDDUSAGETYPE.WRITE);

		initEEnum(networkusagetypeEEnum, spd.scalingtrigger.NETWORKUSAGETYPE.class, "NETWORKUSAGETYPE");
		addEEnumLiteral(networkusagetypeEEnum, spd.scalingtrigger.NETWORKUSAGETYPE.SEND);
		addEEnumLiteral(networkusagetypeEEnum, spd.scalingtrigger.NETWORKUSAGETYPE.RECEIVE);

		initEEnum(thresholddirectionEEnum, spd.scalingtrigger.THRESHOLDDIRECTION.class, "THRESHOLDDIRECTION");
		addEEnumLiteral(thresholddirectionEEnum, spd.scalingtrigger.THRESHOLDDIRECTION.EXCEDEED);
		addEEnumLiteral(thresholddirectionEEnum, spd.scalingtrigger.THRESHOLDDIRECTION.UNDERCUT);
	}

} //ScalingtriggerPackageImpl
