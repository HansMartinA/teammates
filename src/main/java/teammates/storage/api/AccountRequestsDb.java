package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import teammates.common.datatransfer.attributes.AccountRequestAttributes;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.exception.SearchServiceException;
import teammates.storage.entity.AccountRequest;
import teammates.storage.search.AccountRequestSearchManager;
import teammates.storage.search.SearchManagerFactory;
public final class AccountRequestsDb extends EntitiesDb<AccountRequest, AccountRequestAttributes> {
private static final AccountRequestsDb instance = new  AccountRequestsDb();

private  AccountRequestsDb(){
}
public static  AccountRequestsDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_dAP_kLvVEeyr6avTgCRLkQ", AccountRequestsDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dASb0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026931007733849051598682 = instance;
threadMonitoringController.exitInternalAction("_dASb0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013026931007733849051598682;
}
finally {
threadMonitoringController.exitService("_dAP_kLvVEeyr6avTgCRLkQ");
}
}

private  AccountRequestSearchManager getSearchManager() {
return SearchManagerFactory.getAccountRequestSearchManager();
}

public  void putDocument(AccountRequestAttributes accountRequest)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequest", accountRequest);
threadMonitoringController.enterService("_dB17ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dB8BpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dB8BpbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().putDocument(accountRequest);
threadMonitoringController.exitInternalAction("_dB8BpbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dB8BpLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dB17ALvVEeyr6avTgCRLkQ");
}
}

public  List<AccountRequestAttributes> searchAccountRequestsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_dCBhMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dCD9cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (queryString.trim().isEmpty())
{
List<AccountRequestAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027163003536166095369768 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_dCD9cLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027163003536166095369768;
}
threadMonitoringController.enterInternalAction("_dCGZtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<AccountRequestAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027163009094429354482864 = getSearchManager().searchAccountRequests(queryString);
threadMonitoringController.exitInternalAction("_dCGZtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dCGZtbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<AccountRequestAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027163009222813177645426 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027163009094429354482864;
threadMonitoringController.exitInternalAction("_dCGZtbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027163009222813177645426;
}
finally {
threadMonitoringController.exitService("_dCBhMLvVEeyr6avTgCRLkQ");
}
}

public  AccountRequestAttributes getAccountRequest(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_dBXZ4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dBZPELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert institute != null;
threadMonitoringController.exitInternalAction("_dBZPELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dBeupLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027066004934196451124382 = makeAttributesOrNull(getAccountRequestEntity(AccountRequest.generateId(email, institute)));
threadMonitoringController.exitInternalAction("_dBeupLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dBfVsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027066003319854458329218 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027066004934196451124382;
threadMonitoringController.exitInternalAction("_dBfVsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dBf8xLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027066007774980634774524 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027066003319854458329218;
threadMonitoringController.exitInternalAction("_dBf8xLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027066007774980634774524;
}
finally {
threadMonitoringController.exitService("_dBXZ4LvVEeyr6avTgCRLkQ");
}
}

public  AccountRequestAttributes updateAccountRequest(AccountRequestAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_dAda8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dAiTcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_dApBJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes accountRequest = getAccountRequest(updateOptions.getEmail(), updateOptions.getInstitute());
threadMonitoringController.exitInternalAction("_dApBJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dAiTcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dApoMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (accountRequest == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_dApoMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dApoMbvVEeyr6avTgCRLkQ");
accountRequest.update(updateOptions);
threadMonitoringController.setExternalCallId("_dAqPQLvVEeyr6avTgCRLkQ");
accountRequest.sanitizeForSaving();
if (!accountRequest.isValid())
{
threadMonitoringController.enterBranch("_dArdYLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dArdZLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(accountRequest.getInvalidityInfo());
}
threadMonitoringController.setExternalCallId("_dAtSkLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dAtSkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(accountRequest.toEntity());
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130270010026737322729998636 = accountRequest;
threadMonitoringController.exitInternalAction("_dAtSkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130270010026737322729998636;
}
finally {
threadMonitoringController.exitService("_dAda8LvVEeyr6avTgCRLkQ");
}
}

public  AccountRequestAttributes getAccountRequestForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_dBlcULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dBnRgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
List<AccountRequest> accountRequestList = load().filter("registrationKey =", registrationKey).list();
if (accountRequestList.size() > 1)
{
threadMonitoringController.enterBranch("_dBsxELvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dBtYILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dBtYIbvVEeyr6avTgCRLkQ");
log.severe("Duplicate registration keys detected for: " + accountRequestList.stream().map(i -> i.getId()).collect(Collectors.joining(", ")));
threadMonitoringController.exitInternalAction("_dBtYILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (accountRequestList.isEmpty())
{
return null;
}
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027114009926496746594463 = makeAttributes(accountRequestList.get(0));
threadMonitoringController.exitInternalAction("_dBnRgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dBv0YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027114008428491334432986 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027114009926496746594463;
threadMonitoringController.exitInternalAction("_dBv0YLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dBwbdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130271140030200974809469017 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027114008428491334432986;
threadMonitoringController.exitInternalAction("_dBwbdbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130271140030200974809469017;
}
finally {
threadMonitoringController.exitService("_dBlcULvVEeyr6avTgCRLkQ");
}
}

private  AccountRequest getAccountRequestEntity(String id) {
return load().id(id).now();
}

public  void deleteAccountRequest(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_dBGUILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dBIwYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert institute != null;
threadMonitoringController.enterInternalAction("_dBO3ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteDocumentByAccountRequestId(AccountRequest.generateId(email, institute));
threadMonitoringController.exitInternalAction("_dBO3ALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dBIwYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dBRTQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteEntity(Key.create(AccountRequest.class, AccountRequest.generateId(email, institute)));
threadMonitoringController.exitInternalAction("_dBRTQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dBGUILvVEeyr6avTgCRLkQ");
}
}

public  void deleteDocumentByAccountRequestId(String accountRequestUniqueId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequestUniqueId", accountRequestUniqueId);
threadMonitoringController.enterService("_ecyPALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ec5jxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ec5jxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(Collections.singletonList(accountRequestUniqueId));
threadMonitoringController.exitInternalAction("_ec5jxbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_ec5jxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ecyPALvVEeyr6avTgCRLkQ");
}
}

@Override
 LoadType<AccountRequest> load() {
return ofy().load().type(AccountRequest.class);
}

@Override
 boolean hasExistingEntities(AccountRequestAttributes entityToCreate) {
Key<AccountRequest> keyToFind = Key.create(AccountRequest.class, AccountRequest.generateId(entityToCreate.getEmail(), entityToCreate.getInstitute()));
return !load().filterKey(keyToFind).keys().list().isEmpty();
}

@Override
 AccountRequestAttributes makeAttributes(AccountRequest entity) {
assert entity != null;
return AccountRequestAttributes.valueOf(entity);
}

}
