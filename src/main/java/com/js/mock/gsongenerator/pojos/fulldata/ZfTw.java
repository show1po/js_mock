
package com.js.mock.gsongenerator.pojos.fulldata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ZfTw {

    @SerializedName("home")
    @Expose
    private Home__ home;
    @SerializedName("away")
    @Expose
    private Away__ away;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ZfTw() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public ZfTw(Home__ home, Away__ away) {
        super();
        this.home = home;
        this.away = away;
    }

    public Home__ getHome() {
        return home;
    }

    public void setHome(Home__ home) {
        this.home = home;
    }

    public Away__ getAway() {
        return away;
    }

    public void setAway(Away__ away) {
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
        if ((other instanceof ZfTw) == false) {
            return false;
        }
        ZfTw rhs = ((ZfTw) other);
        return new EqualsBuilder().append(home, rhs.home).append(away, rhs.away).isEquals();
    }

}
