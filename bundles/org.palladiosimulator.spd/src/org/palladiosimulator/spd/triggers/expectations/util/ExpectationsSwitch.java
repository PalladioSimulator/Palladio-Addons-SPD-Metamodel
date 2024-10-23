/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedCount;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedPrimitive;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTime;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTrend;
import org.palladiosimulator.spd.triggers.expectations.ExpectedValue;
import org.palladiosimulator.spd.triggers.expectations.NoExpectation;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage
 * @generated
 */
public class ExpectationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpectationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectationsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpectationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ExpectationsPackage.EXPECTED_VALUE: {
			ExpectedValue expectedValue = (ExpectedValue) theEObject;
			T result = caseExpectedValue(expectedValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpectationsPackage.EXPECTED_PRIMITIVE: {
			ExpectedPrimitive expectedPrimitive = (ExpectedPrimitive) theEObject;
			T result = caseExpectedPrimitive(expectedPrimitive);
			if (result == null)
				result = caseExpectedValue(expectedPrimitive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpectationsPackage.NO_EXPECTATION: {
			NoExpectation noExpectation = (NoExpectation) theEObject;
			T result = caseNoExpectation(noExpectation);
			if (result == null)
				result = caseExpectedValue(noExpectation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpectationsPackage.EXPECTED_PERCENTAGE: {
			ExpectedPercentage expectedPercentage = (ExpectedPercentage) theEObject;
			T result = caseExpectedPercentage(expectedPercentage);
			if (result == null)
				result = caseExpectedPrimitive(expectedPercentage);
			if (result == null)
				result = caseExpectedValue(expectedPercentage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpectationsPackage.EXPECTED_COUNT: {
			ExpectedCount expectedCount = (ExpectedCount) theEObject;
			T result = caseExpectedCount(expectedCount);
			if (result == null)
				result = caseExpectedPrimitive(expectedCount);
			if (result == null)
				result = caseExpectedValue(expectedCount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpectationsPackage.EXPECTED_TIME: {
			ExpectedTime expectedTime = (ExpectedTime) theEObject;
			T result = caseExpectedTime(expectedTime);
			if (result == null)
				result = caseExpectedPrimitive(expectedTime);
			if (result == null)
				result = caseExpectedValue(expectedTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExpectationsPackage.EXPECTED_TREND: {
			ExpectedTrend expectedTrend = (ExpectedTrend) theEObject;
			T result = caseExpectedTrend(expectedTrend);
			if (result == null)
				result = caseExpectedValue(expectedTrend);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Value</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedValue(ExpectedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Primitive</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedPrimitive(ExpectedPrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Expectation</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Expectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoExpectation(NoExpectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Percentage</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Percentage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedPercentage(ExpectedPercentage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Count</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedCount(ExpectedCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Time</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedTime(ExpectedTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Trend</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Trend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedTrend(ExpectedTrend object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} // ExpectationsSwitch
