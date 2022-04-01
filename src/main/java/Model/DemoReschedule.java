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
        "date",
        "slot",
        "studentId"
})
@Generated("jsonschema2pojo")
public class DemoReschedule {

    @JsonProperty("date")
    private String date;
    @JsonProperty("slot")
    private String slot;
    @JsonProperty("studentId")
    private Integer studentId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("studentId")
    public Integer getStudentId() {
        return studentId;
    }

    @JsonProperty("studentId")
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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