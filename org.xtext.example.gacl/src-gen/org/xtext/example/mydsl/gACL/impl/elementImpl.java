/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl.gACL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.PType;
import org.xtext.example.mydsl.gACL.element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.elementImpl#getElemname <em>Elemname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.elementImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.elementImpl#getPrmtype <em>Prmtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.elementImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elementImpl extends MinimalEObjectImpl.Container implements element
{
  /**
   * The default value of the '{@link #getElemname() <em>Elemname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemname()
   * @generated
   * @ordered
   */
  protected static final String ELEMNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElemname() <em>Elemname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemname()
   * @generated
   * @ordered
   */
  protected String elemname = ELEMNAME_EDEFAULT;

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
   * The cached value of the '{@link #getPrmtype() <em>Prmtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrmtype()
   * @generated
   * @ordered
   */
  protected PType prmtype;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<String> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected elementImpl()
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
    return GACLPackage.Literals.ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElemname()
  {
    return elemname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElemname(String newElemname)
  {
    String oldElemname = elemname;
    elemname = newElemname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.ELEMENT__ELEMNAME, oldElemname, elemname));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.ELEMENT__TYPENAME, oldTypename, typename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PType getPrmtype()
  {
    return prmtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrmtype(PType newPrmtype, NotificationChain msgs)
  {
    PType oldPrmtype = prmtype;
    prmtype = newPrmtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.ELEMENT__PRMTYPE, oldPrmtype, newPrmtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrmtype(PType newPrmtype)
  {
    if (newPrmtype != prmtype)
    {
      NotificationChain msgs = null;
      if (prmtype != null)
        msgs = ((InternalEObject)prmtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.ELEMENT__PRMTYPE, null, msgs);
      if (newPrmtype != null)
        msgs = ((InternalEObject)newPrmtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.ELEMENT__PRMTYPE, null, msgs);
      msgs = basicSetPrmtype(newPrmtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.ELEMENT__PRMTYPE, newPrmtype, newPrmtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getArgs()
  {
    if (args == null)
    {
      args = new EDataTypeEList<String>(String.class, this, GACLPackage.ELEMENT__ARGS);
    }
    return args;
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
      case GACLPackage.ELEMENT__PRMTYPE:
        return basicSetPrmtype(null, msgs);
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
      case GACLPackage.ELEMENT__ELEMNAME:
        return getElemname();
      case GACLPackage.ELEMENT__TYPENAME:
        return getTypename();
      case GACLPackage.ELEMENT__PRMTYPE:
        return getPrmtype();
      case GACLPackage.ELEMENT__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GACLPackage.ELEMENT__ELEMNAME:
        setElemname((String)newValue);
        return;
      case GACLPackage.ELEMENT__TYPENAME:
        setTypename((String)newValue);
        return;
      case GACLPackage.ELEMENT__PRMTYPE:
        setPrmtype((PType)newValue);
        return;
      case GACLPackage.ELEMENT__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends String>)newValue);
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
      case GACLPackage.ELEMENT__ELEMNAME:
        setElemname(ELEMNAME_EDEFAULT);
        return;
      case GACLPackage.ELEMENT__TYPENAME:
        setTypename(TYPENAME_EDEFAULT);
        return;
      case GACLPackage.ELEMENT__PRMTYPE:
        setPrmtype((PType)null);
        return;
      case GACLPackage.ELEMENT__ARGS:
        getArgs().clear();
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
      case GACLPackage.ELEMENT__ELEMNAME:
        return ELEMNAME_EDEFAULT == null ? elemname != null : !ELEMNAME_EDEFAULT.equals(elemname);
      case GACLPackage.ELEMENT__TYPENAME:
        return TYPENAME_EDEFAULT == null ? typename != null : !TYPENAME_EDEFAULT.equals(typename);
      case GACLPackage.ELEMENT__PRMTYPE:
        return prmtype != null;
      case GACLPackage.ELEMENT__ARGS:
        return args != null && !args.isEmpty();
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
    result.append(" (elemname: ");
    result.append(elemname);
    result.append(", typename: ");
    result.append(typename);
    result.append(", args: ");
    result.append(args);
    result.append(')');
    return result.toString();
  }

} //elementImpl
