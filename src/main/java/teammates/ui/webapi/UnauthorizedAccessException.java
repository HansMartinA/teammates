package teammates.ui.webapi;

public class UnauthorizedAccessException extends Exception {
private final boolean showErrorMessage;

public  UnauthorizedAccessException(String message){
this(message, false);
}
public  UnauthorizedAccessException(String message, boolean showErrorMessage){
super(message);
this.showErrorMessage = showErrorMessage;
}
public  boolean isShowErrorMessage() {
return showErrorMessage;
}

}
