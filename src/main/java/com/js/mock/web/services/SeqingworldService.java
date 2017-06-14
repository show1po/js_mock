package com.js.mock.web.services;

import com.js.mock.web.pojos.SeqingworldEntity;
import com.js.mock.web.repositorys.SeqingworldRep;
import com.js.mock.web.requests.VideoPagerReq;
import com.js.mock.web.responses.Porn85ViewRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Show on 2017/6/1.
 */
@Api(value = "API - SeqingworldService",description = "資料來源(二):Seqingworld")
@RestController
public class SeqingworldService {
    @Autowired
    private SeqingworldRep seqingworldRep;
    @ApiOperation(value = "新增影片接口", notes = "將Seqingworld的單一影片,寫入資料庫。", httpMethod = "POST")
    @RequestMapping(value = "api/seqingworld/add", method = RequestMethod.POST)
    public SeqingworldEntity addFilm(@RequestBody SeqingworldEntity seqingworldEntity) {
        seqingworldRep.save(seqingworldEntity);
        SeqingworldEntity one = seqingworldRep.findOne(seqingworldEntity.getFilmId());
        return one;
    }

//    @ApiOperation(value = "查詢影片接口", notes = "搜尋Seqingworld影片。", httpMethod = "POST")
//    @RequestMapping(value = "api/seqingworld/search", method = RequestMethod.POST)
//    public void findFilm(@RequestBody ) {
//
//    }

}