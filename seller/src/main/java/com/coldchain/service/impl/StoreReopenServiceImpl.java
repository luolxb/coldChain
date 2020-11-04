package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.StoreReopenMapper;
import com.coldchain.entity.Store;
import com.coldchain.entity.StoreGrade;
import com.coldchain.entity.StoreReopen;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.StoreGradeService;
import com.coldchain.service.StoreReopenService;
import com.coldchain.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 * <p>
 * 续签内容表 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2020-03-06
 */
@Service
public class StoreReopenServiceImpl extends ServiceImpl<StoreReopenMapper, StoreReopen> implements StoreReopenService {
    @Autowired
    private StoreGradeService storeGradeService;
    @Autowired
    private StoreService storeService;

    @Override
    public void saveStoreReopen(StoreReopen storeReopen) {


    }
}
