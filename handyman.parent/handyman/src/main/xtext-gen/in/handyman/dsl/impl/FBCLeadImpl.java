/**
 * generated by Xtext 2.16.0
 */
package in.handyman.dsl.impl;

import in.handyman.dsl.DslPackage;
import in.handyman.dsl.FBCLead;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FBC Lead</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link in.handyman.dsl.impl.FBCLeadImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.FBCLeadImpl#getAppSecret <em>App Secret</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.FBCLeadImpl#getAccountId <em>Account Id</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.FBCLeadImpl#getCampaignId <em>Campaign Id</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.FBCLeadImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.FBCLeadImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FBCLeadImpl extends ActionImpl implements FBCLead
{
  /**
   * The default value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessToken()
   * @generated
   * @ordered
   */
  protected static final String ACCESS_TOKEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessToken()
   * @generated
   * @ordered
   */
  protected String accessToken = ACCESS_TOKEN_EDEFAULT;

  /**
   * The default value of the '{@link #getAppSecret() <em>App Secret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppSecret()
   * @generated
   * @ordered
   */
  protected static final String APP_SECRET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppSecret() <em>App Secret</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppSecret()
   * @generated
   * @ordered
   */
  protected String appSecret = APP_SECRET_EDEFAULT;

  /**
   * The default value of the '{@link #getAccountId() <em>Account Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccountId()
   * @generated
   * @ordered
   */
  protected static final String ACCOUNT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccountId() <em>Account Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccountId()
   * @generated
   * @ordered
   */
  protected String accountId = ACCOUNT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getCampaignId() <em>Campaign Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCampaignId()
   * @generated
   * @ordered
   */
  protected static final String CAMPAIGN_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCampaignId() <em>Campaign Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCampaignId()
   * @generated
   * @ordered
   */
  protected String campaignId = CAMPAIGN_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FBCLeadImpl()
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
    return DslPackage.Literals.FBC_LEAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccessToken()
  {
    return accessToken;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessToken(String newAccessToken)
  {
    String oldAccessToken = accessToken;
    accessToken = newAccessToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FBC_LEAD__ACCESS_TOKEN, oldAccessToken, accessToken));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAppSecret()
  {
    return appSecret;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppSecret(String newAppSecret)
  {
    String oldAppSecret = appSecret;
    appSecret = newAppSecret;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FBC_LEAD__APP_SECRET, oldAppSecret, appSecret));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccountId()
  {
    return accountId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccountId(String newAccountId)
  {
    String oldAccountId = accountId;
    accountId = newAccountId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FBC_LEAD__ACCOUNT_ID, oldAccountId, accountId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCampaignId()
  {
    return campaignId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCampaignId(String newCampaignId)
  {
    String oldCampaignId = campaignId;
    campaignId = newCampaignId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FBC_LEAD__CAMPAIGN_ID, oldCampaignId, campaignId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FBC_LEAD__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.FBC_LEAD__VALUE, oldValue, value));
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
      case DslPackage.FBC_LEAD__ACCESS_TOKEN:
        return getAccessToken();
      case DslPackage.FBC_LEAD__APP_SECRET:
        return getAppSecret();
      case DslPackage.FBC_LEAD__ACCOUNT_ID:
        return getAccountId();
      case DslPackage.FBC_LEAD__CAMPAIGN_ID:
        return getCampaignId();
      case DslPackage.FBC_LEAD__TARGET:
        return getTarget();
      case DslPackage.FBC_LEAD__VALUE:
        return getValue();
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
      case DslPackage.FBC_LEAD__ACCESS_TOKEN:
        setAccessToken((String)newValue);
        return;
      case DslPackage.FBC_LEAD__APP_SECRET:
        setAppSecret((String)newValue);
        return;
      case DslPackage.FBC_LEAD__ACCOUNT_ID:
        setAccountId((String)newValue);
        return;
      case DslPackage.FBC_LEAD__CAMPAIGN_ID:
        setCampaignId((String)newValue);
        return;
      case DslPackage.FBC_LEAD__TARGET:
        setTarget((String)newValue);
        return;
      case DslPackage.FBC_LEAD__VALUE:
        setValue((String)newValue);
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
      case DslPackage.FBC_LEAD__ACCESS_TOKEN:
        setAccessToken(ACCESS_TOKEN_EDEFAULT);
        return;
      case DslPackage.FBC_LEAD__APP_SECRET:
        setAppSecret(APP_SECRET_EDEFAULT);
        return;
      case DslPackage.FBC_LEAD__ACCOUNT_ID:
        setAccountId(ACCOUNT_ID_EDEFAULT);
        return;
      case DslPackage.FBC_LEAD__CAMPAIGN_ID:
        setCampaignId(CAMPAIGN_ID_EDEFAULT);
        return;
      case DslPackage.FBC_LEAD__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case DslPackage.FBC_LEAD__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case DslPackage.FBC_LEAD__ACCESS_TOKEN:
        return ACCESS_TOKEN_EDEFAULT == null ? accessToken != null : !ACCESS_TOKEN_EDEFAULT.equals(accessToken);
      case DslPackage.FBC_LEAD__APP_SECRET:
        return APP_SECRET_EDEFAULT == null ? appSecret != null : !APP_SECRET_EDEFAULT.equals(appSecret);
      case DslPackage.FBC_LEAD__ACCOUNT_ID:
        return ACCOUNT_ID_EDEFAULT == null ? accountId != null : !ACCOUNT_ID_EDEFAULT.equals(accountId);
      case DslPackage.FBC_LEAD__CAMPAIGN_ID:
        return CAMPAIGN_ID_EDEFAULT == null ? campaignId != null : !CAMPAIGN_ID_EDEFAULT.equals(campaignId);
      case DslPackage.FBC_LEAD__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
      case DslPackage.FBC_LEAD__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (accessToken: ");
    result.append(accessToken);
    result.append(", appSecret: ");
    result.append(appSecret);
    result.append(", accountId: ");
    result.append(accountId);
    result.append(", campaignId: ");
    result.append(campaignId);
    result.append(", target: ");
    result.append(target);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //FBCLeadImpl
