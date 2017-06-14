package com.js.mock.web.services;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.SegToken;
import com.js.mock.web.pojos.BanwordEntity;
import com.js.mock.web.pojos.KeywordsEntity;
import com.js.mock.web.videos.enums.VideoSourceEnum;
import com.js.mock.web.repositorys.BanWordRep;
import com.js.mock.web.repositorys.KeywordsRep;
import com.js.mock.web.repositorys.PornRep;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by root on 2017/4/18.
 */
@Api(value = "API - KeywordsService",description = "關鍵字介面詳情")
@RestController
public class KeywordsService {
    @Autowired
    private BanWordRep banWordRep;
    @Autowired
    private PornRep pornRep;
    @Autowired
    private KeywordsRep keywordsRep;
    @ApiOperation(value = "更新關鍵字接口",notes = "將影片名稱節錄關鍵字到字典、過濾字典。<br>",response = String.class,httpMethod = "POST")
    @RequestMapping(value = "api/keywords/85", method = RequestMethod.POST)
    public int getWords(@RequestBody List <KeywordsEntity> keywordsEntities) {
        updateKeywords(keywordsEntities);
        addBanwords();
        return keywordsEntities.size();
    }

    private void updateKeywords(List <KeywordsEntity> keywordsEntities) {
        Iterable <KeywordsEntity> keywordsEntityList = keywordsEntities;
        keywordsRep.save(keywordsEntityList);
    }

    private void addBanwords() {
        List <KeywordsEntity> unAvailable = keywordsRep.findByAvailable(false);
        unAvailable.forEach(keywordsEntity -> {
            if (banWordRep.findByName(keywordsEntity.getName()) == null) {
                BanwordEntity banwordEntity = new BanwordEntity();
                banwordEntity.setName(keywordsEntity.getName());
                banWordRep.save(banwordEntity);
            }
        });
    }
    @ApiOperation(value = "查詢關鍵字接口",notes = "將包含關鍵字的影片名稱，全部陳列出來。",response = KeywordsEntity.class,httpMethod = "GET")
    @ApiImplicitParam(name = "word",value = "word",required = true,dataType = "string",paramType = "path")
    @RequestMapping(value = "api/search/{word}",method = RequestMethod.GET)
    public List <KeywordsEntity> searchWords(@PathVariable("word") String word) {
        return keywordsRep.findByNameContaining(word);
    }

    @ApiOperation(value = "建立關鍵字接口",notes = "透過<b3>\"結巴\"</b3>將影片名稱拆解成關鍵字，寫入資料庫中。",httpMethod = "GET")
    @RequestMapping(value = "api/createwords/85")
    public int createWords() {
        JiebaSegmenter segmenter = new JiebaSegmenter();
        List <String> allVideoTitleList = pornRep.findAllVideoTitle();
        String all = allVideoTitleList.stream().map(Object::toString)
                .collect(Collectors.joining("€"));
        List <SegToken> process = segmenter.process(all, JiebaSegmenter.SegMode.INDEX);
        List <String> words = process.stream().map(segToken -> segToken.word).collect(Collectors.toList());
        Map <String, Integer> frequencyMapping = CollectionUtils.getCardinalityMap(words);
        Map <String, Integer> sorted =
                frequencyMapping.entrySet().stream()
                        .sorted(Map.Entry. <String, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//        sorted.forEach((k,v)-> {
//
//        });
        keywordsRep.deleteAll();
//        keywordsRep.resetId();
        for (String key : sorted.keySet()) {
            KeywordsEntity keywordsEntity = null;
            try {
                if (keywordsRep.findByName(key) == null) {
                    keywordsEntity = new KeywordsEntity();
                    keywordsEntity.setName(key);
                    keywordsEntity.setCount(sorted.get(key));
                    keywordsEntity.setAvailable(true);
//                    keywordsEntity.setSrc(VideoSourceEnum.PORN_85);
//                    keywordsRep.save(keywordsEntity);
                } else {
                    keywordsEntity = keywordsRep.findByName(key);
                    keywordsEntity.setCount(sorted.get(key) + keywordsEntity.getCount());
                }
                keywordsEntity.setSrc(VideoSourceEnum.PORN_85);
                keywordsRep.save(keywordsEntity);

            } catch (Exception ex) {
                System.out.println(keywordsEntity.getName());
            }
        }
        alterUnAvailable();
        return sorted.size();
//        List <String> unAvailable =keywordsRep.findByAvailable(false);
//        sorted.keySet().removeAll(unAvailable);
    }

    private void alterUnAvailable() {
        List <String> banList = new ArrayList <>();
        banWordRep.findAll().forEach(banword -> banList.add(banword.getName()));
        List <String> keywords = new ArrayList <>();
        keywordsRep.findAll().forEach(keywordsEntity -> keywords.add(keywordsEntity.getName()));
        List <String> result = keywords.stream().filter(banList::contains).collect(Collectors.toList());
        result.forEach(name -> {
            KeywordsEntity keywordsEntity = keywordsRep.findByName(name);
            keywordsEntity.setAvailable(false);
            keywordsRep.save(keywordsEntity);
        });
    }
}
