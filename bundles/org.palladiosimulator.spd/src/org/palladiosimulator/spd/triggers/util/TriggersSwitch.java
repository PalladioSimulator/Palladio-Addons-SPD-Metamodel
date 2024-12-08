/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.triggers.BaseTrigger;
import org.palladiosimulator.spd.triggers.ComposedTrigger;
import org.palladiosimulator.spd.triggers.ScalingTrigger;
import org.palladiosimulator.spd.triggers.SimpleFireOnTrend;
import org.palladiosimulator.spd.triggers.SimpleFireOnValue;
import org.palladiosimulator.spd.triggers.TriggersPackage;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage
 * @generated
 */
public class TriggersSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static TriggersPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TriggersSwitch() {
        if (modelPackage == null) {
            modelPackage = TriggersPackage.eINSTANCE;
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
        case TriggersPackage.SCALING_TRIGGER: {
            final ScalingTrigger scalingTrigger = (ScalingTrigger) theEObject;
            T result = this.caseScalingTrigger(scalingTrigger);
            if (result == null) {
                result = this.caseIdentifier(scalingTrigger);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TriggersPackage.BASE_TRIGGER: {
            final BaseTrigger baseTrigger = (BaseTrigger) theEObject;
            T result = this.caseBaseTrigger(baseTrigger);
            if (result == null) {
                result = this.caseScalingTrigger(baseTrigger);
            }
            if (result == null) {
                result = this.caseIdentifier(baseTrigger);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TriggersPackage.COMPOSED_TRIGGER: {
            final ComposedTrigger composedTrigger = (ComposedTrigger) theEObject;
            T result = this.caseComposedTrigger(composedTrigger);
            if (result == null) {
                result = this.caseScalingTrigger(composedTrigger);
            }
            if (result == null) {
                result = this.caseIdentifier(composedTrigger);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TriggersPackage.SIMPLE_FIRE_ON_VALUE: {
            final SimpleFireOnValue simpleFireOnValue = (SimpleFireOnValue) theEObject;
            T result = this.caseSimpleFireOnValue(simpleFireOnValue);
            if (result == null) {
                result = this.caseBaseTrigger(simpleFireOnValue);
            }
            if (result == null) {
                result = this.caseScalingTrigger(simpleFireOnValue);
            }
            if (result == null) {
                result = this.caseIdentifier(simpleFireOnValue);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TriggersPackage.SIMPLE_FIRE_ON_TREND: {
            final SimpleFireOnTrend simpleFireOnTrend = (SimpleFireOnTrend) theEObject;
            T result = this.caseSimpleFireOnTrend(simpleFireOnTrend);
            if (result == null) {
                result = this.caseBaseTrigger(simpleFireOnTrend);
            }
            if (result == null) {
                result = this.caseScalingTrigger(simpleFireOnTrend);
            }
            if (result == null) {
                result = this.caseIdentifier(simpleFireOnTrend);
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
     * Returns the result of interpreting the object as an instance of '<em>Scaling Trigger</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scaling Trigger</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScalingTrigger(final ScalingTrigger object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Trigger</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Trigger</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseTrigger(final BaseTrigger object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composed Trigger</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composed Trigger</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComposedTrigger(final ComposedTrigger object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Fire On
     * Value</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Fire On
     *         Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleFireOnValue(final SimpleFireOnValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Fire On
     * Trend</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Fire On
     *         Trend</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleFireOnTrend(final SimpleFireOnTrend object) {
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

} // TriggersSwitch
