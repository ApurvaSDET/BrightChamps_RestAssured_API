package Model.UpcomingClasses;

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
        "date",
        "slot",
        "teacher_id"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("class_id")
    private Integer classId;
    @JsonProperty("date")
    private String date;
    @JsonProperty("slot")
    private String slot;
    @JsonProperty("teacher_id")
    private String teacherId;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString(){

        return String.format("Datum [classId=%s, date=%s, slot=%s, teacherId=%s]", classId, date, slot, teacherId);

    }

}
