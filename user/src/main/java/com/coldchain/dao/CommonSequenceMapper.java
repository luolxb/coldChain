package com.coldchain.dao;

import org.apache.ibatis.annotations.Param;

public interface CommonSequenceMapper {

    String querySequence(@Param("num") Integer num,
                         @Param("tableName") String tableName,
                         @Param("dbName") String dbName);
}
