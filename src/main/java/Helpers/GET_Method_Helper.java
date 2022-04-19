package Helpers;

import Constant.EndPoints;
import Model.GETCertificates.Certificates;
import Model.GETStudentFeed.StudentFeed;
import Model.GETpaidstudentClassDetails.PaidStudentClassDetailsData;
import Model.GETStudentsProfile.StudentsProfile;
import Model.GetLeaderBoard.LeaderBoard;
import Model.GetLeaderBoard.LeaderBoardData;
import Model.GlobalHouseDetails.GlobalHouse;
import Model.UpcomingClasses.UpcomingClass;
import Model.Videos.ProjectVideos;
import Utils.ConfigManager;
import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import org.testng.Assert;

public class GET_Method_Helper extends ConfigManager {

    public GET_Method_Helper(){

        RestAssured.baseURI = BASE_URL;

    }

    public StudentsProfile getProfile()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("phoneNumber",ConfigManager.valueForTheGivenKey("phoneNumber"))
                .get(EndPoints.GET_Student_Profile)
                .andReturn();

        Type type = new TypeReference<StudentsProfile>(){}.getType();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        StudentsProfile ProfileDetails = response.as(type);

        return ProfileDetails;

    }

    public PaidStudentClassDetailsData getPaidStudentClassDetails()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId",ConfigManager.valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_PaidStudentClassDetails)
                .andReturn();

        Type type = new TypeReference<PaidStudentClassDetailsData>(){}.getType();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        PaidStudentClassDetailsData PaidStudentClassDetails = response.as(type);

        return PaidStudentClassDetails;

    }

    public Certificates getCertificates()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("userId",ConfigManager.valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_Certificate)
                .andReturn();

        Type type = new TypeReference<Certificates>(){}.getType();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        Certificates certificates = response.as(type);

        return certificates;

    }

    public StudentFeed getStudentFeed()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("pageCounter","1")
                .get(EndPoints.GET_StudentFeed)
                .andReturn();

        Type type = new TypeReference<StudentFeed>(){}.getType();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("data.feed[1].promo_link"));
        Assert.assertNotNull(response.jsonPath().getString("data.feed[1].know_more_link"));
        Assert.assertNotNull(response.jsonPath().getString("data.feed[1].referralClass.Count"));
        Assert.assertNotNull(response.jsonPath().getString("data.feed[0].detail"));

        StudentFeed studentfeed = response.as(type);

        return studentfeed;

    }

    public Response getNextInstallment()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(valueForTheGivenKey("Token_P"))
                .contentType(ContentType.JSON)
                .param("studentId","51537")
                .get(EndPoints.GET_NextInstallment)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));


        return response;

    }

    public Response getQuiz()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("userId",ConfigManager.valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_Quiz)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("data[0].form_id"));
        Assert.assertNotNull(response.jsonPath().getString("data[0].quiz_url"));
        Assert.assertNotNull(response.jsonPath().getString("data[0].quiz_id"));

        return response;

    }

    public Response getFreemium()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId",ConfigManager.valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_FreemiumProfile)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNull(response.jsonPath().getString("data.nudge"));
        Assert.assertNull(response.jsonPath().getString("data.completionPercentage"));

        return response;

    }

    public Response getReferralLink()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId",ConfigManager.valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_ReferralLink)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("data.promo_link"));
        Assert.assertNotNull(response.jsonPath().getString("data.know_more_link"));
        Assert.assertNotNull(response.jsonPath().getString("data.referralClass.Count"));
        Assert.assertNotNull(response.jsonPath().getString("data.referralClass.result[0].name"));

        return response;

    }

    public LeaderBoardData getLeaderBoard()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("userId",ConfigManager.valueForTheGivenKey("studentId"))
                .param("type","referral")
                .get(EndPoints.GET_LeaderBoard)
                .andReturn();

        Type type = new TypeReference<LeaderBoardData>(){}.getType();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("data.referral_count"));
        Assert.assertNotNull(response.jsonPath().getString("data.rank"));
        Assert.assertNotNull(response.jsonPath().getString("data.leader_board[0].student_name"));
        Assert.assertNotNull(response.jsonPath().getString("data.leader_board[0].student_grade"));
        Assert.assertNotNull(response.jsonPath().getString("data.leader_board[0].student_referral"));
        Assert.assertNotNull(response.jsonPath().getString("data.leader_board[0].student_rank"));


        LeaderBoardData leaderBoard = response.as(type);

        return leaderBoard;

    }

    public Response getCancelReasonList()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("canceller","student")
                .get(EndPoints.GET_CancelReasonList)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("data[1].id"));
        Assert.assertNotNull(response.jsonPath().getString("data[2].canceller"));
        Assert.assertNotNull(response.jsonPath().getString("data[3].reason"));

        return response;

    }

    public Response getUpgradePlanforPaidStudents()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId","1057") //Prod user #user_id = 1057
                .get(EndPoints.GET_UpgradePlan)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) < Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("data.current_package[0].package_id"));
        Assert.assertNotNull(response.jsonPath().getString("data.current_package[0].display_name"));
        Assert.assertNotNull(response.jsonPath().getString("data.current_package[0].price"));
        Assert.assertNotNull(response.jsonPath().getString("data.current_package[0].class_offered[0].label"));
        Assert.assertNotNull(response.jsonPath().getString("data.upgrade_package[0].package_id"));
        Assert.assertNotNull(response.jsonPath().getString("data.upgrade_package[0].display_name"));
        Assert.assertNotNull(response.jsonPath().getString("data.upgrade_package[0].price"));
        Assert.assertNotNull(response.jsonPath().getString("data.upgrade_package[0].class_offered[0].label"));

        return response;

    }

    public Response getDemoClassDetails()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId",51537)
                .get(EndPoints.GET_DemoClassDetails)
                .andReturn();



        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertEquals("true",response.jsonPath().getString("data.is_demo_completed"));
        Assert.assertNotNull(response.jsonPath().getString("data.project_info[0].videoSrc"));

        return response;

    }

    public GlobalHouse getGlobalHouseDetails()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("userId",ConfigManager.valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_globalHouseDetails)
                .andReturn();

        Type type = new TypeReference<GlobalHouse>(){}.getType();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertEquals("Global house details",response.jsonPath().getString("message"));

        GlobalHouse globalhouse = response.as(type);

        return globalhouse;

    }

    public Response getPaymentforDemoStudents()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId",ConfigManager.valueForTheGivenKey("studentId"))
                .param("packageId","2")
                .get(EndPoints.GET_PaymentForDemoStudents)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertTrue(response.jsonPath().getString("data").contains("payments.brightchamps.com"));

        return response;

    }

    public Response getDemoSlots()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(valueForTheGivenKey("Token_DemoUser"))
                .contentType(ContentType.JSON)
                .param("studentId",ConfigManager.valueForTheGivenKey("Demo_studentID"))
                .get(EndPoints.GET_Demo_Slots)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("msg[0].date"));
        Assert.assertNotNull(response.jsonPath().getString("msg[0].day"));
        Assert.assertNotNull(response.jsonPath().getString("msg[0].slot[0]"));

        return response;

    }

    public Response getHobbiesList()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .get(EndPoints.GET_HobbiesList)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("data[4].id"));
        Assert.assertNotNull(response.jsonPath().getString("data[4].type"));

        return response;

    }

    public UpcomingClass getUpcomingCLass()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId",ConfigManager.valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_UpcomingCLass)
                .andReturn();

        Type type = new TypeReference<UpcomingClass>(){}.getType();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        UpcomingClass upcomingClass = response.as(type);

        return upcomingClass;

    }

    public ProjectVideos getProjectVideos()
    {

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .get(EndPoints.GET_ProjectVideos)
                .andReturn();

        Type type = new TypeReference<ProjectVideos>(){}.getType();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        ProjectVideos projectvideos = response.as(type);

        return projectvideos;

    }

    public Response getBuyPlan()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("studentId",ConfigManager.valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_BuyPlan)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));
        Assert.assertNotNull(response.jsonPath().getString("data[0].plan_name"));
        Assert.assertNotNull(response.jsonPath().getString("data[0].package_id"));
        Assert.assertNotNull(response.jsonPath().getString("data[0].price"));
        Assert.assertNotNull(response.jsonPath().getString("data[0].classes_offered[0].class_count"));
        Assert.assertNotNull(response.jsonPath().getString("data[1].plan_name"));
        Assert.assertNotNull(response.jsonPath().getString("data[1].package_id"));
        Assert.assertNotNull(response.jsonPath().getString("data[1].price"));
        Assert.assertNotNull(response.jsonPath().getString("data[1].classes_offered[0].class_count"));
        Assert.assertNotNull(response.jsonPath().getString("data[2].plan_name"));
        Assert.assertNotNull(response.jsonPath().getString("data[2].package_id"));
        Assert.assertNotNull(response.jsonPath().getString("data[2].price"));
        Assert.assertNotNull(response.jsonPath().getString("data[2].classes_offered[0].class_count"));

        return response;

    }

    public Response getNextInstallmentLink()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(valueForTheGivenKey("Token_P"))
                .contentType(ContentType.JSON)
                .param("studentId","51537")
                .param("stage","Instalment_After_Due_Date")
                .get(EndPoints.GET_NextInstallmentLink)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        return response;

    }

    public Response getGlobalHouseSlot()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .param("userId",valueForTheGivenKey("studentId"))
                .get(EndPoints.GET_GlobalHouseSlots)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        Assert.assertNotNull(response.jsonPath().getString("data.preferred_time[0].date.display_date"));
        Assert.assertNotNull(response.jsonPath().getString("data.preferred_time[0].slots[0].slot"));
        Assert.assertNotNull(response.jsonPath().getString("data.preferred_time[0].slots[0].label"));

        return response;

    }


    public Response getTeacherWeekAvailability()
    {

        //Using Teacher's Base URL
        RestAssured.baseURI = BASE_URL_Teachers;

        Response response = RestAssured
                .given().auth()
                .oauth2(valueForTheGivenKey("Token_P"))
                .contentType(ContentType.JSON)
                .param("studentUserId","51537")
                .get(EndPoints.GET_TeacherAvailabilityWeek)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        Assert.assertNotNull(response.jsonPath().getString("data.teacher_id"));
        Assert.assertNotNull(response.jsonPath().getString("data.available_slot[0].day"));
        Assert.assertNotNull(response.jsonPath().getString("data.available_slot[0].date"));
        Assert.assertNotNull(response.jsonPath().getString("data.available_slot[0].slot[0].time"));

        return response;

    }

    public Response getTeacherAvailability()
    {

        //Using Teacher's Base URL
        RestAssured.baseURI = BASE_URL_Teachers;

        Response response = RestAssured
                .given().auth()
                .oauth2(valueForTheGivenKey("Token_P"))
                .contentType(ContentType.JSON)
                .param("studentUserId","51537")
                .get(EndPoints.GET_TeacherAvailability)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        Assert.assertNotNull(response.jsonPath().getString("data.teacher_id"));
        Assert.assertNotNull(response.jsonPath().getString("data.available_slot[0].day"));
        Assert.assertNotNull(response.jsonPath().getString("data.available_slot[0].slot[0].time"));

        return response;

    }

    public Response getBeans()
    {

        Response response = RestAssured
                .given().auth()
                .oauth2(_generateToken())
                .contentType(ContentType.JSON)
                .get(EndPoints.GET_Beans)
                .andReturn();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        Assert.assertTrue(response.getTimeIn(TimeUnit.MILLISECONDS) <Integer.parseInt(valueForTheGivenKey("APIResponseTime")));

        Assert.assertNotNull(response.jsonPath().getString("data.total_score"));
        Assert.assertNotNull(response.jsonPath().getString("data.actions[0].action"));
        Assert.assertNotNull(response.jsonPath().getString("data.actions[0].point"));
        Assert.assertEquals(response.jsonPath().getString("message"),"success");

        return response;

    }


}
