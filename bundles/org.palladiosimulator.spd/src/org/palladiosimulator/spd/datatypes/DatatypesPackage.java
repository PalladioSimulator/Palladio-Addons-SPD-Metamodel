/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.datatypes;

import org.eclipse.emf.ecore.EDataType;
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
 * @see org.palladiosimulator.spd.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "datatypes";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalingPolicyDefinition/Datatypes/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "datatypes";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    DatatypesPackage eINSTANCE = org.palladiosimulator.spd.datatypes.impl.DatatypesPackageImpl.init();

    /**
     * The meta object id for the '<em>Percent Double</em>' data type. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.palladiosimulator.spd.datatypes.impl.DatatypesPackageImpl#getPercentDouble()
     * @generated
     */
    int PERCENT_DOUBLE = 0;

    /**
     * The meta object id for the '<em>Positive Integer</em>' data type. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.spd.datatypes.impl.DatatypesPackageImpl#getPositiveInteger()
     * @generated
     */
    int POSITIVE_INTEGER = 1;

    /**
     * The meta object id for the '<em>Positive Double</em>' data type. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.palladiosimulator.spd.datatypes.impl.DatatypesPackageImpl#getPositiveDouble()
     * @generated
     */
    int POSITIVE_DOUBLE = 2;

    /**
     * Returns the meta object for data type '<em>Percent Double</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the meta object for data type '<em>Percent Double</em>'.
     * @model instanceClass="double" extendedMetaData="maxInclusive='1.0' minInclusive='0.0'"
     * @generated
     */
    EDataType getPercentDouble();

    /**
     * Returns the meta object for data type '<em>Positive Integer</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Positive Integer</em>'.
     * @model instanceClass="int" extendedMetaData="minInclusive='0'"
     * @generated
     */
    EDataType getPositiveInteger();

    /**
     * Returns the meta object for data type '<em>Positive Double</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the meta object for data type '<em>Positive Double</em>'.
     * @model instanceClass="double" extendedMetaData="minInclusive='0.0'"
     * @generated
     */
    EDataType getPositiveDouble();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DatatypesFactory getDatatypesFactory();

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
         * The meta object literal for the '<em>Percent Double</em>' data type. <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.datatypes.impl.DatatypesPackageImpl#getPercentDouble()
         * @generated
         */
        EDataType PERCENT_DOUBLE = eINSTANCE.getPercentDouble();

        /**
         * The meta object literal for the '<em>Positive Integer</em>' data type. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.datatypes.impl.DatatypesPackageImpl#getPositiveInteger()
         * @generated
         */
        EDataType POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

        /**
         * The meta object literal for the '<em>Positive Double</em>' data type. <!-- begin-user-doc
         * --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.spd.datatypes.impl.DatatypesPackageImpl#getPositiveDouble()
         * @generated
         */
        EDataType POSITIVE_DOUBLE = eINSTANCE.getPositiveDouble();

    }

} // DatatypesPackage
