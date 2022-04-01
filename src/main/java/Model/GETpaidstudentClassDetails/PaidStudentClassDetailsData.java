package Model.GETpaidstudentClassDetails;

import java.util.HashMap;
import java.util.List;
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
        "total_class",
        "rescheduleData",
        "upcoming_classes",
        "is_class_suspended",
        "is_paymentDue_passed",
        "penalty",
        "is_autodebit",
        "attendance_data",
        "attendance_percentage",
        "joined_percentage",
        "joined_percentage_label"
})
@Generated("jsonschema2pojo")
public class PaidStudentClassDetailsData {

    @JsonProperty("student_id")
    private Integer studentId;
    @JsonProperty("total_class")
    private TotalClass totalClass;
    @JsonProperty("rescheduleData")
    private RescheduleData rescheduleData;
    @JsonProperty("upcoming_classes")
    private List<UpcomingClass> upcomingClasses = null;
    @JsonProperty("is_class_suspended")
    private Boolean isClassSuspended;
    @JsonProperty("is_paymentDue_passed")
    private Boolean isPaymentDuePassed;
    @JsonProperty("penalty")
    private Object penalty;
    @JsonProperty("is_autodebit")
    private Boolean isAutodebit;
    @JsonProperty("attendance_data")
    private List<Object> attendanceData = null;
    @JsonProperty("attendance_percentage")
    private Integer attendancePercentage;
    @JsonProperty("joined_percentage")
    private Integer joinedPercentage;
    @JsonProperty("joined_percentage_label")
    private String joinedPercentageLabel;
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

    @JsonProperty("total_class")
    public TotalClass getTotalClass() {
        return totalClass;
    }

    @JsonProperty("total_class")
    public void setTotalClass(TotalClass totalClass) {
        this.totalClass = totalClass;
    }

    @JsonProperty("rescheduleData")
    public RescheduleData getRescheduleData() {
        return rescheduleData;
    }

    @JsonProperty("rescheduleData")
    public void setRescheduleData(RescheduleData rescheduleData) {
        this.rescheduleData = rescheduleData;
    }

    @JsonProperty("upcoming_classes")
    public List<UpcomingClass> getUpcomingClasses() {
        return upcomingClasses;
    }

    @JsonProperty("upcoming_classes")
    public void setUpcomingClasses(List<UpcomingClass> upcomingClasses) {
        this.upcomingClasses = upcomingClasses;
    }

    @JsonProperty("is_class_suspended")
    public Boolean getIsClassSuspended() {
        return isClassSuspended;
    }

    @JsonProperty("is_class_suspended")
    public void setIsClassSuspended(Boolean isClassSuspended) {
        this.isClassSuspended = isClassSuspended;
    }

    @JsonProperty("is_paymentDue_passed")
    public Boolean getIsPaymentDuePassed() {
        return isPaymentDuePassed;
    }

    @JsonProperty("is_paymentDue_passed")
    public void setIsPaymentDuePassed(Boolean isPaymentDuePassed) {
        this.isPaymentDuePassed = isPaymentDuePassed;
    }

    @JsonProperty("penalty")
    public Object getPenalty() {
        return penalty;
    }

    @JsonProperty("penalty")
    public void setPenalty(Object penalty) {
        this.penalty = penalty;
    }

    @JsonProperty("is_autodebit")
    public Boolean getIsAutodebit() {
        return isAutodebit;
    }

    @JsonProperty("is_autodebit")
    public void setIsAutodebit(Boolean isAutodebit) {
        this.isAutodebit = isAutodebit;
    }

    @JsonProperty("attendance_data")
    public List<Object> getAttendanceData() {
        return attendanceData;
    }

    @JsonProperty("attendance_data")
    public void setAttendanceData(List<Object> attendanceData) {
        this.attendanceData = attendanceData;
    }

    @JsonProperty("attendance_percentage")
    public Integer getAttendancePercentage() {
        return attendancePercentage;
    }

    @JsonProperty("attendance_percentage")
    public void setAttendancePercentage(Integer attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    @JsonProperty("joined_percentage")
    public Integer getJoinedPercentage() {
        return joinedPercentage;
    }

    @JsonProperty("joined_percentage")
    public void setJoinedPercentage(Integer joinedPercentage) {
        this.joinedPercentage = joinedPercentage;
    }

    @JsonProperty("joined_percentage_label")
    public String getJoinedPercentageLabel() {
        return joinedPercentageLabel;
    }

    @JsonProperty("joined_percentage_label")
    public void setJoinedPercentageLabel(String joinedPercentageLabel) {
        this.joinedPercentageLabel = joinedPercentageLabel;
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
