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
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.DetailCodeImpl <em>Detail Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.DetailCodeImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getDetailCode()
   * @generated
   */
  int DETAIL_CODE = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_CODE__STMTS = 0;

  /**
   * The number of structural features of the '<em>Detail Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_CODE_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Td</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__TD = 0;

  /**
   * The feature id for the '<em><b>Vd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VD = 1;

  /**
   * The feature id for the '<em><b>Vin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VIN = 2;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.VarDeclImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Pt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__PT = 1;

  /**
   * The feature id for the '<em><b>Td</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__TD = 2;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.PTypeImpl <em>PType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.PTypeImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getPType()
   * @generated
   */
  int PTYPE = 3;

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
  int TYPE_DECL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Tp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL__TP = 1;

  /**
   * The number of structural features of the '<em>Type Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.VarInstImpl <em>Var Inst</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.VarInstImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getVarInst()
   * @generated
   */
  int VAR_INST = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INST__NAME = 0;

  /**
   * The feature id for the '<em><b>Strexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INST__STREXP = 1;

  /**
   * The feature id for the '<em><b>Inexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INST__INEXP = 2;

  /**
   * The number of structural features of the '<em>Var Inst</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.StringExpressionImpl <em>String Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.StringExpressionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getStringExpression()
   * @generated
   */
  int STRING_EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>String Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.StringLiteralImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = STRING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = STRING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.IntExpressionImpl <em>Int Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.IntExpressionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getIntExpression()
   * @generated
   */
  int INT_EXPRESSION = 8;

  /**
   * The number of structural features of the '<em>Int Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.IntLiteralImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = INT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.ConcatImpl <em>Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.ConcatImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getConcat()
   * @generated
   */
  int CONCAT = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__LEFT = STRING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__RIGHT = STRING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT_FEATURE_COUNT = STRING_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.SubtractionImpl <em>Subtraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.SubtractionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getSubtraction()
   * @generated
   */
  int SUBTRACTION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION__LEFT = INT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION__RIGHT = INT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subtraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.AdditionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LEFT = INT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__RIGHT = INT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.MultiplicationImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = INT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = INT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.DivisionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = INT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = INT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.PowerOfImpl <em>Power Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.PowerOfImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getPowerOf()
   * @generated
   */
  int POWER_OF = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_OF__LEFT = INT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_OF__RIGHT = INT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Power Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_OF_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.DetailCode <em>Detail Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Detail Code</em>'.
   * @see org.xtext.example.mydsl.gACL.DetailCode
   * @generated
   */
  EClass getDetailCode();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.gACL.DetailCode#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.xtext.example.mydsl.gACL.DetailCode#getStmts()
   * @see #getDetailCode()
   * @generated
   */
  EReference getDetailCode_Stmts();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Statement#getTd <em>Td</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Td</em>'.
   * @see org.xtext.example.mydsl.gACL.Statement#getTd()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Td();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Statement#getVd <em>Vd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vd</em>'.
   * @see org.xtext.example.mydsl.gACL.Statement#getVd()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Vd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Statement#getVin <em>Vin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vin</em>'.
   * @see org.xtext.example.mydsl.gACL.Statement#getVin()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Vin();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see org.xtext.example.mydsl.gACL.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.gACL.VarDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.gACL.VarDecl#getName()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.VarDecl#getPt <em>Pt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pt</em>'.
   * @see org.xtext.example.mydsl.gACL.VarDecl#getPt()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Pt();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.gACL.VarDecl#getTd <em>Td</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Td</em>'.
   * @see org.xtext.example.mydsl.gACL.VarDecl#getTd()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Td();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.gACL.TypeDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.gACL.TypeDecl#getName()
   * @see #getTypeDecl()
   * @generated
   */
  EAttribute getTypeDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.TypeDecl#getTp <em>Tp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tp</em>'.
   * @see org.xtext.example.mydsl.gACL.TypeDecl#getTp()
   * @see #getTypeDecl()
   * @generated
   */
  EReference getTypeDecl_Tp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.VarInst <em>Var Inst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Inst</em>'.
   * @see org.xtext.example.mydsl.gACL.VarInst
   * @generated
   */
  EClass getVarInst();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.gACL.VarInst#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.gACL.VarInst#getName()
   * @see #getVarInst()
   * @generated
   */
  EReference getVarInst_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.VarInst#getStrexp <em>Strexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Strexp</em>'.
   * @see org.xtext.example.mydsl.gACL.VarInst#getStrexp()
   * @see #getVarInst()
   * @generated
   */
  EReference getVarInst_Strexp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.VarInst#getInexp <em>Inexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inexp</em>'.
   * @see org.xtext.example.mydsl.gACL.VarInst#getInexp()
   * @see #getVarInst()
   * @generated
   */
  EReference getVarInst_Inexp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Expression</em>'.
   * @see org.xtext.example.mydsl.gACL.StringExpression
   * @generated
   */
  EClass getStringExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.xtext.example.mydsl.gACL.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.gACL.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.gACL.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.IntExpression <em>Int Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Expression</em>'.
   * @see org.xtext.example.mydsl.gACL.IntExpression
   * @generated
   */
  EClass getIntExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see org.xtext.example.mydsl.gACL.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.gACL.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.gACL.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Concat <em>Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concat</em>'.
   * @see org.xtext.example.mydsl.gACL.Concat
   * @generated
   */
  EClass getConcat();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Concat#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.gACL.Concat#getLeft()
   * @see #getConcat()
   * @generated
   */
  EReference getConcat_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Concat#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.gACL.Concat#getRight()
   * @see #getConcat()
   * @generated
   */
  EReference getConcat_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Subtraction <em>Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtraction</em>'.
   * @see org.xtext.example.mydsl.gACL.Subtraction
   * @generated
   */
  EClass getSubtraction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Subtraction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.gACL.Subtraction#getLeft()
   * @see #getSubtraction()
   * @generated
   */
  EReference getSubtraction_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Subtraction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.gACL.Subtraction#getRight()
   * @see #getSubtraction()
   * @generated
   */
  EReference getSubtraction_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see org.xtext.example.mydsl.gACL.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Addition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.gACL.Addition#getLeft()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Addition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.gACL.Addition#getRight()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see org.xtext.example.mydsl.gACL.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.gACL.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.gACL.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see org.xtext.example.mydsl.gACL.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.gACL.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.gACL.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.PowerOf <em>Power Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Power Of</em>'.
   * @see org.xtext.example.mydsl.gACL.PowerOf
   * @generated
   */
  EClass getPowerOf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.PowerOf#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.gACL.PowerOf#getLeft()
   * @see #getPowerOf()
   * @generated
   */
  EReference getPowerOf_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.PowerOf#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.gACL.PowerOf#getRight()
   * @see #getPowerOf()
   * @generated
   */
  EReference getPowerOf_Right();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.DetailCodeImpl <em>Detail Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.DetailCodeImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getDetailCode()
     * @generated
     */
    EClass DETAIL_CODE = eINSTANCE.getDetailCode();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DETAIL_CODE__STMTS = eINSTANCE.getDetailCode_Stmts();

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
     * The meta object literal for the '<em><b>Td</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__TD = eINSTANCE.getStatement_Td();

    /**
     * The meta object literal for the '<em><b>Vd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VD = eINSTANCE.getStatement_Vd();

    /**
     * The meta object literal for the '<em><b>Vin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VIN = eINSTANCE.getStatement_Vin();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.VarDeclImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__NAME = eINSTANCE.getVarDecl_Name();

    /**
     * The meta object literal for the '<em><b>Pt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__PT = eINSTANCE.getVarDecl_Pt();

    /**
     * The meta object literal for the '<em><b>Td</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__TD = eINSTANCE.getVarDecl_Td();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECL__NAME = eINSTANCE.getTypeDecl_Name();

    /**
     * The meta object literal for the '<em><b>Tp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECL__TP = eINSTANCE.getTypeDecl_Tp();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.VarInstImpl <em>Var Inst</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.VarInstImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getVarInst()
     * @generated
     */
    EClass VAR_INST = eINSTANCE.getVarInst();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_INST__NAME = eINSTANCE.getVarInst_Name();

    /**
     * The meta object literal for the '<em><b>Strexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_INST__STREXP = eINSTANCE.getVarInst_Strexp();

    /**
     * The meta object literal for the '<em><b>Inexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_INST__INEXP = eINSTANCE.getVarInst_Inexp();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.StringExpressionImpl <em>String Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.StringExpressionImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getStringExpression()
     * @generated
     */
    EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.StringLiteralImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.IntExpressionImpl <em>Int Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.IntExpressionImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getIntExpression()
     * @generated
     */
    EClass INT_EXPRESSION = eINSTANCE.getIntExpression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.IntLiteralImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.ConcatImpl <em>Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.ConcatImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getConcat()
     * @generated
     */
    EClass CONCAT = eINSTANCE.getConcat();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCAT__LEFT = eINSTANCE.getConcat_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCAT__RIGHT = eINSTANCE.getConcat_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.SubtractionImpl <em>Subtraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.SubtractionImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getSubtraction()
     * @generated
     */
    EClass SUBTRACTION = eINSTANCE.getSubtraction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTRACTION__LEFT = eINSTANCE.getSubtraction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTRACTION__RIGHT = eINSTANCE.getSubtraction_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.AdditionImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__LEFT = eINSTANCE.getAddition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__RIGHT = eINSTANCE.getAddition_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.MultiplicationImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT = eINSTANCE.getMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT = eINSTANCE.getMultiplication_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.DivisionImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.PowerOfImpl <em>Power Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.PowerOfImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getPowerOf()
     * @generated
     */
    EClass POWER_OF = eINSTANCE.getPowerOf();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POWER_OF__LEFT = eINSTANCE.getPowerOf_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POWER_OF__RIGHT = eINSTANCE.getPowerOf_Right();

  }

} //GACLPackage
