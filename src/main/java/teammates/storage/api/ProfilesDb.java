package teammates.storage.api;

import static com.googlecode.objectify.ObjectifyService.ofy;
import java.time.Instant;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.LoadType;
import teammates.common.datatransfer.attributes.StudentProfileAttributes;
import teammates.common.exception.InvalidParametersException;
import teammates.storage.entity.Account;
import teammates.storage.entity.StudentProfile;
public final class ProfilesDb extends EntitiesDb<StudentProfile, StudentProfileAttributes> {
private static final ProfilesDb instance = new  ProfilesDb();

private  ProfilesDb(){
}
public static  ProfilesDb inst() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_dMfr0LvVEeyr6avTgCRLkQ", ProfilesDb.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dMiIELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
ProfilesDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027749001980469985304405 = instance;
threadMonitoringController.exitInternalAction("_dMiIELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013027749001980469985304405;
}
finally {
threadMonitoringController.exitService("_dMfr0LvVEeyr6avTgCRLkQ");
}
}

public  StudentProfileAttributes getStudentProfile(String accountGoogleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountGoogleId", accountGoogleId);
threadMonitoringController.enterService("_ePINgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ePWP9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130329760031334349619280666 = makeAttributesOrNull(getStudentProfileEntityFromDb(accountGoogleId));
threadMonitoringController.exitInternalAction("_ePWP9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ePXeFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032976006851467846210291 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130329760031334349619280666;
threadMonitoringController.exitInternalAction("_ePXeFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013032976006851467846210291;
}
finally {
threadMonitoringController.exitService("_ePINgLvVEeyr6avTgCRLkQ");
}
}

public  StudentProfileAttributes updateOrCreateStudentProfile(StudentProfileAttributes.UpdateOptions updateOptions)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_ePhPELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ePjrULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_ePrnJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfile studentProfile = getStudentProfileEntityFromDb(updateOptions.getGoogleId());
threadMonitoringController.exitInternalAction("_ePrnJLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_ePjrULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ePrnJbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean shouldCreateEntity = studentProfile == null;
if (shouldCreateEntity)
{
studentProfile = new  StudentProfile(updateOptions.getGoogleId());
}
threadMonitoringController.exitInternalAction("_ePrnJbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_ePv4kbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes newAttributes = makeAttributes(studentProfile);
threadMonitoringController.exitInternalAction("_ePv4kbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_ePwfoLvVEeyr6avTgCRLkQ");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_ePxGsLvVEeyr6avTgCRLkQ");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_ePyU0LvVEeyr6avTgCRLkQ");
threadMonitoringController.setExternalCallId("_ePyU1LvVEeyr6avTgCRLkQ");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_eQCMcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQCMcbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQDalLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQDalbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQDalrvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQEos7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQEotLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQEotbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQF207vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQF21LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQF21bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQHE87vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQHE9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQHE9bvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQHsALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQITE7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQITFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQITFbvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQJhM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(studentProfile.getEmail(), newAttributes.getEmail()) && this.<String>hasSameValue(studentProfile.getShortName(), newAttributes.getShortName()) && this.<String>hasSameValue(studentProfile.getInstitute(), newAttributes.getInstitute()) && this.<String>hasSameValue(studentProfile.getNationality(), newAttributes.getNationality()) && this.<String>hasSameValue(studentProfile.getGender(), newAttributes.getGender().name().toLowerCase()) && this.<String>hasSameValue(studentProfile.getMoreInfo(), newAttributes.getMoreInfo());
threadMonitoringController.exitInternalAction("_eQJhM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQITFLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQITE7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQHsALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQHE9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQHE87vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQF21LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQF207vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQEotLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQEos7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQDalbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQDalLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_eQCMcLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!shouldCreateEntity && hasSameAttributes)
{
threadMonitoringController.enterBranch("_eQL9cLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQL9dLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQL9dbvVEeyr6avTgCRLkQ");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, StudentProfile.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_eQL9dLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQMkgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303326000290598204764706 = newAttributes;
threadMonitoringController.exitInternalAction("_eQMkgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001303326000290598204764706;
}
threadMonitoringController.setExternalCallId("_eQNyoLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQNyobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setShortName(newAttributes.getShortName());
threadMonitoringController.exitInternalAction("_eQNyobvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQPn0LvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQQO4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setEmail(newAttributes.getEmail());
threadMonitoringController.exitInternalAction("_eQQO4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQRdALvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQRdAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setInstitute(newAttributes.getInstitute());
threadMonitoringController.exitInternalAction("_eQRdAbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQTSMLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQTSMbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setNationality(newAttributes.getNationality());
threadMonitoringController.exitInternalAction("_eQTSMbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQWVgLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQW8kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setGender(newAttributes.getGender().name().toLowerCase());
threadMonitoringController.exitInternalAction("_eQW8kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_eQYKsLvVEeyr6avTgCRLkQ");
threadMonitoringController.enterInternalAction("_eQYKsbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setMoreInfo(newAttributes.getMoreInfo());
studentProfile.setModifiedDate(Instant.now());
threadMonitoringController.exitInternalAction("_eQYKsbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQhUorvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(studentProfile);
threadMonitoringController.exitInternalAction("_eQhUorvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_eQjJ07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033260009480819243285663 = makeAttributes(studentProfile);
threadMonitoringController.exitInternalAction("_eQjJ07vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013033260009480819243285663;
}
finally {
threadMonitoringController.exitService("_ePhPELvVEeyr6avTgCRLkQ");
}
}

public  void deleteStudentProfile(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_dP4-ELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_dQBg9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfile sp = getStudentProfileEntityFromDb(googleId);
threadMonitoringController.exitInternalAction("_dQBg9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_dQBg9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (sp == null)
{
return;
}
Key<Account> parentKey = Key.create(Account.class, googleId);
Key<StudentProfile> profileKey = Key.create(parentKey, StudentProfile.class, googleId);
deleteEntity(profileKey);
threadMonitoringController.exitInternalAction("_dQBg9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_dP4-ELvVEeyr6avTgCRLkQ");
}
}

private  StudentProfile getStudentProfileEntityFromDb(String googleId) {
Key<Account> parentKey = Key.create(Account.class, googleId);
Key<StudentProfile> childKey = Key.create(parentKey, StudentProfile.class, googleId);
return ofy().load().key(childKey).now();
}

@Override
 LoadType<StudentProfile> load() {
return ofy().load().type(StudentProfile.class);
}

@Override
 boolean hasExistingEntities(StudentProfileAttributes entityToCreate) {
Key<Account> parentKey = Key.create(Account.class, entityToCreate.getGoogleId());
Key<StudentProfile> childKey = Key.create(parentKey, StudentProfile.class, entityToCreate.getGoogleId());
return !load().filterKey(childKey).keys().list().isEmpty();
}

@Override
 StudentProfileAttributes makeAttributes(StudentProfile entity) {
assert entity != null;
return StudentProfileAttributes.valueOf(entity);
}

}
