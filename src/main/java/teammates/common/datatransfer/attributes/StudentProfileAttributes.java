package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import teammates.common.util.FieldValidator;
import teammates.common.util.JsonUtils;
import teammates.common.util.SanitizationHelper;
import teammates.common.util.StringHelper;
import teammates.storage.entity.StudentProfile;
public class StudentProfileAttributes extends EntityAttributes<StudentProfile> {
private String googleId;

private String shortName;

private String email;

private String institute;

private String nationality;

private Gender gender;

private String moreInfo;

private Instant modifiedDate;

private  StudentProfileAttributes(String googleId){
this.googleId = googleId;
this.shortName = "";
this.email = "";
this.institute = "";
this.nationality = "";
this.gender = Gender.OTHER;
this.moreInfo = "";
this.modifiedDate = Instant.now();
}
public static  StudentProfileAttributes valueOf(StudentProfile sp) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("sp", sp);
threadMonitoringController.enterService("_sAARELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAZSoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes studentProfileAttributes = new  StudentProfileAttributes(sp.getGoogleId());
if (sp.getShortName() != null)
{
studentProfileAttributes.shortName = sp.getShortName();
}
if (sp.getEmail() != null)
{
studentProfileAttributes.email = sp.getEmail();
}
if (sp.getInstitute() != null)
{
studentProfileAttributes.institute = sp.getInstitute();
}
studentProfileAttributes.gender = Gender.getGenderEnumValue(sp.getGender());
if (sp.getNationality() != null)
{
studentProfileAttributes.nationality = sp.getNationality();
}
if (sp.getMoreInfo() != null)
{
studentProfileAttributes.moreInfo = sp.getMoreInfo();
}
if (sp.getModifiedDate() != null)
{
studentProfileAttributes.modifiedDate = sp.getModifiedDate();
}
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680298004384165776456096 = studentProfileAttributes;
threadMonitoringController.exitInternalAction("_sAZSoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680298004384165776456096;
}
finally {
threadMonitoringController.exitService("_sAARELngEeyIw-dB1KCaVA");
}
}

public static  Builder builder(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_sAc9ALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAdkELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680301009923667116326744 = new  Builder(googleId);
threadMonitoringController.exitInternalAction("_sAdkELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680301009923667116326744;
}
finally {
threadMonitoringController.exitService("_sAc9ALngEeyIw-dB1KCaVA");
}
}

public  StudentProfileAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sAfZQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAgAULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes studentProfileAttributes = new  StudentProfileAttributes(googleId);
studentProfileAttributes.shortName = shortName;
studentProfileAttributes.email = email;
studentProfileAttributes.institute = institute;
studentProfileAttributes.gender = gender;
studentProfileAttributes.nationality = nationality;
studentProfileAttributes.moreInfo = moreInfo;
studentProfileAttributes.modifiedDate = modifiedDate;
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680305008349102472253939 = studentProfileAttributes;
threadMonitoringController.exitInternalAction("_sAgAULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680305008349102472253939;
}
finally {
threadMonitoringController.exitService("_sAfZQLngEeyIw-dB1KCaVA");
}
}

public  String getGoogleId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sAh1gLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAickLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680309005705042317458332 = googleId;
threadMonitoringController.exitInternalAction("_sAickLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680309005705042317458332;
}
finally {
threadMonitoringController.exitService("_sAh1gLngEeyIw-dB1KCaVA");
}
}

public  String getShortName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sAkRwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAk40LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368031200046786855208667766 = shortName;
threadMonitoringController.exitInternalAction("_sAk40LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368031200046786855208667766;
}
finally {
threadMonitoringController.exitService("_sAkRwLngEeyIw-dB1KCaVA");
}
}

public  void setShortName(String shortName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("shortName", shortName);
threadMonitoringController.enterService("_sAmG8LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAmuALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.shortName = shortName;
threadMonitoringController.exitInternalAction("_sAmuALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sAmG8LngEeyIw-dB1KCaVA");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sAn8ILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sApKQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680317007214885601439658 = email;
threadMonitoringController.exitInternalAction("_sApKQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680317007214885601439658;
}
finally {
threadMonitoringController.exitService("_sAn8ILngEeyIw-dB1KCaVA");
}
}

public  void setEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_sAqYYLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAq_cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = email;
threadMonitoringController.exitInternalAction("_sAq_cLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sAqYYLngEeyIw-dB1KCaVA");
}
}

public  String getInstitute() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sAsNkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAs0oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680325005793043811173084 = institute;
threadMonitoringController.exitInternalAction("_sAs0oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680325005793043811173084;
}
finally {
threadMonitoringController.exitService("_sAsNkLngEeyIw-dB1KCaVA");
}
}

public  void setInstitute(String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_sAuCwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAvQ4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.institute = institute;
threadMonitoringController.exitInternalAction("_sAvQ4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sAuCwLngEeyIw-dB1KCaVA");
}
}

public  String getNationality() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sAwfALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAxGELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680332008936466590303306 = nationality;
threadMonitoringController.exitInternalAction("_sAxGELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680332008936466590303306;
}
finally {
threadMonitoringController.exitService("_sAwfALngEeyIw-dB1KCaVA");
}
}

public  void setNationality(String nationality) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("nationality", nationality);
threadMonitoringController.enterService("_sAyUMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sAy7QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.nationality = nationality;
threadMonitoringController.exitInternalAction("_sAy7QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sAyUMLngEeyIw-dB1KCaVA");
}
}

public  Gender getGender() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sA0wcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sA1XgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Gender longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803390000521371969789497 = gender;
threadMonitoringController.exitInternalAction("_sA1XgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803390000521371969789497;
}
finally {
threadMonitoringController.exitService("_sA0wcLngEeyIw-dB1KCaVA");
}
}

public  void setGender(Gender gender) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("gender", gender);
threadMonitoringController.enterService("_sA2loLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sA3zwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.gender = gender;
threadMonitoringController.exitInternalAction("_sA3zwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sA2loLngEeyIw-dB1KCaVA");
}
}

public  String getMoreInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sA5B4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sA5o8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680344008856856411877623 = moreInfo;
threadMonitoringController.exitInternalAction("_sA5o8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680344008856856411877623;
}
finally {
threadMonitoringController.exitService("_sA5B4LngEeyIw-dB1KCaVA");
}
}

public  void setMoreInfo(String moreInfo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("moreInfo", moreInfo);
threadMonitoringController.enterService("_sA63ELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sA7eILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.moreInfo = moreInfo;
threadMonitoringController.exitInternalAction("_sA7eILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sA63ELngEeyIw-dB1KCaVA");
}
}

public  Instant getModifiedDate() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sA8sQLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sA9TULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680353006879928532320717 = modifiedDate;
threadMonitoringController.exitInternalAction("_sA9TULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680353006879928532320717;
}
finally {
threadMonitoringController.exitService("_sA8sQLngEeyIw-dB1KCaVA");
}
}

public  void setModifiedDate(Instant modifiedDate) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("modifiedDate", modifiedDate);
threadMonitoringController.enterService("_sA_IgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sBAWoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.modifiedDate = modifiedDate;
threadMonitoringController.exitInternalAction("_sBAWoLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sA_IgLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sBBkwLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sBCy4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_sBCy4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sBI5hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForGoogleId(googleId), errors);
threadMonitoringController.exitInternalAction("_sBI5hLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_sBNK8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (!StringHelper.isEmpty(shortName))
{
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(shortName), errors);
}
if (!StringHelper.isEmpty(email))
{
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(email), errors);
}
if (!StringHelper.isEmpty(institute))
{
addNonEmptyError(FieldValidator.getInvalidityInfoForInstituteName(institute), errors);
}
if (!StringHelper.isEmpty(nationality))
{
addNonEmptyError(FieldValidator.getInvalidityInfoForNationality(nationality), errors);
}
assert gender != null;
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680363006310301302038895 = errors;
threadMonitoringController.exitInternalAction("_sBNK8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680363006310301302038895;
}
finally {
threadMonitoringController.exitService("_sBBkwLngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sBSqgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
return JsonUtils.toJson(this, StudentProfileAttributes.class);
}
finally {
threadMonitoringController.exitService("_sBSqgLngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sBVt0LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sBWU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.email).append(this.shortName).append(this.institute).append(this.googleId).append(this.gender.toString());
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803670039075253906579954 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_sBWU4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803670039075253906579954;
}
finally {
threadMonitoringController.exitService("_sBVt0LngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_sBZ_QLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sBcbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368037100640487389319208 = false;
threadMonitoringController.exitInternalAction("_sBcbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368037100640487389319208;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680371004219310899317268 = true;
threadMonitoringController.exitInternalAction("_sBcbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680371004219310899317268;
}
else
if (this.getClass() == other.getClass())
{
StudentProfileAttributes otherProfile = (StudentProfileAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680371008315459719708476 = Objects.equals(this.email, otherProfile.email) && Objects.equals(this.shortName, otherProfile.shortName) && Objects.equals(this.institute, otherProfile.institute) && Objects.equals(this.googleId, otherProfile.googleId) && Objects.equals(this.gender, otherProfile.gender);
threadMonitoringController.exitInternalAction("_sBcbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713680371008315459719708476;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368037100753414945731864 = false;
threadMonitoringController.exitInternalAction("_sBcbgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971368037100753414945731864;
}
}
finally {
threadMonitoringController.exitService("_sBZ_QLngEeyIw-dB1KCaVA");
}
}

@Override
public  StudentProfile toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sBdpoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sBe3wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfile longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803750021627026053123122 = new  StudentProfile(googleId, shortName, email, institute, nationality, gender.name().toLowerCase(), moreInfo);
threadMonitoringController.exitInternalAction("_sBe3wLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803750021627026053123122;
}
finally {
threadMonitoringController.exitService("_sBdpoLngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_sBgF4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
this.googleId = SanitizationHelper.sanitizeGoogleId(this.googleId);
}
finally {
threadMonitoringController.exitService("_sBgF4LngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_sBjJMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sBkXULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.shortNameOption.ifPresent(s -> shortName = s);
updateOptions.emailOption.ifPresent(s -> email = s);
updateOptions.instituteOption.ifPresent(s -> institute = s);
updateOptions.nationalityOption.ifPresent(s -> nationality = s);
updateOptions.genderOption.ifPresent(s -> gender = s);
updateOptions.moreInfoOption.ifPresent(s -> moreInfo = s);
threadMonitoringController.exitInternalAction("_sBkXULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_sBjJMLngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_sBnaoLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_sBoowLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803820039038420294490195 = new  UpdateOptions.Builder(googleId);
threadMonitoringController.exitInternalAction("_sBoowLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136803820039038420294490195;
}
finally {
threadMonitoringController.exitService("_sBnaoLngEeyIw-dB1KCaVA");
}
}

public static class Builder extends BasicBuilder<StudentProfileAttributes, Builder> {
private final StudentProfileAttributes profileAttributes;

private  Builder(String googleId){
super(new  UpdateOptions(googleId));
thisBuilder = this;
profileAttributes = new  StudentProfileAttributes(googleId);
}
@Override
public  StudentProfileAttributes build() {
profileAttributes.update(updateOptions);
return profileAttributes;
}

}
public enum Gender {
MALE ,
FEMALE ,
OTHER ,
;

public static  Gender getGenderEnumValue(String gender) {
if (gender == null)
{
return Gender.OTHER;
}
try {
return Gender.valueOf(gender.toUpperCase());
}
catch(IllegalArgumentException e){
return Gender.OTHER;
}
}

}
public static class UpdateOptions {
private String googleId;

private UpdateOption<String> shortNameOption = UpdateOption.empty();

private UpdateOption<String> emailOption = UpdateOption.empty();

private UpdateOption<String> instituteOption = UpdateOption.empty();

private UpdateOption<String> nationalityOption = UpdateOption.empty();

private UpdateOption<Gender> genderOption = UpdateOption.empty();

private UpdateOption<String> moreInfoOption = UpdateOption.empty();

private  UpdateOptions(String googleId){
assert googleId != null;
this.googleId = googleId;
}
public  String getGoogleId() {
return googleId;
}

@Override
public  String toString() {
return "StudentAttributes.UpdateOptions [" + "googleId = " + googleId + ", shortName = " + shortNameOption + ", email = " + emailOption + ", institute = " + instituteOption + ", nationality = " + nationalityOption + ", gender = " + genderOption + ", moreInfo = " + moreInfoOption + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(String googleId){
super(new  UpdateOptions(googleId));
thisBuilder = this;
}
@Override
public  UpdateOptions build() {
return updateOptions;
}

}
}
private abstract static class BasicBuilder<T, B extends BasicBuilder<T, B>>  {
UpdateOptions updateOptions;

B thisBuilder;

 BasicBuilder(UpdateOptions updateOptions){
this.updateOptions = updateOptions;
}
public  B withShortName(String shortName) {
assert shortName != null;
updateOptions.shortNameOption = UpdateOption.of(shortName);
return thisBuilder;
}

public  B withEmail(String email) {
assert email != null;
updateOptions.emailOption = UpdateOption.of(email);
return thisBuilder;
}

public  B withInstitute(String institute) {
assert institute != null;
updateOptions.instituteOption = UpdateOption.of(institute);
return thisBuilder;
}

public  B withNationality(String nationality) {
assert nationality != null;
updateOptions.nationalityOption = UpdateOption.of(nationality);
return thisBuilder;
}

public  B withGender(Gender gender) {
assert gender != null;
updateOptions.genderOption = UpdateOption.of(gender);
return thisBuilder;
}

public  B withMoreInfo(String moreInfo) {
assert moreInfo != null;
updateOptions.moreInfoOption = UpdateOption.of(moreInfo);
return thisBuilder;
}

public abstract  T build() ;

}
}
