package com.js.crawler.websites.seqing;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Show on 2017/6/1.
 */
public class CrawlProducerTask implements Runnable {
    private final LinkedBlockingQueue<NodeExecution> queue;
    private int startIndex;
    private int endIndex;
    public CrawlProducerTask(LinkedBlockingQueue<NodeExecution> queue, int startIndex, int endIndex) {
        this.queue = queue;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public void run() {
        HttpClient httpClient =  HttpClientBuilder.create().build();
        HttpGet httpGet;
        Gson gson = new Gson();
        for(int i =startIndex;i<=endIndex;i++) {
            String url="http://www.seqing.world/nodes/"+i;
            httpGet = new HttpGet(url);
            HttpResponse execute = null;
            NodeExecution nodeExecution;
            try {
                execute = httpClient.execute(httpGet);
                StatusLine statusLine = execute.getStatusLine();
//                System.out.printf("statusLine:"+statusLine.getStatusCode());
                if (statusLine.getStatusCode() == 200) {
                    HttpEntity entity = execute.getEntity();
                    String content = EntityUtils.toString(entity);
                    NodeResponse nodeResponse = gson.fromJson(content, NodeResponse.class);
                    if (nodeResponse == null) {
                        nodeExecution = new NodeExecution(i,NodeStateEnum.VIDEO_NOTFIND);
                        QueryStrategy.failedExcutionMap.putIfAbsent(i, nodeExecution);
                    } else {
                        nodeExecution =new NodeExecution(i,NodeStateEnum.SUCCESS, nodeResponse);
                        QueryStrategy.successExcutionMap.putIfAbsent(i, nodeExecution);
                    }
                }else{
                    nodeExecution =new NodeExecution(i,NodeStateEnum.HTTPCODE_PROBLEM);
                    QueryStrategy.failedExcutionMap.putIfAbsent(i, nodeExecution);
                }
            } catch (IOException e) {
                e.printStackTrace();
                nodeExecution =new NodeExecution(i,NodeStateEnum.IO_PROBLEM);
                QueryStrategy.failedExcutionMap.putIfAbsent(i, nodeExecution);
            }

            try {
//                System.out.printf("queue:["+queue.size()+"/");
                queue.put(nodeExecution);
//                System.out.printf(""+queue.size()+"\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
