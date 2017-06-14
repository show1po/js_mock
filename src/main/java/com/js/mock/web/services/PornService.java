package com.js.mock.web.services;

import com.js.mock.web.pojos.Porn85Entity;
import com.js.mock.web.repositorys.KeywordsRep;
import com.js.mock.web.repositorys.PornRep;
import com.js.mock.web.requests.Porn85FilmData;
import com.js.mock.web.requests.VideoPagerReq;
import com.js.mock.web.responses.Porn85Res;
import com.js.mock.web.responses.Porn85TitleRes;
import com.js.mock.web.responses.Porn85ViewRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by root on 2017/4/12.
 */
@Api(value = "API - PornService",description = "資料來源(一):85porn")
@RestController
public class PornService {
    @Autowired
    private KeywordsRep keywordsRep;
    @Autowired
    private PornRep pornRep;
    @ApiOperation(value = "影片片名接口",notes = "取得所有影片的片名描述。",httpMethod = "GET",response = Porn85TitleRes.class)
    @RequestMapping(value = "api/title/85")
    public Porn85TitleRes getTitle() {
        List <String> allVideoTitle = pornRep.findAllVideoTitle();
        Porn85TitleRes res = new Porn85TitleRes();
        res.setTitle(allVideoTitle);
        return res;
    }

    @ApiOperation(value = "單一影片接口",notes = "透過影片識別碼，去取得該影片的相關資訊。",httpMethod = "GET",response = Porn85Res.class)
    @ApiImplicitParam(name = "filmId",value = "filmId",required = true,dataType = "string",paramType = "path")//
    @RequestMapping(value = "api/85/{filmId}")
    public Porn85Res getDataByFilmId(@PathVariable String filmId) {
//        String url ="video.html?" +filmId;
        return new Porn85Res(pornRep.findByFilmId(filmId));
    }
    @ApiOperation(value = "影片分頁接口",notes = "取得影片分頁相關資訊。",httpMethod = "POST")
    @RequestMapping(value = "api/85/page", method = RequestMethod.POST)
    public Porn85ViewRes getDataByFilmId(@RequestBody VideoPagerReq videoPager) {

        List<Porn85Entity> byVideoTitleContaining = pornRep.findByVideoTitleContaining(videoPager.getCondition().trim().equals("") ? "%" : videoPager.getCondition().trim());
        int viewBy = videoPager.getViewBy();
        int currentPage = videoPager.getCurrentPage();
        int totalPages = videoPager.getTotalPages();
        int tp =(int) Math.ceil((double) byVideoTitleContaining.size() /(double) viewBy);
        if(currentPage>tp){
            currentPage = tp;
        }else if(currentPage<1){
            currentPage = 1;
        }
        int minIndex=(currentPage>=1&&currentPage<=tp)?(currentPage-1)*viewBy:0;
        int maxIndex=(currentPage>=1&&currentPage<tp)?(currentPage)*viewBy :((byVideoTitleContaining.size()<viewBy)?byVideoTitleContaining.size():byVideoTitleContaining.size());
        List<Porn85Entity> porn85Entities;
        if(byVideoTitleContaining.size()==0){
            porn85Entities=new ArrayList<>();
        }else{
            porn85Entities = byVideoTitleContaining.subList(minIndex, maxIndex);
        }
        Iterator<Porn85Entity> iterator = porn85Entities.iterator();
        List<Porn85Res> porn85ResList=new ArrayList<>();
        Porn85Res porn85Res;
        while (iterator.hasNext()) {
            Porn85Entity next = iterator.next();
            porn85Res = new Porn85Res(next);
            porn85ResList.add(porn85Res);
        }
        return new Porn85ViewRes(porn85ResList,tp,currentPage,viewBy,byVideoTitleContaining.size());
    }

    @ApiOperation(value = "所有影片接口",notes = "取得所有影片。",httpMethod = "POST",response = List.class)
    @RequestMapping(value = "api/ed6429e4a6907d5653b4629582c0796c", method = RequestMethod.POST)
    public List <Porn85Res> getAllData() {
        List <Porn85Res> list=new ArrayList <>();
        Iterable <Porn85Entity> all = pornRep.findAll();
        Iterator <Porn85Entity> iterator = all.iterator();
        Porn85Entity next;
        Porn85Res porn85Res;
        while (iterator.hasNext()) {
            next = iterator.next();
            porn85Res = new Porn85Res(next);
            list.add(porn85Res);
        }
        return list;
    }
    @ApiOperation(value = "新增影片接口",notes = "此接口作為\"Porn爬蟲\"來新增影片資訊的通道。",httpMethod = "POST",response = String.class)
    @RequestMapping(value = "api/add/85", method = RequestMethod.POST)//,consumes = "application/json",produces = "application/json"
    public String add(@RequestBody List<Porn85FilmData> porn85FilmDatas) {
        Iterator <Porn85FilmData> iterator = porn85FilmDatas.iterator();
        List<Porn85Entity> porn85EntityList=new ArrayList <>();
        Porn85Entity porn85Entity;
        while (iterator.hasNext()) {
            Porn85FilmData next = iterator.next();
            if (!pornRep.existsByFilmId(next.getFilmId())) {
                porn85Entity = new Porn85Entity();
                porn85Entity.setFilmId(next.getFilmId());
                porn85Entity.setCreateTime(new java.sql.Timestamp(new Date().getTime()));
                porn85Entity.setDuration(next.getDuration());
                porn85Entity.setFilmLinkUrl(next.getFilmLinkUrl());
                porn85Entity.setHidden(Boolean.FALSE);
                porn85Entity.setImgUrl(next.getImgUrl());
                porn85Entity.setVideoAdded(next.getVideoAdded());
                porn85Entity.setVideoTitle(next.getVideoTitle());
                pornRep.save(porn85Entity);
                porn85EntityList.add(porn85Entity);
            }
        }
        return "result: add " + porn85EntityList.size()+".";
    }
}
