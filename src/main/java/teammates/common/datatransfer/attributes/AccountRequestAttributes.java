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
threadMonitoringController.enterService("_Z7dY4LvVEeyr6avTgCRLkQ", AccountRequestAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7d_8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountRequestAttributes accountRequestAttributes = new  AccountRequestAttributes(accountRequest.getEmail(), accountRequest.getInstitute(), accountRequest.getName());
accountRequestAttributes.registrationKey = accountRequest.getRegistrationKey();
accountRequestAttributes.registeredAt = accountRequest.getRegisteredAt();
accountRequestAttributes.createdAt = accountRequest.getCreatedAt();
AccountRequestAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015044009349262512618534 = accountRequestAttributes;
threadMonitoringController.exitInternalAction("_Z7d_8LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015044009349262512618534;
}
finally {
threadMonitoringController.exitService("_Z7dY4LvVEeyr6avTgCRLkQ");
}
}

public static  Builder builder(String email, String institute, String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_Z7enAbvVEeyr6avTgCRLkQ", AccountRequestAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7fOELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015050004856928689202763 = new  Builder(email, institute, name);
threadMonitoringController.exitInternalAction("_Z7fOELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015050004856928689202763;
}
finally {
threadMonitoringController.exitService("_Z7enAbvVEeyr6avTgCRLkQ");
}
}

public  String getRegistrationKey() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7f1ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7gcMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015056007577210500075623 = registrationKey;
threadMonitoringController.exitInternalAction("_Z7gcMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015056007577210500075623;
}
finally {
threadMonitoringController.exitService("_Z7f1ILvVEeyr6avTgCRLkQ");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7hDQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7hDQbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015061005837408720719875 = name;
threadMonitoringController.exitInternalAction("_Z7hDQbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015061005837408720719875;
}
finally {
threadMonitoringController.exitService("_Z7hDQLvVEeyr6avTgCRLkQ");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7hqUbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7hqUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015068006018950234721832 = email;
threadMonitoringController.exitInternalAction("_Z7hqUrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015068006018950234721832;
}
finally {
threadMonitoringController.exitService("_Z7hqUbvVEeyr6avTgCRLkQ");
}
}

public  String getInstitute() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7iRYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7iRYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301507400646352899100445 = institute;
threadMonitoringController.exitInternalAction("_Z7iRYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301507400646352899100445;
}
finally {
threadMonitoringController.exitService("_Z7iRYLvVEeyr6avTgCRLkQ");
}
}

public  Instant getRegisteredAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7i4cbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7i4crvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301508500866607347455062 = registeredAt;
threadMonitoringController.exitInternalAction("_Z7i4crvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301508500866607347455062;
}
finally {
threadMonitoringController.exitService("_Z7i4cbvVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7jfgbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7jfgrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015092004360913017533554 = createdAt;
threadMonitoringController.exitInternalAction("_Z7jfgrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015092004360913017533554;
}
finally {
threadMonitoringController.exitService("_Z7jfgbvVEeyr6avTgCRLkQ");
}
}

public  String getRegistrationUrl() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7kGkbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7l7xLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015102007877311125531252 = Config.getFrontEndAppUrl(Const.WebPageURIs.JOIN_PAGE).withIsCreatingAccount("true").withRegistrationKey(this.getRegistrationKey()).toAbsoluteString();
threadMonitoringController.exitInternalAction("_Z7l7xLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z7l7xbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015102008095297845783527 = longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015102007877311125531252;
threadMonitoringController.exitInternalAction("_Z7l7xbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015102008095297845783527;
}
finally {
threadMonitoringController.exitService("_Z7kGkbvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7mi0bvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7nJ4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_Z7nJ4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z7oYBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(getEmail()), errors);
threadMonitoringController.exitInternalAction("_Z7oYBLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z7pmI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(getName()), errors);
threadMonitoringController.exitInternalAction("_Z7pmI7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z7qNM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForInstituteName(getInstitute()), errors);
threadMonitoringController.exitInternalAction("_Z7qNM7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z7qNNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015122009699867259024163 = errors;
threadMonitoringController.exitInternalAction("_Z7qNNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015122009699867259024163;
}
finally {
threadMonitoringController.exitService("_Z7mi0bvVEeyr6avTgCRLkQ");
}
}

@Override
public  AccountRequest toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7q0QLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
AccountRequest accountRequest = new  AccountRequest(getEmail(), getName(), getInstitute());
threadMonitoringController.enterInternalAction("_Z7rbULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (this.getRegistrationKey() != null)
{
accountRequest.setRegistrationKey(this.getRegistrationKey());
}
if (this.getCreatedAt() != null)
{
accountRequest.setCreatedAt(this.getCreatedAt());
}
accountRequest.setRegisteredAt(this.getRegisteredAt());
AccountRequest longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015129005302841486396949 = accountRequest;
threadMonitoringController.exitInternalAction("_Z7rbULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015129005302841486396949;
}
finally {
threadMonitoringController.exitService("_Z7q0QLvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7sCYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7sCYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015138002756438676085464 = "[" + AccountRequestAttributes.class.getSimpleName() + "] email: " + getEmail() + " name: " + getName() + " institute: " + getInstitute();
threadMonitoringController.exitInternalAction("_Z7sCYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015138002756438676085464;
}
finally {
threadMonitoringController.exitService("_Z7sCYLvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7spcrvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7tQgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130151440068140223239885 = (this.email + this.name + this.institute).hashCode();
threadMonitoringController.exitInternalAction("_Z7tQgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130151440068140223239885;
}
finally {
threadMonitoringController.exitService("_Z7spcrvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_Z7t3kLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7t3kbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130151510010011358224899436 = false;
threadMonitoringController.exitInternalAction("_Z7t3kbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130151510010011358224899436;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301515100983537210045114 = true;
threadMonitoringController.exitInternalAction("_Z7t3kbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301515100983537210045114;
}
else
if (this.getClass() == other.getClass())
{
AccountRequestAttributes otherAccountRequest = (AccountRequestAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301515100152859916213271 = Objects.equals(this.email, otherAccountRequest.email) && Objects.equals(this.institute, otherAccountRequest.institute) && Objects.equals(this.name, otherAccountRequest.name);
threadMonitoringController.exitInternalAction("_Z7t3kbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors165001301515100152859916213271;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130151520013331413591143104 = false;
threadMonitoringController.exitInternalAction("_Z7t3kbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130151520013331413591143104;
}
}
finally {
threadMonitoringController.exitService("_Z7t3kLvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z7vFsLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
this.institute = SanitizationHelper.sanitizeTitle(institute);
this.name = SanitizationHelper.sanitizeName(name);
this.email = SanitizationHelper.sanitizeEmail(email);
}
finally {
threadMonitoringController.exitService("_Z7vFsLvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_Z7xh8LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7yJALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.registeredAtOption.ifPresent(s -> registeredAt = s);
threadMonitoringController.exitInternalAction("_Z7yJALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z7xh8LvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String email, String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_Z7ywELvVEeyr6avTgCRLkQ", AccountRequestAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z7ywEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015171001479834310409197 = new  UpdateOptions.Builder(email, institute);
threadMonitoringController.exitInternalAction("_Z7ywEbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013015171001479834310409197;
}
finally {
threadMonitoringController.exitService("_Z7ywELvVEeyr6avTgCRLkQ");
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
