package com.js.crawler.websites.seqing;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Show on 2017/6/1.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "seqingworld", schema = "sex", catalog = "")
public class SeqingworldEntity {
    private String filmId;
    private String videoTitle;
    private String created;
    private String modified;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer likes;
    private BigDecimal score;
    private Integer hits;
    private String duration;
    private String filmLinkUrl;
    private Byte hidden;
    private String imgUrl;
    private String embedUrl;

    @Id
    @Column(name = "film_id")
    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
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
    @Column(name = "created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Basic
    @Column(name = "modified")
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "likes")
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Basic
    @Column(name = "score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Basic
    @Column(name = "hits")
    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
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
    @Column(name = "film_link_url")
    public String getFilmLinkUrl() {
        return filmLinkUrl;
    }

    public void setFilmLinkUrl(String filmLinkUrl) {
        this.filmLinkUrl = filmLinkUrl;
    }

    @Basic
    @Column(name = "hidden")
    public Byte getHidden() {
        return hidden;
    }

    public void setHidden(Byte hidden) {
        this.hidden = hidden;
    }

    @Basic
    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeqingworldEntity that = (SeqingworldEntity) o;

        if (filmId != null ? !filmId.equals(that.filmId) : that.filmId != null) return false;
        if (videoTitle != null ? !videoTitle.equals(that.videoTitle) : that.videoTitle != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (modified != null ? !modified.equals(that.modified) : that.modified != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (likes != null ? !likes.equals(that.likes) : that.likes != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (hits != null ? !hits.equals(that.hits) : that.hits != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (filmLinkUrl != null ? !filmLinkUrl.equals(that.filmLinkUrl) : that.filmLinkUrl != null) return false;
        if (hidden != null ? !hidden.equals(that.hidden) : that.hidden != null) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = filmId != null ? filmId.hashCode() : 0;
        result = 31 * result + (videoTitle != null ? videoTitle.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (likes != null ? likes.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (hits != null ? hits.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (filmLinkUrl != null ? filmLinkUrl.hashCode() : 0);
        result = 31 * result + (hidden != null ? hidden.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "embed_url")
    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }
}
