package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.dao.StoreWithdrawalsMapper;
import com.coldchain.entity.StoreWithdrawals;
import com.coldchain.service.StoreWithdrawalsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.vo.StoreWithdrawalsExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-12-18
 */
@Service
public class StoreWithdrawalsServiceImpl extends ServiceImpl<StoreWithdrawalsMapper, StoreWithdrawals> implements StoreWithdrawalsService {
    @Autowired
    private StoreWithdrawalsMapper storeWithdrawalsMapper;

    @Override
    public IPage<StoreWithdrawals> getStoreWithdrawalsPage(Page<StoreWithdrawals> page, QueryWrapper<StoreWithdrawals> queryWrapper) {
        return storeWithdrawalsMapper.selectStoreWithdrawalsPage(page, queryWrapper);
    }

    @Override
    public StoreWithdrawals getStoreWithdrawalsById(Integer id) {
        return storeWithdrawalsMapper.selectStoreWithdrawalsById(id);
    }

    @Override
    public List<StoreWithdrawalsExcel> getStoreWithdrawalsExportData(QueryWrapper<StoreWithdrawals> wrapper) {
        return storeWithdrawalsMapper.selectStoreWithdrawalsExportData(wrapper);
    }
}
