/**
 */
package spd.targetgroup;

import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.targetgroup.TargetGroup#getName <em>Name</em>}</li>
 *   <li>{@link spd.targetgroup.TargetGroup#getResourceEnvironment <em>Resource Environment</em>}</li>
 * </ul>
 *
 * @see spd.targetgroup.TargetgroupPackage#getTargetGroup()
 * @model
 * @generated
 */
public interface TargetGroup extends spd.TargetGroup {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spd.targetgroup.TargetgroupPackage#getTargetGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spd.targetgroup.TargetGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Environment</em>' reference.
	 * @see #setResourceEnvironment(ResourceEnvironment)
	 * @see spd.targetgroup.TargetgroupPackage#getTargetGroup_ResourceEnvironment()
	 * @model keys="entityName"
	 * @generated
	 */
	ResourceEnvironment getResourceEnvironment();

	/**
	 * Sets the value of the '{@link spd.targetgroup.TargetGroup#getResourceEnvironment <em>Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Environment</em>' reference.
	 * @see #getResourceEnvironment()
	 * @generated
	 */
	void setResourceEnvironment(ResourceEnvironment value);

} // TargetGroup
