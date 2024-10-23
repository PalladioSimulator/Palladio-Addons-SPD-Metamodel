/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.triggers.stimuli.CPUUtilization;
import org.palladiosimulator.spd.triggers.stimuli.HDDUtilization;
import org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus;
import org.palladiosimulator.spd.triggers.stimuli.MemoryUtilization;
import org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization;
import org.palladiosimulator.spd.triggers.stimuli.NumberOfElements;
import org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime;
import org.palladiosimulator.spd.triggers.stimuli.QueueLength;
import org.palladiosimulator.spd.triggers.stimuli.ResourceUtilizationStimulus;
import org.palladiosimulator.spd.triggers.stimuli.SimulationStateStimulus;
import org.palladiosimulator.spd.triggers.stimuli.SimulationTime;
import org.palladiosimulator.spd.triggers.stimuli.SourceInterfaceStimulus;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;
import org.palladiosimulator.spd.triggers.stimuli.TargetGroupStateStimulus;
import org.palladiosimulator.spd.triggers.stimuli.TaskCount;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage
 * @generated
 */
public class StimuliSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static StimuliPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliSwitch() {
		if (modelPackage == null) {
			modelPackage = StimuliPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StimuliPackage.STIMULUS: {
			Stimulus stimulus = (Stimulus) theEObject;
			T result = caseStimulus(stimulus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.TARGET_GROUP_STATE_STIMULUS: {
			TargetGroupStateStimulus targetGroupStateStimulus = (TargetGroupStateStimulus) theEObject;
			T result = caseTargetGroupStateStimulus(targetGroupStateStimulus);
			if (result == null)
				result = caseStimulus(targetGroupStateStimulus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.SIMULATION_STATE_STIMULUS: {
			SimulationStateStimulus simulationStateStimulus = (SimulationStateStimulus) theEObject;
			T result = caseSimulationStateStimulus(simulationStateStimulus);
			if (result == null)
				result = caseStimulus(simulationStateStimulus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.SOURCE_INTERFACE_STIMULUS: {
			SourceInterfaceStimulus sourceInterfaceStimulus = (SourceInterfaceStimulus) theEObject;
			T result = caseSourceInterfaceStimulus(sourceInterfaceStimulus);
			if (result == null)
				result = caseStimulus(sourceInterfaceStimulus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.OPERATION_RESPONSE_TIME: {
			OperationResponseTime operationResponseTime = (OperationResponseTime) theEObject;
			T result = caseOperationResponseTime(operationResponseTime);
			if (result == null)
				result = caseSourceInterfaceStimulus(operationResponseTime);
			if (result == null)
				result = caseStimulus(operationResponseTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.NUMBER_OF_ELEMENTS: {
			NumberOfElements numberOfElements = (NumberOfElements) theEObject;
			T result = caseNumberOfElements(numberOfElements);
			if (result == null)
				result = caseTargetGroupStateStimulus(numberOfElements);
			if (result == null)
				result = caseStimulus(numberOfElements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS: {
			ManagedElementsStateStimulus managedElementsStateStimulus = (ManagedElementsStateStimulus) theEObject;
			T result = caseManagedElementsStateStimulus(managedElementsStateStimulus);
			if (result == null)
				result = caseTargetGroupStateStimulus(managedElementsStateStimulus);
			if (result == null)
				result = caseStimulus(managedElementsStateStimulus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.CPU_UTILIZATION: {
			CPUUtilization cpuUtilization = (CPUUtilization) theEObject;
			T result = caseCPUUtilization(cpuUtilization);
			if (result == null)
				result = caseResourceUtilizationStimulus(cpuUtilization);
			if (result == null)
				result = caseManagedElementsStateStimulus(cpuUtilization);
			if (result == null)
				result = caseTargetGroupStateStimulus(cpuUtilization);
			if (result == null)
				result = caseStimulus(cpuUtilization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.MEMORY_UTILIZATION: {
			MemoryUtilization memoryUtilization = (MemoryUtilization) theEObject;
			T result = caseMemoryUtilization(memoryUtilization);
			if (result == null)
				result = caseResourceUtilizationStimulus(memoryUtilization);
			if (result == null)
				result = caseManagedElementsStateStimulus(memoryUtilization);
			if (result == null)
				result = caseTargetGroupStateStimulus(memoryUtilization);
			if (result == null)
				result = caseStimulus(memoryUtilization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.SIMULATION_TIME: {
			SimulationTime simulationTime = (SimulationTime) theEObject;
			T result = caseSimulationTime(simulationTime);
			if (result == null)
				result = caseSimulationStateStimulus(simulationTime);
			if (result == null)
				result = caseStimulus(simulationTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.HDD_UTILIZATION: {
			HDDUtilization hddUtilization = (HDDUtilization) theEObject;
			T result = caseHDDUtilization(hddUtilization);
			if (result == null)
				result = caseResourceUtilizationStimulus(hddUtilization);
			if (result == null)
				result = caseManagedElementsStateStimulus(hddUtilization);
			if (result == null)
				result = caseTargetGroupStateStimulus(hddUtilization);
			if (result == null)
				result = caseStimulus(hddUtilization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.RESOURCE_UTILIZATION_STIMULUS: {
			ResourceUtilizationStimulus resourceUtilizationStimulus = (ResourceUtilizationStimulus) theEObject;
			T result = caseResourceUtilizationStimulus(resourceUtilizationStimulus);
			if (result == null)
				result = caseManagedElementsStateStimulus(resourceUtilizationStimulus);
			if (result == null)
				result = caseTargetGroupStateStimulus(resourceUtilizationStimulus);
			if (result == null)
				result = caseStimulus(resourceUtilizationStimulus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.TASK_COUNT: {
			TaskCount taskCount = (TaskCount) theEObject;
			T result = caseTaskCount(taskCount);
			if (result == null)
				result = caseManagedElementsStateStimulus(taskCount);
			if (result == null)
				result = caseTargetGroupStateStimulus(taskCount);
			if (result == null)
				result = caseStimulus(taskCount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.QUEUE_LENGTH: {
			QueueLength queueLength = (QueueLength) theEObject;
			T result = caseQueueLength(queueLength);
			if (result == null)
				result = caseSourceInterfaceStimulus(queueLength);
			if (result == null)
				result = caseStimulus(queueLength);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StimuliPackage.NETWORK_UTILIZATION: {
			NetworkUtilization networkUtilization = (NetworkUtilization) theEObject;
			T result = caseNetworkUtilization(networkUtilization);
			if (result == null)
				result = caseResourceUtilizationStimulus(networkUtilization);
			if (result == null)
				result = caseManagedElementsStateStimulus(networkUtilization);
			if (result == null)
				result = caseTargetGroupStateStimulus(networkUtilization);
			if (result == null)
				result = caseStimulus(networkUtilization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimulus</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimulus(Stimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Group State Stimulus</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Group State Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetGroupStateStimulus(TargetGroupStateStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation State Stimulus</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation State Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationStateStimulus(SimulationStateStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Interface Stimulus</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Interface Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceInterfaceStimulus(SourceInterfaceStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Response Time</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Response Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationResponseTime(OperationResponseTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Elements</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfElements(NumberOfElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Managed Elements State Stimulus</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Managed Elements State Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagedElementsStateStimulus(ManagedElementsStateStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU Utilization</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPUUtilization(CPUUtilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Utilization</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryUtilization(MemoryUtilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Time</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationTime(SimulationTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HDD Utilization</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HDD Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHDDUtilization(HDDUtilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Utilization Stimulus</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Utilization Stimulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceUtilizationStimulus(ResourceUtilizationStimulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Count</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskCount(TaskCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Length</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueLength(QueueLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Utilization</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkUtilization(NetworkUtilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // StimuliSwitch
