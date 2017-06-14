package com.js.crawler.websites.porn85;

import com.google.gson.Gson;
import com.js.crawler.componet.TargetRange;
import com.js.crawler.database.entities.Porn85Entity;
import com.js.crawler.sendData.DataCenter;
import com.js.crawler.websites.porn85.pojo.Porn85FilmData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by root on 2017/4/11.
 */
public class Processsor {
//    @PersistenceContext(unitName="gamble")
//    private EntityManager entityManager;

    private CyclicBarrier cyclicBarrier;
    public static ConcurrentHashMap <String, String> done =new ConcurrentHashMap <String, String>();
    public static ConcurrentHashMap <String, Porn85FilmData> container = new ConcurrentHashMap <String,Porn85FilmData>();
    public static int getPageSize(String url) {
        WebDriver webDriver = Connection.getWebDriver();
        webDriver.get(url);
        WebElement element = webDriver.findElement(By.className("pagination"));
        List <WebElement> li = element.findElements(By.tagName("li"));
        int size =0;
        try {
                String lastViedoUrl = li.get(li.size() - 2).findElement(By.tagName("a")).getAttribute("href");

                System.out.println(lastViedoUrl);
                size = Integer.parseInt(lastViedoUrl.substring(lastViedoUrl.indexOf("=")+1, lastViedoUrl.length()));
                System.out.println(size);
            } catch (Exception ex) {
            }
//        System.out.println(li.get(li.size() - 1).getAttribute("href"));
        return size;
    }
    public void start(int threads,int targets) {
        List <TargetRange> targetRangeList = arrageTarget(targets,threads);
        cyclicBarrier=new CyclicBarrier(threads);
        String url="";
        for (int i = 0; i < targetRangeList.size(); i++) {
            new Thread(new PageTask(String.valueOf(i),cyclicBarrier,targetRangeList.get(i))).start();
        }
        try {
            cyclicBarrier.await();
            Porn85FilmData porn85FilmData;
            Porn85Entity porn85Entity;

//            EntityTransaction transaction = entityManager.getTransaction();
            List<Porn85FilmData> porn85FilmDatas=new ArrayList <Porn85FilmData>();

            for(String key:container.keySet()){
//                porn85FilmData = container.get(key);
//                String duration = porn85FilmData.getDuration();
//                String filmId = porn85FilmData.getFilmId();
//                String filmLinkUrl = porn85FilmData.getFilmLinkUrl();
//                String imgUrl = porn85FilmData.getImgUrl();
//                String videoAdded = porn85FilmData.getVideoAdded();
//                String videoTitle = porn85FilmData.getVideoTitle();
                porn85FilmDatas.add(container.get(key));
//                porn85Entity = new Porn85Entity(filmId, filmLinkUrl, videoTitle, videoAdded, duration, imgUrl, null, new Timestamp(new Date().getTime()));
//                porn85Entities.add(porn85Entity);
//                transaction.begin();
//                if(entityManager.find(Porn85Entity.class, porn85Entity)==null){
//                    entityManager.persist(porn85Entity);
//                    entityManager.flush();
//                    transaction.commit();
//                }
            }
            List <TargetRange> targetRanges = arrageTarget(porn85FilmDatas.size(),100);
            for (TargetRange targetRange : targetRanges) {
                List <Porn85FilmData> porn85FilmDatas1 = porn85FilmDatas.subList(targetRange.getStart(), targetRange.getEnd());
                String s = new Gson().toJson(porn85FilmDatas1);
                System.out.println(targetRange.getStart()+","+targetRange.getEnd()+" total:"+container.size()+"\ndatas:"+s);
                DataCenter.sendPost("http://localhost:8080/api/add/85", s);
                Thread.sleep(2000);
            }
            for (String name : done.keySet()) {
                System.out.println(done.get(name));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }



    public List <TargetRange> arrageTarget(int denominator,int numerator) {
        List<TargetRange> targetRangeList=new ArrayList <TargetRange>();
        int quotient = denominator / numerator;
        int remainder = denominator % numerator;
        TargetRange targetRange;
        int start,end;
        for (int i = 0; i <numerator ; i++) {
            start = i * quotient + 1;
            if(i==numerator-1)
                end = quotient * (i + 1 )+ remainder;
            else
                end = quotient *( i + 1);
            targetRange = new TargetRange(start,end);
            targetRangeList.add(targetRange);
            System.out.println(targetRange.toString());
        }
        return targetRangeList;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int pageSize = Processsor.getPageSize("http://www.85porn.net/videos");
        System.out.println(pageSize);
        new Processsor().start(10, pageSize);
        long endTime = System.currentTimeMillis();
        System.out.println("Total spend time:"+(endTime-startTime));
    }
}
