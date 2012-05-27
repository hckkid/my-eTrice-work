/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.gACL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GACLFactoryImpl extends EFactoryImpl implements GACLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GACLFactory init()
  {
    try
    {
      GACLFactory theGACLFactory = (GACLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/mydsl/GACL"); 
      if (theGACLFactory != null)
      {
        return theGACLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GACLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GACLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GACLPackage.CODE: return createCode();
      case GACLPackage.SINGLE_STATEMENT: return createSingleStatement();
      case GACLPackage.STATEMENT: return createStatement();
      case GACLPackage.VAR_DECL: return createVarDecl();
      case GACLPackage.PTYPE: return createPType();
      case GACLPackage.TYPE_DECL: return createTypeDecl();
      case GACLPackage.VAR_INST: return createVarInst();
      case GACLPackage.STRING_EXPRESSION: return createStringExpression();
      case GACLPackage.STRING_LITERAL: return createStringLiteral();
      case GACLPackage.INT_EXPRESSION: return createIntExpression();
      case GACLPackage.INT_LITERAL: return createIntLiteral();
      case GACLPackage.EXPRESSION: return createExpression();
      case GACLPackage.VAR_EXPS: return createVarExps();
      case GACLPackage.IFTE: return createifte();
      case GACLPackage.CONCAT: return createConcat();
      case GACLPackage.SUBTRACTION: return createSubtraction();
      case GACLPackage.ADDITION: return createAddition();
      case GACLPackage.MULTIPLICATION: return createMultiplication();
      case GACLPackage.DIVISION: return createDivision();
      case GACLPackage.POWER_OF: return createPowerOf();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Code createCode()
  {
    CodeImpl code = new CodeImpl();
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleStatement createSingleStatement()
  {
    SingleStatementImpl singleStatement = new SingleStatementImpl();
    return singleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PType createPType()
  {
    PTypeImpl pType = new PTypeImpl();
    return pType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl createTypeDecl()
  {
    TypeDeclImpl typeDecl = new TypeDeclImpl();
    return typeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarInst createVarInst()
  {
    VarInstImpl varInst = new VarInstImpl();
    return varInst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExpression createIntExpression()
  {
    IntExpressionImpl intExpression = new IntExpressionImpl();
    return intExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExps createVarExps()
  {
    VarExpsImpl varExps = new VarExpsImpl();
    return varExps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ifte createifte()
  {
    ifteImpl ifte = new ifteImpl();
    return ifte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concat createConcat()
  {
    ConcatImpl concat = new ConcatImpl();
    return concat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subtraction createSubtraction()
  {
    SubtractionImpl subtraction = new SubtractionImpl();
    return subtraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PowerOf createPowerOf()
  {
    PowerOfImpl powerOf = new PowerOfImpl();
    return powerOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GACLPackage getGACLPackage()
  {
    return (GACLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GACLPackage getPackage()
  {
    return GACLPackage.eINSTANCE;
  }

} //GACLFactoryImpl
