package teammates.common.util;

import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import teammates.common.datatransfer.logs.LogDetails;
import teammates.common.datatransfer.logs.LogEvent;
import teammates.common.datatransfer.questions.FeedbackQuestionDetails;
import teammates.common.datatransfer.questions.FeedbackQuestionType;
import teammates.common.datatransfer.questions.FeedbackResponseDetails;
public final class JsonUtils {
private  JsonUtils(){
}
private static  Gson getGsonInstance(boolean prettyPrint) {
GsonBuilder builder = new  GsonBuilder().registerTypeAdapter(Instant.class, new  InstantAdapter()).registerTypeAdapter(ZoneId.class, new  ZoneIdAdapter()).registerTypeAdapter(Duration.class, new  DurationMinutesAdapter()).registerTypeAdapter(FeedbackQuestionDetails.class, new  FeedbackQuestionDetailsAdapter()).registerTypeAdapter(FeedbackResponseDetails.class, new  FeedbackResponseDetailsAdapter()).registerTypeAdapter(LogDetails.class, new  LogDetailsAdapter()).disableHtmlEscaping();
if (prettyPrint)
{
builder.setPrettyPrinting();
}
return builder.create();
}

public static  String toJson(Object src, Type typeOfSrc) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("src", src);
monitoringServiceParameters.addValue("typeOfSrc", typeOfSrc);
threadMonitoringController.enterService("_rhr9YLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rhskcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678976008170481183413243 = getGsonInstance(true).toJson(src, typeOfSrc);
threadMonitoringController.exitInternalAction("_rhskcLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713678976008170481183413243;
}
finally {
threadMonitoringController.exitService("_rhr9YLngEeyIw-dB1KCaVA");
}
}

public static  String toJson(Object src) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("src", src);
threadMonitoringController.enterService("_rpLsgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rpMTkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679415007030151797143902 = getGsonInstance(true).toJson(src);
threadMonitoringController.exitInternalAction("_rpMTkLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713679415007030151797143902;
}
finally {
threadMonitoringController.exitService("_rpLsgLngEeyIw-dB1KCaVA");
}
}

public static  String toCompactJson(Object src) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("src", src);
threadMonitoringController.enterService("_tLJOgLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tLLqwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
String longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818430027616280560474815 = getGsonInstance(false).toJson(src);
threadMonitoringController.exitInternalAction("_tLLqwLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818430027616280560474815;
}
finally {
threadMonitoringController.exitService("_tLJOgLngEeyIw-dB1KCaVA");
}
}

public static  void toCompactJson(Object src, Appendable writer) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("src", src);
monitoringServiceParameters.addValue("writer", writer);
threadMonitoringController.enterService("_tLOHALngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tLP8MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
getGsonInstance(false).toJson(src, writer);
threadMonitoringController.exitInternalAction("_tLP8MLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
}
finally {
threadMonitoringController.exitService("_tLOHALngEeyIw-dB1KCaVA");
}
}

public static <T>  T fromJson(String json, Type typeOfT) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("json", json);
monitoringServiceParameters.addValue("typeOfT", typeOfT);
threadMonitoringController.enterService("_tLSYcLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tLU0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
T longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681848009851117626383342 = getGsonInstance(false).fromJson(json, typeOfT);
threadMonitoringController.exitInternalAction("_tLU0sLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors1649713681848009851117626383342;
}
finally {
threadMonitoringController.exitService("_tLSYcLngEeyIw-dB1KCaVA");
}
}

public static <T>  T fromJson(String json, Class<T> classOfT) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("json", json);
monitoringServiceParameters.addValue("classOfT", classOfT);
threadMonitoringController.enterService("_rotycLngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_rouZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
T longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794120025359600885205025 = getGsonInstance(false).fromJson(json, classOfT);
threadMonitoringController.exitInternalAction("_rouZgLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136794120025359600885205025;
}
finally {
threadMonitoringController.exitService("_rotycLngEeyIw-dB1KCaVA");
}
}

public static  JsonElement parse(String json) {
cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController threadMonitoringController = cipm.consistency.bridge.monitoring.controller.ThreadMonitoringController.getInstance();
cipm.consistency.bridge.monitoring.controller.ServiceParameters monitoringServiceParameters = new  cipm.consistency.bridge.monitoring.controller.ServiceParameters();
monitoringServiceParameters.addValue("json", json);
threadMonitoringController.enterService("_tLYfELngEeyIw-dB1KCaVA", this, monitoringServiceParameters);
try {
threadMonitoringController.enterInternalAction("_tLaUQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
JsonElement longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818510003765159386822059 = JsonParser.parseString(json);
threadMonitoringController.exitInternalAction("_tLaUQLngEeyIw-dB1KCaVA", "_oro4gG3fEdy4YaaT-RYrLQ");
return longAndUniqueNameToAvoidDuplicationsAndCompilationErrors16497136818510003765159386822059;
}
finally {
threadMonitoringController.exitService("_tLYfELngEeyIw-dB1KCaVA");
}
}

private static class InstantAdapter implements JsonSerializer<Instant>, JsonDeserializer<Instant> {
@Override
public  JsonElement serialize(Instant instant, Type type, JsonSerializationContext context) {
synchronized (this) {
return new  JsonPrimitive(DateTimeFormatter.ISO_INSTANT.format(instant));
}
}

@Override
public  Instant deserialize(JsonElement element, Type type, JsonDeserializationContext context) {
synchronized (this) {
return Instant.parse(element.getAsString());
}
}

}
private static class ZoneIdAdapter implements JsonSerializer<ZoneId>, JsonDeserializer<ZoneId> {
@Override
public  JsonElement serialize(ZoneId zoneId, Type type, JsonSerializationContext context) {
synchronized (this) {
return new  JsonPrimitive(zoneId.getId());
}
}

@Override
public  ZoneId deserialize(JsonElement element, Type type, JsonDeserializationContext context) {
synchronized (this) {
return ZoneId.of(element.getAsString());
}
}

}
private static class DurationMinutesAdapter implements JsonSerializer<Duration>, JsonDeserializer<Duration> {
@Override
public  JsonElement serialize(Duration duration, Type type, JsonSerializationContext context) {
synchronized (this) {
return new  JsonPrimitive(duration.toMinutes());
}
}

@Override
public  Duration deserialize(JsonElement element, Type type, JsonDeserializationContext context) {
synchronized (this) {
return Duration.ofMinutes(element.getAsLong());
}
}

}
private static class FeedbackResponseDetailsAdapter implements JsonSerializer<FeedbackResponseDetails>, JsonDeserializer<FeedbackResponseDetails> {
@Override
public  JsonElement serialize(FeedbackResponseDetails src, Type typeOfSrc, JsonSerializationContext context) {
return context.serialize(src, src.getQuestionType().getResponseDetailsClass());
}

@Override
public  FeedbackResponseDetails deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
FeedbackQuestionType questionType = FeedbackQuestionType.valueOf(json.getAsJsonObject().get("questionType").getAsString());
return context.deserialize(json, questionType.getResponseDetailsClass());
}

}
private static class FeedbackQuestionDetailsAdapter implements JsonSerializer<FeedbackQuestionDetails>, JsonDeserializer<FeedbackQuestionDetails> {
@Override
public  JsonElement serialize(FeedbackQuestionDetails src, Type typeOfSrc, JsonSerializationContext context) {
return context.serialize(src, src.getQuestionType().getQuestionDetailsClass());
}

@Override
public  FeedbackQuestionDetails deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
FeedbackQuestionType questionType = FeedbackQuestionType.valueOf(json.getAsJsonObject().get("questionType").getAsString());
return context.deserialize(json, questionType.getQuestionDetailsClass());
}

}
private static class LogDetailsAdapter implements JsonSerializer<LogDetails>, JsonDeserializer<LogDetails> {
@Override
public  JsonElement serialize(LogDetails src, Type typeOfSrc, JsonSerializationContext context) {
return context.serialize(src, src.getEvent().getDetailsClass());
}

@Override
public  LogDetails deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
LogEvent event;
if (json.getAsJsonObject().has("event"))
{
try {
event = LogEvent.valueOf(json.getAsJsonObject().get("event").getAsString());
}
catch(IllegalArgumentException e){
event = LogEvent.DEFAULT_LOG;
}
}
else
{
event = LogEvent.DEFAULT_LOG;
}
return context.deserialize(json, event.getDetailsClass());
}

}
}
