
package com.js.mock.gsongenerator.pojos.fulldata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Home_ {

    @SerializedName("line")
    @Expose
    private String line;
    @SerializedName("odds")
    @Expose
    private String odds;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Home_() {
    }

    /**
     * 
     * @param line
     * @param odds
     */
    public Home_(String line, String odds) {
        super();
        this.line = line;
        this.odds = odds;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getOdds() {
        return odds;
    }

    public void setOdds(String odds) {
        this.odds = odds;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(line).append(odds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Home_) == false) {
            return false;
        }
        Home_ rhs = ((Home_) other);
        return new EqualsBuilder().append(line, rhs.line).append(odds, rhs.odds).isEquals();
    }

}
