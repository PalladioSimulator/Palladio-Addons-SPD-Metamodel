/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.constraints.AbstractConstraint;
import org.palladiosimulator.spd.constraints.ConstraintsPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract
 * Constraint</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractConstraintImpl extends IdentifierImpl implements AbstractConstraint {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected AbstractConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConstraintsPackage.Literals.ABSTRACT_CONSTRAINT;
    }

} // AbstractConstraintImpl
