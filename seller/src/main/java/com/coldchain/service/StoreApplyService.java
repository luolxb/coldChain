package com.coldchain.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.StoreApply;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.User;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dyr
 * @since 2019-12-06
 */
public interface StoreApplyService extends IService<StoreApply> {

    //开店审核
    void storeAudit(StoreApply storeApply);

    void add(User user, StoreApply storeApply);

    void updateByUser(User user, StoreApply storeApply);

    void withUser(List<StoreApply> records);

    void withRegionsName(StoreApply storeApply);

}
