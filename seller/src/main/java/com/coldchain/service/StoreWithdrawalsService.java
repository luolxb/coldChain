package com.coldchain.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.StoreWithdrawals;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.vo.StoreWithdrawalsExcel;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dyr
 * @since 2019-12-18
 */
public interface StoreWithdrawalsService extends IService<StoreWithdrawals> {
    //获取商家提现申请列表/转款列表
    IPage<StoreWithdrawals> getStoreWithdrawalsPage(Page<StoreWithdrawals> page, QueryWrapper<StoreWithdrawals> queryWrapper);

    //根据id获取商家提现申请/转款记录
    StoreWithdrawals getStoreWithdrawalsById(Integer id);

    //获取商家转款导出数据
    List<StoreWithdrawalsExcel> getStoreWithdrawalsExportData(QueryWrapper<StoreWithdrawals> wrapper);
}
