package Model;

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
        "primary_email_id",
        "primary_phone_number",
        "school_name",
        "student_name",
        "teacher_name"
})
@Generated("jsonschema2pojo")
public class UpdateStudentProfile {

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
    @JsonProperty("primary_email_id")
    private String primaryEmailId;
    @JsonProperty("primary_phone_number")
    private String primaryPhoneNumber;
    @JsonProperty("school_name")
    private String schoolName;
    @JsonProperty("student_name")
    private String studentName;
    @JsonProperty("teacher_name")
    private String teacherName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("teacher_name")
    public String getTeacherName() {
        return teacherName;
    }

    @JsonProperty("teacher_name")
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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