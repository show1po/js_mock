package com.js.mock.web.services;

import com.js.mock.web.pojos.Porn85Entity;
import com.js.mock.web.pojos.SeqingworldEntity;
import com.js.mock.web.repositorys.PornRep;
import com.js.mock.web.repositorys.SeqingworldRep;
import com.js.mock.web.requests.FindVideoReq;
import com.js.mock.web.responses.Porn85Res;
import com.js.mock.web.responses.Porn85ViewRes;
import com.js.mock.web.videos.bases.Video;
import com.js.mock.web.videos.bases.VideoEntity;
import com.js.mock.web.videos.enums.VideoSourceEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Show on 2017/6/2.
 */
@Api(value = "API - VideoService",description = "提供影片相關服務。")
@RestController
public class VideoService {
    @Autowired
    private PornRep pornRep;
    @Autowired
    private SeqingworldRep seqingworldRep;

    @ApiOperation(value = "查詢影片接口", notes = "搜尋影片。", httpMethod = "POST")
    @RequestMapping(value = "api/video/search", method = RequestMethod.POST)
    public VideoEntity findFilm(@RequestBody FindVideoReq findVideoReq) {
//        int viewBy = findVideoReq.getVideoPager().getViewBy();
//        int currentPage = findVideoReq.getVideoPager().getCurrentPage();
//        int totalPages = findVideoReq.getVideoPager().getTotalPages();
//        if (findVideoReq.getVideoSourceEnum() == VideoSourceEnum.PORN_85) {
//            List<Porn85Entity> byVideoTitleContaining = pornRep.findByVideoTitleContaining(findVideoReq.getKeyword().trim().equals("") ? "%" : findVideoReq.getKeyword().trim());
//            int tp =(int) Math.ceil((double) byVideoTitleContaining.size() /(double) viewBy);
//            if(currentPage>tp){
//                currentPage = tp;
//            }else if(currentPage<1){
//                currentPage = 1;
//            }
//            int minIndex=(currentPage>=1&&currentPage<=tp)?(currentPage-1)*viewBy:0;
//            int maxIndex=(currentPage>=1&&currentPage<tp)?(currentPage)*viewBy :((byVideoTitleContaining.size()<viewBy)?byVideoTitleContaining.size():byVideoTitleContaining.size());
//            List<Porn85Entity> porn85Entities;
//            if(byVideoTitleContaining.size()==0){
//                porn85Entities=new ArrayList<>();
//            }else{
//                porn85Entities = byVideoTitleContaining.subList(minIndex, maxIndex);
//            }
//            Iterator<Porn85Entity> iterator = porn85Entities.iterator();
//            List<VideoEntity> porn85ResList=new ArrayList<Porn85Res>();
//            Porn85Res porn85Res;
//            while (iterator.hasNext()) {
//                Porn85Entity next = iterator.next();
//                porn85Res = new Porn85Res(next);
//                porn85ResList.add(porn85Res);
//            }
//            Porn85ViewRes porn85ViewRes = new Porn85ViewRes(porn85ResList, tp, currentPage, viewBy, byVideoTitleContaining.size());
//        } else if (findVideoReq.getVideoSourceEnum() == VideoSourceEnum.SEQUING_WORLD) {
//        } else if(findVideoReq.getVideoSourceEnum()==VideoSourceEnum.ALL){
//        }
//        return one;
        return null;
    }
}
