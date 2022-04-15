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
threadMonitoringController.enterService("_dCs2oLvVEeyr6avTgCRLkQ", AccountsDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dCvS4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountsDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027178008570758089448749 = instance;
threadMonitoringController.exitInternalAction("_dCvS4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027178008570758089448749;
}
finally {
threadMonitoringController.exitService("_dCs2oLvVEeyr6avTgCRLkQ");
}
}

public  AccountAttributes getAccount(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_dC8uQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dC-jcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027206006071811033151732 = googleId.isEmpty() ? null : makeAttributesOrNull(getAccountEntity(googleId));
threadMonitoringController.exitInternalAction("_dC-jcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dDEDBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027206005702351629343653 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027206006071811033151732;
threadMonitoringController.exitInternalAction("_dDEDBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dDEqFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027206009230966877955628 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027206005702351629343653;
threadMonitoringController.exitInternalAction("_dDEqFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027206009230966877955628;
}
finally {
threadMonitoringController.exitService("_dC8uQLvVEeyr6avTgCRLkQ");
}
}

public  AccountAttributes updateAccount(AccountAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_dDxNoLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dDzp4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_dD37UrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Account account = getAccountEntity(updateOptions.getGoogleId());
threadMonitoringController.exitInternalAction("_dD37UrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dDzp4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dD37U7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (account == null)
{
throw new  EntityDoesNotExistException(ERROR_UPDATE_NON_EXISTENT + updateOptions);
}
threadMonitoringController.exitInternalAction("_dD37U7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dD6XkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes newAttributes = makeAttributes(account);
threadMonitoringController.exitInternalAction("_dD6XkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dD6XkrvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_dD7lsLvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_dD8MwLvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_dD8MxLvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_dD_QELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dD_QEbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dEAeNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<Boolean>hasSameValue(account.isInstructor(), newAttributes.isInstructor());
threadMonitoringController.exitInternalAction("_dEAeNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_dD_QELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (hasSameAttributes)
{
threadMonitoringController.enterBranch("_dEBsULvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dECTYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_dECTYbvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, Account.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_dECTYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dECTYrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027339002620854931408344 = newAttributes;
threadMonitoringController.exitInternalAction("_dECTYrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027339002620854931408344;
}
threadMonitoringController.setExternalCallId("_dEDhgLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_dEDhgbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
account.setIsInstructor(newAttributes.isInstructor());
threadMonitoringController.exitInternalAction("_dEDhgbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dEJBE7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(account);
threadMonitoringController.exitInternalAction("_dEJBE7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dEKPM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027339005029078945024293 = makeAttributes(account);
threadMonitoringController.exitInternalAction("_dEKPM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027339005029078945024293;
}
finally {
threadMonitoringController.exitService("_dDxNoLvVEeyr6avTgCRLkQ");
}
}

public  void deleteAccount(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_dEeYQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dEg0gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert googleId != null;
deleteEntity(Key.create(Account.class, googleId));
threadMonitoringController.exitInternalAction("_dEg0gLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dEeYQLvVEeyr6avTgCRLkQ");
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
