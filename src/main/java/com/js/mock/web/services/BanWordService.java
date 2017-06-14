package com.js.mock.web.services;

import com.js.mock.web.pojos.BanwordEntity;
import com.js.mock.web.repositorys.BanWordRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 2017/4/18.
 */
@RestController
public class BanWordService {
    @Autowired
    private BanWordRep banWordRep;

    @RequestMapping(value = "api/add/banword",method = RequestMethod.POST)
    public int addBanWord(@RequestBody List<String> list) {
        List<BanwordEntity> result=new ArrayList <>();
        list.stream().forEach(word->{
            if (banWordRep.findByName(word) == null) {
                BanwordEntity banwordEntity=new BanwordEntity();
                banwordEntity.setName(word);
                banWordRep.save(banwordEntity);
                result.add(banwordEntity);
            }
        });
        return result.size();
    }
}
