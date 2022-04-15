package teammates.common.util;

import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public final class TimeHelper {
private  TimeHelper(){
}
public static  Instant getInstantDaysOffsetFromNow(long offsetInDays) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("offsetInDays", offsetInDays);
threadMonitoringController.enterService("_b9uyoLvVEeyr6avTgCRLkQ", TimeHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b9x18LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023333008705229165795847 = Instant.now().plus(Duration.ofDays(offsetInDays));
threadMonitoringController.exitInternalAction("_b9x18LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023333008705229165795847;
}
finally {
threadMonitoringController.exitService("_b9uyoLvVEeyr6avTgCRLkQ");
}
}

public static  Instant getInstantDaysOffsetBeforeNow(long offsetInDays) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("offsetInDays", offsetInDays);
threadMonitoringController.enterService("_b90SMLvVEeyr6avTgCRLkQ", TimeHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b938kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023345006326696243271764 = Instant.now().minus(Duration.ofDays(offsetInDays));
threadMonitoringController.exitInternalAction("_b938kLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023345006326696243271764;
}
finally {
threadMonitoringController.exitService("_b90SMLvVEeyr6avTgCRLkQ");
}
}

public static  String formatInstant(Instant instant, String timeZone, String pattern) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instant", instant);
monitoringServiceParameters.addValue("timeZone", timeZone);
monitoringServiceParameters.addValue("pattern", pattern);
threadMonitoringController.enterService("_b96Y0LvVEeyr6avTgCRLkQ", TimeHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b98OALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instant == null || timeZone == null || pattern == null)
{
return "";
}
ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of(timeZone));
String processedPattern = pattern;
if (zonedDateTime.getHour() == 12 && zonedDateTime.getMinute() == 0)
{
processedPattern = pattern.replace("a", "'NOON'");
}
DateTimeFormatter formatter = DateTimeFormatter.ofPattern(processedPattern);
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023361006432009536088031 = zonedDateTime.format(formatter);
threadMonitoringController.exitInternalAction("_b98OALvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023361006432009536088031;
}
finally {
threadMonitoringController.exitService("_b96Y0LvVEeyr6avTgCRLkQ");
}
}

public static  Instant getMidnightAdjustedInstantBasedOnZone(Instant instant, String timeZone, boolean isForward) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instant", instant);
monitoringServiceParameters.addValue("timeZone", timeZone);
monitoringServiceParameters.addValue("isForward", isForward);
threadMonitoringController.enterService("_b-CUoLvVEeyr6avTgCRLkQ", TimeHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_b-EJ0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (isSpecialTime(instant))
{
return instant;
}
ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of(timeZone));
if (isForward && zonedDateTime.getHour() == 23 && zonedDateTime.getMinute() == 59)
{
zonedDateTime = zonedDateTime.plusMinutes(1L);
}
else
if (!isForward && zonedDateTime.getHour() == 0 && zonedDateTime.getMinute() == 0)
{
zonedDateTime = zonedDateTime.minusMinutes(1L);
}
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023373009007845723484157 = zonedDateTime.toInstant();
threadMonitoringController.exitInternalAction("_b-EJ0LvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013023373009007845723484157;
}
finally {
threadMonitoringController.exitService("_b-CUoLvVEeyr6avTgCRLkQ");
}
}

public static  boolean isSpecialTime(Instant instant) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instant", instant);
threadMonitoringController.enterService("_boka8LvVEeyr6avTgCRLkQ", TimeHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bolpELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instant == null)
{
return false;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022864007263981554460226 = instant.equals(Const.TIME_REPRESENTS_FOLLOW_OPENING) || instant.equals(Const.TIME_REPRESENTS_FOLLOW_VISIBLE) || instant.equals(Const.TIME_REPRESENTS_LATER) || instant.equals(Const.TIME_REPRESENTS_NOW);
threadMonitoringController.exitInternalAction("_bolpELvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022864007263981554460226;
}
finally {
threadMonitoringController.exitService("_boka8LvVEeyr6avTgCRLkQ");
}
}

public static  Instant parseInstant(String dateTimeString) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("dateTimeString", dateTimeString);
threadMonitoringController.enterService("_bgYIQLvVEeyr6avTgCRLkQ", TimeHelper.class, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_bgakgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
try {
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022567008775809049036851 = OffsetDateTime.parse(dateTimeString).toInstant();
threadMonitoringController.exitInternalAction("_bgakgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022567008775809049036851;
}
catch(DateTimeParseException e){
assert false : "Date in String is in wrong format.";
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022567005744942027855048 = null;
threadMonitoringController.exitInternalAction("_bgakgLvVEeyr6avTgCRLkQ", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1650013022567005744942027855048;
}
}
finally {
threadMonitoringController.exitService("_bgYIQLvVEeyr6avTgCRLkQ");
}
}

}
