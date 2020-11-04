package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.NtsUserProductOrder;
import com.coldchain.entity.vo.NtsUserProductOrderRq;
import com.coldchain.entity.vo.NtsUserProductOrderVo;

public interface NtsUserProductOrderService extends IService<NtsUserProductOrder> {
    NtsUserProductOrderVo add(NtsUserProductOrderRq productOrderRq);

    void pay(NtsUserProductOrderRq productOrderRq);

    Page<NtsUserProductOrderVo> productOrderPage(String type, Long start, Long end, Integer page, Integer size);
}
