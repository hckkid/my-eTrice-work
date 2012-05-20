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
import org.xtext.example.mydsl.gACL.IntExpression;
import org.xtext.example.mydsl.gACL.StringExpression;
import org.xtext.example.mydsl.gACL.VarDecl;
import org.xtext.example.mydsl.gACL.VarInst;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.VarInstImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.VarInstImpl#getStrexp <em>Strexp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.VarInstImpl#getInexp <em>Inexp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarInstImpl extends MinimalEObjectImpl.Container implements VarInst
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected VarDecl name;

  /**
   * The cached value of the '{@link #getStrexp() <em>Strexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrexp()
   * @generated
   * @ordered
   */
  protected StringExpression strexp;

  /**
   * The cached value of the '{@link #getInexp() <em>Inexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInexp()
   * @generated
   * @ordered
   */
  protected IntExpression inexp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarInstImpl()
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
    return GACLPackage.Literals.VAR_INST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (VarDecl)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GACLPackage.VAR_INST__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(VarDecl newName)
  {
    VarDecl oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_INST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression getStrexp()
  {
    return strexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrexp(StringExpression newStrexp, NotificationChain msgs)
  {
    StringExpression oldStrexp = strexp;
    strexp = newStrexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_INST__STREXP, oldStrexp, newStrexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrexp(StringExpression newStrexp)
  {
    if (newStrexp != strexp)
    {
      NotificationChain msgs = null;
      if (strexp != null)
        msgs = ((InternalEObject)strexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.VAR_INST__STREXP, null, msgs);
      if (newStrexp != null)
        msgs = ((InternalEObject)newStrexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.VAR_INST__STREXP, null, msgs);
      msgs = basicSetStrexp(newStrexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_INST__STREXP, newStrexp, newStrexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExpression getInexp()
  {
    return inexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInexp(IntExpression newInexp, NotificationChain msgs)
  {
    IntExpression oldInexp = inexp;
    inexp = newInexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_INST__INEXP, oldInexp, newInexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInexp(IntExpression newInexp)
  {
    if (newInexp != inexp)
    {
      NotificationChain msgs = null;
      if (inexp != null)
        msgs = ((InternalEObject)inexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.VAR_INST__INEXP, null, msgs);
      if (newInexp != null)
        msgs = ((InternalEObject)newInexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.VAR_INST__INEXP, null, msgs);
      msgs = basicSetInexp(newInexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.VAR_INST__INEXP, newInexp, newInexp));
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
      case GACLPackage.VAR_INST__STREXP:
        return basicSetStrexp(null, msgs);
      case GACLPackage.VAR_INST__INEXP:
        return basicSetInexp(null, msgs);
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
      case GACLPackage.VAR_INST__NAME:
        if (resolve) return getName();
        return basicGetName();
      case GACLPackage.VAR_INST__STREXP:
        return getStrexp();
      case GACLPackage.VAR_INST__INEXP:
        return getInexp();
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
      case GACLPackage.VAR_INST__NAME:
        setName((VarDecl)newValue);
        return;
      case GACLPackage.VAR_INST__STREXP:
        setStrexp((StringExpression)newValue);
        return;
      case GACLPackage.VAR_INST__INEXP:
        setInexp((IntExpression)newValue);
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
      case GACLPackage.VAR_INST__NAME:
        setName((VarDecl)null);
        return;
      case GACLPackage.VAR_INST__STREXP:
        setStrexp((StringExpression)null);
        return;
      case GACLPackage.VAR_INST__INEXP:
        setInexp((IntExpression)null);
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
      case GACLPackage.VAR_INST__NAME:
        return name != null;
      case GACLPackage.VAR_INST__STREXP:
        return strexp != null;
      case GACLPackage.VAR_INST__INEXP:
        return inexp != null;
    }
    return super.eIsSet(featureID);
  }

} //VarInstImpl
