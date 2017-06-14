package com.js.crawler.websites.seqing;

import lombok.*;

/**
 * Created by Show on 2017/6/1.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NodeExecution {
    private int id;
    private NodeStateEnum stateEnum;
    private NodeResponse nodeResponse;

    public NodeExecution(int id,NodeStateEnum stateEnum) {
        this.id = id;
        this.stateEnum = stateEnum;
    }
}
