package com.common.utils;


import cn.hutool.core.lang.UUID;

/**
 * 字符串处理工具类
 * @author chenqingshan
 */
public class StringUtil {

    /**
     * 创建UUID字符串用于唯一标识
     * @return UUID字符串
     */
    public static String createUUID(){
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        return str.replaceAll("-", "");
    }


}
