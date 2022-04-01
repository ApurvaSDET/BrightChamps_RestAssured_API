package Model.GetLeaderBoard;

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
        "referral_count",
        "rank",
        "leader_board"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("referral_count")
    private Integer referralCount;
    @JsonProperty("rank")
    private String rank;
    @JsonProperty("leader_board")
    private List<LeaderBoard> leaderBoard = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("referral_count")
    public Integer getReferralCount() {
        return referralCount;
    }

    @JsonProperty("referral_count")
    public void setReferralCount(Integer referralCount) {
        this.referralCount = referralCount;
    }

    @JsonProperty("rank")
    public String getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(String rank) {
        this.rank = rank;
    }

    @JsonProperty("leader_board")
    public List<LeaderBoard> getLeaderBoard() {
        return leaderBoard;
    }

    @JsonProperty("leader_board")
    public void setLeaderBoard(List<LeaderBoard> leaderBoard) {
        this.leaderBoard = leaderBoard;
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
