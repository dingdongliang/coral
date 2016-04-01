package com.dyenigma.util;

/**
 * coral 字符串处理工具类
 * author: dyenigma
 * create: 2016/4/1 8:50
 */
public class StringUtil {
    private StringUtil() {
    }

    //全部都是空格也算字符串为空
    public static boolean isEmpty(String s) {
        return s == null || s.equalsIgnoreCase("null") || s.trim().length() <= 0;
    }

}
