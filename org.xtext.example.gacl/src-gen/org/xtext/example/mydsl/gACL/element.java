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
 * A representation of the model object '<em><b>element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.element#getElemname <em>Elemname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.element#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.element#getPrmtype <em>Prmtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.element#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getelement()
 * @model
 * @generated
 */
public interface element extends EObject
{
  /**
   * Returns the value of the '<em><b>Elemname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elemname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elemname</em>' attribute.
   * @see #setElemname(String)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getelement_Elemname()
   * @model
   * @generated
   */
  String getElemname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.element#getElemname <em>Elemname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elemname</em>' attribute.
   * @see #getElemname()
   * @generated
   */
  void setElemname(String value);

  /**
   * Returns the value of the '<em><b>Typename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typename</em>' attribute.
   * @see #setTypename(String)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getelement_Typename()
   * @model
   * @generated
   */
  String getTypename();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.element#getTypename <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' attribute.
   * @see #getTypename()
   * @generated
   */
  void setTypename(String value);

  /**
   * Returns the value of the '<em><b>Prmtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prmtype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prmtype</em>' containment reference.
   * @see #setPrmtype(PType)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getelement_Prmtype()
   * @model containment="true"
   * @generated
   */
  PType getPrmtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.element#getPrmtype <em>Prmtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prmtype</em>' containment reference.
   * @see #getPrmtype()
   * @generated
   */
  void setPrmtype(PType value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute list.
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getelement_Args()
   * @model unique="false"
   * @generated
   */
  EList<String> getArgs();

} // element
