package com.dyenigma.api;

import java.util.List;

/**
 * coral 通用API接口方法
 * author: dyenigma
 * create: 2016/4/1 8:30
 */
public interface BaseService<T> {
    int insert(T t);

    int update(T t);

    int delById(long id);

    T selectById(long id);

    List<T> findAll();

    T findById(long id);
}
