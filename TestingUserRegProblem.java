import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    @Test
    public void testingFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFNameValid = userRegistration.checkFName("Shubh");
        Assert.assertTrue(isFNameValid);
    }

    @Test
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFnameValid = userRegistration.checkFName("shubh");
        Assert.assertFalse(isFnameValid);
    }

    @Test
    public void testLastNameValidMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameValid = userRegistration.Lname("Kumar");
        Assert.assertTrue(isLnameValid);
    }

    public void testLastNameValidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameINValid = userRegistration.Lname("kumar");
        Assert.assertFalse(isLnameINValid);
    }

    @Test
    public void testEmailId_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailValid = userRegistration.checkEmail("swyam007.sm@gmail.com");
        Assert.assertTrue(isEmailValid);
    }

    public void testEmailId_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("swayam@.com");
        Assert.assertFalse(isEmailInvalid);
    }

    @Test
    public void testPhoneNumber_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 7903990740");
        Assert.assertTrue(isPhoneNumberValid);
    }
    public void testPhoneNumber_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInValid = userRegistration.checkPhoneNum("7903990740");
        Assert.assertFalse(isPhoneNumberInValid);
    }

    @Test
    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordValid = userRegistration.checkPassword("Abcdefghi");
        Assert.assertTrue(isPasswordValid);
    }
    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("abcdefghi");
        Assert.assertTrue(isPasswordInValid);
    }
}
