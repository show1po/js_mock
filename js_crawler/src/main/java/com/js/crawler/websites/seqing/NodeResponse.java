package com.js.crawler.websites.seqing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class NodeResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("category_id")
    @Expose
    private Object categoryId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("playlist_id")
    @Expose
    private Object playlistId;
    @SerializedName("seq")
    @Expose
    private Integer seq;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("hits")
    @Expose
    private Integer hits;
    @SerializedName("hits_now")
    @Expose
    private Integer hitsNow;
    @SerializedName("refer_hits")
    @Expose
    private Integer referHits;
    @SerializedName("fixed")
    @Expose
    private Integer fixed;
    @SerializedName("deleted")
    @Expose
    private Integer deleted;
    @SerializedName("flag")
    @Expose
    private Integer flag;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("score")
    @Expose
    private Double score;

    /**
     * No args constructor for use in serialization
     *
     */
    public NodeResponse() {
    }

    /**
     *
     * @param status
     * @param hitsNow
     * @param categoryId
     * @param score
     * @param deleted
     * @param fixed
     * @param modified
     * @param id
     * @param content
     * @param time
     * @param playlistId
     * @param title
     * @param duration
     * @param hits
     * @param flag
     * @param created
     * @param likes
     * @param userId
     * @param referHits
     * @param seq
     */
    public NodeResponse(Integer id, Object categoryId, Integer userId, Object playlistId, Integer seq, String title, String content, String duration, Integer hits, Integer hitsNow, Integer referHits, Integer fixed, Integer deleted, Integer flag, Integer status, String created, String modified, Integer time, Integer likes, Double score) {
        super();
        this.id = id;
        this.categoryId = categoryId;
        this.userId = userId;
        this.playlistId = playlistId;
        this.seq = seq;
        this.title = title;
        this.content = content;
        this.duration = duration;
        this.hits = hits;
        this.hitsNow = hitsNow;
        this.referHits = referHits;
        this.fixed = fixed;
        this.deleted = deleted;
        this.flag = flag;
        this.status = status;
        this.created = created;
        this.modified = modified;
        this.time = time;
        this.likes = likes;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Object getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Object playlistId) {
        this.playlistId = playlistId;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getHitsNow() {
        return hitsNow;
    }

    public void setHitsNow(Integer hitsNow) {
        this.hitsNow = hitsNow;
    }

    public Integer getReferHits() {
        return referHits;
    }

    public void setReferHits(Integer referHits) {
        this.referHits = referHits;
    }

    public Integer getFixed() {
        return fixed;
    }

    public void setFixed(Integer fixed) {
        this.fixed = fixed;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(categoryId).append(userId).append(playlistId).append(seq).append(title).append(content).append(duration).append(hits).append(hitsNow).append(referHits).append(fixed).append(deleted).append(flag).append(status).append(created).append(modified).append(time).append(likes).append(score).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodeResponse) == false) {
            return false;
        }
        NodeResponse rhs = ((NodeResponse) other);
        return new EqualsBuilder().append(id, rhs.id).append(categoryId, rhs.categoryId).append(userId, rhs.userId).append(playlistId, rhs.playlistId).append(seq, rhs.seq).append(title, rhs.title).append(content, rhs.content).append(duration, rhs.duration).append(hits, rhs.hits).append(hitsNow, rhs.hitsNow).append(referHits, rhs.referHits).append(fixed, rhs.fixed).append(deleted, rhs.deleted).append(flag, rhs.flag).append(status, rhs.status).append(created, rhs.created).append(modified, rhs.modified).append(time, rhs.time).append(likes, rhs.likes).append(score, rhs.score).isEquals();
    }

}