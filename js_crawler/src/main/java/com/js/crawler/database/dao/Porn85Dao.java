package com.js.crawler.database.dao;

import com.js.crawler.database.entities.Porn85Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by root on 2017/4/17.
 */
public class Porn85Dao {
    public static void main(String[] args) {
        EntityManagerFactory gamble = Persistence.createEntityManagerFactory("apples");
        EntityManager entityManager = gamble.createEntityManager();
        List <Porn85Entity> resultList = entityManager.createQuery("select p from Porn85Entity p", Porn85Entity.class).getResultList();
        System.out.println(resultList);
    }
}
