/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.constraints.target.TargetPackage
 * @generated
 */
public interface TargetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetFactory eINSTANCE = org.palladiosimulator.spd.constraints.target.impl.TargetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Group Size Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Size Constraint</em>'.
	 * @generated
	 */
	TargetGroupSizeConstraint createTargetGroupSizeConstraint();

	/**
	 * Returns a new object of class '<em>Thrashing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thrashing Constraint</em>'.
	 * @generated
	 */
	ThrashingConstraint createThrashingConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetPackage getTargetPackage();

} //TargetFactory
