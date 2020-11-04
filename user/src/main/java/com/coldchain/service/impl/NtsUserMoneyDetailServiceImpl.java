package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsUserMoneyDetailMapper;
import com.coldchain.entity.NtsTransactionRecord;
import com.coldchain.entity.NtsUserMoneyDetail;
import com.coldchain.entity.vo.NtsUserMoneyDetailRq;
import com.coldchain.entity.vo.NtsUserMoneyDetailVo;
import com.coldchain.entity.vo.NtsUserProductOrderRq;
import com.coldchain.service.NtsTransactionRecordService;
import com.coldchain.service.NtsUserMoneyDetailService;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.service.AlipayService;
import com.common.service.WxPayService;
import com.common.utils.StringUtil;
import com.common.vo.SBApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class NtsUserMoneyDetailServiceImpl extends ServiceImpl<NtsUserMoneyDetailMapper, NtsUserMoneyDetail> implements NtsUserMoneyDetailService {

    private String callbackUrl="/user/account/wx/notify";

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private WxPayService wxPayService;

    @Autowired
    private AlipayService alipayService;

    @Autowired
    private NtsTransactionRecordService ntsTransactionRecordService;

    /**
     * 余额明细
     *
     * @param page
     * @param size
     * @param search
     * @param type
     * @param start
     * @param end
     * @return
     */
    @Override
    public Page<NtsUserMoneyDetailVo> userMoneyDetailPage(Integer page, Integer size, String search, String type, Long start, Long end) {
        UserDto userDto = authenticationFacade.getUser();
        Page<NtsUserMoneyDetailVo> moneyDetailVoPage = new Page<>(page, size);
        List<NtsUserMoneyDetailVo> userMoneyDetailVoList = this.baseMapper.userMoneyDetailPage(moneyDetailVoPage, userDto.getUserId(), search, type, start, end);
        return moneyDetailVoPage.setRecords(userMoneyDetailVoList);
    }

    /**
     * @param ntsUserMoneyDetailRq
     * @return
     */
    @Override
    public SBApi userMoneyDetailAdd(NtsUserMoneyDetailRq ntsUserMoneyDetailRq,Integer type) {
        if (ntsUserMoneyDetailRq.getTPrice() == null) {
            throw new ShopException(-1, "充值金额不能为空");
        }

        if (ntsUserMoneyDetailRq.getTPrice().compareTo(new BigDecimal("100")) < 0) {
            throw new ShopException(-1, "充值金额不能低于100元");
        }

        UserDto userDto = authenticationFacade.getUser();
        // 新增详情
        Date date = new Date();
        String type1= "微信支付";
        String type2= "支付宝支付";
        String uuid = StringUtil.createUUID();
        NtsUserMoneyDetail ntsUserMoneyDetail = new NtsUserMoneyDetail();
        ntsUserMoneyDetail.setUserId(userDto.getUserId());
        ntsUserMoneyDetail.setCreateTime(date);
        ntsUserMoneyDetail.setRemark("余额充值");
        ntsUserMoneyDetail.setTUserMoneyCode(uuid);
        ntsUserMoneyDetail.setCreateBy(userDto.getNickname());
        ntsUserMoneyDetail.setTPrice(ntsUserMoneyDetailRq.getTPrice());

        NtsTransactionRecord ntsTransactionRecord = new NtsTransactionRecord();
        ntsTransactionRecord.setPrice(ntsUserMoneyDetailRq.getTPrice());
        ntsTransactionRecord.setTransactionRecordCode(uuid);
        ntsTransactionRecord.setUserId(userDto.getUserId());
        ntsTransactionRecord.setCreateTime(date);
        ntsTransactionRecord.setRemark("余额充值");
        ntsTransactionRecord.setStatus(0);
        ntsTransactionRecord.setTable("nts_user_money_detail");

        switch (type) {
            case 1:
                // 调用微信下单接口
                ntsTransactionRecord.setType(type1);
                ntsUserMoneyDetail.setTType(type1);

                save(ntsUserMoneyDetail);
                ntsTransactionRecordService.save(ntsTransactionRecord);
                return wxPayService.unifiedOrder(ntsUserMoneyDetail.getTUserMoneyCode(),ntsUserMoneyDetail.getTPrice(),"NATIVE",ntsUserMoneyDetail.getRemark(),null,callbackUrl);

            case 2:
                ntsTransactionRecord.setType(type2);
                ntsUserMoneyDetail.setTType(type2);
                save(ntsUserMoneyDetail);
                ntsTransactionRecordService.save(ntsTransactionRecord);
                return new SBApi(alipayService.tradePayRequest(ntsUserMoneyDetail.getTUserMoneyCode(), ntsUserMoneyDetail.getTPrice(), ntsUserMoneyDetail.getRemark(), "WEB"));
        }

        return new SBApi();
    }
}
