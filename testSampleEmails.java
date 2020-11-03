import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class testSampleEmails {
    private String emails;
<<<<<<< HEAD
    private boolean expectedResult;

    public testSampleEmails(String emails, boolean expectedResult) {
=======
    private String expectedResult;
    public testSampleEmails(String emails, String expectedResult) {
>>>>>>> UC12/Custom_Exception
        this.emails = emails;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{
<<<<<<< HEAD
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false}
=======
                {"abc@yahoo.com", "Success"},
                {"abc-100@yahoo.com", "Success"},
                {"abc.100@yahoo.com", "Success"},
                {"abc111@abc.com", "Success"},
                {"abc-100@abc.net", "Success"},
                {"abc.100@abc.com.au", "Success"},
                {"abc@1.com", "Success"},
                {"abc@gmail.com.com", "Success"},
                {"abc+100@gmail.com", "Success"},
>>>>>>> UC12/Custom_Exception
        });
    }

    @Test
    public void testEmailIds() {
        UserRegistration userRegistration = new UserRegistration();
<<<<<<< HEAD
        Assert.assertEquals(expectedResult, userRegistration.checkEmail(emails));
=======
        String email = null;
        try {
            email = userRegistration.checkEmail(emails);
        }
        catch (InvalidDetailExceptions e)
        {
            Assert.assertEquals(expectedResult, email);
        }

>>>>>>> UC12/Custom_Exception
    }
}
