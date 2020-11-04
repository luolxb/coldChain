package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsTransactionRecord;
import com.coldchain.entity.vo.NtsTransactionRecordVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NtsTransactionRecordMapper extends BaseMapper<NtsTransactionRecord> {

    List<NtsTransactionRecordVo> transactionRecordVoPage(Page<NtsTransactionRecordVo> transactionRecordVoPage,
                                                         @Param("userId") Integer userId,
                                                         @Param("search") String search,
                                                         @Param("type") String type,
                                                         @Param("start") Long start,
                                                         @Param("end") Long end);
}
