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
        "image_link",
        "app_image_link",
        "usca_check",
        "know_more_link",
        "offers",
        "referralClass",
        "isBooked",
        "isJoined",
        "isMissed",
        "demo_book_CTA",
        "button_text",
        "h1",
        "p1",
        "p2",
        "p3",
        "quiz_url",
        "quiz_id",
        "is_submitted"
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
    @JsonProperty("image_link")
    private String imageLink;
    @JsonProperty("app_image_link")
    private String appImageLink;
    @JsonProperty("usca_check")
    private Integer uscaCheck;
    @JsonProperty("know_more_link")
    private String knowMoreLink;
    @JsonProperty("offers")
    private List<String> offers = null;
    @JsonProperty("referralClass")
    private ReferralClass referralClass;
    @JsonProperty("isBooked")
    private Boolean isBooked;
    @JsonProperty("isJoined")
    private Boolean isJoined;
    @JsonProperty("isMissed")
    private Boolean isMissed;
    @JsonProperty("demo_book_CTA")
    private String demoBookCTA;
    @JsonProperty("button_text")
    private String buttonText;
    @JsonProperty("h1")
    private String h1;
    @JsonProperty("p1")
    private String p1;
    @JsonProperty("p2")
    private String p2;
    @JsonProperty("p3")
    private String p3;
    @JsonProperty("quiz_url")
    private String quizUrl;
    @JsonProperty("quiz_id")
    private Integer quizId;
    @JsonProperty("is_submitted")
    private Boolean isSubmitted;
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

    @JsonProperty("image_link")
    public String getImageLink() {
        return imageLink;
    }

    @JsonProperty("image_link")
    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @JsonProperty("app_image_link")
    public String getAppImageLink() {
        return appImageLink;
    }

    @JsonProperty("app_image_link")
    public void setAppImageLink(String appImageLink) {
        this.appImageLink = appImageLink;
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

    @JsonProperty("isBooked")
    public Boolean getIsBooked() {
        return isBooked;
    }

    @JsonProperty("isBooked")
    public void setIsBooked(Boolean isBooked) {
        this.isBooked = isBooked;
    }

    @JsonProperty("isJoined")
    public Boolean getIsJoined() {
        return isJoined;
    }

    @JsonProperty("isJoined")
    public void setIsJoined(Boolean isJoined) {
        this.isJoined = isJoined;
    }

    @JsonProperty("isMissed")
    public Boolean getIsMissed() {
        return isMissed;
    }

    @JsonProperty("isMissed")
    public void setIsMissed(Boolean isMissed) {
        this.isMissed = isMissed;
    }

    @JsonProperty("demo_book_CTA")
    public String getDemoBookCTA() {
        return demoBookCTA;
    }

    @JsonProperty("demo_book_CTA")
    public void setDemoBookCTA(String demoBookCTA) {
        this.demoBookCTA = demoBookCTA;
    }

    @JsonProperty("button_text")
    public String getButtonText() {
        return buttonText;
    }

    @JsonProperty("button_text")
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    @JsonProperty("h1")
    public String getH1() {
        return h1;
    }

    @JsonProperty("h1")
    public void setH1(String h1) {
        this.h1 = h1;
    }

    @JsonProperty("p1")
    public String getP1() {
        return p1;
    }

    @JsonProperty("p1")
    public void setP1(String p1) {
        this.p1 = p1;
    }

    @JsonProperty("p2")
    public String getP2() {
        return p2;
    }

    @JsonProperty("p2")
    public void setP2(String p2) {
        this.p2 = p2;
    }

    @JsonProperty("p3")
    public String getP3() {
        return p3;
    }

    @JsonProperty("p3")
    public void setP3(String p3) {
        this.p3 = p3;
    }

    @JsonProperty("quiz_url")
    public String getQuizUrl() {
        return quizUrl;
    }

    @JsonProperty("quiz_url")
    public void setQuizUrl(String quizUrl) {
        this.quizUrl = quizUrl;
    }

    @JsonProperty("quiz_id")
    public Integer getQuizId() {
        return quizId;
    }

    @JsonProperty("quiz_id")
    public void setQuizId(Integer quizId) {
        this.quizId = quizId;
    }

    @JsonProperty("is_submitted")
    public Boolean getIsSubmitted() {
        return isSubmitted;
    }

    @JsonProperty("is_submitted")
    public void setIsSubmitted(Boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
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