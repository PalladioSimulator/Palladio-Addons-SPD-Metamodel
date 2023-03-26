/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.constraints.policy.PolicyPackage
 * @generated
 */
public interface PolicyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolicyFactory eINSTANCE = org.palladiosimulator.spd.constraints.policy.impl.PolicyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intervall Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervall Constraint</em>'.
	 * @generated
	 */
	IntervallConstraint createIntervallConstraint();

	/**
	 * Returns a new object of class '<em>Cooldown Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cooldown Constraint</em>'.
	 * @generated
	 */
	CooldownConstraint createCooldownConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolicyPackage getPolicyPackage();

} //PolicyFactory
