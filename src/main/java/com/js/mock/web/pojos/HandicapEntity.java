package com.js.mock.web.pojos;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by root on 2017/3/29.
 */
@Entity
@Table(name = "handicap", schema = "sex")
public class HandicapEntity {
    private int id;
    private String source;
    private String gameClass;
    private String gameType;
    private int status;
    private Timestamp sourceUpdatetime;
    private String fullData;
    private String ip;
    private Timestamp updatetime;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "game_class")
    public String getGameClass() {
        return gameClass;
    }

    public void setGameClass(String gameClass) {
        this.gameClass = gameClass;
    }

    @Basic
    @Column(name = "game_type")
    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "source_updatetime")
    public Timestamp getSourceUpdatetime() {
        return sourceUpdatetime;
    }

    public void setSourceUpdatetime(Timestamp sourceUpdatetime) {
        this.sourceUpdatetime = sourceUpdatetime;
    }

    @Basic
    @Column(name = "full_data")
    public String getFullData() {
        return fullData;
    }

    public void setFullData(String fullData) {
        this.fullData = fullData;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "updatetime")
    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HandicapEntity that = (HandicapEntity) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (gameClass != null ? !gameClass.equals(that.gameClass) : that.gameClass != null) return false;
        if (gameType != null ? !gameType.equals(that.gameType) : that.gameType != null) return false;
        if (sourceUpdatetime != null ? !sourceUpdatetime.equals(that.sourceUpdatetime) : that.sourceUpdatetime != null)
            return false;
        if (fullData != null ? !fullData.equals(that.fullData) : that.fullData != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (updatetime != null ? !updatetime.equals(that.updatetime) : that.updatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (gameClass != null ? gameClass.hashCode() : 0);
        result = 31 * result + (gameType != null ? gameType.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (sourceUpdatetime != null ? sourceUpdatetime.hashCode() : 0);
        result = 31 * result + (fullData != null ? fullData.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        return result;
    }
}
