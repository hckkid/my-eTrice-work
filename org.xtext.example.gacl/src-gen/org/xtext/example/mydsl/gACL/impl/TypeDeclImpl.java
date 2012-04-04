/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.TypeDecl;
import org.xtext.example.mydsl.gACL.typeCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.TypeDeclImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.TypeDeclImpl#getTpcode <em>Tpcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeclImpl extends StatementImpl implements TypeDecl
{
  /**
   * The default value of the '{@link #getTypename() <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected static final String TYPENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypename() <em>Typename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypename()
   * @generated
   * @ordered
   */
  protected String typename = TYPENAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTpcode() <em>Tpcode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTpcode()
   * @generated
   * @ordered
   */
  protected typeCode tpcode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDeclImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GACLPackage.Literals.TYPE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypename()
  {
    return typename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypename(String newTypename)
  {
    String oldTypename = typename;
    typename = newTypename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.TYPE_DECL__TYPENAME, oldTypename, typename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeCode getTpcode()
  {
    return tpcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTpcode(typeCode newTpcode, NotificationChain msgs)
  {
    typeCode oldTpcode = tpcode;
    tpcode = newTpcode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.TYPE_DECL__TPCODE, oldTpcode, newTpcode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTpcode(typeCode newTpcode)
  {
    if (newTpcode != tpcode)
    {
      NotificationChain msgs = null;
      if (tpcode != null)
        msgs = ((InternalEObject)tpcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.TYPE_DECL__TPCODE, null, msgs);
      if (newTpcode != null)
        msgs = ((InternalEObject)newTpcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.TYPE_DECL__TPCODE, null, msgs);
      msgs = basicSetTpcode(newTpcode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.TYPE_DECL__TPCODE, newTpcode, newTpcode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GACLPackage.TYPE_DECL__TPCODE:
        return basicSetTpcode(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GACLPackage.TYPE_DECL__TYPENAME:
        return getTypename();
      case GACLPackage.TYPE_DECL__TPCODE:
        return getTpcode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GACLPackage.TYPE_DECL__TYPENAME:
        setTypename((String)newValue);
        return;
      case GACLPackage.TYPE_DECL__TPCODE:
        setTpcode((typeCode)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GACLPackage.TYPE_DECL__TYPENAME:
        setTypename(TYPENAME_EDEFAULT);
        return;
      case GACLPackage.TYPE_DECL__TPCODE:
        setTpcode((typeCode)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GACLPackage.TYPE_DECL__TYPENAME:
        return TYPENAME_EDEFAULT == null ? typename != null : !TYPENAME_EDEFAULT.equals(typename);
      case GACLPackage.TYPE_DECL__TPCODE:
        return tpcode != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (typename: ");
    result.append(typename);
    result.append(')');
    return result.toString();
  }

} //TypeDeclImpl
