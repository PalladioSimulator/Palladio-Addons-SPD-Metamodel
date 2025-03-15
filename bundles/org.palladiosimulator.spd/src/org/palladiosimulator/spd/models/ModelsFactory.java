/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage
 * @generated
 */
public interface ModelsFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ModelsFactory eINSTANCE = org.palladiosimulator.spd.models.impl.ModelsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Random Model</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Random Model</em>'.
     * @generated
     */
    RandomModel createRandomModel();

    /**
     * Returns a new object of class '<em>Fuzzy QLearning Model</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Fuzzy QLearning Model</em>'.
     * @generated
     */
    FuzzyQLearningModel createFuzzyQLearningModel();

    /**
     * Returns a new object of class '<em>Fuzzy SARSA Model</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Fuzzy SARSA Model</em>'.
     * @generated
     */
    FuzzySARSAModel createFuzzySARSAModel();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    ModelsPackage getModelsPackage();

} // ModelsFactory
