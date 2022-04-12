package teammates.ui.webapi;

import org.apache.http.HttpStatus;
import teammates.common.datatransfer.attributes.AccountRequestAttributes;
import teammates.common.exception.SearchServiceException;
import teammates.common.util.Const.ParamsNames;
public class AccountRequestSearchIndexingWorkerAction extends AdminOnlyAction {
@Override
public  ActionResult execute() {
String email = getNonNullRequestParamValue(ParamsNames.INSTRUCTOR_EMAIL);
String institute = getNonNullRequestParamValue(ParamsNames.INSTRUCTOR_INSTITUTION);
AccountRequestAttributes accountRequest = logic.getAccountRequest(email, institute);
try {
logic.putAccountRequestDocument(accountRequest);
}
catch(SearchServiceException e){
return new  JsonResult("Failure", HttpStatus.SC_BAD_GATEWAY);
}
return new  JsonResult("Successful");
}

}
