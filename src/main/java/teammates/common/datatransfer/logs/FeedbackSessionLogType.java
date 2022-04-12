package teammates.common.datatransfer.logs;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FeedbackSessionLogType {
ACCESS ("access"),
SUBMISSION ("submission"),
VIEW_RESULT ("view result"),
;

@JsonValue
private final String label;

 FeedbackSessionLogType(String label){
this.label = label;
}
public  String getLabel() {
return label;
}

public static  FeedbackSessionLogType valueOfLabel(String label) {
for (FeedbackSessionLogType logType : values())
{
if (logType.label.equals(label))
{
return logType;
}
}
return null;
}

}
