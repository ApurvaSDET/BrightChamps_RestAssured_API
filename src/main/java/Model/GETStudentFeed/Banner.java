package Model.GETStudentFeed;

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
        "id",
        "name",
        "image_link",
        "redirection_link",
        "description",
        "position",
        "visibility",
        "dashboard",
        "least_no_classes",
        "vertical_id",
        "champ_level",
        "app_version",
        "country_id",
        "start_date",
        "expiry_date",
        "created_at",
        "updated_at"
})
@Generated("jsonschema2pojo")
public class Banner {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("image_link")
    private String imageLink;
    @JsonProperty("redirection_link")
    private Object redirectionLink;
    @JsonProperty("description")
    private String description;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("dashboard")
    private Object dashboard;
    @JsonProperty("least_no_classes")
    private Object leastNoClasses;
    @JsonProperty("vertical_id")
    private Integer verticalId;
    @JsonProperty("champ_level")
    private Object champLevel;
    @JsonProperty("app_version")
    private Object appVersion;
    @JsonProperty("country_id")
    private Object countryId;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("expiry_date")
    private String expiryDate;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("image_link")
    public String getImageLink() {
        return imageLink;
    }

    @JsonProperty("image_link")
    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @JsonProperty("redirection_link")
    public Object getRedirectionLink() {
        return redirectionLink;
    }

    @JsonProperty("redirection_link")
    public void setRedirectionLink(Object redirectionLink) {
        this.redirectionLink = redirectionLink;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("dashboard")
    public Object getDashboard() {
        return dashboard;
    }

    @JsonProperty("dashboard")
    public void setDashboard(Object dashboard) {
        this.dashboard = dashboard;
    }

    @JsonProperty("least_no_classes")
    public Object getLeastNoClasses() {
        return leastNoClasses;
    }

    @JsonProperty("least_no_classes")
    public void setLeastNoClasses(Object leastNoClasses) {
        this.leastNoClasses = leastNoClasses;
    }

    @JsonProperty("vertical_id")
    public Integer getVerticalId() {
        return verticalId;
    }

    @JsonProperty("vertical_id")
    public void setVerticalId(Integer verticalId) {
        this.verticalId = verticalId;
    }

    @JsonProperty("champ_level")
    public Object getChampLevel() {
        return champLevel;
    }

    @JsonProperty("champ_level")
    public void setChampLevel(Object champLevel) {
        this.champLevel = champLevel;
    }

    @JsonProperty("app_version")
    public Object getAppVersion() {
        return appVersion;
    }

    @JsonProperty("app_version")
    public void setAppVersion(Object appVersion) {
        this.appVersion = appVersion;
    }

    @JsonProperty("country_id")
    public Object getCountryId() {
        return countryId;
    }

    @JsonProperty("country_id")
    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("expiry_date")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiry_date")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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