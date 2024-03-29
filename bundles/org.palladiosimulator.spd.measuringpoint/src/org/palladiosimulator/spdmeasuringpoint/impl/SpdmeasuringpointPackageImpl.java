/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.targets.TargetsPackage;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureReference;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointFactory;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdmeasuringpointPackageImpl extends EPackageImpl implements SpdmeasuringpointPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elasticInfrastructureMeasuringPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceGroupMeasuringPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass competingConsumerGroupMeasuringPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceGroupReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elasticInfrastructureReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass competingConsumerGroupReferenceEClass = null;

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
	 * @see org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpdmeasuringpointPackageImpl() {
		super(eNS_URI, SpdmeasuringpointFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpdmeasuringpointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpdmeasuringpointPackage init() {
		if (isInited)
			return (SpdmeasuringpointPackage) EPackage.Registry.INSTANCE.getEPackage(SpdmeasuringpointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpdmeasuringpointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpdmeasuringpointPackageImpl theSpdmeasuringpointPackage = registeredSpdmeasuringpointPackage instanceof SpdmeasuringpointPackageImpl
				? (SpdmeasuringpointPackageImpl) registeredSpdmeasuringpointPackage
				: new SpdmeasuringpointPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ExperimentDataPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		MeasuringpointPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		MetricSpecPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		SpdPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpdmeasuringpointPackage.createPackageContents();

		// Initialize created meta-data
		theSpdmeasuringpointPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpdmeasuringpointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpdmeasuringpointPackage.eNS_URI, theSpdmeasuringpointPackage);
		return theSpdmeasuringpointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElasticInfrastructureMeasuringPoint() {
		return elasticInfrastructureMeasuringPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceGroupMeasuringPoint() {
		return serviceGroupMeasuringPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompetingConsumerGroupMeasuringPoint() {
		return competingConsumerGroupMeasuringPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceGroupReference() {
		return serviceGroupReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceGroupReference_ServiceGroup() {
		return (EReference) serviceGroupReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElasticInfrastructureReference() {
		return elasticInfrastructureReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElasticInfrastructureReference_ElasticInfrastructure() {
		return (EReference) elasticInfrastructureReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompetingConsumerGroupReference() {
		return competingConsumerGroupReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompetingConsumerGroupReference_CompetingConsumerGroup() {
		return (EReference) competingConsumerGroupReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpdmeasuringpointFactory getSpdmeasuringpointFactory() {
		return (SpdmeasuringpointFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		elasticInfrastructureMeasuringPointEClass = createEClass(ELASTIC_INFRASTRUCTURE_MEASURING_POINT);

		serviceGroupMeasuringPointEClass = createEClass(SERVICE_GROUP_MEASURING_POINT);

		competingConsumerGroupMeasuringPointEClass = createEClass(COMPETING_CONSUMER_GROUP_MEASURING_POINT);

		serviceGroupReferenceEClass = createEClass(SERVICE_GROUP_REFERENCE);
		createEReference(serviceGroupReferenceEClass, SERVICE_GROUP_REFERENCE__SERVICE_GROUP);

		elasticInfrastructureReferenceEClass = createEClass(ELASTIC_INFRASTRUCTURE_REFERENCE);
		createEReference(elasticInfrastructureReferenceEClass,
				ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE);

		competingConsumerGroupReferenceEClass = createEClass(COMPETING_CONSUMER_GROUP_REFERENCE);
		createEReference(competingConsumerGroupReferenceEClass,
				COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MeasuringpointPackage theMeasuringpointPackage = (MeasuringpointPackage) EPackage.Registry.INSTANCE
				.getEPackage(MeasuringpointPackage.eNS_URI);
		TargetsPackage theTargetsPackage = (TargetsPackage) EPackage.Registry.INSTANCE
				.getEPackage(TargetsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elasticInfrastructureMeasuringPointEClass.getESuperTypes().add(theMeasuringpointPackage.getMeasuringPoint());
		elasticInfrastructureMeasuringPointEClass.getESuperTypes().add(this.getElasticInfrastructureReference());
		serviceGroupMeasuringPointEClass.getESuperTypes().add(theMeasuringpointPackage.getMeasuringPoint());
		serviceGroupMeasuringPointEClass.getESuperTypes().add(this.getServiceGroupReference());
		competingConsumerGroupMeasuringPointEClass.getESuperTypes().add(theMeasuringpointPackage.getMeasuringPoint());
		competingConsumerGroupMeasuringPointEClass.getESuperTypes().add(this.getCompetingConsumerGroupReference());

		// Initialize classes and features; add operations and parameters
		initEClass(elasticInfrastructureMeasuringPointEClass, ElasticInfrastructureMeasuringPoint.class,
				"ElasticInfrastructureMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceGroupMeasuringPointEClass, ServiceGroupMeasuringPoint.class, "ServiceGroupMeasuringPoint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(competingConsumerGroupMeasuringPointEClass, CompetingConsumerGroupMeasuringPoint.class,
				"CompetingConsumerGroupMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceGroupReferenceEClass, ServiceGroupReference.class, "ServiceGroupReference", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceGroupReference_ServiceGroup(), theTargetsPackage.getServiceGroup(), null,
				"serviceGroup", null, 1, 1, ServiceGroupReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elasticInfrastructureReferenceEClass, ElasticInfrastructureReference.class,
				"ElasticInfrastructureReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElasticInfrastructureReference_ElasticInfrastructure(),
				theTargetsPackage.getElasticInfrastructure(), null, "elasticInfrastructure", null, 1, 1,
				ElasticInfrastructureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(competingConsumerGroupReferenceEClass, CompetingConsumerGroupReference.class,
				"CompetingConsumerGroupReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompetingConsumerGroupReference_CompetingConsumerGroup(),
				theTargetsPackage.getCompetingConsumersGroup(), null, "competingConsumerGroup", null, 1, 1,
				CompetingConsumerGroupReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SpdmeasuringpointPackageImpl
