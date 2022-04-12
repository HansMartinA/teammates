package com.google.appengine.logging.v1;

public final class RequestLog extends com.google.protobuf.GeneratedMessageV3 implements RequestLogOrBuilder {
private  RequestLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder){
super(builder);
}
private  RequestLog(){
appId_ = "";
moduleId_ = "";
versionId_ = "";
requestId_ = "";
ip_ = "";
megaCycles_ = 0L;
method_ = "";
resource_ = "";
httpVersion_ = "";
status_ = 0;
responseSize_ = 0L;
referrer_ = "";
userAgent_ = "";
nickname_ = "";
urlMapEntry_ = "";
host_ = "";
cost_ = 0.0D;
taskQueueName_ = "";
taskName_ = "";
wasLoadingRequest_ = false;
instanceIndex_ = 0;
finished_ = false;
first_ = false;
instanceId_ = "";
line_ = java.util.Collections.emptyList();
appEngineRelease_ = "";
traceId_ = "";
traceSampled_ = false;
sourceReference_ = java.util.Collections.emptyList();
}
@java.lang.Override
public final  com.google.protobuf.UnknownFieldSet getUnknownFields() {
return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
}

private  RequestLog(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException{
this();
int mutable_bitField0_ = 0;
int mutable_bitField1_ = 0;
try {
boolean done = false;
while (!done)
{
int tag = input.readTag();
switch (tag) {
case 0: done = true;
break;
default: {
if (!input.skipField(tag))
{
done = true;
}
break;
}

case 10: {
java.lang.String s = input.readStringRequireUtf8();
appId_ = s;
break;
}
case 18: {
java.lang.String s = input.readStringRequireUtf8();
versionId_ = s;
break;
}
case 26: {
java.lang.String s = input.readStringRequireUtf8();
requestId_ = s;
break;
}
case 34: {
java.lang.String s = input.readStringRequireUtf8();
ip_ = s;
break;
}
case 50: {
com.google.protobuf.Timestamp.Builder subBuilder = null;
if (startTime_ != null)
{
subBuilder = startTime_.toBuilder();
}
startTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
if (subBuilder != null)
{
subBuilder.mergeFrom(startTime_);
startTime_ = subBuilder.buildPartial();
}
break;
}
case 58: {
com.google.protobuf.Timestamp.Builder subBuilder = null;
if (endTime_ != null)
{
subBuilder = endTime_.toBuilder();
}
endTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
if (subBuilder != null)
{
subBuilder.mergeFrom(endTime_);
endTime_ = subBuilder.buildPartial();
}
break;
}
case 66: {
com.google.protobuf.Duration.Builder subBuilder = null;
if (latency_ != null)
{
subBuilder = latency_.toBuilder();
}
latency_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
if (subBuilder != null)
{
subBuilder.mergeFrom(latency_);
latency_ = subBuilder.buildPartial();
}
break;
}
case 72: {
megaCycles_ = input.readInt64();
break;
}
case 82: {
java.lang.String s = input.readStringRequireUtf8();
method_ = s;
break;
}
case 90: {
java.lang.String s = input.readStringRequireUtf8();
resource_ = s;
break;
}
case 98: {
java.lang.String s = input.readStringRequireUtf8();
httpVersion_ = s;
break;
}
case 104: {
status_ = input.readInt32();
break;
}
case 112: {
responseSize_ = input.readInt64();
break;
}
case 122: {
java.lang.String s = input.readStringRequireUtf8();
referrer_ = s;
break;
}
case 130: {
java.lang.String s = input.readStringRequireUtf8();
userAgent_ = s;
break;
}
case 138: {
java.lang.String s = input.readStringRequireUtf8();
urlMapEntry_ = s;
break;
}
case 162: {
java.lang.String s = input.readStringRequireUtf8();
host_ = s;
break;
}
case 169: {
cost_ = input.readDouble();
break;
}
case 178: {
java.lang.String s = input.readStringRequireUtf8();
taskQueueName_ = s;
break;
}
case 186: {
java.lang.String s = input.readStringRequireUtf8();
taskName_ = s;
break;
}
case 192: {
wasLoadingRequest_ = input.readBool();
break;
}
case 202: {
com.google.protobuf.Duration.Builder subBuilder = null;
if (pendingTime_ != null)
{
subBuilder = pendingTime_.toBuilder();
}
pendingTime_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
if (subBuilder != null)
{
subBuilder.mergeFrom(pendingTime_);
pendingTime_ = subBuilder.buildPartial();
}
break;
}
case 208: {
instanceIndex_ = input.readInt32();
break;
}
case 216: {
finished_ = input.readBool();
break;
}
case 226: {
java.lang.String s = input.readStringRequireUtf8();
instanceId_ = s;
break;
}
case 234: {
if (!((mutable_bitField0_ & 0x10000000) == 0x10000000))
{
line_ = new  java.util.ArrayList<com.google.appengine.logging.v1.LogLine>();
mutable_bitField0_ |= 0x10000000;
}
line_.add(input.readMessage(com.google.appengine.logging.v1.LogLine.parser(), extensionRegistry));
break;
}
case 298: {
java.lang.String s = input.readStringRequireUtf8();
moduleId_ = s;
break;
}
case 306: {
java.lang.String s = input.readStringRequireUtf8();
appEngineRelease_ = s;
break;
}
case 314: {
java.lang.String s = input.readStringRequireUtf8();
traceId_ = s;
break;
}
case 322: {
java.lang.String s = input.readStringRequireUtf8();
nickname_ = s;
break;
}
case 330: {
if (!((mutable_bitField1_ & 0x1) == 0x1))
{
sourceReference_ = new  java.util.ArrayList<com.google.appengine.logging.v1.SourceReference>();
mutable_bitField1_ |= 0x1;
}
sourceReference_.add(input.readMessage(com.google.appengine.logging.v1.SourceReference.parser(), extensionRegistry));
break;
}
case 336: {
first_ = input.readBool();
break;
}
case 344: {
traceSampled_ = input.readBool();
break;
}
}
}
}
catch(com.google.protobuf.InvalidProtocolBufferException e){
throw e.setUnfinishedMessage(this);
}
catch(java.io.IOException e){
throw new  com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
}
finally {
if (((mutable_bitField0_ & 0x10000000) == 0x10000000))
{
line_ = java.util.Collections.unmodifiableList(line_);
}
if (((mutable_bitField1_ & 0x1) == 0x1))
{
sourceReference_ = java.util.Collections.unmodifiableList(sourceReference_);
}
makeExtensionsImmutable();
}
}
public static final  com.google.protobuf.Descriptors.Descriptor getDescriptor() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_RequestLog_descriptor;
}

protected  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_RequestLog_fieldAccessorTable.ensureFieldAccessorsInitialized(com.google.appengine.logging.v1.RequestLog.class, com.google.appengine.logging.v1.RequestLog.Builder.class);
}

private int bitField0_;

public static final int APP_ID_FIELD_NUMBER = 1;

private volatile java.lang.Object appId_;

public  java.lang.String getAppId() {
java.lang.Object ref = appId_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
appId_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getAppIdBytes() {
java.lang.Object ref = appId_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
appId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int MODULE_ID_FIELD_NUMBER = 37;

private volatile java.lang.Object moduleId_;

public  java.lang.String getModuleId() {
java.lang.Object ref = moduleId_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
moduleId_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getModuleIdBytes() {
java.lang.Object ref = moduleId_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
moduleId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int VERSION_ID_FIELD_NUMBER = 2;

private volatile java.lang.Object versionId_;

public  java.lang.String getVersionId() {
java.lang.Object ref = versionId_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
versionId_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getVersionIdBytes() {
java.lang.Object ref = versionId_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
versionId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int REQUEST_ID_FIELD_NUMBER = 3;

private volatile java.lang.Object requestId_;

public  java.lang.String getRequestId() {
java.lang.Object ref = requestId_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
requestId_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getRequestIdBytes() {
java.lang.Object ref = requestId_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
requestId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int IP_FIELD_NUMBER = 4;

private volatile java.lang.Object ip_;

public  java.lang.String getIp() {
java.lang.Object ref = ip_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
ip_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getIpBytes() {
java.lang.Object ref = ip_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
ip_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int START_TIME_FIELD_NUMBER = 6;

private com.google.protobuf.Timestamp startTime_;

public  boolean hasStartTime() {
return startTime_ != null;
}

public  com.google.protobuf.Timestamp getStartTime() {
return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
}

public  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
return getStartTime();
}

public static final int END_TIME_FIELD_NUMBER = 7;

private com.google.protobuf.Timestamp endTime_;

public  boolean hasEndTime() {
return endTime_ != null;
}

public  com.google.protobuf.Timestamp getEndTime() {
return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
}

public  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
return getEndTime();
}

public static final int LATENCY_FIELD_NUMBER = 8;

private com.google.protobuf.Duration latency_;

public  boolean hasLatency() {
return latency_ != null;
}

public  com.google.protobuf.Duration getLatency() {
return latency_ == null ? com.google.protobuf.Duration.getDefaultInstance() : latency_;
}

public  com.google.protobuf.DurationOrBuilder getLatencyOrBuilder() {
return getLatency();
}

public static final int MEGA_CYCLES_FIELD_NUMBER = 9;

private long megaCycles_;

public  long getMegaCycles() {
return megaCycles_;
}

public static final int METHOD_FIELD_NUMBER = 10;

private volatile java.lang.Object method_;

public  java.lang.String getMethod() {
java.lang.Object ref = method_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
method_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getMethodBytes() {
java.lang.Object ref = method_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
method_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int RESOURCE_FIELD_NUMBER = 11;

private volatile java.lang.Object resource_;

public  java.lang.String getResource() {
java.lang.Object ref = resource_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
resource_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getResourceBytes() {
java.lang.Object ref = resource_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
resource_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int HTTP_VERSION_FIELD_NUMBER = 12;

private volatile java.lang.Object httpVersion_;

public  java.lang.String getHttpVersion() {
java.lang.Object ref = httpVersion_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
httpVersion_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getHttpVersionBytes() {
java.lang.Object ref = httpVersion_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
httpVersion_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int STATUS_FIELD_NUMBER = 13;

private int status_;

public  int getStatus() {
return status_;
}

public static final int RESPONSE_SIZE_FIELD_NUMBER = 14;

private long responseSize_;

public  long getResponseSize() {
return responseSize_;
}

public static final int REFERRER_FIELD_NUMBER = 15;

private volatile java.lang.Object referrer_;

public  java.lang.String getReferrer() {
java.lang.Object ref = referrer_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
referrer_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getReferrerBytes() {
java.lang.Object ref = referrer_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
referrer_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int USER_AGENT_FIELD_NUMBER = 16;

private volatile java.lang.Object userAgent_;

public  java.lang.String getUserAgent() {
java.lang.Object ref = userAgent_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
userAgent_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getUserAgentBytes() {
java.lang.Object ref = userAgent_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
userAgent_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int NICKNAME_FIELD_NUMBER = 40;

private volatile java.lang.Object nickname_;

public  java.lang.String getNickname() {
java.lang.Object ref = nickname_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
nickname_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getNicknameBytes() {
java.lang.Object ref = nickname_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
nickname_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int URL_MAP_ENTRY_FIELD_NUMBER = 17;

private volatile java.lang.Object urlMapEntry_;

public  java.lang.String getUrlMapEntry() {
java.lang.Object ref = urlMapEntry_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
urlMapEntry_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getUrlMapEntryBytes() {
java.lang.Object ref = urlMapEntry_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
urlMapEntry_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int HOST_FIELD_NUMBER = 20;

private volatile java.lang.Object host_;

public  java.lang.String getHost() {
java.lang.Object ref = host_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
host_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getHostBytes() {
java.lang.Object ref = host_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
host_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int COST_FIELD_NUMBER = 21;

private double cost_;

public  double getCost() {
return cost_;
}

public static final int TASK_QUEUE_NAME_FIELD_NUMBER = 22;

private volatile java.lang.Object taskQueueName_;

public  java.lang.String getTaskQueueName() {
java.lang.Object ref = taskQueueName_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
taskQueueName_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getTaskQueueNameBytes() {
java.lang.Object ref = taskQueueName_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
taskQueueName_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int TASK_NAME_FIELD_NUMBER = 23;

private volatile java.lang.Object taskName_;

public  java.lang.String getTaskName() {
java.lang.Object ref = taskName_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
taskName_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getTaskNameBytes() {
java.lang.Object ref = taskName_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
taskName_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int WAS_LOADING_REQUEST_FIELD_NUMBER = 24;

private boolean wasLoadingRequest_;

public  boolean getWasLoadingRequest() {
return wasLoadingRequest_;
}

public static final int PENDING_TIME_FIELD_NUMBER = 25;

private com.google.protobuf.Duration pendingTime_;

public  boolean hasPendingTime() {
return pendingTime_ != null;
}

public  com.google.protobuf.Duration getPendingTime() {
return pendingTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : pendingTime_;
}

public  com.google.protobuf.DurationOrBuilder getPendingTimeOrBuilder() {
return getPendingTime();
}

public static final int INSTANCE_INDEX_FIELD_NUMBER = 26;

private int instanceIndex_;

public  int getInstanceIndex() {
return instanceIndex_;
}

public static final int FINISHED_FIELD_NUMBER = 27;

private boolean finished_;

public  boolean getFinished() {
return finished_;
}

public static final int FIRST_FIELD_NUMBER = 42;

private boolean first_;

public  boolean getFirst() {
return first_;
}

public static final int INSTANCE_ID_FIELD_NUMBER = 28;

private volatile java.lang.Object instanceId_;

public  java.lang.String getInstanceId() {
java.lang.Object ref = instanceId_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
instanceId_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getInstanceIdBytes() {
java.lang.Object ref = instanceId_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
instanceId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int LINE_FIELD_NUMBER = 29;

private java.util.List<com.google.appengine.logging.v1.LogLine> line_;

public  java.util.List<com.google.appengine.logging.v1.LogLine> getLineList() {
return line_;
}

public  java.util.List<? extends com.google.appengine.logging.v1.LogLineOrBuilder> getLineOrBuilderList() {
return line_;
}

public  int getLineCount() {
return line_.size();
}

public  com.google.appengine.logging.v1.LogLine getLine(int index) {
return line_.get(index);
}

public  com.google.appengine.logging.v1.LogLineOrBuilder getLineOrBuilder(int index) {
return line_.get(index);
}

public static final int APP_ENGINE_RELEASE_FIELD_NUMBER = 38;

private volatile java.lang.Object appEngineRelease_;

public  java.lang.String getAppEngineRelease() {
java.lang.Object ref = appEngineRelease_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
appEngineRelease_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getAppEngineReleaseBytes() {
java.lang.Object ref = appEngineRelease_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
appEngineRelease_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int TRACE_ID_FIELD_NUMBER = 39;

private volatile java.lang.Object traceId_;

public  java.lang.String getTraceId() {
java.lang.Object ref = traceId_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
traceId_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getTraceIdBytes() {
java.lang.Object ref = traceId_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
traceId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int TRACE_SAMPLED_FIELD_NUMBER = 43;

private boolean traceSampled_;

public  boolean getTraceSampled() {
return traceSampled_;
}

public static final int SOURCE_REFERENCE_FIELD_NUMBER = 41;

private java.util.List<com.google.appengine.logging.v1.SourceReference> sourceReference_;

public  java.util.List<com.google.appengine.logging.v1.SourceReference> getSourceReferenceList() {
return sourceReference_;
}

public  java.util.List<? extends com.google.appengine.logging.v1.SourceReferenceOrBuilder> getSourceReferenceOrBuilderList() {
return sourceReference_;
}

public  int getSourceReferenceCount() {
return sourceReference_.size();
}

public  com.google.appengine.logging.v1.SourceReference getSourceReference(int index) {
return sourceReference_.get(index);
}

public  com.google.appengine.logging.v1.SourceReferenceOrBuilder getSourceReferenceOrBuilder(int index) {
return sourceReference_.get(index);
}

private byte memoizedIsInitialized =  - 1;

public final  boolean isInitialized() {
byte isInitialized = memoizedIsInitialized;
if (isInitialized == 1)
return true;
if (isInitialized == 0)
return false;
memoizedIsInitialized = 1;
return true;
}

public  void writeTo(com.google.protobuf.CodedOutputStream output)throws java.io.IOException {
if (!getAppIdBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appId_);
}
if (!getVersionIdBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 2, versionId_);
}
if (!getRequestIdBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 3, requestId_);
}
if (!getIpBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ip_);
}
if (startTime_ != null)
{
output.writeMessage(6, getStartTime());
}
if (endTime_ != null)
{
output.writeMessage(7, getEndTime());
}
if (latency_ != null)
{
output.writeMessage(8, getLatency());
}
if (megaCycles_ != 0L)
{
output.writeInt64(9, megaCycles_);
}
if (!getMethodBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 10, method_);
}
if (!getResourceBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 11, resource_);
}
if (!getHttpVersionBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 12, httpVersion_);
}
if (status_ != 0)
{
output.writeInt32(13, status_);
}
if (responseSize_ != 0L)
{
output.writeInt64(14, responseSize_);
}
if (!getReferrerBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 15, referrer_);
}
if (!getUserAgentBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 16, userAgent_);
}
if (!getUrlMapEntryBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 17, urlMapEntry_);
}
if (!getHostBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 20, host_);
}
if (cost_ != 0.0D)
{
output.writeDouble(21, cost_);
}
if (!getTaskQueueNameBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 22, taskQueueName_);
}
if (!getTaskNameBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 23, taskName_);
}
if (wasLoadingRequest_ != false)
{
output.writeBool(24, wasLoadingRequest_);
}
if (pendingTime_ != null)
{
output.writeMessage(25, getPendingTime());
}
if (instanceIndex_ != 0)
{
output.writeInt32(26, instanceIndex_);
}
if (finished_ != false)
{
output.writeBool(27, finished_);
}
if (!getInstanceIdBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 28, instanceId_);
}
for (int i = 0 ; i < line_.size() ; i++)
{
output.writeMessage(29, line_.get(i));
}
if (!getModuleIdBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 37, moduleId_);
}
if (!getAppEngineReleaseBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 38, appEngineRelease_);
}
if (!getTraceIdBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 39, traceId_);
}
if (!getNicknameBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 40, nickname_);
}
for (int i = 0 ; i < sourceReference_.size() ; i++)
{
output.writeMessage(41, sourceReference_.get(i));
}
if (first_ != false)
{
output.writeBool(42, first_);
}
if (traceSampled_ != false)
{
output.writeBool(43, traceSampled_);
}
}

public  int getSerializedSize() {
int size = memoizedSize;
if (size !=  - 1)
return size;
size = 0;
if (!getAppIdBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appId_);
}
if (!getVersionIdBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, versionId_);
}
if (!getRequestIdBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, requestId_);
}
if (!getIpBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, ip_);
}
if (startTime_ != null)
{
size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, getStartTime());
}
if (endTime_ != null)
{
size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, getEndTime());
}
if (latency_ != null)
{
size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getLatency());
}
if (megaCycles_ != 0L)
{
size += com.google.protobuf.CodedOutputStream.computeInt64Size(9, megaCycles_);
}
if (!getMethodBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, method_);
}
if (!getResourceBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, resource_);
}
if (!getHttpVersionBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, httpVersion_);
}
if (status_ != 0)
{
size += com.google.protobuf.CodedOutputStream.computeInt32Size(13, status_);
}
if (responseSize_ != 0L)
{
size += com.google.protobuf.CodedOutputStream.computeInt64Size(14, responseSize_);
}
if (!getReferrerBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, referrer_);
}
if (!getUserAgentBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(16, userAgent_);
}
if (!getUrlMapEntryBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(17, urlMapEntry_);
}
if (!getHostBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(20, host_);
}
if (cost_ != 0.0D)
{
size += com.google.protobuf.CodedOutputStream.computeDoubleSize(21, cost_);
}
if (!getTaskQueueNameBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(22, taskQueueName_);
}
if (!getTaskNameBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(23, taskName_);
}
if (wasLoadingRequest_ != false)
{
size += com.google.protobuf.CodedOutputStream.computeBoolSize(24, wasLoadingRequest_);
}
if (pendingTime_ != null)
{
size += com.google.protobuf.CodedOutputStream.computeMessageSize(25, getPendingTime());
}
if (instanceIndex_ != 0)
{
size += com.google.protobuf.CodedOutputStream.computeInt32Size(26, instanceIndex_);
}
if (finished_ != false)
{
size += com.google.protobuf.CodedOutputStream.computeBoolSize(27, finished_);
}
if (!getInstanceIdBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(28, instanceId_);
}
for (int i = 0 ; i < line_.size() ; i++)
{
size += com.google.protobuf.CodedOutputStream.computeMessageSize(29, line_.get(i));
}
if (!getModuleIdBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(37, moduleId_);
}
if (!getAppEngineReleaseBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(38, appEngineRelease_);
}
if (!getTraceIdBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(39, traceId_);
}
if (!getNicknameBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(40, nickname_);
}
for (int i = 0 ; i < sourceReference_.size() ; i++)
{
size += com.google.protobuf.CodedOutputStream.computeMessageSize(41, sourceReference_.get(i));
}
if (first_ != false)
{
size += com.google.protobuf.CodedOutputStream.computeBoolSize(42, first_);
}
if (traceSampled_ != false)
{
size += com.google.protobuf.CodedOutputStream.computeBoolSize(43, traceSampled_);
}
memoizedSize = size;
return size;
}

private static final long serialVersionUID = 0L;

@java.lang.Override
public  boolean equals(final java.lang.Object obj) {
if (obj == this)
{
return true;
}
if (!(obj instanceof com.google.appengine.logging.v1.RequestLog))
{
return super.equals(obj);
}
com.google.appengine.logging.v1.RequestLog other = (com.google.appengine.logging.v1.RequestLog) obj;
boolean result = true;
result = result && getAppId().equals(other.getAppId());
result = result && getModuleId().equals(other.getModuleId());
result = result && getVersionId().equals(other.getVersionId());
result = result && getRequestId().equals(other.getRequestId());
result = result && getIp().equals(other.getIp());
result = result && (hasStartTime() == other.hasStartTime());
if (hasStartTime())
{
result = result && getStartTime().equals(other.getStartTime());
}
result = result && (hasEndTime() == other.hasEndTime());
if (hasEndTime())
{
result = result && getEndTime().equals(other.getEndTime());
}
result = result && (hasLatency() == other.hasLatency());
if (hasLatency())
{
result = result && getLatency().equals(other.getLatency());
}
result = result && (getMegaCycles() == other.getMegaCycles());
result = result && getMethod().equals(other.getMethod());
result = result && getResource().equals(other.getResource());
result = result && getHttpVersion().equals(other.getHttpVersion());
result = result && (getStatus() == other.getStatus());
result = result && (getResponseSize() == other.getResponseSize());
result = result && getReferrer().equals(other.getReferrer());
result = result && getUserAgent().equals(other.getUserAgent());
result = result && getNickname().equals(other.getNickname());
result = result && getUrlMapEntry().equals(other.getUrlMapEntry());
result = result && getHost().equals(other.getHost());
result = result && (java.lang.Double.doubleToLongBits(getCost()) == java.lang.Double.doubleToLongBits(other.getCost()));
result = result && getTaskQueueName().equals(other.getTaskQueueName());
result = result && getTaskName().equals(other.getTaskName());
result = result && (getWasLoadingRequest() == other.getWasLoadingRequest());
result = result && (hasPendingTime() == other.hasPendingTime());
if (hasPendingTime())
{
result = result && getPendingTime().equals(other.getPendingTime());
}
result = result && (getInstanceIndex() == other.getInstanceIndex());
result = result && (getFinished() == other.getFinished());
result = result && (getFirst() == other.getFirst());
result = result && getInstanceId().equals(other.getInstanceId());
result = result && getLineList().equals(other.getLineList());
result = result && getAppEngineRelease().equals(other.getAppEngineRelease());
result = result && getTraceId().equals(other.getTraceId());
result = result && (getTraceSampled() == other.getTraceSampled());
result = result && getSourceReferenceList().equals(other.getSourceReferenceList());
return result;
}

@java.lang.Override
public  int hashCode() {
if (memoizedHashCode != 0)
{
return memoizedHashCode;
}
int hash = 41;
hash = (19 * hash) + getDescriptor().hashCode();
hash = (37 * hash) + APP_ID_FIELD_NUMBER;
hash = (53 * hash) + getAppId().hashCode();
hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
hash = (53 * hash) + getModuleId().hashCode();
hash = (37 * hash) + VERSION_ID_FIELD_NUMBER;
hash = (53 * hash) + getVersionId().hashCode();
hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
hash = (53 * hash) + getRequestId().hashCode();
hash = (37 * hash) + IP_FIELD_NUMBER;
hash = (53 * hash) + getIp().hashCode();
if (hasStartTime())
{
hash = (37 * hash) + START_TIME_FIELD_NUMBER;
hash = (53 * hash) + getStartTime().hashCode();
}
if (hasEndTime())
{
hash = (37 * hash) + END_TIME_FIELD_NUMBER;
hash = (53 * hash) + getEndTime().hashCode();
}
if (hasLatency())
{
hash = (37 * hash) + LATENCY_FIELD_NUMBER;
hash = (53 * hash) + getLatency().hashCode();
}
hash = (37 * hash) + MEGA_CYCLES_FIELD_NUMBER;
hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMegaCycles());
hash = (37 * hash) + METHOD_FIELD_NUMBER;
hash = (53 * hash) + getMethod().hashCode();
hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
hash = (53 * hash) + getResource().hashCode();
hash = (37 * hash) + HTTP_VERSION_FIELD_NUMBER;
hash = (53 * hash) + getHttpVersion().hashCode();
hash = (37 * hash) + STATUS_FIELD_NUMBER;
hash = (53 * hash) + getStatus();
hash = (37 * hash) + RESPONSE_SIZE_FIELD_NUMBER;
hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getResponseSize());
hash = (37 * hash) + REFERRER_FIELD_NUMBER;
hash = (53 * hash) + getReferrer().hashCode();
hash = (37 * hash) + USER_AGENT_FIELD_NUMBER;
hash = (53 * hash) + getUserAgent().hashCode();
hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
hash = (53 * hash) + getNickname().hashCode();
hash = (37 * hash) + URL_MAP_ENTRY_FIELD_NUMBER;
hash = (53 * hash) + getUrlMapEntry().hashCode();
hash = (37 * hash) + HOST_FIELD_NUMBER;
hash = (53 * hash) + getHost().hashCode();
hash = (37 * hash) + COST_FIELD_NUMBER;
hash = (53 * hash) + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getCost()));
hash = (37 * hash) + TASK_QUEUE_NAME_FIELD_NUMBER;
hash = (53 * hash) + getTaskQueueName().hashCode();
hash = (37 * hash) + TASK_NAME_FIELD_NUMBER;
hash = (53 * hash) + getTaskName().hashCode();
hash = (37 * hash) + WAS_LOADING_REQUEST_FIELD_NUMBER;
hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getWasLoadingRequest());
if (hasPendingTime())
{
hash = (37 * hash) + PENDING_TIME_FIELD_NUMBER;
hash = (53 * hash) + getPendingTime().hashCode();
}
hash = (37 * hash) + INSTANCE_INDEX_FIELD_NUMBER;
hash = (53 * hash) + getInstanceIndex();
hash = (37 * hash) + FINISHED_FIELD_NUMBER;
hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getFinished());
hash = (37 * hash) + FIRST_FIELD_NUMBER;
hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getFirst());
hash = (37 * hash) + INSTANCE_ID_FIELD_NUMBER;
hash = (53 * hash) + getInstanceId().hashCode();
if (getLineCount() > 0)
{
hash = (37 * hash) + LINE_FIELD_NUMBER;
hash = (53 * hash) + getLineList().hashCode();
}
hash = (37 * hash) + APP_ENGINE_RELEASE_FIELD_NUMBER;
hash = (53 * hash) + getAppEngineRelease().hashCode();
hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
hash = (53 * hash) + getTraceId().hashCode();
hash = (37 * hash) + TRACE_SAMPLED_FIELD_NUMBER;
hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getTraceSampled());
if (getSourceReferenceCount() > 0)
{
hash = (37 * hash) + SOURCE_REFERENCE_FIELD_NUMBER;
hash = (53 * hash) + getSourceReferenceList().hashCode();
}
hash = (29 * hash) + unknownFields.hashCode();
memoizedHashCode = hash;
return hash;
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(java.nio.ByteBuffer data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(com.google.protobuf.ByteString data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(byte[]  data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(byte[]  data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(java.io.InputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
}

public static  com.google.appengine.logging.v1.RequestLog parseDelimitedFrom(java.io.InputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.RequestLog parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(com.google.protobuf.CodedInputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.RequestLog parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
}

public  Builder newBuilderForType() {
return newBuilder();
}

public static  Builder newBuilder() {
return DEFAULT_INSTANCE.toBuilder();
}

public static  Builder newBuilder(com.google.appengine.logging.v1.RequestLog prototype) {
return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
}

public  Builder toBuilder() {
return this == DEFAULT_INSTANCE ? new  Builder() : new  Builder().mergeFrom(this);
}

@java.lang.Override
protected  Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
Builder builder = new  Builder(parent);
return builder;
}

public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements com.google.appengine.logging.v1.RequestLogOrBuilder {
public static final  com.google.protobuf.Descriptors.Descriptor getDescriptor() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_RequestLog_descriptor;
}

protected  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_RequestLog_fieldAccessorTable.ensureFieldAccessorsInitialized(com.google.appengine.logging.v1.RequestLog.class, com.google.appengine.logging.v1.RequestLog.Builder.class);
}

private  Builder(){
maybeForceBuilderInitialization();
}
private  Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent){
super(parent);
maybeForceBuilderInitialization();
}
private  void maybeForceBuilderInitialization() {
if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders)
{
getLineFieldBuilder();
getSourceReferenceFieldBuilder();
}
}

public  Builder clear() {
super.clear();
appId_ = "";
moduleId_ = "";
versionId_ = "";
requestId_ = "";
ip_ = "";
if (startTimeBuilder_ == null)
{
startTime_ = null;
}
else
{
startTime_ = null;
startTimeBuilder_ = null;
}
if (endTimeBuilder_ == null)
{
endTime_ = null;
}
else
{
endTime_ = null;
endTimeBuilder_ = null;
}
if (latencyBuilder_ == null)
{
latency_ = null;
}
else
{
latency_ = null;
latencyBuilder_ = null;
}
megaCycles_ = 0L;
method_ = "";
resource_ = "";
httpVersion_ = "";
status_ = 0;
responseSize_ = 0L;
referrer_ = "";
userAgent_ = "";
nickname_ = "";
urlMapEntry_ = "";
host_ = "";
cost_ = 0.0D;
taskQueueName_ = "";
taskName_ = "";
wasLoadingRequest_ = false;
if (pendingTimeBuilder_ == null)
{
pendingTime_ = null;
}
else
{
pendingTime_ = null;
pendingTimeBuilder_ = null;
}
instanceIndex_ = 0;
finished_ = false;
first_ = false;
instanceId_ = "";
if (lineBuilder_ == null)
{
line_ = java.util.Collections.emptyList();
bitField0_ = (bitField0_ & ~0x10000000);
}
else
{
lineBuilder_.clear();
}
appEngineRelease_ = "";
traceId_ = "";
traceSampled_ = false;
if (sourceReferenceBuilder_ == null)
{
sourceReference_ = java.util.Collections.emptyList();
bitField1_ = (bitField1_ & ~0x1);
}
else
{
sourceReferenceBuilder_.clear();
}
return this;
}

public  com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_RequestLog_descriptor;
}

public  com.google.appengine.logging.v1.RequestLog getDefaultInstanceForType() {
return com.google.appengine.logging.v1.RequestLog.getDefaultInstance();
}

public  com.google.appengine.logging.v1.RequestLog build() {
com.google.appengine.logging.v1.RequestLog result = buildPartial();
if (!result.isInitialized())
{
throw newUninitializedMessageException(result);
}
return result;
}

public  com.google.appengine.logging.v1.RequestLog buildPartial() {
com.google.appengine.logging.v1.RequestLog result = new  com.google.appengine.logging.v1.RequestLog(this);
int from_bitField0_ = bitField0_;
int from_bitField1_ = bitField1_;
int to_bitField0_ = 0;
result.appId_ = appId_;
result.moduleId_ = moduleId_;
result.versionId_ = versionId_;
result.requestId_ = requestId_;
result.ip_ = ip_;
if (startTimeBuilder_ == null)
{
result.startTime_ = startTime_;
}
else
{
result.startTime_ = startTimeBuilder_.build();
}
if (endTimeBuilder_ == null)
{
result.endTime_ = endTime_;
}
else
{
result.endTime_ = endTimeBuilder_.build();
}
if (latencyBuilder_ == null)
{
result.latency_ = latency_;
}
else
{
result.latency_ = latencyBuilder_.build();
}
result.megaCycles_ = megaCycles_;
result.method_ = method_;
result.resource_ = resource_;
result.httpVersion_ = httpVersion_;
result.status_ = status_;
result.responseSize_ = responseSize_;
result.referrer_ = referrer_;
result.userAgent_ = userAgent_;
result.nickname_ = nickname_;
result.urlMapEntry_ = urlMapEntry_;
result.host_ = host_;
result.cost_ = cost_;
result.taskQueueName_ = taskQueueName_;
result.taskName_ = taskName_;
result.wasLoadingRequest_ = wasLoadingRequest_;
if (pendingTimeBuilder_ == null)
{
result.pendingTime_ = pendingTime_;
}
else
{
result.pendingTime_ = pendingTimeBuilder_.build();
}
result.instanceIndex_ = instanceIndex_;
result.finished_ = finished_;
result.first_ = first_;
result.instanceId_ = instanceId_;
if (lineBuilder_ == null)
{
if (((bitField0_ & 0x10000000) == 0x10000000))
{
line_ = java.util.Collections.unmodifiableList(line_);
bitField0_ = (bitField0_ & ~0x10000000);
}
result.line_ = line_;
}
else
{
result.line_ = lineBuilder_.build();
}
result.appEngineRelease_ = appEngineRelease_;
result.traceId_ = traceId_;
result.traceSampled_ = traceSampled_;
if (sourceReferenceBuilder_ == null)
{
if (((bitField1_ & 0x1) == 0x1))
{
sourceReference_ = java.util.Collections.unmodifiableList(sourceReference_);
bitField1_ = (bitField1_ & ~0x1);
}
result.sourceReference_ = sourceReference_;
}
else
{
result.sourceReference_ = sourceReferenceBuilder_.build();
}
result.bitField0_ = to_bitField0_;
onBuilt();
return result;
}

public  Builder clone() {
return (Builder) super.clone();
}

public  Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
return (Builder) super.setField(field, value);
}

public  Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
return (Builder) super.clearField(field);
}

public  Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
return (Builder) super.clearOneof(oneof);
}

public  Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
return (Builder) super.setRepeatedField(field, index, value);
}

public  Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
return (Builder) super.addRepeatedField(field, value);
}

public  Builder mergeFrom(com.google.protobuf.Message other) {
if (other instanceof com.google.appengine.logging.v1.RequestLog)
{
return mergeFrom((com.google.appengine.logging.v1.RequestLog) other);
}
else
{
super.mergeFrom(other);
return this;
}
}

public  Builder mergeFrom(com.google.appengine.logging.v1.RequestLog other) {
if (other == com.google.appengine.logging.v1.RequestLog.getDefaultInstance())
return this;
if (!other.getAppId().isEmpty())
{
appId_ = other.appId_;
onChanged();
}
if (!other.getModuleId().isEmpty())
{
moduleId_ = other.moduleId_;
onChanged();
}
if (!other.getVersionId().isEmpty())
{
versionId_ = other.versionId_;
onChanged();
}
if (!other.getRequestId().isEmpty())
{
requestId_ = other.requestId_;
onChanged();
}
if (!other.getIp().isEmpty())
{
ip_ = other.ip_;
onChanged();
}
if (other.hasStartTime())
{
mergeStartTime(other.getStartTime());
}
if (other.hasEndTime())
{
mergeEndTime(other.getEndTime());
}
if (other.hasLatency())
{
mergeLatency(other.getLatency());
}
if (other.getMegaCycles() != 0L)
{
setMegaCycles(other.getMegaCycles());
}
if (!other.getMethod().isEmpty())
{
method_ = other.method_;
onChanged();
}
if (!other.getResource().isEmpty())
{
resource_ = other.resource_;
onChanged();
}
if (!other.getHttpVersion().isEmpty())
{
httpVersion_ = other.httpVersion_;
onChanged();
}
if (other.getStatus() != 0)
{
setStatus(other.getStatus());
}
if (other.getResponseSize() != 0L)
{
setResponseSize(other.getResponseSize());
}
if (!other.getReferrer().isEmpty())
{
referrer_ = other.referrer_;
onChanged();
}
if (!other.getUserAgent().isEmpty())
{
userAgent_ = other.userAgent_;
onChanged();
}
if (!other.getNickname().isEmpty())
{
nickname_ = other.nickname_;
onChanged();
}
if (!other.getUrlMapEntry().isEmpty())
{
urlMapEntry_ = other.urlMapEntry_;
onChanged();
}
if (!other.getHost().isEmpty())
{
host_ = other.host_;
onChanged();
}
if (other.getCost() != 0.0D)
{
setCost(other.getCost());
}
if (!other.getTaskQueueName().isEmpty())
{
taskQueueName_ = other.taskQueueName_;
onChanged();
}
if (!other.getTaskName().isEmpty())
{
taskName_ = other.taskName_;
onChanged();
}
if (other.getWasLoadingRequest() != false)
{
setWasLoadingRequest(other.getWasLoadingRequest());
}
if (other.hasPendingTime())
{
mergePendingTime(other.getPendingTime());
}
if (other.getInstanceIndex() != 0)
{
setInstanceIndex(other.getInstanceIndex());
}
if (other.getFinished() != false)
{
setFinished(other.getFinished());
}
if (other.getFirst() != false)
{
setFirst(other.getFirst());
}
if (!other.getInstanceId().isEmpty())
{
instanceId_ = other.instanceId_;
onChanged();
}
if (lineBuilder_ == null)
{
if (!other.line_.isEmpty())
{
if (line_.isEmpty())
{
line_ = other.line_;
bitField0_ = (bitField0_ & ~0x10000000);
}
else
{
ensureLineIsMutable();
line_.addAll(other.line_);
}
onChanged();
}
}
else
{
if (!other.line_.isEmpty())
{
if (lineBuilder_.isEmpty())
{
lineBuilder_.dispose();
lineBuilder_ = null;
line_ = other.line_;
bitField0_ = (bitField0_ & ~0x10000000);
lineBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getLineFieldBuilder() : null;
}
else
{
lineBuilder_.addAllMessages(other.line_);
}
}
}
if (!other.getAppEngineRelease().isEmpty())
{
appEngineRelease_ = other.appEngineRelease_;
onChanged();
}
if (!other.getTraceId().isEmpty())
{
traceId_ = other.traceId_;
onChanged();
}
if (other.getTraceSampled() != false)
{
setTraceSampled(other.getTraceSampled());
}
if (sourceReferenceBuilder_ == null)
{
if (!other.sourceReference_.isEmpty())
{
if (sourceReference_.isEmpty())
{
sourceReference_ = other.sourceReference_;
bitField1_ = (bitField1_ & ~0x1);
}
else
{
ensureSourceReferenceIsMutable();
sourceReference_.addAll(other.sourceReference_);
}
onChanged();
}
}
else
{
if (!other.sourceReference_.isEmpty())
{
if (sourceReferenceBuilder_.isEmpty())
{
sourceReferenceBuilder_.dispose();
sourceReferenceBuilder_ = null;
sourceReference_ = other.sourceReference_;
bitField1_ = (bitField1_ & ~0x1);
sourceReferenceBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getSourceReferenceFieldBuilder() : null;
}
else
{
sourceReferenceBuilder_.addAllMessages(other.sourceReference_);
}
}
}
onChanged();
return this;
}

public final  boolean isInitialized() {
return true;
}

public  Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
com.google.appengine.logging.v1.RequestLog parsedMessage = null;
try {
parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
}
catch(com.google.protobuf.InvalidProtocolBufferException e){
parsedMessage = (com.google.appengine.logging.v1.RequestLog) e.getUnfinishedMessage();
throw e.unwrapIOException();
}
finally {
if (parsedMessage != null)
{
mergeFrom(parsedMessage);
}
}
return this;
}

private int bitField0_;

private int bitField1_;

private java.lang.Object appId_ = "";

public  java.lang.String getAppId() {
java.lang.Object ref = appId_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
appId_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getAppIdBytes() {
java.lang.Object ref = appId_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
appId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setAppId(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
appId_ = value;
onChanged();
return this;
}

public  Builder clearAppId() {
appId_ = getDefaultInstance().getAppId();
onChanged();
return this;
}

public  Builder setAppIdBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
appId_ = value;
onChanged();
return this;
}

private java.lang.Object moduleId_ = "";

public  java.lang.String getModuleId() {
java.lang.Object ref = moduleId_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
moduleId_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getModuleIdBytes() {
java.lang.Object ref = moduleId_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
moduleId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setModuleId(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
moduleId_ = value;
onChanged();
return this;
}

public  Builder clearModuleId() {
moduleId_ = getDefaultInstance().getModuleId();
onChanged();
return this;
}

public  Builder setModuleIdBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
moduleId_ = value;
onChanged();
return this;
}

private java.lang.Object versionId_ = "";

public  java.lang.String getVersionId() {
java.lang.Object ref = versionId_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
versionId_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getVersionIdBytes() {
java.lang.Object ref = versionId_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
versionId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setVersionId(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
versionId_ = value;
onChanged();
return this;
}

public  Builder clearVersionId() {
versionId_ = getDefaultInstance().getVersionId();
onChanged();
return this;
}

public  Builder setVersionIdBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
versionId_ = value;
onChanged();
return this;
}

private java.lang.Object requestId_ = "";

public  java.lang.String getRequestId() {
java.lang.Object ref = requestId_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
requestId_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getRequestIdBytes() {
java.lang.Object ref = requestId_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
requestId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setRequestId(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
requestId_ = value;
onChanged();
return this;
}

public  Builder clearRequestId() {
requestId_ = getDefaultInstance().getRequestId();
onChanged();
return this;
}

public  Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
requestId_ = value;
onChanged();
return this;
}

private java.lang.Object ip_ = "";

public  java.lang.String getIp() {
java.lang.Object ref = ip_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
ip_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getIpBytes() {
java.lang.Object ref = ip_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
ip_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setIp(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
ip_ = value;
onChanged();
return this;
}

public  Builder clearIp() {
ip_ = getDefaultInstance().getIp();
onChanged();
return this;
}

public  Builder setIpBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
ip_ = value;
onChanged();
return this;
}

private com.google.protobuf.Timestamp startTime_ = null;

private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;

public  boolean hasStartTime() {
return startTimeBuilder_ != null || startTime_ != null;
}

public  com.google.protobuf.Timestamp getStartTime() {
if (startTimeBuilder_ == null)
{
return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
}
else
{
return startTimeBuilder_.getMessage();
}
}

public  Builder setStartTime(com.google.protobuf.Timestamp value) {
if (startTimeBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
startTime_ = value;
onChanged();
}
else
{
startTimeBuilder_.setMessage(value);
}
return this;
}

public  Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
if (startTimeBuilder_ == null)
{
startTime_ = builderForValue.build();
onChanged();
}
else
{
startTimeBuilder_.setMessage(builderForValue.build());
}
return this;
}

public  Builder mergeStartTime(com.google.protobuf.Timestamp value) {
if (startTimeBuilder_ == null)
{
if (startTime_ != null)
{
startTime_ = com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
}
else
{
startTime_ = value;
}
onChanged();
}
else
{
startTimeBuilder_.mergeFrom(value);
}
return this;
}

public  Builder clearStartTime() {
if (startTimeBuilder_ == null)
{
startTime_ = null;
onChanged();
}
else
{
startTime_ = null;
startTimeBuilder_ = null;
}
return this;
}

public  com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
onChanged();
return getStartTimeFieldBuilder().getBuilder();
}

public  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
if (startTimeBuilder_ != null)
{
return startTimeBuilder_.getMessageOrBuilder();
}
else
{
return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
}
}

private  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> getStartTimeFieldBuilder() {
if (startTimeBuilder_ == null)
{
startTimeBuilder_ = new  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(getStartTime(), getParentForChildren(), isClean());
startTime_ = null;
}
return startTimeBuilder_;
}

private com.google.protobuf.Timestamp endTime_ = null;

private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endTimeBuilder_;

public  boolean hasEndTime() {
return endTimeBuilder_ != null || endTime_ != null;
}

public  com.google.protobuf.Timestamp getEndTime() {
if (endTimeBuilder_ == null)
{
return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
}
else
{
return endTimeBuilder_.getMessage();
}
}

public  Builder setEndTime(com.google.protobuf.Timestamp value) {
if (endTimeBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
endTime_ = value;
onChanged();
}
else
{
endTimeBuilder_.setMessage(value);
}
return this;
}

public  Builder setEndTime(com.google.protobuf.Timestamp.Builder builderForValue) {
if (endTimeBuilder_ == null)
{
endTime_ = builderForValue.build();
onChanged();
}
else
{
endTimeBuilder_.setMessage(builderForValue.build());
}
return this;
}

public  Builder mergeEndTime(com.google.protobuf.Timestamp value) {
if (endTimeBuilder_ == null)
{
if (endTime_ != null)
{
endTime_ = com.google.protobuf.Timestamp.newBuilder(endTime_).mergeFrom(value).buildPartial();
}
else
{
endTime_ = value;
}
onChanged();
}
else
{
endTimeBuilder_.mergeFrom(value);
}
return this;
}

public  Builder clearEndTime() {
if (endTimeBuilder_ == null)
{
endTime_ = null;
onChanged();
}
else
{
endTime_ = null;
endTimeBuilder_ = null;
}
return this;
}

public  com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {
onChanged();
return getEndTimeFieldBuilder().getBuilder();
}

public  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
if (endTimeBuilder_ != null)
{
return endTimeBuilder_.getMessageOrBuilder();
}
else
{
return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
}
}

private  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> getEndTimeFieldBuilder() {
if (endTimeBuilder_ == null)
{
endTimeBuilder_ = new  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(getEndTime(), getParentForChildren(), isClean());
endTime_ = null;
}
return endTimeBuilder_;
}

private com.google.protobuf.Duration latency_ = null;

private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> latencyBuilder_;

public  boolean hasLatency() {
return latencyBuilder_ != null || latency_ != null;
}

public  com.google.protobuf.Duration getLatency() {
if (latencyBuilder_ == null)
{
return latency_ == null ? com.google.protobuf.Duration.getDefaultInstance() : latency_;
}
else
{
return latencyBuilder_.getMessage();
}
}

public  Builder setLatency(com.google.protobuf.Duration value) {
if (latencyBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
latency_ = value;
onChanged();
}
else
{
latencyBuilder_.setMessage(value);
}
return this;
}

public  Builder setLatency(com.google.protobuf.Duration.Builder builderForValue) {
if (latencyBuilder_ == null)
{
latency_ = builderForValue.build();
onChanged();
}
else
{
latencyBuilder_.setMessage(builderForValue.build());
}
return this;
}

public  Builder mergeLatency(com.google.protobuf.Duration value) {
if (latencyBuilder_ == null)
{
if (latency_ != null)
{
latency_ = com.google.protobuf.Duration.newBuilder(latency_).mergeFrom(value).buildPartial();
}
else
{
latency_ = value;
}
onChanged();
}
else
{
latencyBuilder_.mergeFrom(value);
}
return this;
}

public  Builder clearLatency() {
if (latencyBuilder_ == null)
{
latency_ = null;
onChanged();
}
else
{
latency_ = null;
latencyBuilder_ = null;
}
return this;
}

public  com.google.protobuf.Duration.Builder getLatencyBuilder() {
onChanged();
return getLatencyFieldBuilder().getBuilder();
}

public  com.google.protobuf.DurationOrBuilder getLatencyOrBuilder() {
if (latencyBuilder_ != null)
{
return latencyBuilder_.getMessageOrBuilder();
}
else
{
return latency_ == null ? com.google.protobuf.Duration.getDefaultInstance() : latency_;
}
}

private  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> getLatencyFieldBuilder() {
if (latencyBuilder_ == null)
{
latencyBuilder_ = new  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(getLatency(), getParentForChildren(), isClean());
latency_ = null;
}
return latencyBuilder_;
}

private long megaCycles_;

public  long getMegaCycles() {
return megaCycles_;
}

public  Builder setMegaCycles(long value) {
megaCycles_ = value;
onChanged();
return this;
}

public  Builder clearMegaCycles() {
megaCycles_ = 0L;
onChanged();
return this;
}

private java.lang.Object method_ = "";

public  java.lang.String getMethod() {
java.lang.Object ref = method_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
method_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getMethodBytes() {
java.lang.Object ref = method_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
method_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setMethod(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
method_ = value;
onChanged();
return this;
}

public  Builder clearMethod() {
method_ = getDefaultInstance().getMethod();
onChanged();
return this;
}

public  Builder setMethodBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
method_ = value;
onChanged();
return this;
}

private java.lang.Object resource_ = "";

public  java.lang.String getResource() {
java.lang.Object ref = resource_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
resource_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getResourceBytes() {
java.lang.Object ref = resource_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
resource_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setResource(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
resource_ = value;
onChanged();
return this;
}

public  Builder clearResource() {
resource_ = getDefaultInstance().getResource();
onChanged();
return this;
}

public  Builder setResourceBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
resource_ = value;
onChanged();
return this;
}

private java.lang.Object httpVersion_ = "";

public  java.lang.String getHttpVersion() {
java.lang.Object ref = httpVersion_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
httpVersion_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getHttpVersionBytes() {
java.lang.Object ref = httpVersion_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
httpVersion_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setHttpVersion(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
httpVersion_ = value;
onChanged();
return this;
}

public  Builder clearHttpVersion() {
httpVersion_ = getDefaultInstance().getHttpVersion();
onChanged();
return this;
}

public  Builder setHttpVersionBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
httpVersion_ = value;
onChanged();
return this;
}

private int status_;

public  int getStatus() {
return status_;
}

public  Builder setStatus(int value) {
status_ = value;
onChanged();
return this;
}

public  Builder clearStatus() {
status_ = 0;
onChanged();
return this;
}

private long responseSize_;

public  long getResponseSize() {
return responseSize_;
}

public  Builder setResponseSize(long value) {
responseSize_ = value;
onChanged();
return this;
}

public  Builder clearResponseSize() {
responseSize_ = 0L;
onChanged();
return this;
}

private java.lang.Object referrer_ = "";

public  java.lang.String getReferrer() {
java.lang.Object ref = referrer_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
referrer_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getReferrerBytes() {
java.lang.Object ref = referrer_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
referrer_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setReferrer(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
referrer_ = value;
onChanged();
return this;
}

public  Builder clearReferrer() {
referrer_ = getDefaultInstance().getReferrer();
onChanged();
return this;
}

public  Builder setReferrerBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
referrer_ = value;
onChanged();
return this;
}

private java.lang.Object userAgent_ = "";

public  java.lang.String getUserAgent() {
java.lang.Object ref = userAgent_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
userAgent_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getUserAgentBytes() {
java.lang.Object ref = userAgent_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
userAgent_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setUserAgent(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
userAgent_ = value;
onChanged();
return this;
}

public  Builder clearUserAgent() {
userAgent_ = getDefaultInstance().getUserAgent();
onChanged();
return this;
}

public  Builder setUserAgentBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
userAgent_ = value;
onChanged();
return this;
}

private java.lang.Object nickname_ = "";

public  java.lang.String getNickname() {
java.lang.Object ref = nickname_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
nickname_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getNicknameBytes() {
java.lang.Object ref = nickname_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
nickname_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setNickname(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
nickname_ = value;
onChanged();
return this;
}

public  Builder clearNickname() {
nickname_ = getDefaultInstance().getNickname();
onChanged();
return this;
}

public  Builder setNicknameBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
nickname_ = value;
onChanged();
return this;
}

private java.lang.Object urlMapEntry_ = "";

public  java.lang.String getUrlMapEntry() {
java.lang.Object ref = urlMapEntry_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
urlMapEntry_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getUrlMapEntryBytes() {
java.lang.Object ref = urlMapEntry_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
urlMapEntry_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setUrlMapEntry(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
urlMapEntry_ = value;
onChanged();
return this;
}

public  Builder clearUrlMapEntry() {
urlMapEntry_ = getDefaultInstance().getUrlMapEntry();
onChanged();
return this;
}

public  Builder setUrlMapEntryBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
urlMapEntry_ = value;
onChanged();
return this;
}

private java.lang.Object host_ = "";

public  java.lang.String getHost() {
java.lang.Object ref = host_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
host_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getHostBytes() {
java.lang.Object ref = host_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
host_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setHost(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
host_ = value;
onChanged();
return this;
}

public  Builder clearHost() {
host_ = getDefaultInstance().getHost();
onChanged();
return this;
}

public  Builder setHostBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
host_ = value;
onChanged();
return this;
}

private double cost_;

public  double getCost() {
return cost_;
}

public  Builder setCost(double value) {
cost_ = value;
onChanged();
return this;
}

public  Builder clearCost() {
cost_ = 0.0D;
onChanged();
return this;
}

private java.lang.Object taskQueueName_ = "";

public  java.lang.String getTaskQueueName() {
java.lang.Object ref = taskQueueName_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
taskQueueName_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getTaskQueueNameBytes() {
java.lang.Object ref = taskQueueName_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
taskQueueName_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setTaskQueueName(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
taskQueueName_ = value;
onChanged();
return this;
}

public  Builder clearTaskQueueName() {
taskQueueName_ = getDefaultInstance().getTaskQueueName();
onChanged();
return this;
}

public  Builder setTaskQueueNameBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
taskQueueName_ = value;
onChanged();
return this;
}

private java.lang.Object taskName_ = "";

public  java.lang.String getTaskName() {
java.lang.Object ref = taskName_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
taskName_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getTaskNameBytes() {
java.lang.Object ref = taskName_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
taskName_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setTaskName(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
taskName_ = value;
onChanged();
return this;
}

public  Builder clearTaskName() {
taskName_ = getDefaultInstance().getTaskName();
onChanged();
return this;
}

public  Builder setTaskNameBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
taskName_ = value;
onChanged();
return this;
}

private boolean wasLoadingRequest_;

public  boolean getWasLoadingRequest() {
return wasLoadingRequest_;
}

public  Builder setWasLoadingRequest(boolean value) {
wasLoadingRequest_ = value;
onChanged();
return this;
}

public  Builder clearWasLoadingRequest() {
wasLoadingRequest_ = false;
onChanged();
return this;
}

private com.google.protobuf.Duration pendingTime_ = null;

private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> pendingTimeBuilder_;

public  boolean hasPendingTime() {
return pendingTimeBuilder_ != null || pendingTime_ != null;
}

public  com.google.protobuf.Duration getPendingTime() {
if (pendingTimeBuilder_ == null)
{
return pendingTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : pendingTime_;
}
else
{
return pendingTimeBuilder_.getMessage();
}
}

public  Builder setPendingTime(com.google.protobuf.Duration value) {
if (pendingTimeBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
pendingTime_ = value;
onChanged();
}
else
{
pendingTimeBuilder_.setMessage(value);
}
return this;
}

public  Builder setPendingTime(com.google.protobuf.Duration.Builder builderForValue) {
if (pendingTimeBuilder_ == null)
{
pendingTime_ = builderForValue.build();
onChanged();
}
else
{
pendingTimeBuilder_.setMessage(builderForValue.build());
}
return this;
}

public  Builder mergePendingTime(com.google.protobuf.Duration value) {
if (pendingTimeBuilder_ == null)
{
if (pendingTime_ != null)
{
pendingTime_ = com.google.protobuf.Duration.newBuilder(pendingTime_).mergeFrom(value).buildPartial();
}
else
{
pendingTime_ = value;
}
onChanged();
}
else
{
pendingTimeBuilder_.mergeFrom(value);
}
return this;
}

public  Builder clearPendingTime() {
if (pendingTimeBuilder_ == null)
{
pendingTime_ = null;
onChanged();
}
else
{
pendingTime_ = null;
pendingTimeBuilder_ = null;
}
return this;
}

public  com.google.protobuf.Duration.Builder getPendingTimeBuilder() {
onChanged();
return getPendingTimeFieldBuilder().getBuilder();
}

public  com.google.protobuf.DurationOrBuilder getPendingTimeOrBuilder() {
if (pendingTimeBuilder_ != null)
{
return pendingTimeBuilder_.getMessageOrBuilder();
}
else
{
return pendingTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : pendingTime_;
}
}

private  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> getPendingTimeFieldBuilder() {
if (pendingTimeBuilder_ == null)
{
pendingTimeBuilder_ = new  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(getPendingTime(), getParentForChildren(), isClean());
pendingTime_ = null;
}
return pendingTimeBuilder_;
}

private int instanceIndex_;

public  int getInstanceIndex() {
return instanceIndex_;
}

public  Builder setInstanceIndex(int value) {
instanceIndex_ = value;
onChanged();
return this;
}

public  Builder clearInstanceIndex() {
instanceIndex_ = 0;
onChanged();
return this;
}

private boolean finished_;

public  boolean getFinished() {
return finished_;
}

public  Builder setFinished(boolean value) {
finished_ = value;
onChanged();
return this;
}

public  Builder clearFinished() {
finished_ = false;
onChanged();
return this;
}

private boolean first_;

public  boolean getFirst() {
return first_;
}

public  Builder setFirst(boolean value) {
first_ = value;
onChanged();
return this;
}

public  Builder clearFirst() {
first_ = false;
onChanged();
return this;
}

private java.lang.Object instanceId_ = "";

public  java.lang.String getInstanceId() {
java.lang.Object ref = instanceId_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
instanceId_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getInstanceIdBytes() {
java.lang.Object ref = instanceId_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
instanceId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setInstanceId(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
instanceId_ = value;
onChanged();
return this;
}

public  Builder clearInstanceId() {
instanceId_ = getDefaultInstance().getInstanceId();
onChanged();
return this;
}

public  Builder setInstanceIdBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
instanceId_ = value;
onChanged();
return this;
}

private java.util.List<com.google.appengine.logging.v1.LogLine> line_ = java.util.Collections.emptyList();

private  void ensureLineIsMutable() {
if (!((bitField0_ & 0x10000000) == 0x10000000))
{
line_ = new  java.util.ArrayList<com.google.appengine.logging.v1.LogLine>(line_);
bitField0_ |= 0x10000000;
}
}

private com.google.protobuf.RepeatedFieldBuilderV3<com.google.appengine.logging.v1.LogLine, com.google.appengine.logging.v1.LogLine.Builder, com.google.appengine.logging.v1.LogLineOrBuilder> lineBuilder_;

public  java.util.List<com.google.appengine.logging.v1.LogLine> getLineList() {
if (lineBuilder_ == null)
{
return java.util.Collections.unmodifiableList(line_);
}
else
{
return lineBuilder_.getMessageList();
}
}

public  int getLineCount() {
if (lineBuilder_ == null)
{
return line_.size();
}
else
{
return lineBuilder_.getCount();
}
}

public  com.google.appengine.logging.v1.LogLine getLine(int index) {
if (lineBuilder_ == null)
{
return line_.get(index);
}
else
{
return lineBuilder_.getMessage(index);
}
}

public  Builder setLine(int index, com.google.appengine.logging.v1.LogLine value) {
if (lineBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
ensureLineIsMutable();
line_.set(index, value);
onChanged();
}
else
{
lineBuilder_.setMessage(index, value);
}
return this;
}

public  Builder setLine(int index, com.google.appengine.logging.v1.LogLine.Builder builderForValue) {
if (lineBuilder_ == null)
{
ensureLineIsMutable();
line_.set(index, builderForValue.build());
onChanged();
}
else
{
lineBuilder_.setMessage(index, builderForValue.build());
}
return this;
}

public  Builder addLine(com.google.appengine.logging.v1.LogLine value) {
if (lineBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
ensureLineIsMutable();
line_.add(value);
onChanged();
}
else
{
lineBuilder_.addMessage(value);
}
return this;
}

public  Builder addLine(int index, com.google.appengine.logging.v1.LogLine value) {
if (lineBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
ensureLineIsMutable();
line_.add(index, value);
onChanged();
}
else
{
lineBuilder_.addMessage(index, value);
}
return this;
}

public  Builder addLine(com.google.appengine.logging.v1.LogLine.Builder builderForValue) {
if (lineBuilder_ == null)
{
ensureLineIsMutable();
line_.add(builderForValue.build());
onChanged();
}
else
{
lineBuilder_.addMessage(builderForValue.build());
}
return this;
}

public  Builder addLine(int index, com.google.appengine.logging.v1.LogLine.Builder builderForValue) {
if (lineBuilder_ == null)
{
ensureLineIsMutable();
line_.add(index, builderForValue.build());
onChanged();
}
else
{
lineBuilder_.addMessage(index, builderForValue.build());
}
return this;
}

public  Builder addAllLine(java.lang.Iterable<? extends com.google.appengine.logging.v1.LogLine> values) {
if (lineBuilder_ == null)
{
ensureLineIsMutable();
com.google.protobuf.AbstractMessageLite.Builder.addAll(values, line_);
onChanged();
}
else
{
lineBuilder_.addAllMessages(values);
}
return this;
}

public  Builder clearLine() {
if (lineBuilder_ == null)
{
line_ = java.util.Collections.emptyList();
bitField0_ = (bitField0_ & ~0x10000000);
onChanged();
}
else
{
lineBuilder_.clear();
}
return this;
}

public  Builder removeLine(int index) {
if (lineBuilder_ == null)
{
ensureLineIsMutable();
line_.remove(index);
onChanged();
}
else
{
lineBuilder_.remove(index);
}
return this;
}

public  com.google.appengine.logging.v1.LogLine.Builder getLineBuilder(int index) {
return getLineFieldBuilder().getBuilder(index);
}

public  com.google.appengine.logging.v1.LogLineOrBuilder getLineOrBuilder(int index) {
if (lineBuilder_ == null)
{
return line_.get(index);
}
else
{
return lineBuilder_.getMessageOrBuilder(index);
}
}

public  java.util.List<? extends com.google.appengine.logging.v1.LogLineOrBuilder> getLineOrBuilderList() {
if (lineBuilder_ != null)
{
return lineBuilder_.getMessageOrBuilderList();
}
else
{
return java.util.Collections.unmodifiableList(line_);
}
}

public  com.google.appengine.logging.v1.LogLine.Builder addLineBuilder() {
return getLineFieldBuilder().addBuilder(com.google.appengine.logging.v1.LogLine.getDefaultInstance());
}

public  com.google.appengine.logging.v1.LogLine.Builder addLineBuilder(int index) {
return getLineFieldBuilder().addBuilder(index, com.google.appengine.logging.v1.LogLine.getDefaultInstance());
}

public  java.util.List<com.google.appengine.logging.v1.LogLine.Builder> getLineBuilderList() {
return getLineFieldBuilder().getBuilderList();
}

private  com.google.protobuf.RepeatedFieldBuilderV3<com.google.appengine.logging.v1.LogLine, com.google.appengine.logging.v1.LogLine.Builder, com.google.appengine.logging.v1.LogLineOrBuilder> getLineFieldBuilder() {
if (lineBuilder_ == null)
{
lineBuilder_ = new  com.google.protobuf.RepeatedFieldBuilderV3<com.google.appengine.logging.v1.LogLine, com.google.appengine.logging.v1.LogLine.Builder, com.google.appengine.logging.v1.LogLineOrBuilder>(line_, ((bitField0_ & 0x10000000) == 0x10000000), getParentForChildren(), isClean());
line_ = null;
}
return lineBuilder_;
}

private java.lang.Object appEngineRelease_ = "";

public  java.lang.String getAppEngineRelease() {
java.lang.Object ref = appEngineRelease_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
appEngineRelease_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getAppEngineReleaseBytes() {
java.lang.Object ref = appEngineRelease_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
appEngineRelease_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setAppEngineRelease(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
appEngineRelease_ = value;
onChanged();
return this;
}

public  Builder clearAppEngineRelease() {
appEngineRelease_ = getDefaultInstance().getAppEngineRelease();
onChanged();
return this;
}

public  Builder setAppEngineReleaseBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
appEngineRelease_ = value;
onChanged();
return this;
}

private java.lang.Object traceId_ = "";

public  java.lang.String getTraceId() {
java.lang.Object ref = traceId_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
traceId_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getTraceIdBytes() {
java.lang.Object ref = traceId_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
traceId_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setTraceId(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
traceId_ = value;
onChanged();
return this;
}

public  Builder clearTraceId() {
traceId_ = getDefaultInstance().getTraceId();
onChanged();
return this;
}

public  Builder setTraceIdBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
traceId_ = value;
onChanged();
return this;
}

private boolean traceSampled_;

public  boolean getTraceSampled() {
return traceSampled_;
}

public  Builder setTraceSampled(boolean value) {
traceSampled_ = value;
onChanged();
return this;
}

public  Builder clearTraceSampled() {
traceSampled_ = false;
onChanged();
return this;
}

private java.util.List<com.google.appengine.logging.v1.SourceReference> sourceReference_ = java.util.Collections.emptyList();

private  void ensureSourceReferenceIsMutable() {
if (!((bitField1_ & 0x1) == 0x1))
{
sourceReference_ = new  java.util.ArrayList<com.google.appengine.logging.v1.SourceReference>(sourceReference_);
bitField1_ |= 0x1;
}
}

private com.google.protobuf.RepeatedFieldBuilderV3<com.google.appengine.logging.v1.SourceReference, com.google.appengine.logging.v1.SourceReference.Builder, com.google.appengine.logging.v1.SourceReferenceOrBuilder> sourceReferenceBuilder_;

public  java.util.List<com.google.appengine.logging.v1.SourceReference> getSourceReferenceList() {
if (sourceReferenceBuilder_ == null)
{
return java.util.Collections.unmodifiableList(sourceReference_);
}
else
{
return sourceReferenceBuilder_.getMessageList();
}
}

public  int getSourceReferenceCount() {
if (sourceReferenceBuilder_ == null)
{
return sourceReference_.size();
}
else
{
return sourceReferenceBuilder_.getCount();
}
}

public  com.google.appengine.logging.v1.SourceReference getSourceReference(int index) {
if (sourceReferenceBuilder_ == null)
{
return sourceReference_.get(index);
}
else
{
return sourceReferenceBuilder_.getMessage(index);
}
}

public  Builder setSourceReference(int index, com.google.appengine.logging.v1.SourceReference value) {
if (sourceReferenceBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
ensureSourceReferenceIsMutable();
sourceReference_.set(index, value);
onChanged();
}
else
{
sourceReferenceBuilder_.setMessage(index, value);
}
return this;
}

public  Builder setSourceReference(int index, com.google.appengine.logging.v1.SourceReference.Builder builderForValue) {
if (sourceReferenceBuilder_ == null)
{
ensureSourceReferenceIsMutable();
sourceReference_.set(index, builderForValue.build());
onChanged();
}
else
{
sourceReferenceBuilder_.setMessage(index, builderForValue.build());
}
return this;
}

public  Builder addSourceReference(com.google.appengine.logging.v1.SourceReference value) {
if (sourceReferenceBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
ensureSourceReferenceIsMutable();
sourceReference_.add(value);
onChanged();
}
else
{
sourceReferenceBuilder_.addMessage(value);
}
return this;
}

public  Builder addSourceReference(int index, com.google.appengine.logging.v1.SourceReference value) {
if (sourceReferenceBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
ensureSourceReferenceIsMutable();
sourceReference_.add(index, value);
onChanged();
}
else
{
sourceReferenceBuilder_.addMessage(index, value);
}
return this;
}

public  Builder addSourceReference(com.google.appengine.logging.v1.SourceReference.Builder builderForValue) {
if (sourceReferenceBuilder_ == null)
{
ensureSourceReferenceIsMutable();
sourceReference_.add(builderForValue.build());
onChanged();
}
else
{
sourceReferenceBuilder_.addMessage(builderForValue.build());
}
return this;
}

public  Builder addSourceReference(int index, com.google.appengine.logging.v1.SourceReference.Builder builderForValue) {
if (sourceReferenceBuilder_ == null)
{
ensureSourceReferenceIsMutable();
sourceReference_.add(index, builderForValue.build());
onChanged();
}
else
{
sourceReferenceBuilder_.addMessage(index, builderForValue.build());
}
return this;
}

public  Builder addAllSourceReference(java.lang.Iterable<? extends com.google.appengine.logging.v1.SourceReference> values) {
if (sourceReferenceBuilder_ == null)
{
ensureSourceReferenceIsMutable();
com.google.protobuf.AbstractMessageLite.Builder.addAll(values, sourceReference_);
onChanged();
}
else
{
sourceReferenceBuilder_.addAllMessages(values);
}
return this;
}

public  Builder clearSourceReference() {
if (sourceReferenceBuilder_ == null)
{
sourceReference_ = java.util.Collections.emptyList();
bitField1_ = (bitField1_ & ~0x1);
onChanged();
}
else
{
sourceReferenceBuilder_.clear();
}
return this;
}

public  Builder removeSourceReference(int index) {
if (sourceReferenceBuilder_ == null)
{
ensureSourceReferenceIsMutable();
sourceReference_.remove(index);
onChanged();
}
else
{
sourceReferenceBuilder_.remove(index);
}
return this;
}

public  com.google.appengine.logging.v1.SourceReference.Builder getSourceReferenceBuilder(int index) {
return getSourceReferenceFieldBuilder().getBuilder(index);
}

public  com.google.appengine.logging.v1.SourceReferenceOrBuilder getSourceReferenceOrBuilder(int index) {
if (sourceReferenceBuilder_ == null)
{
return sourceReference_.get(index);
}
else
{
return sourceReferenceBuilder_.getMessageOrBuilder(index);
}
}

public  java.util.List<? extends com.google.appengine.logging.v1.SourceReferenceOrBuilder> getSourceReferenceOrBuilderList() {
if (sourceReferenceBuilder_ != null)
{
return sourceReferenceBuilder_.getMessageOrBuilderList();
}
else
{
return java.util.Collections.unmodifiableList(sourceReference_);
}
}

public  com.google.appengine.logging.v1.SourceReference.Builder addSourceReferenceBuilder() {
return getSourceReferenceFieldBuilder().addBuilder(com.google.appengine.logging.v1.SourceReference.getDefaultInstance());
}

public  com.google.appengine.logging.v1.SourceReference.Builder addSourceReferenceBuilder(int index) {
return getSourceReferenceFieldBuilder().addBuilder(index, com.google.appengine.logging.v1.SourceReference.getDefaultInstance());
}

public  java.util.List<com.google.appengine.logging.v1.SourceReference.Builder> getSourceReferenceBuilderList() {
return getSourceReferenceFieldBuilder().getBuilderList();
}

private  com.google.protobuf.RepeatedFieldBuilderV3<com.google.appengine.logging.v1.SourceReference, com.google.appengine.logging.v1.SourceReference.Builder, com.google.appengine.logging.v1.SourceReferenceOrBuilder> getSourceReferenceFieldBuilder() {
if (sourceReferenceBuilder_ == null)
{
sourceReferenceBuilder_ = new  com.google.protobuf.RepeatedFieldBuilderV3<com.google.appengine.logging.v1.SourceReference, com.google.appengine.logging.v1.SourceReference.Builder, com.google.appengine.logging.v1.SourceReferenceOrBuilder>(sourceReference_, ((bitField1_ & 0x1) == 0x1), getParentForChildren(), isClean());
sourceReference_ = null;
}
return sourceReferenceBuilder_;
}

public final  Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
return this;
}

public final  Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
return this;
}

}
private static final com.google.appengine.logging.v1.RequestLog DEFAULT_INSTANCE;

static {
DEFAULT_INSTANCE = new  com.google.appengine.logging.v1.RequestLog();
}
public static  com.google.appengine.logging.v1.RequestLog getDefaultInstance() {
return DEFAULT_INSTANCE;
}

private static final com.google.protobuf.Parser<RequestLog> PARSER = new  com.google.protobuf.AbstractParser<RequestLog>(){
public  RequestLog parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return new  RequestLog(input, extensionRegistry);
}

}
;

public static  com.google.protobuf.Parser<RequestLog> parser() {
return PARSER;
}

@java.lang.Override
public  com.google.protobuf.Parser<RequestLog> getParserForType() {
return PARSER;
}

public  com.google.appengine.logging.v1.RequestLog getDefaultInstanceForType() {
return DEFAULT_INSTANCE;
}

}
