/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Trend
 * Pattern</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getTrendPattern()
 * @model
 * @generated
 */
public enum TrendPattern implements Enumerator {
    /**
     * The '<em><b>Increasing</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #INCREASING_VALUE
     * @generated
     * @ordered
     */
    INCREASING(0, "Increasing", "Increasing"),

    /**
     * The '<em><b>Decreasing</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #DECREASING_VALUE
     * @generated
     * @ordered
     */
    DECREASING(1, "Decreasing", "Decreasing"),

    /**
     * The '<em><b>Non Increasing</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #NON_INCREASING_VALUE
     * @generated
     * @ordered
     */
    NON_INCREASING(2, "NonIncreasing", "NonIncreasing"),

    /**
     * The '<em><b>Non Decreasing</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #NON_DECREASING_VALUE
     * @generated
     * @ordered
     */
    NON_DECREASING(3, "NonDecreasing", "NonDecreasing");

    /**
     * The '<em><b>Increasing</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #INCREASING
     * @model name="Increasing"
     * @generated
     * @ordered
     */
    public static final int INCREASING_VALUE = 0;

    /**
     * The '<em><b>Decreasing</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #DECREASING
     * @model name="Decreasing"
     * @generated
     * @ordered
     */
    public static final int DECREASING_VALUE = 1;

    /**
     * The '<em><b>Non Increasing</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #NON_INCREASING
     * @model name="NonIncreasing"
     * @generated
     * @ordered
     */
    public static final int NON_INCREASING_VALUE = 2;

    /**
     * The '<em><b>Non Decreasing</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #NON_DECREASING
     * @model name="NonDecreasing"
     * @generated
     * @ordered
     */
    public static final int NON_DECREASING_VALUE = 3;

    /**
     * An array of all the '<em><b>Trend Pattern</b></em>' enumerators. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    private static final TrendPattern[] VALUES_ARRAY = new TrendPattern[] { INCREASING, DECREASING, NON_INCREASING,
            NON_DECREASING, };

    /**
     * A public read-only list of all the '<em><b>Trend Pattern</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<TrendPattern> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Trend Pattern</b></em>' literal with the specified literal value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TrendPattern get(final String literal) {
        for (final TrendPattern result : VALUES_ARRAY) {
            if (result.toString()
                .equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Trend Pattern</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TrendPattern getByName(final String name) {
        for (final TrendPattern result : VALUES_ARRAY) {
            if (result.getName()
                .equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Trend Pattern</b></em>' literal with the specified integer value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TrendPattern get(final int value) {
        switch (value) {
        case INCREASING_VALUE:
            return INCREASING;
        case DECREASING_VALUE:
            return DECREASING;
        case NON_INCREASING_VALUE:
            return NON_INCREASING;
        case NON_DECREASING_VALUE:
            return NON_DECREASING;
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
    private TrendPattern(final int value, final String name, final String literal) {
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

} // TrendPattern
