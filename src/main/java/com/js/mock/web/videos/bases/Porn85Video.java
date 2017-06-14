package com.js.mock.web.videos.bases;

import com.js.mock.web.repositorys.PornRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Show on 2017/6/2.
 */
public class Porn85Video implements Video {
    private PornRep pornRep;

    public Porn85Video(CrudRepository pornRep) {
        this.pornRep =(PornRep) pornRep;
    }

    @Override
    public VideoEntity findVideo() {
       return pornRep.findByFilmId("5871");
    }
}
