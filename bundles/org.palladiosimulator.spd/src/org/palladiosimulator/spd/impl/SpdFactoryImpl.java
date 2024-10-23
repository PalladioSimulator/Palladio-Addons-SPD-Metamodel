/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.ModelBasedScalingPolicy;
import org.palladiosimulator.spd.ReactiveScalingPolicy;
import org.palladiosimulator.spd.SPD;
import org.palladiosimulator.spd.SpdFactory;
import org.palladiosimulator.spd.SpdPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SpdFactoryImpl extends EFactoryImpl implements SpdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static SpdFactory init() {
		try {
			SpdFactory theSpdFactory = (SpdFactory) EPackage.Registry.INSTANCE.getEFactory(SpdPackage.eNS_URI);
			if (theSpdFactory != null) {
				return theSpdFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SpdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SpdPackage.REACTIVE_SCALING_POLICY:
			return createReactiveScalingPolicy();
		case SpdPackage.SPD:
			return createSPD();
		case SpdPackage.MODEL_BASED_SCALING_POLICY:
			return createModelBasedScalingPolicy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactiveScalingPolicy createReactiveScalingPolicy() {
		ReactiveScalingPolicyImpl reactiveScalingPolicy = new ReactiveScalingPolicyImpl();
		return reactiveScalingPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SPD createSPD() {
		SPDImpl spd = new SPDImpl();
		return spd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelBasedScalingPolicy createModelBasedScalingPolicy() {
		ModelBasedScalingPolicyImpl modelBasedScalingPolicy = new ModelBasedScalingPolicyImpl();
		return modelBasedScalingPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpdPackage getSpdPackage() {
		return (SpdPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpdPackage getPackage() {
		return SpdPackage.eINSTANCE;
	}

} // SpdFactoryImpl
