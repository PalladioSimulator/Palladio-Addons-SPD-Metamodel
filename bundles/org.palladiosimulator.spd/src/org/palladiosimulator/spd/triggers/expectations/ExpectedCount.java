/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Expected Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.expectations.ExpectedCount#getCount
 * <em>Count</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage#getExpectedCount()
 * @model
 * @generated
 */
public interface ExpectedCount extends ExpectedPrimitive {
    /**
     * Returns the value of the '<em><b>Count</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Count</em>' attribute.
     * @see #setCount(int)
     * @see org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage#getExpectedCount_Count()
     * @model
     * @generated
     */
    int getCount();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.spd.triggers.expectations.ExpectedCount#getCount
     * <em>Count</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Count</em>' attribute.
     * @see #getCount()
     * @generated
     */
    void setCount(int value);

} // ExpectedCount
