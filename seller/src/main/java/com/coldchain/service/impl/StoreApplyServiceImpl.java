package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.StoreApplyMapper;
import com.coldchain.entity.*;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-12-06
 */
@Service
public class StoreApplyServiceImpl extends ServiceImpl<StoreApplyMapper, StoreApply> implements StoreApplyService {
    @Autowired
    private UserService userService;
    @Autowired
    private SellerService sellerService;
    @Autowired
    private StoreService storeService;
    @Autowired
    private MallService mallService;

    @Override
    public void storeAudit(StoreApply storeApply) {


    }

    @Override
    public void add(User user, StoreApply storeApply) {
        //检查店铺名称是否重复
        StoreApply sa = getOne(new QueryWrapper<StoreApply>().eq("user_id", user.getUserId()));
        if (sa != null) {
            throw new ShopException(ResultEnum.FAIL);
        }
        storeApply.setUserId(user.getUserId());
        storeApply.setApplyType(0);
        storeApply.setAddTime(System.currentTimeMillis() / 1000);
        save(storeApply);
    }

    @Override
    public void updateByUser(User user, StoreApply storeApply) {
        //检查店铺名称是否重复

    }

    @Override
    public void withUser(List<StoreApply> records) {
        if (!records.isEmpty()) {
            Set<Integer> userIds = records.stream().map(StoreApply::getInviteUserId).collect(Collectors.toSet());
            Map<Integer, User> userMap = userService.users(userIds).stream().collect(Collectors.toMap(User::getUserId, user -> user));
            records.forEach(storeApply -> {
                storeApply.setInviteUser(userMap.get(storeApply.getInviteUserId()));
            });
        }
    }

    @Override
    public void withRegionsName(StoreApply storeApply) {
        if (storeApply != null) {
            HashSet<Integer> regionIds = new HashSet<>();
            regionIds.add(storeApply.getCompanyProvince());
            regionIds.add(storeApply.getCompanyCity());
            regionIds.add(storeApply.getCompanyDistrict());
            regionIds.add(storeApply.getBankProvince());
            regionIds.add(storeApply.getBankCity());
            Map<Integer, String> regionMap = mallService.listRegion(regionIds)
                    .stream().collect(Collectors.toMap(Region::getId, Region::getName));
            storeApply.setProvinceName(regionMap.get(storeApply.getCompanyProvince()));
            storeApply.setCityName(regionMap.get(storeApply.getCompanyCity()));
            storeApply.setDistrictName(regionMap.get(storeApply.getCompanyDistrict()));
            storeApply.setBankProvinceName(regionMap.get(storeApply.getBankProvince()));
            storeApply.setBankCityName(regionMap.get(storeApply.getBankCity()));
        }
    }
}
