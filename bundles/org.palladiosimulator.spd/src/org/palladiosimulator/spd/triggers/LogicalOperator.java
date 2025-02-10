/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Logical
 * Operator</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getLogicalOperator()
 * @model
 * @generated
 */
public enum LogicalOperator implements Enumerator {
    /**
     * The '<em><b>AND</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #AND_VALUE
     * @generated
     * @ordered
     */
    AND(0, "AND", "AND"),

    /**
     * The '<em><b>OR</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #OR_VALUE
     * @generated
     * @ordered
     */
    OR(1, "OR", "OR"),

    /**
     * The '<em><b>XOR</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #XOR_VALUE
     * @generated
     * @ordered
     */
    XOR(2, "XOR", "XOR");

    /**
     * The '<em><b>AND</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #AND
     * @model
     * @generated
     * @ordered
     */
    public static final int AND_VALUE = 0;

    /**
     * The '<em><b>OR</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #OR
     * @model
     * @generated
     * @ordered
     */
    public static final int OR_VALUE = 1;

    /**
     * The '<em><b>XOR</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #XOR
     * @model
     * @generated
     * @ordered
     */
    public static final int XOR_VALUE = 2;

    /**
     * An array of all the '<em><b>Logical Operator</b></em>' enumerators. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final LogicalOperator[] VALUES_ARRAY = new LogicalOperator[] { AND, OR, XOR, };

    /**
     * A public read-only list of all the '<em><b>Logical Operator</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<LogicalOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Logical Operator</b></em>' literal with the specified literal value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LogicalOperator get(final String literal) {
        for (final LogicalOperator result : VALUES_ARRAY) {
            if (result.toString()
                .equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Logical Operator</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LogicalOperator getByName(final String name) {
        for (final LogicalOperator result : VALUES_ARRAY) {
            if (result.getName()
                .equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Logical Operator</b></em>' literal with the specified integer value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static LogicalOperator get(final int value) {
        switch (value) {
        case AND_VALUE:
            return AND;
        case OR_VALUE:
            return OR;
        case XOR_VALUE:
            return XOR;
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
    private LogicalOperator(final int value, final String name, final String literal) {
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

} // LogicalOperator
