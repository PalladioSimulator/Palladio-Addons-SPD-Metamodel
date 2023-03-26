/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.constraints.AbstractConstraint;
import org.palladiosimulator.spd.constraints.StateBasedContraint;
import org.palladiosimulator.spd.constraints.TemporalConstraint;
import org.palladiosimulator.spd.constraints.target.TargetConstraint;
import org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint;
import org.palladiosimulator.spd.constraints.target.TargetPackage;
import org.palladiosimulator.spd.constraints.target.ThrashingConstraint;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.constraints.target.TargetPackage
 * @generated
 */
public class TargetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetSwitch() {
		if (modelPackage == null) {
			modelPackage = TargetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TargetPackage.TARGET_CONSTRAINT: {
			TargetConstraint targetConstraint = (TargetConstraint) theEObject;
			T result = caseTargetConstraint(targetConstraint);
			if (result == null)
				result = caseAbstractConstraint(targetConstraint);
			if (result == null)
				result = caseIdentifier(targetConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT: {
			TargetGroupSizeConstraint targetGroupSizeConstraint = (TargetGroupSizeConstraint) theEObject;
			T result = caseTargetGroupSizeConstraint(targetGroupSizeConstraint);
			if (result == null)
				result = caseTargetConstraint(targetGroupSizeConstraint);
			if (result == null)
				result = caseStateBasedContraint(targetGroupSizeConstraint);
			if (result == null)
				result = caseAbstractConstraint(targetGroupSizeConstraint);
			if (result == null)
				result = caseIdentifier(targetGroupSizeConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TargetPackage.THRASHING_CONSTRAINT: {
			ThrashingConstraint thrashingConstraint = (ThrashingConstraint) theEObject;
			T result = caseThrashingConstraint(thrashingConstraint);
			if (result == null)
				result = caseTemporalConstraint(thrashingConstraint);
			if (result == null)
				result = caseTargetConstraint(thrashingConstraint);
			if (result == null)
				result = caseAbstractConstraint(thrashingConstraint);
			if (result == null)
				result = caseIdentifier(thrashingConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetConstraint(TargetConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Size Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Size Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetGroupSizeConstraint(TargetGroupSizeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thrashing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thrashing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrashingConstraint(ThrashingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConstraint(AbstractConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Based Contraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Based Contraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateBasedContraint(StateBasedContraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalConstraint(TemporalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TargetSwitch
