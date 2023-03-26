/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.impl.AdjustmentsPackageImpl;
import org.palladiosimulator.spd.constraints.AbstractConstraint;
import org.palladiosimulator.spd.constraints.ConstraintsFactory;
import org.palladiosimulator.spd.constraints.ConstraintsPackage;
import org.palladiosimulator.spd.constraints.StateBasedContraint;
import org.palladiosimulator.spd.constraints.TemporalConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;
import org.palladiosimulator.spd.constraints.policy.impl.PolicyPackageImpl;
import org.palladiosimulator.spd.constraints.target.TargetPackage;
import org.palladiosimulator.spd.constraints.target.impl.TargetPackageImpl;
import org.palladiosimulator.spd.impl.SpdPackageImpl;
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
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsPackageImpl extends EPackageImpl implements ConstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateBasedContraintEClass = null;

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
	 * @see org.palladiosimulator.spd.constraints.ConstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintsPackageImpl() {
		super(eNS_URI, ConstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintsPackage init() {
		if (isInited)
			return (ConstraintsPackage) EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConstraintsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConstraintsPackageImpl theConstraintsPackage = registeredConstraintsPackage instanceof ConstraintsPackageImpl
				? (ConstraintsPackageImpl) registeredConstraintsPackage
				: new ConstraintsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
				? registeredPackage
				: PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
		TargetPackageImpl theTargetPackage = (TargetPackageImpl) (registeredPackage instanceof TargetPackageImpl
				? registeredPackage
				: TargetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl) (registeredPackage instanceof TriggersPackageImpl
				? registeredPackage
				: TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI);
		StimuliPackageImpl theStimuliPackage = (StimuliPackageImpl) (registeredPackage instanceof StimuliPackageImpl
				? registeredPackage
				: StimuliPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpectationsPackage.eNS_URI);
		ExpectationsPackageImpl theExpectationsPackage = (ExpectationsPackageImpl) (registeredPackage instanceof ExpectationsPackageImpl
				? registeredPackage
				: ExpectationsPackage.eINSTANCE);

		// Create package meta-data objects
		theConstraintsPackage.createPackageContents();
		theSpdPackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		theAdjustmentsPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theTargetPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theStimuliPackage.createPackageContents();
		theExpectationsPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintsPackage.initializePackageContents();
		theSpdPackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		theAdjustmentsPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theTargetPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theStimuliPackage.initializePackageContents();
		theExpectationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintsPackage.eNS_URI, theConstraintsPackage);
		return theConstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractConstraint() {
		return abstractConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalConstraint() {
		return temporalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateBasedContraint() {
		return stateBasedContraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintsFactory getConstraintsFactory() {
		return (ConstraintsFactory) getEFactoryInstance();
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
		abstractConstraintEClass = createEClass(ABSTRACT_CONSTRAINT);

		temporalConstraintEClass = createEClass(TEMPORAL_CONSTRAINT);

		stateBasedContraintEClass = createEClass(STATE_BASED_CONTRAINT);
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
		PolicyPackage thePolicyPackage = (PolicyPackage) EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		TargetPackage theTargetPackage = (TargetPackage) EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
				.getEPackage(IdentifierPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePolicyPackage);
		getESubpackages().add(theTargetPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractConstraintEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		temporalConstraintEClass.getESuperTypes().add(this.getAbstractConstraint());
		stateBasedContraintEClass.getESuperTypes().add(this.getAbstractConstraint());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractConstraintEClass, AbstractConstraint.class, "AbstractConstraint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalConstraintEClass, TemporalConstraint.class, "TemporalConstraint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateBasedContraintEClass, StateBasedContraint.class, "StateBasedContraint", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ConstraintsPackageImpl
