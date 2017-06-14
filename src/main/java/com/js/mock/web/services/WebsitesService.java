package com.js.mock.web.services;

import com.js.mock.web.pojos.WebsitesEntity;
import com.js.mock.web.repositorys.WebsitesRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by root on 2017/3/31.
 */
@RestController
public class WebsitesService {

    @Autowired
    WebsitesRep websitesRep;
    @RequestMapping(value = "/api/websites/getall", method = RequestMethod.GET)
    public Iterable<WebsitesEntity> getWebsites() {
        return websitesRep.findAll();
    }

    @RequestMapping(value = "/api/websites/add", method = RequestMethod.POST)
    public String createWebsites(@RequestBody List <WebsitesEntity> websitesEntities) {
        websitesEntities.forEach(websiteEntity->{
            websitesRep.save(websiteEntity);
        });
        return "succcess";
    }
}
