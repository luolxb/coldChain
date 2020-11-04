package com.coldchain.service.impl;

import com.coldchain.dao.CommonSequenceMapper;
import com.coldchain.service.CommonSequenceService;
import com.common.exception.ShopException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class CommonSequenceServiceImpl implements CommonSequenceService {

    @Autowired
    private CommonSequenceMapper commonSequenceMapper;

    @Override
    public String getCommonSequence(String prefix, String pattern, Integer count, String tableName){
        if (StringUtils.isBlank(prefix)) {
            prefix = "_";
        }
        if (StringUtils.isBlank(pattern)) {
            pattern = "yyyyMMdd";
        }
        if (count == null) {
            count = 10;
        }
        if (StringUtils.isBlank(tableName)) {
            throw new ShopException(-1,"表名不能为空");
        }
        return prefix + DateFormatUtils.format(new Date(), pattern) + commonSequenceMapper.querySequence(count,tableName.replaceAll("\\\\",""),"'coldchain_user'");

    }

}
