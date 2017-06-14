package com.js.crawler.websites.seqing;

import java.math.BigDecimal;

/**
 * Created by Show on 2017/6/1.
 */
public class VideoFactory {
    public static SeqingworldEntity create(NodeExecution nodeExecution) {
        NodeResponse nodeResponse = nodeExecution.getNodeResponse();
        SeqingworldEntity seqingworldEntity=wrapper(nodeResponse);
        return seqingworldEntity;
    }

    private static SeqingworldEntity wrapper(NodeResponse nodeResponse) {
        SeqingworldEntity seqingworldEntity = new SeqingworldEntity();
        seqingworldEntity.setFilmId(String.valueOf(nodeResponse.getId()));
        seqingworldEntity.setVideoTitle(nodeResponse.getTitle());
        seqingworldEntity.setCreated(nodeResponse.getCreated());
        seqingworldEntity.setModified(nodeResponse.getModified());
        seqingworldEntity.setEmbedUrl("http://cdn.looklook.space/video/embed/"+nodeResponse.getId()+"?v=1.11&vip=0");
        seqingworldEntity.setDuration(nodeResponse.getDuration());
        seqingworldEntity.setHits(nodeResponse.getHits());
        seqingworldEntity.setLikes(nodeResponse.getLikes());
        seqingworldEntity.setScore(BigDecimal.valueOf(nodeResponse.getScore()));
        return seqingworldEntity;
    }
}
