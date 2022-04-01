package Tests;

import Helpers.GET_Method_Helper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GET_Methods_Test {

    private GET_Method_Helper GET_Method_Helper;


    @BeforeMethod(alwaysRun = true)
    public void init(){

        GET_Method_Helper = new GET_Method_Helper();

    }

    @Test(groups = {"Regression","SmokeTest"})
    public void GET_ProfileDetails(){

        Assert.assertNotNull(GET_Method_Helper.getProfile());
    }

    @Test(groups = {"Regression"})
    public void GET_PaidStudentClassDetails(){

        Assert.assertNotNull(GET_Method_Helper.getPaidStudentClassDetails());
    }

    @Test(groups = {"Regression"})
    public void GET_Certificates() {

        Assert.assertNotNull(GET_Method_Helper.getCertificates());
        Assert.assertFalse(GET_Method_Helper.getCertificates().getData().getNextLevelCertificates().isEmpty());

    }

    @Test(groups = {"Regression"})
    public void GET_StudentFeed() {

        Assert.assertNotNull(GET_Method_Helper.getStudentFeed().getData().getStudentId());

    }

    @Test(groups = {"Regression"})
    public void GET_NextInstallment() {

        Assert.assertEquals(GET_Method_Helper.getNextInstallment().jsonPath().getString("msg"),"Instalment does not exists");

    }

    @Test(groups = {"Regression"})
    public void GET_Quiz() {

        Assert.assertNotNull(GET_Method_Helper.getQuiz());

    }

    @Test(groups = {"Regression"})
    public void GET_Freemium() {

        Assert.assertNotNull(GET_Method_Helper.getFreemium());

    }

    @Test(groups = {"Regression"})
    public void GET_ReferralLink() {

        Assert.assertNotNull(GET_Method_Helper.getReferralLink());

    }

    @Test(groups = {"Regression"})
    public void GET_LeaderBoard() {

        Assert.assertFalse(GET_Method_Helper.getLeaderBoard().getData().getLeaderBoard().isEmpty());

    }

    @Test(groups = {"Regression"})
    public void GET_CancelReasonList() {

        Assert.assertNotNull(GET_Method_Helper.getCancelReasonList());

    }

    @Test(groups = {"Regression"})
    public void GET_UpgradePlan() {

        Assert.assertNotNull(GET_Method_Helper.getUpgradePlanforPaidStudents());

    }

    @Test(groups = {"Regression"})
    public void GET_DemoDetails() {

        Assert.assertNotNull(GET_Method_Helper.getDemoClassDetails());

    }

    @Test(groups = {"Regression"})
    public void GET_GlobalHouseDetails() {

        Assert.assertNotNull(GET_Method_Helper.getGlobalHouseDetails().getData());

    }

    @Test(groups = {"Regression"})
    public void GET_PaymentForDemoStudents() {

        Assert.assertNotNull(GET_Method_Helper.getPaymentforDemoStudents());

    }

    @Test(groups = {"Regression"})
    public void GET_DemoSlots() {

        Assert.assertNotNull(GET_Method_Helper.getDemoSlots());

    }

    @Test(groups = {"Regression"})
    public void GET_HobbiesList() {

        Assert.assertNotNull(GET_Method_Helper.getHobbiesList());

    }

    @Test(groups = {"Regression"})
    public void GET_UpcomingClass() {

        Assert.assertFalse(GET_Method_Helper.getUpcomingCLass().getData().isEmpty());

    }

    @Test(groups = {"Regression"})
    public void GET_ProjectVideos() {

        Assert.assertFalse(GET_Method_Helper.getProjectVideos().getData().isEmpty());

    }

    @Test(groups = {"Regression"})
    public void GET_BuyPlan() {

        Assert.assertNotNull(GET_Method_Helper.getBuyPlan());

    }


    @Test(groups = {"Regression"})
    public void GET_NextInstallmentLink() {

        Assert.assertTrue(GET_Method_Helper.getNextInstallmentLink().jsonPath().getString("link").contains("https://payments.brightchamps.com"));

    }

    @Test(groups = {"Regression"})
    public void GET_GlobalHouseSlots() {

        Assert.assertNotNull(GET_Method_Helper.getGlobalHouseSlot());

    }

    @Test(groups = {"Regression"})
    public void GET_TeacherAvailabilityWeek() {

        Assert.assertNotNull(GET_Method_Helper.getTeacherWeekAvailability());

    }

    @Test(groups = {"Regression","SmokeTest"})
    public void GET_TeacherAvailability() {

        Assert.assertNotNull(GET_Method_Helper.getTeacherAvailability());

    }

}
