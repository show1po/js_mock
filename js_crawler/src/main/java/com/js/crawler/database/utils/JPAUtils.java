package com.js.crawler.database.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Show on 2017/6/1.
 */
public class JPAUtils {
    private static EntityManagerFactory entityManagerFactory;
    static {
        try {
            entityManagerFactory =
                    Persistence.createEntityManagerFactory("apples");
        }
        catch(Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void shutdown() {
        getEntityManagerFactory().close();
    }
}
