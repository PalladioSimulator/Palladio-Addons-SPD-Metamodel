/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
import org.palladiosimulator.spd.triggers.BaseTrigger;
import org.palladiosimulator.spd.triggers.ComposedTrigger;
import org.palladiosimulator.spd.triggers.LogicalOperator;
import org.palladiosimulator.spd.triggers.RelationalOperator;
import org.palladiosimulator.spd.triggers.ScalingTrigger;
import org.palladiosimulator.spd.triggers.SimpleFireOnTrend;
import org.palladiosimulator.spd.triggers.SimpleFireOnValue;
import org.palladiosimulator.spd.triggers.TrendPattern;
import org.palladiosimulator.spd.triggers.TriggersFactory;
import org.palladiosimulator.spd.triggers.TriggersPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class TriggersPackageImpl extends EPackageImpl implements TriggersPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingTriggerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseTriggerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedTriggerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFireOnValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFireOnTrendEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationmethodEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hddusagetypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkusagetypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trendPatternEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.spd.triggers.TriggersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TriggersPackageImpl() {
		super(eNS_URI, TriggersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TriggersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TriggersPackage init() {
		if (isInited) {
			return (TriggersPackage) EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredTriggersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TriggersPackageImpl theTriggersPackage = registeredTriggersPackage instanceof TriggersPackageImpl
				? (TriggersPackageImpl) registeredTriggersPackage
				: new TriggersPackageImpl();

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
		SpdPackageImpl theSpdPackage = (SpdPackageImpl) (registeredPackage instanceof SpdPackageImpl ? registeredPackage
				: SpdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl) (registeredPackage instanceof TargetsPackageImpl
				? registeredPackage
				: TargetsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
		AdjustmentsPackageImpl theAdjustmentsPackage = (AdjustmentsPackageImpl) (registeredPackage instanceof AdjustmentsPackageImpl
				? registeredPackage
				: AdjustmentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl) (registeredPackage instanceof ConstraintsPackageImpl
				? registeredPackage
				: ConstraintsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
				? registeredPackage
				: PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
		TargetPackageImpl theTargetPackage = (TargetPackageImpl) (registeredPackage instanceof TargetPackageImpl
				? registeredPackage
				: TargetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI);
		StimuliPackageImpl theStimuliPackage = (StimuliPackageImpl) (registeredPackage instanceof StimuliPackageImpl
				? registeredPackage
				: StimuliPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpectationsPackage.eNS_URI);
		ExpectationsPackageImpl theExpectationsPackage = (ExpectationsPackageImpl) (registeredPackage instanceof ExpectationsPackageImpl
				? registeredPackage
				: ExpectationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
		ModelsPackageImpl theModelsPackage = (ModelsPackageImpl) (registeredPackage instanceof ModelsPackageImpl
				? registeredPackage
				: ModelsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (registeredPackage instanceof DatatypesPackageImpl
				? registeredPackage
				: DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theTriggersPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		theAdjustmentsPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theTargetPackage.createPackageContents();
		theStimuliPackage.createPackageContents();
		theExpectationsPackage.createPackageContents();
		theModelsPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theTriggersPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		theAdjustmentsPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theTargetPackage.initializePackageContents();
		theStimuliPackage.initializePackageContents();
		theExpectationsPackage.initializePackageContents();
		theModelsPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTriggersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TriggersPackage.eNS_URI, theTriggersPackage);
		return theTriggersPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScalingTrigger() {
		return scalingTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseTrigger() {
		return baseTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseTrigger_Stimulus() {
		return (EReference) baseTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseTrigger_ExpectedValue() {
		return (EReference) baseTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposedTrigger() {
		return composedTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposedTrigger_Scalingtrigger() {
		return (EReference) composedTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposedTrigger_LogicalOperator() {
		return (EAttribute) composedTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleFireOnValue() {
		return simpleFireOnValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleFireOnValue_RelationalOperator() {
		return (EAttribute) simpleFireOnValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleFireOnTrend() {
		return simpleFireOnTrendEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAGGREGATIONMETHOD() {
		return aggregationmethodEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHDDUSAGETYPE() {
		return hddusagetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNETWORKUSAGETYPE() {
		return networkusagetypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationalOperator() {
		return relationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTrendPattern() {
		return trendPatternEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggersFactory getTriggersFactory() {
		return (TriggersFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		scalingTriggerEClass = createEClass(SCALING_TRIGGER);

		baseTriggerEClass = createEClass(BASE_TRIGGER);
		createEReference(baseTriggerEClass, BASE_TRIGGER__STIMULUS);
		createEReference(baseTriggerEClass, BASE_TRIGGER__EXPECTED_VALUE);

		composedTriggerEClass = createEClass(COMPOSED_TRIGGER);
		createEReference(composedTriggerEClass, COMPOSED_TRIGGER__SCALINGTRIGGER);
		createEAttribute(composedTriggerEClass, COMPOSED_TRIGGER__LOGICAL_OPERATOR);

		simpleFireOnValueEClass = createEClass(SIMPLE_FIRE_ON_VALUE);
		createEAttribute(simpleFireOnValueEClass, SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR);

		simpleFireOnTrendEClass = createEClass(SIMPLE_FIRE_ON_TREND);

		// Create enums
		aggregationmethodEEnum = createEEnum(AGGREGATIONMETHOD);
		hddusagetypeEEnum = createEEnum(HDDUSAGETYPE);
		networkusagetypeEEnum = createEEnum(NETWORKUSAGETYPE);
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
		trendPatternEEnum = createEEnum(TREND_PATTERN);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StimuliPackage theStimuliPackage = (StimuliPackage) EPackage.Registry.INSTANCE
				.getEPackage(StimuliPackage.eNS_URI);
		ExpectationsPackage theExpectationsPackage = (ExpectationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpectationsPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
				.getEPackage(IdentifierPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStimuliPackage);
		getESubpackages().add(theExpectationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scalingTriggerEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		baseTriggerEClass.getESuperTypes().add(this.getScalingTrigger());
		composedTriggerEClass.getESuperTypes().add(this.getScalingTrigger());
		simpleFireOnValueEClass.getESuperTypes().add(this.getBaseTrigger());
		simpleFireOnTrendEClass.getESuperTypes().add(this.getBaseTrigger());

		// Initialize classes and features; add operations and parameters
		initEClass(scalingTriggerEClass, ScalingTrigger.class, "ScalingTrigger", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseTriggerEClass, BaseTrigger.class, "BaseTrigger", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseTrigger_Stimulus(), theStimuliPackage.getStimulus(), null, "stimulus", null, 1, 1,
				BaseTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseTrigger_ExpectedValue(), theExpectationsPackage.getExpectedValue(), null, "expectedValue",
				null, 1, 1, BaseTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedTriggerEClass, ComposedTrigger.class, "ComposedTrigger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedTrigger_Scalingtrigger(), this.getScalingTrigger(), null, "scalingtrigger", null, 2,
				-1, ComposedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposedTrigger_LogicalOperator(), this.getLogicalOperator(), "logicalOperator", null, 0, 1,
				ComposedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(simpleFireOnValueEClass, SimpleFireOnValue.class, "SimpleFireOnValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleFireOnValue_RelationalOperator(), this.getRelationalOperator(), "relationalOperator",
				null, 0, 1, SimpleFireOnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleFireOnTrendEClass, SimpleFireOnTrend.class, "SimpleFireOnTrend", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(aggregationmethodEEnum, org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD.class,
				"AGGREGATIONMETHOD");
		addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD.AVERAGE);
		addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD.MAX);
		addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD.MIN);
		addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD.MEDIAN);
		addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD.SUM);
		addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD.RATEOFCHANGE);
		addEEnumLiteral(aggregationmethodEEnum, org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD.PERCENTILE95);

		initEEnum(hddusagetypeEEnum, org.palladiosimulator.spd.triggers.HDDUSAGETYPE.class, "HDDUSAGETYPE");
		addEEnumLiteral(hddusagetypeEEnum, org.palladiosimulator.spd.triggers.HDDUSAGETYPE.READ);
		addEEnumLiteral(hddusagetypeEEnum, org.palladiosimulator.spd.triggers.HDDUSAGETYPE.WRITE);

		initEEnum(networkusagetypeEEnum, org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE.class, "NETWORKUSAGETYPE");
		addEEnumLiteral(networkusagetypeEEnum, org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE.SEND);
		addEEnumLiteral(networkusagetypeEEnum, org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE.RECEIVE);

		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.XOR);

		initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS_THAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_THAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQUAL_TO);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LESS_THAN_OR_EQUAL_TO);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_THAN_OR_EQUAL_TO);

		initEEnum(trendPatternEEnum, TrendPattern.class, "TrendPattern");
		addEEnumLiteral(trendPatternEEnum, TrendPattern.INCREASING);
		addEEnumLiteral(trendPatternEEnum, TrendPattern.DECREASING);
		addEEnumLiteral(trendPatternEEnum, TrendPattern.NON_INCREASING);
		addEEnumLiteral(trendPatternEEnum, TrendPattern.NON_DECREASING);
	}

} // TriggersPackageImpl
