/**
 */
package spd.scalingtrigger.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import spd.palladio.PCMResourceContainer;
import spd.scalingtrigger.AGGREGATIONMETHOD;
import spd.scalingtrigger.ScalingtriggerPackage;
import spd.scalingtrigger.TaskCountTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Count Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.impl.TaskCountTriggerImpl#getResourceContainer <em>Resource Container</em>}</li>
 *   <li>{@link spd.scalingtrigger.impl.TaskCountTriggerImpl#getProcessingResourceAggregation <em>Processing Resource Aggregation</em>}</li>
 *   <li>{@link spd.scalingtrigger.impl.TaskCountTriggerImpl#getResourceContainerAggregation <em>Resource Container Aggregation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskCountTriggerImpl extends ThresholdBasedTriggerImpl implements TaskCountTrigger {
	/**
	 * The cached value of the '{@link #getResourceContainer() <em>Resource Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMResourceContainer> resourceContainer;

	/**
	 * The default value of the '{@link #getProcessingResourceAggregation() <em>Processing Resource Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingResourceAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AGGREGATIONMETHOD PROCESSING_RESOURCE_AGGREGATION_EDEFAULT = AGGREGATIONMETHOD.AVERAGE;

	/**
	 * The cached value of the '{@link #getProcessingResourceAggregation() <em>Processing Resource Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingResourceAggregation()
	 * @generated
	 * @ordered
	 */
	protected AGGREGATIONMETHOD processingResourceAggregation = PROCESSING_RESOURCE_AGGREGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceContainerAggregation() <em>Resource Container Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainerAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AGGREGATIONMETHOD RESOURCE_CONTAINER_AGGREGATION_EDEFAULT = AGGREGATIONMETHOD.AVERAGE;

	/**
	 * The cached value of the '{@link #getResourceContainerAggregation() <em>Resource Container Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainerAggregation()
	 * @generated
	 * @ordered
	 */
	protected AGGREGATIONMETHOD resourceContainerAggregation = RESOURCE_CONTAINER_AGGREGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCountTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalingtriggerPackage.Literals.TASK_COUNT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCMResourceContainer> getResourceContainer() {
		if (resourceContainer == null) {
			resourceContainer = new EObjectResolvingEList<PCMResourceContainer>(PCMResourceContainer.class, this, ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER);
		}
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AGGREGATIONMETHOD getProcessingResourceAggregation() {
		return processingResourceAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingResourceAggregation(AGGREGATIONMETHOD newProcessingResourceAggregation) {
		AGGREGATIONMETHOD oldProcessingResourceAggregation = processingResourceAggregation;
		processingResourceAggregation = newProcessingResourceAggregation == null ? PROCESSING_RESOURCE_AGGREGATION_EDEFAULT : newProcessingResourceAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION, oldProcessingResourceAggregation, processingResourceAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AGGREGATIONMETHOD getResourceContainerAggregation() {
		return resourceContainerAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceContainerAggregation(AGGREGATIONMETHOD newResourceContainerAggregation) {
		AGGREGATIONMETHOD oldResourceContainerAggregation = resourceContainerAggregation;
		resourceContainerAggregation = newResourceContainerAggregation == null ? RESOURCE_CONTAINER_AGGREGATION_EDEFAULT : newResourceContainerAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION, oldResourceContainerAggregation, resourceContainerAggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER:
				return getResourceContainer();
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION:
				return getProcessingResourceAggregation();
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION:
				return getResourceContainerAggregation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER:
				getResourceContainer().clear();
				getResourceContainer().addAll((Collection<? extends PCMResourceContainer>)newValue);
				return;
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION:
				setProcessingResourceAggregation((AGGREGATIONMETHOD)newValue);
				return;
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION:
				setResourceContainerAggregation((AGGREGATIONMETHOD)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER:
				getResourceContainer().clear();
				return;
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION:
				setProcessingResourceAggregation(PROCESSING_RESOURCE_AGGREGATION_EDEFAULT);
				return;
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION:
				setResourceContainerAggregation(RESOURCE_CONTAINER_AGGREGATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER:
				return resourceContainer != null && !resourceContainer.isEmpty();
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__PROCESSING_RESOURCE_AGGREGATION:
				return processingResourceAggregation != PROCESSING_RESOURCE_AGGREGATION_EDEFAULT;
			case ScalingtriggerPackage.TASK_COUNT_TRIGGER__RESOURCE_CONTAINER_AGGREGATION:
				return resourceContainerAggregation != RESOURCE_CONTAINER_AGGREGATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (processingResourceAggregation: ");
		result.append(processingResourceAggregation);
		result.append(", resourceContainerAggregation: ");
		result.append(resourceContainerAggregation);
		result.append(')');
		return result.toString();
	}

} //TaskCountTriggerImpl
