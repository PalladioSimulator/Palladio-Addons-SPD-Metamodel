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
 *
 * @generated
 */
public class TriggersFactoryImpl extends EFactoryImpl implements TriggersFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static TriggersFactory init() {
        try {
            final TriggersFactory theTriggersFactory = (TriggersFactory) EPackage.Registry.INSTANCE
                .getEFactory(TriggersPackage.eNS_URI);
            if (theTriggersFactory != null) {
                return theTriggersFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TriggersFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TriggersFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case TriggersPackage.COMPOSED_TRIGGER:
            return this.createComposedTrigger();
        case TriggersPackage.SIMPLE_FIRE_ON_VALUE:
            return this.createSimpleFireOnValue();
        case TriggersPackage.SIMPLE_FIRE_ON_TREND:
            return this.createSimpleFireOnTrend();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case TriggersPackage.AGGREGATIONMETHOD:
            return this.createAGGREGATIONMETHODFromString(eDataType, initialValue);
        case TriggersPackage.HDDUSAGETYPE:
            return this.createHDDUSAGETYPEFromString(eDataType, initialValue);
        case TriggersPackage.NETWORKUSAGETYPE:
            return this.createNETWORKUSAGETYPEFromString(eDataType, initialValue);
        case TriggersPackage.LOGICAL_OPERATOR:
            return this.createLogicalOperatorFromString(eDataType, initialValue);
        case TriggersPackage.RELATIONAL_OPERATOR:
            return this.createRelationalOperatorFromString(eDataType, initialValue);
        case TriggersPackage.TREND_PATTERN:
            return this.createTrendPatternFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case TriggersPackage.AGGREGATIONMETHOD:
            return this.convertAGGREGATIONMETHODToString(eDataType, instanceValue);
        case TriggersPackage.HDDUSAGETYPE:
            return this.convertHDDUSAGETYPEToString(eDataType, instanceValue);
        case TriggersPackage.NETWORKUSAGETYPE:
            return this.convertNETWORKUSAGETYPEToString(eDataType, instanceValue);
        case TriggersPackage.LOGICAL_OPERATOR:
            return this.convertLogicalOperatorToString(eDataType, instanceValue);
        case TriggersPackage.RELATIONAL_OPERATOR:
            return this.convertRelationalOperatorToString(eDataType, instanceValue);
        case TriggersPackage.TREND_PATTERN:
            return this.convertTrendPatternToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposedTrigger createComposedTrigger() {
        final ComposedTriggerImpl composedTrigger = new ComposedTriggerImpl();
        return composedTrigger;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimpleFireOnValue createSimpleFireOnValue() {
        final SimpleFireOnValueImpl simpleFireOnValue = new SimpleFireOnValueImpl();
        return simpleFireOnValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimpleFireOnTrend createSimpleFireOnTrend() {
        final SimpleFireOnTrendImpl simpleFireOnTrend = new SimpleFireOnTrendImpl();
        return simpleFireOnTrend;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AGGREGATIONMETHOD createAGGREGATIONMETHODFromString(final EDataType eDataType, final String initialValue) {
        final AGGREGATIONMETHOD result = AGGREGATIONMETHOD.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertAGGREGATIONMETHODToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public HDDUSAGETYPE createHDDUSAGETYPEFromString(final EDataType eDataType, final String initialValue) {
        final HDDUSAGETYPE result = HDDUSAGETYPE.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertHDDUSAGETYPEToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NETWORKUSAGETYPE createNETWORKUSAGETYPEFromString(final EDataType eDataType, final String initialValue) {
        final NETWORKUSAGETYPE result = NETWORKUSAGETYPE.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertNETWORKUSAGETYPEToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public LogicalOperator createLogicalOperatorFromString(final EDataType eDataType, final String initialValue) {
        final LogicalOperator result = LogicalOperator.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertLogicalOperatorToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public RelationalOperator createRelationalOperatorFromString(final EDataType eDataType, final String initialValue) {
        final RelationalOperator result = RelationalOperator.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertRelationalOperatorToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TrendPattern createTrendPatternFromString(final EDataType eDataType, final String initialValue) {
        final TrendPattern result = TrendPattern.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertTrendPatternToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TriggersPackage getTriggersPackage() {
        return (TriggersPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TriggersPackage getPackage() {
        return TriggersPackage.eINSTANCE;
    }

} // TriggersFactoryImpl
