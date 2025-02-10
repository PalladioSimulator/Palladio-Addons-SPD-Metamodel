/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy;

import org.palladiosimulator.spd.constraints.TemporalConstraint;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Interval
 * Constraint</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The IntervalConstraint identifies fixed intervals in which a policy
 * enacts adjustments. Contrary to the CooldownConstraint, the IntervalConstraint predefines the
 * enactment of the policy in time. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.constraints.policy.IntervalConstraint#getOffset
 * <em>Offset</em>}</li>
 * <li>{@link org.palladiosimulator.spd.constraints.policy.IntervalConstraint#getIntervalDuration
 * <em>Interval Duration</em>}</li>
 * <li>{@link org.palladiosimulator.spd.constraints.policy.IntervalConstraint#isRepeat
 * <em>Repeat</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.constraints.policy.PolicyPackage#getIntervalConstraint()
 * @model
 * @generated
 */
public interface IntervalConstraint extends TemporalConstraint, PolicyConstraint {
    /**
     * Returns the value of the '<em><b>Offset</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> The offset determines a period of time from which
     * the interval constraint should begin. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #setOffset(double)
     * @see org.palladiosimulator.spd.constraints.policy.PolicyPackage#getIntervalConstraint_Offset()
     * @model required="true"
     * @generated
     */
    double getOffset();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.constraints.policy.IntervalConstraint#getOffset
     * <em>Offset</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Offset</em>' attribute.
     * @see #getOffset()
     * @generated
     */
    void setOffset(double value);

    /**
     * Returns the value of the '<em><b>Interval Duration</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc --> <!-- begin-model-doc --> The duration in which no enactment by the
     * policy occurs. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Interval Duration</em>' attribute.
     * @see #setIntervalDuration(double)
     * @see org.palladiosimulator.spd.constraints.policy.PolicyPackage#getIntervalConstraint_IntervalDuration()
     * @model required="true"
     * @generated
     */
    double getIntervalDuration();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.constraints.policy.IntervalConstraint#getIntervalDuration
     * <em>Interval Duration</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Interval Duration</em>' attribute.
     * @see #getIntervalDuration()
     * @generated
     */
    void setIntervalDuration(double value);

    /**
     * Returns the value of the '<em><b>Repeat</b></em>' attribute. The default value is
     * <code>"false"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The repeat property determines whether the interval constraint should repeat throughout the
     * simulation or is applied once, which is the default case (false). <!-- end-model-doc -->
     *
     * @return the value of the '<em>Repeat</em>' attribute.
     * @see #setRepeat(boolean)
     * @see org.palladiosimulator.spd.constraints.policy.PolicyPackage#getIntervalConstraint_Repeat()
     * @model default="false"
     * @generated
     */
    boolean isRepeat();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.constraints.policy.IntervalConstraint#isRepeat
     * <em>Repeat</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Repeat</em>' attribute.
     * @see #isRepeat()
     * @generated
     */
    void setRepeat(boolean value);

} // IntervalConstraint
