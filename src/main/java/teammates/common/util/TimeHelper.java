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
threadMonitoringController.enterService("_tapDELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tasGYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819360042778247751875753 = Instant.now().plus(Duration.ofDays(offsetInDays));
threadMonitoringController.exitInternalAction("_tasGYLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819360042778247751875753;
}
finally {
threadMonitoringController.exitService("_tapDELngEeyIw-dB1KCaVA");
}
}

public static  Instant getInstantDaysOffsetBeforeNow(long offsetInDays) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("offsetInDays", offsetInDays);
threadMonitoringController.enterService("_tauioLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_taxl8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681939008089428563514125 = Instant.now().minus(Duration.ofDays(offsetInDays));
threadMonitoringController.exitInternalAction("_taxl8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681939008089428563514125;
}
finally {
threadMonitoringController.exitService("_tauioLngEeyIw-dB1KCaVA");
}
}

public static  String formatInstant(Instant instant, String timeZone, String pattern) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instant", instant);
monitoringServiceParameters.addValue("timeZone", timeZone);
monitoringServiceParameters.addValue("pattern", pattern);
threadMonitoringController.enterService("_ta0CMLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ta13YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681942006525246506257967 = zonedDateTime.format(formatter);
threadMonitoringController.exitInternalAction("_ta13YLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681942006525246506257967;
}
finally {
threadMonitoringController.exitService("_ta0CMLngEeyIw-dB1KCaVA");
}
}

public static  Instant getMidnightAdjustedInstantBasedOnZone(Instant instant, String timeZone, boolean isForward) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instant", instant);
monitoringServiceParameters.addValue("timeZone", timeZone);
monitoringServiceParameters.addValue("isForward", isForward);
threadMonitoringController.enterService("_ta6v4LngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_ta9MILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
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
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819450007577047676198956 = zonedDateTime.toInstant();
threadMonitoringController.exitInternalAction("_ta9MILngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136819450007577047676198956;
}
finally {
threadMonitoringController.exitService("_ta6v4LngEeyIw-dB1KCaVA");
}
}

public static  boolean isSpecialTime(Instant instant) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("instant", instant);
threadMonitoringController.enterService("_tHHqILngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tHI4QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
if (instant == null)
{
return false;
}
boolean longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681826002603056345758349 = instant.equals(Const.TIME_REPRESENTS_FOLLOW_OPENING) || instant.equals(Const.TIME_REPRESENTS_FOLLOW_VISIBLE) || instant.equals(Const.TIME_REPRESENTS_LATER) || instant.equals(Const.TIME_REPRESENTS_NOW);
threadMonitoringController.exitInternalAction("_tHI4QLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681826002603056345758349;
}
finally {
threadMonitoringController.exitService("_tHHqILngEeyIw-dB1KCaVA");
}
}

public static  Instant parseInstant(String dateTimeString) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("dateTimeString", dateTimeString);
threadMonitoringController.enterService("_s_k3sLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_s_nT8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
try {
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681752000966066886241318 = OffsetDateTime.parse(dateTimeString).toInstant();
threadMonitoringController.exitInternalAction("_s_nT8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681752000966066886241318;
}
catch(DateTimeParseException e){
assert false : "Date in String is in wrong format.";
Instant longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817520046615998466461617 = null;
threadMonitoringController.exitInternalAction("_s_nT8LngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136817520046615998466461617;
}
}
finally {
threadMonitoringController.exitService("_s_k3sLngEeyIw-dB1KCaVA");
}
}

}
