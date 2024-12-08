/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.constraints.impl.AbstractConstraintImpl;
import org.palladiosimulator.spd.constraints.policy.PolicyConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Constraint</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public abstract class PolicyConstraintImpl extends AbstractConstraintImpl implements PolicyConstraint {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PolicyConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PolicyPackage.Literals.POLICY_CONSTRAINT;
    }

} // PolicyConstraintImpl
