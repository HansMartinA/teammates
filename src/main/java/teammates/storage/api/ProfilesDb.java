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
threadMonitoringController.enterService("_umekELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_umhAULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
ProfilesDb longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682929004776982383901197 = instance;
threadMonitoringController.exitInternalAction("_umhAULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713682929004776982383901197;
}
finally {
threadMonitoringController.exitService("_umekELngEeyIw-dB1KCaVA");
}
}

public  StudentProfileAttributes getStudentProfile(String accountGoogleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountGoogleId", accountGoogleId);
threadMonitoringController.enterService("_vn9PMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_voHANLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683874003585658637518191 = makeAttributesOrNull(getStudentProfileEntityFromDb(accountGoogleId));
threadMonitoringController.exitInternalAction("_voHANLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_voIOVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368387400010362967761421538 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683874003585658637518191;
threadMonitoringController.exitInternalAction("_voIOVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368387400010362967761421538;
}
finally {
threadMonitoringController.exitService("_vn9PMLngEeyIw-dB1KCaVA");
}
}

public  StudentProfileAttributes updateOrCreateStudentProfile(StudentProfileAttributes.UpdateOptions updateOptions)throws InvalidParametersException {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_voOU8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_voRYQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
assert updateOptions != null;
threadMonitoringController.enterInternalAction("_voYtBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfile studentProfile = getStudentProfileEntityFromDb(updateOptions.getGoogleId());
threadMonitoringController.exitInternalAction("_voYtBLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_voRYQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_voZUELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean shouldCreateEntity = studentProfile == null;
if (shouldCreateEntity)
{
studentProfile = new  StudentProfile(updateOptions.getGoogleId());
}
threadMonitoringController.exitInternalAction("_voZUELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vobwVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes newAttributes = makeAttributes(studentProfile);
threadMonitoringController.exitInternalAction("_vobwVLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vocXYLngEeyIw-dB1KCaVA");
newAttributes.update(updateOptions);
threadMonitoringController.setExternalCallId("_voc-cLngEeyIw-dB1KCaVA");
newAttributes.sanitizeForSaving();
if (!newAttributes.isValid())
{
threadMonitoringController.enterBranch("_vodlgLngEeyIw-dB1KCaVA");
threadMonitoringController.setExternalCallId("_vodlhLngEeyIw-dB1KCaVA");
throw new  InvalidParametersException(newAttributes.getInvalidityInfo());
}
threadMonitoringController.enterInternalAction("_vorA4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vorA4bngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vos2ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vos2EbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vos2ErngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vouEM7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vouENLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vouENbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vov5Y7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vov5ZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vov5ZbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vowgc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vowgdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vowgdbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_voxHgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_voxuk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_voxulLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_voxulbngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_voy8s7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean hasSameAttributes = this.<String>hasSameValue(studentProfile.getEmail(), newAttributes.getEmail()) && this.<String>hasSameValue(studentProfile.getShortName(), newAttributes.getShortName()) && this.<String>hasSameValue(studentProfile.getInstitute(), newAttributes.getInstitute()) && this.<String>hasSameValue(studentProfile.getNationality(), newAttributes.getNationality()) && this.<String>hasSameValue(studentProfile.getGender(), newAttributes.getGender().name().toLowerCase()) && this.<String>hasSameValue(studentProfile.getMoreInfo(), newAttributes.getMoreInfo());
threadMonitoringController.exitInternalAction("_voy8s7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_voxulLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_voxuk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_voxHgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vowgdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vowgc7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vov5ZLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vov5Y7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vouENLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vouEM7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vos2EbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vos2ELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_vorA4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!shouldCreateEntity && hasSameAttributes)
{
threadMonitoringController.enterBranch("_vo0x4LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vo0x5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vo0x5bngEeyIw-dB1KCaVA");
log.info(String.format(OPTIMIZED_SAVING_POLICY_APPLIED, StudentProfile.class.getSimpleName(), updateOptions));
threadMonitoringController.exitInternalAction("_vo0x5LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vo0x5rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683935007631384564886139 = newAttributes;
threadMonitoringController.exitInternalAction("_vo0x5rngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713683935007631384564886139;
}
threadMonitoringController.setExternalCallId("_vo3OILngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vo31MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setShortName(newAttributes.getShortName());
threadMonitoringController.exitInternalAction("_vo31MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vo4cQLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vo5DULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setEmail(newAttributes.getEmail());
threadMonitoringController.exitInternalAction("_vo5DULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vo5qYLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vo6RcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setInstitute(newAttributes.getInstitute());
threadMonitoringController.exitInternalAction("_vo6RcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vo7fkLngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vo8GoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setNationality(newAttributes.getNationality());
threadMonitoringController.exitInternalAction("_vo8GoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vo-i4LngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vo-i4bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setGender(newAttributes.getGender().name().toLowerCase());
threadMonitoringController.exitInternalAction("_vo-i4bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.setExternalCallId("_vo_xALngEeyIw-dB1KCaVA");
threadMonitoringController.enterInternalAction("_vpAYELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
studentProfile.setMoreInfo(newAttributes.getMoreInfo());
studentProfile.setModifiedDate(Instant.now());
threadMonitoringController.exitInternalAction("_vpAYELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vpHs07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
saveEntity(studentProfile);
threadMonitoringController.exitInternalAction("_vpHs07ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_vpJiA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368393500864131644067847 = makeAttributes(studentProfile);
threadMonitoringController.exitInternalAction("_vpJiA7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368393500864131644067847;
}
finally {
threadMonitoringController.exitService("_voOU8LngEeyIw-dB1KCaVA");
}
}

public  void deleteStudentProfile(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_upvTcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_up3PRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfile sp = getStudentProfileEntityFromDb(googleId);
threadMonitoringController.exitInternalAction("_up3PRLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_up3PRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (sp == null)
{
return;
}
Key<Account> parentKey = Key.create(Account.class, googleId);
Key<StudentProfile> profileKey = Key.create(parentKey, StudentProfile.class, googleId);
deleteEntity(profileKey);
threadMonitoringController.exitInternalAction("_up3PRbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_upvTcLngEeyIw-dB1KCaVA");
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
