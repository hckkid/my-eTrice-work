/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.Expression#getStrexp <em>Strexp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.Expression#getInexp <em>Inexp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.Expression#getVex <em>Vex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Strexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strexp</em>' containment reference.
   * @see #setStrexp(StringExpression)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getExpression_Strexp()
   * @model containment="true"
   * @generated
   */
  StringExpression getStrexp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.Expression#getStrexp <em>Strexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strexp</em>' containment reference.
   * @see #getStrexp()
   * @generated
   */
  void setStrexp(StringExpression value);

  /**
   * Returns the value of the '<em><b>Inexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inexp</em>' containment reference.
   * @see #setInexp(IntExpression)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getExpression_Inexp()
   * @model containment="true"
   * @generated
   */
  IntExpression getInexp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.Expression#getInexp <em>Inexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inexp</em>' containment reference.
   * @see #getInexp()
   * @generated
   */
  void setInexp(IntExpression value);

  /**
   * Returns the value of the '<em><b>Vex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vex</em>' containment reference.
   * @see #setVex(VarExps)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getExpression_Vex()
   * @model containment="true"
   * @generated
   */
  VarExps getVex();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.Expression#getVex <em>Vex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vex</em>' containment reference.
   * @see #getVex()
   * @generated
   */
  void setVex(VarExps value);

} // Expression
