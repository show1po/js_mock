package com.js.crawler.websites.porn85.pojo;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by root on 2017/4/11.
 */
@ToString
public class Porn85FilmData {
    public Porn85FilmData(String filmId, String filmLinkUrl, String duration, String videoTitle, String videoAdded, String imgUrl) {
        this.filmId = filmId;
        this.filmLinkUrl = filmLinkUrl;
        this.duration = duration;
        this.videoTitle = videoTitle;
        this.videoAdded = videoAdded;
        this.imgUrl = imgUrl;
    }

    @Getter
    @Setter
    @NonNull
    private String filmId;
    @Getter
    @Setter
    @NonNull
    private String filmLinkUrl;
    @Getter
    @Setter
    private String duration ;
    @Getter
    @Setter
    @NonNull
    private String videoTitle;
    @Getter
    @Setter
    private String videoAdded;
    @Getter
    @Setter
    private String imgUrl;
}
