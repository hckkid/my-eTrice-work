/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.TypeDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.TypeDecl#getTp <em>Tp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getTypeDecl()
 * @model
 * @generated
 */
public interface TypeDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getTypeDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.TypeDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp</em>' containment reference.
   * @see #setTp(PType)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getTypeDecl_Tp()
   * @model containment="true"
   * @generated
   */
  PType getTp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.TypeDecl#getTp <em>Tp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp</em>' containment reference.
   * @see #getTp()
   * @generated
   */
  void setTp(PType value);

} // TypeDecl
