
package com.js.mock.gsongenerator.pojos.fulldata.basketball;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Handicap {

    @SerializedName("zf")
    @Expose
    private Zf zf;
    @SerializedName("zf_tw")
    @Expose
    private ZfTw zfTw;
    @SerializedName("ds")
    @Expose
    private Ds ds;
    @SerializedName("ds_tw")
    @Expose
    private DsTw dsTw;
    @SerializedName("de")
    @Expose
    private De de;
    @SerializedName("esre")
    @Expose
    private Esre esre;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Handicap() {
    }

    /**
     * 
     * @param de
     * @param zf
     * @param dsTw
     * @param esre
     * @param zfTw
     * @param ds
     */
    public Handicap(Zf zf, ZfTw zfTw, Ds ds, DsTw dsTw, De de, Esre esre) {
        super();
        this.zf = zf;
        this.zfTw = zfTw;
        this.ds = ds;
        this.dsTw = dsTw;
        this.de = de;
        this.esre = esre;
    }

    public Zf getZf() {
        return zf;
    }

    public void setZf(Zf zf) {
        this.zf = zf;
    }

    public ZfTw getZfTw() {
        return zfTw;
    }

    public void setZfTw(ZfTw zfTw) {
        this.zfTw = zfTw;
    }

    public Ds getDs() {
        return ds;
    }

    public void setDs(Ds ds) {
        this.ds = ds;
    }

    public DsTw getDsTw() {
        return dsTw;
    }

    public void setDsTw(DsTw dsTw) {
        this.dsTw = dsTw;
    }

    public De getDe() {
        return de;
    }

    public void setDe(De de) {
        this.de = de;
    }

    public Esre getEsre() {
        return esre;
    }

    public void setEsre(Esre esre) {
        this.esre = esre;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(zf).append(zfTw).append(ds).append(dsTw).append(de).append(esre).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Handicap) == false) {
            return false;
        }
        Handicap rhs = ((Handicap) other);
        return new EqualsBuilder().append(zf, rhs.zf).append(zfTw, rhs.zfTw).append(ds, rhs.ds).append(dsTw, rhs.dsTw).append(de, rhs.de).append(esre, rhs.esre).isEquals();
    }

}
