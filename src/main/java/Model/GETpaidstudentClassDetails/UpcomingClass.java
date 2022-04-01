package Model.GETpaidstudentClassDetails;

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
        "class_id",
        "currentTime",
        "date",
        "slot",
        "teacher_id",
        "date_time",
        "is_class_partially_cancelled",
        "class_time_gmt",
        "db_date",
        "time_diff",
        "is_class_available_on_mobile"
})
@Generated("jsonschema2pojo")
public class UpcomingClass {

    @JsonProperty("class_id")
    private Integer classId;
    @JsonProperty("currentTime")
    private String currentTime;
    @JsonProperty("date")
    private String date;
    @JsonProperty("slot")
    private String slot;
    @JsonProperty("teacher_id")
    private String teacherId;
    @JsonProperty("date_time")
    private String dateTime;
    @JsonProperty("is_class_partially_cancelled")
    private Boolean isClassPartiallyCancelled;
    @JsonProperty("class_time_gmt")
    private String classTimeGmt;
    @JsonProperty("db_date")
    private String dbDate;
    @JsonProperty("time_diff")
    private String timeDiff;
    @JsonProperty("is_class_available_on_mobile")
    private Boolean isClassAvailableOnMobile;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("class_id")
    public Integer getClassId() {
        return classId;
    }

    @JsonProperty("class_id")
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @JsonProperty("currentTime")
    public String getCurrentTime() {
        return currentTime;
    }

    @JsonProperty("currentTime")
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("slot")
    public String getSlot() {
        return slot;
    }

    @JsonProperty("slot")
    public void setSlot(String slot) {
        this.slot = slot;
    }

    @JsonProperty("teacher_id")
    public String getTeacherId() {
        return teacherId;
    }

    @JsonProperty("teacher_id")
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @JsonProperty("date_time")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("date_time")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("is_class_partially_cancelled")
    public Boolean getIsClassPartiallyCancelled() {
        return isClassPartiallyCancelled;
    }

    @JsonProperty("is_class_partially_cancelled")
    public void setIsClassPartiallyCancelled(Boolean isClassPartiallyCancelled) {
        this.isClassPartiallyCancelled = isClassPartiallyCancelled;
    }

    @JsonProperty("class_time_gmt")
    public String getClassTimeGmt() {
        return classTimeGmt;
    }

    @JsonProperty("class_time_gmt")
    public void setClassTimeGmt(String classTimeGmt) {
        this.classTimeGmt = classTimeGmt;
    }

    @JsonProperty("db_date")
    public String getDbDate() {
        return dbDate;
    }

    @JsonProperty("db_date")
    public void setDbDate(String dbDate) {
        this.dbDate = dbDate;
    }

    @JsonProperty("time_diff")
    public String getTimeDiff() {
        return timeDiff;
    }

    @JsonProperty("time_diff")
    public void setTimeDiff(String timeDiff) {
        this.timeDiff = timeDiff;
    }

    @JsonProperty("is_class_available_on_mobile")
    public Boolean getIsClassAvailableOnMobile() {
        return isClassAvailableOnMobile;
    }

    @JsonProperty("is_class_available_on_mobile")
    public void setIsClassAvailableOnMobile(Boolean isClassAvailableOnMobile) {
        this.isClassAvailableOnMobile = isClassAvailableOnMobile;
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
