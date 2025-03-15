/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>AGGREGATIONMETHOD</b></em>', and utility methods for working with them. <!-- end-user-doc
 * --> <!-- begin-model-doc --> Enum for the following aggregation methods: MIN, MAX, AVERAGE, SUM
 * that are relevant for different triggers. <!-- end-model-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getAGGREGATIONMETHOD()
 * @model
 * @generated
 */
public enum AGGREGATIONMETHOD implements Enumerator {
    /**
     * The '<em><b>AVERAGE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #AVERAGE_VALUE
     * @generated
     * @ordered
     */
    AVERAGE(0, "AVERAGE", "AVERAGE"),

    /**
     * The '<em><b>MAX</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #MAX_VALUE
     * @generated
     * @ordered
     */
    MAX(1, "MAX", "MAX"),

    /**
     * The '<em><b>MIN</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #MIN_VALUE
     * @generated
     * @ordered
     */
    MIN(2, "MIN", "MIN"),

    /**
     * The '<em><b>MEDIAN</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #MEDIAN_VALUE
     * @generated
     * @ordered
     */
    MEDIAN(3, "MEDIAN", "MEDIAN"),

    /**
     * The '<em><b>SUM</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #SUM_VALUE
     * @generated
     * @ordered
     */
    SUM(4, "SUM", "SUM"),
    /**
     * The '<em><b>RATEOFCHANGE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #RATEOFCHANGE_VALUE
     * @generated
     * @ordered
     */
    RATEOFCHANGE(5, "RATEOFCHANGE", "RATEOFCHANGE"),
    /**
     * The '<em><b>PERCENTILE95</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #PERCENTILE95_VALUE
     * @generated
     * @ordered
     */
    PERCENTILE95(6, "PERCENTILE95", "PERCENTILE95"),
    /**
     * The '<em><b>PERCENTILE90</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #PERCENTILE90_VALUE
     * @generated
     * @ordered
     */
    PERCENTILE90(7, "PERCENTILE90", "PERCENTILE90");

    /**
     * The '<em><b>AVERAGE</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #AVERAGE
     * @model
     * @generated
     * @ordered
     */
    public static final int AVERAGE_VALUE = 0;

    /**
     * The '<em><b>MAX</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #MAX
     * @model
     * @generated
     * @ordered
     */
    public static final int MAX_VALUE = 1;

    /**
     * The '<em><b>MIN</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #MIN
     * @model
     * @generated
     * @ordered
     */
    public static final int MIN_VALUE = 2;

    /**
     * The '<em><b>MEDIAN</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #MEDIAN
     * @model
     * @generated
     * @ordered
     */
    public static final int MEDIAN_VALUE = 3;

    /**
     * The '<em><b>SUM</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #SUM
     * @model
     * @generated
     * @ordered
     */
    public static final int SUM_VALUE = 4;

    /**
     * The '<em><b>RATEOFCHANGE</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #RATEOFCHANGE
     * @model
     * @generated
     * @ordered
     */
    public static final int RATEOFCHANGE_VALUE = 5;

    /**
     * The '<em><b>PERCENTILE95</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #PERCENTILE95
     * @model
     * @generated
     * @ordered
     */
    public static final int PERCENTILE95_VALUE = 6;

    /**
     * The '<em><b>PERCENTILE90</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #PERCENTILE90
     * @model
     * @generated
     * @ordered
     */
    public static final int PERCENTILE90_VALUE = 7;

    /**
     * An array of all the '<em><b>AGGREGATIONMETHOD</b></em>' enumerators. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final AGGREGATIONMETHOD[] VALUES_ARRAY = new AGGREGATIONMETHOD[] { AVERAGE, MAX, MIN, MEDIAN, SUM,
            RATEOFCHANGE, PERCENTILE95, PERCENTILE90, };

    /**
     * A public read-only list of all the '<em><b>AGGREGATIONMETHOD</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<AGGREGATIONMETHOD> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>AGGREGATIONMETHOD</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AGGREGATIONMETHOD get(final String literal) {
        for (final AGGREGATIONMETHOD result : VALUES_ARRAY) {
            if (result.toString()
                .equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>AGGREGATIONMETHOD</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AGGREGATIONMETHOD getByName(final String name) {
        for (final AGGREGATIONMETHOD result : VALUES_ARRAY) {
            if (result.getName()
                .equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>AGGREGATIONMETHOD</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AGGREGATIONMETHOD get(final int value) {
        switch (value) {
        case AVERAGE_VALUE:
            return AVERAGE;
        case MAX_VALUE:
            return MAX;
        case MIN_VALUE:
            return MIN;
        case MEDIAN_VALUE:
            return MEDIAN;
        case SUM_VALUE:
            return SUM;
        case RATEOFCHANGE_VALUE:
            return RATEOFCHANGE;
        case PERCENTILE95_VALUE:
            return PERCENTILE95;
        case PERCENTILE90_VALUE:
            return PERCENTILE90;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private AGGREGATIONMETHOD(final int value, final String name, final String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getValue() {
        return this.value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLiteral() {
        return this.literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        return this.literal;
    }

} // AGGREGATIONMETHOD
