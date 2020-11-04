package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.StoreMapper;
import com.coldchain.entity.*;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.*;
import com.coldchain.vo.StoreAddVo;
import com.coldchain.vo.StoreSlideVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 店铺数据表 服务实现类
 *
 * @author dyr
 * @since 2019-11-19
 */
@Service("storeService")
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements StoreService {
    @Autowired
    private SellerService sellerService;
    @Autowired
    private UserService userService;
    @Autowired
    private StoreExtendService storeExtendService;
    @Autowired
    private StoreApplyService storeApplyService;
    @Autowired
    private StoreClassService storeClassService;
    @Autowired
    private StoreGradeService storeGradeService;
    @Autowired
    private MallService mallService;
    @Autowired
    private OrderService orderService;


    public void withInviteUser(List<Store> storeList) {
        // 获取店铺推荐用户id集合并过滤默认为0的id
        Set<Integer> userIds = storeList.stream()
                .filter(store -> store.getInviteUserId() != 0)
                .map(Store::getInviteUserId)
                .collect(Collectors.toSet());
        if (!userIds.isEmpty()) {
            Map<Integer, User> userMap = userService.users(userIds)
                    .stream().collect(Collectors.toMap(User::getUserId, user -> user));
            storeList.forEach(store -> {
                store.setInviteUser(userMap.get(store.getInviteUserId()));
            });
        }
    }

    @Override
    public void withStoreOrderSum(List<Store> records) {
        if (!records.isEmpty()) {
            Set<Integer> storeIds = records.stream().map(Store::getStoreId).collect(Collectors.toSet());
            Map<Integer, Set<Integer>> storeMemberIds = userService.getUserIdsByIsStoreMember(storeIds);
            if (storeMemberIds.size() > 0) {
                Set<Integer> userIds = new HashSet<>();
                storeMemberIds.forEach((k, v) -> {
                    userIds.addAll(v);
                });
                Map<Integer, BigDecimal> userOrderSumMap = orderService.getUserOrderSumByUserIds(userIds);
                if (!userOrderSumMap.isEmpty()) {
                    for (Store store : records) {
                        if (storeMemberIds.containsKey(store.getStoreId())) {
                            Set<Integer> memberIds = storeMemberIds.get(store.getStoreId());
                            BigDecimal storeOrderSum = new BigDecimal(BigInteger.ZERO);
                            for (Integer userId : memberIds) {
                                if (userOrderSumMap.containsKey(userId)) {
                                    storeOrderSum = storeOrderSum.add(userOrderSumMap.get(userId));
                                }
                            }
                            store.setStoreOrderSum(storeOrderSum);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void withStoreMemberCount(List<Store> records) {
        if (!records.isEmpty()) {
            Set<Integer> storeIds = records.stream().map(Store::getStoreId).collect(Collectors.toSet());
            Map<Integer, Integer> storeMemberCountGroupMap = userService.getStoreMemberCountGroup(storeIds);
            if (storeMemberCountGroupMap != null && !storeMemberCountGroupMap.isEmpty()) {
                records.forEach(store -> {
                    store.setStoreMemberCount(storeMemberCountGroupMap.get(store.getStoreId()));
                });
            }
        }
    }

    @Override
    public void withSeller(List<Store> records) {
        if (!records.isEmpty()) {
            Set<Integer> storeIds = records.stream().map(Store::getStoreId).collect(Collectors.toSet());
            Map<Integer, Seller> sellerMap = sellerService.list(new QueryWrapper<Seller>()
                    .eq("is_admin", 1).in("store_id", storeIds).select("store_id, seller_name"))
                    .stream().collect(Collectors.toMap(Seller::getStoreId, seller -> seller));
            records.forEach(store -> {
                store.setSeller(sellerMap.get(store.getStoreId()));
            });
        }
    }

    @Override
    public void withStoreClass(List<Store> records) {
        if (!records.isEmpty()) {
            Set<Integer> scIds = records.stream().map(Store::getScId).collect(Collectors.toSet());
            if (scIds.contains(0) && scIds.size() == 1) {
                return;
            }
            Map<Integer, StoreClass> storeClassMap = storeClassService.listByIds(scIds)
                    .stream().collect(Collectors.toMap(StoreClass::getScId, storeClass -> storeClass));
            records.forEach(store -> {
                store.setStoreClass(storeClassMap.getOrDefault(store.getScId(), null));
            });
        }
    }

    @Override
    public void withStoreGrade(List<Store> records) {
        if (!records.isEmpty()) {
            Set<Integer> gradeIds = records.stream().map(Store::getGradeId).collect(Collectors.toSet());
            Map<Integer, StoreGrade> storeGradeMap = storeGradeService.listByIds(gradeIds)
                    .stream().collect(Collectors.toMap(StoreGrade::getSgId, storeGrade -> storeGrade));
            records.forEach(store -> {
                store.setStoreGrade(storeGradeMap.get(store.getGradeId()));
            });
        }
    }

    @Override
    public void withUserInfo(List<Store> records) {
        if (!records.isEmpty()) {
            Set<Integer> userIds = records.stream().map(Store::getUserId).collect(Collectors.toSet());
            if (!userIds.isEmpty()) {
                Map<Integer, User> userMap = userService.users(userIds)
                        .stream().collect(Collectors.toMap(User::getUserId, user -> user));
                records.forEach(store -> {
                    User user = userMap.get(store.getUserId());
                    store.setNickname(user.getNickname());
                    store.setMobile(user.getMobile());
                    store.setRegTime(user.getRegTime());
                });
            }
        }
    }

    @Override
    public StoreSlideVO getSlide(Seller seller) {
        StoreSlideVO storeSlideVO = new StoreSlideVO();
        Store store = getById(seller.getStoreId());
        String storeSlide = store.getStoreSlide();
        String storeSlideUrl = store.getStoreSlideUrl();
        if (!StringUtils.isEmpty(storeSlide)) {
            storeSlideVO.setSlides(storeSlide.split(","));
        } else {
            storeSlideVO.setSlides(new String[5]);
        }
        if (!StringUtils.isEmpty(storeSlideUrl)) {
            storeSlideVO.setSlideUrls(storeSlideUrl.split(","));
        } else {
            storeSlideVO.setSlideUrls(new String[5]);
        }
        return storeSlideVO;
    }

    @Override
    public StoreSlideVO getMobileSlide(Seller seller) {
        StoreSlideVO storeSlideVO = new StoreSlideVO();
        Store store = getById(seller.getStoreId());
        String mbSlide = store.getMbSlide();
        String mbSlideUrl = store.getMbSlideUrl();
        if (!StringUtils.isEmpty(mbSlide)) {
            storeSlideVO.setSlides(mbSlide.split(","));
        } else {
            storeSlideVO.setSlides(new String[5]);
        }
        if (!StringUtils.isEmpty(mbSlideUrl)) {
            storeSlideVO.setSlideUrls(mbSlideUrl.split(","));
        } else {
            storeSlideVO.setSlideUrls(new String[5]);
        }
        return storeSlideVO;
    }

    @Override
    public Integer addStore(StoreAddVo storeAddVo) {

        // 添加店铺管理员
          return  -1;
    }

    @Override
    public void updateStoreDetail(Store store) {

    }

    @Override
    public void updateStore(Store store) {

    }

    @Override
    public void removeStore(Integer storeId) {

    }

    @Override
    public void setDefaultStore(Integer storeId) {

    }
}
