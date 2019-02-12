package com.nguyendinhdoan.toeic.dao;

import com.nguyendinhdoan.toeic.common.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class GenericDaoImpl<Id extends Serializable, T> implements GenericDao<Id, T> {

    private Class<T> persistenceClass;

    public GenericDaoImpl() {
        this.persistenceClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    public String getPersistenceClassName() {
        return persistenceClass.getSimpleName();
    }

    public Session getSession() {
        return HibernateUtils.getSessionFactory().openSession();
    }

    public List<T> findAll() {
        List<T> listData = new ArrayList<T>();
        Transaction transaction = null;
        try {
            transaction = getSession().beginTransaction();
            StringBuilder sql = new StringBuilder("from ");
            sql.append(getPersistenceClassName());
            Query query = getSession().createQuery(sql.toString());
            listData = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            throw e;
        }
        return listData;
    }
}
