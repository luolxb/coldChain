package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.StoreGradeMapper;
import com.coldchain.entity.Store;
import com.coldchain.entity.StoreGrade;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.StoreGradeService;
import com.coldchain.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 店铺等级表 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-12-06
 */
@Service
public class StoreGradeServiceImpl extends ServiceImpl<StoreGradeMapper, StoreGrade> implements StoreGradeService {
    @Autowired
    private StoreService storeService;

    @Override
    public void remove(Integer gradeId) {

    }

    @Override
    public void insert(StoreGrade storeGrade) {

    }

    @Override
    public void update(StoreGrade storeGrade) {

    }
}
