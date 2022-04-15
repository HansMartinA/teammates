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
threadMonitoringController.enterService("_Z0hqcLvVEeyr6avTgCRLkQ", AccountAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4N3oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes accountAttributes = new  AccountAttributes(a.getGoogleId());
accountAttributes.name = a.getName();
accountAttributes.isInstructor = a.isInstructor();
accountAttributes.email = a.getEmail();
accountAttributes.institute = a.getInstitute();
accountAttributes.createdAt = a.getCreatedAt();
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130147220015060660185107777 = accountAttributes;
threadMonitoringController.exitInternalAction("_Z4N3oLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130147220015060660185107777;
}
finally {
threadMonitoringController.exitService("_Z0hqcLvVEeyr6avTgCRLkQ");
}
}

public static  Builder builder(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_Z4lrELvVEeyr6avTgCRLkQ", AccountAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4mSILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014740005679708066399906 = new  Builder(googleId);
threadMonitoringController.exitInternalAction("_Z4mSILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014740005679708066399906;
}
finally {
threadMonitoringController.exitService("_Z4lrELvVEeyr6avTgCRLkQ");
}
}

public  AccountAttributes getCopy() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z4ngQbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4ouYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
AccountAttributes accountAttributes = new  AccountAttributes(this.googleId);
accountAttributes.name = this.name;
accountAttributes.isInstructor = this.isInstructor;
accountAttributes.email = this.email;
accountAttributes.institute = this.institute;
accountAttributes.createdAt = this.createdAt;
AccountAttributes longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014748004663273387167325 = accountAttributes;
threadMonitoringController.exitInternalAction("_Z4ouYLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014748004663273387167325;
}
finally {
threadMonitoringController.exitService("_Z4ngQbvVEeyr6avTgCRLkQ");
}
}

public  boolean isInstructor() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z4qjkLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4qjkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014756008801277145528025 = isInstructor;
threadMonitoringController.exitInternalAction("_Z4qjkbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014756008801277145528025;
}
finally {
threadMonitoringController.exitService("_Z4qjkLvVEeyr6avTgCRLkQ");
}
}

public  void setInstructor(boolean instructor) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instructor", instructor);
threadMonitoringController.enterService("_Z4s_0LvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4tm4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
isInstructor = instructor;
threadMonitoringController.exitInternalAction("_Z4tm4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z4s_0LvVEeyr6avTgCRLkQ");
}
}

public  String getGoogleId() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z4u1ALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4wDILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130147750015475332561565158 = googleId;
threadMonitoringController.exitInternalAction("_Z4wDILvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130147750015475332561565158;
}
finally {
threadMonitoringController.exitService("_Z4u1ALvVEeyr6avTgCRLkQ");
}
}

public  void setGoogleId(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_Z4xRQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4x4ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.googleId = googleId;
threadMonitoringController.exitInternalAction("_Z4x4ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z4xRQLvVEeyr6avTgCRLkQ");
}
}

public  String getName() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z4zGcLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4ztgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014794005433927945315669 = name;
threadMonitoringController.exitInternalAction("_Z4ztgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014794005433927945315669;
}
finally {
threadMonitoringController.exitService("_Z4zGcLvVEeyr6avTgCRLkQ");
}
}

public  void setName(String name) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("name", name);
threadMonitoringController.enterService("_Z41isLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z42w0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = name;
threadMonitoringController.exitInternalAction("_Z42w0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z41isLvVEeyr6avTgCRLkQ");
}
}

public  String getEmail() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z44mALvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z45NELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014813006195775066514931 = email;
threadMonitoringController.exitInternalAction("_Z45NELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014813006195775066514931;
}
finally {
threadMonitoringController.exitService("_Z44mALvVEeyr6avTgCRLkQ");
}
}

public  void setEmail(String email) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("email", email);
threadMonitoringController.enterService("_Z450ILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z46bMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = email;
threadMonitoringController.exitInternalAction("_Z46bMLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z450ILvVEeyr6avTgCRLkQ");
}
}

public  String getInstitute() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z47CQLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z47CQbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014828003292366337226511 = institute;
threadMonitoringController.exitInternalAction("_Z47CQbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014828003292366337226511;
}
finally {
threadMonitoringController.exitService("_Z47CQLvVEeyr6avTgCRLkQ");
}
}

public  void setInstitute(String institute) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("institute", institute);
threadMonitoringController.enterService("_Z48QYLvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z48QYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.institute = institute;
threadMonitoringController.exitInternalAction("_Z48QYbvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z48QYLvVEeyr6avTgCRLkQ");
}
}

public  Instant getCreatedAt() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z483crvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z49egLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014847008334818095106764 = createdAt;
threadMonitoringController.exitInternalAction("_Z49egLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014847008334818095106764;
}
finally {
threadMonitoringController.exitService("_Z483crvVEeyr6avTgCRLkQ");
}
}

public  void setCreatedAt(Instant createdAt) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("createdAt", createdAt);
threadMonitoringController.enterService("_Z4-FkbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4-soLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.createdAt = createdAt;
threadMonitoringController.exitInternalAction("_Z4-soLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z4-FkbvVEeyr6avTgCRLkQ");
}
}

@Override
public  List<String> getInvalidityInfo() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z4_TsbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z4_6wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> errors = new  ArrayList<>();
threadMonitoringController.exitInternalAction("_Z4_6wLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5JEsrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5JrwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForPersonName(name), errors);
threadMonitoringController.exitInternalAction("_Z5JrwLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_Z5JEsrvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5KS1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5K54LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForGoogleId(googleId), errors);
threadMonitoringController.exitInternalAction("_Z5K54LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_Z5KS1LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5Lg9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5Lg9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForEmail(email), errors);
threadMonitoringController.exitInternalAction("_Z5Lg9bvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.exitInternalAction("_Z5Lg9LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5MIB7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5MvELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
addNonEmptyError(FieldValidator.getInvalidityInfoForInstituteName(institute), errors);
threadMonitoringController.exitInternalAction("_Z5MIB7vVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
List<String> longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014902007676175446307673 = errors;
threadMonitoringController.exitInternalAction("_Z5MvELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014902007676175446307673;
}
finally {
threadMonitoringController.exitService("_Z4_TsbvVEeyr6avTgCRLkQ");
}
}

@Override
public  Account toEntity() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z5V5AbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z5WgELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Account longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014908003609247747909532 = new  Account(googleId, name, isInstructor, email, institute);
threadMonitoringController.exitInternalAction("_Z5WgELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014908003609247747909532;
}
finally {
threadMonitoringController.exitService("_Z5V5AbvVEeyr6avTgCRLkQ");
}
}

@Override
public  String toString() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z5XHILvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z5XuNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149150022527143495513435 = JsonUtils.toJson(this, AccountAttributes.class);
threadMonitoringController.exitInternalAction("_Z5XuNLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149150022527143495513435;
}
finally {
threadMonitoringController.exitService("_Z5XHILvVEeyr6avTgCRLkQ");
}
}

@Override
public  int hashCode() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z5YVQbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z5Y8ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
StringBuilder stringBuilder = new  StringBuilder();
stringBuilder.append(this.email).append(this.name).append(this.institute).append(this.googleId);
int longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014922007096818731528932 = stringBuilder.toString().hashCode();
threadMonitoringController.exitInternalAction("_Z5Y8ULvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014922007096818731528932;
}
finally {
threadMonitoringController.exitService("_Z5YVQbvVEeyr6avTgCRLkQ");
}
}

@Override
public  boolean equals(Object other) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("other", other);
threadMonitoringController.enterService("_Z5aKcrvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z5axgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (other == null)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149320020452187335030936 = false;
threadMonitoringController.exitInternalAction("_Z5axgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149320020452187335030936;
}
else
if (this == other)
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014932002123456809971761 = true;
threadMonitoringController.exitInternalAction("_Z5axgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014932002123456809971761;
}
else
if (this.getClass() == other.getClass())
{
AccountAttributes otherAccount = (AccountAttributes) other;
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014932005777879885879491 = Objects.equals(this.email, otherAccount.email) && Objects.equals(this.name, otherAccount.name) && Objects.equals(this.institute, otherAccount.institute) && Objects.equals(this.googleId, otherAccount.googleId);
threadMonitoringController.exitInternalAction("_Z5axgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014932005777879885879491;
}
else
{
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014932008865539658365635 = false;
threadMonitoringController.exitInternalAction("_Z5axgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013014932008865539658365635;
}
}
finally {
threadMonitoringController.exitService("_Z5aKcrvVEeyr6avTgCRLkQ");
}
}

@Override
public  void sanitizeForSaving() {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
threadMonitoringController.enterService("_Z5bYkbvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z5b_pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.googleId = SanitizationHelper.sanitizeGoogleId(googleId);
threadMonitoringController.exitInternalAction("_Z5b_pLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5cmtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.name = SanitizationHelper.sanitizeName(name);
threadMonitoringController.exitInternalAction("_Z5cmtLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5cmubvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.email = SanitizationHelper.sanitizeEmail(email);
threadMonitoringController.exitInternalAction("_Z5cmubvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
threadMonitoringController.enterInternalAction("_Z5dNxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
this.institute = SanitizationHelper.sanitizeTitle(institute);
threadMonitoringController.exitInternalAction("_Z5dNxLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z5bYkbvVEeyr6avTgCRLkQ");
}
}

public  void update(UpdateOptions updateOptions) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("updateOptions", updateOptions);
threadMonitoringController.enterService("_Z5d00rvVEeyr6avTgCRLkQ", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z5eb4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
updateOptions.isInstructorOption.ifPresent(s -> isInstructor = s);
threadMonitoringController.exitInternalAction("_Z5eb4LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_Z5d00rvVEeyr6avTgCRLkQ");
}
}

public static  UpdateOptions.Builder updateOptionsBuilder(String googleId) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("googleId", googleId);
threadMonitoringController.enterService("_Z5fC8LvVEeyr6avTgCRLkQ", AccountAttributes.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_Z5fqALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
UpdateOptions.Builder longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149620022678673899185975 = new  UpdateOptions.Builder(googleId);
threadMonitoringController.exitInternalAction("_Z5fqALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16500130149620022678673899185975;
}
finally {
threadMonitoringController.exitService("_Z5fC8LvVEeyr6avTgCRLkQ");
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
