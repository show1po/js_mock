package com.js.mock.web.videos.enums;

import lombok.Getter;

/**
 * Created by root on 2017/4/18.
 */
public enum VideoSourceEnum {
    ALL(0,"AllVideo","All","All"),PORN_85(1,"Porn85Video","https://www.85porn.com/","pornRep"),SEQUING_WORLD(2,"SequingWorldVideo","http://www.seqing.world/","seqingworldRep");
    @Getter
    private String name;
    @Getter
    private String url;
    @Getter
    private int code;
    @Getter
    private String rep;
    private VideoSourceEnum(int code, String name, String url,String rep) {
        this.code = code;
        this.name = name;
        this.url = url;
        this.rep = rep;
    }
}
