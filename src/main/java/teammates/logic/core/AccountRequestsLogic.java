package teammates.logic.core;

import java.util.List;
import teammates.common.datatransfer.attributes.AccountRequestAttributes;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.exception.InvalidParametersException;
import teammates.common.exception.SearchServiceException;
import teammates.storage.api.AccountRequestsDb;
public final class AccountRequestsLogic {
private static final AccountRequestsLogic instance = new  AccountRequestsLogic();

private final AccountRequestsDb accountRequestsDb = AccountRequestsDb.inst();

private  AccountRequestsLogic(){
}
public static  AccountRequestsLogic inst() {
return instance;
}

 void initLogicDependencies() {
}

public  AccountRequestAttributes updateAccountRequest(AccountRequestAttributes.UpdateOptions updateOptions)throws InvalidParametersException, EntityDoesNotExistException {
return accountRequestsDb.updateAccountRequest(updateOptions);
}

public  AccountRequestAttributes createAccountRequest(AccountRequestAttributes accountRequest)throws InvalidParametersException, EntityAlreadyExistsException {
return accountRequestsDb.createEntity(accountRequest);
}

public  void deleteAccountRequest(String email, String institute) {
accountRequestsDb.deleteAccountRequest(email, institute);
}

public  AccountRequestAttributes getAccountRequest(String email, String institute) {
return accountRequestsDb.getAccountRequest(email, institute);
}

public  AccountRequestAttributes getAccountRequestForRegistrationKey(String registrationKey) {
return accountRequestsDb.getAccountRequestForRegistrationKey(registrationKey);
}

public  void putDocument(AccountRequestAttributes accountRequest)throws SearchServiceException {
accountRequestsDb.putDocument(accountRequest);
}

public  List<AccountRequestAttributes> searchAccountRequestsInWholeSystem(String queryString)throws SearchServiceException {
return accountRequestsDb.searchAccountRequestsInWholeSystem(queryString);
}

}
