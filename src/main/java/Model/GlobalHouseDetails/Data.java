package Model.GlobalHouseDetails;

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
        "is_applied",
        "is_assigned",
        "details"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("is_applied")
    private Boolean isApplied;
    @JsonProperty("is_assigned")
    private Boolean isAssigned;
    @JsonProperty("details")
    private Object details;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_applied")
    public Boolean getIsApplied() {
        return isApplied;
    }

    @JsonProperty("is_applied")
    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    @JsonProperty("is_assigned")
    public Boolean getIsAssigned() {
        return isAssigned;
    }

    @JsonProperty("is_assigned")
    public void setIsAssigned(Boolean isAssigned) {
        this.isAssigned = isAssigned;
    }

    @JsonProperty("details")
    public Object getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(Object details) {
        this.details = details;
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

        return String.format("Data [isApplied=%s, isAssigned=%s, details=%s]", isApplied, isAssigned, details);

    }

}