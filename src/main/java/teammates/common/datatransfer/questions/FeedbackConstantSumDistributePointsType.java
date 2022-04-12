package teammates.common.datatransfer.questions;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FeedbackConstantSumDistributePointsType {
DISTRIBUTE_ALL_UNEVENLY ("All options"),
DISTRIBUTE_SOME_UNEVENLY ("At least some options"),
NONE ("None"),
;

private String displayedOption;

 FeedbackConstantSumDistributePointsType(String displayedOption){
this.displayedOption = displayedOption;
}
@JsonValue
public  String getDisplayedOption() {
return displayedOption;
}

}
