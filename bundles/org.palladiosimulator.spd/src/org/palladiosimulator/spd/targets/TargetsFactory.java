/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.targets.TargetsPackage
 * @generated
 */
public interface TargetsFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TargetsFactory eINSTANCE = org.palladiosimulator.spd.targets.impl.TargetsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Elastic Infrastructure</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Elastic Infrastructure</em>'.
     * @generated
     */
    ElasticInfrastructure createElasticInfrastructure();

    /**
     * Returns a new object of class '<em>Service Group</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Service Group</em>'.
     * @generated
     */
    ServiceGroup createServiceGroup();

    /**
     * Returns a new object of class '<em>Competing Consumers Group</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Competing Consumers Group</em>'.
     * @generated
     */
    CompetingConsumersGroup createCompetingConsumersGroup();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    TargetsPackage getTargetsPackage();

} // TargetsFactory
