package com.google.appengine.logging.v1;

public final class RequestLogProto {
private  RequestLogProto(){
}
public static  void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
}

public static  void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
}

static final com.google.protobuf.Descriptors.Descriptor internal_static_google_appengine_logging_v1_LogLine_descriptor;

static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_google_appengine_logging_v1_LogLine_fieldAccessorTable;

static final com.google.protobuf.Descriptors.Descriptor internal_static_google_appengine_logging_v1_SourceLocation_descriptor;

static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_google_appengine_logging_v1_SourceLocation_fieldAccessorTable;

static final com.google.protobuf.Descriptors.Descriptor internal_static_google_appengine_logging_v1_SourceReference_descriptor;

static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_google_appengine_logging_v1_SourceReference_fieldAccessorTable;

static final com.google.protobuf.Descriptors.Descriptor internal_static_google_appengine_logging_v1_RequestLog_descriptor;

static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_google_appengine_logging_v1_RequestLog_fieldAccessorTable;

public static  com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
return descriptor;
}

private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

static {
java.lang.String[]  descriptorData = {"\n-google/appengine/logging/v1/request_lo" + "g.proto\022\033google.appengine.logging.v1\032&go" + "ogle/logging/type/log_severity.proto\032\036go" + "ogle/protobuf/duration.proto\032\037google/pro" + "tobuf/timestamp.proto\"\302\001\n\007LogLine\022(\n\004tim" + "e\030\001 \001(\0132\032.google.protobuf.Timestamp\0222\n\010s" + "everity\030\002 \001(\0162 .google.logging.type.LogS" + "everity\022\023\n\013log_message\030\003 \001(\t\022D\n\017source_l" + "ocation\030\004 \001(\0132+.google.appengine.logging" + ".v1.SourceLocation\"C\n\016SourceLocation\022\014\n\004", "file\030\001 \001(\t\022\014\n\004line\030\002 \001(\003\022\025\n\rfunction_nam" + "e\030\003 \001(\t\":\n\017SourceReference\022\022\n\nrepository" + "\030\001 \001(\t\022\023\n\013revision_id\030\002 \001(\t\"\325\006\n\nRequestL" + "og\022\016\n\006app_id\030\001 \001(\t\022\021\n\tmodule_id\030% \001(\t\022\022\n" + "\nversion_id\030\002 \001(\t\022\022\n\nrequest_id\030\003 \001(\t\022\n\n" + "\002ip\030\004 \001(\t\022.\n\nstart_time\030\006 \001(\0132\032.google.p" + "rotobuf.Timestamp\022,\n\010end_time\030\007 \001(\0132\032.go" + "ogle.protobuf.Timestamp\022*\n\007latency\030\010 \001(\013" + "2\031.google.protobuf.Duration\022\023\n\013mega_cycl" + "es\030\t \001(\003\022\016\n\006method\030\n \001(\t\022\020\n\010resource\030\013 \001", "(\t\022\024\n\014http_version\030\014 \001(\t\022\016\n\006status\030\r \001(\005" + "\022\025\n\rresponse_size\030\016 \001(\003\022\020\n\010referrer\030\017 \001(" + "\t\022\022\n\nuser_agent\030\020 \001(\t\022\020\n\010nickname\030( \001(\t\022" + "\025\n\rurl_map_entry\030\021 \001(\t\022\014\n\004host\030\024 \001(\t\022\014\n\004" + "cost\030\025 \001(\001\022\027\n\017task_queue_name\030\026 \001(\t\022\021\n\tt" + "ask_name\030\027 \001(\t\022\033\n\023was_loading_request\030\030 " + "\001(\010\022/\n\014pending_time\030\031 \001(\0132\031.google.proto" + "buf.Duration\022\026\n\016instance_index\030\032 \001(\005\022\020\n\010" + "finished\030\033 \001(\010\022\r\n\005first\030* \001(\010\022\023\n\013instanc" + "e_id\030\034 \001(\t\0222\n\004line\030\035 \003(\0132$.google.appeng", "ine.logging.v1.LogLine\022\032\n\022app_engine_rel" + "ease\030& \001(\t\022\020\n\010trace_id\030\' \001(\t\022\025\n\rtrace_sa" + "mpled\030+ \001(\010\022F\n\020source_reference\030) \003(\0132,." + "google.appengine.logging.v1.SourceRefere" + "nceBx\n\037com.google.appengine.logging.v1B\017" + "RequestLogProtoP\001ZBgoogle.golang.org/gen" + "proto/googleapis/appengine/logging/v1;lo" + "ggingb\006proto3"};
com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new  com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner(){
public  com.google.protobuf.ExtensionRegistry assignDescriptors(com.google.protobuf.Descriptors.FileDescriptor root) {
descriptor = root;
return null;
}

}
;
com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[]  {com.google.logging.type.LogSeverityProto.getDescriptor(), com.google.protobuf.DurationProto.getDescriptor(), com.google.protobuf.TimestampProto.getDescriptor()}, assigner);
internal_static_google_appengine_logging_v1_LogLine_descriptor = getDescriptor().getMessageTypes().get(0);
internal_static_google_appengine_logging_v1_LogLine_fieldAccessorTable = new  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_google_appengine_logging_v1_LogLine_descriptor, new java.lang.String[]  {"Time", "Severity", "LogMessage", "SourceLocation"});
internal_static_google_appengine_logging_v1_SourceLocation_descriptor = getDescriptor().getMessageTypes().get(1);
internal_static_google_appengine_logging_v1_SourceLocation_fieldAccessorTable = new  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_google_appengine_logging_v1_SourceLocation_descriptor, new java.lang.String[]  {"File", "Line", "FunctionName"});
internal_static_google_appengine_logging_v1_SourceReference_descriptor = getDescriptor().getMessageTypes().get(2);
internal_static_google_appengine_logging_v1_SourceReference_fieldAccessorTable = new  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_google_appengine_logging_v1_SourceReference_descriptor, new java.lang.String[]  {"Repository", "RevisionId"});
internal_static_google_appengine_logging_v1_RequestLog_descriptor = getDescriptor().getMessageTypes().get(3);
internal_static_google_appengine_logging_v1_RequestLog_fieldAccessorTable = new  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(internal_static_google_appengine_logging_v1_RequestLog_descriptor, new java.lang.String[]  {"AppId", "ModuleId", "VersionId", "RequestId", "Ip", "StartTime", "EndTime", "Latency", "MegaCycles", "Method", "Resource", "HttpVersion", "Status", "ResponseSize", "Referrer", "UserAgent", "Nickname", "UrlMapEntry", "Host", "Cost", "TaskQueueName", "TaskName", "WasLoadingRequest", "PendingTime", "InstanceIndex", "Finished", "First", "InstanceId", "Line", "AppEngineRelease", "TraceId", "TraceSampled", "SourceReference"});
com.google.logging.type.LogSeverityProto.getDescriptor();
com.google.protobuf.DurationProto.getDescriptor();
com.google.protobuf.TimestampProto.getDescriptor();
}
}
