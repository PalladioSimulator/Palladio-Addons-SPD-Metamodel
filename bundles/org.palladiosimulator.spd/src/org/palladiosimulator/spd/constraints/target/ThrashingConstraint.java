/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target;

import org.palladiosimulator.spd.constraints.TemporalConstraint;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Thrashing
 * Constraint</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Thrashing constraint is used to constraint the thrashing of resources
 * i.e. increase and decrease of resources. The constraint is defined by the minimum amount of time
 * where no two decicions with adjustments in two oposite directions can occur. <!-- end-model-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.constraints.target.ThrashingConstraint#getMinimumTimeNoThrashing
 * <em>Minimum Time No Thrashing</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.constraints.target.TargetPackage#getThrashingConstraint()
 * @model
 * @generated
 */
public interface ThrashingConstraint extends TemporalConstraint, TargetConstraint {
    /**
     * Returns the value of the '<em><b>Minimum Time No Thrashing</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Minimum Time No Thrashing</em>' attribute.
     * @see #setMinimumTimeNoThrashing(double)
     * @see org.palladiosimulator.spd.constraints.target.TargetPackage#getThrashingConstraint_MinimumTimeNoThrashing()
     * @model
     * @generated
     */
    double getMinimumTimeNoThrashing();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.constraints.target.ThrashingConstraint#getMinimumTimeNoThrashing
     * <em>Minimum Time No Thrashing</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Minimum Time No Thrashing</em>' attribute.
     * @see #getMinimumTimeNoThrashing()
     * @generated
     */
    void setMinimumTimeNoThrashing(double value);

} // ThrashingConstraint
