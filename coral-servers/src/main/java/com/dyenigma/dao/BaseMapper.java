package com.dyenigma.dao;

import java.util.List;

/**
 * coral
 * author: dyenigma
 * create: 2016/4/1 9:32
 */
public interface BaseMapper<T> {
    int insert(T t);

    int update(T t);

    int delById(long id);

    T selectById(long id);

    List<T> findAll();

    T findById(long id);
}
