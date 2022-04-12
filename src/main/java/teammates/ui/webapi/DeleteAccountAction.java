package teammates.ui.webapi;

import teammates.common.util.Const;
class DeleteAccountAction extends AdminOnlyAction {
@Override
public  JsonResult execute() {
String googleId = getNonNullRequestParamValue(Const.ParamsNames.INSTRUCTOR_ID);
if (fileStorage.doesFileExist(googleId))
{
fileStorage.delete(googleId);
}
logic.deleteAccountCascade(googleId);
return new  JsonResult("Account is successfully deleted.");
}

}
