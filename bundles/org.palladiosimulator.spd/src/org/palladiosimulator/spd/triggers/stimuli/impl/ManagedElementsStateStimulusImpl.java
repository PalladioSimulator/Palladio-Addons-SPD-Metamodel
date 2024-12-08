/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.stimuli.ManagedElementsStateStimulus;
import org.palladiosimulator.spd.triggers.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Managed Elements State
 * Stimulus</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.stimuli.impl.ManagedElementsStateStimulusImpl#getAggregationOverElements
 * <em>Aggregation Over Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ManagedElementsStateStimulusImpl extends TargetGroupStateStimulusImpl
        implements ManagedElementsStateStimulus {
    /**
     * The default value of the '{@link #getAggregationOverElements() <em>Aggregation Over
     * Elements</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAggregationOverElements()
     * @generated
     * @ordered
     */
    protected static final AGGREGATIONMETHOD AGGREGATION_OVER_ELEMENTS_EDEFAULT = AGGREGATIONMETHOD.AVERAGE;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ManagedElementsStateStimulusImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StimuliPackage.Literals.MANAGED_ELEMENTS_STATE_STIMULUS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AGGREGATIONMETHOD getAggregationOverElements() {
        return (AGGREGATIONMETHOD) this.eDynamicGet(
                StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS,
                StimuliPackage.Literals.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAggregationOverElements(final AGGREGATIONMETHOD newAggregationOverElements) {
        this.eDynamicSet(StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS,
                StimuliPackage.Literals.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS,
                newAggregationOverElements);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
            return this.getAggregationOverElements();
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
        case StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
            this.setAggregationOverElements((AGGREGATIONMETHOD) newValue);
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
        case StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
            this.setAggregationOverElements(AGGREGATION_OVER_ELEMENTS_EDEFAULT);
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
        case StimuliPackage.MANAGED_ELEMENTS_STATE_STIMULUS__AGGREGATION_OVER_ELEMENTS:
            return this.getAggregationOverElements() != AGGREGATION_OVER_ELEMENTS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ManagedElementsStateStimulusImpl
