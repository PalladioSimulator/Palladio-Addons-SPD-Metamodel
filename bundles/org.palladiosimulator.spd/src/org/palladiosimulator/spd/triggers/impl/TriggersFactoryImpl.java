/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.spd.triggers.ComposedTrigger;
import org.palladiosimulator.spd.triggers.HDDUSAGETYPE;
import org.palladiosimulator.spd.triggers.LogicalOperator;
import org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE;
import org.palladiosimulator.spd.triggers.RelationalOperator;
import org.palladiosimulator.spd.triggers.SimpleFireOnTrend;
import org.palladiosimulator.spd.triggers.SimpleFireOnValue;
import org.palladiosimulator.spd.triggers.TrendPattern;
import org.palladiosimulator.spd.triggers.TriggersFactory;
import org.palladiosimulator.spd.triggers.TriggersPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class TriggersFactoryImpl extends EFactoryImpl implements TriggersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggersFactory init() {
		try {
			TriggersFactory theTriggersFactory = (TriggersFactory) EPackage.Registry.INSTANCE
					.getEFactory(TriggersPackage.eNS_URI);
			if (theTriggersFactory != null) {
				return theTriggersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TriggersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TriggersPackage.COMPOSED_TRIGGER:
			return (EObject) createComposedTrigger();
		case TriggersPackage.SIMPLE_FIRE_ON_VALUE:
			return (EObject) createSimpleFireOnValue();
		case TriggersPackage.SIMPLE_FIRE_ON_TREND:
			return (EObject) createSimpleFireOnTrend();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TriggersPackage.AGGREGATIONMETHOD:
			return createAGGREGATIONMETHODFromString(eDataType, initialValue);
		case TriggersPackage.HDDUSAGETYPE:
			return createHDDUSAGETYPEFromString(eDataType, initialValue);
		case TriggersPackage.NETWORKUSAGETYPE:
			return createNETWORKUSAGETYPEFromString(eDataType, initialValue);
		case TriggersPackage.LOGICAL_OPERATOR:
			return createLogicalOperatorFromString(eDataType, initialValue);
		case TriggersPackage.RELATIONAL_OPERATOR:
			return createRelationalOperatorFromString(eDataType, initialValue);
		case TriggersPackage.TREND_PATTERN:
			return createTrendPatternFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TriggersPackage.AGGREGATIONMETHOD:
			return convertAGGREGATIONMETHODToString(eDataType, instanceValue);
		case TriggersPackage.HDDUSAGETYPE:
			return convertHDDUSAGETYPEToString(eDataType, instanceValue);
		case TriggersPackage.NETWORKUSAGETYPE:
			return convertNETWORKUSAGETYPEToString(eDataType, instanceValue);
		case TriggersPackage.LOGICAL_OPERATOR:
			return convertLogicalOperatorToString(eDataType, instanceValue);
		case TriggersPackage.RELATIONAL_OPERATOR:
			return convertRelationalOperatorToString(eDataType, instanceValue);
		case TriggersPackage.TREND_PATTERN:
			return convertTrendPatternToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposedTrigger createComposedTrigger() {
		ComposedTriggerImpl composedTrigger = new ComposedTriggerImpl();
		return composedTrigger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleFireOnValue createSimpleFireOnValue() {
		SimpleFireOnValueImpl simpleFireOnValue = new SimpleFireOnValueImpl();
		return simpleFireOnValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleFireOnTrend createSimpleFireOnTrend() {
		SimpleFireOnTrendImpl simpleFireOnTrend = new SimpleFireOnTrendImpl();
		return simpleFireOnTrend;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AGGREGATIONMETHOD createAGGREGATIONMETHODFromString(EDataType eDataType, String initialValue) {
		AGGREGATIONMETHOD result = AGGREGATIONMETHOD.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAGGREGATIONMETHODToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HDDUSAGETYPE createHDDUSAGETYPEFromString(EDataType eDataType, String initialValue) {
		HDDUSAGETYPE result = HDDUSAGETYPE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHDDUSAGETYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NETWORKUSAGETYPE createNETWORKUSAGETYPEFromString(EDataType eDataType, String initialValue) {
		NETWORKUSAGETYPE result = NETWORKUSAGETYPE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNETWORKUSAGETYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TrendPattern createTrendPatternFromString(EDataType eDataType, String initialValue) {
		TrendPattern result = TrendPattern.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrendPatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggersPackage getTriggersPackage() {
		return (TriggersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TriggersPackage getPackage() {
		return TriggersPackage.eINSTANCE;
	}

} // TriggersFactoryImpl
