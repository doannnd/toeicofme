package com.nguyendinhdoan.toeic.dao;

import com.nguyendinhdoan.toeic.common.HibernateUtils;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class GenericDaoImpl<Id extends Serializable, T> implements GenericDao<Id, T> {

    public Session getSession() {
        return HibernateUtils.getSessionFactory().openSession();
    }

    public List<T> findAll() {
        return null;
    }
}
