package com.nguyendinhdoan.toeic.dao;


import java.io.Serializable;
import java.util.List;

/*
* Id: Primary key
* T: Entity
* */
public interface GenericDao<Id extends Serializable, T>{
    List<T> findAll();
}
