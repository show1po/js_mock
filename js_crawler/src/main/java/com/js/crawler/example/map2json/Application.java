package com.js.crawler.example.map2json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.SegToken;
import com.js.crawler.sendData.DataCenter;
import com.js.crawler.websites.porn85.pojo.Porn85TitleRes;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by root on 2017/4/17.
 */
public class Application {
    public static void main(String[] args) {
        JiebaSegmenter segmenter = new JiebaSegmenter();
        String jsonString = DataCenter.sendGet("http://localhost:8080/api/title/85");
        System.out.println(jsonString);
        Gson gson=new Gson();
        Porn85TitleRes porn85TitleRes = gson.fromJson(jsonString, Porn85TitleRes.class);
        List <String> titleList = porn85TitleRes.getTitle();
        String all = titleList.stream().map(Object::toString)
                .collect(Collectors.joining("€"));
        List <SegToken> process = segmenter.process(all, JiebaSegmenter.SegMode.INDEX);
        List <String> words = process.stream().map(segToken -> segToken.word).collect(Collectors.toList());
        Map<String, Integer> frequencyMapping = CollectionUtils.getCardinalityMap(words);
        Map<String,Integer> sorted =
                frequencyMapping.entrySet().stream()
                        .sorted(Map.Entry. <String, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        sorted.forEach((k,v)-> System.out.println(k+","+v));
    }
}
