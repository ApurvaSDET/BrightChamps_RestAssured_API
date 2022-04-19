package Model;

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
        "studentId",
        "actionsId"
})
@Generated("jsonschema2pojo")
public class AddBeans {

    @JsonProperty("studentId")
    private Integer studentId;
    @JsonProperty("actionsId")
    private List<Integer> actionsId = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("studentId")
    public Integer getStudentId() {
        return studentId;
    }

    @JsonProperty("studentId")
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @JsonProperty("actionsId")
    public List<Integer> getActionsId() {
        return actionsId;
    }

    @JsonProperty("actionsId")
    public void setActionsId(List<Integer> actionsId) {
        this.actionsId = actionsId;
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
