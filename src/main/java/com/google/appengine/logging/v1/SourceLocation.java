package com.google.appengine.logging.v1;

public final class SourceLocation extends com.google.protobuf.GeneratedMessageV3 implements SourceLocationOrBuilder {
public static  Builder newBuilder() {
return DEFAULT_INSTANCE.toBuilder();
}

private  SourceLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder){
super(builder);
}
private  SourceLocation(){
file_ = "";
line_ = 0L;
functionName_ = "";
}
@java.lang.Override
public final  com.google.protobuf.UnknownFieldSet getUnknownFields() {
return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
}

private  SourceLocation(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException{
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
java.lang.String s = input.readStringRequireUtf8();
file_ = s;
break;
}
case 16: {
line_ = input.readInt64();
break;
}
case 26: {
java.lang.String s = input.readStringRequireUtf8();
functionName_ = s;
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
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceLocation_descriptor;
}

protected  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceLocation_fieldAccessorTable.ensureFieldAccessorsInitialized(com.google.appengine.logging.v1.SourceLocation.class, com.google.appengine.logging.v1.SourceLocation.Builder.class);
}

public static final int FILE_FIELD_NUMBER = 1;

private volatile java.lang.Object file_;

public  java.lang.String getFile() {
java.lang.Object ref = file_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
file_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getFileBytes() {
java.lang.Object ref = file_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
file_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public static final int LINE_FIELD_NUMBER = 2;

private long line_;

public  long getLine() {
return line_;
}

public static final int FUNCTION_NAME_FIELD_NUMBER = 3;

private volatile java.lang.Object functionName_;

public  java.lang.String getFunctionName() {
java.lang.Object ref = functionName_;
if (ref instanceof java.lang.String)
{
return (java.lang.String) ref;
}
else
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
functionName_ = s;
return s;
}
}

public  com.google.protobuf.ByteString getFunctionNameBytes() {
java.lang.Object ref = functionName_;
if (ref instanceof java.lang.String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
functionName_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
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
if (!getFileBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 1, file_);
}
if (line_ != 0L)
{
output.writeInt64(2, line_);
}
if (!getFunctionNameBytes().isEmpty())
{
com.google.protobuf.GeneratedMessageV3.writeString(output, 3, functionName_);
}
}

public  int getSerializedSize() {
int size = memoizedSize;
if (size !=  - 1)
return size;
size = 0;
if (!getFileBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, file_);
}
if (line_ != 0L)
{
size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, line_);
}
if (!getFunctionNameBytes().isEmpty())
{
size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, functionName_);
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
if (!(obj instanceof com.google.appengine.logging.v1.SourceLocation))
{
return super.equals(obj);
}
com.google.appengine.logging.v1.SourceLocation other = (com.google.appengine.logging.v1.SourceLocation) obj;
boolean result = true;
result = result && getFile().equals(other.getFile());
result = result && (getLine() == other.getLine());
result = result && getFunctionName().equals(other.getFunctionName());
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
hash = (37 * hash) + FILE_FIELD_NUMBER;
hash = (53 * hash) + getFile().hashCode();
hash = (37 * hash) + LINE_FIELD_NUMBER;
hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLine());
hash = (37 * hash) + FUNCTION_NAME_FIELD_NUMBER;
hash = (53 * hash) + getFunctionName().hashCode();
hash = (29 * hash) + unknownFields.hashCode();
memoizedHashCode = hash;
return hash;
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(java.nio.ByteBuffer data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(com.google.protobuf.ByteString data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(byte[]  data)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(byte[]  data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return PARSER.parseFrom(data, extensionRegistry);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(java.io.InputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
}

public static  com.google.appengine.logging.v1.SourceLocation parseDelimitedFrom(java.io.InputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.SourceLocation parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(com.google.protobuf.CodedInputStream input)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
}

public static  com.google.appengine.logging.v1.SourceLocation parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
}

public  Builder newBuilderForType() {
return newBuilder();
}

public static  Builder newBuilder(com.google.appengine.logging.v1.SourceLocation prototype) {
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

public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements com.google.appengine.logging.v1.SourceLocationOrBuilder {
public static final  com.google.protobuf.Descriptors.Descriptor getDescriptor() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceLocation_descriptor;
}

protected  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceLocation_fieldAccessorTable.ensureFieldAccessorsInitialized(com.google.appengine.logging.v1.SourceLocation.class, com.google.appengine.logging.v1.SourceLocation.Builder.class);
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
file_ = "";
line_ = 0L;
functionName_ = "";
return this;
}

public  com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.google.appengine.logging.v1.RequestLogProto.internal_static_google_appengine_logging_v1_SourceLocation_descriptor;
}

public  com.google.appengine.logging.v1.SourceLocation getDefaultInstanceForType() {
return com.google.appengine.logging.v1.SourceLocation.getDefaultInstance();
}

public  com.google.appengine.logging.v1.SourceLocation build() {
com.google.appengine.logging.v1.SourceLocation result = buildPartial();
if (!result.isInitialized())
{
throw newUninitializedMessageException(result);
}
return result;
}

public  com.google.appengine.logging.v1.SourceLocation buildPartial() {
com.google.appengine.logging.v1.SourceLocation result = new  com.google.appengine.logging.v1.SourceLocation(this);
result.file_ = file_;
result.line_ = line_;
result.functionName_ = functionName_;
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
if (other instanceof com.google.appengine.logging.v1.SourceLocation)
{
return mergeFrom((com.google.appengine.logging.v1.SourceLocation) other);
}
else
{
super.mergeFrom(other);
return this;
}
}

public  Builder mergeFrom(com.google.appengine.logging.v1.SourceLocation other) {
if (other == com.google.appengine.logging.v1.SourceLocation.getDefaultInstance())
return this;
if (!other.getFile().isEmpty())
{
file_ = other.file_;
onChanged();
}
if (other.getLine() != 0L)
{
setLine(other.getLine());
}
if (!other.getFunctionName().isEmpty())
{
functionName_ = other.functionName_;
onChanged();
}
onChanged();
return this;
}

public final  boolean isInitialized() {
return true;
}

public  Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws java.io.IOException {
com.google.appengine.logging.v1.SourceLocation parsedMessage = null;
try {
parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
}
catch(com.google.protobuf.InvalidProtocolBufferException e){
parsedMessage = (com.google.appengine.logging.v1.SourceLocation) e.getUnfinishedMessage();
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

private java.lang.Object file_ = "";

public  java.lang.String getFile() {
java.lang.Object ref = file_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
file_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getFileBytes() {
java.lang.Object ref = file_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
file_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setFile(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
file_ = value;
onChanged();
return this;
}

public  Builder clearFile() {
file_ = getDefaultInstance().getFile();
onChanged();
return this;
}

public  Builder setFileBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
file_ = value;
onChanged();
return this;
}

private long line_;

public  long getLine() {
return line_;
}

public  Builder setLine(long value) {
line_ = value;
onChanged();
return this;
}

public  Builder clearLine() {
line_ = 0L;
onChanged();
return this;
}

private java.lang.Object functionName_ = "";

public  java.lang.String getFunctionName() {
java.lang.Object ref = functionName_;
if (!(ref instanceof java.lang.String))
{
com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
java.lang.String s = bs.toStringUtf8();
functionName_ = s;
return s;
}
else
{
return (java.lang.String) ref;
}
}

public  com.google.protobuf.ByteString getFunctionNameBytes() {
java.lang.Object ref = functionName_;
if (ref instanceof String)
{
com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
functionName_ = b;
return b;
}
else
{
return (com.google.protobuf.ByteString) ref;
}
}

public  Builder setFunctionName(java.lang.String value) {
if (value == null)
{
throw new  NullPointerException();
}
functionName_ = value;
onChanged();
return this;
}

public  Builder clearFunctionName() {
functionName_ = getDefaultInstance().getFunctionName();
onChanged();
return this;
}

public  Builder setFunctionNameBytes(com.google.protobuf.ByteString value) {
if (value == null)
{
throw new  NullPointerException();
}
checkByteStringIsUtf8(value);
functionName_ = value;
onChanged();
return this;
}

public final  Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
return this;
}

public final  Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
return this;
}

}
private static final com.google.appengine.logging.v1.SourceLocation DEFAULT_INSTANCE;

static {
DEFAULT_INSTANCE = new  com.google.appengine.logging.v1.SourceLocation();
}
public static  com.google.appengine.logging.v1.SourceLocation getDefaultInstance() {
return DEFAULT_INSTANCE;
}

private static final com.google.protobuf.Parser<SourceLocation> PARSER = new  com.google.protobuf.AbstractParser<SourceLocation>(){
public  SourceLocation parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)throws com.google.protobuf.InvalidProtocolBufferException {
return new  SourceLocation(input, extensionRegistry);
}

}
;

public static  com.google.protobuf.Parser<SourceLocation> parser() {
return PARSER;
}

@java.lang.Override
public  com.google.protobuf.Parser<SourceLocation> getParserForType() {
return PARSER;
}

public  com.google.appengine.logging.v1.SourceLocation getDefaultInstanceForType() {
return DEFAULT_INSTANCE;
}

}
