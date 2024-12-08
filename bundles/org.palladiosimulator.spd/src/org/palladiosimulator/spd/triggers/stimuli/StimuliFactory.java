/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage
 * @generated
 */
public interface StimuliFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    StimuliFactory eINSTANCE = org.palladiosimulator.spd.triggers.stimuli.impl.StimuliFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Operation Response Time</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Operation Response Time</em>'.
     * @generated
     */
    OperationResponseTime createOperationResponseTime();

    /**
     * Returns a new object of class '<em>Number Of Elements</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Number Of Elements</em>'.
     * @generated
     */
    NumberOfElements createNumberOfElements();

    /**
     * Returns a new object of class '<em>CPU Utilization</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>CPU Utilization</em>'.
     * @generated
     */
    CPUUtilization createCPUUtilization();

    /**
     * Returns a new object of class '<em>Memory Utilization</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Memory Utilization</em>'.
     * @generated
     */
    MemoryUtilization createMemoryUtilization();

    /**
     * Returns a new object of class '<em>Simulation Time</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Simulation Time</em>'.
     * @generated
     */
    SimulationTime createSimulationTime();

    /**
     * Returns a new object of class '<em>HDD Utilization</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>HDD Utilization</em>'.
     * @generated
     */
    HDDUtilization createHDDUtilization();

    /**
     * Returns a new object of class '<em>Task Count</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Task Count</em>'.
     * @generated
     */
    TaskCount createTaskCount();

    /**
     * Returns a new object of class '<em>Queue Length</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Queue Length</em>'.
     * @generated
     */
    QueueLength createQueueLength();

    /**
     * Returns a new object of class '<em>Network Utilization</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Network Utilization</em>'.
     * @generated
     */
    NetworkUtilization createNetworkUtilization();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    StimuliPackage getStimuliPackage();

} // StimuliFactory
