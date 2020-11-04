package com.coldchain.project.ocpcl.service;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.ocpcl.webservice.OperationCallback;

/**
 * OCP Client 接口服务
 */
public interface OcpClientApiService {

    /**
     * 检查连接
     *
     * @param message 消息
     * @return 结果
     */
    RestResponse echo(String message);

    /**
     * 激活操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    RestResponse activate(String carrier, String subscriberId, NtsUser loginUser);

    /**
     * 更改操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    RestResponse change(String carrier, String subscriberId, NtsUser loginUser);

    /**
     * 暂停操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    RestResponse suspend(String carrier, String subscriberId, NtsUser loginUser);

    /**
     * 启用操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    RestResponse unsuspend(String carrier, String subscriberId, NtsUser loginUser);

    /**
     * 禁用操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    RestResponse deactivate(String carrier, String subscriberId, NtsUser loginUser);

    /**
     * 交换操作
     *
     * @param carrier              运营商 INMARSATIDP,ORBCOMM
     * @param existingSubscriberId 现有订阅ID
     * @param replaceSubscriberId  取换订阅ID
     * @param loginUser            登录用户
     * @return 结果
     */
    RestResponse swap(String carrier, String existingSubscriberId, String replaceSubscriberId, NtsUser loginUser);

    /**
     * OCP Operation Callback
     *
     * @param operationCallback 回调结果
     */
    void callback(OperationCallback operationCallback);

    /**
     * 设备列表
     *
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @return 结果
     */
    RestResponse listSubscribers(String subscriberId);
}
