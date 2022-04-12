package teammates.ui.webapi;

import teammates.common.exception.InvalidParametersException;
public class InvalidHttpParameterException extends RuntimeException {
public  InvalidHttpParameterException(String message){
super(message);
}
public  InvalidHttpParameterException(InvalidParametersException cause){
super(cause.getMessage(), cause);
}
public  InvalidHttpParameterException(String message, ArithmeticException cause){
super(message, cause);
}
public  InvalidHttpParameterException(String message, NumberFormatException cause){
super(message, cause);
}
public  InvalidHttpParameterException(String message, IllegalArgumentException cause){
super(message, cause);
}
}
