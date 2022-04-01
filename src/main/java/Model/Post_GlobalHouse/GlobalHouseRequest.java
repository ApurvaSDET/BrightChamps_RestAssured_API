package Model.Post_GlobalHouse;

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
        "userId",
        "preferredSlots"
})
@Generated("jsonschema2pojo")
public class GlobalHouseRequest {

    @JsonProperty("userId")
    private Integer userId;
    @JsonProperty("preferredSlots")
    private List<PreferredSlot> preferredSlots = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("preferredSlots")
    public List<PreferredSlot> getPreferredSlots() {
        return preferredSlots;
    }

    @JsonProperty("preferredSlots")
    public void setPreferredSlots(List<PreferredSlot> preferredSlots) {
        this.preferredSlots = preferredSlots;
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
