
package com.js.mock.gsongenerator.pojos.fulldata.basketball;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Score {

    @SerializedName("home")
    @Expose
    private Integer home;
    @SerializedName("away")
    @Expose
    private Integer away;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Score() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public Score(Integer home, Integer away) {
        super();
        this.home = home;
        this.away = away;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getAway() {
        return away;
    }

    public void setAway(Integer away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(home).append(away).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Score) == false) {
            return false;
        }
        Score rhs = ((Score) other);
        return new EqualsBuilder().append(home, rhs.home).append(away, rhs.away).isEquals();
    }

}
