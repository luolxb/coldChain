package com.coldchain.project.business.card.service;

import java.util.List;

/**
 * 调用外部接口
 *
 * @PackageName: com.coldchain.project.business.card.service
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-13 17:45
 **/
public interface NtsCardInfoOutService {

    /**
     * 获取所有的卡号
     *
     * @return
     */
    List getCardNoList();

    /**
     * 物联卡信息
     * * 单张物联卡信息查询
     *
     * @param iccid
     * @return
     */
    Object getCardInfo(String iccid);

    /**
     * 物联卡用量日志
     * 物联卡当月或指定月份用量日志查询
     *
     * @param iccid
     * @param date
     * @return
     */
    List getCardUsagelog(String iccid, String date);

    /**
     * 物联卡每日使用量
     * 物联卡查询指定月份每日使用量
     *
     * @param iccid
     * @param date
     * @return
     */
    Object getCardUsagedelta(String iccid, String date);

    /**
     * 查询物联卡实时开关机状态和移动网络在线状态
     *
     * @param iccid
     * @return
     */
    Object getStatus(String iccid);

    /**
     * 账户余额查询
     * 获取用户账户下流量充值的余额及短信条数余额。
     *
     * @return
     */
    Object getBalance();

    /**
     * 物联卡充值产品查询
     *
     * @return
     */
    List chargeProducts(String iccid);

    /**
     * 公告
     *
     * @return
     */
    Object notice();

    /**
     * 实名认证状态查询
     * @param iccid
     * @return
     */
    Object realnameStatus(String iccid);

}
