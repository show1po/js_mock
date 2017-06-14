package com.js.crawler.websites.seqing;

import com.google.gson.Gson;
import com.js.crawler.database.utils.JPAUtils;
import com.js.crawler.sendData.DataCenter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Show on 2017/6/1.
 */
public class CrawlConsumerTask implements Runnable {
    private LinkedBlockingQueue<NodeExecution> linkedBlockingQueue;

    public CrawlConsumerTask(LinkedBlockingQueue<NodeExecution> linkedBlockingQueue) {
        this.linkedBlockingQueue = linkedBlockingQueue;
    }
    public void run() {
        Gson gson = new Gson();
        int good;
        int bad;
        int total;
        SimpleDateFormat sdf;
        NodeExecution take;
        SeqingworldEntity seqingworldEntity;
        while (true) {
            try {
                sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS:[");
                take = linkedBlockingQueue.take();
                if (take.getStateEnum() == NodeStateEnum.SUCCESS) {
                    seqingworldEntity = VideoFactory.create(take);
                    String s = gson.toJson(seqingworldEntity);
                    DataCenter.sendPost("http://localhost:8080/api/seqingworld/add", s);
//                    System.out.println(s);
                }
                good = QueryStrategy.successExcutionMap.size();
                bad = QueryStrategy.failedExcutionMap.size();
                total = good + bad;
                System.out.printf(sdf.format(new Date())+QueryStrategy.property+" Total:%d.(%d,%d) id:%d.\n",total,good,bad,take.getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
