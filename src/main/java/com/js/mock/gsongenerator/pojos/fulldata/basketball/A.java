
package com.js.mock.gsongenerator.pojos.fulldata.basketball;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class A {

    @SerializedName("home")
    @Expose
    private Home_ home;
    @SerializedName("away")
    @Expose
    private Away_ away;

    /**
     * No args constructor for use in serialization
     * 
     */
    public A() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public A(Home_ home, Away_ away) {
        super();
        this.home = home;
        this.away = away;
    }

    public Home_ getHome() {
        return home;
    }

    public void setHome(Home_ home) {
        this.home = home;
    }

    public Away_ getAway() {
        return away;
    }

    public void setAway(Away_ away) {
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
        if ((other instanceof A) == false) {
            return false;
        }
        A rhs = ((A) other);
        return new EqualsBuilder().append(home, rhs.home).append(away, rhs.away).isEquals();
    }

}
