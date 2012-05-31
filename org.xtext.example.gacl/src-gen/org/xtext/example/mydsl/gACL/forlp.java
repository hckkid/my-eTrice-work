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
 * A representation of the model object '<em><b>forlp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.forlp#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.forlp#getStmts <em>Stmts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getforlp()
 * @model
 * @generated
 */
public interface forlp extends EObject
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
   * @see #setCond(Expression)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getforlp_Cond()
   * @model containment="true"
   * @generated
   */
  Expression getCond();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.forlp#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expression value);

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
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getforlp_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getStmts();

} // forlp
