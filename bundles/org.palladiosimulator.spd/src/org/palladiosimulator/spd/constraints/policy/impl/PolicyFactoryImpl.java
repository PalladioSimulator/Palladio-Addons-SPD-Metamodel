/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.constraints.policy.CooldownConstraint;
import org.palladiosimulator.spd.constraints.policy.IntervallConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyFactory;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyFactoryImpl extends EFactoryImpl implements PolicyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolicyFactory init() {
		try {
			PolicyFactory thePolicyFactory = (PolicyFactory) EPackage.Registry.INSTANCE
					.getEFactory(PolicyPackage.eNS_URI);
			if (thePolicyFactory != null) {
				return thePolicyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolicyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PolicyPackage.INTERVALL_CONSTRAINT:
			return createIntervallConstraint();
		case PolicyPackage.COOLDOWN_CONSTRAINT:
			return createCooldownConstraint();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntervallConstraint createIntervallConstraint() {
		IntervallConstraintImpl intervallConstraint = new IntervallConstraintImpl();
		return intervallConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CooldownConstraint createCooldownConstraint() {
		CooldownConstraintImpl cooldownConstraint = new CooldownConstraintImpl();
		return cooldownConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyPackage getPolicyPackage() {
		return (PolicyPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolicyPackage getPackage() {
		return PolicyPackage.eINSTANCE;
	}

} //PolicyFactoryImpl
