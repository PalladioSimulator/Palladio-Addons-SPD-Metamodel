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
 * <li>{@link org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl#getStimulus
 * <em>Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl#getExpectedValue <em>Expected
 * Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseTriggerImpl extends ScalingTriggerImpl implements BaseTrigger {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BaseTriggerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TriggersPackage.Literals.BASE_TRIGGER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getStimulus() {
        return (Stimulus) this.eDynamicGet(TriggersPackage.BASE_TRIGGER__STIMULUS,
                TriggersPackage.Literals.BASE_TRIGGER__STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetStimulus(final Stimulus newStimulus, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newStimulus, TriggersPackage.BASE_TRIGGER__STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStimulus(final Stimulus newStimulus) {
        this.eDynamicSet(TriggersPackage.BASE_TRIGGER__STIMULUS, TriggersPackage.Literals.BASE_TRIGGER__STIMULUS,
                newStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExpectedValue getExpectedValue() {
        return (ExpectedValue) this.eDynamicGet(TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE,
                TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetExpectedValue(final ExpectedValue newExpectedValue, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newExpectedValue, TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExpectedValue(final ExpectedValue newExpectedValue) {
        this.eDynamicSet(TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE,
                TriggersPackage.Literals.BASE_TRIGGER__EXPECTED_VALUE, newExpectedValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case TriggersPackage.BASE_TRIGGER__STIMULUS:
            return this.basicSetStimulus(null, msgs);
        case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
            return this.basicSetExpectedValue(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TriggersPackage.BASE_TRIGGER__STIMULUS:
            return this.getStimulus();
        case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
            return this.getExpectedValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case TriggersPackage.BASE_TRIGGER__STIMULUS:
            this.setStimulus((Stimulus) newValue);
            return;
        case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
            this.setExpectedValue((ExpectedValue) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case TriggersPackage.BASE_TRIGGER__STIMULUS:
            this.setStimulus((Stimulus) null);
            return;
        case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
            this.setExpectedValue((ExpectedValue) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case TriggersPackage.BASE_TRIGGER__STIMULUS:
            return this.getStimulus() != null;
        case TriggersPackage.BASE_TRIGGER__EXPECTED_VALUE:
            return this.getExpectedValue() != null;
        }
        return super.eIsSet(featureID);
    }

} // BaseTriggerImpl
