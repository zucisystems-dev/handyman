/**
 * generated by Xtext 2.16.0
 */
package in.handyman.dsl.util;

import in.handyman.dsl.Abort;
import in.handyman.dsl.Action;
import in.handyman.dsl.Callprocess;
import in.handyman.dsl.Catch;
import in.handyman.dsl.ClickSendSms;
import in.handyman.dsl.Copydata;
import in.handyman.dsl.Doozle;
import in.handyman.dsl.Dropfile;
import in.handyman.dsl.DslPackage;
import in.handyman.dsl.ElasticFBCLead;
import in.handyman.dsl.ElasticGET;
import in.handyman.dsl.ExecJava;
import in.handyman.dsl.Expression;
import in.handyman.dsl.FBCLead;
import in.handyman.dsl.FBFormDownload;
import in.handyman.dsl.Fetch;
import in.handyman.dsl.Finally;
import in.handyman.dsl.FirebaseDatabasePut;
import in.handyman.dsl.FirebaseReactiveNotification;
import in.handyman.dsl.GooglecalPUT;
import in.handyman.dsl.GooglecontactPUT;
import in.handyman.dsl.GooglecontactSelectAll;
import in.handyman.dsl.LoadCsv;
import in.handyman.dsl.Rest;
import in.handyman.dsl.RestPart;
import in.handyman.dsl.SendMail;
import in.handyman.dsl.SlackPUT;
import in.handyman.dsl.SmsLeadSms;
import in.handyman.dsl.Transform;
import in.handyman.dsl.TrelloGET;
import in.handyman.dsl.TrelloPUT;
import in.handyman.dsl.Try;
import in.handyman.dsl.Updatedaudit;
import in.handyman.dsl.WriteCsv;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see in.handyman.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DslPackage.PROCESS:
      {
        in.handyman.dsl.Process process = (in.handyman.dsl.Process)theEObject;
        T result = caseProcess(process);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRY:
      {
        Try try_ = (Try)theEObject;
        T result = caseTry(try_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FINALLY:
      {
        Finally finally_ = (Finally)theEObject;
        T result = caseFinally(finally_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CATCH:
      {
        Catch catch_ = (Catch)theEObject;
        T result = caseCatch(catch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ELASTIC_FBC_LEAD:
      {
        ElasticFBCLead elasticFBCLead = (ElasticFBCLead)theEObject;
        T result = caseElasticFBCLead(elasticFBCLead);
        if (result == null) result = caseAction(elasticFBCLead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ELASTIC_GET:
      {
        ElasticGET elasticGET = (ElasticGET)theEObject;
        T result = caseElasticGET(elasticGET);
        if (result == null) result = caseAction(elasticGET);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.EXEC_JAVA:
      {
        ExecJava execJava = (ExecJava)theEObject;
        T result = caseExecJava(execJava);
        if (result == null) result = caseAction(execJava);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FIREBASE_DATABASE_PUT:
      {
        FirebaseDatabasePut firebaseDatabasePut = (FirebaseDatabasePut)theEObject;
        T result = caseFirebaseDatabasePut(firebaseDatabasePut);
        if (result == null) result = caseAction(firebaseDatabasePut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FIREBASE_REACTIVE_NOTIFICATION:
      {
        FirebaseReactiveNotification firebaseReactiveNotification = (FirebaseReactiveNotification)theEObject;
        T result = caseFirebaseReactiveNotification(firebaseReactiveNotification);
        if (result == null) result = caseAction(firebaseReactiveNotification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SMS_LEAD_SMS:
      {
        SmsLeadSms smsLeadSms = (SmsLeadSms)theEObject;
        T result = caseSmsLeadSms(smsLeadSms);
        if (result == null) result = caseAction(smsLeadSms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ABORT:
      {
        Abort abort = (Abort)theEObject;
        T result = caseAbort(abort);
        if (result == null) result = caseAction(abort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.GOOGLECONTACT_SELECT_ALL:
      {
        GooglecontactSelectAll googlecontactSelectAll = (GooglecontactSelectAll)theEObject;
        T result = caseGooglecontactSelectAll(googlecontactSelectAll);
        if (result == null) result = caseAction(googlecontactSelectAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SEND_MAIL:
      {
        SendMail sendMail = (SendMail)theEObject;
        T result = caseSendMail(sendMail);
        if (result == null) result = caseAction(sendMail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.GOOGLECONTACT_PUT:
      {
        GooglecontactPUT googlecontactPUT = (GooglecontactPUT)theEObject;
        T result = caseGooglecontactPUT(googlecontactPUT);
        if (result == null) result = caseAction(googlecontactPUT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.GOOGLECAL_PUT:
      {
        GooglecalPUT googlecalPUT = (GooglecalPUT)theEObject;
        T result = caseGooglecalPUT(googlecalPUT);
        if (result == null) result = caseAction(googlecalPUT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FBC_LEAD:
      {
        FBCLead fbcLead = (FBCLead)theEObject;
        T result = caseFBCLead(fbcLead);
        if (result == null) result = caseAction(fbcLead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FB_FORM_DOWNLOAD:
      {
        FBFormDownload fbFormDownload = (FBFormDownload)theEObject;
        T result = caseFBFormDownload(fbFormDownload);
        if (result == null) result = caseAction(fbFormDownload);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DROPFILE:
      {
        Dropfile dropfile = (Dropfile)theEObject;
        T result = caseDropfile(dropfile);
        if (result == null) result = caseAction(dropfile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.DOOZLE:
      {
        Doozle doozle = (Doozle)theEObject;
        T result = caseDoozle(doozle);
        if (result == null) result = caseAction(doozle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.REST:
      {
        Rest rest = (Rest)theEObject;
        T result = caseRest(rest);
        if (result == null) result = caseAction(rest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.REST_PART:
      {
        RestPart restPart = (RestPart)theEObject;
        T result = caseRestPart(restPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRELLO_GET:
      {
        TrelloGET trelloGET = (TrelloGET)theEObject;
        T result = caseTrelloGET(trelloGET);
        if (result == null) result = caseAction(trelloGET);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRELLO_PUT:
      {
        TrelloPUT trelloPUT = (TrelloPUT)theEObject;
        T result = caseTrelloPUT(trelloPUT);
        if (result == null) result = caseAction(trelloPUT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FETCH:
      {
        Fetch fetch = (Fetch)theEObject;
        T result = caseFetch(fetch);
        if (result == null) result = caseAction(fetch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CALLPROCESS:
      {
        Callprocess callprocess = (Callprocess)theEObject;
        T result = caseCallprocess(callprocess);
        if (result == null) result = caseAction(callprocess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.UPDATEDAUDIT:
      {
        Updatedaudit updatedaudit = (Updatedaudit)theEObject;
        T result = caseUpdatedaudit(updatedaudit);
        if (result == null) result = caseAction(updatedaudit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CLICK_SEND_SMS:
      {
        ClickSendSms clickSendSms = (ClickSendSms)theEObject;
        T result = caseClickSendSms(clickSendSms);
        if (result == null) result = caseAction(clickSendSms);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.SLACK_PUT:
      {
        SlackPUT slackPUT = (SlackPUT)theEObject;
        T result = caseSlackPUT(slackPUT);
        if (result == null) result = caseAction(slackPUT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.COPYDATA:
      {
        Copydata copydata = (Copydata)theEObject;
        T result = caseCopydata(copydata);
        if (result == null) result = caseAction(copydata);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.WRITE_CSV:
      {
        WriteCsv writeCsv = (WriteCsv)theEObject;
        T result = caseWriteCsv(writeCsv);
        if (result == null) result = caseAction(writeCsv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LOAD_CSV:
      {
        LoadCsv loadCsv = (LoadCsv)theEObject;
        T result = caseLoadCsv(loadCsv);
        if (result == null) result = caseAction(loadCsv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TRANSFORM:
      {
        Transform transform = (Transform)theEObject;
        T result = caseTransform(transform);
        if (result == null) result = caseAction(transform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcess(in.handyman.dsl.Process object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Try</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Try</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTry(Try object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Finally</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Finally</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinally(Finally object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Catch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Catch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCatch(Catch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elastic FBC Lead</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elastic FBC Lead</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElasticFBCLead(ElasticFBCLead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elastic GET</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elastic GET</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElasticGET(ElasticGET object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exec Java</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exec Java</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecJava(ExecJava object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Firebase Database Put</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Firebase Database Put</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFirebaseDatabasePut(FirebaseDatabasePut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Firebase Reactive Notification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Firebase Reactive Notification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFirebaseReactiveNotification(FirebaseReactiveNotification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sms Lead Sms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sms Lead Sms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmsLeadSms(SmsLeadSms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbort(Abort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Googlecontact Select All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Googlecontact Select All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGooglecontactSelectAll(GooglecontactSelectAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Send Mail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Send Mail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSendMail(SendMail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Googlecontact PUT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Googlecontact PUT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGooglecontactPUT(GooglecontactPUT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Googlecal PUT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Googlecal PUT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGooglecalPUT(GooglecalPUT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FBC Lead</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FBC Lead</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFBCLead(FBCLead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FB Form Download</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FB Form Download</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFBFormDownload(FBFormDownload object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dropfile</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dropfile</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropfile(Dropfile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Doozle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Doozle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoozle(Doozle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rest</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rest</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRest(Rest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rest Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rest Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestPart(RestPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trello GET</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trello GET</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrelloGET(TrelloGET object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trello PUT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trello PUT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrelloPUT(TrelloPUT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fetch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fetch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFetch(Fetch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callprocess</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callprocess</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallprocess(Callprocess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Updatedaudit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Updatedaudit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdatedaudit(Updatedaudit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click Send Sms</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click Send Sms</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClickSendSms(ClickSendSms object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slack PUT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slack PUT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlackPUT(SlackPUT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Copydata</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Copydata</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCopydata(Copydata object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Write Csv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Write Csv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWriteCsv(WriteCsv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load Csv</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Csv</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadCsv(LoadCsv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransform(Transform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DslSwitch
