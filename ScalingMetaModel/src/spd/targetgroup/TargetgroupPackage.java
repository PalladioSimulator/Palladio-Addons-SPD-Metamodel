/**
 */
package spd.targetgroup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import spd.SpdPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spd.targetgroup.TargetgroupFactory
 * @model kind="package"
 * @generated
 */
public interface TargetgroupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "targetgroup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "targetgroup";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "targetgroup";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetgroupPackage eINSTANCE = spd.targetgroup.impl.TargetgroupPackageImpl.init();

	/**
	 * The meta object id for the '{@link spd.targetgroup.impl.TargetGroupImpl <em>Target Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spd.targetgroup.impl.TargetGroupImpl
	 * @see spd.targetgroup.impl.TargetgroupPackageImpl#getTargetGroup()
	 * @generated
	 */
	int TARGET_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__NAME = SpdPackage.TARGET_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__RESOURCE_ENVIRONMENT = SpdPackage.TARGET_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_FEATURE_COUNT = SpdPackage.TARGET_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_OPERATION_COUNT = SpdPackage.TARGET_GROUP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link spd.targetgroup.TargetGroup <em>Target Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group</em>'.
	 * @see spd.targetgroup.TargetGroup
	 * @generated
	 */
	EClass getTargetGroup();

	/**
	 * Returns the meta object for the attribute '{@link spd.targetgroup.TargetGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see spd.targetgroup.TargetGroup#getName()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EAttribute getTargetGroup_Name();

	/**
	 * Returns the meta object for the reference '{@link spd.targetgroup.TargetGroup#getResourceEnvironment <em>Resource Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Environment</em>'.
	 * @see spd.targetgroup.TargetGroup#getResourceEnvironment()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EReference getTargetGroup_ResourceEnvironment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetgroupFactory getTargetgroupFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spd.targetgroup.impl.TargetGroupImpl <em>Target Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spd.targetgroup.impl.TargetGroupImpl
		 * @see spd.targetgroup.impl.TargetgroupPackageImpl#getTargetGroup()
		 * @generated
		 */
		EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_GROUP__NAME = eINSTANCE.getTargetGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_GROUP__RESOURCE_ENVIRONMENT = eINSTANCE.getTargetGroup_ResourceEnvironment();

	}

} //TargetgroupPackage
