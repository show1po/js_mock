package com.js.crawler.websites.porn85;

import com.js.crawler.componet.TargetRange;
import com.js.crawler.websites.porn85.pojo.Porn85FilmData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by root on 2017/4/11.
 */
public class PageTask implements Runnable {
    private final String url = "http://www.85porn.net/videos?page=";
    private String name;
    private CyclicBarrier cyclicBarrier;
    private TargetRange targetRange;
    public PageTask(String name,CyclicBarrier cyclicBarrier, TargetRange targetRange) {
        this.name = name;
        this.cyclicBarrier = cyclicBarrier;
        this.targetRange = targetRange;
    }

    public void run() {
        long s = System.currentTimeMillis();

        WebDriver webDriver = Connection.getWebDriver();
        List<Porn85FilmData> filmList=new ArrayList <Porn85FilmData>();
        Porn85FilmData film;
        for (int i = targetRange.getStart(); i <= targetRange.getEnd() ; i++) {
            webDriver.get(url+i);
            System.out.println(webDriver.getTitle());
            List<WebElement> row = webDriver.findElements(By.className("well"));
            for (int j = 0; j < row.size(); j++) {
                String filmId = null;
                String filmLinkUrl=null;
                String videoAdded="";
                String imgUrl="";
                String videoTitle="";
                String duration="";
                try {
                    filmLinkUrl = row.get(j).findElement(By.tagName("a")).getAttribute("href");
                    filmId = filmLinkUrl.substring(filmLinkUrl.lastIndexOf("/") + 1, filmLinkUrl.length());
                    duration = row.get(j).findElement(By.className("duration")).getText();
                    videoTitle = row.get(j).findElement(By.className("video-title")).getText();
                    videoAdded = row.get(j).findElement(By.className("video-added")).getText();
                    imgUrl = row.get(j).findElement(By.tagName("img")).getAttribute("data-original");
                    film=new Porn85FilmData(filmId,filmLinkUrl, duration, videoTitle, videoAdded, imgUrl);
                    filmList.add(film);
                } catch (Exception ex) {
                    System.out.println("skip!");
                }
            }
            for (Porn85FilmData porn85FilmData : filmList) {
                try {
                    Processsor.container.putIfAbsent(porn85FilmData.getFilmLinkUrl(), porn85FilmData);
                } catch (Exception e) {
                    continue;
                }
            }
        }
        webDriver.quit();
        try {
            long e = System.currentTimeMillis();
            String result = name + "in " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + " is done!spend:" + (e - s);
            Processsor.done.putIfAbsent(name, result);
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
