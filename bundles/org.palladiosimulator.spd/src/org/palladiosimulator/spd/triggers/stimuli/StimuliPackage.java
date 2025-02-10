/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.stimuli.StimuliFactory
 * @model kind="package"
 * @generated
 */
public interface StimuliPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "stimuli";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Triggers/Stimuli/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "stimuli";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    StimuliPackage eINSTANCE = org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.StimulusImpl <em>Stimulus</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimulusImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getStimulus()
     * @generated
     */
    int STIMULUS = 0;

    /**
     * The number of structural features of the '<em>Stimulus</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int STIMULUS_FEATURE_COUNT = 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.TargetGroupStateStimulusImpl
     * <em>Target Group State Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.TargetGroupStateStimulusImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getTargetGroupStateStimulus()
     * @generated
     */
    int TARGET_GROUP_STATE_STIMULUS = 1;

    /**
     * The number of structural features of the '<em>Target Group State Stimulus</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP_STATE_STIMULUS_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.SimulationStateStimulusImpl
     * <em>Simulation State Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.SimulationStateStimulusImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getSimulationStateStimulus()
     * @generated
     */
    int SIMULATION_STATE_STIMULUS = 2;

    /**
     * The number of structural features of the '<em>Simulation State Stimulus</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMULATION_STATE_STIMULUS_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.SourceInterfaceStimulusImpl
     * <em>Source Interface Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.SourceInterfaceStimulusImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getSourceInterfaceStimulus()
     * @generated
     */
    int SOURCE_INTERFACE_STIMULUS = 3;

    /**
     * The number of structural features of the '<em>Source Interface Stimulus</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SOURCE_INTERFACE_STIMULUS_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.OperationResponseTimeImpl
     * <em>Operation Response Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.OperationResponseTimeImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getOperationResponseTime()
     * @generated
     */
    int OPERATION_RESPONSE_TIME = 4;

    /**
     * The feature id for the '<em><b>Operation Signature</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE = SOURCE_INTERFACE_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Operation Response Time</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OPERATION_RESPONSE_TIME_FEATURE_COUNT = SOURCE_INTERFACE_STIMULUS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.NumberOfElementsImpl <em>Number Of
     * Elements</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.NumberOfElementsImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getNumberOfElements()
     * @generated
     */
    int NUMBER_OF_ELEMENTS = 5;

    /**
     * The number of structural features of the '<em>Number Of Elements</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NUMBER_OF_ELEMENTS_FEATURE_COUNT = TARGET_GROUP_STATE_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.ManagedElementsStateStimulusImpl
     * <em>Managed Elements State Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.ManagedElementsStateStimulusImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getManagedElementsStateStimulus()
     * @generated
     */
    int MANAGED_ELEMENTS_STATE_STIMULUS = 6;

    /**
     * The feature id for the '<em><b>Aggregation Over Elements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS = TARGET_GROUP_STATE_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Managed Elements State Stimulus</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MANAGED_ELEMENTS_STATE_STIMULUS_FEATURE_COUNT = TARGET_GROUP_STATE_STIMULUS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.ResourceUtilizationStimulusImpl
     * <em>Resource Utilization Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.ResourceUtilizationStimulusImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getResourceUtilizationStimulus()
     * @generated
     */
    int RESOURCE_UTILIZATION_STIMULUS = 11;

    /**
     * The feature id for the '<em><b>Aggregation Over Elements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESOURCE_UTILIZATION_STIMULUS__AGGREGATION_OVER_ELEMENTS = MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS;

    /**
     * The number of structural features of the '<em>Resource Utilization Stimulus</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RESOURCE_UTILIZATION_STIMULUS_FEATURE_COUNT = MANAGED_ELEMENTS_STATE_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.CPUUtilizationImpl <em>CPU
     * Utilization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.CPUUtilizationImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getCPUUtilization()
     * @generated
     */
    int CPU_UTILIZATION = 7;

    /**
     * The feature id for the '<em><b>Aggregation Over Elements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CPU_UTILIZATION__AGGREGATION_OVER_ELEMENTS = RESOURCE_UTILIZATION_STIMULUS__AGGREGATION_OVER_ELEMENTS;

    /**
     * The number of structural features of the '<em>CPU Utilization</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CPU_UTILIZATION_FEATURE_COUNT = RESOURCE_UTILIZATION_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.MemoryUtilizationImpl <em>Memory
     * Utilization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.MemoryUtilizationImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getMemoryUtilization()
     * @generated
     */
    int MEMORY_UTILIZATION = 8;

    /**
     * The feature id for the '<em><b>Aggregation Over Elements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEMORY_UTILIZATION__AGGREGATION_OVER_ELEMENTS = RESOURCE_UTILIZATION_STIMULUS__AGGREGATION_OVER_ELEMENTS;

    /**
     * The number of structural features of the '<em>Memory Utilization</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEMORY_UTILIZATION_FEATURE_COUNT = RESOURCE_UTILIZATION_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.SimulationTimeImpl <em>Simulation
     * Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.SimulationTimeImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getSimulationTime()
     * @generated
     */
    int SIMULATION_TIME = 9;

    /**
     * The number of structural features of the '<em>Simulation Time</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMULATION_TIME_FEATURE_COUNT = SIMULATION_STATE_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.HDDUtilizationImpl <em>HDD
     * Utilization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.HDDUtilizationImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getHDDUtilization()
     * @generated
     */
    int HDD_UTILIZATION = 10;

    /**
     * The feature id for the '<em><b>Aggregation Over Elements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int HDD_UTILIZATION__AGGREGATION_OVER_ELEMENTS = RESOURCE_UTILIZATION_STIMULUS__AGGREGATION_OVER_ELEMENTS;

    /**
     * The feature id for the '<em><b>Usage Type</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int HDD_UTILIZATION__USAGE_TYPE = RESOURCE_UTILIZATION_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>HDD Utilization</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int HDD_UTILIZATION_FEATURE_COUNT = RESOURCE_UTILIZATION_STIMULUS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.TaskCountImpl <em>Task Count</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.TaskCountImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getTaskCount()
     * @generated
     */
    int TASK_COUNT = 12;

    /**
     * The feature id for the '<em><b>Aggregation Over Elements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TASK_COUNT__AGGREGATION_OVER_ELEMENTS = MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS;

    /**
     * The number of structural features of the '<em>Task Count</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TASK_COUNT_FEATURE_COUNT = MANAGED_ELEMENTS_STATE_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.QueueLengthImpl <em>Queue
     * Length</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.QueueLengthImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getQueueLength()
     * @generated
     */
    int QUEUE_LENGTH = 13;

    /**
     * The feature id for the '<em><b>Passive Resource</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QUEUE_LENGTH__PASSIVE_RESOURCE = SOURCE_INTERFACE_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Queue Length</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QUEUE_LENGTH_FEATURE_COUNT = SOURCE_INTERFACE_STIMULUS_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.NetworkUtilizationImpl <em>Network
     * Utilization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.NetworkUtilizationImpl
     * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getNetworkUtilization()
     * @generated
     */
    int NETWORK_UTILIZATION = 14;

    /**
     * The feature id for the '<em><b>Aggregation Over Elements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NETWORK_UTILIZATION__AGGREGATION_OVER_ELEMENTS = RESOURCE_UTILIZATION_STIMULUS__AGGREGATION_OVER_ELEMENTS;

    /**
     * The feature id for the '<em><b>Usage Type</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NETWORK_UTILIZATION__USAGE_TYPE = RESOURCE_UTILIZATION_STIMULUS_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Network Utilization</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NETWORK_UTILIZATION_FEATURE_COUNT = RESOURCE_UTILIZATION_STIMULUS_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.triggers.stimuli.Stimulus
     * <em>Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Stimulus</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.Stimulus
     * @generated
     */
    EClass getStimulus();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.TargetGroupStateStimulus <em>Target Group
     * State Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Target Group State Stimulus</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.TargetGroupStateStimulus
     * @generated
     */
    EClass getTargetGroupStateStimulus();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.SimulationStateStimulus <em>Simulation
     * State Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Simulation State Stimulus</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.SimulationStateStimulus
     * @generated
     */
    EClass getSimulationStateStimulus();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.SourceInterfaceStimulus <em>Source
     * Interface Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Source Interface Stimulus</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.SourceInterfaceStimulus
     * @generated
     */
    EClass getSourceInterfaceStimulus();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime <em>Operation
     * Response Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Operation Response Time</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime
     * @generated
     */
    EClass getOperationResponseTime();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime#getOperationSignature
     * <em>Operation Signature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Operation Signature</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.OperationResponseTime#getOperationSignature()
     * @see #getOperationResponseTime()
     * @generated
     */
    EReference getOperationResponseTime_OperationSignature();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.NumberOfElements <em>Number Of
     * Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Number Of Elements</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.NumberOfElements
     * @generated
     */
    EClass getNumberOfElements();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus <em>Managed
     * Elements State Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Managed Elements State Stimulus</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus
     * @generated
     */
    EClass getManagedElementsStateStimulus();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus#getAggregationOverElements
     * <em>Aggregation Over Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Aggregation Over Elements</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus#getAggregationOverElements()
     * @see #getManagedElementsStateStimulus()
     * @generated
     */
    EAttribute getManagedElementsStateStimulus_AggregationOverElements();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.CPUUtilization <em>CPU Utilization</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>CPU Utilization</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.CPUUtilization
     * @generated
     */
    EClass getCPUUtilization();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.MemoryUtilization <em>Memory
     * Utilization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Memory Utilization</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.MemoryUtilization
     * @generated
     */
    EClass getMemoryUtilization();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.SimulationTime <em>Simulation Time</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Simulation Time</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.SimulationTime
     * @generated
     */
    EClass getSimulationTime();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.HDDUtilization <em>HDD Utilization</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>HDD Utilization</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.HDDUtilization
     * @generated
     */
    EClass getHDDUtilization();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.stimuli.HDDUtilization#getUsageType <em>Usage
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Usage Type</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.HDDUtilization#getUsageType()
     * @see #getHDDUtilization()
     * @generated
     */
    EAttribute getHDDUtilization_UsageType();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.ResourceUtilizationStimulus <em>Resource
     * Utilization Stimulus</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Resource Utilization Stimulus</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.ResourceUtilizationStimulus
     * @generated
     */
    EClass getResourceUtilizationStimulus();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.TaskCount <em>Task Count</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Task Count</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.TaskCount
     * @generated
     */
    EClass getTaskCount();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.QueueLength <em>Queue Length</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Queue Length</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.QueueLength
     * @generated
     */
    EClass getQueueLength();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.spd.triggers.stimuli.QueueLength#getPassiveResource <em>Passive
     * Resource</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Passive Resource</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.QueueLength#getPassiveResource()
     * @see #getQueueLength()
     * @generated
     */
    EReference getQueueLength_PassiveResource();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization <em>Network
     * Utilization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Network Utilization</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization
     * @generated
     */
    EClass getNetworkUtilization();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization#getUsageType <em>Usage
     * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Usage Type</em>'.
     * @see org.palladiosimulator.spd.triggers.stimuli.NetworkUtilization#getUsageType()
     * @see #getNetworkUtilization()
     * @generated
     */
    EAttribute getNetworkUtilization_UsageType();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    StimuliFactory getStimuliFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.StimulusImpl <em>Stimulus</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimulusImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getStimulus()
         * @generated
         */
        EClass STIMULUS = eINSTANCE.getStimulus();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.TargetGroupStateStimulusImpl
         * <em>Target Group State Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.TargetGroupStateStimulusImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getTargetGroupStateStimulus()
         * @generated
         */
        EClass TARGET_GROUP_STATE_STIMULUS = eINSTANCE.getTargetGroupStateStimulus();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.SimulationStateStimulusImpl
         * <em>Simulation State Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.SimulationStateStimulusImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getSimulationStateStimulus()
         * @generated
         */
        EClass SIMULATION_STATE_STIMULUS = eINSTANCE.getSimulationStateStimulus();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.SourceInterfaceStimulusImpl
         * <em>Source Interface Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.SourceInterfaceStimulusImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getSourceInterfaceStimulus()
         * @generated
         */
        EClass SOURCE_INTERFACE_STIMULUS = eINSTANCE.getSourceInterfaceStimulus();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.OperationResponseTimeImpl
         * <em>Operation Response Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.OperationResponseTimeImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getOperationResponseTime()
         * @generated
         */
        EClass OPERATION_RESPONSE_TIME = eINSTANCE.getOperationResponseTime();

        /**
         * The meta object literal for the '<em><b>Operation Signature</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference OPERATION_RESPONSE_TIME__OPERATION_SIGNATURE = eINSTANCE
            .getOperationResponseTime_OperationSignature();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.NumberOfElementsImpl <em>Number
         * Of Elements</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.NumberOfElementsImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getNumberOfElements()
         * @generated
         */
        EClass NUMBER_OF_ELEMENTS = eINSTANCE.getNumberOfElements();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.ManagedElementsStateStimulusImpl
         * <em>Managed Elements State Stimulus</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.ManagedElementsStateStimulusImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getManagedElementsStateStimulus()
         * @generated
         */
        EClass MANAGED_ELEMENTS_STATE_STIMULUS = eINSTANCE.getManagedElementsStateStimulus();

        /**
         * The meta object literal for the '<em><b>Aggregation Over Elements</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS = eINSTANCE
            .getManagedElementsStateStimulus_AggregationOverElements();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.CPUUtilizationImpl <em>CPU
         * Utilization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.CPUUtilizationImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getCPUUtilization()
         * @generated
         */
        EClass CPU_UTILIZATION = eINSTANCE.getCPUUtilization();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.MemoryUtilizationImpl <em>Memory
         * Utilization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.MemoryUtilizationImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getMemoryUtilization()
         * @generated
         */
        EClass MEMORY_UTILIZATION = eINSTANCE.getMemoryUtilization();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.SimulationTimeImpl <em>Simulation
         * Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.SimulationTimeImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getSimulationTime()
         * @generated
         */
        EClass SIMULATION_TIME = eINSTANCE.getSimulationTime();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.HDDUtilizationImpl <em>HDD
         * Utilization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.HDDUtilizationImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getHDDUtilization()
         * @generated
         */
        EClass HDD_UTILIZATION = eINSTANCE.getHDDUtilization();

        /**
         * The meta object literal for the '<em><b>Usage Type</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute HDD_UTILIZATION__USAGE_TYPE = eINSTANCE.getHDDUtilization_UsageType();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.ResourceUtilizationStimulusImpl
         * <em>Resource Utilization Stimulus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.ResourceUtilizationStimulusImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getResourceUtilizationStimulus()
         * @generated
         */
        EClass RESOURCE_UTILIZATION_STIMULUS = eINSTANCE.getResourceUtilizationStimulus();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.TaskCountImpl <em>Task
         * Count</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.TaskCountImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getTaskCount()
         * @generated
         */
        EClass TASK_COUNT = eINSTANCE.getTaskCount();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.QueueLengthImpl <em>Queue
         * Length</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.QueueLengthImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getQueueLength()
         * @generated
         */
        EClass QUEUE_LENGTH = eINSTANCE.getQueueLength();

        /**
         * The meta object literal for the '<em><b>Passive Resource</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference QUEUE_LENGTH__PASSIVE_RESOURCE = eINSTANCE.getQueueLength_PassiveResource();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.stimuli.impl.NetworkUtilizationImpl
         * <em>Network Utilization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.NetworkUtilizationImpl
         * @see org.palladiosimulator.spd.triggers.stimuli.impl.StimuliPackageImpl#getNetworkUtilization()
         * @generated
         */
        EClass NETWORK_UTILIZATION = eINSTANCE.getNetworkUtilization();

        /**
         * The meta object literal for the '<em><b>Usage Type</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute NETWORK_UTILIZATION__USAGE_TYPE = eINSTANCE.getNetworkUtilization_UsageType();

    }

} // StimuliPackage
