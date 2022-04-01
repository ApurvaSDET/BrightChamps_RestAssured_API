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
        "total_class_booked",
        "total_class_completed",
        "total_class_paid",
        "penalty_classes",
        "leftover_classes"
})
@Generated("jsonschema2pojo")
public class TotalClass {

    @JsonProperty("total_class_booked")
    private Integer totalClassBooked;
    @JsonProperty("total_class_completed")
    private Integer totalClassCompleted;
    @JsonProperty("total_class_paid")
    private Integer totalClassPaid;
    @JsonProperty("penalty_classes")
    private Integer penaltyClasses;
    @JsonProperty("leftover_classes")
    private Integer leftoverClasses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total_class_booked")
    public Integer getTotalClassBooked() {
        return totalClassBooked;
    }

    @JsonProperty("total_class_booked")
    public void setTotalClassBooked(Integer totalClassBooked) {
        this.totalClassBooked = totalClassBooked;
    }

    @JsonProperty("total_class_completed")
    public Integer getTotalClassCompleted() {
        return totalClassCompleted;
    }

    @JsonProperty("total_class_completed")
    public void setTotalClassCompleted(Integer totalClassCompleted) {
        this.totalClassCompleted = totalClassCompleted;
    }

    @JsonProperty("total_class_paid")
    public Integer getTotalClassPaid() {
        return totalClassPaid;
    }

    @JsonProperty("total_class_paid")
    public void setTotalClassPaid(Integer totalClassPaid) {
        this.totalClassPaid = totalClassPaid;
    }

    @JsonProperty("penalty_classes")
    public Integer getPenaltyClasses() {
        return penaltyClasses;
    }

    @JsonProperty("penalty_classes")
    public void setPenaltyClasses(Integer penaltyClasses) {
        this.penaltyClasses = penaltyClasses;
    }

    @JsonProperty("leftover_classes")
    public Integer getLeftoverClasses() {
        return leftoverClasses;
    }

    @JsonProperty("leftover_classes")
    public void setLeftoverClasses(Integer leftoverClasses) {
        this.leftoverClasses = leftoverClasses;
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
