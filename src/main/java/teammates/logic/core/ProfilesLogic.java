package teammates.logic.core;

import teammates.common.datatransfer.attributes.StudentProfileAttributes;
import teammates.common.exception.InvalidParametersException;
import teammates.storage.api.ProfilesDb;
public final class ProfilesLogic {
private static final ProfilesLogic instance = new  ProfilesLogic();

private final ProfilesDb profilesDb = ProfilesDb.inst();

private  ProfilesLogic(){
}
public static  ProfilesLogic inst() {
return instance;
}

 void initLogicDependencies() {
}

public  StudentProfileAttributes getStudentProfile(String googleId) {
return profilesDb.getStudentProfile(googleId);
}

public  StudentProfileAttributes updateOrCreateStudentProfile(StudentProfileAttributes.UpdateOptions updateOptions)throws InvalidParametersException {
return profilesDb.updateOrCreateStudentProfile(updateOptions);
}

public  void deleteStudentProfile(String googleId) {
profilesDb.deleteStudentProfile(googleId);
}

}
