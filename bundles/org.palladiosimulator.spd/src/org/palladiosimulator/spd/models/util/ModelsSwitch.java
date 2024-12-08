/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.spd.models.BaseModel;
import org.palladiosimulator.spd.models.FuzzyLearningModel;
import org.palladiosimulator.spd.models.FuzzyQLearningModel;
import org.palladiosimulator.spd.models.FuzzySARSAModel;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.RandomModel;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage
 * @generated
 */
public class ModelsSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ModelsPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ModelsSwitch() {
        if (modelPackage == null) {
            modelPackage = ModelsPackage.eINSTANCE;
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
        case ModelsPackage.BASE_MODEL: {
            final BaseModel baseModel = (BaseModel) theEObject;
            T result = this.caseBaseModel(baseModel);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ModelsPackage.RANDOM_MODEL: {
            final RandomModel randomModel = (RandomModel) theEObject;
            T result = this.caseRandomModel(randomModel);
            if (result == null) {
                result = this.caseBaseModel(randomModel);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ModelsPackage.FUZZY_QLEARNING_MODEL: {
            final FuzzyQLearningModel fuzzyQLearningModel = (FuzzyQLearningModel) theEObject;
            T result = this.caseFuzzyQLearningModel(fuzzyQLearningModel);
            if (result == null) {
                result = this.caseFuzzyLearningModel(fuzzyQLearningModel);
            }
            if (result == null) {
                result = this.caseLearningBasedModel(fuzzyQLearningModel);
            }
            if (result == null) {
                result = this.caseBaseModel(fuzzyQLearningModel);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ModelsPackage.LEARNING_BASED_MODEL: {
            final LearningBasedModel learningBasedModel = (LearningBasedModel) theEObject;
            T result = this.caseLearningBasedModel(learningBasedModel);
            if (result == null) {
                result = this.caseBaseModel(learningBasedModel);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ModelsPackage.FUZZY_LEARNING_MODEL: {
            final FuzzyLearningModel fuzzyLearningModel = (FuzzyLearningModel) theEObject;
            T result = this.caseFuzzyLearningModel(fuzzyLearningModel);
            if (result == null) {
                result = this.caseLearningBasedModel(fuzzyLearningModel);
            }
            if (result == null) {
                result = this.caseBaseModel(fuzzyLearningModel);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ModelsPackage.FUZZY_SARSA_MODEL: {
            final FuzzySARSAModel fuzzySARSAModel = (FuzzySARSAModel) theEObject;
            T result = this.caseFuzzySARSAModel(fuzzySARSAModel);
            if (result == null) {
                result = this.caseFuzzyLearningModel(fuzzySARSAModel);
            }
            if (result == null) {
                result = this.caseLearningBasedModel(fuzzySARSAModel);
            }
            if (result == null) {
                result = this.caseBaseModel(fuzzySARSAModel);
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
    public T caseBaseModel(final BaseModel object) {
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
    public T caseRandomModel(final RandomModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fuzzy QLearning
     * Model</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fuzzy QLearning
     *         Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFuzzyQLearningModel(final FuzzyQLearningModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Learning Based
     * Model</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Learning Based
     *         Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLearningBasedModel(final LearningBasedModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fuzzy Learning
     * Model</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fuzzy Learning
     *         Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFuzzyLearningModel(final FuzzyLearningModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fuzzy SARSA Model</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fuzzy SARSA Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFuzzySARSAModel(final FuzzySARSAModel object) {
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

} // ModelsSwitch
