package teammates.common.datatransfer.attributes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import teammates.common.util.FieldValidator;
import teammates.common.util.JsonUtils;
import teammates.common.util.SanitizationHelper;
import teammates.storage.entity.Account;
public class AccountAttributes extends EntityAttributes<Account> {
private String googleId;

private String name;

private boolean isInstructor;

private String email;

private String institute;

private Instant createdAt;

private  AccountAttributes(String googleId){
this.googleId = googleId;
}
public static  AccountAttributes valueOf(Account a) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("a", a);
threadMonitoringController.enterService("_rgLhgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgV5kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes accountAttributes = new  AccountAttributes(a.getGoogleId());
accountAttributes.name = a.getName();
accountAttributes.isInstructor = a.isInstructor();
accountAttributes.email = a.getEmail();
accountAttributes.institute = a.getInstitute();
accountAttributes.createdAt = a.getCreatedAt();
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136788480047055815129727663 = accountAttributes;
threadMonitoringController.exitInternalAction("_rgV5kLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136788480047055815129727663;
}
finally {
threadMonitoringController.exitService("_rgLhgLngEeyIw-dB1KCaVA");
}
}

public static  Builder builder(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_rgcAMbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgcnQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678852005919581740106515 = new  Builder(googleId);
threadMonitoringController.exitInternalAction("_rgcnQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678852005919581740106515;
}
finally {
threadMonitoringController.exitService("_rgcAMbngEeyIw-dB1KCaVA");
}
}

public  AccountAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rgdOUbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgdOUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes accountAttributes = new  AccountAttributes(this.googleId);
accountAttributes.name = this.name;
accountAttributes.isInstructor = this.isInstructor;
accountAttributes.email = this.email;
accountAttributes.institute = this.institute;
accountAttributes.createdAt = this.createdAt;
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678857001071720648743727 = accountAttributes;
threadMonitoringController.exitInternalAction("_rgdOUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678857001071720648743727;
}
finally {
threadMonitoringController.exitService("_rgdOUbngEeyIw-dB1KCaVA");
}
}

public  boolean isInstructor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rgeccbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgfDgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136788610004095146938705241 = isInstructor;
threadMonitoringController.exitInternalAction("_rgfDgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136788610004095146938705241;
}
finally {
threadMonitoringController.exitService("_rgeccbngEeyIw-dB1KCaVA");
}
}

public  void setInstructor(boolean instructor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_rgfqkLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgfqkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
isInstructor = instructor;
threadMonitoringController.exitInternalAction("_rgfqkbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rgfqkLngEeyIw-dB1KCaVA");
}
}

public  String getGoogleId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rgg4sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgg4sbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678867005613234011866424 = googleId;
threadMonitoringController.exitInternalAction("_rgg4sbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678867005613234011866424;
}
finally {
threadMonitoringController.exitService("_rgg4sLngEeyIw-dB1KCaVA");
}
}

public  void setGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_rgiG0bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgit4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.googleId = googleId;
threadMonitoringController.exitInternalAction("_rgit4LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rgiG0bngEeyIw-dB1KCaVA");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rgj8AbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgkjELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678875002995679673804318 = name;
threadMonitoringController.exitInternalAction("_rgkjELngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678875002995679673804318;
}
finally {
threadMonitoringController.exitService("_rgj8AbngEeyIw-dB1KCaVA");
}
}

public  void setName(String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_rglxMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rglxMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = name;
threadMonitoringController.exitInternalAction("_rglxMbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rglxMLngEeyIw-dB1KCaVA");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rgmYQrngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgm_ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367888100517278233045186 = email;
threadMonitoringController.exitInternalAction("_rgm_ULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367888100517278233045186;
}
finally {
threadMonitoringController.exitService("_rgmYQrngEeyIw-dB1KCaVA");
}
}

public  void setEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_rgnmYbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgoNcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = email;
threadMonitoringController.exitInternalAction("_rgoNcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rgnmYbngEeyIw-dB1KCaVA");
}
}

public  String getInstitute() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rgo0gbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgo0grngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678895001665785996147271 = institute;
threadMonitoringController.exitInternalAction("_rgo0grngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678895001665785996147271;
}
finally {
threadMonitoringController.exitService("_rgo0gbngEeyIw-dB1KCaVA");
}
}

public  void setInstitute(String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_rgpbkrngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgpbk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.institute = institute;
threadMonitoringController.exitInternalAction("_rgpbk7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rgpbkrngEeyIw-dB1KCaVA");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rgqCorngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgqpsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367890100008032985979643636 = createdAt;
threadMonitoringController.exitInternalAction("_rgqpsLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367890100008032985979643636;
}
finally {
threadMonitoringController.exitService("_rgqCorngEeyIw-dB1KCaVA");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_rgqptLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgrQwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_rgrQwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rgqptLngEeyIw-dB1KCaVA");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rgr30LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rgr30bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_rgr30bngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rgwwUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rgxXYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(name), errors);
threadMonitoringController.exitInternalAction("_rgxXYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rgwwUrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rgx-dLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rgylgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForGoogleId(googleId), errors);
threadMonitoringController.exitInternalAction("_rgylgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rgx-dLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rgzMlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rgzMlbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(email), errors);
threadMonitoringController.exitInternalAction("_rgzMlbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_rgzMlLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rgzzp7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rgzzqLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForInstituteName(institute), errors);
threadMonitoringController.exitInternalAction("_rgzzp7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789260022759643101516935 = errors;
threadMonitoringController.exitInternalAction("_rgzzqLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789260022759643101516935;
}
finally {
threadMonitoringController.exitService("_rgr30LngEeyIw-dB1KCaVA");
}
}

@Override
public  Account toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rg228bngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rg3eALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Account longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789290006830606503089909 = new  Account(googleId, name, isInstructor, email, institute);
threadMonitoringController.exitInternalAction("_rg3eALngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789290006830606503089909;
}
finally {
threadMonitoringController.exitService("_rg228bngEeyIw-dB1KCaVA");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rg4FELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rg4FFbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789320020829509096279653 = JsonUtils.toJson(this, AccountAttributes.class);
threadMonitoringController.exitInternalAction("_rg4FFbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136789320020829509096279653;
}
finally {
threadMonitoringController.exitService("_rg4FELngEeyIw-dB1KCaVA");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rg4sIrngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rg4sI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.email).append(this.name).append(this.institute).append(this.googleId);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367893500802403598468648 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_rg4sI7ngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367893500802403598468648;
}
finally {
threadMonitoringController.exitService("_rg4sIrngEeyIw-dB1KCaVA");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_rg56QbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rg6hULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678940005614673439223399 = false;
threadMonitoringController.exitInternalAction("_rg6hULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678940005614673439223399;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367894000979127213269469 = true;
threadMonitoringController.exitInternalAction("_rg6hULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors164971367894000979127213269469;
}
else
if (this.getClass() == other.getClass())
{
AccountAttributes otherAccount = (AccountAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678940007145690573133504 = Objects.equals(this.email, otherAccount.email) && Objects.equals(this.name, otherAccount.name) && Objects.equals(this.institute, otherAccount.institute) && Objects.equals(this.googleId, otherAccount.googleId);
threadMonitoringController.exitInternalAction("_rg6hULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678940007145690573133504;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678940006640275035016707 = false;
threadMonitoringController.exitInternalAction("_rg6hULngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678940006640275035016707;
}
}
finally {
threadMonitoringController.exitService("_rg56QbngEeyIw-dB1KCaVA");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_rg7IYbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rg7vdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.googleId = SanitizationHelper.sanitizeGoogleId(googleId);
threadMonitoringController.exitInternalAction("_rg7vdLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rg7vebngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = SanitizationHelper.sanitizeName(name);
threadMonitoringController.exitInternalAction("_rg7vebngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rg8WgbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = SanitizationHelper.sanitizeEmail(email);
threadMonitoringController.exitInternalAction("_rg8WgbngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_rg8WhrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
this.institute = SanitizationHelper.sanitizeTitle(institute);
threadMonitoringController.exitInternalAction("_rg8WhrngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rg7IYbngEeyIw-dB1KCaVA");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_rg89kbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rg9koLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.isInstructorOption.ifPresent(s -> isInstructor = s);
threadMonitoringController.exitInternalAction("_rg9koLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_rg89kbngEeyIw-dB1KCaVA");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_rg-LsbngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rg-ywLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678955004372041911672536 = new  UpdateOptions.Builder(googleId);
threadMonitoringController.exitInternalAction("_rg-ywLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678955004372041911672536;
}
finally {
threadMonitoringController.exitService("_rg-LsbngEeyIw-dB1KCaVA");
}
}

public static class Builder extends BasicBuilder<AccountAttributes, Builder> {
private AccountAttributes accountAttributes;

private  Builder(String googleId){
super(new  UpdateOptions(googleId));
thisBuilder = this;
accountAttributes = new  AccountAttributes(googleId);
}
public  Builder withName(String name) {
assert name != null;
accountAttributes.name = name;
return this;
}

public  Builder withEmail(String email) {
assert email != null;
accountAttributes.email = email;
return this;
}

public  Builder withInstitute(String institute) {
assert institute != null;
accountAttributes.institute = institute;
return this;
}

@Override
public  AccountAttributes build() {
accountAttributes.update(updateOptions);
return accountAttributes;
}

}
public static class UpdateOptions {
private String googleId;

private UpdateOption<Boolean> isInstructorOption = UpdateOption.empty();

private  UpdateOptions(String googleId){
assert googleId != null;
this.googleId = googleId;
}
public  String getGoogleId() {
return googleId;
}

@Override
public  String toString() {
return "AccountAttributes.UpdateOptions [" + "googleId = " + googleId + ", isInstructor = " + isInstructorOption + "]";
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
public  B withIsInstructor(boolean isInstructor) {
updateOptions.isInstructorOption = UpdateOption.of(isInstructor);
return thisBuilder;
}

public abstract  T build() ;

}
}
