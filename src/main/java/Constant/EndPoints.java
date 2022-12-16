package Constant;

import Utils.ConfigManager;

public class EndPoints {

    public static final String GET_Student_Profile = "/student-profile";
    public static final String GET_PaidStudentClassDetails = "/classes-detail";
    public static final String GET_Certificate = "/certificate";
    public static final String GET_StudentFeed = "/student-feed/"+ConfigManager.valueForTheGivenKey("studentId");
    public static final String PUT_StudentProfile = "/student-profile";
    public static final String GET_NextInstallment = "/next-installment";
    public static final String GET_Quiz = "/quiz";
    public static final String GET_FreemiumProfile = "/freemium-profile";
    public static final String GET_ReferralLink = "/referral-link";
    public static final String GET_LeaderBoard = "/leader-board";
    public static final String POST_EmailSignIn = "/email-signin";
    public static final String GET_CancelReasonList = "/reason";
    public static final String GET_UpgradePlan = "/upgrade-plan";
    public static final String GET_DemoClassDetails = "/demo-class-detail";
    public static final String GET_globalHouseDetails = "/global-house";
    public static final String GET_PaymentForDemoStudents = "/first-payement";
    public static final String GET_Demo_Slots = "/demo-slots";
    public static final String GET_HobbiesList = "/hobbies-list";
    public static final String GET_UpcomingCLass = "/upcoming-classes";
    public static final String GET_ProjectVideos = "/project-videos";
    public static final String GET_BuyPlan = "/buy-plan";
    public static final String GET_NextInstallmentLink = "/next-installment-link";
    public static final String GET_GlobalHouseSlots= "/global-house-slots";
    public static final String GET_TeacherAvailabilityWeek= "/teacher-availability-week";
    public static final String GET_TeacherAvailability= "/teacher-availability";
    public static final String GET_Beans = "/getBeans/"+ConfigManager.valueForTheGivenKey("studentId");
    public static final String POST_SendOTP = "/send-otp";
    public static final String POST_ForgotPassword = "/forgot-password";
    public static final String POST_ResetPassword = "/reset-password";
    public static final String POST_ChangePassword = "/change-password";
    public static final String POST_DemoReschedule = "/demo-reschedule";
    public static final String POST_VerifyOTP = "/verify-otp";
    public static final String POST_MasterLogin = "/master-login";
    public static final String POST_GlobalHouseRequest = "/global-house";
    public static final String POST_UploadProfilePic = "/upload-file";
    public static final String POST_AddBeans = "/addBeans";
    public static final String POST_Create_Lead_10x = "/create-new-lead";



}
