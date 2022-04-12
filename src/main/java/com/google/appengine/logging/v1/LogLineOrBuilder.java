package com.google.appengine.logging.v1;

public interface LogLineOrBuilder extends com.google.protobuf.MessageOrBuilder {
 boolean hasTime() ;

 com.google.protobuf.Timestamp getTime() ;

 com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() ;

 int getSeverityValue() ;

 com.google.logging.type.LogSeverity getSeverity() ;

 java.lang.String getLogMessage() ;

 com.google.protobuf.ByteString getLogMessageBytes() ;

 boolean hasSourceLocation() ;

 com.google.appengine.logging.v1.SourceLocation getSourceLocation() ;

 com.google.appengine.logging.v1.SourceLocationOrBuilder getSourceLocationOrBuilder() ;

}
