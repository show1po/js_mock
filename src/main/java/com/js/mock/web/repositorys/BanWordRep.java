package com.js.mock.web.repositorys;

import com.js.mock.web.pojos.BanwordEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by root on 2017/4/18.
 */
public interface BanWordRep extends CrudRepository <BanwordEntity, Integer> {
    BanwordEntity findByName(String name);
}
