package com.dyenigma.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * coral 实体类基类，重写toString()方法
 * author: dyenigma
 * create: 2016/4/1 8:34
 */
public class BaseEntity {
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
