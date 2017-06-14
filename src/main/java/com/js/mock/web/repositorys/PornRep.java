package com.js.mock.web.repositorys;

import com.js.mock.web.pojos.Porn85Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by root on 2017/4/12.
 */
public interface PornRep extends CrudRepository <Porn85Entity, Integer> {
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN 'true' ELSE 'false' END FROM Porn85Entity u WHERE u.filmId = ?1")
    boolean existsByFilmId(String filmId);

    List<Porn85Entity> findByVideoTitleContaining(String videoTitle);

    Porn85Entity findByFilmId(String filmId);

    @Query("select e.videoTitle from Porn85Entity e")
    List <String> findAllVideoTitle();
}
