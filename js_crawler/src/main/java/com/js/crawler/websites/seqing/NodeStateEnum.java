package com.js.crawler.websites.seqing;


/**
 * Created by Show on 2017/6/1.
 */
public enum NodeStateEnum {
    INITIAL(0,"初始化"),
    SUCCESS(1,"成功"),
    VIDEO_NOTFIND(2,"網站沒問題，影片404"),
    HTTPCODE_PROBLEM(3,"HTTPSTATUS200以外"),
    IO_PROBLEM(4,"IOException");
    @lombok.Getter
    private int code;
    @lombok.Getter
    private String msg;

    private NodeStateEnum(int code, String msg) {
        this.code = code;
        this.msg=msg;
    }
}
