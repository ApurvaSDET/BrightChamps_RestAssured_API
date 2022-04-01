package Model.GETStudentFeed;

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
        "student_id",
        "feed",
        "banner_list"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("student_id")
    private Integer studentId;
    @JsonProperty("feed")
    private List<Feed> feed = null;
    @JsonProperty("banner_list")
    private List<Banner> bannerList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("student_id")
    public Integer getStudentId() {
        return studentId;
    }

    @JsonProperty("student_id")
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @JsonProperty("feed")
    public List<Feed> getFeed() {
        return feed;
    }

    @JsonProperty("feed")
    public void setFeed(List<Feed> feed) {
        this.feed = feed;
    }

    @JsonProperty("banner_list")
    public List<Banner> getBannerList() {
        return bannerList;
    }

    @JsonProperty("banner_list")
    public void setBannerList(List<Banner> bannerList) {
        this.bannerList = bannerList;
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