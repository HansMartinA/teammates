package teammates.ui.request;

public abstract class BasicRequest {
public abstract  void validate()throws InvalidHttpRequestBodyException ;

 void assertTrue(boolean condition, String message)throws InvalidHttpRequestBodyException {
if (!condition)
{
throw new  InvalidHttpRequestBodyException(message);
}
}

}
