/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.gACL.GACLFactory
 * @model kind="package"
 * @generated
 */
public interface GACLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gACL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/GACL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gACL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GACLPackage eINSTANCE = org.xtext.example.mydsl.gACL.impl.GACLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.ProgramImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__STMTS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.StatementImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.PTypeImpl <em>PType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.PTypeImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getPType()
   * @generated
   */
  int PTYPE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>PType</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.TypeDeclImpl <em>Type Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.TypeDeclImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getTypeDecl()
   * @generated
   */
  int TYPE_DECL = 3;

  /**
   * The feature id for the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__TYPENAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tpcode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__TPCODE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.typeCodeImpl <em>type Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.typeCodeImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#gettypeCode()
   * @generated
   */
  int TYPE_CODE = 4;

  /**
   * The feature id for the '<em><b>Prm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CODE__PRM = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CODE__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>type Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.elementImpl <em>element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.elementImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getelement()
   * @generated
   */
  int ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Elemname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ELEMNAME = 0;

  /**
   * The feature id for the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TYPENAME = 1;

  /**
   * The feature id for the '<em><b>Prmtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__PRMTYPE = 2;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ARGS = 3;

  /**
   * The number of structural features of the '<em>element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.example.mydsl.gACL.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.gACL.Program#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.xtext.example.mydsl.gACL.Program#getStmts()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Stmts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.gACL.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.PType <em>PType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PType</em>'.
   * @see org.xtext.example.mydsl.gACL.PType
   * @generated
   */
  EClass getPType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.gACL.PType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.gACL.PType#getType()
   * @see #getPType()
   * @generated
   */
  EAttribute getPType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.TypeDecl <em>Type Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Decl</em>'.
   * @see org.xtext.example.mydsl.gACL.TypeDecl
   * @generated
   */
  EClass getTypeDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.gACL.TypeDecl#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typename</em>'.
   * @see org.xtext.example.mydsl.gACL.TypeDecl#getTypename()
   * @see #getTypeDecl()
   * @generated
   */
  EAttribute getTypeDecl_Typename();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.TypeDecl#getTpcode <em>Tpcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tpcode</em>'.
   * @see org.xtext.example.mydsl.gACL.TypeDecl#getTpcode()
   * @see #getTypeDecl()
   * @generated
   */
  EReference getTypeDecl_Tpcode();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.typeCode <em>type Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type Code</em>'.
   * @see org.xtext.example.mydsl.gACL.typeCode
   * @generated
   */
  EClass gettypeCode();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.typeCode#getPrm <em>Prm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prm</em>'.
   * @see org.xtext.example.mydsl.gACL.typeCode#getPrm()
   * @see #gettypeCode()
   * @generated
   */
  EReference gettypeCode_Prm();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.gACL.typeCode#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.gACL.typeCode#getElements()
   * @see #gettypeCode()
   * @generated
   */
  EReference gettypeCode_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.element <em>element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>element</em>'.
   * @see org.xtext.example.mydsl.gACL.element
   * @generated
   */
  EClass getelement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.gACL.element#getElemname <em>Elemname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Elemname</em>'.
   * @see org.xtext.example.mydsl.gACL.element#getElemname()
   * @see #getelement()
   * @generated
   */
  EAttribute getelement_Elemname();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.gACL.element#getTypename <em>Typename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typename</em>'.
   * @see org.xtext.example.mydsl.gACL.element#getTypename()
   * @see #getelement()
   * @generated
   */
  EAttribute getelement_Typename();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.element#getPrmtype <em>Prmtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prmtype</em>'.
   * @see org.xtext.example.mydsl.gACL.element#getPrmtype()
   * @see #getelement()
   * @generated
   */
  EReference getelement_Prmtype();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.gACL.element#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see org.xtext.example.mydsl.gACL.element#getArgs()
   * @see #getelement()
   * @generated
   */
  EAttribute getelement_Args();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GACLFactory getGACLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.ProgramImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__STMTS = eINSTANCE.getProgram_Stmts();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.StatementImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.PTypeImpl <em>PType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.PTypeImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getPType()
     * @generated
     */
    EClass PTYPE = eINSTANCE.getPType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PTYPE__TYPE = eINSTANCE.getPType_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.TypeDeclImpl <em>Type Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.TypeDeclImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getTypeDecl()
     * @generated
     */
    EClass TYPE_DECL = eINSTANCE.getTypeDecl();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECL__TYPENAME = eINSTANCE.getTypeDecl_Typename();

    /**
     * The meta object literal for the '<em><b>Tpcode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__TPCODE = eINSTANCE.getTypeDecl_Tpcode();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.typeCodeImpl <em>type Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.typeCodeImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#gettypeCode()
     * @generated
     */
    EClass TYPE_CODE = eINSTANCE.gettypeCode();

    /**
     * The meta object literal for the '<em><b>Prm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CODE__PRM = eINSTANCE.gettypeCode_Prm();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CODE__ELEMENTS = eINSTANCE.gettypeCode_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.elementImpl <em>element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.elementImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getelement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getelement();

    /**
     * The meta object literal for the '<em><b>Elemname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__ELEMNAME = eINSTANCE.getelement_Elemname();

    /**
     * The meta object literal for the '<em><b>Typename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__TYPENAME = eINSTANCE.getelement_Typename();

    /**
     * The meta object literal for the '<em><b>Prmtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__PRMTYPE = eINSTANCE.getelement_Prmtype();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__ARGS = eINSTANCE.getelement_Args();

  }

} //GACLPackage
