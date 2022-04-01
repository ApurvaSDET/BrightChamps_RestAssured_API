package Model.GetLeaderBoard;

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
        "student_profile_image",
        "student_name",
        "student_grade",
        "student_referral",
        "student_rank"
})
@Generated("jsonschema2pojo")
public class LeaderBoard {

    @JsonProperty("student_profile_image")
    private Object studentProfileImage;
    @JsonProperty("student_name")
    private String studentName;
    @JsonProperty("student_grade")
    private String studentGrade;
    @JsonProperty("student_referral")
    private String studentReferral;
    @JsonProperty("student_rank")
    private Integer studentRank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("student_profile_image")
    public Object getStudentProfileImage() {
        return studentProfileImage;
    }

    @JsonProperty("student_profile_image")
    public void setStudentProfileImage(Object studentProfileImage) {
        this.studentProfileImage = studentProfileImage;
    }

    @JsonProperty("student_name")
    public String getStudentName() {
        return studentName;
    }

    @JsonProperty("student_name")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @JsonProperty("student_grade")
    public String getStudentGrade() {
        return studentGrade;
    }

    @JsonProperty("student_grade")
    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    @JsonProperty("student_referral")
    public String getStudentReferral() {
        return studentReferral;
    }

    @JsonProperty("student_referral")
    public void setStudentReferral(String studentReferral) {
        this.studentReferral = studentReferral;
    }

    @JsonProperty("student_rank")
    public Integer getStudentRank() {
        return studentRank;
    }

    @JsonProperty("student_rank")
    public void setStudentRank(Integer studentRank) {
        this.studentRank = studentRank;
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
