
package com.js.mock.gsongenerator.pojos.fulldata.basketball;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Away {

    @SerializedName("rot_id")
    @Expose
    private Integer rotId;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("pitcher")
    @Expose
    private String pitcher;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Away() {
    }

    /**
     * 
     * @param teamName
     * @param pitcher
     * @param rotId
     */
    public Away(Integer rotId, String teamName, String pitcher) {
        super();
        this.rotId = rotId;
        this.teamName = teamName;
        this.pitcher = pitcher;
    }

    public Integer getRotId() {
        return rotId;
    }

    public void setRotId(Integer rotId) {
        this.rotId = rotId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPitcher() {
        return pitcher;
    }

    public void setPitcher(String pitcher) {
        this.pitcher = pitcher;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rotId).append(teamName).append(pitcher).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Away) == false) {
            return false;
        }
        Away rhs = ((Away) other);
        return new EqualsBuilder().append(rotId, rhs.rotId).append(teamName, rhs.teamName).append(pitcher, rhs.pitcher).isEquals();
    }

}
