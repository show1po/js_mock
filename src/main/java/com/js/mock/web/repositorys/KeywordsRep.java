package com.js.mock.web.repositorys;

import com.js.mock.web.pojos.KeywordsEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by root on 2017/4/18.
 */
public interface KeywordsRep extends CrudRepository <KeywordsEntity, Integer> {
    List<KeywordsEntity> findByAvailable(boolean available);
    KeywordsEntity findByName(String name);

    List <KeywordsEntity> findByNameContaining(String name);

//    @Modifying
//    @Query(value = "Alter table keywords AUTO_INCREMENT = 1;",nativeQuery = true)
//    void resetId();
}
