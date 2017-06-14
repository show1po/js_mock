package com.js.crawler.componet;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by root on 2017/4/12.
 */
@ToString
public class TargetRange {
    public TargetRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Getter @Setter
    private int start;

    @Getter @Setter
    private int end;

}
