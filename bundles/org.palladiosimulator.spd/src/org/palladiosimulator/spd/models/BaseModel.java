/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Base Model</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.models.BaseModel#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.models.BaseModel#getInitalIntervalDelay <em>Inital Interval Delay</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getBaseModel()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface BaseModel extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(double)
	 * @see org.palladiosimulator.spd.models.ModelsPackage#getBaseModel_Interval()
	 * @model default="1.0"
	 * @generated
	 */
	double getInterval();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.models.BaseModel#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(double value);

	/**
	 * Returns the value of the '<em><b>Inital Interval Delay</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Inital Interval Delay</em>' attribute.
	 * @see #setInitalIntervalDelay(double)
	 * @see org.palladiosimulator.spd.models.ModelsPackage#getBaseModel_InitalIntervalDelay()
	 * @model default="0"
	 * @generated
	 */
	double getInitalIntervalDelay();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.models.BaseModel#getInitalIntervalDelay <em>Inital Interval Delay</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inital Interval Delay</em>' attribute.
	 * @see #getInitalIntervalDelay()
	 * @generated
	 */
	void setInitalIntervalDelay(double value);

} // BaseModel
