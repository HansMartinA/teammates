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
threadMonitoringController.enterService("_ubCJELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ubElULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682765001325798789922138 = instance;
threadMonitoringController.exitInternalAction("_ubElULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682765001325798789922138;
}
finally {
threadMonitoringController.exitService("_ubCJELngEeyIw-dB1KCaVA");
}
}

private  AccountRequestSearchManager getSearchManager() {
return SearchManagerFactory.getAccountRequestSearchManager();
}

public  void putDocument(AccountRequestAttributes accountRequest)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequest", accountRequest);
threadMonitoringController.enterService("_uchW0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ucm2ZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ucm2ZbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().putDocument(accountRequest);
threadMonitoringController.exitInternalAction("_ucm2ZbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_ucm2ZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_uchW0LngEeyIw-dB1KCaVA");
}
}

public  List<AccountRequestAttributes> searchAccountRequestsInWholeSystem(String queryString)throws SearchServiceException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("queryString", queryString);
threadMonitoringController.enterService("_ucru4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ucuLILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (queryString.trim().isEmpty())
{
List<AccountRequestAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682811002894902197274267 = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_ucuLILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682811002894902197274267;
}
threadMonitoringController.enterInternalAction("_ucxOdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<AccountRequestAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682812005156809234281012 = getSearchManager().searchAccountRequests(queryString);
threadMonitoringController.exitInternalAction("_ucxOdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ucxOdbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<AccountRequestAttributes> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682812008765439767185295 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682812005156809234281012;
threadMonitoringController.exitInternalAction("_ucxOdbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682812008765439767185295;
}
finally {
threadMonitoringController.exitService("_ucru4LngEeyIw-dB1KCaVA");
}
}

public  AccountRequestAttributes getAccountRequest(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_ucBAgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ucC1sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert institute != null;
threadMonitoringController.exitInternalAction("_ucC1sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ucIVRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682790008346154443781258 = makeAttributesOrNull(getAccountRequestEntity(AccountRequest.generateId(email, institute)));
threadMonitoringController.exitInternalAction("_ucIVRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ucIVRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682790002032511759172425 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682790008346154443781258;
threadMonitoringController.exitInternalAction("_ucIVRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ucJjZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682790009017486836347359 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682790002032511759172425;
threadMonitoringController.exitInternalAction("_ucJjZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682790009017486836347359;
}
finally {
threadMonitoringController.exitService("_ucBAgLngEeyIw-dB1KCaVA");
}
}

public  AccountRequestAttributes updateAccountRequest(AccountRequestAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_ubL6ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ubNvQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_ubVEArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes accountRequest = getAccountRequest(updateOptions.getEmail(), updateOptions.getInstitute());
threadMonitoringController.exitInternalAction("_ubVEArngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_ubNvQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ubVEA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (accountRequest == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_ubVEA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_ubVEBLngEeyIw-dB1KCaVA");
accountRequest.update(updateOptions);
threadMonitoringController.setExternalCallId("_ubVrELngEeyIw-dB1KCaVA");
accountRequest.sanitizeForSaving();
if (!accountRequest.isValid())
{
threadMonitoringController.enterBranch("_ubWSILngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_ubWSJLngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(accountRequest.getInvalidityInfo());
}
threadMonitoringController.setExternalCallId("_ubXgQLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_ubYHULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(accountRequest.toEntity());
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682780009146914913569144 = accountRequest;
threadMonitoringController.exitInternalAction("_ubYHULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682780009146914913569144;
}
finally {
threadMonitoringController.exitService("_ubL6ELngEeyIw-dB1KCaVA");
}
}

public  AccountRequestAttributes getAccountRequestForRegistrationKey(String registrationKey) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("registrationKey", registrationKey);
threadMonitoringController.enterService("_ucOb4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ucQ4ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert registrationKey != null;
List<AccountRequest> accountRequestList = load().filter("registrationKey =", registrationKey).list();
if (accountRequestList.size() > 1)
{
threadMonitoringController.enterBranch("_ucW-wLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_ucW-xLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_ucW-xbngEeyIw-dB1KCaVA");
log.severe("Duplicate registration keys detected for: " + accountRequestList.stream().map(i -> i.getId()).collect(Collectors.joining(", ")));
threadMonitoringController.exitInternalAction("_ucW-xLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
if (accountRequestList.isEmpty())
{
return null;
}
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136827980023673288000417714 = makeAttributes(accountRequestList.get(0));
threadMonitoringController.exitInternalAction("_ucQ4ILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ucbQMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682798006806202265982922 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136827980023673288000417714;
threadMonitoringController.exitInternalAction("_ucbQMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ucceVbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368279800029252535004064217 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682798006806202265982922;
threadMonitoringController.exitInternalAction("_ucceVbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368279800029252535004064217;
}
finally {
threadMonitoringController.exitService("_ucOb4LngEeyIw-dB1KCaVA");
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
threadMonitoringController.enterService("_ubv6wLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_uby-ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert email != null;
assert institute != null;
threadMonitoringController.enterInternalAction("_ub32l7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteDocumentByAccountRequestId(AccountRequest.generateId(email, institute));
threadMonitoringController.exitInternalAction("_ub32l7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_uby-ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ub5rwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
deleteEntity(Key.create(AccountRequest.class, AccountRequest.generateId(email, institute)));
threadMonitoringController.exitInternalAction("_ub5rwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ubv6wLngEeyIw-dB1KCaVA");
}
}

public  void deleteDocumentByAccountRequestId(String accountRequestUniqueId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequestUniqueId", accountRequestUniqueId);
threadMonitoringController.enterService("_v0f2YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_v0nLJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_v0nLJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getSearchManager().deleteDocuments(Collections.singletonList(accountRequestUniqueId));
threadMonitoringController.exitInternalAction("_v0nLJbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_v0nLJLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_v0f2YLngEeyIw-dB1KCaVA");
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
