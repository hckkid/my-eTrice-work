/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ifte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.ifte#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.ifte#getStmts <em>Stmts</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.ifte#getEstmts <em>Estmts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getifte()
 * @model
 * @generated
 */
public interface ifte extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(IntExpression)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getifte_Cond()
   * @model containment="true"
   * @generated
   */
  IntExpression getCond();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.ifte#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(IntExpression value);

  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getifte_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getStmts();

  /**
   * Returns the value of the '<em><b>Estmts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estmts</em>' containment reference list.
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getifte_Estmts()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getEstmts();

} // ifte
