package teammates.ui.request;

import teammates.common.exception.InvalidParametersException;
public class InvalidHttpRequestBodyException extends Exception {
public  InvalidHttpRequestBodyException(String message){
super(message);
}
public  InvalidHttpRequestBodyException(InvalidParametersException cause){
super(cause.getMessage(), cause);
}
}
