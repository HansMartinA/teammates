package com.google.appengine.logging.v1;

public final class LogLine extends com.google.protobuf.GeneratedMessageV3 implements LogLineOrBuilder {
private  LogLine(com.google.protobuf.GeneratedMessageV3.Builder<?> builder){
super(builder);
}
private  LogLine(){
severity_ = 0;
logMessage_ = "";
}
@java.lang.Override
public final  com.google.protobuf.UnknownFieldSet getUnknownFields() {
return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
}

private  LogLine(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException{
this();
int mutable_bitField0_ = 0;
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
com.google.protobuf.Timestamp.Builder subBuilder = null;
if (time_ != null)
{
subBuilder = time_.toBuilder();
}
time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
if (subBuilder != null)
{
subBuilder.mergeFrom(time_);
time_ = subBuilder.buildPartial();
}
break;
}
case 16: {
int rawValue = input.readEnum();
severity_ = rawValue;
break;
}
case 26: {
java.lang.String s = input.readStringRequireUtf8();
logMessage_ = s;
break;
}
case 34: {
com.google.appengine.logging.v1.SourceLocation.Builder subBuilder = null;
if (sourceLocation_ != null)
{
subBuilder = sourceLocation_.toBuilder();
}
sourceLocation_ = input.readMessage(com.google.appengine.logging.v1.SourceLocation.parser(), extensionRegistry);
if (subBuilder != null)
{
subBuilder.mergeFrom(sourceLocation_);
sourceLocation_ = subBuilder.buildPartial();
}
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
makeExtensionsImmutable();
}
}
public static final  com.google.protobuf.Descriptors.Descriptor getDescriptor() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_LogLine_descriptor;
}

protected  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_LogLine_fieldAccessorTable.ensureFieldAccessorsInitialized(com.google.appengine.logging.v1.LogLine.class, com.google.appengine.logging.v1.LogLine.Builder.class);
}

public static final int TIME_FIELD_NUMBER = 1;

private com.google.protobuf.Timestamp time_;

public  boolean hasTime() {
return time_ != null;
}

public  com.google.protobuf.Timestamp getTime() {
return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
}

public  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
return getTime();
}

public static final int SEVERITY_FIELD_NUMBER = 2;

private int severity_;

public  int getSeverityValue() {
return severity_;
}

public  com.google.logging.type.LogSeverity getSeverity() {
com.google.logging.type.LogSeverity result = com.google.logging.type.LogSeverity.valueOf(severity_);
return result == null ? com.google.logging.type.LogSeverity.UNRECOGNIZED : result;
}

public static final int LOG_MESSAGE_FIELD_NUMBER = 3;

private volatile java.lang.Object logMessage_;

public  java.lang.String getLogMessage() {
java.lang.Object ref = logMessage_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
logMessage_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getLogMessageBytes() {
java.lang.Object ref = logMessage_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
logMessage_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int SOURCE_LOCATION_FIELD_NUMBER = 4;

private com.google.appengine.logging.v1.SourceLocation sourceLocation_;

public  boolean hasSourceLocation() {
return sourceLocation_ != null;
}

public  com.google.appengine.logging.v1.SourceLocation getSourceLocation() {
return sourceLocation_ == null ? com.google.appengine.logging.v1.SourceLocation.getDefaultInstance() : sourceLocation_;
}

public  com.google.appengine.logging.v1.SourceLocationOrBuilder getSourceLocationOrBuilder() {
return getSourceLocation();
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
if (time_ != null)
{
output.writeMessage(1, getTime());
}
if (severity_ != com.google.logging.type.LogSeverity.DEFAULT.getNumber())
{
output.writeEnum(2, severity_);
}
if (!getLogMessageBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 3, logMessage_);
}
if (sourceLocation_ != null)
{
output.writeMessage(4, getSourceLocation());
}
}

public  int getSerializedSize() {
int size = memoizedSize;
if (size !=  - 1)
return size;
size = 0;
if (time_ != null)
{
size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTime());
}
if (severity_ != com.google.logging.type.LogSeverity.DEFAULT.getNumber())
{
size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, severity_);
}
if (!getLogMessageBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, logMessage_);
}
if (sourceLocation_ != null)
{
size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getSourceLocation());
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
if (!(obj instanceof com.google.appengine.logging.v1.LogLine))
{
return super.equals(obj);
}
com.google.appengine.logging.v1.LogLine other = (com.google.appengine.logging.v1.LogLine) obj;
boolean result = true;
result = result && (hasTime() == other.hasTime());
if (hasTime())
{
result = result && getTime().equals(other.getTime());
}
result = result && severity_ == other.severity_;
result = result && getLogMessage().equals(other.getLogMessage());
result = result && (hasSourceLocation() == other.hasSourceLocation());
if (hasSourceLocation())
{
result = result && getSourceLocation().equals(other.getSourceLocation());
}
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
if (hasTime())
{
hash = (37 * hash) + TIME_FIELD_NUMBER;
hash = (53 * hash) + getTime().hashCode();
}
hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
hash = (53 * hash) + severity_;
hash = (37 * hash) + LOG_MESSAGE_FIELD_NUMBER;
hash = (53 * hash) + getLogMessage().hashCode();
if (hasSourceLocation())
{
hash = (37 * hash) + SOURCE_LOCATION_FIELD_NUMBER;
hash = (53 * hash) + getSourceLocation().hashCode();
}
hash = (29 * hash) + unknownFields.hashCode();
memoizedHashCode = hash;
return hash;
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(java.nio.ByteBuffer data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(com.google.protobuf.ByteString data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(byte[]  data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(byte[]  data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(java.io.InputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
}

public static  com.google.appengine.logging.v1.LogLine parseDelimitedFrom(java.io.InputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.LogLine parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(com.google.protobuf.CodedInputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.LogLine parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
}

public  Builder newBuilderForType() {
return newBuilder();
}

public static  Builder newBuilder() {
return DEFAULT_INSTANCE.toBuilder();
}

public static  Builder newBuilder(com.google.appengine.logging.v1.LogLine prototype) {
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

public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements com.google.appengine.logging.v1.LogLineOrBuilder {
public static final  com.google.protobuf.Descriptors.Descriptor getDescriptor() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_LogLine_descriptor;
}

protected  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_LogLine_fieldAccessorTable.ensureFieldAccessorsInitialized(com.google.appengine.logging.v1.LogLine.class, com.google.appengine.logging.v1.LogLine.Builder.class);
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
}
}

public  Builder clear() {
super.clear();
if (timeBuilder_ == null)
{
time_ = null;
}
else
{
time_ = null;
timeBuilder_ = null;
}
severity_ = 0;
logMessage_ = "";
if (sourceLocationBuilder_ == null)
{
sourceLocation_ = null;
}
else
{
sourceLocation_ = null;
sourceLocationBuilder_ = null;
}
return this;
}

public  com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_LogLine_descriptor;
}

public  com.google.appengine.logging.v1.LogLine getDefaultInstanceForType() {
return com.google.appengine.logging.v1.LogLine.getDefaultInstance();
}

public  com.google.appengine.logging.v1.LogLine build() {
com.google.appengine.logging.v1.LogLine result = buildPartial();
if (!result.isInitialized())
{
throw newUninitializedMessageException(result);
}
return result;
}

public  com.google.appengine.logging.v1.LogLine buildPartial() {
com.google.appengine.logging.v1.LogLine result = new  com.google.appengine.logging.v1.LogLine(this);
if (timeBuilder_ == null)
{
result.time_ = time_;
}
else
{
result.time_ = timeBuilder_.build();
}
result.severity_ = severity_;
result.logMessage_ = logMessage_;
if (sourceLocationBuilder_ == null)
{
result.sourceLocation_ = sourceLocation_;
}
else
{
result.sourceLocation_ = sourceLocationBuilder_.build();
}
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
if (other instanceof com.google.appengine.logging.v1.LogLine)
{
return mergeFrom((com.google.appengine.logging.v1.LogLine) other);
}
else
{
super.mergeFrom(other);
return this;
}
}

public  Builder mergeFrom(com.google.appengine.logging.v1.LogLine other) {
if (other == com.google.appengine.logging.v1.LogLine.getDefaultInstance())
return this;
if (other.hasTime())
{
mergeTime(other.getTime());
}
if (other.severity_ != 0)
{
setSeverityValue(other.getSeverityValue());
}
if (!other.getLogMessage().isEmpty())
{
logMessage_ = other.logMessage_;
onChanged();
}
if (other.hasSourceLocation())
{
mergeSourceLocation(other.getSourceLocation());
}
onChanged();
return this;
}

public final  boolean isInitialized() {
return true;
}

public  Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
com.google.appengine.logging.v1.LogLine parsedMessage = null;
try {
parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
}
catch(com.google.protobuf.InvalidProtocolBufferException e){
parsedMessage = (com.google.appengine.logging.v1.LogLine) e.getUnfinishedMessage();
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

private com.google.protobuf.Timestamp time_ = null;

private com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;

public  boolean hasTime() {
return timeBuilder_ != null || time_ != null;
}

public  com.google.protobuf.Timestamp getTime() {
if (timeBuilder_ == null)
{
return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
}
else
{
return timeBuilder_.getMessage();
}
}

public  Builder setTime(com.google.protobuf.Timestamp value) {
if (timeBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
time_ = value;
onChanged();
}
else
{
timeBuilder_.setMessage(value);
}
return this;
}

public  Builder setTime(com.google.protobuf.Timestamp.Builder builderForValue) {
if (timeBuilder_ == null)
{
time_ = builderForValue.build();
onChanged();
}
else
{
timeBuilder_.setMessage(builderForValue.build());
}
return this;
}

public  Builder mergeTime(com.google.protobuf.Timestamp value) {
if (timeBuilder_ == null)
{
if (time_ != null)
{
time_ = com.google.protobuf.Timestamp.newBuilder(time_).mergeFrom(value).buildPartial();
}
else
{
time_ = value;
}
onChanged();
}
else
{
timeBuilder_.mergeFrom(value);
}
return this;
}

public  Builder clearTime() {
if (timeBuilder_ == null)
{
time_ = null;
onChanged();
}
else
{
time_ = null;
timeBuilder_ = null;
}
return this;
}

public  com.google.protobuf.Timestamp.Builder getTimeBuilder() {
onChanged();
return getTimeFieldBuilder().getBuilder();
}

public  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
if (timeBuilder_ != null)
{
return timeBuilder_.getMessageOrBuilder();
}
else
{
return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
}
}

private  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> getTimeFieldBuilder() {
if (timeBuilder_ == null)
{
timeBuilder_ = new  com.google.protobuf.SingleFieldBuilderV3<com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(getTime(), getParentForChildren(), isClean());
time_ = null;
}
return timeBuilder_;
}

private int severity_ = 0;

public  int getSeverityValue() {
return severity_;
}

public  Builder setSeverityValue(int value) {
severity_ = value;
onChanged();
return this;
}

public  com.google.logging.type.LogSeverity getSeverity() {
com.google.logging.type.LogSeverity result = com.google.logging.type.LogSeverity.valueOf(severity_);
return result == null ? com.google.logging.type.LogSeverity.UNRECOGNIZED : result;
}

public  Builder setSeverity(com.google.logging.type.LogSeverity value) {
if (value == null)
{
throw new  NullPointerException();
}
severity_ = value.getNumber();
onChanged();
return this;
}

public  Builder clearSeverity() {
severity_ = 0;
onChanged();
return this;
}

private java.lang.Object logMessage_ = "";

public  java.lang.String getLogMessage() {
java.lang.Object ref = logMessage_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
logMessage_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getLogMessageBytes() {
java.lang.Object ref = logMessage_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
logMessage_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setLogMessage(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
logMessage_ = value;
onChanged();
return this;
}

public  Builder clearLogMessage() {
logMessage_ = getDefaultInstance().getLogMessage();
onChanged();
return this;
}

public  Builder setLogMessageBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
logMessage_ = value;
onChanged();
return this;
}

private com.google.appengine.logging.v1.SourceLocation sourceLocation_ = null;

private com.google.protobuf.SingleFieldBuilderV3<com.google.appengine.logging.v1.SourceLocation, com.google.appengine.logging.v1.SourceLocation.Builder, com.google.appengine.logging.v1.SourceLocationOrBuilder> sourceLocationBuilder_;

public  boolean hasSourceLocation() {
return sourceLocationBuilder_ != null || sourceLocation_ != null;
}

public  com.google.appengine.logging.v1.SourceLocation getSourceLocation() {
if (sourceLocationBuilder_ == null)
{
return sourceLocation_ == null ? com.google.appengine.logging.v1.SourceLocation.getDefaultInstance() : sourceLocation_;
}
else
{
return sourceLocationBuilder_.getMessage();
}
}

public  Builder setSourceLocation(com.google.appengine.logging.v1.SourceLocation value) {
if (sourceLocationBuilder_ == null)
{
if (value == null)
{
throw new  NullPointerException();
}
sourceLocation_ = value;
onChanged();
}
else
{
sourceLocationBuilder_.setMessage(value);
}
return this;
}

public  Builder setSourceLocation(com.google.appengine.logging.v1.SourceLocation.Builder builderForValue) {
if (sourceLocationBuilder_ == null)
{
sourceLocation_ = builderForValue.build();
onChanged();
}
else
{
sourceLocationBuilder_.setMessage(builderForValue.build());
}
return this;
}

public  Builder mergeSourceLocation(com.google.appengine.logging.v1.SourceLocation value) {
if (sourceLocationBuilder_ == null)
{
if (sourceLocation_ != null)
{
sourceLocation_ = com.google.appengine.logging.v1.SourceLocation.newBuilder(sourceLocation_).mergeFrom(value).buildPartial();
}
else
{
sourceLocation_ = value;
}
onChanged();
}
else
{
sourceLocationBuilder_.mergeFrom(value);
}
return this;
}

public  Builder clearSourceLocation() {
if (sourceLocationBuilder_ == null)
{
sourceLocation_ = null;
onChanged();
}
else
{
sourceLocation_ = null;
sourceLocationBuilder_ = null;
}
return this;
}

public  com.google.appengine.logging.v1.SourceLocation.Builder getSourceLocationBuilder() {
onChanged();
return getSourceLocationFieldBuilder().getBuilder();
}

public  com.google.appengine.logging.v1.SourceLocationOrBuilder getSourceLocationOrBuilder() {
if (sourceLocationBuilder_ != null)
{
return sourceLocationBuilder_.getMessageOrBuilder();
}
else
{
return sourceLocation_ == null ? com.google.appengine.logging.v1.SourceLocation.getDefaultInstance() : sourceLocation_;
}
}

private  com.google.protobuf.SingleFieldBuilderV3<com.google.appengine.logging.v1.SourceLocation, com.google.appengine.logging.v1.SourceLocation.Builder, com.google.appengine.logging.v1.SourceLocationOrBuilder> getSourceLocationFieldBuilder() {
if (sourceLocationBuilder_ == null)
{
sourceLocationBuilder_ = new  com.google.protobuf.SingleFieldBuilderV3<com.google.appengine.logging.v1.SourceLocation, com.google.appengine.logging.v1.SourceLocation.Builder, com.google.appengine.logging.v1.SourceLocationOrBuilder>(getSourceLocation(), getParentForChildren(), isClean());
sourceLocation_ = null;
}
return sourceLocationBuilder_;
}

public final  Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
return this;
}

public final  Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
return this;
}

}
private static final com.google.appengine.logging.v1.LogLine DEFAULT_INSTANCE;

static {
DEFAULT_INSTANCE = new  com.google.appengine.logging.v1.LogLine();
}
public static  com.google.appengine.logging.v1.LogLine getDefaultInstance() {
return DEFAULT_INSTANCE;
}

private static final com.google.protobuf.Parser<LogLine> PARSER = new  com.google.protobuf.AbstractParser<LogLine>(){
public  LogLine parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return new  LogLine(input, extensionRegistry);
}

}
;

public static  com.google.protobuf.Parser<LogLine> parser() {
return PARSER;
}

@java.lang.Override
public  com.google.protobuf.Parser<LogLine> getParserForType() {
return PARSER;
}

public  com.google.appengine.logging.v1.LogLine getDefaultInstanceForType() {
return DEFAULT_INSTANCE;
}

}
