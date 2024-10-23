/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.models.ImprovedQLearningModel;
import org.palladiosimulator.spd.models.ModelsFactory;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.QThresholdsModel;
import org.palladiosimulator.spd.models.RandomModel;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ModelsFactoryImpl extends EFactoryImpl implements ModelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelsFactory init() {
		try {
			ModelsFactory theModelsFactory = (ModelsFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModelsPackage.eNS_URI);
			if (theModelsFactory != null) {
				return theModelsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModelsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModelsPackage.QTHRESHOLDS_MODEL:
			return (EObject) createQThresholdsModel();
		case ModelsPackage.RANDOM_MODEL:
			return (EObject) createRandomModel();
		case ModelsPackage.IMPROVED_QLEARNING_MODEL:
			return (EObject) createImprovedQLearningModel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QThresholdsModel createQThresholdsModel() {
		QThresholdsModelImpl qThresholdsModel = new QThresholdsModelImpl();
		return qThresholdsModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomModel createRandomModel() {
		RandomModelImpl randomModel = new RandomModelImpl();
		return randomModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImprovedQLearningModel createImprovedQLearningModel() {
		ImprovedQLearningModelImpl improvedQLearningModel = new ImprovedQLearningModelImpl();
		return improvedQLearningModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelsPackage getModelsPackage() {
		return (ModelsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelsPackage getPackage() {
		return ModelsPackage.eINSTANCE;
	}

} // ModelsFactoryImpl
