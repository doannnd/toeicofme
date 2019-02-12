package com.nguyendinhdoan.toeic.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
* @return SessionFactory object
* */
public class HibernateUtils {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static SessionFactory getSessionFactory() {
       return sessionFactory;
    }
}
