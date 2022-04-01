package Model.GETCertificates;

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
        "isLocked",
        "module",
        "link",
        "certificate_title",
        "certificate_description",
        "thumbnail_link",
        "type"
})
@Generated("jsonschema2pojo")
public class Demo {

    @JsonProperty("isLocked")
    private Boolean isLocked;
    @JsonProperty("module")
    private String module;
    @JsonProperty("link")
    private Object link;
    @JsonProperty("certificate_title")
    private Object certificateTitle;
    @JsonProperty("certificate_description")
    private Object certificateDescription;
    @JsonProperty("thumbnail_link")
    private Object thumbnailLink;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isLocked")
    public Boolean getIsLocked() {
        return isLocked;
    }

    @JsonProperty("isLocked")
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    @JsonProperty("module")
    public String getModule() {
        return module;
    }

    @JsonProperty("module")
    public void setModule(String module) {
        this.module = module;
    }

    @JsonProperty("link")
    public Object getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(Object link) {
        this.link = link;
    }

    @JsonProperty("certificate_title")
    public Object getCertificateTitle() {
        return certificateTitle;
    }

    @JsonProperty("certificate_title")
    public void setCertificateTitle(Object certificateTitle) {
        this.certificateTitle = certificateTitle;
    }

    @JsonProperty("certificate_description")
    public Object getCertificateDescription() {
        return certificateDescription;
    }

    @JsonProperty("certificate_description")
    public void setCertificateDescription(Object certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    @JsonProperty("thumbnail_link")
    public Object getThumbnailLink() {
        return thumbnailLink;
    }

    @JsonProperty("thumbnail_link")
    public void setThumbnailLink(Object thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
