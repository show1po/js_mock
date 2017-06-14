
package com.js.mock.gsongenerator.pojos.fulldata.basketball;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class De {

    @SerializedName("home")
    @Expose
    private String home;
    @SerializedName("away")
    @Expose
    private String away;

    /**
     * No args constructor for use in serialization
     * 
     */
    public De() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public De(String home, String away) {
        super();
        this.home = home;
        this.away = away;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
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
        if ((other instanceof De) == false) {
            return false;
        }
        De rhs = ((De) other);
        return new EqualsBuilder().append(home, rhs.home).append(away, rhs.away).isEquals();
    }

}
