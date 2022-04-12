package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import teammates.common.util.Config;
import teammates.common.util.Const;
import teammates.common.util.FieldValidator;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.AccountRequest;
public class AccountRequestAttributes extends EntityAttributes<AccountRequest> {
private String email;

private String name;

private String institute;

private Instant registeredAt;

private Instant createdAt;

private transient String registrationKey;

private  AccountRequestAttributes(String email, String institute, String name){
this.email = email;
this.institute = institute;
this.name = name;
this.registrationKey = null;
this.registeredAt = null;
this.createdAt = null;
}
public static  AccountRequestAttributes valueOf(AccountRequest accountRequest) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("accountRequest", accountRequest);
threadMonitoringController.enterService("_riWEsbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_riWrwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes accountRequestAttributes = new  AccountRequestAttributes(accountRequest.getEmail(), accountRequest.getInstitute(), accountRequest.getName());
accountRequestAttributes.registrationKey = accountRequest.getRegistrationKey();
accountRequestAttributes.registeredAt = accountRequest.getRegisteredAt();
accountRequestAttributes.createdAt = accountRequest.getCreatedAt();
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678991008947662077949585 = accountRequestAttributes;
threadMonitoringController.exitInternalAction("_riWrwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678991008947662077949585;
}
finally {
threadMonitoringController.exitService("_riWEsbngEeyIw-dB1KCaVA");
}
}

public static  Builder builder(String email, String institute, String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_riX54bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_riYg8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678994005658049604042341 = new  Builder(email, institute, name);
threadMonitoringController.exitInternalAction("_riYg8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678994005658049604042341;
}
finally {
threadMonitoringController.exitService("_riX54bngEeyIw-dB1KCaVA");
}
}

public  String getRegistrationKey() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_riYg9LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_riZIALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678998005833666348352905 = registrationKey;
threadMonitoringController.exitInternalAction("_riZIALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678998005833666348352905;
}
finally {
threadMonitoringController.exitService("_riYg9LngEeyIw-dB1KCaVA");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_riZIBLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_riZvELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679000007996143449968566 = name;
threadMonitoringController.exitInternalAction("_riZvELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679000007996143449968566;
}
finally {
threadMonitoringController.exitService("_riZIBLngEeyIw-dB1KCaVA");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_riZvFLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_riaWILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679003006420876091540104 = email;
threadMonitoringController.exitInternalAction("_riaWILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679003006420876091540104;
}
finally {
threadMonitoringController.exitService("_riZvFLngEeyIw-dB1KCaVA");
}
}

public  String getInstitute() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_riaWJLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ria9MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679007005414594410067911 = institute;
threadMonitoringController.exitInternalAction("_ria9MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679007005414594410067911;
}
finally {
threadMonitoringController.exitService("_riaWJLngEeyIw-dB1KCaVA");
}
}

public  Instant getRegisteredAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ria9NLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ribkQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679011001277258148989575 = registeredAt;
threadMonitoringController.exitInternalAction("_ribkQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679011001277258148989575;
}
finally {
threadMonitoringController.exitService("_ria9NLngEeyIw-dB1KCaVA");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ricLULngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ricyYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790140089427760786908 = createdAt;
threadMonitoringController.exitInternalAction("_ricyYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790140089427760786908;
}
finally {
threadMonitoringController.exitService("_ricLULngEeyIw-dB1KCaVA");
}
}

public  String getRegistrationUrl() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_ridZcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rifOpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790180001544339731382749 = Config.getFrontEndAppUrl(Const.WebPageURIs.JOIN_PAGE).withIsCreatingAccount("true").withRegistrationKey(this.getRegistrationKey()).toAbsoluteString();
threadMonitoringController.exitInternalAction("_rifOpLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rifOpbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679018009084279119488166 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790180001544339731382749;
threadMonitoringController.exitInternalAction("_rifOpbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679018009084279119488166;
}
finally {
threadMonitoringController.exitService("_ridZcLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rif1srngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rigcwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_rigcwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rihD1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(getEmail()), errors);
threadMonitoringController.exitInternalAction("_rihD1LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_riiR87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(getName()), errors);
threadMonitoringController.exitInternalAction("_riiR87ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_riiR97ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForInstituteName(getInstitute()), errors);
threadMonitoringController.exitInternalAction("_riiR97ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_riiR-LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790290044263565136292193 = errors;
threadMonitoringController.exitInternalAction("_riiR-LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790290044263565136292193;
}
finally {
threadMonitoringController.exitService("_rif1srngEeyIw-dB1KCaVA");
}
}

@Override
public  AccountRequest toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rii5A7ngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
AccountRequest accountRequest = new  AccountRequest(getEmail(), getName(), getInstitute());
threadMonitoringController.enterInternalAction("_rijgELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (this.getRegistrationKey() != null)
{
accountRequest.setRegistrationKey(this.getRegistrationKey());
}
if (this.getCreatedAt() != null)
{
accountRequest.setCreatedAt(this.getCreatedAt());
}
accountRequest.setRegisteredAt(this.getRegisteredAt());
AccountRequest longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679032006976689844990822 = accountRequest;
threadMonitoringController.exitInternalAction("_rijgELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679032006976689844990822;
}
finally {
threadMonitoringController.exitService("_rii5A7ngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rikuMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rikuMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679035007335106593739881 = "[" + AccountRequestAttributes.class.getSimpleName() + "] email: " + getEmail() + " name: " + getName() + " institute: " + getInstitute();
threadMonitoringController.exitInternalAction("_rikuMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679035007335106593739881;
}
finally {
threadMonitoringController.exitService("_rikuMLngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rilVQrngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ril8ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679040009970646280197191 = (this.email + this.name + this.institute).hashCode();
threadMonitoringController.exitInternalAction("_ril8ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679040009970646280197191;
}
finally {
threadMonitoringController.exitService("_rilVQrngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_rimjYbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rinKcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679045007547033227518068 = false;
threadMonitoringController.exitInternalAction("_rinKcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679045007547033227518068;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790450027046058846487375 = true;
threadMonitoringController.exitInternalAction("_rinKcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136790450027046058846487375;
}
else
if (this.getClass() == other.getClass())
{
AccountRequestAttributes otherAccountRequest = (AccountRequestAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679045009714932198009659 = Objects.equals(this.email, otherAccountRequest.email) && Objects.equals(this.institute, otherAccountRequest.institute) && Objects.equals(this.name, otherAccountRequest.name);
threadMonitoringController.exitInternalAction("_rinKcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679045009714932198009659;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679045007716271274088845 = false;
threadMonitoringController.exitInternalAction("_rinKcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679045007716271274088845;
}
}
finally {
threadMonitoringController.exitService("_rimjYbngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rinxgbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
this.institute = SanitizationHelper.sanitizeTitle(institute);
this.name = SanitizationHelper.sanitizeName(name);
this.email = SanitizationHelper.sanitizeEmail(email);
}
finally {
threadMonitoringController.exitService("_rinxgbngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_rioYk7ngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rio_oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.registeredAtOption.ifPresent(s -> registeredAt = s);
threadMonitoringController.exitInternalAction("_rio_oLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rioYk7ngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_ripmsLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ripmsbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367905600617627091830014 = new  UpdateOptions.Builder(email, institute);
threadMonitoringController.exitInternalAction("_ripmsbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367905600617627091830014;
}
finally {
threadMonitoringController.exitService("_ripmsLngEeyIw-dB1KCaVA");
}
}

public static class Builder extends BasicBuilder<AccountRequestAttributes, Builder> {
private final AccountRequestAttributes accountRequestAttributes;

private  Builder(String email, String institute, String name){
super(new  UpdateOptions(email, institute));
thisBuilder = this;
accountRequestAttributes = new  AccountRequestAttributes(email, institute, name);
}
@Override
public  AccountRequestAttributes build() {
accountRequestAttributes.update(updateOptions);
return accountRequestAttributes;
}

}
public static class UpdateOptions {
private String email;

private String institute;

private UpdateOption<Instant> registeredAtOption = UpdateOption.empty();

private  UpdateOptions(String email, String institute){
assert email != null;
assert institute != null;
this.email = email;
this.institute = institute;
}
public  String getEmail() {
return email;
}

public  String getInstitute() {
return institute;
}

@Override
public  String toString() {
return "AccountRequestAttributes.UpdateOptions [" + ", email = " + email + ", institute = " + institute + ", registeredAt = " + registeredAtOption + "]";
}

public static class Builder extends BasicBuilder<UpdateOptions, Builder> {
private  Builder(String email, String institute){
super(new  UpdateOptions(email, institute));
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
public  B withRegisteredAt(Instant registeredAt) {
assert registeredAt != null;
updateOptions.registeredAtOption = UpdateOption.of(registeredAt);
return thisBuilder;
}

public abstract  T build() ;

}
}
