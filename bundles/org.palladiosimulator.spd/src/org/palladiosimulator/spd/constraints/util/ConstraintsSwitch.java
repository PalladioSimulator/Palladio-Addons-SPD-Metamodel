/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.constraints.AbstractConstraint;
import org.palladiosimulator.spd.constraints.ConstraintsPackage;
import org.palladiosimulator.spd.constraints.StateBasedContraint;
import org.palladiosimulator.spd.constraints.TemporalConstraint;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.constraints.ConstraintsPackage
 * @generated
 */
public class ConstraintsSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ConstraintsPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ConstraintsSwitch() {
        if (modelPackage == null) {
            modelPackage = ConstraintsPackage.eINSTANCE;
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
        case ConstraintsPackage.ABSTRACT_CONSTRAINT: {
            final AbstractConstraint abstractConstraint = (AbstractConstraint) theEObject;
            T result = this.caseAbstractConstraint(abstractConstraint);
            if (result == null) {
                result = this.caseIdentifier(abstractConstraint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ConstraintsPackage.TEMPORAL_CONSTRAINT: {
            final TemporalConstraint temporalConstraint = (TemporalConstraint) theEObject;
            T result = this.caseTemporalConstraint(temporalConstraint);
            if (result == null) {
                result = this.caseAbstractConstraint(temporalConstraint);
            }
            if (result == null) {
                result = this.caseIdentifier(temporalConstraint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ConstraintsPackage.STATE_BASED_CONTRAINT: {
            final StateBasedContraint stateBasedContraint = (StateBasedContraint) theEObject;
            T result = this.caseStateBasedContraint(stateBasedContraint);
            if (result == null) {
                result = this.caseAbstractConstraint(stateBasedContraint);
            }
            if (result == null) {
                result = this.caseIdentifier(stateBasedContraint);
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
     * Returns the result of interpreting the object as an instance of '<em>State Based
     * Contraint</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>State Based
     *         Contraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStateBasedContraint(final StateBasedContraint object) {
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

} // ConstraintsSwitch
