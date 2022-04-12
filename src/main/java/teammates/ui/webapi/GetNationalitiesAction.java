package teammates.ui.webapi;

import teammates.common.util.NationalityHelper;
import teammates.ui.output.NationalitiesData;
class GetNationalitiesAction extends Action {
@Override
 AuthType getMinAuthLevel() {
return AuthType.PUBLIC;
}

@Override
 void checkSpecificAccessControl() {
}

@Override
public  JsonResult execute() {
NationalitiesData nationalities = new  NationalitiesData(NationalityHelper.getNationalities());
return new  JsonResult(nationalities);
}

}
