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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.PType;
import org.xtext.example.mydsl.gACL.TypeDecl;
import org.xtext.example.mydsl.gACL.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.VarDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.VarDeclImpl#getPt <em>Pt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.VarDeclImpl#getTd <em>Td</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarDeclImpl extends MinimalEObjectImpl.Container implements VarDecl
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPt() <em>Pt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPt()
   * @generated
   * @ordered
   */
  protected PType pt;

  /**
   * The cached value of the '{@link #getTd() <em>Td</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTd()
   * @generated
   * @ordered
   */
  protected TypeDecl td;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarDeclImpl()
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
    return GACLPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PType getPt()
  {
    return pt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPt(PType newPt, NotificationChain msgs)
  {
    PType oldPt = pt;
    pt = newPt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_DECL__PT, oldPt, newPt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPt(PType newPt)
  {
    if (newPt != pt)
    {
      NotificationChain msgs = null;
      if (pt != null)
        msgs = ((InternalEObject)pt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.VAR_DECL__PT, null, msgs);
      if (newPt != null)
        msgs = ((InternalEObject)newPt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.VAR_DECL__PT, null, msgs);
      msgs = basicSetPt(newPt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_DECL__PT, newPt, newPt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl getTd()
  {
    if (td != null && td.eIsProxy())
    {
      InternalEObject oldTd = (InternalEObject)td;
      td = (TypeDecl)eResolveProxy(oldTd);
      if (td != oldTd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GACLPackage.VAR_DECL__TD, oldTd, td));
      }
    }
    return td;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl basicGetTd()
  {
    return td;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTd(TypeDecl newTd)
  {
    TypeDecl oldTd = td;
    td = newTd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_DECL__TD, oldTd, td));
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
      case GACLPackage.VAR_DECL__PT:
        return basicSetPt(null, msgs);
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
      case GACLPackage.VAR_DECL__NAME:
        return getName();
      case GACLPackage.VAR_DECL__PT:
        return getPt();
      case GACLPackage.VAR_DECL__TD:
        if (resolve) return getTd();
        return basicGetTd();
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
      case GACLPackage.VAR_DECL__NAME:
        setName((String)newValue);
        return;
      case GACLPackage.VAR_DECL__PT:
        setPt((PType)newValue);
        return;
      case GACLPackage.VAR_DECL__TD:
        setTd((TypeDecl)newValue);
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
      case GACLPackage.VAR_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GACLPackage.VAR_DECL__PT:
        setPt((PType)null);
        return;
      case GACLPackage.VAR_DECL__TD:
        setTd((TypeDecl)null);
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
      case GACLPackage.VAR_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GACLPackage.VAR_DECL__PT:
        return pt != null;
      case GACLPackage.VAR_DECL__TD:
        return td != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VarDeclImpl
