/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.triggers.stimuli.CPUUtilization;
import org.palladiosimulator.spd.triggers.stimuli.HDDUtilization;
import org.palladiosimulator.spd.triggers.stimuli.MemoryUtilization;
import org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization;
import org.palladiosimulator.spd.triggers.stimuli.NumberOfElements;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.QueueLength;
import org.palladiosimulator.spd.triggers.stimuli.SimulationTime;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.spd.triggers.stimuli.TaskCount;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class StimuliFactoryImpl extends EFactoryImpl implements StimuliFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static StimuliFactory init() {
        try {
            final StimuliFactory theStimuliFactory = (StimuliFactory) EPackage.Registry.INSTANCE
                .getEFactory(StimuliPackage.eNS_URI);
            if (theStimuliFactory != null) {
                return theStimuliFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StimuliFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StimuliFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case StimuliPackage.OPERATION_RESPONSE_TIME:
            return this.createOperationResponseTime();
        case StimuliPackage.NUMBER_OF_ELEMENTS:
            return this.createNumberOfElements();
        case StimuliPackage.CPU_UTILIZATION:
            return this.createCPUUtilization();
        case StimuliPackage.MEMORY_UTILIZATION:
            return this.createMemoryUtilization();
        case StimuliPackage.SIMULATION_TIME:
            return this.createSimulationTime();
        case StimuliPackage.HDD_UTILIZATION:
            return this.createHDDUtilization();
        case StimuliPackage.TASK_COUNT:
            return this.createTaskCount();
        case StimuliPackage.QUEUE_LENGTH:
            return this.createQueueLength();
        case StimuliPackage.NETWORK_UTILIZATION:
            return this.createNetworkUtilization();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OperationResponseTime createOperationResponseTime() {
        final OperationResponseTimeImpl operationResponseTime = new OperationResponseTimeImpl();
        return operationResponseTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumberOfElements createNumberOfElements() {
        final NumberOfElementsImpl numberOfElements = new NumberOfElementsImpl();
        return numberOfElements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CPUUtilization createCPUUtilization() {
        final CPUUtilizationImpl cpuUtilization = new CPUUtilizationImpl();
        return cpuUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MemoryUtilization createMemoryUtilization() {
        final MemoryUtilizationImpl memoryUtilization = new MemoryUtilizationImpl();
        return memoryUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimulationTime createSimulationTime() {
        final SimulationTimeImpl simulationTime = new SimulationTimeImpl();
        return simulationTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public HDDUtilization createHDDUtilization() {
        final HDDUtilizationImpl hddUtilization = new HDDUtilizationImpl();
        return hddUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TaskCount createTaskCount() {
        final TaskCountImpl taskCount = new TaskCountImpl();
        return taskCount;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public QueueLength createQueueLength() {
        final QueueLengthImpl queueLength = new QueueLengthImpl();
        return queueLength;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NetworkUtilization createNetworkUtilization() {
        final NetworkUtilizationImpl networkUtilization = new NetworkUtilizationImpl();
        return networkUtilization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StimuliPackage getStimuliPackage() {
        return (StimuliPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StimuliPackage getPackage() {
        return StimuliPackage.eINSTANCE;
    }

} // StimuliFactoryImpl
