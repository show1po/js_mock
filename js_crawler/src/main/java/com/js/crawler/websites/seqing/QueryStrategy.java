package com.js.crawler.websites.seqing;

import com.js.crawler.componet.ArrangeUtils;
import com.js.crawler.componet.TargetRange;
import com.js.crawler.database.utils.JPAUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Show on 2017/5/31.
 */
public class QueryStrategy {
    public static ConcurrentHashMap successExcutionMap=new ConcurrentHashMap();
    public static ConcurrentHashMap failedExcutionMap=new ConcurrentHashMap();
    public static String property;
    public static void main(String[] args) {
        QueryStrategy queryStrategy=new QueryStrategy();
        queryStrategy.standard(17777,25776);
    }
    public void standard(int startIndex,int endIndex) {
        findFilmIdByNode(startIndex,endIndex);
    }

    private void findFilmIdByNode(int startIndex,int endIndex) {
        property="Property["+startIndex+","+endIndex+"]=>"+(endIndex-startIndex+1)+"!";
        List<TargetRange> targetRanges = ArrangeUtils.arrageTarget(startIndex, endIndex-startIndex+1, 1000);
        LinkedBlockingQueue<NodeExecution> linkedBlockingQueue=new LinkedBlockingQueue<>(1000);
        for (TargetRange targetRange : targetRanges) {
            new Thread(new CrawlProducerTask(linkedBlockingQueue,targetRange.getStart(),targetRange.getEnd())).start();
        }
        for(int i=0;i<targetRanges.size();i++) {
            new Thread(new CrawlConsumerTask(linkedBlockingQueue)).start();
        }
    }
}
