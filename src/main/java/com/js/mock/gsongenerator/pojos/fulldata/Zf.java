
package com.js.mock.gsongenerator.pojos.fulldata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Zf {

    @SerializedName("A")
    @Expose
    private A a;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Zf() {
    }

    /**
     * 
     * @param a
     */
    public Zf(A a) {
        super();
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(a).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Zf) == false) {
            return false;
        }
        Zf rhs = ((Zf) other);
        return new EqualsBuilder().append(a, rhs.a).isEquals();
    }

}
