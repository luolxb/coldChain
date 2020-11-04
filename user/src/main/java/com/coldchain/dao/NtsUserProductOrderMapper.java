package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsUserProductOrder;
import com.coldchain.entity.vo.NtsUserProductOrderVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NtsUserProductOrderMapper extends BaseMapper<NtsUserProductOrder> {
    List<NtsUserProductOrderVo> productOrderPage(Page<NtsUserProductOrderVo> ntsUserProductOrderVoPage,
                                                 @Param("userId") Integer userId,
                                                 @Param("type") String type,
                                                 @Param("start") Long start,
                                                 @Param("end") Long end);
}
