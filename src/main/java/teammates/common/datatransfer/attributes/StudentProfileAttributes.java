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
threadMonitoringController.enterService("_adRFcLvVEeyr6avTgCRLkQ", StudentProfileAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adSTkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130181840027256189941667874 = studentProfileAttributes;
threadMonitoringController.exitInternalAction("_adSTkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130181840027256189941667874;
}
finally {
threadMonitoringController.exitService("_adRFcLvVEeyr6avTgCRLkQ");
}
}

public static  Builder builder(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_adWlALvVEeyr6avTgCRLkQ", StudentProfileAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adXMELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018193009613461725819301 = new  Builder(googleId);
threadMonitoringController.exitInternalAction("_adXMELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018193009613461725819301;
}
finally {
threadMonitoringController.exitService("_adWlALvVEeyr6avTgCRLkQ");
}
}

public  StudentProfileAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_adYaMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adZBQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfileAttributes studentProfileAttributes = new  StudentProfileAttributes(googleId);
studentProfileAttributes.shortName = shortName;
studentProfileAttributes.email = email;
studentProfileAttributes.institute = institute;
studentProfileAttributes.gender = gender;
studentProfileAttributes.nationality = nationality;
studentProfileAttributes.moreInfo = moreInfo;
studentProfileAttributes.modifiedDate = modifiedDate;
StudentProfileAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018202005510039125317341 = studentProfileAttributes;
threadMonitoringController.exitInternalAction("_adZBQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018202005510039125317341;
}
finally {
threadMonitoringController.exitService("_adYaMLvVEeyr6avTgCRLkQ");
}
}

public  String getGoogleId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ada2cLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adbdgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018211004463750662038152 = googleId;
threadMonitoringController.exitInternalAction("_adbdgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018211004463750662038152;
}
finally {
threadMonitoringController.exitService("_ada2cLvVEeyr6avTgCRLkQ");
}
}

public  String getShortName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_adcroLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_addSsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018218009619033015861783 = shortName;
threadMonitoringController.exitInternalAction("_addSsLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018218009619033015861783;
}
finally {
threadMonitoringController.exitService("_adcroLvVEeyr6avTgCRLkQ");
}
}

public  void setShortName(String shortName) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("shortName", shortName);
threadMonitoringController.enterService("_adfH4LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adgWALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.shortName = shortName;
threadMonitoringController.exitInternalAction("_adgWALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_adfH4LvVEeyr6avTgCRLkQ");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_adhkILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adiLMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018233007487151639334844 = email;
threadMonitoringController.exitInternalAction("_adiLMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018233007487151639334844;
}
finally {
threadMonitoringController.exitService("_adhkILvVEeyr6avTgCRLkQ");
}
}

public  void setEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_adjZULvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adkncLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = email;
threadMonitoringController.exitInternalAction("_adkncLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_adjZULvVEeyr6avTgCRLkQ");
}
}

public  String getInstitute() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_adl1kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_admcoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301825100672526217008908 = institute;
threadMonitoringController.exitInternalAction("_admcoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301825100672526217008908;
}
finally {
threadMonitoringController.exitService("_adl1kLvVEeyr6avTgCRLkQ");
}
}

public  void setInstitute(String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_adoR0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ado44LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.institute = institute;
threadMonitoringController.exitInternalAction("_ado44LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_adoR0LvVEeyr6avTgCRLkQ");
}
}

public  String getNationality() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_adquELvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adrVILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018267005215174476022848 = nationality;
threadMonitoringController.exitInternalAction("_adrVILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018267005215174476022848;
}
finally {
threadMonitoringController.exitService("_adquELvVEeyr6avTgCRLkQ");
}
}

public  void setNationality(String nationality) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("nationality", nationality);
threadMonitoringController.enterService("_adsjQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adtxYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.nationality = nationality;
threadMonitoringController.exitInternalAction("_adtxYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_adsjQLvVEeyr6avTgCRLkQ");
}
}

public  Gender getGender() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_adu_gLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_advmkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Gender longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018285008644320409902946 = gender;
threadMonitoringController.exitInternalAction("_advmkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018285008644320409902946;
}
finally {
threadMonitoringController.exitService("_adu_gLvVEeyr6avTgCRLkQ");
}
}

public  void setGender(Gender gender) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("gender", gender);
threadMonitoringController.enterService("_adw0sLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_adyC0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.gender = gender;
threadMonitoringController.exitInternalAction("_adyC0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_adw0sLvVEeyr6avTgCRLkQ");
}
}

public  String getMoreInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_adzQ8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ad0fELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018301002703198085080547 = moreInfo;
threadMonitoringController.exitInternalAction("_ad0fELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018301002703198085080547;
}
finally {
threadMonitoringController.exitService("_adzQ8LvVEeyr6avTgCRLkQ");
}
}

public  void setMoreInfo(String moreInfo) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("moreInfo", moreInfo);
threadMonitoringController.enterService("_ad1tMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ad2UQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.moreInfo = moreInfo;
threadMonitoringController.exitInternalAction("_ad2UQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ad1tMLvVEeyr6avTgCRLkQ");
}
}

public  Instant getModifiedDate() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ad4JcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ad4wgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018318006842306326567164 = modifiedDate;
threadMonitoringController.exitInternalAction("_ad4wgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018318006842306326567164;
}
finally {
threadMonitoringController.exitService("_ad4JcLvVEeyr6avTgCRLkQ");
}
}

public  void setModifiedDate(Instant modifiedDate) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("modifiedDate", modifiedDate);
threadMonitoringController.enterService("_ad5-oLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ad7MwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.modifiedDate = modifiedDate;
threadMonitoringController.exitInternalAction("_ad7MwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_ad5-oLvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ad9B8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ad-QELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_ad-QELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aeFk1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForGoogleId(googleId), errors);
threadMonitoringController.exitInternalAction("_aeFk1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_aeJPMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
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
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018341004553638509221599 = errors;
threadMonitoringController.exitInternalAction("_aeJPMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018341004553638509221599;
}
finally {
threadMonitoringController.exitService("_ad9B8LvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aeRLALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
return JsonUtils.toJson(this, StudentProfileAttributes.class);
}
finally {
threadMonitoringController.exitService("_aeRLALvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aeWDgLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aeXRoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.email).append(this.shortName).append(this.institute).append(this.googleId).append(this.gender.toString());
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018354009860488018673909 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_aeXRoLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018354009860488018673909;
}
finally {
threadMonitoringController.exitService("_aeWDgLvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_aea8ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aedYQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130183620034236063085267243 = false;
threadMonitoringController.exitInternalAction("_aedYQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130183620034236063085267243;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130183620028460363376861586 = true;
threadMonitoringController.exitInternalAction("_aedYQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130183620028460363376861586;
}
else
if (this.getClass() == other.getClass())
{
StudentProfileAttributes otherProfile = (StudentProfileAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130183620046452180310291213 = Objects.equals(this.email, otherProfile.email) && Objects.equals(this.shortName, otherProfile.shortName) && Objects.equals(this.institute, otherProfile.institute) && Objects.equals(this.googleId, otherProfile.googleId) && Objects.equals(this.gender, otherProfile.gender);
threadMonitoringController.exitInternalAction("_aedYQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130183620046452180310291213;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018362008237770307626118 = false;
threadMonitoringController.exitInternalAction("_aedYQLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018362008237770307626118;
}
}
finally {
threadMonitoringController.exitService("_aea8ALvVEeyr6avTgCRLkQ");
}
}

@Override
public  StudentProfile toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aefNcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aegbkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StudentProfile longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018372007386683475946807 = new  StudentProfile(googleId, shortName, email, institute, nationality, gender.name().toLowerCase(), moreInfo);
threadMonitoringController.exitInternalAction("_aegbkLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018372007386683475946807;
}
finally {
threadMonitoringController.exitService("_aefNcLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_aeiQwLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
this.googleId = SanitizationHelper.sanitizeGoogleId(this.googleId);
}
finally {
threadMonitoringController.exitService("_aeiQwLvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_aemiMLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aenwULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.shortNameOption.ifPresent(s -> shortName = s);
updateOptions.emailOption.ifPresent(s -> email = s);
updateOptions.instituteOption.ifPresent(s -> institute = s);
updateOptions.nationalityOption.ifPresent(s -> nationality = s);
updateOptions.genderOption.ifPresent(s -> gender = s);
updateOptions.moreInfoOption.ifPresent(s -> moreInfo = s);
threadMonitoringController.exitInternalAction("_aenwULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_aemiMLvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_aeqzoLvVEeyr6avTgCRLkQ", StudentProfileAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_aesBwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018392003562323168326216 = new  UpdateOptions.Builder(googleId);
threadMonitoringController.exitInternalAction("_aesBwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013018392003562323168326216;
}
finally {
threadMonitoringController.exitService("_aeqzoLvVEeyr6avTgCRLkQ");
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
