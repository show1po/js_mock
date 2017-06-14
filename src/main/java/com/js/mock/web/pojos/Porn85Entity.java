package com.js.mock.web.pojos;

import com.js.mock.web.videos.bases.VideoEntity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by root on 2017/4/12.
 */
@Entity
@Table(name = "porn85", schema = "sex", catalog = "")
public class Porn85Entity implements VideoEntity {
    private String filmId;
    private String filmLinkUrl;
    private String videoTitle;
    private String videoAdded;
    private String duration;
    private String imgUrl;
    private Boolean hidden;
    private Timestamp createTime;
    private int id;

    public Porn85Entity() {

    }
    public Porn85Entity(Timestamp createTime, String duration, Boolean hidden, String filmId, String filmLinkUrl, int id, String imgUrl, String videoAdded, String videoTitle) {
        this.createTime = createTime;
        this.duration = duration;
        this.hidden = hidden;
        this.filmId = filmId;
        this.filmLinkUrl = filmLinkUrl;
        this.id = id;
        this.imgUrl = imgUrl;
        this.videoAdded = videoAdded;
        this.videoTitle = videoTitle;
    }

    @Basic
    @Column(name = "film_Id")
    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    @Basic
    @Column(name = "film_link_url")
    public String getFilmLinkUrl() {
        return filmLinkUrl;
    }

    public void setFilmLinkUrl(String filmLinkUrl) {
        this.filmLinkUrl = filmLinkUrl;
    }

    @Basic
    @Column(name = "video_title")
    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    @Basic
    @Column(name = "video_added")
    public String getVideoAdded() {
        return videoAdded;
    }

    public void setVideoAdded(String videoAdded) {
        this.videoAdded = videoAdded;
    }

    @Basic
    @Column(name = "duration")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "hidden")
    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Porn85Entity that = (Porn85Entity) o;

        if (id != that.id) return false;
        if (filmId != null ? !filmId.equals(that.filmId) : that.filmId != null) return false;
        if (filmLinkUrl != null ? !filmLinkUrl.equals(that.filmLinkUrl) : that.filmLinkUrl != null) return false;
        if (videoTitle != null ? !videoTitle.equals(that.videoTitle) : that.videoTitle != null) return false;
        if (videoAdded != null ? !videoAdded.equals(that.videoAdded) : that.videoAdded != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;
        if (hidden != null ? !hidden.equals(that.hidden) : that.hidden != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = filmId != null ? filmId.hashCode() : 0;
        result = 31 * result + (filmLinkUrl != null ? filmLinkUrl.hashCode() : 0);
        result = 31 * result + (videoTitle != null ? videoTitle.hashCode() : 0);
        result = 31 * result + (videoAdded != null ? videoAdded.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        result = 31 * result + (hidden != null ? hidden.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
