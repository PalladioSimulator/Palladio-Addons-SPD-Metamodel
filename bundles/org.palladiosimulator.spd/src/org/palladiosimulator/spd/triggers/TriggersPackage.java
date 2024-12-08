/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.TriggersFactory
 * @model kind="package"
 * @generated
 */
public interface TriggersPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "triggers";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Triggers/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "triggers";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TriggersPackage eINSTANCE = org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.triggers.impl.ScalingTriggerImpl
     * <em>Scaling Trigger</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.impl.ScalingTriggerImpl
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getScalingTrigger()
     * @generated
     */
    int SCALING_TRIGGER = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SCALING_TRIGGER__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The number of structural features of the '<em>Scaling Trigger</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SCALING_TRIGGER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl
     * <em>Base Trigger</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getBaseTrigger()
     * @generated
     */
    int BASE_TRIGGER = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_TRIGGER__ID = SCALING_TRIGGER__ID;

    /**
     * The feature id for the '<em><b>Stimulus</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_TRIGGER__STIMULUS = SCALING_TRIGGER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expected Value</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_TRIGGER__EXPECTED_VALUE = SCALING_TRIGGER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Base Trigger</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int BASE_TRIGGER_FEATURE_COUNT = SCALING_TRIGGER_FEATURE_COUNT + 2;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.impl.ComposedTriggerImpl <em>Composed
     * Trigger</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.impl.ComposedTriggerImpl
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getComposedTrigger()
     * @generated
     */
    int COMPOSED_TRIGGER = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPOSED_TRIGGER__ID = SCALING_TRIGGER__ID;

    /**
     * The feature id for the '<em><b>Scalingtrigger</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPOSED_TRIGGER__SCALINGTRIGGER = SCALING_TRIGGER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Logical Operator</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPOSED_TRIGGER__LOGICAL_OPERATOR = SCALING_TRIGGER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Composed Trigger</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPOSED_TRIGGER_FEATURE_COUNT = SCALING_TRIGGER_FEATURE_COUNT + 2;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.impl.SimpleFireOnValueImpl <em>Simple Fire On
     * Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.impl.SimpleFireOnValueImpl
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getSimpleFireOnValue()
     * @generated
     */
    int SIMPLE_FIRE_ON_VALUE = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_VALUE__ID = BASE_TRIGGER__ID;

    /**
     * The feature id for the '<em><b>Stimulus</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_VALUE__STIMULUS = BASE_TRIGGER__STIMULUS;

    /**
     * The feature id for the '<em><b>Expected Value</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_VALUE__EXPECTED_VALUE = BASE_TRIGGER__EXPECTED_VALUE;

    /**
     * The feature id for the '<em><b>Relational Operator</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR = BASE_TRIGGER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Simple Fire On Value</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_VALUE_FEATURE_COUNT = BASE_TRIGGER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.impl.SimpleFireOnTrendImpl <em>Simple Fire On
     * Trend</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.impl.SimpleFireOnTrendImpl
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getSimpleFireOnTrend()
     * @generated
     */
    int SIMPLE_FIRE_ON_TREND = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_TREND__ID = BASE_TRIGGER__ID;

    /**
     * The feature id for the '<em><b>Stimulus</b></em>' containment reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_TREND__STIMULUS = BASE_TRIGGER__STIMULUS;

    /**
     * The feature id for the '<em><b>Expected Value</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_TREND__EXPECTED_VALUE = BASE_TRIGGER__EXPECTED_VALUE;

    /**
     * The number of structural features of the '<em>Simple Fire On Trend</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SIMPLE_FIRE_ON_TREND_FEATURE_COUNT = BASE_TRIGGER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
     * <em>AGGREGATIONMETHOD</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getAGGREGATIONMETHOD()
     * @generated
     */
    int AGGREGATIONMETHOD = 5;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.triggers.HDDUSAGETYPE
     * <em>HDDUSAGETYPE</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.HDDUSAGETYPE
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getHDDUSAGETYPE()
     * @generated
     */
    int HDDUSAGETYPE = 6;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE
     * <em>NETWORKUSAGETYPE</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getNETWORKUSAGETYPE()
     * @generated
     */
    int NETWORKUSAGETYPE = 7;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.triggers.LogicalOperator
     * <em>Logical Operator</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.LogicalOperator
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getLogicalOperator()
     * @generated
     */
    int LOGICAL_OPERATOR = 8;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.triggers.RelationalOperator
     * <em>Relational Operator</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.RelationalOperator
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getRelationalOperator()
     * @generated
     */
    int RELATIONAL_OPERATOR = 9;

    /**
     * The meta object id for the '{@link org.palladiosimulator.spd.triggers.TrendPattern <em>Trend
     * Pattern</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.TrendPattern
     * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getTrendPattern()
     * @generated
     */
    int TREND_PATTERN = 10;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.triggers.ScalingTrigger
     * <em>Scaling Trigger</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Scaling Trigger</em>'.
     * @see org.palladiosimulator.spd.triggers.ScalingTrigger
     * @generated
     */
    EClass getScalingTrigger();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.triggers.BaseTrigger
     * <em>Base Trigger</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Base Trigger</em>'.
     * @see org.palladiosimulator.spd.triggers.BaseTrigger
     * @generated
     */
    EClass getBaseTrigger();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.triggers.BaseTrigger#getStimulus <em>Stimulus</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Stimulus</em>'.
     * @see org.palladiosimulator.spd.triggers.BaseTrigger#getStimulus()
     * @see #getBaseTrigger()
     * @generated
     */
    EReference getBaseTrigger_Stimulus();

    /**
     * Returns the meta object for the containment reference
     * '{@link org.palladiosimulator.spd.triggers.BaseTrigger#getExpectedValue <em>Expected
     * Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Expected Value</em>'.
     * @see org.palladiosimulator.spd.triggers.BaseTrigger#getExpectedValue()
     * @see #getBaseTrigger()
     * @generated
     */
    EReference getBaseTrigger_ExpectedValue();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.spd.triggers.ComposedTrigger
     * <em>Composed Trigger</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Composed Trigger</em>'.
     * @see org.palladiosimulator.spd.triggers.ComposedTrigger
     * @generated
     */
    EClass getComposedTrigger();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.spd.triggers.ComposedTrigger#getScalingtrigger
     * <em>Scalingtrigger</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Scalingtrigger</em>'.
     * @see org.palladiosimulator.spd.triggers.ComposedTrigger#getScalingtrigger()
     * @see #getComposedTrigger()
     * @generated
     */
    EReference getComposedTrigger_Scalingtrigger();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.ComposedTrigger#getLogicalOperator <em>Logical
     * Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Logical Operator</em>'.
     * @see org.palladiosimulator.spd.triggers.ComposedTrigger#getLogicalOperator()
     * @see #getComposedTrigger()
     * @generated
     */
    EAttribute getComposedTrigger_LogicalOperator();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.SimpleFireOnValue <em>Simple Fire On Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Simple Fire On Value</em>'.
     * @see org.palladiosimulator.spd.triggers.SimpleFireOnValue
     * @generated
     */
    EClass getSimpleFireOnValue();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.SimpleFireOnValue#getRelationalOperator
     * <em>Relational Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Relational Operator</em>'.
     * @see org.palladiosimulator.spd.triggers.SimpleFireOnValue#getRelationalOperator()
     * @see #getSimpleFireOnValue()
     * @generated
     */
    EAttribute getSimpleFireOnValue_RelationalOperator();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.SimpleFireOnTrend <em>Simple Fire On Trend</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Simple Fire On Trend</em>'.
     * @see org.palladiosimulator.spd.triggers.SimpleFireOnTrend
     * @generated
     */
    EClass getSimpleFireOnTrend();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
     * <em>AGGREGATIONMETHOD</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>AGGREGATIONMETHOD</em>'.
     * @see org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
     * @generated
     */
    EEnum getAGGREGATIONMETHOD();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.spd.triggers.HDDUSAGETYPE
     * <em>HDDUSAGETYPE</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>HDDUSAGETYPE</em>'.
     * @see org.palladiosimulator.spd.triggers.HDDUSAGETYPE
     * @generated
     */
    EEnum getHDDUSAGETYPE();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE
     * <em>NETWORKUSAGETYPE</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>NETWORKUSAGETYPE</em>'.
     * @see org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE
     * @generated
     */
    EEnum getNETWORKUSAGETYPE();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.spd.triggers.LogicalOperator
     * <em>Logical Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Logical Operator</em>'.
     * @see org.palladiosimulator.spd.triggers.LogicalOperator
     * @generated
     */
    EEnum getLogicalOperator();

    /**
     * Returns the meta object for enum
     * '{@link org.palladiosimulator.spd.triggers.RelationalOperator <em>Relational Operator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Relational Operator</em>'.
     * @see org.palladiosimulator.spd.triggers.RelationalOperator
     * @generated
     */
    EEnum getRelationalOperator();

    /**
     * Returns the meta object for enum '{@link org.palladiosimulator.spd.triggers.TrendPattern
     * <em>Trend Pattern</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>Trend Pattern</em>'.
     * @see org.palladiosimulator.spd.triggers.TrendPattern
     * @generated
     */
    EEnum getTrendPattern();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TriggersFactory getTriggersFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.impl.ScalingTriggerImpl <em>Scaling
         * Trigger</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.impl.ScalingTriggerImpl
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getScalingTrigger()
         * @generated
         */
        EClass SCALING_TRIGGER = eINSTANCE.getScalingTrigger();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl <em>Base Trigger</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.impl.BaseTriggerImpl
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getBaseTrigger()
         * @generated
         */
        EClass BASE_TRIGGER = eINSTANCE.getBaseTrigger();

        /**
         * The meta object literal for the '<em><b>Stimulus</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BASE_TRIGGER__STIMULUS = eINSTANCE.getBaseTrigger_Stimulus();

        /**
         * The meta object literal for the '<em><b>Expected Value</b></em>' containment reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference BASE_TRIGGER__EXPECTED_VALUE = eINSTANCE.getBaseTrigger_ExpectedValue();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.impl.ComposedTriggerImpl <em>Composed
         * Trigger</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.impl.ComposedTriggerImpl
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getComposedTrigger()
         * @generated
         */
        EClass COMPOSED_TRIGGER = eINSTANCE.getComposedTrigger();

        /**
         * The meta object literal for the '<em><b>Scalingtrigger</b></em>' containment reference
         * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPOSED_TRIGGER__SCALINGTRIGGER = eINSTANCE.getComposedTrigger_Scalingtrigger();

        /**
         * The meta object literal for the '<em><b>Logical Operator</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute COMPOSED_TRIGGER__LOGICAL_OPERATOR = eINSTANCE.getComposedTrigger_LogicalOperator();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.impl.SimpleFireOnValueImpl <em>Simple Fire On
         * Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.impl.SimpleFireOnValueImpl
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getSimpleFireOnValue()
         * @generated
         */
        EClass SIMPLE_FIRE_ON_VALUE = eINSTANCE.getSimpleFireOnValue();

        /**
         * The meta object literal for the '<em><b>Relational Operator</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR = eINSTANCE.getSimpleFireOnValue_RelationalOperator();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.impl.SimpleFireOnTrendImpl <em>Simple Fire On
         * Trend</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.impl.SimpleFireOnTrendImpl
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getSimpleFireOnTrend()
         * @generated
         */
        EClass SIMPLE_FIRE_ON_TREND = eINSTANCE.getSimpleFireOnTrend();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD <em>AGGREGATIONMETHOD</em>}'
         * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.AGGREGATIONMETHOD
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getAGGREGATIONMETHOD()
         * @generated
         */
        EEnum AGGREGATIONMETHOD = eINSTANCE.getAGGREGATIONMETHOD();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.spd.triggers.HDDUSAGETYPE
         * <em>HDDUSAGETYPE</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.HDDUSAGETYPE
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getHDDUSAGETYPE()
         * @generated
         */
        EEnum HDDUSAGETYPE = eINSTANCE.getHDDUSAGETYPE();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE <em>NETWORKUSAGETYPE</em>}'
         * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.NETWORKUSAGETYPE
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getNETWORKUSAGETYPE()
         * @generated
         */
        EEnum NETWORKUSAGETYPE = eINSTANCE.getNETWORKUSAGETYPE();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.LogicalOperator <em>Logical Operator</em>}'
         * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.LogicalOperator
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getLogicalOperator()
         * @generated
         */
        EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.RelationalOperator <em>Relational
         * Operator</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.RelationalOperator
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getRelationalOperator()
         * @generated
         */
        EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.spd.triggers.TrendPattern
         * <em>Trend Pattern</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.TrendPattern
         * @see org.palladiosimulator.spd.triggers.impl.TriggersPackageImpl#getTrendPattern()
         * @generated
         */
        EEnum TREND_PATTERN = eINSTANCE.getTrendPattern();

    }

} // TriggersPackage
