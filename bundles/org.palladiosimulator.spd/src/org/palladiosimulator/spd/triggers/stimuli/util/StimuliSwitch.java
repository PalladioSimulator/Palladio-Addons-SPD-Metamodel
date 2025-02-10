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
 *
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliPackage
 * @generated
 */
public class StimuliSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static StimuliPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StimuliSwitch() {
        if (modelPackage == null) {
            modelPackage = StimuliPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case StimuliPackage.STIMULUS: {
            final Stimulus stimulus = (Stimulus) theEObject;
            T result = this.caseStimulus(stimulus);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.TARGET_GROUP_STATE_STIMULUS: {
            final TargetGroupStateStimulus targetGroupStateStimulus = (TargetGroupStateStimulus) theEObject;
            T result = this.caseTargetGroupStateStimulus(targetGroupStateStimulus);
            if (result == null) {
                result = this.caseStimulus(targetGroupStateStimulus);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.SIMULATION_STATE_STIMULUS: {
            final SimulationStateStimulus simulationStateStimulus = (SimulationStateStimulus) theEObject;
            T result = this.caseSimulationStateStimulus(simulationStateStimulus);
            if (result == null) {
                result = this.caseStimulus(simulationStateStimulus);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.SOURCE_INTERFACE_STIMULUS: {
            final SourceInterfaceStimulus sourceInterfaceStimulus = (SourceInterfaceStimulus) theEObject;
            T result = this.caseSourceInterfaceStimulus(sourceInterfaceStimulus);
            if (result == null) {
                result = this.caseStimulus(sourceInterfaceStimulus);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.OPERATION_RESPONSE_TIME: {
            final OperationResponseTime operationResponseTime = (OperationResponseTime) theEObject;
            T result = this.caseOperationResponseTime(operationResponseTime);
            if (result == null) {
                result = this.caseSourceInterfaceStimulus(operationResponseTime);
            }
            if (result == null) {
                result = this.caseStimulus(operationResponseTime);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.NUMBER_OF_ELEMENTS: {
            final NumberOfElements numberOfElements = (NumberOfElements) theEObject;
            T result = this.caseNumberOfElements(numberOfElements);
            if (result == null) {
                result = this.caseTargetGroupStateStimulus(numberOfElements);
            }
            if (result == null) {
                result = this.caseStimulus(numberOfElements);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS: {
            final ManagedElementsStateStimulus managedElementsStateStimulus = (ManagedElementsStateStimulus) theEObject;
            T result = this.caseManagedElementsStateStimulus(managedElementsStateStimulus);
            if (result == null) {
                result = this.caseTargetGroupStateStimulus(managedElementsStateStimulus);
            }
            if (result == null) {
                result = this.caseStimulus(managedElementsStateStimulus);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.CPU_UTILIZATION: {
            final CPUUtilization cpuUtilization = (CPUUtilization) theEObject;
            T result = this.caseCPUUtilization(cpuUtilization);
            if (result == null) {
                result = this.caseResourceUtilizationStimulus(cpuUtilization);
            }
            if (result == null) {
                result = this.caseManagedElementsStateStimulus(cpuUtilization);
            }
            if (result == null) {
                result = this.caseTargetGroupStateStimulus(cpuUtilization);
            }
            if (result == null) {
                result = this.caseStimulus(cpuUtilization);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.MEMORY_UTILIZATION: {
            final MemoryUtilization memoryUtilization = (MemoryUtilization) theEObject;
            T result = this.caseMemoryUtilization(memoryUtilization);
            if (result == null) {
                result = this.caseResourceUtilizationStimulus(memoryUtilization);
            }
            if (result == null) {
                result = this.caseManagedElementsStateStimulus(memoryUtilization);
            }
            if (result == null) {
                result = this.caseTargetGroupStateStimulus(memoryUtilization);
            }
            if (result == null) {
                result = this.caseStimulus(memoryUtilization);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.SIMULATION_TIME: {
            final SimulationTime simulationTime = (SimulationTime) theEObject;
            T result = this.caseSimulationTime(simulationTime);
            if (result == null) {
                result = this.caseSimulationStateStimulus(simulationTime);
            }
            if (result == null) {
                result = this.caseStimulus(simulationTime);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.HDD_UTILIZATION: {
            final HDDUtilization hddUtilization = (HDDUtilization) theEObject;
            T result = this.caseHDDUtilization(hddUtilization);
            if (result == null) {
                result = this.caseResourceUtilizationStimulus(hddUtilization);
            }
            if (result == null) {
                result = this.caseManagedElementsStateStimulus(hddUtilization);
            }
            if (result == null) {
                result = this.caseTargetGroupStateStimulus(hddUtilization);
            }
            if (result == null) {
                result = this.caseStimulus(hddUtilization);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.RESOURCE_UTILIZATION_STIMULUS: {
            final ResourceUtilizationStimulus resourceUtilizationStimulus = (ResourceUtilizationStimulus) theEObject;
            T result = this.caseResourceUtilizationStimulus(resourceUtilizationStimulus);
            if (result == null) {
                result = this.caseManagedElementsStateStimulus(resourceUtilizationStimulus);
            }
            if (result == null) {
                result = this.caseTargetGroupStateStimulus(resourceUtilizationStimulus);
            }
            if (result == null) {
                result = this.caseStimulus(resourceUtilizationStimulus);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.TASK_COUNT: {
            final TaskCount taskCount = (TaskCount) theEObject;
            T result = this.caseTaskCount(taskCount);
            if (result == null) {
                result = this.caseManagedElementsStateStimulus(taskCount);
            }
            if (result == null) {
                result = this.caseTargetGroupStateStimulus(taskCount);
            }
            if (result == null) {
                result = this.caseStimulus(taskCount);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.QUEUE_LENGTH: {
            final QueueLength queueLength = (QueueLength) theEObject;
            T result = this.caseQueueLength(queueLength);
            if (result == null) {
                result = this.caseSourceInterfaceStimulus(queueLength);
            }
            if (result == null) {
                result = this.caseStimulus(queueLength);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case StimuliPackage.NETWORK_UTILIZATION: {
            final NetworkUtilization networkUtilization = (NetworkUtilization) theEObject;
            T result = this.caseNetworkUtilization(networkUtilization);
            if (result == null) {
                result = this.caseResourceUtilizationStimulus(networkUtilization);
            }
            if (result == null) {
                result = this.caseManagedElementsStateStimulus(networkUtilization);
            }
            if (result == null) {
                result = this.caseTargetGroupStateStimulus(networkUtilization);
            }
            if (result == null) {
                result = this.caseStimulus(networkUtilization);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
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
    public T caseStimulus(final Stimulus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Target Group State
     * Stimulus</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target Group State
     *         Stimulus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTargetGroupStateStimulus(final TargetGroupStateStimulus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simulation State
     * Stimulus</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simulation State
     *         Stimulus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimulationStateStimulus(final SimulationStateStimulus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Source Interface
     * Stimulus</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Source Interface
     *         Stimulus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSourceInterfaceStimulus(final SourceInterfaceStimulus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Operation Response
     * Time</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Operation Response
     *         Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOperationResponseTime(final OperationResponseTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Number Of
     * Elements</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Number Of
     *         Elements</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumberOfElements(final NumberOfElements object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Managed Elements State
     * Stimulus</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Managed Elements State
     *         Stimulus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseManagedElementsStateStimulus(final ManagedElementsStateStimulus object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>CPU Utilization</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>CPU Utilization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCPUUtilization(final CPUUtilization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Memory
     * Utilization</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Memory
     *         Utilization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMemoryUtilization(final MemoryUtilization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simulation Time</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simulation Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimulationTime(final SimulationTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HDD Utilization</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HDD Utilization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHDDUtilization(final HDDUtilization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Utilization
     * Stimulus</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Utilization
     *         Stimulus</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResourceUtilizationStimulus(final ResourceUtilizationStimulus object) {
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
    public T caseTaskCount(final TaskCount object) {
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
    public T caseQueueLength(final QueueLength object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Network
     * Utilization</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Network
     *         Utilization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNetworkUtilization(final NetworkUtilization object) {
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
    public T defaultCase(final EObject object) {
        return null;
    }

} // StimuliSwitch
