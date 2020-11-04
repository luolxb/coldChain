package com.coldchain.project.business.pay;

import com.lly835.bestpay.model.PayResponse;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.project.business.user.domain.NtsUser;

/**
 * 企业支付Service接口
 */
public interface IPayService {

    /**
     * 微信支付-设备流量订单
     *
     * @param orderCode 订单编号
     * @param loginUser 登录用户
     * @return
     */
    public RestResponse wxPayForDeviceFlowOrder(String orderCode, NtsUser loginUser);

    /**
     * 微信支付-企业流量订单
     *
     * @param orderCode 订单编号
     * @param loginUser 登录用户
     * @return
     */
    public RestResponse wxPayForCompanyFlowOrder(String orderCode, NtsUser loginUser);

    /**
     * 阿里支付-设备流量订单
     *
     * @param orderCode 订单编号
     * @param loginUser 登录用户
     * @return
     */
    public RestResponse aliPayForFlowOrder(String orderCode, NtsUser loginUser);

    /**
     * 测试微信支付
     *
     * @param amount 金额
     * @return 结果
     */
    public PayResponse testWxPay(Double amount);

    /**
     * 支付回调通知
     *
     * @param notifyData 回调字符串
     * @return 结果
     */
    public PayResponse payNotify(String notifyData);

    /**
     * 支付结果
     *
     * @param orderCode 订单编号
     * @return 结果
     */
    public RestResponse payEnd(String orderCode);
}
