package Model.GETCertificates;

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
        "demo",
        "achived_certificates",
        "remaining_certificates",
        "next_level_certificates"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("demo")
    private List<Demo> demo = null;
    @JsonProperty("achived_certificates")
    private List<Object> achivedCertificates = null;
    @JsonProperty("remaining_certificates")
    private List<Object> remainingCertificates = null;
    @JsonProperty("next_level_certificates")
    private List<NextLevelCertificate> nextLevelCertificates = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("demo")
    public List<Demo> getDemo() {
        return demo;
    }

    @JsonProperty("demo")
    public void setDemo(List<Demo> demo) {
        this.demo = demo;
    }

    @JsonProperty("achived_certificates")
    public List<Object> getAchivedCertificates() {
        return achivedCertificates;
    }

    @JsonProperty("achived_certificates")
    public void setAchivedCertificates(List<Object> achivedCertificates) {
        this.achivedCertificates = achivedCertificates;
    }

    @JsonProperty("remaining_certificates")
    public List<Object> getRemainingCertificates() {
        return remainingCertificates;
    }

    @JsonProperty("remaining_certificates")
    public void setRemainingCertificates(List<Object> remainingCertificates) {
        this.remainingCertificates = remainingCertificates;
    }

    @JsonProperty("next_level_certificates")
    public List<NextLevelCertificate> getNextLevelCertificates() {
        return nextLevelCertificates;
    }

    @JsonProperty("next_level_certificates")
    public void setNextLevelCertificates(List<NextLevelCertificate> nextLevelCertificates) {
        this.nextLevelCertificates = nextLevelCertificates;
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

        return String.format("Data [demo=%s, achivedCertificates=%s, remainingCertificates=%s, nextLevelCertificates=%s]", demo, achivedCertificates, remainingCertificates, nextLevelCertificates);

    }

}
