/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.datatypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.datatypes.DatatypesPackage
 * @generated
 */
public interface DatatypesFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    DatatypesFactory eINSTANCE = org.palladiosimulator.spd.datatypes.impl.DatatypesFactoryImpl.init();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    DatatypesPackage getDatatypesPackage();

} // DatatypesFactory
