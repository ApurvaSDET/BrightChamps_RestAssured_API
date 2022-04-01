package Tests;

import Helpers.POST_Method_Helper;
import Utils.ConfigManager;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POST_Methods_Test extends ConfigManager {

    private POST_Method_Helper POST_Method_Helper;


    @BeforeMethod(alwaysRun = true)
    public void init(){

        POST_Method_Helper = new POST_Method_Helper();

    }

    @Test(groups = {"Regression"})
    public void PUT_UpdateProfileDetails(){

        Assert.assertEquals(POST_Method_Helper.updateProfile().jsonPath().getString("data.updated"), "true");

    }

    @Test(groups = {"Regression"})
    public void POST_EmailSignIn(){

        Assert.assertNotNull(Helpers.POST_Method_Helper.EmailSignIn().jsonPath().getString("token"));

    }

    @Test(groups = {"Regression"})
    public void POST_SendEmailOTP(){

        Assert.assertEquals(POST_Method_Helper.SendEmailOTP().jsonPath().getString("message"),"OTP has been sent to "+valueForTheGivenKey("Email"));

    }

    @Test(groups = {"Regression"})
    public void POST_SendMobileOTP(){

        Assert.assertEquals(POST_Method_Helper.SendMobileOTP().jsonPath().getString("message"),"OTP has been sent to +91 "+valueForTheGivenKey("phoneNumber"));

    }

    @Test(groups = {"Regression"})
    public void POST_ForgotPassword(){

        Assert.assertEquals(POST_Method_Helper.ForgotPassword().jsonPath().getString("message"),"An email has been sent to "+valueForTheGivenKey("Email")+". Please follow the instructions to reset your password.");

    }

    @Test(groups = {"Regression","DB_Related"})
    public void POST_ResetPassword() throws InstantiationException, IllegalAccessException {

        Assert.assertEquals(POST_Method_Helper.ResetPassword().jsonPath().getString("message"),"Great! Now you can login with your new password");

    }

    @Test(groups = {"Regression"})
    public void POST_ChangePassword(){

        Assert.assertEquals(POST_Method_Helper.ChangePassword().jsonPath().getString("message"),"Great! Now you can login with your new password");

    }

    @Test(groups = {"Regression"})
    public void POST_DemoReschedule(){

        Assert.assertEquals(POST_Method_Helper.DemoReschedule().jsonPath().getString("msg"),"Class reschedule successfully");

    }

    @Test(groups = {"Regression"})
    public void POST_VerifyInvalidOTP() {

        Assert.assertEquals(POST_Method_Helper.VerifyInvalidOTP().jsonPath().getString("error"),"Incorrect OTP");

    }

    @Test(groups = {"Regression","DB_Related"})
    public void POST_VerifyValidOTP() throws InstantiationException, IllegalAccessException, InterruptedException {

        Assert.assertNotNull(POST_Method_Helper.VerifyValidOTP().jsonPath().getString("token"));

    }

    @Test(groups = {"Regression"})
    public void POST_MasterLogin() {

        Assert.assertNotNull(POST_Method_Helper.MasterLogin().jsonPath().getString("token"));

    }

    @Test(groups = {"Regression","DB_Related"})
    public void POST_GlobalHouseRequest() throws InstantiationException, IllegalAccessException {

        Assert.assertEquals(POST_Method_Helper.PostGlobalHouseRequest().jsonPath().getString("message"),"Congratulations! Your entry into the Global House is confirmed :)");

    }

    @Test(groups = {"Regression"})
    public void POST_UploadProfilePic() {

        Assert.assertNotNull(POST_Method_Helper.UploadProfilePic().jsonPath().getString("path"));

    }

}
