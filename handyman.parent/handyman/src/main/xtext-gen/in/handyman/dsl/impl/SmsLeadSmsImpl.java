/**
 * generated by Xtext 2.16.0
 */
package in.handyman.dsl.impl;

import in.handyman.dsl.DslPackage;
import in.handyman.dsl.SmsLeadSms;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sms Lead Sms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link in.handyman.dsl.impl.SmsLeadSmsImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.SmsLeadSmsImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.SmsLeadSmsImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.SmsLeadSmsImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.SmsLeadSmsImpl#getDbSrc <em>Db Src</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.SmsLeadSmsImpl#getValue <em>Value</em>}</li>
 *   <li>{@link in.handyman.dsl.impl.SmsLeadSmsImpl#getDryrunNumber <em>Dryrun Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmsLeadSmsImpl extends ActionImpl implements SmsLeadSms
{
  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getSender() <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected static final String SENDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSender() <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected String sender = SENDER_EDEFAULT;

  /**
   * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected static final String ACCOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected String account = ACCOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateKey()
   * @generated
   * @ordered
   */
  protected static final String PRIVATE_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateKey()
   * @generated
   * @ordered
   */
  protected String privateKey = PRIVATE_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getDbSrc() <em>Db Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSrc()
   * @generated
   * @ordered
   */
  protected static final String DB_SRC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDbSrc() <em>Db Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbSrc()
   * @generated
   * @ordered
   */
  protected String dbSrc = DB_SRC_EDEFAULT;

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
   * The default value of the '{@link #getDryrunNumber() <em>Dryrun Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDryrunNumber()
   * @generated
   * @ordered
   */
  protected static final String DRYRUN_NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDryrunNumber() <em>Dryrun Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDryrunNumber()
   * @generated
   * @ordered
   */
  protected String dryrunNumber = DRYRUN_NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmsLeadSmsImpl()
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
    return DslPackage.Literals.SMS_LEAD_SMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SMS_LEAD_SMS__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSender()
  {
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSender(String newSender)
  {
    String oldSender = sender;
    sender = newSender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SMS_LEAD_SMS__SENDER, oldSender, sender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccount()
  {
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccount(String newAccount)
  {
    String oldAccount = account;
    account = newAccount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SMS_LEAD_SMS__ACCOUNT, oldAccount, account));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrivateKey()
  {
    return privateKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrivateKey(String newPrivateKey)
  {
    String oldPrivateKey = privateKey;
    privateKey = newPrivateKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SMS_LEAD_SMS__PRIVATE_KEY, oldPrivateKey, privateKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDbSrc()
  {
    return dbSrc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbSrc(String newDbSrc)
  {
    String oldDbSrc = dbSrc;
    dbSrc = newDbSrc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SMS_LEAD_SMS__DB_SRC, oldDbSrc, dbSrc));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SMS_LEAD_SMS__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDryrunNumber()
  {
    return dryrunNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDryrunNumber(String newDryrunNumber)
  {
    String oldDryrunNumber = dryrunNumber;
    dryrunNumber = newDryrunNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SMS_LEAD_SMS__DRYRUN_NUMBER, oldDryrunNumber, dryrunNumber));
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
      case DslPackage.SMS_LEAD_SMS__URL:
        return getUrl();
      case DslPackage.SMS_LEAD_SMS__SENDER:
        return getSender();
      case DslPackage.SMS_LEAD_SMS__ACCOUNT:
        return getAccount();
      case DslPackage.SMS_LEAD_SMS__PRIVATE_KEY:
        return getPrivateKey();
      case DslPackage.SMS_LEAD_SMS__DB_SRC:
        return getDbSrc();
      case DslPackage.SMS_LEAD_SMS__VALUE:
        return getValue();
      case DslPackage.SMS_LEAD_SMS__DRYRUN_NUMBER:
        return getDryrunNumber();
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
      case DslPackage.SMS_LEAD_SMS__URL:
        setUrl((String)newValue);
        return;
      case DslPackage.SMS_LEAD_SMS__SENDER:
        setSender((String)newValue);
        return;
      case DslPackage.SMS_LEAD_SMS__ACCOUNT:
        setAccount((String)newValue);
        return;
      case DslPackage.SMS_LEAD_SMS__PRIVATE_KEY:
        setPrivateKey((String)newValue);
        return;
      case DslPackage.SMS_LEAD_SMS__DB_SRC:
        setDbSrc((String)newValue);
        return;
      case DslPackage.SMS_LEAD_SMS__VALUE:
        setValue((String)newValue);
        return;
      case DslPackage.SMS_LEAD_SMS__DRYRUN_NUMBER:
        setDryrunNumber((String)newValue);
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
      case DslPackage.SMS_LEAD_SMS__URL:
        setUrl(URL_EDEFAULT);
        return;
      case DslPackage.SMS_LEAD_SMS__SENDER:
        setSender(SENDER_EDEFAULT);
        return;
      case DslPackage.SMS_LEAD_SMS__ACCOUNT:
        setAccount(ACCOUNT_EDEFAULT);
        return;
      case DslPackage.SMS_LEAD_SMS__PRIVATE_KEY:
        setPrivateKey(PRIVATE_KEY_EDEFAULT);
        return;
      case DslPackage.SMS_LEAD_SMS__DB_SRC:
        setDbSrc(DB_SRC_EDEFAULT);
        return;
      case DslPackage.SMS_LEAD_SMS__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DslPackage.SMS_LEAD_SMS__DRYRUN_NUMBER:
        setDryrunNumber(DRYRUN_NUMBER_EDEFAULT);
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
      case DslPackage.SMS_LEAD_SMS__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case DslPackage.SMS_LEAD_SMS__SENDER:
        return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
      case DslPackage.SMS_LEAD_SMS__ACCOUNT:
        return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
      case DslPackage.SMS_LEAD_SMS__PRIVATE_KEY:
        return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
      case DslPackage.SMS_LEAD_SMS__DB_SRC:
        return DB_SRC_EDEFAULT == null ? dbSrc != null : !DB_SRC_EDEFAULT.equals(dbSrc);
      case DslPackage.SMS_LEAD_SMS__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case DslPackage.SMS_LEAD_SMS__DRYRUN_NUMBER:
        return DRYRUN_NUMBER_EDEFAULT == null ? dryrunNumber != null : !DRYRUN_NUMBER_EDEFAULT.equals(dryrunNumber);
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
    result.append(" (url: ");
    result.append(url);
    result.append(", sender: ");
    result.append(sender);
    result.append(", account: ");
    result.append(account);
    result.append(", privateKey: ");
    result.append(privateKey);
    result.append(", dbSrc: ");
    result.append(dbSrc);
    result.append(", value: ");
    result.append(value);
    result.append(", dryrunNumber: ");
    result.append(dryrunNumber);
    result.append(')');
    return result.toString();
  }

} //SmsLeadSmsImpl