/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.triggers.BaseTrigger;
import org.palladiosimulator.spd.triggers.TriggersPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedValue;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Base Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl#getExpectedValue <em>Expected Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseTriggerImpl extends ScalingTriggerImpl implements BaseTrigger {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.BASE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stimulus getStimulus() {
		return (Stimulus) eDynamicGet(TriggersPackage.BASE_TRIGGER__STIMULUS,
				TriggersPackage.Literals.BASE_TRIGGER__STIMULUS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimulus(Stimulus newStimulus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newStimulus, TriggersPackage.BASE_TRIGGER__STIMULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStimulus(Stimulus newStimulus) {
		eDynamicSet(TriggersPackage.BASE_TRIGGER__STIMULUS, TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
				newStimulus);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpectedValue getExpectedValue() {
		return (ExpectedValue) eDynamicGet(TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE,
				TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedValue(ExpectedValue newExpectedValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newExpectedValue, TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedValue(ExpectedValue newExpectedValue) {
		eDynamicSet(TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE, TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE,
				newExpectedValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TriggersPackage.BASE_TRIGGER__STIMULUS:
			return basicSetStimulus(null, msgs);
		case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
			return basicSetExpectedValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TriggersPackage.BASE_TRIGGER__STIMULUS:
			return getStimulus();
		case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
			return getExpectedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TriggersPackage.BASE_TRIGGER__STIMULUS:
			setStimulus((Stimulus) newValue);
			return;
		case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
			setExpectedValue((ExpectedValue) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TriggersPackage.BASE_TRIGGER__STIMULUS:
			setStimulus((Stimulus) null);
			return;
		case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
			setExpectedValue((ExpectedValue) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TriggersPackage.BASE_TRIGGER__STIMULUS:
			return getStimulus() != null;
		case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
			return getExpectedValue() != null;
		}
		return super.eIsSet(featureID);
	}

} // BaseTriggerImpl
