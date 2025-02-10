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
 * '<em><b>HDDUSAGETYPE</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * <!-- begin-model-doc --> Enum for the type of HDD usage: READ, WRITE <!-- end-model-doc -->
 *
 * @see org.palladiosimulator.spd.triggers.TriggersPackage#getHDDUSAGETYPE()
 * @model
 * @generated
 */
public enum HDDUSAGETYPE implements Enumerator {
    /**
     * The '<em><b>READ</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #READ_VALUE
     * @generated
     * @ordered
     */
    READ(0, "READ", "READ"),

    /**
     * The '<em><b>WRITE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #WRITE_VALUE
     * @generated
     * @ordered
     */
    WRITE(1, "WRITE", "WRITE");

    /**
     * The '<em><b>READ</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #READ
     * @model
     * @generated
     * @ordered
     */
    public static final int READ_VALUE = 0;

    /**
     * The '<em><b>WRITE</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #WRITE
     * @model
     * @generated
     * @ordered
     */
    public static final int WRITE_VALUE = 1;

    /**
     * An array of all the '<em><b>HDDUSAGETYPE</b></em>' enumerators. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    private static final HDDUSAGETYPE[] VALUES_ARRAY = new HDDUSAGETYPE[] { READ, WRITE, };

    /**
     * A public read-only list of all the '<em><b>HDDUSAGETYPE</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List<HDDUSAGETYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>HDDUSAGETYPE</b></em>' literal with the specified literal value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param literal
     *            the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HDDUSAGETYPE get(final String literal) {
        for (final HDDUSAGETYPE result : VALUES_ARRAY) {
            if (result.toString()
                .equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>HDDUSAGETYPE</b></em>' literal with the specified name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param name
     *            the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HDDUSAGETYPE getByName(final String name) {
        for (final HDDUSAGETYPE result : VALUES_ARRAY) {
            if (result.getName()
                .equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>HDDUSAGETYPE</b></em>' literal with the specified integer value. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static HDDUSAGETYPE get(final int value) {
        switch (value) {
        case READ_VALUE:
            return READ;
        case WRITE_VALUE:
            return WRITE;
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
    private HDDUSAGETYPE(final int value, final String name, final String literal) {
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

} // HDDUSAGETYPE
