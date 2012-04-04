/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.TypeDecl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.TypeDecl#getTpcode <em>Tpcode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.gACL.GACLPackage#getTypeDecl()
 * @model
 * @generated
 */
public interface TypeDecl extends Statement
{
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
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getTypeDecl_Typename()
   * @model
   * @generated
   */
  String getTypename();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.TypeDecl#getTypename <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typename</em>' attribute.
   * @see #getTypename()
   * @generated
   */
  void setTypename(String value);

  /**
   * Returns the value of the '<em><b>Tpcode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tpcode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tpcode</em>' containment reference.
   * @see #setTpcode(typeCode)
   * @see org.xtext.example.mydsl.gACL.GACLPackage#getTypeDecl_Tpcode()
   * @model containment="true"
   * @generated
   */
  typeCode getTpcode();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.gACL.TypeDecl#getTpcode <em>Tpcode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tpcode</em>' containment reference.
   * @see #getTpcode()
   * @generated
   */
  void setTpcode(typeCode value);

} // TypeDecl
