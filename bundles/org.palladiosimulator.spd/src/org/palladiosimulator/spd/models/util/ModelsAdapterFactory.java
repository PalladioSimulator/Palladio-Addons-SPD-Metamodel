/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.spd.models.BaseModel;
import org.palladiosimulator.spd.models.FuzzyLearningModel;
import org.palladiosimulator.spd.models.FuzzyQLearningModel;
import org.palladiosimulator.spd.models.FuzzySARSAModel;
import org.palladiosimulator.spd.models.LearningBasedModel;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.RandomModel;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage
 * @generated
 */
public class ModelsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ModelsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ModelsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ModelsPackage.eINSTANCE;
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
    protected ModelsSwitch<Adapter> modelSwitch = new ModelsSwitch<>() {
        @Override
        public Adapter caseBaseModel(final BaseModel object) {
            return ModelsAdapterFactory.this.createBaseModelAdapter();
        }

        @Override
        public Adapter caseRandomModel(final RandomModel object) {
            return ModelsAdapterFactory.this.createRandomModelAdapter();
        }

        @Override
        public Adapter caseFuzzyQLearningModel(final FuzzyQLearningModel object) {
            return ModelsAdapterFactory.this.createFuzzyQLearningModelAdapter();
        }

        @Override
        public Adapter caseLearningBasedModel(final LearningBasedModel object) {
            return ModelsAdapterFactory.this.createLearningBasedModelAdapter();
        }

        @Override
        public Adapter caseFuzzyLearningModel(final FuzzyLearningModel object) {
            return ModelsAdapterFactory.this.createFuzzyLearningModelAdapter();
        }

        @Override
        public Adapter caseFuzzySARSAModel(final FuzzySARSAModel object) {
            return ModelsAdapterFactory.this.createFuzzySARSAModelAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return ModelsAdapterFactory.this.createEObjectAdapter();
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
     * '{@link org.palladiosimulator.spd.models.BaseModel <em>Base Model</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.models.BaseModel
     * @generated
     */
    public Adapter createBaseModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.models.RandomModel <em>Random Model</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.models.RandomModel
     * @generated
     */
    public Adapter createRandomModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.models.FuzzyQLearningModel <em>Fuzzy QLearning
     * Model</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.models.FuzzyQLearningModel
     * @generated
     */
    public Adapter createFuzzyQLearningModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.models.LearningBasedModel <em>Learning Based Model</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.models.LearningBasedModel
     * @generated
     */
    public Adapter createLearningBasedModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.models.FuzzyLearningModel <em>Fuzzy Learning Model</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.models.FuzzyLearningModel
     * @generated
     */
    public Adapter createFuzzyLearningModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.models.FuzzySARSAModel <em>Fuzzy SARSA Model</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.models.FuzzySARSAModel
     * @generated
     */
    public Adapter createFuzzySARSAModelAdapter() {
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

} // ModelsAdapterFactory
