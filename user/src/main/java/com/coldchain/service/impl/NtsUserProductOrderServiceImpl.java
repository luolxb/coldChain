package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsUserProductOrderMapper;
import com.coldchain.entity.NtsProductVersion;
import com.coldchain.entity.NtsTransactionRecord;
import com.coldchain.entity.NtsUserProductOrder;
import com.coldchain.entity.User;
import com.coldchain.entity.vo.NtsUserProductOrderRq;
import com.coldchain.entity.vo.NtsUserProductOrderVo;
import com.coldchain.service.NtsProductVersionService;
import com.coldchain.service.NtsUserProductOrderService;
import com.coldchain.service.UserService;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class NtsUserProductOrderServiceImpl extends ServiceImpl<NtsUserProductOrderMapper, NtsUserProductOrder> implements NtsUserProductOrderService {

    @Autowired
    private NtsProductVersionService productVersionService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private UserService userService;

    /**
     * 立即购买，下订单
     *
     * @param productOrderRq
     * @return
     */
    @Override
    public NtsUserProductOrderVo add(NtsUserProductOrderRq productOrderRq) {
        if (productOrderRq.getProductId() == null) {
            throw new ShopException(-1, "产品ID不能为空");
        }
        NtsProductVersion productVersion = productVersionService.getById(productOrderRq.getProductId());
        if (productVersion == null) {
            throw new ShopException(-1, "产品不存在");
        }
        UserDto userDto = authenticationFacade.getUser();
        Date date = new Date();
        // 新增订单
        String uuid = StringUtil.createUUID();
        NtsUserProductOrder ntsUserProductOrder = new NtsUserProductOrder();
        ntsUserProductOrder.setProductId(productVersion.getId());
        ntsUserProductOrder.setUserId(userDto.getUserId());
        ntsUserProductOrder.setBuyPrice(productVersion.getProductPrice());
        ntsUserProductOrder.setStartTime(date);
        ntsUserProductOrder.setExpiredTime(DateUtils.addYears(date, 1));
        ntsUserProductOrder.setOriginalPrice(productVersion.getOriginalPrice());
        ntsUserProductOrder.setProductOrderCode(uuid);
        ntsUserProductOrder.setEffectiveTime(productVersion.getEffectiveTime());
        ntsUserProductOrder.setProductOrderContent(productVersion.getProductName());
        ntsUserProductOrder.setDeviceServerNum(productVersion.getDeviceServerNum());
        ntsUserProductOrder.setCreateBy(userDto.getNickname());
        ntsUserProductOrder.setCreateTime(date);
        this.save(ntsUserProductOrder);

        NtsUserProductOrderVo productOrderVo = new NtsUserProductOrderVo();
        BeanUtils.copyProperties(ntsUserProductOrder, productOrderVo);

        // 新增交易记录
        NtsTransactionRecord ntsTransactionRecord = new NtsTransactionRecord();
        ntsTransactionRecord.setPrice(productVersion.getProductPrice().negate());
        ntsTransactionRecord.setTransactionRecordCode(uuid);
        ntsTransactionRecord.setUserId(userDto.getUserId());
        ntsTransactionRecord.setCreateTime(date);
        ntsTransactionRecord.setRemark(productVersion.getProductName());
        ntsTransactionRecord.setStatus(0);
        ntsTransactionRecord.setTable("nts_user_product_order");

        return productOrderVo;
    }

    /**
     * 余额支付订单
     *
     * @param productOrderRq
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void pay(NtsUserProductOrderRq productOrderRq) {
        if (productOrderRq.getId() == null) {
            throw new ShopException(-1, "订单ID不能为空");
        }
        UserDto userDto = authenticationFacade.getUser();
        NtsUserProductOrder productOrder = this.getOne(new QueryWrapper<NtsUserProductOrder>()
                .eq("id", productOrderRq.getId())
                .eq("user_id", userDto.getUserId()));

        if (productOrder == null) {
            throw new ShopException(-1, "订单信息错误");
        }
        BigDecimal buyPrice = productOrder.getBuyPrice();

        User user = userService.getById(userDto.getUserId());
        BigDecimal userMoney = user.getUserMoney();
        if (userMoney.compareTo(buyPrice) < 0) {
            throw new ShopException(-1, "用户余额不足");
        }
        Date date = new Date();

        productOrder.setPayType("余额支付");
        productOrder.setPayStatus(1);
        productOrder.setBuyTime(date);
        productOrder.setUpdateBy(userDto.getNickname());
        productOrder.setUpdateTime(date);
        this.updateById(productOrder);

        // 修改用户余额
        BigDecimal subtract = userMoney.subtract(buyPrice);
        user.setUserMoney(subtract);
        user.setUpdateBy(userDto.getNickname());
        user.setUpdateTime(date);
        userService.updateById(user);
    }

    @Override
    public Page<NtsUserProductOrderVo> productOrderPage(String type, Long start, Long end, Integer page, Integer size) {
        Page<NtsUserProductOrderVo> ntsUserProductOrderVoPage = new Page<>(page, size);
        UserDto userDto = authenticationFacade.getUser();
        List<NtsUserProductOrderVo> ntsUserProductOrderVos = this.baseMapper.productOrderPage(ntsUserProductOrderVoPage,userDto.getUserId(),type,start,end);
        return ntsUserProductOrderVoPage.setRecords(ntsUserProductOrderVos);
    }

}
