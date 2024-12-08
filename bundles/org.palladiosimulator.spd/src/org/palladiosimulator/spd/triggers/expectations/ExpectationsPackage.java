/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.palladiosimulator.spd.triggers.expectations.ExpectationsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpectationsPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "expectations";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Triggers/Expectations/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "expectations";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ExpectationsPackage eINSTANCE = org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedValueImpl <em>Expected
     * Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedValueImpl
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedValue()
     * @generated
     */
    int EXPECTED_VALUE = 0;

    /**
     * The number of structural features of the '<em>Expected Value</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_VALUE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedPrimitiveImpl
     * <em>Expected Primitive</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedPrimitiveImpl
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedPrimitive()
     * @generated
     */
    int EXPECTED_PRIMITIVE = 1;

    /**
     * The number of structural features of the '<em>Expected Primitive</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_PRIMITIVE_FEATURE_COUNT = EXPECTED_VALUE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.expectations.impl.NoExpectationImpl <em>No
     * Expectation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.expectations.impl.NoExpectationImpl
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getNoExpectation()
     * @generated
     */
    int NO_EXPECTATION = 2;

    /**
     * The number of structural features of the '<em>No Expectation</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int NO_EXPECTATION_FEATURE_COUNT = EXPECTED_VALUE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedPercentageImpl
     * <em>Expected Percentage</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedPercentageImpl
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedPercentage()
     * @generated
     */
    int EXPECTED_PERCENTAGE = 3;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_PERCENTAGE__VALUE = EXPECTED_PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expected Percentage</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_PERCENTAGE_FEATURE_COUNT = EXPECTED_PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedCountImpl <em>Expected
     * Count</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedCountImpl
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedCount()
     * @generated
     */
    int EXPECTED_COUNT = 4;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_COUNT__COUNT = EXPECTED_PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expected Count</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_COUNT_FEATURE_COUNT = EXPECTED_PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTimeImpl <em>Expected
     * Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTimeImpl
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedTime()
     * @generated
     */
    int EXPECTED_TIME = 5;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_TIME__VALUE = EXPECTED_PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expected Time</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_TIME_FEATURE_COUNT = EXPECTED_PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTrendImpl <em>Expected
     * Trend</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTrendImpl
     * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedTrend()
     * @generated
     */
    int EXPECTED_TREND = 6;

    /**
     * The feature id for the '<em><b>Trend</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_TREND__TREND = EXPECTED_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Expected Trend</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int EXPECTED_TREND_FEATURE_COUNT = EXPECTED_VALUE_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedValue <em>Expected
     * Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Expected Value</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedValue
     * @generated
     */
    EClass getExpectedValue();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedPrimitive <em>Expected
     * Primitive</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Expected Primitive</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedPrimitive
     * @generated
     */
    EClass getExpectedPrimitive();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.expectations.NoExpectation <em>No
     * Expectation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>No Expectation</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.NoExpectation
     * @generated
     */
    EClass getNoExpectation();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage <em>Expected
     * Percentage</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Expected Percentage</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage
     * @generated
     */
    EClass getExpectedPercentage();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage#getValue
     * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedPercentage#getValue()
     * @see #getExpectedPercentage()
     * @generated
     */
    EAttribute getExpectedPercentage_Value();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedCount <em>Expected
     * Count</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Expected Count</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedCount
     * @generated
     */
    EClass getExpectedCount();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedCount#getCount
     * <em>Count</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Count</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedCount#getCount()
     * @see #getExpectedCount()
     * @generated
     */
    EAttribute getExpectedCount_Count();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedTime <em>Expected
     * Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Expected Time</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedTime
     * @generated
     */
    EClass getExpectedTime();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedTime#getValue
     * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedTime#getValue()
     * @see #getExpectedTime()
     * @generated
     */
    EAttribute getExpectedTime_Value();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedTrend <em>Expected
     * Trend</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Expected Trend</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedTrend
     * @generated
     */
    EClass getExpectedTrend();

    /**
     * Returns the meta object for the attribute
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedTrend#getTrend
     * <em>Trend</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Trend</em>'.
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectedTrend#getTrend()
     * @see #getExpectedTrend()
     * @generated
     */
    EAttribute getExpectedTrend_Trend();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ExpectationsFactory getExpectationsFactory();

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
         * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedValueImpl
         * <em>Expected Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedValueImpl
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedValue()
         * @generated
         */
        EClass EXPECTED_VALUE = eINSTANCE.getExpectedValue();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedPrimitiveImpl
         * <em>Expected Primitive</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedPrimitiveImpl
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedPrimitive()
         * @generated
         */
        EClass EXPECTED_PRIMITIVE = eINSTANCE.getExpectedPrimitive();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.expectations.impl.NoExpectationImpl <em>No
         * Expectation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.expectations.impl.NoExpectationImpl
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getNoExpectation()
         * @generated
         */
        EClass NO_EXPECTATION = eINSTANCE.getNoExpectation();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedPercentageImpl
         * <em>Expected Percentage</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedPercentageImpl
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedPercentage()
         * @generated
         */
        EClass EXPECTED_PERCENTAGE = eINSTANCE.getExpectedPercentage();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EXPECTED_PERCENTAGE__VALUE = eINSTANCE.getExpectedPercentage_Value();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedCountImpl
         * <em>Expected Count</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedCountImpl
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedCount()
         * @generated
         */
        EClass EXPECTED_COUNT = eINSTANCE.getExpectedCount();

        /**
         * The meta object literal for the '<em><b>Count</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EXPECTED_COUNT__COUNT = eINSTANCE.getExpectedCount_Count();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTimeImpl
         * <em>Expected Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTimeImpl
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedTime()
         * @generated
         */
        EClass EXPECTED_TIME = eINSTANCE.getExpectedTime();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EXPECTED_TIME__VALUE = eINSTANCE.getExpectedTime_Value();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTrendImpl
         * <em>Expected Trend</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTrendImpl
         * @see org.palladiosimulator.spd.triggers.expectations.impl.ExpectationsPackageImpl#getExpectedTrend()
         * @generated
         */
        EClass EXPECTED_TREND = eINSTANCE.getExpectedTrend();

        /**
         * The meta object literal for the '<em><b>Trend</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute EXPECTED_TREND__TREND = eINSTANCE.getExpectedTrend_Trend();

    }

} // ExpectationsPackage
