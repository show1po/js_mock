package com.js.crawler.sendData;

import com.google.gson.Gson;
import com.js.crawler.websites.porn85.pojo.Porn85FilmData;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 2017/4/12.
 */
public class DataCenter
{
    public static String sendGet(String url) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet(url);
        try {
            HttpResponse response = httpClient.execute(get);
            String responseString = EntityUtils.toString(response.getEntity());
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return responseString;
            } else {
                return ""+response.getStatusLine().getStatusCode();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public static String sendPost(String url,String json) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        StringEntity postingString = null;//gson.tojson() converts your pojo to json
        try {
            postingString = new StringEntity(json,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/json");
        try {
            HttpResponse response = httpClient.execute(post);
//            System.out.println(response.toString());
            return response.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public static void main(String[] args) {
//        List<Porn85Entity> array=new ArrayList <Porn85Entity>();
//        Porn85Entity porn85Entity1=new Porn85Entity("1",null,null,null,null,null,null,null );
//        Porn85Entity porn85Entity2 = new Porn85Entity("2", null, null, null, null, null, null, null);
//        array.add(porn85Entity1);
//        array.add(porn85Entity2);
        List<Porn85FilmData> array=new ArrayList <Porn85FilmData>();
        Porn85FilmData a=new Porn85FilmData("222","222","222","222","222","222");
        Porn85FilmData b=new Porn85FilmData("111","111","111","111","111","111");
        array.add(a);
        array.add(b);
        String s = new Gson().toJson(array);
        System.out.println(s);
        DataCenter.sendPost("http://localhost:8080/api/add/85", s);
    }
}
