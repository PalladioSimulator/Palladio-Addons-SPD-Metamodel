/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.adjustments.AbsoluteAdjustment;
import org.palladiosimulator.spd.adjustments.AdjustmentType;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;
import org.palladiosimulator.spd.adjustments.StepAdjustment;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.adjustments.AdjustmentsPackage
 * @generated
 */
public class AdjustmentsSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static AdjustmentsPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AdjustmentsSwitch() {
        if (modelPackage == null) {
            modelPackage = AdjustmentsPackage.eINSTANCE;
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
        case AdjustmentsPackage.ADJUSTMENT_TYPE: {
            final AdjustmentType adjustmentType = (AdjustmentType) theEObject;
            T result = this.caseAdjustmentType(adjustmentType);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case AdjustmentsPackage.RELATIVE_ADJUSTMENT: {
            final RelativeAdjustment relativeAdjustment = (RelativeAdjustment) theEObject;
            T result = this.caseRelativeAdjustment(relativeAdjustment);
            if (result == null) {
                result = this.caseAdjustmentType(relativeAdjustment);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case AdjustmentsPackage.ABSOLUTE_ADJUSTMENT: {
            final AbsoluteAdjustment absoluteAdjustment = (AbsoluteAdjustment) theEObject;
            T result = this.caseAbsoluteAdjustment(absoluteAdjustment);
            if (result == null) {
                result = this.caseAdjustmentType(absoluteAdjustment);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case AdjustmentsPackage.STEP_ADJUSTMENT: {
            final StepAdjustment stepAdjustment = (StepAdjustment) theEObject;
            T result = this.caseStepAdjustment(stepAdjustment);
            if (result == null) {
                result = this.caseAdjustmentType(stepAdjustment);
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
     * Returns the result of interpreting the object as an instance of '<em>Adjustment Type</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Adjustment Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAdjustmentType(final AdjustmentType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relative
     * Adjustment</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relative
     *         Adjustment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelativeAdjustment(final RelativeAdjustment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Absolute
     * Adjustment</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Absolute
     *         Adjustment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbsoluteAdjustment(final AbsoluteAdjustment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Step Adjustment</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Step Adjustment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStepAdjustment(final StepAdjustment object) {
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

} // AdjustmentsSwitch
