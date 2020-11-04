package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsUserMoneyDetail;
import com.coldchain.entity.vo.NtsUserMoneyDetailVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NtsUserMoneyDetailMapper extends BaseMapper<NtsUserMoneyDetail> {

    List<NtsUserMoneyDetailVo> userMoneyDetailPage(Page<NtsUserMoneyDetailVo> moneyDetailVoPage,
                                                   @Param("userId") Integer userId,
                                                   @Param("search") String search,
                                                   @Param("type") String type,
                                                   @Param("start") Long start,
                                                   @Param("end") Long end);
}
