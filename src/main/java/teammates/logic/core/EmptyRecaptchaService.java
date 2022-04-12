package teammates.logic.core;

public class EmptyRecaptchaService implements RecaptchaService {
@Override
public  boolean isVerificationSuccessful(String captchaResponse) {
return true;
}

}
