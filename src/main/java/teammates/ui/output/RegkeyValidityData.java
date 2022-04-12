package teammates.ui.output;

public class RegkeyValidityData extends ApiOutput {
private final boolean isValid;

private final boolean isUsed;

private final boolean isAllowedAccess;

public  RegkeyValidityData(boolean isValid, boolean isUsed, boolean isAllowedAccess){
this.isValid = isValid;
this.isUsed = isUsed;
this.isAllowedAccess = isAllowedAccess;
}
public  boolean isValid() {
return isValid;
}

public  boolean isUsed() {
return isUsed;
}

public  boolean isAllowedAccess() {
return isAllowedAccess;
}

}
