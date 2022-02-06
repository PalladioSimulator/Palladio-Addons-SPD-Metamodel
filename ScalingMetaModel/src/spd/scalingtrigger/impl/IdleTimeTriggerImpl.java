/**
 */
package spd.scalingtrigger.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spd.palladio.PCMResourceContainer;

import spd.scalingtrigger.IdleTimeTrigger;
import spd.scalingtrigger.ScalingtriggerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Idle Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spd.scalingtrigger.impl.IdleTimeTriggerImpl#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdleTimeTriggerImpl extends TimeBasedTriggerImpl implements IdleTimeTrigger {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdleTimeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalingtriggerPackage.Literals.IDLE_TIME_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PCMResourceContainer> getResourceContainer() {
		if (resourceContainer == null) {
			resourceContainer = new EObjectResolvingEList<PCMResourceContainer>(PCMResourceContainer.class, this, ScalingtriggerPackage.IDLE_TIME_TRIGGER__RESOURCE_CONTAINER);
		}
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScalingtriggerPackage.IDLE_TIME_TRIGGER__RESOURCE_CONTAINER:
				return getResourceContainer();
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
			case ScalingtriggerPackage.IDLE_TIME_TRIGGER__RESOURCE_CONTAINER:
				getResourceContainer().clear();
				getResourceContainer().addAll((Collection<? extends PCMResourceContainer>)newValue);
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
			case ScalingtriggerPackage.IDLE_TIME_TRIGGER__RESOURCE_CONTAINER:
				getResourceContainer().clear();
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
			case ScalingtriggerPackage.IDLE_TIME_TRIGGER__RESOURCE_CONTAINER:
				return resourceContainer != null && !resourceContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IdleTimeTriggerImpl
