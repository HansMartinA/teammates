package com.google.appengine.logging.v1;

public interface RequestLogOrBuilder extends com.google.protobuf.MessageOrBuilder {
 java.lang.String getAppId() ;

 com.google.protobuf.ByteString getAppIdBytes() ;

 java.lang.String getModuleId() ;

 com.google.protobuf.ByteString getModuleIdBytes() ;

 java.lang.String getVersionId() ;

 com.google.protobuf.ByteString getVersionIdBytes() ;

 java.lang.String getRequestId() ;

 com.google.protobuf.ByteString getRequestIdBytes() ;

 java.lang.String getIp() ;

 com.google.protobuf.ByteString getIpBytes() ;

 boolean hasStartTime() ;

 com.google.protobuf.Timestamp getStartTime() ;

 com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() ;

 boolean hasEndTime() ;

 com.google.protobuf.Timestamp getEndTime() ;

 com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() ;

 boolean hasLatency() ;

 com.google.protobuf.Duration getLatency() ;

 com.google.protobuf.DurationOrBuilder getLatencyOrBuilder() ;

 long getMegaCycles() ;

 java.lang.String getMethod() ;

 com.google.protobuf.ByteString getMethodBytes() ;

 java.lang.String getResource() ;

 com.google.protobuf.ByteString getResourceBytes() ;

 java.lang.String getHttpVersion() ;

 com.google.protobuf.ByteString getHttpVersionBytes() ;

 int getStatus() ;

 long getResponseSize() ;

 java.lang.String getReferrer() ;

 com.google.protobuf.ByteString getReferrerBytes() ;

 java.lang.String getUserAgent() ;

 com.google.protobuf.ByteString getUserAgentBytes() ;

 java.lang.String getNickname() ;

 com.google.protobuf.ByteString getNicknameBytes() ;

 java.lang.String getUrlMapEntry() ;

 com.google.protobuf.ByteString getUrlMapEntryBytes() ;

 java.lang.String getHost() ;

 com.google.protobuf.ByteString getHostBytes() ;

 double getCost() ;

 java.lang.String getTaskQueueName() ;

 com.google.protobuf.ByteString getTaskQueueNameBytes() ;

 java.lang.String getTaskName() ;

 com.google.protobuf.ByteString getTaskNameBytes() ;

 boolean getWasLoadingRequest() ;

 boolean hasPendingTime() ;

 com.google.protobuf.Duration getPendingTime() ;

 com.google.protobuf.DurationOrBuilder getPendingTimeOrBuilder() ;

 int getInstanceIndex() ;

 boolean getFinished() ;

 boolean getFirst() ;

 java.lang.String getInstanceId() ;

 com.google.protobuf.ByteString getInstanceIdBytes() ;

 java.util.List<com.google.appengine.logging.v1.LogLine> getLineList() ;

 com.google.appengine.logging.v1.LogLine getLine(int index) ;

 int getLineCount() ;

 java.util.List<? extends com.google.appengine.logging.v1.LogLineOrBuilder> getLineOrBuilderList() ;

 com.google.appengine.logging.v1.LogLineOrBuilder getLineOrBuilder(int index) ;

 java.lang.String getAppEngineRelease() ;

 com.google.protobuf.ByteString getAppEngineReleaseBytes() ;

 java.lang.String getTraceId() ;

 com.google.protobuf.ByteString getTraceIdBytes() ;

 boolean getTraceSampled() ;

 java.util.List<com.google.appengine.logging.v1.SourceReference> getSourceReferenceList() ;

 com.google.appengine.logging.v1.SourceReference getSourceReference(int index) ;

 int getSourceReferenceCount() ;

 java.util.List<? extends com.google.appengine.logging.v1.SourceReferenceOrBuilder> getSourceReferenceOrBuilderList() ;

 com.google.appengine.logging.v1.SourceReferenceOrBuilder getSourceReferenceOrBuilder(int index) ;

}
