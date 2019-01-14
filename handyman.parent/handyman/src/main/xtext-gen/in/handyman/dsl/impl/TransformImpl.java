/**
 * generated by Xtext 2.16.0
 */
package in.handyman.dsl.impl;

import in.handyman.dsl.DslPackage;
import in.handyman.dsl.Transform;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link in.handyman.dsl.impl.TransformImpl#getOn <em>On</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.TransformImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformImpl extends ActionImpl implements Transform
{
  /**
   * The default value of the '{@link #getOn() <em>On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOn()
   * @generated
   * @ordered
   */
  protected static final String ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOn() <em>On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOn()
   * @generated
   * @ordered
   */
  protected String on = ON_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<String> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransformImpl()
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
    return DslPackage.Literals.TRANSFORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOn()
  {
    return on;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOn(String newOn)
  {
    String oldOn = on;
    on = newOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.TRANSFORM__ON, oldOn, on));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValue()
  {
    if (value == null)
    {
      value = new EDataTypeEList<String>(String.class, this, DslPackage.TRANSFORM__VALUE);
    }
    return value;
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
      case DslPackage.TRANSFORM__ON:
        return getOn();
      case DslPackage.TRANSFORM__VALUE:
        return getValue();
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
      case DslPackage.TRANSFORM__ON:
        setOn((String)newValue);
        return;
      case DslPackage.TRANSFORM__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends String>)newValue);
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
      case DslPackage.TRANSFORM__ON:
        setOn(ON_EDEFAULT);
        return;
      case DslPackage.TRANSFORM__VALUE:
        getValue().clear();
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
      case DslPackage.TRANSFORM__ON:
        return ON_EDEFAULT == null ? on != null : !ON_EDEFAULT.equals(on);
      case DslPackage.TRANSFORM__VALUE:
        return value != null && !value.isEmpty();
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
    result.append(" (on: ");
    result.append(on);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //TransformImpl
