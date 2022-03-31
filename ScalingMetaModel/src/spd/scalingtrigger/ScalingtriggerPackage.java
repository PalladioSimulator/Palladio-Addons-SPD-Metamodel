/**
 */
package spd.scalingtrigger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import spd.SpdPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spd.scalingtrigger.ScalingtriggerFactory
 * @model kind="package"
 * @generated
 */
public interface ScalingtriggerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scalingtrigger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "scalingtrigger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scalingtrigger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScalingtriggerPackage eINSTANCE = spd.scalingtrigger.impl.ScalingtriggerPackageImpl.init();

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.ScalingTriggerImpl <em>Scaling Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.ScalingTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getScalingTrigger()
	 * @generated
	 */
	int SCALING_TRIGGER = 0;

	/**
	 * The number of structural features of the '<em>Scaling Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TRIGGER_FEATURE_COUNT = SpdPackage.SCALING_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scaling Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TRIGGER_OPERATION_COUNT = SpdPackage.SCALING_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.ThresholdBasedTriggerImpl <em>Threshold Based Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.ThresholdBasedTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getThresholdBasedTrigger()
	 * @generated
	 */
	int THRESHOLD_BASED_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION = SCALING_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_BASED_TRIGGER__THRESHOLD = SCALING_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW = SCALING_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Threshold Based Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_BASED_TRIGGER_FEATURE_COUNT = SCALING_TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Threshold Based Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_BASED_TRIGGER_OPERATION_COUNT = SCALING_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.ResourceUtilizationBasedTriggerImpl <em>Resource Utilization Based Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.ResourceUtilizationBasedTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getResourceUtilizationBasedTrigger()
	 * @generated
	 */
	int RESOURCE_UTILIZATION_BASED_TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION = THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD = THRESHOLD_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW = THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = THRESHOLD_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = THRESHOLD_BASED_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Utilization Based Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT = THRESHOLD_BASED_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Utilization Based Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_UTILIZATION_BASED_TRIGGER_OPERATION_COUNT = THRESHOLD_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.ProcessingResourceUtilizationBasedTriggerImpl <em>Processing Resource Utilization Based Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.ProcessingResourceUtilizationBasedTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getProcessingResourceUtilizationBasedTrigger()
	 * @generated
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER = 12;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION = RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD = RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW = RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER = RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processing Resource Utilization Based Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT = RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Processing Resource Utilization Based Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_OPERATION_COUNT = RESOURCE_UTILIZATION_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.CPUUtilizationTriggerImpl <em>CPU Utilization Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.CPUUtilizationTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getCPUUtilizationTrigger()
	 * @generated
	 */
	int CPU_UTILIZATION_TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TRIGGER__THRESHOLD_DIRECTION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TRIGGER__THRESHOLD = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TRIGGER__VIOLATION_WINDOW = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TRIGGER__RESOURCE_CONTAINER = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER;

	/**
	 * The number of structural features of the '<em>CPU Utilization Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TRIGGER_FEATURE_COUNT = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CPU Utilization Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TRIGGER_OPERATION_COUNT = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.RAMUtilizationTriggerImpl <em>RAM Utilization Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.RAMUtilizationTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getRAMUtilizationTrigger()
	 * @generated
	 */
	int RAM_UTILIZATION_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_UTILIZATION_TRIGGER__THRESHOLD_DIRECTION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_UTILIZATION_TRIGGER__THRESHOLD = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_UTILIZATION_TRIGGER__VIOLATION_WINDOW = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_UTILIZATION_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_UTILIZATION_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_UTILIZATION_TRIGGER__RESOURCE_CONTAINER = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER;

	/**
	 * The number of structural features of the '<em>RAM Utilization Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_UTILIZATION_TRIGGER_FEATURE_COUNT = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RAM Utilization Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAM_UTILIZATION_TRIGGER_OPERATION_COUNT = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.HDDUtilizationTriggerImpl <em>HDD Utilization Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.HDDUtilizationTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getHDDUtilizationTrigger()
	 * @generated
	 */
	int HDD_UTILIZATION_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER__THRESHOLD_DIRECTION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER__THRESHOLD = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER__VIOLATION_WINDOW = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER__RESOURCE_CONTAINER = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER__USAGE_TYPE = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HDD Utilization Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER_FEATURE_COUNT = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HDD Utilization Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDD_UTILIZATION_TRIGGER_OPERATION_COUNT = PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.TimeBasedTriggerImpl <em>Time Based Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.TimeBasedTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getTimeBasedTrigger()
	 * @generated
	 */
	int TIME_BASED_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_TRIGGER__THRESHOLD_DIRECTION = THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_TRIGGER__THRESHOLD = THRESHOLD_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_TRIGGER__VIOLATION_WINDOW = THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The number of structural features of the '<em>Time Based Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_TRIGGER_FEATURE_COUNT = THRESHOLD_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Based Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_TRIGGER_OPERATION_COUNT = THRESHOLD_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.PointInTimeTriggerImpl <em>Point In Time Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.PointInTimeTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getPointInTimeTrigger()
	 * @generated
	 */
	int POINT_IN_TIME_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Point In Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_TRIGGER__POINT_IN_TIME = SCALING_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point In Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_TRIGGER_FEATURE_COUNT = SCALING_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point In Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_IN_TIME_TRIGGER_OPERATION_COUNT = SCALING_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.IdleTimeTriggerImpl <em>Idle Time Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.IdleTimeTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getIdleTimeTrigger()
	 * @generated
	 */
	int IDLE_TIME_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDLE_TIME_TRIGGER__THRESHOLD_DIRECTION = TIME_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDLE_TIME_TRIGGER__THRESHOLD = TIME_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDLE_TIME_TRIGGER__VIOLATION_WINDOW = TIME_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDLE_TIME_TRIGGER__RESOURCE_CONTAINER = TIME_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Idle Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDLE_TIME_TRIGGER_FEATURE_COUNT = TIME_BASED_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Idle Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDLE_TIME_TRIGGER_OPERATION_COUNT = TIME_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.TaskCountTriggerImpl <em>Task Count Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.TaskCountTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getTaskCountTrigger()
	 * @generated
	 */
	int TASK_COUNT_TRIGGER = 8;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COUNT_TRIGGER__THRESHOLD_DIRECTION = THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COUNT_TRIGGER__THRESHOLD = THRESHOLD_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COUNT_TRIGGER__VIOLATION_WINDOW = THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Resource Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COUNT_TRIGGER__RESOURCE_CONTAINER = THRESHOLD_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = THRESHOLD_BASED_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = THRESHOLD_BASED_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Count Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COUNT_TRIGGER_FEATURE_COUNT = THRESHOLD_BASED_TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Count Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COUNT_TRIGGER_OPERATION_COUNT = THRESHOLD_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.NetworkUtilizationTriggerImpl <em>Network Utilization Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.NetworkUtilizationTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getNetworkUtilizationTrigger()
	 * @generated
	 */
	int NETWORK_UTILIZATION_TRIGGER = 9;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER__THRESHOLD_DIRECTION = RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER__THRESHOLD = RESOURCE_UTILIZATION_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER__VIOLATION_WINDOW = RESOURCE_UTILIZATION_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Processing Resource Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Resource Container Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE = RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linking Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE = RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Network Utilization Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER_FEATURE_COUNT = RESOURCE_UTILIZATION_BASED_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Network Utilization Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_TRIGGER_OPERATION_COUNT = RESOURCE_UTILIZATION_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.impl.ResponseTimeTriggerImpl <em>Response Time Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.impl.ResponseTimeTriggerImpl
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getResponseTimeTrigger()
	 * @generated
	 */
	int RESPONSE_TIME_TRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Threshold Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_TRIGGER__THRESHOLD_DIRECTION = TIME_BASED_TRIGGER__THRESHOLD_DIRECTION;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_TRIGGER__THRESHOLD = TIME_BASED_TRIGGER__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Violation Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_TRIGGER__VIOLATION_WINDOW = TIME_BASED_TRIGGER__VIOLATION_WINDOW;

	/**
	 * The feature id for the '<em><b>Operation Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE = TIME_BASED_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_TRIGGER_FEATURE_COUNT = TIME_BASED_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TIME_TRIGGER_OPERATION_COUNT = TIME_BASED_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.AGGREGATIONMETHOD <em>AGGREGATIONMETHOD</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getAGGREGATIONMETHOD()
	 * @generated
	 */
	int AGGREGATIONMETHOD = 13;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.HDDUSAGETYPE <em>HDDUSAGETYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.HDDUSAGETYPE
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getHDDUSAGETYPE()
	 * @generated
	 */
	int HDDUSAGETYPE = 14;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.NETWORKUSAGETYPE <em>NETWORKUSAGETYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.NETWORKUSAGETYPE
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getNETWORKUSAGETYPE()
	 * @generated
	 */
	int NETWORKUSAGETYPE = 15;

	/**
	 * The meta object id for the '{@link spd.scalingtrigger.THRESHOLDDIRECTION <em>THRESHOLDDIRECTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.scalingtrigger.THRESHOLDDIRECTION
	 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getTHRESHOLDDIRECTION()
	 * @generated
	 */
	int THRESHOLDDIRECTION = 16;


	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.ScalingTrigger <em>Scaling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Trigger</em>'.
	 * @see spd.scalingtrigger.ScalingTrigger
	 * @generated
	 */
	EClass getScalingTrigger();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.ThresholdBasedTrigger <em>Threshold Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold Based Trigger</em>'.
	 * @see spd.scalingtrigger.ThresholdBasedTrigger
	 * @generated
	 */
	EClass getThresholdBasedTrigger();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.ThresholdBasedTrigger#getThresholdDirection <em>Threshold Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold Direction</em>'.
	 * @see spd.scalingtrigger.ThresholdBasedTrigger#getThresholdDirection()
	 * @see #getThresholdBasedTrigger()
	 * @generated
	 */
	EAttribute getThresholdBasedTrigger_ThresholdDirection();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.ThresholdBasedTrigger#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see spd.scalingtrigger.ThresholdBasedTrigger#getThreshold()
	 * @see #getThresholdBasedTrigger()
	 * @generated
	 */
	EAttribute getThresholdBasedTrigger_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.ThresholdBasedTrigger#getViolationWindow <em>Violation Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Violation Window</em>'.
	 * @see spd.scalingtrigger.ThresholdBasedTrigger#getViolationWindow()
	 * @see #getThresholdBasedTrigger()
	 * @generated
	 */
	EAttribute getThresholdBasedTrigger_ViolationWindow();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.CPUUtilizationTrigger <em>CPU Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Utilization Trigger</em>'.
	 * @see spd.scalingtrigger.CPUUtilizationTrigger
	 * @generated
	 */
	EClass getCPUUtilizationTrigger();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.RAMUtilizationTrigger <em>RAM Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RAM Utilization Trigger</em>'.
	 * @see spd.scalingtrigger.RAMUtilizationTrigger
	 * @generated
	 */
	EClass getRAMUtilizationTrigger();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.HDDUtilizationTrigger <em>HDD Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDD Utilization Trigger</em>'.
	 * @see spd.scalingtrigger.HDDUtilizationTrigger
	 * @generated
	 */
	EClass getHDDUtilizationTrigger();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.HDDUtilizationTrigger#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see spd.scalingtrigger.HDDUtilizationTrigger#getUsageType()
	 * @see #getHDDUtilizationTrigger()
	 * @generated
	 */
	EAttribute getHDDUtilizationTrigger_UsageType();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.TimeBasedTrigger <em>Time Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Based Trigger</em>'.
	 * @see spd.scalingtrigger.TimeBasedTrigger
	 * @generated
	 */
	EClass getTimeBasedTrigger();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.PointInTimeTrigger <em>Point In Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point In Time Trigger</em>'.
	 * @see spd.scalingtrigger.PointInTimeTrigger
	 * @generated
	 */
	EClass getPointInTimeTrigger();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.PointInTimeTrigger#getPointInTime <em>Point In Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point In Time</em>'.
	 * @see spd.scalingtrigger.PointInTimeTrigger#getPointInTime()
	 * @see #getPointInTimeTrigger()
	 * @generated
	 */
	EAttribute getPointInTimeTrigger_PointInTime();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.IdleTimeTrigger <em>Idle Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idle Time Trigger</em>'.
	 * @see spd.scalingtrigger.IdleTimeTrigger
	 * @generated
	 */
	EClass getIdleTimeTrigger();

	/**
	 * Returns the meta object for the reference list '{@link spd.scalingtrigger.IdleTimeTrigger#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Container</em>'.
	 * @see spd.scalingtrigger.IdleTimeTrigger#getResourceContainer()
	 * @see #getIdleTimeTrigger()
	 * @generated
	 */
	EReference getIdleTimeTrigger_ResourceContainer();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.TaskCountTrigger <em>Task Count Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Count Trigger</em>'.
	 * @see spd.scalingtrigger.TaskCountTrigger
	 * @generated
	 */
	EClass getTaskCountTrigger();

	/**
	 * Returns the meta object for the reference list '{@link spd.scalingtrigger.TaskCountTrigger#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Container</em>'.
	 * @see spd.scalingtrigger.TaskCountTrigger#getResourceContainer()
	 * @see #getTaskCountTrigger()
	 * @generated
	 */
	EReference getTaskCountTrigger_ResourceContainer();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.TaskCountTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Resource Aggregation</em>'.
	 * @see spd.scalingtrigger.TaskCountTrigger#getProcessingResourceAggregation()
	 * @see #getTaskCountTrigger()
	 * @generated
	 */
	EAttribute getTaskCountTrigger_ProcessingResourceAggregation();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.TaskCountTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Container Aggregation</em>'.
	 * @see spd.scalingtrigger.TaskCountTrigger#getResourceContainerAggregation()
	 * @see #getTaskCountTrigger()
	 * @generated
	 */
	EAttribute getTaskCountTrigger_ResourceContainerAggregation();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.NetworkUtilizationTrigger <em>Network Utilization Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Utilization Trigger</em>'.
	 * @see spd.scalingtrigger.NetworkUtilizationTrigger
	 * @generated
	 */
	EClass getNetworkUtilizationTrigger();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.NetworkUtilizationTrigger#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see spd.scalingtrigger.NetworkUtilizationTrigger#getUsageType()
	 * @see #getNetworkUtilizationTrigger()
	 * @generated
	 */
	EAttribute getNetworkUtilizationTrigger_UsageType();

	/**
	 * Returns the meta object for the reference list '{@link spd.scalingtrigger.NetworkUtilizationTrigger#getLinkingResource <em>Linking Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linking Resource</em>'.
	 * @see spd.scalingtrigger.NetworkUtilizationTrigger#getLinkingResource()
	 * @see #getNetworkUtilizationTrigger()
	 * @generated
	 */
	EReference getNetworkUtilizationTrigger_LinkingResource();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.ResponseTimeTrigger <em>Response Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Time Trigger</em>'.
	 * @see spd.scalingtrigger.ResponseTimeTrigger
	 * @generated
	 */
	EClass getResponseTimeTrigger();

	/**
	 * Returns the meta object for the reference list '{@link spd.scalingtrigger.ResponseTimeTrigger#getOperationSignature <em>Operation Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operation Signature</em>'.
	 * @see spd.scalingtrigger.ResponseTimeTrigger#getOperationSignature()
	 * @see #getResponseTimeTrigger()
	 * @generated
	 */
	EReference getResponseTimeTrigger_OperationSignature();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.ResourceUtilizationBasedTrigger <em>Resource Utilization Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Utilization Based Trigger</em>'.
	 * @see spd.scalingtrigger.ResourceUtilizationBasedTrigger
	 * @generated
	 */
	EClass getResourceUtilizationBasedTrigger();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.ResourceUtilizationBasedTrigger#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Resource Aggregation</em>'.
	 * @see spd.scalingtrigger.ResourceUtilizationBasedTrigger#getProcessingResourceAggregation()
	 * @see #getResourceUtilizationBasedTrigger()
	 * @generated
	 */
	EAttribute getResourceUtilizationBasedTrigger_ProcessingResourceAggregation();

	/**
	 * Returns the meta object for the attribute '{@link spd.scalingtrigger.ResourceUtilizationBasedTrigger#getResourceContainerAggregation <em>Resource Container Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Container Aggregation</em>'.
	 * @see spd.scalingtrigger.ResourceUtilizationBasedTrigger#getResourceContainerAggregation()
	 * @see #getResourceUtilizationBasedTrigger()
	 * @generated
	 */
	EAttribute getResourceUtilizationBasedTrigger_ResourceContainerAggregation();

	/**
	 * Returns the meta object for class '{@link spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger <em>Processing Resource Utilization Based Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Utilization Based Trigger</em>'.
	 * @see spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger
	 * @generated
	 */
	EClass getProcessingResourceUtilizationBasedTrigger();

	/**
	 * Returns the meta object for the reference list '{@link spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger#getResourceContainer <em>Resource Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resource Container</em>'.
	 * @see spd.scalingtrigger.ProcessingResourceUtilizationBasedTrigger#getResourceContainer()
	 * @see #getProcessingResourceUtilizationBasedTrigger()
	 * @generated
	 */
	EReference getProcessingResourceUtilizationBasedTrigger_ResourceContainer();

	/**
	 * Returns the meta object for enum '{@link spd.scalingtrigger.AGGREGATIONMETHOD <em>AGGREGATIONMETHOD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AGGREGATIONMETHOD</em>'.
	 * @see spd.scalingtrigger.AGGREGATIONMETHOD
	 * @generated
	 */
	EEnum getAGGREGATIONMETHOD();

	/**
	 * Returns the meta object for enum '{@link spd.scalingtrigger.HDDUSAGETYPE <em>HDDUSAGETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HDDUSAGETYPE</em>'.
	 * @see spd.scalingtrigger.HDDUSAGETYPE
	 * @generated
	 */
	EEnum getHDDUSAGETYPE();

	/**
	 * Returns the meta object for enum '{@link spd.scalingtrigger.NETWORKUSAGETYPE <em>NETWORKUSAGETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NETWORKUSAGETYPE</em>'.
	 * @see spd.scalingtrigger.NETWORKUSAGETYPE
	 * @generated
	 */
	EEnum getNETWORKUSAGETYPE();

	/**
	 * Returns the meta object for enum '{@link spd.scalingtrigger.THRESHOLDDIRECTION <em>THRESHOLDDIRECTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>THRESHOLDDIRECTION</em>'.
	 * @see spd.scalingtrigger.THRESHOLDDIRECTION
	 * @generated
	 */
	EEnum getTHRESHOLDDIRECTION();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScalingtriggerFactory getScalingtriggerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.ScalingTriggerImpl <em>Scaling Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.ScalingTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getScalingTrigger()
		 * @generated
		 */
		EClass SCALING_TRIGGER = eINSTANCE.getScalingTrigger();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.ThresholdBasedTriggerImpl <em>Threshold Based Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.ThresholdBasedTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getThresholdBasedTrigger()
		 * @generated
		 */
		EClass THRESHOLD_BASED_TRIGGER = eINSTANCE.getThresholdBasedTrigger();

		/**
		 * The meta object literal for the '<em><b>Threshold Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_BASED_TRIGGER__THRESHOLD_DIRECTION = eINSTANCE.getThresholdBasedTrigger_ThresholdDirection();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_BASED_TRIGGER__THRESHOLD = eINSTANCE.getThresholdBasedTrigger_Threshold();

		/**
		 * The meta object literal for the '<em><b>Violation Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_BASED_TRIGGER__VIOLATION_WINDOW = eINSTANCE.getThresholdBasedTrigger_ViolationWindow();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.CPUUtilizationTriggerImpl <em>CPU Utilization Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.CPUUtilizationTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getCPUUtilizationTrigger()
		 * @generated
		 */
		EClass CPU_UTILIZATION_TRIGGER = eINSTANCE.getCPUUtilizationTrigger();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.RAMUtilizationTriggerImpl <em>RAM Utilization Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.RAMUtilizationTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getRAMUtilizationTrigger()
		 * @generated
		 */
		EClass RAM_UTILIZATION_TRIGGER = eINSTANCE.getRAMUtilizationTrigger();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.HDDUtilizationTriggerImpl <em>HDD Utilization Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.HDDUtilizationTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getHDDUtilizationTrigger()
		 * @generated
		 */
		EClass HDD_UTILIZATION_TRIGGER = eINSTANCE.getHDDUtilizationTrigger();

		/**
		 * The meta object literal for the '<em><b>Usage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HDD_UTILIZATION_TRIGGER__USAGE_TYPE = eINSTANCE.getHDDUtilizationTrigger_UsageType();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.TimeBasedTriggerImpl <em>Time Based Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.TimeBasedTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getTimeBasedTrigger()
		 * @generated
		 */
		EClass TIME_BASED_TRIGGER = eINSTANCE.getTimeBasedTrigger();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.PointInTimeTriggerImpl <em>Point In Time Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.PointInTimeTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getPointInTimeTrigger()
		 * @generated
		 */
		EClass POINT_IN_TIME_TRIGGER = eINSTANCE.getPointInTimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Point In Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_IN_TIME_TRIGGER__POINT_IN_TIME = eINSTANCE.getPointInTimeTrigger_PointInTime();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.IdleTimeTriggerImpl <em>Idle Time Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.IdleTimeTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getIdleTimeTrigger()
		 * @generated
		 */
		EClass IDLE_TIME_TRIGGER = eINSTANCE.getIdleTimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDLE_TIME_TRIGGER__RESOURCE_CONTAINER = eINSTANCE.getIdleTimeTrigger_ResourceContainer();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.TaskCountTriggerImpl <em>Task Count Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.TaskCountTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getTaskCountTrigger()
		 * @generated
		 */
		EClass TASK_COUNT_TRIGGER = eINSTANCE.getTaskCountTrigger();

		/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_COUNT_TRIGGER__RESOURCE_CONTAINER = eINSTANCE.getTaskCountTrigger_ResourceContainer();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = eINSTANCE.getTaskCountTrigger_ProcessingResourceAggregation();

		/**
		 * The meta object literal for the '<em><b>Resource Container Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = eINSTANCE.getTaskCountTrigger_ResourceContainerAggregation();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.NetworkUtilizationTriggerImpl <em>Network Utilization Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.NetworkUtilizationTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getNetworkUtilizationTrigger()
		 * @generated
		 */
		EClass NETWORK_UTILIZATION_TRIGGER = eINSTANCE.getNetworkUtilizationTrigger();

		/**
		 * The meta object literal for the '<em><b>Usage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_UTILIZATION_TRIGGER__USAGE_TYPE = eINSTANCE.getNetworkUtilizationTrigger_UsageType();

		/**
		 * The meta object literal for the '<em><b>Linking Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_UTILIZATION_TRIGGER__LINKING_RESOURCE = eINSTANCE.getNetworkUtilizationTrigger_LinkingResource();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.ResponseTimeTriggerImpl <em>Response Time Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.ResponseTimeTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getResponseTimeTrigger()
		 * @generated
		 */
		EClass RESPONSE_TIME_TRIGGER = eINSTANCE.getResponseTimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Operation Signature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_TIME_TRIGGER__OPERATION_SIGNATURE = eINSTANCE.getResponseTimeTrigger_OperationSignature();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.ResourceUtilizationBasedTriggerImpl <em>Resource Utilization Based Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.ResourceUtilizationBasedTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getResourceUtilizationBasedTrigger()
		 * @generated
		 */
		EClass RESOURCE_UTILIZATION_BASED_TRIGGER = eINSTANCE.getResourceUtilizationBasedTrigger();

		/**
		 * The meta object literal for the '<em><b>Processing Resource Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_UTILIZATION_BASED_TRIGGER__PROCESSING_RESOURCE_AGGREGATION = eINSTANCE.getResourceUtilizationBasedTrigger_ProcessingResourceAggregation();

		/**
		 * The meta object literal for the '<em><b>Resource Container Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER_AGGREGATION = eINSTANCE.getResourceUtilizationBasedTrigger_ResourceContainerAggregation();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.impl.ProcessingResourceUtilizationBasedTriggerImpl <em>Processing Resource Utilization Based Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.impl.ProcessingResourceUtilizationBasedTriggerImpl
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getProcessingResourceUtilizationBasedTrigger()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER = eINSTANCE.getProcessingResourceUtilizationBasedTrigger();

		/**
		 * The meta object literal for the '<em><b>Resource Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_UTILIZATION_BASED_TRIGGER__RESOURCE_CONTAINER = eINSTANCE.getProcessingResourceUtilizationBasedTrigger_ResourceContainer();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.AGGREGATIONMETHOD <em>AGGREGATIONMETHOD</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.AGGREGATIONMETHOD
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getAGGREGATIONMETHOD()
		 * @generated
		 */
		EEnum AGGREGATIONMETHOD = eINSTANCE.getAGGREGATIONMETHOD();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.HDDUSAGETYPE <em>HDDUSAGETYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.HDDUSAGETYPE
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getHDDUSAGETYPE()
		 * @generated
		 */
		EEnum HDDUSAGETYPE = eINSTANCE.getHDDUSAGETYPE();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.NETWORKUSAGETYPE <em>NETWORKUSAGETYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.NETWORKUSAGETYPE
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getNETWORKUSAGETYPE()
		 * @generated
		 */
		EEnum NETWORKUSAGETYPE = eINSTANCE.getNETWORKUSAGETYPE();

		/**
		 * The meta object literal for the '{@link spd.scalingtrigger.THRESHOLDDIRECTION <em>THRESHOLDDIRECTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.scalingtrigger.THRESHOLDDIRECTION
		 * @see spd.scalingtrigger.impl.ScalingtriggerPackageImpl#getTHRESHOLDDIRECTION()
		 * @generated
		 */
		EEnum THRESHOLDDIRECTION = eINSTANCE.getTHRESHOLDDIRECTION();

	}

} //ScalingtriggerPackage
