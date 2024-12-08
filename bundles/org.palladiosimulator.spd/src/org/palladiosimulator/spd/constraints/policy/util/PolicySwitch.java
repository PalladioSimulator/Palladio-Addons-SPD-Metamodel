/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.policy.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.constraints.AbstractConstraint;
import org.palladiosimulator.spd.constraints.TemporalConstraint;
import org.palladiosimulator.spd.constraints.policy.CooldownConstraint;
import org.palladiosimulator.spd.constraints.policy.IntervalConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyConstraint;
import org.palladiosimulator.spd.constraints.policy.PolicyPackage;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.constraints.policy.PolicyPackage
 * @generated
 */
public class PolicySwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static PolicyPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public PolicySwitch() {
        if (modelPackage == null) {
            modelPackage = PolicyPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case PolicyPackage.POLICY_CONSTRAINT: {
            final PolicyConstraint policyConstraint = (PolicyConstraint) theEObject;
            T result = this.casePolicyConstraint(policyConstraint);
            if (result == null) {
                result = this.caseAbstractConstraint(policyConstraint);
            }
            if (result == null) {
                result = this.caseIdentifier(policyConstraint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case PolicyPackage.INTERVAL_CONSTRAINT: {
            final IntervalConstraint intervalConstraint = (IntervalConstraint) theEObject;
            T result = this.caseIntervalConstraint(intervalConstraint);
            if (result == null) {
                result = this.caseTemporalConstraint(intervalConstraint);
            }
            if (result == null) {
                result = this.casePolicyConstraint(intervalConstraint);
            }
            if (result == null) {
                result = this.caseAbstractConstraint(intervalConstraint);
            }
            if (result == null) {
                result = this.caseIdentifier(intervalConstraint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case PolicyPackage.COOLDOWN_CONSTRAINT: {
            final CooldownConstraint cooldownConstraint = (CooldownConstraint) theEObject;
            T result = this.caseCooldownConstraint(cooldownConstraint);
            if (result == null) {
                result = this.caseTemporalConstraint(cooldownConstraint);
            }
            if (result == null) {
                result = this.casePolicyConstraint(cooldownConstraint);
            }
            if (result == null) {
                result = this.caseAbstractConstraint(cooldownConstraint);
            }
            if (result == null) {
                result = this.caseIdentifier(cooldownConstraint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePolicyConstraint(final PolicyConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interval
     * Constraint</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interval
     *         Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntervalConstraint(final IntervalConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cooldown
     * Constraint</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cooldown
     *         Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCooldownConstraint(final CooldownConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract
     * Constraint</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract
     *         Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractConstraint(final AbstractConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Temporal
     * Constraint</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Temporal
     *         Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTemporalConstraint(final TemporalConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // PolicySwitch
