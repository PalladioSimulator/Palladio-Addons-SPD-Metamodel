/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Initialization Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getInitializationType()
 * @model
 * @generated
 */
public enum InitializationType implements Enumerator {
    /**
     * The '<em><b>OPTIMISTIC</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #OPTIMISTIC_VALUE
     * @generated
     * @ordered
     */
    OPTIMISTIC(1, "OPTIMISTIC", "OPTIMISTIC"),

    /**
     * The '<em><b>PESSIMISTIC</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #PESSIMISTIC_VALUE
     * @generated
     * @ordered
     */
    PESSIMISTIC(0, "PESSIMISTIC", "PESSIMISTIC"),

    /**
     * The '<em><b>KNOWLEDGE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #KNOWLEDGE_VALUE
     * @generated
     * @ordered
     */
    KNOWLEDGE(2, "KNOWLEDGE", "KNOWLEDGE");

    /**
     * The '<em><b>OPTIMISTIC</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #OPTIMISTIC
     * @model
     * @generated
     * @ordered
     */
    public static final int OPTIMISTIC_VALUE = 1;

    /**
     * The '<em><b>PESSIMISTIC</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #PESSIMISTIC
     * @model
     * @generated
     * @ordered
     */
    public static final int PESSIMISTIC_VALUE = 0;

    /**
     * The '<em><b>KNOWLEDGE</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #KNOWLEDGE
     * @model
     * @generated
     * @ordered
     */
    public static final int KNOWLEDGE_VALUE = 2;

    /**
     * An array of all the '<em><b>Initialization Type</b></em>' enumerators. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final InitializationType[] VALUES_ARRAY = new InitializationType[] { OPTIMISTIC, PESSIMISTIC,
            KNOWLEDGE, };

    /**
     * A public read-only list of all the '<em><b>Initialization Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<InitializationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Initialization Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InitializationType get(final String literal) {
        for (final InitializationType result : VALUES_ARRAY) {
            if (result.toString()
                .equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Initialization Type</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InitializationType getByName(final String name) {
        for (final InitializationType result : VALUES_ARRAY) {
            if (result.getName()
                .equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Initialization Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static InitializationType get(final int value) {
        switch (value) {
        case OPTIMISTIC_VALUE:
            return OPTIMISTIC;
        case PESSIMISTIC_VALUE:
            return PESSIMISTIC;
        case KNOWLEDGE_VALUE:
            return KNOWLEDGE;
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
    private InitializationType(final int value, final String name, final String literal) {
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

} // InitializationType
