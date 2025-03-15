/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage
 * @generated
 */
public interface TriggersFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TriggersFactory eINSTANCE = org.palladiosimulator.spd.triggers.impl.TriggersFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Composed Trigger</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Composed Trigger</em>'.
     * @generated
     */
    ComposedTrigger createComposedTrigger();

    /**
     * Returns a new object of class '<em>Simple Fire On Value</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Simple Fire On Value</em>'.
     * @generated
     */
    SimpleFireOnValue createSimpleFireOnValue();

    /**
     * Returns a new object of class '<em>Simple Fire On Trend</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Simple Fire On Trend</em>'.
     * @generated
     */
    SimpleFireOnTrend createSimpleFireOnTrend();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    TriggersPackage getTriggersPackage();

} // TriggersFactory
