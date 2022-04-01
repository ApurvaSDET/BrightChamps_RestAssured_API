package Model.GETStudentsProfile;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "student_id",
        "city",
        "country",
        "date_of_birth",
        "date_of_enrol",
        "father_email_id",
        "father_name",
        "father_phone_number",
        "gender",
        "grade",
        "hobbies",
        "mother_email_id",
        "mother_name",
        "mother_phone_number",
        "package_sold",
        "parent_name",
        "primary_email_id",
        "primary_phone_number",
        "profile_image",
        "referral_count",
        "school_name",
        "student_name",
        "teacher_id",
        "teacher_name",
        "time_differance",
        "timezone",
        "batch_id",
        "user_name",
        "package",
        "is_paid_student",
        "country_id",
        "student_type",
        "profile_percent"
})
@Generated("jsonschema2pojo")
public class StudentsProfile {

    @JsonProperty("student_id")
    private Integer studentId;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    @JsonProperty("date_of_enrol")
    private String dateOfEnrol;
    @JsonProperty("father_email_id")
    private String fatherEmailId;
    @JsonProperty("father_name")
    private String fatherName;
    @JsonProperty("father_phone_number")
    private String fatherPhoneNumber;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("hobbies")
    private String hobbies;
    @JsonProperty("mother_email_id")
    private String motherEmailId;
    @JsonProperty("mother_name")
    private String motherName;
    @JsonProperty("mother_phone_number")
    private String motherPhoneNumber;
    @JsonProperty("package_sold")
    private String packageSold;
    @JsonProperty("parent_name")
    private String parentName;
    @JsonProperty("primary_email_id")
    private String primaryEmailId;
    @JsonProperty("primary_phone_number")
    private String primaryPhoneNumber;
    @JsonProperty("profile_image")
    private String profileImage;
    @JsonProperty("referral_count")
    private String referralCount;
    @JsonProperty("school_name")
    private String schoolName;
    @JsonProperty("student_name")
    private String studentName;
    @JsonProperty("teacher_id")
    private Integer teacherId;
    @JsonProperty("teacher_name")
    private String teacherName;
    @JsonProperty("time_differance")
    private String timeDifferance;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("batch_id")
    private Object batchId;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("package")
    private String _package;
    @JsonProperty("is_paid_student")
    private Boolean isPaidStudent;
    @JsonProperty("country_id")
    private String countryId;
    @JsonProperty("student_type")
    private String studentType;
    @JsonProperty("profile_percent")
    private Integer profilePercent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("student_id")
    public Integer getStudentId() {
        return studentId;
    }

    @JsonProperty("student_id")
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("date_of_enrol")
    public String getDateOfEnrol() {
        return dateOfEnrol;
    }

    @JsonProperty("date_of_enrol")
    public void setDateOfEnrol(String dateOfEnrol) {
        this.dateOfEnrol = dateOfEnrol;
    }

    @JsonProperty("father_email_id")
    public String getFatherEmailId() {
        return fatherEmailId;
    }

    @JsonProperty("father_email_id")
    public void setFatherEmailId(String fatherEmailId) {
        this.fatherEmailId = fatherEmailId;
    }

    @JsonProperty("father_name")
    public String getFatherName() {
        return fatherName;
    }

    @JsonProperty("father_name")
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @JsonProperty("father_phone_number")
    public String getFatherPhoneNumber() {
        return fatherPhoneNumber;
    }

    @JsonProperty("father_phone_number")
    public void setFatherPhoneNumber(String fatherPhoneNumber) {
        this.fatherPhoneNumber = fatherPhoneNumber;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @JsonProperty("hobbies")
    public String getHobbies() {
        return hobbies;
    }

    @JsonProperty("hobbies")
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @JsonProperty("mother_email_id")
    public String getMotherEmailId() {
        return motherEmailId;
    }

    @JsonProperty("mother_email_id")
    public void setMotherEmailId(String motherEmailId) {
        this.motherEmailId = motherEmailId;
    }

    @JsonProperty("mother_name")
    public String getMotherName() {
        return motherName;
    }

    @JsonProperty("mother_name")
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @JsonProperty("mother_phone_number")
    public String getMotherPhoneNumber() {
        return motherPhoneNumber;
    }

    @JsonProperty("mother_phone_number")
    public void setMotherPhoneNumber(String motherPhoneNumber) {
        this.motherPhoneNumber = motherPhoneNumber;
    }

    @JsonProperty("package_sold")
    public String getPackageSold() {
        return packageSold;
    }

    @JsonProperty("package_sold")
    public void setPackageSold(String packageSold) {
        this.packageSold = packageSold;
    }

    @JsonProperty("parent_name")
    public String getParentName() {
        return parentName;
    }

    @JsonProperty("parent_name")
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @JsonProperty("primary_email_id")
    public String getPrimaryEmailId() {
        return primaryEmailId;
    }

    @JsonProperty("primary_email_id")
    public void setPrimaryEmailId(String primaryEmailId) {
        this.primaryEmailId = primaryEmailId;
    }

    @JsonProperty("primary_phone_number")
    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    @JsonProperty("primary_phone_number")
    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    @JsonProperty("profile_image")
    public String getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @JsonProperty("referral_count")
    public String getReferralCount() {
        return referralCount;
    }

    @JsonProperty("referral_count")
    public void setReferralCount(String referralCount) {
        this.referralCount = referralCount;
    }

    @JsonProperty("school_name")
    public String getSchoolName() {
        return schoolName;
    }

    @JsonProperty("school_name")
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @JsonProperty("student_name")
    public String getStudentName() {
        return studentName;
    }

    @JsonProperty("student_name")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @JsonProperty("teacher_id")
    public Integer getTeacherId() {
        return teacherId;
    }

    @JsonProperty("teacher_id")
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @JsonProperty("teacher_name")
    public String getTeacherName() {
        return teacherName;
    }

    @JsonProperty("teacher_name")
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @JsonProperty("time_differance")
    public String getTimeDifferance() {
        return timeDifferance;
    }

    @JsonProperty("time_differance")
    public void setTimeDifferance(String timeDifferance) {
        this.timeDifferance = timeDifferance;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("batch_id")
    public Object getBatchId() {
        return batchId;
    }

    @JsonProperty("batch_id")
    public void setBatchId(Object batchId) {
        this.batchId = batchId;
    }

    @JsonProperty("user_name")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("package")
    public String getPackage() {
        return _package;
    }

    @JsonProperty("package")
    public void setPackage(String _package) {
        this._package = _package;
    }

    @JsonProperty("is_paid_student")
    public Boolean getIsPaidStudent() {
        return isPaidStudent;
    }

    @JsonProperty("is_paid_student")
    public void setIsPaidStudent(Boolean isPaidStudent) {
        this.isPaidStudent = isPaidStudent;
    }

    @JsonProperty("country_id")
    public String getCountryId() {
        return countryId;
    }

    @JsonProperty("country_id")
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("student_type")
    public String getStudentType() {
        return studentType;
    }

    @JsonProperty("student_type")
    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    @JsonProperty("profile_percent")
    public Integer getProfilePercent() {
        return profilePercent;
    }

    @JsonProperty("profile_percent")
    public void setProfilePercent(Integer profilePercent) {
        this.profilePercent = profilePercent;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}