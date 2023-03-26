/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.constraints.target;

import org.palladiosimulator.spd.constraints.StateBasedContraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Size Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.constraints.target.TargetPackage#getTargetGroupSizeConstraint()
 * @model
 * @generated
 */
public interface TargetGroupSizeConstraint extends TargetConstraint, StateBasedContraint {
	/**
	 * Returns the value of the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Size</em>' attribute.
	 * @see #setMinSize(int)
	 * @see org.palladiosimulator.spd.constraints.target.TargetPackage#getTargetGroupSizeConstraint_MinSize()
	 * @model required="true"
	 * @generated
	 */
	int getMinSize();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint#getMinSize <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Size</em>' attribute.
	 * @see #getMinSize()
	 * @generated
	 */
	void setMinSize(int value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see org.palladiosimulator.spd.constraints.target.TargetPackage#getTargetGroupSizeConstraint_MaxSize()
	 * @model required="true"
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.spd.constraints.target.TargetGroupSizeConstraint#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

} // TargetGroupSizeConstraint
