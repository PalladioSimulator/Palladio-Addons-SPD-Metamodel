/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.targets;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.spd.constraints.target.TargetConstraint;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Target Group</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> A TargetGroup defines a management group in SPD. It is both uniqely
 * identified as well as it has a name, thus it extends from the Entity class of the PCM. <!--
 * end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.targets.TargetGroup#getTargetConstraints <em>Target
 * Constraints</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.targets.TargetsPackage#getTargetGroup()
 * @model abstract="true"
 * @generated
 */
public interface TargetGroup extends Entity {
    /**
     * Returns the value of the '<em><b>Target Constraints</b></em>' containment reference list. The
     * list contents are of type
     * {@link org.palladiosimulator.spd.constraints.target.TargetConstraint}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Target Constraints</em>' containment reference list.
     * @see org.palladiosimulator.spd.targets.TargetsPackage#getTargetGroup_TargetConstraints()
     * @model containment="true"
     * @generated
     */
    EList<TargetConstraint> getTargetConstraints();

} // TargetGroup
