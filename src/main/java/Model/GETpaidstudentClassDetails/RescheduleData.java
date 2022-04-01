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
        "class_cancelled",
        "class_rescheduled",
        "class_cancelled_percentage",
        "class_cancelled_text",
        "class_rescheduled_percentage",
        "class_rescheduled_text"
})
@Generated("jsonschema2pojo")
public class RescheduleData {

    @JsonProperty("class_cancelled")
    private Integer classCancelled;
    @JsonProperty("class_rescheduled")
    private Integer classRescheduled;
    @JsonProperty("class_cancelled_percentage")
    private String classCancelledPercentage;
    @JsonProperty("class_cancelled_text")
    private String classCancelledText;
    @JsonProperty("class_rescheduled_percentage")
    private String classRescheduledPercentage;
    @JsonProperty("class_rescheduled_text")
    private String classRescheduledText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("class_cancelled")
    public Integer getClassCancelled() {
        return classCancelled;
    }

    @JsonProperty("class_cancelled")
    public void setClassCancelled(Integer classCancelled) {
        this.classCancelled = classCancelled;
    }

    @JsonProperty("class_rescheduled")
    public Integer getClassRescheduled() {
        return classRescheduled;
    }

    @JsonProperty("class_rescheduled")
    public void setClassRescheduled(Integer classRescheduled) {
        this.classRescheduled = classRescheduled;
    }

    @JsonProperty("class_cancelled_percentage")
    public String getClassCancelledPercentage() {
        return classCancelledPercentage;
    }

    @JsonProperty("class_cancelled_percentage")
    public void setClassCancelledPercentage(String classCancelledPercentage) {
        this.classCancelledPercentage = classCancelledPercentage;
    }

    @JsonProperty("class_cancelled_text")
    public String getClassCancelledText() {
        return classCancelledText;
    }

    @JsonProperty("class_cancelled_text")
    public void setClassCancelledText(String classCancelledText) {
        this.classCancelledText = classCancelledText;
    }

    @JsonProperty("class_rescheduled_percentage")
    public String getClassRescheduledPercentage() {
        return classRescheduledPercentage;
    }

    @JsonProperty("class_rescheduled_percentage")
    public void setClassRescheduledPercentage(String classRescheduledPercentage) {
        this.classRescheduledPercentage = classRescheduledPercentage;
    }

    @JsonProperty("class_rescheduled_text")
    public String getClassRescheduledText() {
        return classRescheduledText;
    }

    @JsonProperty("class_rescheduled_text")
    public void setClassRescheduledText(String classRescheduledText) {
        this.classRescheduledText = classRescheduledText;
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