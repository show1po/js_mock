package com.js.mock.web.videos.bases;

import com.js.mock.web.repositorys.PornRep;
import com.js.mock.web.repositorys.SeqingworldRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Show on 2017/6/2.
 */
public class SequingWorldVideo implements Video {
    private SeqingworldRep seqingworldRep;

    public SequingWorldVideo(CrudRepository seqingworldRep) {
        this.seqingworldRep =(SeqingworldRep) seqingworldRep;
    }

    @Override
    public VideoEntity findVideo() {
        return seqingworldRep.findOne("10034");
    }
}
