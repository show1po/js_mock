
package com.js.mock.gsongenerator.pojos.fulldata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Ds {

    @SerializedName("A")
    @Expose
    private A_ a;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ds() {
    }

    /**
     * 
     * @param a
     */
    public Ds(A_ a) {
        super();
        this.a = a;
    }

    public A_ getA() {
        return a;
    }

    public void setA(A_ a) {
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
        if ((other instanceof Ds) == false) {
            return false;
        }
        Ds rhs = ((Ds) other);
        return new EqualsBuilder().append(a, rhs.a).isEquals();
    }

}
