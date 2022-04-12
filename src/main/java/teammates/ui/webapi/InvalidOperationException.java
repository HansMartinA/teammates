package teammates.ui.webapi;

import teammates.common.exception.EnrollException;
import teammates.common.exception.EntityAlreadyExistsException;
import teammates.common.exception.InstructorUpdateException;
public class InvalidOperationException extends Exception {
public  InvalidOperationException(String message){
super(message);
}
public  InvalidOperationException(EntityAlreadyExistsException cause){
super(cause.getMessage(), cause);
}
public  InvalidOperationException(EnrollException cause){
super(cause.getMessage(), cause);
}
public  InvalidOperationException(InstructorUpdateException cause){
super(cause.getMessage(), cause);
}
public  InvalidOperationException(String message, EntityAlreadyExistsException cause){
super(message, cause);
}
}
