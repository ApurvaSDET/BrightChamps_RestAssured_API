package Model.GETStudentFeed;

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
        "class_number",
        "date",
        "slot",
        "student_joined",
        "student_left",
        "duration",
        "label",
        "concept_learn",
        "assignment",
        "db_date"
})
@Generated("jsonschema2pojo")
public class Detail {

    @JsonProperty("class_number")
    private String classNumber;
    @JsonProperty("date")
    private String date;
    @JsonProperty("slot")
    private String slot;
    @JsonProperty("student_joined")
    private String studentJoined;
    @JsonProperty("student_left")
    private String studentLeft;
    @JsonProperty("duration")
    private Object duration;
    @JsonProperty("label")
    private String label;
    @JsonProperty("concept_learn")
    private List<List<String>> conceptLearn = null;
    @JsonProperty("assignment")
    private List<Assignment> assignment = null;
    @JsonProperty("db_date")
    private String dbDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("class_number")
    public String getClassNumber() {
        return classNumber;
    }

    @JsonProperty("class_number")
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
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

    @JsonProperty("student_joined")
    public String getStudentJoined() {
        return studentJoined;
    }

    @JsonProperty("student_joined")
    public void setStudentJoined(String studentJoined) {
        this.studentJoined = studentJoined;
    }

    @JsonProperty("student_left")
    public String getStudentLeft() {
        return studentLeft;
    }

    @JsonProperty("student_left")
    public void setStudentLeft(String studentLeft) {
        this.studentLeft = studentLeft;
    }

    @JsonProperty("duration")
    public Object getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Object duration) {
        this.duration = duration;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("concept_learn")
    public List<List<String>> getConceptLearn() {
        return conceptLearn;
    }

    @JsonProperty("concept_learn")
    public void setConceptLearn(List<List<String>> conceptLearn) {
        this.conceptLearn = conceptLearn;
    }

    @JsonProperty("assignment")
    public List<Assignment> getAssignment() {
        return assignment;
    }

    @JsonProperty("assignment")
    public void setAssignment(List<Assignment> assignment) {
        this.assignment = assignment;
    }

    @JsonProperty("db_date")
    public String getDbDate() {
        return dbDate;
    }

    @JsonProperty("db_date")
    public void setDbDate(String dbDate) {
        this.dbDate = dbDate;
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
