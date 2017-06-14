package com.js.mock.web.pojos;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by root on 2017/3/31.
 */
@Entity
@Table(name = "member_conf", schema = "sex", catalog = "")
public class MemberConfEntity {
    public MemberConfEntity() {
    }

    public MemberConfEntity( int layerId, byte gtype, short stype, byte mtype, String ltype, Serializable sgl, Serializable sbl, short war, byte upperLayer, int upperId, Serializable upperSgl, Serializable upperSbl, short upperWar) {
        this.layerId = layerId;
        this.gtype = gtype;
        this.stype = stype;
        this.mtype = mtype;
        this.ltype = ltype;
        this.sgl = sgl;
        this.sbl = sbl;
        this.war = war;
        this.upperLayer = upperLayer;
        this.upperId = upperId;
        this.upperSgl = upperSgl;
        this.upperSbl = upperSbl;
        this.upperWar = upperWar;
    }

    private int id;
    private int layerId;
    private byte gtype;
    private short stype;
    private byte mtype;
    private String ltype;
    private Serializable sgl;
    private Serializable sbl;
    private short war;
    private byte upperLayer;
    private int upperId;
    private Serializable upperSgl;
    private Serializable upperSbl;
    private short upperWar;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "layerID")
    public int getLayerId() {
        return layerId;
    }

    public void setLayerId(int layerId) {
        this.layerId = layerId;
    }

    @Basic
    @Column(name = "gtype")
    public byte getGtype() {
        return gtype;
    }

    public void setGtype(byte gtype) {
        this.gtype = gtype;
    }

    @Basic
    @Column(name = "stype")
    public short getStype() {
        return stype;
    }

    public void setStype(short stype) {
        this.stype = stype;
    }

    @Basic
    @Column(name = "mtype")
    public byte getMtype() {
        return mtype;
    }

    public void setMtype(byte mtype) {
        this.mtype = mtype;
    }

    @Basic
    @Column(name = "ltype")
    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    @Basic
    @Column(name = "SGL")
    public Serializable getSgl() {
        return sgl;
    }

    public void setSgl(Serializable sgl) {
        this.sgl = sgl;
    }

    @Basic
    @Column(name = "SBL")
    public Serializable getSbl() {
        return sbl;
    }

    public void setSbl(Serializable sbl) {
        this.sbl = sbl;
    }

    @Basic
    @Column(name = "WAR")
    public short getWar() {
        return war;
    }

    public void setWar(short war) {
        this.war = war;
    }

    @Basic
    @Column(name = "upperLayer")
    public byte getUpperLayer() {
        return upperLayer;
    }

    public void setUpperLayer(byte upperLayer) {
        this.upperLayer = upperLayer;
    }

    @Basic
    @Column(name = "upperID")
    public int getUpperId() {
        return upperId;
    }

    public void setUpperId(int upperId) {
        this.upperId = upperId;
    }

    @Basic
    @Column(name = "upperSGL")
    public Serializable getUpperSgl() {
        return upperSgl;
    }

    public void setUpperSgl(Serializable upperSgl) {
        this.upperSgl = upperSgl;
    }

    @Basic
    @Column(name = "upperSBL")
    public Serializable getUpperSbl() {
        return upperSbl;
    }

    public void setUpperSbl(Serializable upperSbl) {
        this.upperSbl = upperSbl;
    }

    @Basic
    @Column(name = "upperWAR")
    public short getUpperWar() {
        return upperWar;
    }

    public void setUpperWar(short upperWar) {
        this.upperWar = upperWar;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberConfEntity that = (MemberConfEntity) o;

        if (id != that.id) return false;
        if (layerId != that.layerId) return false;
        if (gtype != that.gtype) return false;
        if (stype != that.stype) return false;
        if (mtype != that.mtype) return false;
        if (war != that.war) return false;
        if (upperLayer != that.upperLayer) return false;
        if (upperId != that.upperId) return false;
        if (upperWar != that.upperWar) return false;
        if (ltype != null ? !ltype.equals(that.ltype) : that.ltype != null) return false;
        if (sgl != null ? !sgl.equals(that.sgl) : that.sgl != null) return false;
        if (sbl != null ? !sbl.equals(that.sbl) : that.sbl != null) return false;
        if (upperSgl != null ? !upperSgl.equals(that.upperSgl) : that.upperSgl != null) return false;
        if (upperSbl != null ? !upperSbl.equals(that.upperSbl) : that.upperSbl != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + layerId;
        result = 31 * result + (int) gtype;
        result = 31 * result + (int) stype;
        result = 31 * result + (int) mtype;
        result = 31 * result + (ltype != null ? ltype.hashCode() : 0);
        result = 31 * result + (sgl != null ? sgl.hashCode() : 0);
        result = 31 * result + (sbl != null ? sbl.hashCode() : 0);
        result = 31 * result + (int) war;
        result = 31 * result + (int) upperLayer;
        result = 31 * result + upperId;
        result = 31 * result + (upperSgl != null ? upperSgl.hashCode() : 0);
        result = 31 * result + (upperSbl != null ? upperSbl.hashCode() : 0);
        result = 31 * result + (int) upperWar;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
