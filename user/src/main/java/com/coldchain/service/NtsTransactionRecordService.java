package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.NtsTransactionRecord;
import com.coldchain.entity.vo.NtsTransactionRecordVo;

public interface NtsTransactionRecordService extends IService<NtsTransactionRecord> {
    Page<NtsTransactionRecordVo> transactionRecordVoPage(Integer page, Integer size, String search, String type, Long start, Long end);
}
