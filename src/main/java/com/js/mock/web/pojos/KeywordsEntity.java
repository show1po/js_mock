package com.js.mock.web.pojos;

import com.js.mock.web.videos.enums.VideoSourceEnum;

import javax.persistence.*;

/**
 * Created by root on 2017/4/18.
 */
@Entity
@Table(name = "keywords", schema = "sex", catalog = "")
public class KeywordsEntity {
    private int id;
    private String name;
    private Integer count;
    private VideoSourceEnum src;
    private boolean available;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "src")
    @Enumerated(EnumType.STRING)
    public VideoSourceEnum getSrc() {
        return src;
    }

    public void setSrc(VideoSourceEnum src) {
        this.src = src;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeywordsEntity that = (KeywordsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (src != null ? !src.equals(that.src) : that.src != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (src != null ? src.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "available")
    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
