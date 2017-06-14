package com.js.mock.web.responses;

import com.js.mock.web.pojos.Porn85Entity;
import com.js.mock.web.videos.bases.VideoEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by root on 2017/4/14.
 */
@ToString
public class Porn85Res extends Porn85Entity{
    public Porn85Res(Porn85Entity porn85Entity) {
        super(porn85Entity.getCreateTime(),
                porn85Entity.getDuration(),
                porn85Entity.getHidden(),
                porn85Entity.getFilmId(),
                porn85Entity.getFilmLinkUrl(),
                porn85Entity.getId(),
                porn85Entity.getImgUrl(),
                porn85Entity.getVideoAdded(),
                porn85Entity.getVideoTitle());
        this.url ="video.html?" +porn85Entity.getFilmId();
    }

    @Getter@Setter
    private String url;
}
