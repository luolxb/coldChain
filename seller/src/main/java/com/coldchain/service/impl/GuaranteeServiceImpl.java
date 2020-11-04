package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.GuaranteeMapper;
import com.coldchain.dto.GuaranteeApplyDto;
import com.coldchain.entity.*;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * 店铺消费者保障服务加入情况表 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2020-03-11
 */
@Service
public class GuaranteeServiceImpl extends ServiceImpl<GuaranteeMapper, Guarantee> implements GuaranteeService {
    @Autowired
    private GuaranteeItemService guaranteeItemService;
    @Autowired
    private GuaranteeLogService guaranteeLogService;
    @Autowired
    private StoreService storeService;
    @Autowired
    private GuaranteeApplyService guaranteeApplyService;
    @Autowired
    private SellerService sellerService;

    @Override
    public void withGuaranteeItem(List<Guarantee> guaranteeList) {
        Set<Integer> grtIds = guaranteeList.stream().map(Guarantee::getGrtId).collect(Collectors.toSet());
        if (!grtIds.isEmpty()) {
            Map<Integer, GuaranteeItem> guaranteeItemMap = guaranteeItemService.listByIds(grtIds)
                    .stream().collect(Collectors.toMap(GuaranteeItem::getGrtId, guaranteeItem -> guaranteeItem));
            for (Guarantee guarantee : guaranteeList) {
                guarantee.setGrtName(guaranteeItemMap.get(guarantee.getGrtId()).getGrtName());
            }
        }
    }

    @Override
    public void updateIsOpen(Guarantee guarantee, String logMsg) {

    }

    @Override
    public void apply(GuaranteeApplyDto guaranteeApplyDto) {
        GuaranteeItem guaranteeItem = guaranteeItemService.getOne(
                new QueryWrapper<GuaranteeItem>().eq("grt_state", 1).eq("grt_id", guaranteeApplyDto.getGrtId()));
        Guarantee exGuarantee = this.getOne(new QueryWrapper<Guarantee>()
                .eq("store_id", guaranteeApplyDto.getStoreId()).eq("grt_id", guaranteeApplyDto.getGrtId()));
        if (exGuarantee != null && exGuarantee.getAuditstate() == 0 && (exGuarantee.getJoinstate() == 1 || exGuarantee.getQuitstate() == 1)) {
            throw new ShopException(ResultEnum.IN_REVIEW);
        }
        Store store = storeService.getById(guaranteeApplyDto.getStoreId());
        GuaranteeApply guaranteeApply = new GuaranteeApply();
        guaranteeApply.setGrtId(guaranteeApplyDto.getGrtId());
        guaranteeApply.setStoreId(guaranteeApplyDto.getStoreId());
        guaranteeApply.setAddTime(System.currentTimeMillis() / 1000);
        guaranteeApply.setStoreName(store.getStoreName());
        guaranteeApply.setCost(guaranteeItem.getGrtCost());
        guaranteeApply.setApplyType(guaranteeApplyDto.getApplyType());
        guaranteeApplyService.save(guaranteeApply);

        Guarantee guarantee = new Guarantee();
        GuaranteeLog guaranteeLog = new GuaranteeLog();

        if (guaranteeApplyDto.getApplyType() == 1) {
            guarantee.setJoinstate(1);
            guarantee.setAuditstate(0);
            guaranteeLog.setLogMsg("店铺申请加入保障服务");
        } else {
            guarantee.setQuitstate(1);
            guaranteeLog.setLogMsg("店铺申请退出保障服务");
        }

        guarantee.setGrtId(guaranteeApplyDto.getGrtId());
        guarantee.setStoreId(guaranteeApplyDto.getStoreId());
        guarantee.setStoreName(store.getStoreName());
        guarantee.setCost(guaranteeItem.getGrtCost());

        if (exGuarantee != null) {
            guarantee.setId(exGuarantee.getId());
            this.updateById(guarantee);
        } else {
            this.save(guarantee);
        }

        Seller seller = sellerService.getById(guaranteeApplyDto.getSellerId());
        guaranteeLog.setLogStoreid(guaranteeApplyDto.getStoreId());
        guaranteeLog.setLogStorename(store.getStoreName());
        guaranteeLog.setLogGrtid(guaranteeApplyDto.getGrtId());
        guaranteeLog.setLogGrtname(guaranteeItem.getGrtName());
        guaranteeLog.setLogAddtime(System.currentTimeMillis() / 1000);
        guaranteeLog.setLogRole("商家");
        guaranteeLog.setLogUserid(seller.getUserId());
        guaranteeLog.setLogUsername(seller.getSellerName());
        guaranteeLogService.save(guaranteeLog);
    }
}

