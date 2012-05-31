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
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.CodeImpl <em>Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.CodeImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getCode()
   * @generated
   */
  int CODE = 0;

  /**
   * The feature id for the '<em><b>Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__DECLS = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__STMTS = 1;

  /**
   * The number of structural features of the '<em>Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.SingleStatementImpl <em>Single Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.SingleStatementImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getSingleStatement()
   * @generated
   */
  int SINGLE_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Td</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT__TD = 0;

  /**
   * The feature id for the '<em><b>Vd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT__VD = 1;

  /**
   * The feature id for the '<em><b>Vin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT__VIN = 2;

  /**
   * The feature id for the '<em><b>Ifst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT__IFST = 3;

  /**
   * The feature id for the '<em><b>Fl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT__FL = 4;

  /**
   * The number of structural features of the '<em>Single Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.StatementImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Vin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VIN = 0;

  /**
   * The feature id for the '<em><b>Ifst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IFST = 1;

  /**
   * The feature id for the '<em><b>Fl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FL = 2;

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
  int VAR_DECL = 3;

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
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__TYPE = 3;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.PTypeImpl <em>PType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.PTypeImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getPType()
   * @generated
   */
  int PTYPE = 4;

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
  int TYPE_DECL = 5;

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
  int VAR_INST = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INST__NAME = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INST__EXP = 1;

  /**
   * The number of structural features of the '<em>Var Inst</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.ExpressionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.IntLiteralImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.StringLiteralImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.VarExpsImpl <em>Var Exps</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.VarExpsImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getVarExps()
   * @generated
   */
  int VAR_EXPS = 10;

  /**
   * The feature id for the '<em><b>Vrnm</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPS__VRNM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Exps</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.forlpImpl <em>forlp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.forlpImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getforlp()
   * @generated
   */
  int FORLP = 11;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORLP__COND = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORLP__STMTS = 1;

  /**
   * The number of structural features of the '<em>forlp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORLP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.ifteImpl <em>ifte</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.ifteImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getifte()
   * @generated
   */
  int IFTE = 12;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFTE__COND = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFTE__STMTS = 1;

  /**
   * The feature id for the '<em><b>Estmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFTE__ESTMTS = 2;

  /**
   * The number of structural features of the '<em>ifte</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IFTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.ConcatImpl <em>Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.ConcatImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getConcat()
   * @generated
   */
  int CONCAT = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.SubtractionImpl <em>Subtraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.SubtractionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getSubtraction()
   * @generated
   */
  int SUBTRACTION = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subtraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.AdditionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.MultiplicationImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.DivisionImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.gACL.impl.PowerOfImpl <em>Power Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.gACL.impl.PowerOfImpl
   * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getPowerOf()
   * @generated
   */
  int POWER_OF = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_OF__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_OF__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Power Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POWER_OF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Code <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code</em>'.
   * @see org.xtext.example.mydsl.gACL.Code
   * @generated
   */
  EClass getCode();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.gACL.Code#getDecls <em>Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decls</em>'.
   * @see org.xtext.example.mydsl.gACL.Code#getDecls()
   * @see #getCode()
   * @generated
   */
  EReference getCode_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.gACL.Code#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.xtext.example.mydsl.gACL.Code#getStmts()
   * @see #getCode()
   * @generated
   */
  EReference getCode_Stmts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.SingleStatement <em>Single Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Statement</em>'.
   * @see org.xtext.example.mydsl.gACL.SingleStatement
   * @generated
   */
  EClass getSingleStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.SingleStatement#getTd <em>Td</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Td</em>'.
   * @see org.xtext.example.mydsl.gACL.SingleStatement#getTd()
   * @see #getSingleStatement()
   * @generated
   */
  EReference getSingleStatement_Td();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.SingleStatement#getVd <em>Vd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vd</em>'.
   * @see org.xtext.example.mydsl.gACL.SingleStatement#getVd()
   * @see #getSingleStatement()
   * @generated
   */
  EReference getSingleStatement_Vd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.SingleStatement#getVin <em>Vin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vin</em>'.
   * @see org.xtext.example.mydsl.gACL.SingleStatement#getVin()
   * @see #getSingleStatement()
   * @generated
   */
  EReference getSingleStatement_Vin();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.SingleStatement#getIfst <em>Ifst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifst</em>'.
   * @see org.xtext.example.mydsl.gACL.SingleStatement#getIfst()
   * @see #getSingleStatement()
   * @generated
   */
  EReference getSingleStatement_Ifst();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.SingleStatement#getFl <em>Fl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fl</em>'.
   * @see org.xtext.example.mydsl.gACL.SingleStatement#getFl()
   * @see #getSingleStatement()
   * @generated
   */
  EReference getSingleStatement_Fl();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Statement#getIfst <em>Ifst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifst</em>'.
   * @see org.xtext.example.mydsl.gACL.Statement#getIfst()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Ifst();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.Statement#getFl <em>Fl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fl</em>'.
   * @see org.xtext.example.mydsl.gACL.Statement#getFl()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Fl();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.VarDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.gACL.VarDecl#getType()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Type();

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
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.VarInst#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.mydsl.gACL.VarInst#getExp()
   * @see #getVarInst()
   * @generated
   */
  EReference getVarInst_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.gACL.Expression
   * @generated
   */
  EClass getExpression();

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.VarExps <em>Var Exps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Exps</em>'.
   * @see org.xtext.example.mydsl.gACL.VarExps
   * @generated
   */
  EClass getVarExps();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.gACL.VarExps#getVrnm <em>Vrnm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Vrnm</em>'.
   * @see org.xtext.example.mydsl.gACL.VarExps#getVrnm()
   * @see #getVarExps()
   * @generated
   */
  EReference getVarExps_Vrnm();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.forlp <em>forlp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>forlp</em>'.
   * @see org.xtext.example.mydsl.gACL.forlp
   * @generated
   */
  EClass getforlp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.forlp#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.xtext.example.mydsl.gACL.forlp#getCond()
   * @see #getforlp()
   * @generated
   */
  EReference getforlp_Cond();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.gACL.forlp#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.xtext.example.mydsl.gACL.forlp#getStmts()
   * @see #getforlp()
   * @generated
   */
  EReference getforlp_Stmts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.gACL.ifte <em>ifte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ifte</em>'.
   * @see org.xtext.example.mydsl.gACL.ifte
   * @generated
   */
  EClass getifte();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.gACL.ifte#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.xtext.example.mydsl.gACL.ifte#getCond()
   * @see #getifte()
   * @generated
   */
  EReference getifte_Cond();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.gACL.ifte#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.xtext.example.mydsl.gACL.ifte#getStmts()
   * @see #getifte()
   * @generated
   */
  EReference getifte_Stmts();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.gACL.ifte#getEstmts <em>Estmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Estmts</em>'.
   * @see org.xtext.example.mydsl.gACL.ifte#getEstmts()
   * @see #getifte()
   * @generated
   */
  EReference getifte_Estmts();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.CodeImpl <em>Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.CodeImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getCode()
     * @generated
     */
    EClass CODE = eINSTANCE.getCode();

    /**
     * The meta object literal for the '<em><b>Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE__DECLS = eINSTANCE.getCode_Decls();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE__STMTS = eINSTANCE.getCode_Stmts();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.SingleStatementImpl <em>Single Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.SingleStatementImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getSingleStatement()
     * @generated
     */
    EClass SINGLE_STATEMENT = eINSTANCE.getSingleStatement();

    /**
     * The meta object literal for the '<em><b>Td</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STATEMENT__TD = eINSTANCE.getSingleStatement_Td();

    /**
     * The meta object literal for the '<em><b>Vd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STATEMENT__VD = eINSTANCE.getSingleStatement_Vd();

    /**
     * The meta object literal for the '<em><b>Vin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STATEMENT__VIN = eINSTANCE.getSingleStatement_Vin();

    /**
     * The meta object literal for the '<em><b>Ifst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STATEMENT__IFST = eINSTANCE.getSingleStatement_Ifst();

    /**
     * The meta object literal for the '<em><b>Fl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STATEMENT__FL = eINSTANCE.getSingleStatement_Fl();

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
     * The meta object literal for the '<em><b>Vin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VIN = eINSTANCE.getStatement_Vin();

    /**
     * The meta object literal for the '<em><b>Ifst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__IFST = eINSTANCE.getStatement_Ifst();

    /**
     * The meta object literal for the '<em><b>Fl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FL = eINSTANCE.getStatement_Fl();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

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
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_INST__EXP = eINSTANCE.getVarInst_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.ExpressionImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.VarExpsImpl <em>Var Exps</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.VarExpsImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getVarExps()
     * @generated
     */
    EClass VAR_EXPS = eINSTANCE.getVarExps();

    /**
     * The meta object literal for the '<em><b>Vrnm</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_EXPS__VRNM = eINSTANCE.getVarExps_Vrnm();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.forlpImpl <em>forlp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.forlpImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getforlp()
     * @generated
     */
    EClass FORLP = eINSTANCE.getforlp();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORLP__COND = eINSTANCE.getforlp_Cond();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORLP__STMTS = eINSTANCE.getforlp_Stmts();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.gACL.impl.ifteImpl <em>ifte</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.gACL.impl.ifteImpl
     * @see org.xtext.example.mydsl.gACL.impl.GACLPackageImpl#getifte()
     * @generated
     */
    EClass IFTE = eINSTANCE.getifte();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFTE__COND = eINSTANCE.getifte_Cond();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFTE__STMTS = eINSTANCE.getifte_Stmts();

    /**
     * The meta object literal for the '<em><b>Estmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IFTE__ESTMTS = eINSTANCE.getifte_Estmts();

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
