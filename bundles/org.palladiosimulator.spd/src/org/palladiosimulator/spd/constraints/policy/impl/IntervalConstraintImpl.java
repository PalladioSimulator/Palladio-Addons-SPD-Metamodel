/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.constraints.impl.TemporalConstraintImpl;
import org.palladiosimulator.spd.constraints.policy.IntervalConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Interval
 * Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.constraints.policy.impl.IntervalConstraintImpl#getOffset
 * <em>Offset</em>}</li>
 * <li>{@link org.palladiosimulator.spd.constraints.policy.impl.IntervalConstraintImpl#getIntervalDuration
 * <em>Interval Duration</em>}</li>
 * <li>{@link org.palladiosimulator.spd.constraints.policy.impl.IntervalConstraintImpl#isRepeat
 * <em>Repeat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalConstraintImpl extends TemporalConstraintImpl implements IntervalConstraint {
    /**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected static final double OFFSET_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getIntervalDuration() <em>Interval Duration</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIntervalDuration()
     * @generated
     * @ordered
     */
    protected static final double INTERVAL_DURATION_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #isRepeat() <em>Repeat</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #isRepeat()
     * @generated
     * @ordered
     */
    protected static final boolean REPEAT_EDEFAULT = false;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IntervalConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PolicyPackage.Literals.INTERVAL_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getOffset() {
        return (Double) this.eDynamicGet(PolicyPackage.INTERVAL_CONSTRAINT__OFFSET,
                PolicyPackage.Literals.INTERVAL_CONSTRAINT__OFFSET, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setOffset(final double newOffset) {
        this.eDynamicSet(PolicyPackage.INTERVAL_CONSTRAINT__OFFSET, PolicyPackage.Literals.INTERVAL_CONSTRAINT__OFFSET,
                newOffset);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getIntervalDuration() {
        return (Double) this.eDynamicGet(PolicyPackage.INTERVAL_CONSTRAINT__INTERVAL_DURATION,
                PolicyPackage.Literals.INTERVAL_CONSTRAINT__INTERVAL_DURATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIntervalDuration(final double newIntervalDuration) {
        this.eDynamicSet(PolicyPackage.INTERVAL_CONSTRAINT__INTERVAL_DURATION,
                PolicyPackage.Literals.INTERVAL_CONSTRAINT__INTERVAL_DURATION, newIntervalDuration);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isRepeat() {
        return (Boolean) this.eDynamicGet(PolicyPackage.INTERVAL_CONSTRAINT__REPEAT,
                PolicyPackage.Literals.INTERVAL_CONSTRAINT__REPEAT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRepeat(final boolean newRepeat) {
        this.eDynamicSet(PolicyPackage.INTERVAL_CONSTRAINT__REPEAT, PolicyPackage.Literals.INTERVAL_CONSTRAINT__REPEAT,
                newRepeat);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case PolicyPackage.INTERVAL_CONSTRAINT__OFFSET:
            return this.getOffset();
        case PolicyPackage.INTERVAL_CONSTRAINT__INTERVAL_DURATION:
            return this.getIntervalDuration();
        case PolicyPackage.INTERVAL_CONSTRAINT__REPEAT:
            return this.isRepeat();
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
        case PolicyPackage.INTERVAL_CONSTRAINT__OFFSET:
            this.setOffset((Double) newValue);
            return;
        case PolicyPackage.INTERVAL_CONSTRAINT__INTERVAL_DURATION:
            this.setIntervalDuration((Double) newValue);
            return;
        case PolicyPackage.INTERVAL_CONSTRAINT__REPEAT:
            this.setRepeat((Boolean) newValue);
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
        case PolicyPackage.INTERVAL_CONSTRAINT__OFFSET:
            this.setOffset(OFFSET_EDEFAULT);
            return;
        case PolicyPackage.INTERVAL_CONSTRAINT__INTERVAL_DURATION:
            this.setIntervalDuration(INTERVAL_DURATION_EDEFAULT);
            return;
        case PolicyPackage.INTERVAL_CONSTRAINT__REPEAT:
            this.setRepeat(REPEAT_EDEFAULT);
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
        case PolicyPackage.INTERVAL_CONSTRAINT__OFFSET:
            return this.getOffset() != OFFSET_EDEFAULT;
        case PolicyPackage.INTERVAL_CONSTRAINT__INTERVAL_DURATION:
            return this.getIntervalDuration() != INTERVAL_DURATION_EDEFAULT;
        case PolicyPackage.INTERVAL_CONSTRAINT__REPEAT:
            return this.isRepeat() != REPEAT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // IntervalConstraintImpl
