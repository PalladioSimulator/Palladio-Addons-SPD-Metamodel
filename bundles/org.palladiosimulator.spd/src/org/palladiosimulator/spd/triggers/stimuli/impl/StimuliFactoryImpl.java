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
 * @generated
 */
public class StimuliFactoryImpl extends EFactoryImpl implements StimuliFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static StimuliFactory init() {
		try {
			StimuliFactory theStimuliFactory = (StimuliFactory) EPackage.Registry.INSTANCE
					.getEFactory(StimuliPackage.eNS_URI);
			if (theStimuliFactory != null) {
				return theStimuliFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StimuliFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StimuliPackage.OPERATION_RESPONSE_TIME:
			return (EObject) createOperationResponseTime();
		case StimuliPackage.NUMBER_OF_ELEMENTS:
			return (EObject) createNumberOfElements();
		case StimuliPackage.CPU_UTILIZATION:
			return (EObject) createCPUUtilization();
		case StimuliPackage.MEMORY_UTILIZATION:
			return (EObject) createMemoryUtilization();
		case StimuliPackage.SIMULATION_TIME:
			return (EObject) createSimulationTime();
		case StimuliPackage.HDD_UTILIZATION:
			return (EObject) createHDDUtilization();
		case StimuliPackage.TASK_COUNT:
			return (EObject) createTaskCount();
		case StimuliPackage.QUEUE_LENGTH:
			return (EObject) createQueueLength();
		case StimuliPackage.NETWORK_UTILIZATION:
			return (EObject) createNetworkUtilization();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationResponseTime createOperationResponseTime() {
		OperationResponseTimeImpl operationResponseTime = new OperationResponseTimeImpl();
		return operationResponseTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberOfElements createNumberOfElements() {
		NumberOfElementsImpl numberOfElements = new NumberOfElementsImpl();
		return numberOfElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPUUtilization createCPUUtilization() {
		CPUUtilizationImpl cpuUtilization = new CPUUtilizationImpl();
		return cpuUtilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryUtilization createMemoryUtilization() {
		MemoryUtilizationImpl memoryUtilization = new MemoryUtilizationImpl();
		return memoryUtilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimulationTime createSimulationTime() {
		SimulationTimeImpl simulationTime = new SimulationTimeImpl();
		return simulationTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HDDUtilization createHDDUtilization() {
		HDDUtilizationImpl hddUtilization = new HDDUtilizationImpl();
		return hddUtilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskCount createTaskCount() {
		TaskCountImpl taskCount = new TaskCountImpl();
		return taskCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueLength createQueueLength() {
		QueueLengthImpl queueLength = new QueueLengthImpl();
		return queueLength;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkUtilization createNetworkUtilization() {
		NetworkUtilizationImpl networkUtilization = new NetworkUtilizationImpl();
		return networkUtilization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StimuliPackage getStimuliPackage() {
		return (StimuliPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StimuliPackage getPackage() {
		return StimuliPackage.eINSTANCE;
	}

} // StimuliFactoryImpl
