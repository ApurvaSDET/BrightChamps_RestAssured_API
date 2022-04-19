package Helpers;

import Constant.EndPoints;
import Model.*;
import Model.Post_GlobalHouse.GlobalHouseRequest;
import Model.Post_GlobalHouse.PreferredSlot;
import Utils.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class POST_Method_Helper extends ConfigManager {


    public POST_Method_Helper(){

        RestAssured.baseURI = BASE_URL;

    }

    public Response updateProfile()
    {

        //Creating Object for Setter Class
        UpdateStudentProfile UpdateProfile = new UpdateStudentProfile();

        //Providing Body
        UpdateProfile.setCity("Delhi");
        UpdateProfile.setGender("Male");
        UpdateProfile.setCountry("India | India Standard");
        UpdateProfile.setDateOfBirth("2011-05-17");
        UpdateProfile.setFatherEmailId("RFvLH@mailinator.com");
        UpdateProfile.setFatherName("cSHBSpJ TurRvfs");
        UpdateProfile.setFatherPhoneNumber("5137177744");
        UpdateProfile.setGrade("Grade 5");
        UpdateProfile.setHobbies("Nature Watching,Meteorology,Knitting");
        UpdateProfile.setMotherEmailId("ishu@mailinator.com");
        UpdateProfile.setMotherName("bxOQfQd TurRvfs");
        UpdateProfile.setMotherPhoneNumber("7426869754");
        UpdateProfile.setSchoolName("pMPicrlk");
        UpdateProfile.setStudentName("Apurva Kushwaha");


        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId",ConfigManager.valueForTheGivenKey("studentId"))
                .when()
                .body(UpdateProfile)
                .put(EndPoints.PUT_StudentProfile)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < 3000);

        return response;

    }

    public static Response EmailSignIn()
    {

        //Creating Object for Setter Class
        EmailSignIn emailsignin = new EmailSignIn();

        //Providing Body
        emailsignin.setEmail(valueForTheGivenKey("Email"));
        emailsignin.setPassword(valueForTheGivenKey("Password"));


        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(emailsignin)
                .post(EndPoints.POST_EmailSignIn)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response SendEmailOTP()
    {

        //Creating Object for Setter Class
        SendOTP sendOTP = new SendOTP();

        //Providing Body
        sendOTP.setEmail(valueForTheGivenKey("Email"));
        sendOTP.setIsPhoneNumber(false);

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(sendOTP)
                .post(EndPoints.POST_SendOTP)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response SendMobileOTP()
    {

        //Creating Object for Setter Class
        SendOTP sendOTP = new SendOTP();

        //Providing Body
        sendOTP.setPhoneNumber("+91 "+valueForTheGivenKey("phoneNumber"));
        sendOTP.setDialCode("+91");
        sendOTP.setIsPhoneNumber(true);

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(sendOTP)
                .post(EndPoints.POST_SendOTP)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response ForgotPassword()
    {

        //Creating Object for Setter Class
        ForgotPassword forgotPassword = new ForgotPassword();

        //Providing Body
        forgotPassword.setEmail(valueForTheGivenKey("Email"));

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(forgotPassword)
                .post(EndPoints.POST_ForgotPassword)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response ResetPassword() throws InstantiationException, IllegalAccessException {

        //Sending OTP to email using SendOTP API
        ForgotPassword();

        //Creating Object for Setter Class
        ResetPassword resetPassword = new ResetPassword();

        //Providing Body
        resetPassword.setResetPasswordToken(_getResult(valueForTheGivenKey("Get_ResetToken"),"String","reset_password_token").toString());
        resetPassword.setNewPassword("qwerty");
        resetPassword.setConfirmPassword("qwerty");

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(resetPassword)
                .post(EndPoints.POST_ResetPassword)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response ChangePassword()
    {

        //Creating Object for Setter Class
        ChangePassword changePassword = new ChangePassword();

        //Providing Body
        changePassword.setNewPassword(valueForTheGivenKey("Password"));

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .when()
                .body(changePassword)
                .post(EndPoints.POST_ChangePassword)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response DemoReschedule()
    {

        //Creating Object for Setter Class
        DemoReschedule demoReschedule = new DemoReschedule();

        //Providing Body
        demoReschedule.setDate(getNextDay());
        demoReschedule.setSlot("9");
        demoReschedule.setStudentId(Integer.parseInt(valueForTheGivenKey("Demo_studentID")));

        Response response = RestAssured
                .given().auth()
                .oauth2(valueForTheGivenKey("Token_DemoUser"))
                .contentType(ContentType.JSON)
                .when()
                .body(demoReschedule)
                .post(EndPoints.POST_DemoReschedule)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response VerifyInvalidOTP() {

        //Creating Object for Setter Class
        VerifyOTP verifyOTP = new VerifyOTP();

        //Providing Body
        verifyOTP.setCode("7261");
        verifyOTP.setEmail(valueForTheGivenKey("Email"));
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(verifyOTP)
                .post(EndPoints.POST_VerifyOTP)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_BAD_REQUEST);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }


    public Response VerifyValidOTP() throws InstantiationException, IllegalAccessException, InterruptedException {

        //Sending OTP to email using SendOTP API
        SendEmailOTP();

        //Waiting for a sec after sending an OTP
        Thread.sleep(1500);

        //Creating Object for Setter Class
        VerifyOTP verifyOTP = new VerifyOTP();

        //Providing Body
        verifyOTP.setCode(_getResult(valueForTheGivenKey("Fetch_OTP"),"int","otp").toString());
        verifyOTP.setEmail(valueForTheGivenKey("Email"));
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(verifyOTP)
                .post(EndPoints.POST_VerifyOTP)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response MasterLogin(){

        //Creating Object for Setter Class
        MasterLogin masterLogin = new MasterLogin();

        //Providing Body
        masterLogin.setPhoneNumber(valueForTheGivenKey("phoneNumber"));
        masterLogin.setPassword("hr26ec2");

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(masterLogin)
                .post(EndPoints.POST_MasterLogin)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response PostGlobalHouseRequest() throws InstantiationException, IllegalAccessException {

        //Clering Data of Test User from DB
        _getResult(valueForTheGivenKey("DeleteGlobalHouseEntry"), null, null);

        //Creating Object for GET_Method_Helper Class to fetch the Available Dates and Slots from getGlobalHouseSlot() method
        GET_Method_Helper GMH = new GET_Method_Helper();

        //Creating Object for Setter Class
        GlobalHouseRequest globalhouserequest = new GlobalHouseRequest();

        //Creating multiple objects for Same Class because of Arrays of Json Objects
        PreferredSlot preferredslot1 = new PreferredSlot();
        PreferredSlot preferredslot2 = new PreferredSlot();
        PreferredSlot preferredslot3 = new PreferredSlot();

        //Providing Body
        preferredslot1.setDate(GMH.getGlobalHouseSlot().jsonPath().getString("data.preferred_time[0].date.date"));
        preferredslot1.setSlot(Integer.parseInt(GMH.getGlobalHouseSlot().jsonPath().getString("data.preferred_time[0].slots[0].slot")));
        preferredslot2.setDate(GMH.getGlobalHouseSlot().jsonPath().getString("data.preferred_time[1].date.date"));
        preferredslot2.setSlot(Integer.parseInt(GMH.getGlobalHouseSlot().jsonPath().getString("data.preferred_time[1].slots[0].slot")));
        preferredslot3.setDate(GMH.getGlobalHouseSlot().jsonPath().getString("data.preferred_time[2].date.date"));
        preferredslot3.setSlot(Integer.parseInt(GMH.getGlobalHouseSlot().jsonPath().getString("data.preferred_time[2].slots[0].slot")));

        //Cretaing an Object of List Type and adding all the PreferredSlot Objects into this List
        List<PreferredSlot> jsonArrayPreferredSlot = new ArrayList<>();

        jsonArrayPreferredSlot.add(preferredslot1);
        jsonArrayPreferredSlot.add(preferredslot2);
        jsonArrayPreferredSlot.add(preferredslot3);

        //Providing Body to Main Class GlobalHouseRequest
        globalhouserequest.setUserId(Integer.parseInt(valueForTheGivenKey("studentId")));
        globalhouserequest.setPreferredSlots(jsonArrayPreferredSlot);

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .when()
                .body(globalhouserequest)
                .post(EndPoints.POST_GlobalHouseRequest)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response UploadProfilePic()
    {

        //Creating File Object and Setting Path of a file
        File image = new File(System.getProperty("user.dir")+"/resources/flower.jpg");

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .multiPart("profile", image,"multipart/form-data")
                .formParam("id", 51540)
                .when()
                .post(EndPoints.POST_UploadProfilePic)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        //Validating the Response fo the POST API
        Assert.assertNotNull(response.jsonPath().getString("encoding"));
        Assert.assertNotNull(response.jsonPath().getString("mimetype"));
        Assert.assertNotNull(response.jsonPath().getString("destination"));
        Assert.assertNotNull(response.jsonPath().getString("filename"));
        Assert.assertNotNull(response.jsonPath().getString("size"));

        return response;

    }

    public Response AddBeans(){

        //Creating an ArrayList Object
        ArrayList<Integer> arraylist = new ArrayList<>();

        //Adding random int value at 0th index
        arraylist.add(new Random().nextInt(10)+1);

        //Creating Object for Setter Class
        AddBeans addbeans = new AddBeans();

        //Providing Body
        addbeans.setStudentId(Integer.parseInt(valueForTheGivenKey("studentId")));
        addbeans.setActionsId(arraylist);

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .when()
                .body(addbeans)
                .post(EndPoints.POST_AddBeans)
                .andReturn();


        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }



}
