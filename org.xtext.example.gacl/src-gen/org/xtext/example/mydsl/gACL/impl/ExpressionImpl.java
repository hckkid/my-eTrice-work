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

import org.xtext.example.mydsl.gACL.Expression;
import org.xtext.example.mydsl.gACL.GACLPackage;
import org.xtext.example.mydsl.gACL.IntExpression;
import org.xtext.example.mydsl.gACL.StringExpression;
import org.xtext.example.mydsl.gACL.VarExps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.ExpressionImpl#getStrexp <em>Strexp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.ExpressionImpl#getInexp <em>Inexp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.gACL.impl.ExpressionImpl#getVex <em>Vex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
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
   * The cached value of the '{@link #getVex() <em>Vex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVex()
   * @generated
   * @ordered
   */
  protected VarExps vex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return GACLPackage.Literals.EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.EXPRESSION__STREXP, oldStrexp, newStrexp);
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
        msgs = ((InternalEObject)strexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.EXPRESSION__STREXP, null, msgs);
      if (newStrexp != null)
        msgs = ((InternalEObject)newStrexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.EXPRESSION__STREXP, null, msgs);
      msgs = basicSetStrexp(newStrexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.EXPRESSION__STREXP, newStrexp, newStrexp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.EXPRESSION__INEXP, oldInexp, newInexp);
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
        msgs = ((InternalEObject)inexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.EXPRESSION__INEXP, null, msgs);
      if (newInexp != null)
        msgs = ((InternalEObject)newInexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.EXPRESSION__INEXP, null, msgs);
      msgs = basicSetInexp(newInexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.EXPRESSION__INEXP, newInexp, newInexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarExps getVex()
  {
    return vex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVex(VarExps newVex, NotificationChain msgs)
  {
    VarExps oldVex = vex;
    vex = newVex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GACLPackage.EXPRESSION__VEX, oldVex, newVex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVex(VarExps newVex)
  {
    if (newVex != vex)
    {
      NotificationChain msgs = null;
      if (vex != null)
        msgs = ((InternalEObject)vex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GACLPackage.EXPRESSION__VEX, null, msgs);
      if (newVex != null)
        msgs = ((InternalEObject)newVex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GACLPackage.EXPRESSION__VEX, null, msgs);
      msgs = basicSetVex(newVex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GACLPackage.EXPRESSION__VEX, newVex, newVex));
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
      case GACLPackage.EXPRESSION__STREXP:
        return basicSetStrexp(null, msgs);
      case GACLPackage.EXPRESSION__INEXP:
        return basicSetInexp(null, msgs);
      case GACLPackage.EXPRESSION__VEX:
        return basicSetVex(null, msgs);
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
      case GACLPackage.EXPRESSION__STREXP:
        return getStrexp();
      case GACLPackage.EXPRESSION__INEXP:
        return getInexp();
      case GACLPackage.EXPRESSION__VEX:
        return getVex();
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
      case GACLPackage.EXPRESSION__STREXP:
        setStrexp((StringExpression)newValue);
        return;
      case GACLPackage.EXPRESSION__INEXP:
        setInexp((IntExpression)newValue);
        return;
      case GACLPackage.EXPRESSION__VEX:
        setVex((VarExps)newValue);
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
      case GACLPackage.EXPRESSION__STREXP:
        setStrexp((StringExpression)null);
        return;
      case GACLPackage.EXPRESSION__INEXP:
        setInexp((IntExpression)null);
        return;
      case GACLPackage.EXPRESSION__VEX:
        setVex((VarExps)null);
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
      case GACLPackage.EXPRESSION__STREXP:
        return strexp != null;
      case GACLPackage.EXPRESSION__INEXP:
        return inexp != null;
      case GACLPackage.EXPRESSION__VEX:
        return vex != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
