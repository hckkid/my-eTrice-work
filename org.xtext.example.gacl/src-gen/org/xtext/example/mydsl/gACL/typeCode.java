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
 * A representation of the model object '<em><b>type Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.typeCode#getPrm <em>Prm</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.typeCode#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#gettypeCode()
 * @model
 * @generated
 */
public interface typeCode extends EObject
{
  /**
   * Returns the value of the '<em><b>Prm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prm</em>' containment reference.
   * @see #setPrm(PType)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#gettypeCode_Prm()
   * @model containment="true"
   * @generated
   */
  PType getPrm();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.typeCode#getPrm <em>Prm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prm</em>' containment reference.
   * @see #getPrm()
   * @generated
   */
  void setPrm(PType value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.gACL.element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.gACL.GACLPackage#gettypeCode_Elements()
   * @model containment="true"
   * @generated
   */
  EList<element> getElements();

} // typeCode
