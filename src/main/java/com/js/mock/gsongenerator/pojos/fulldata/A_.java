
package com.js.mock.gsongenerator.pojos.fulldata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class A_ {

    @SerializedName("line")
    @Expose
    private String line;
    @SerializedName("over")
    @Expose
    private String over;
    @SerializedName("under")
    @Expose
    private String under;

    /**
     * No args constructor for use in serialization
     * 
     */
    public A_() {
    }

    /**
     * 
     * @param over
     * @param under
     * @param line
     */
    public A_(String line, String over, String under) {
        super();
        this.line = line;
        this.over = over;
        this.under = under;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getOver() {
        return over;
    }

    public void setOver(String over) {
        this.over = over;
    }

    public String getUnder() {
        return under;
    }

    public void setUnder(String under) {
        this.under = under;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(line).append(over).append(under).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof A_) == false) {
            return false;
        }
        A_ rhs = ((A_) other);
        return new EqualsBuilder().append(line, rhs.line).append(over, rhs.over).append(under, rhs.under).isEquals();
    }

}
