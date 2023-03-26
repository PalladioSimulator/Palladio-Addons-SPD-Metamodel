/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.constraints.target.TargetFactory;
import org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint;
import org.palladiosimulator.spd.constraints.target.TargetPackage;
import org.palladiosimulator.spd.constraints.target.ThrashingConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetFactoryImpl extends EFactoryImpl implements TargetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetFactory init() {
		try {
			TargetFactory theTargetFactory = (TargetFactory) EPackage.Registry.INSTANCE
					.getEFactory(TargetPackage.eNS_URI);
			if (theTargetFactory != null) {
				return theTargetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TargetPackage.TARGET_GROUP_SIZE_CONSTRAINT:
			return createTargetGroupSizeConstraint();
		case TargetPackage.THRASHING_CONSTRAINT:
			return createThrashingConstraint();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetGroupSizeConstraint createTargetGroupSizeConstraint() {
		TargetGroupSizeConstraintImpl targetGroupSizeConstraint = new TargetGroupSizeConstraintImpl();
		return targetGroupSizeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrashingConstraint createThrashingConstraint() {
		ThrashingConstraintImpl thrashingConstraint = new ThrashingConstraintImpl();
		return thrashingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPackage getTargetPackage() {
		return (TargetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetPackage getPackage() {
		return TargetPackage.eINSTANCE;
	}

} //TargetFactoryImpl
