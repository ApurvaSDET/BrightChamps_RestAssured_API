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
        "phoneNumber",
        "email",
        "dialCode",
        "isPhoneNumber"
})
@Generated("jsonschema2pojo")
public class SendOTP {

    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("dialCode")
    private String dialCode;
    @JsonProperty("isPhoneNumber")
    private Boolean isPhoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("dialCode")
    public String getDialCode() {
        return dialCode;
    }

    @JsonProperty("dialCode")
    public void setDialCode(String dialCode) {
        this.dialCode = dialCode;
    }

    @JsonProperty("isPhoneNumber")
    public Boolean getIsPhoneNumber() {
        return isPhoneNumber;
    }

    @JsonProperty("isPhoneNumber")
    public void setIsPhoneNumber(Boolean isPhoneNumber) {
        this.isPhoneNumber = isPhoneNumber;
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