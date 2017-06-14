
package com.js.mock.gsongenerator.pojos.fulldata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Information {

    @SerializedName("league")
    @Expose
    private String league;
    @SerializedName("home")
    @Expose
    private Home home;
    @SerializedName("away")
    @Expose
    private Away away;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Information() {
    }

    /**
     * 
     * @param away
     * @param home
     * @param league
     */
    public Information(String league, Home home, Away away) {
        super();
        this.league = league;
        this.home = home;
        this.away = away;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(league).append(home).append(away).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Information) == false) {
            return false;
        }
        Information rhs = ((Information) other);
        return new EqualsBuilder().append(league, rhs.league).append(home, rhs.home).append(away, rhs.away).isEquals();
    }

}
