package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsTransactionRecordMapper;
import com.coldchain.entity.NtsTransactionRecord;
import com.coldchain.entity.vo.NtsTransactionRecordVo;
import com.coldchain.service.NtsTransactionRecordService;
import com.common.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class NtsTransactionRecordServiceImpl extends ServiceImpl<NtsTransactionRecordMapper,NtsTransactionRecord> implements NtsTransactionRecordService {

    @Autowired
    private AuthenticationFacade authenticationFacade;


    @Override
    public Page<NtsTransactionRecordVo> transactionRecordVoPage(Integer page, Integer size, String search, String type, Long start, Long end) {
        UserDto userDto = authenticationFacade.getUser();
        Page<NtsTransactionRecordVo> transactionRecordVoPage = new Page<>(page, size);
        List<NtsTransactionRecordVo> transactionRecordVoList = this.baseMapper.transactionRecordVoPage(transactionRecordVoPage,userDto.getUserId(),search,type,start,end);
        return transactionRecordVoPage;
    }
}
