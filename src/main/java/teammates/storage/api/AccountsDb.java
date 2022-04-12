package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.storage.entity.Account;
public final class AccountsDb extends EntitiesDb<Account, AccountAttributes> {
private static final AccountsDb instance = new  AccountsDb();

private  AccountsDb(){
}
public static  AccountsDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_udY5gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_udausLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368281600723879287641768 = instance;
threadMonitoringController.exitInternalAction("_udausLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368281600723879287641768;
}
finally {
threadMonitoringController.exitService("_udY5gLngEeyIw-dB1KCaVA");
}
}

public  AccountAttributes getAccount(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_udnjALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_udp_QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368282100274095853542322 = googleId.isEmpty() ? null : makeAttributesOrNull(getAccountEntity(googleId));
threadMonitoringController.exitInternalAction("_udp_QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_udws9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136828210010853555985225893 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368282100274095853542322;
threadMonitoringController.exitInternalAction("_udws9LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_udx7FLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136828220016247206288316207 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136828210010853555985225893;
threadMonitoringController.exitInternalAction("_udx7FLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136828220016247206288316207;
}
finally {
threadMonitoringController.exitService("_udnjALngEeyIw-dB1KCaVA");
}
}

public  AccountAttributes updateAccount(AccountAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_uecpcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ueeeoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_ueiJBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Account account = getAccountEntity(updateOptions.getGoogleId());
threadMonitoringController.exitInternalAction("_ueiJBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_ueeeoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ueiJBbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (account == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_ueiJBbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uej-NbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes newAttributes = makeAttributes(account);
threadMonitoringController.exitInternalAction("_uej-NbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_ueklQLngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_uelMULngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_uelzYLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_uelzZLngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_ueo2sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_ueo2sbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_ueqE1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<Boolean>hasSameValue(account.isInstructor(), newAttributes.isInstructor());
threadMonitoringController.exitInternalAction("_ueqE1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_ueo2sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_uer6ALngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uer6BLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_uer6BbngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, Account.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_uer6BLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ueshELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682846007735360536878441 = newAttributes;
threadMonitoringController.exitInternalAction("_ueshELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682846007735360536878441;
}
threadMonitoringController.setExternalCallId("_uetIILngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_uetvMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
account.setIsInstructor(newAttributes.isInstructor());
threadMonitoringController.exitInternalAction("_uetvMLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ueynsrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(account);
threadMonitoringController.exitInternalAction("_ueynsrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_uez107ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682846005244718357776093 = makeAttributes(account);
threadMonitoringController.exitInternalAction("_uez107ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682846005244718357776093;
}
finally {
threadMonitoringController.exitService("_uecpcLngEeyIw-dB1KCaVA");
}
}

public  void deleteAccount(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_ufHX0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ufJ0ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
deleteEntity(Key.create(Account.class, googleId));
threadMonitoringController.exitInternalAction("_ufJ0ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ufHX0LngEeyIw-dB1KCaVA");
}
}

private  Account getAccountEntity(String googleId) {
Account account = load().id(googleId).now();
if (account == null)
{
return null;
}
return account;
}

@Override
 LoadType<Account> load() {
return ofy().load().type(Account.class);
}

@Override
 boolean hasExistingEntities(AccountAttributes entityToCreate) {
Key<Account> keyToFind = Key.create(Account.class, entityToCreate.getGoogleId());
return !load().filterKey(keyToFind).keys().list().isEmpty();
}

@Override
 AccountAttributes makeAttributes(Account entity) {
assert entity != null;
return AccountAttributes.valueOf(entity);
}

}
