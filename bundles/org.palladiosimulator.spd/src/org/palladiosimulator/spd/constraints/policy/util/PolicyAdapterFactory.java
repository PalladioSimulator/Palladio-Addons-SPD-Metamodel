/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.spd.constraints.AbstractConstraint;
import org.palladiosimulator.spd.constraints.TemporalConstraint;
import org.palladiosimulator.spd.constraints.policy.CooldownConstraint;
import org.palladiosimulator.spd.constraints.policy.IntervalConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.constraints.policy.PolicyPackage
 * @generated
 */
public class PolicyAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static PolicyPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public PolicyAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = PolicyPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected PolicySwitch<Adapter> modelSwitch = new PolicySwitch<>() {
        @Override
        public Adapter casePolicyConstraint(final PolicyConstraint object) {
            return PolicyAdapterFactory.this.createPolicyConstraintAdapter();
        }

        @Override
        public Adapter caseIntervalConstraint(final IntervalConstraint object) {
            return PolicyAdapterFactory.this.createIntervalConstraintAdapter();
        }

        @Override
        public Adapter caseCooldownConstraint(final CooldownConstraint object) {
            return PolicyAdapterFactory.this.createCooldownConstraintAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object) {
            return PolicyAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseAbstractConstraint(final AbstractConstraint object) {
            return PolicyAdapterFactory.this.createAbstractConstraintAdapter();
        }

        @Override
        public Adapter caseTemporalConstraint(final TemporalConstraint object) {
            return PolicyAdapterFactory.this.createTemporalConstraintAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return PolicyAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.constraints.policy.PolicyConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.constraints.policy.PolicyConstraint
     * @generated
     */
    public Adapter createPolicyConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.constraints.policy.IntervalConstraint <em>Interval
     * Constraint</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.constraints.policy.IntervalConstraint
     * @generated
     */
    public Adapter createIntervalConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.constraints.policy.CooldownConstraint <em>Cooldown
     * Constraint</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.constraints.policy.CooldownConstraint
     * @generated
     */
    public Adapter createCooldownConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.constraints.AbstractConstraint <em>Abstract
     * Constraint</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.constraints.AbstractConstraint
     * @generated
     */
    public Adapter createAbstractConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.constraints.TemporalConstraint <em>Temporal
     * Constraint</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.constraints.TemporalConstraint
     * @generated
     */
    public Adapter createTemporalConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // PolicyAdapterFactory
