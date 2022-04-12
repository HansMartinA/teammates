package teammates.ui.webapi;

import teammates.common.exception.EntityDoesNotExistException;
public class EntityNotFoundException extends RuntimeException {
public  EntityNotFoundException(EntityDoesNotExistException e){
super(e.getMessage(), e);
}
public  EntityNotFoundException(String message){
super(message);
}
}
