/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Relational
 * Operator</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getRelationalOperator()
 * @model
 * @generated
 */
public enum RelationalOperator implements Enumerator {
    /**
     * The '<em><b>Less Than</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #LESS_THAN_VALUE
     * @generated
     * @ordered
     */
    LESS_THAN(0, "LessThan", "LessThan"),

    /**
     * The '<em><b>Greater Than</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #GREATER_THAN_VALUE
     * @generated
     * @ordered
     */
    GREATER_THAN(1, "GreaterThan", "GreaterThan"),

    /**
     * The '<em><b>Equal To</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #EQUAL_TO_VALUE
     * @generated
     * @ordered
     */
    EQUAL_TO(2, "EqualTo", "EqualTo"),

    /**
     * The '<em><b>Less Than Or Equal To</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #LESS_THAN_OR_EQUAL_TO_VALUE
     * @generated
     * @ordered
     */
    LESS_THAN_OR_EQUAL_TO(3, "LessThanOrEqualTo", "LessThanOrEqualTo"),

    /**
     * The '<em><b>Greater Than Or Equal To</b></em>' literal object. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #GREATER_THAN_OR_EQUAL_TO_VALUE
     * @generated
     * @ordered
     */
    GREATER_THAN_OR_EQUAL_TO(4, "GreaterThanOrEqualTo", "GreaterThanOrEqualTo");

    /**
     * The '<em><b>Less Than</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #LESS_THAN
     * @model name="LessThan"
     * @generated
     * @ordered
     */
    public static final int LESS_THAN_VALUE = 0;

    /**
     * The '<em><b>Greater Than</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #GREATER_THAN
     * @model name="GreaterThan"
     * @generated
     * @ordered
     */
    public static final int GREATER_THAN_VALUE = 1;

    /**
     * The '<em><b>Equal To</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #EQUAL_TO
     * @model name="EqualTo"
     * @generated
     * @ordered
     */
    public static final int EQUAL_TO_VALUE = 2;

    /**
     * The '<em><b>Less Than Or Equal To</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #LESS_THAN_OR_EQUAL_TO
     * @model name="LessThanOrEqualTo"
     * @generated
     * @ordered
     */
    public static final int LESS_THAN_OR_EQUAL_TO_VALUE = 3;

    /**
     * The '<em><b>Greater Than Or Equal To</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #GREATER_THAN_OR_EQUAL_TO
     * @model name="GreaterThanOrEqualTo"
     * @generated
     * @ordered
     */
    public static final int GREATER_THAN_OR_EQUAL_TO_VALUE = 4;

    /**
     * An array of all the '<em><b>Relational Operator</b></em>' enumerators. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final RelationalOperator[] VALUES_ARRAY = new RelationalOperator[] { LESS_THAN, GREATER_THAN,
            EQUAL_TO, LESS_THAN_OR_EQUAL_TO, GREATER_THAN_OR_EQUAL_TO, };

    /**
     * A public read-only list of all the '<em><b>Relational Operator</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<RelationalOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Relational Operator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RelationalOperator get(final String literal) {
        for (final RelationalOperator result : VALUES_ARRAY) {
            if (result.toString()
                .equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Relational Operator</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RelationalOperator getByName(final String name) {
        for (final RelationalOperator result : VALUES_ARRAY) {
            if (result.getName()
                .equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Relational Operator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RelationalOperator get(final int value) {
        switch (value) {
        case LESS_THAN_VALUE:
            return LESS_THAN;
        case GREATER_THAN_VALUE:
            return GREATER_THAN;
        case EQUAL_TO_VALUE:
            return EQUAL_TO;
        case LESS_THAN_OR_EQUAL_TO_VALUE:
            return LESS_THAN_OR_EQUAL_TO;
        case GREATER_THAN_OR_EQUAL_TO_VALUE:
            return GREATER_THAN_OR_EQUAL_TO;
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
    private RelationalOperator(final int value, final String name, final String literal) {
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

} // RelationalOperator
