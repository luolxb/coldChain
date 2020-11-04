package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.NtsUserMoneyDetail;
import com.coldchain.entity.vo.NtsUserMoneyDetailRq;
import com.coldchain.entity.vo.NtsUserMoneyDetailVo;
import com.common.vo.SBApi;

public interface NtsUserMoneyDetailService extends IService<NtsUserMoneyDetail> {

    Page<NtsUserMoneyDetailVo> userMoneyDetailPage(Integer page, Integer size, String search, String type, Long start, Long end);

    SBApi userMoneyDetailAdd(NtsUserMoneyDetailRq ntsUserMoneyDetailRq,Integer type);
}
