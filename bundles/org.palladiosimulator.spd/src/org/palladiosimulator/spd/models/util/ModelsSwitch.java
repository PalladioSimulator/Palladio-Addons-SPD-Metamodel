/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.models.BaseModel;
import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.models.RandomModel;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spd.models.ModelsPackage
 * @generated
 */
public class ModelsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModelsSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelsPackage.eINSTANCE;
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
		case ModelsPackage.BASE_MODEL: {
			BaseModel baseModel = (BaseModel) theEObject;
			T result = caseBaseModel(baseModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelsPackage.QTHRESHOLDS_MODEL: {
			QThresholdsModel qThresholdsModel = (QThresholdsModel) theEObject;
			T result = caseQThresholdsModel(qThresholdsModel);
			if (result == null)
				result = caseLearningBasedModel(qThresholdsModel);
			if (result == null)
				result = caseBaseModel(qThresholdsModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelsPackage.RANDOM_MODEL: {
			RandomModel randomModel = (RandomModel) theEObject;
			T result = caseRandomModel(randomModel);
			if (result == null)
				result = caseBaseModel(randomModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelsPackage.IMPROVED_QLEARNING_MODEL: {
			ImprovedQLearningModel improvedQLearningModel = (ImprovedQLearningModel) theEObject;
			T result = caseImprovedQLearningModel(improvedQLearningModel);
			if (result == null)
				result = caseLearningBasedModel(improvedQLearningModel);
			if (result == null)
				result = caseBaseModel(improvedQLearningModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelsPackage.LEARNING_BASED_MODEL: {
			LearningBasedModel learningBasedModel = (LearningBasedModel) theEObject;
			T result = caseLearningBasedModel(learningBasedModel);
			if (result == null)
				result = caseBaseModel(learningBasedModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Model</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseModel(BaseModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QThresholds Model</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QThresholds Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQThresholdsModel(QThresholdsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Model</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomModel(RandomModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Improved QLearning Model</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Improved QLearning Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImprovedQLearningModel(ImprovedQLearningModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Based Model</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Based Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningBasedModel(LearningBasedModel object) {
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

} // ModelsSwitch
