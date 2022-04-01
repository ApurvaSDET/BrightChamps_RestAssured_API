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
        "widget_type",
        "date",
        "detail",
        "promo_link",
        "countryId",
        "usca_check",
        "know_more_link",
        "offers",
        "referralClass"
})
@Generated("jsonschema2pojo")
public class Feed {

    @JsonProperty("widget_type")
    private String widgetType;
    @JsonProperty("date")
    private String date;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("promo_link")
    private String promoLink;
    @JsonProperty("countryId")
    private String countryId;
    @JsonProperty("usca_check")
    private Integer uscaCheck;
    @JsonProperty("know_more_link")
    private String knowMoreLink;
    @JsonProperty("offers")
    private List<String> offers = null;
    @JsonProperty("referralClass")
    private ReferralClass referralClass;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("widget_type")
    public String getWidgetType() {
        return widgetType;
    }

    @JsonProperty("widget_type")
    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @JsonProperty("promo_link")
    public String getPromoLink() {
        return promoLink;
    }

    @JsonProperty("promo_link")
    public void setPromoLink(String promoLink) {
        this.promoLink = promoLink;
    }

    @JsonProperty("countryId")
    public String getCountryId() {
        return countryId;
    }

    @JsonProperty("countryId")
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("usca_check")
    public Integer getUscaCheck() {
        return uscaCheck;
    }

    @JsonProperty("usca_check")
    public void setUscaCheck(Integer uscaCheck) {
        this.uscaCheck = uscaCheck;
    }

    @JsonProperty("know_more_link")
    public String getKnowMoreLink() {
        return knowMoreLink;
    }

    @JsonProperty("know_more_link")
    public void setKnowMoreLink(String knowMoreLink) {
        this.knowMoreLink = knowMoreLink;
    }

    @JsonProperty("offers")
    public List<String> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<String> offers) {
        this.offers = offers;
    }

    @JsonProperty("referralClass")
    public ReferralClass getReferralClass() {
        return referralClass;
    }

    @JsonProperty("referralClass")
    public void setReferralClass(ReferralClass referralClass) {
        this.referralClass = referralClass;
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