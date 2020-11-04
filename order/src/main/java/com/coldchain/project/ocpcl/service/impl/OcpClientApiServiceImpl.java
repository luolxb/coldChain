package com.coldchain.project.ocpcl.service.impl;

import com.alibaba.fastjson.JSON;
import com.coldchain.common.base.ApiCode;
import com.coldchain.common.constant.Constants;
import com.coldchain.common.utils.EhcacheUtils;
import com.coldchain.common.utils.NtsUtil;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.project.business.device.domain.Device;
import com.coldchain.project.business.device.service.IDeviceService;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.ocpcl.config.OcpclConfig;
import com.coldchain.project.ocpcl.service.OcpClientApiService;
import com.coldchain.project.ocpcl.webservice.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.*;

/**
 * OCP Client 接口服务实现
 */
@Service
public class OcpClientApiServiceImpl implements OcpClientApiService {
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    // OCP缓存名
    private final static String OCP_CACHE = "ocp-cache";

    private static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

    @Autowired
    private OcpclConfig ocpclConfig;
    @Autowired
    private IDeviceService deviceService;

    /**
     * OcpClientWebService
     */
    private OcpClientWebService ocpClientWebService() {
        return OcpClientWebServiceImpl.getInstance().getProvisioningServiceHttpPort();
    }

    /**
     * header token
     */
    private Header getHeader() {
        Header header = new Header();
        header.setToken(ocpclConfig.getToken());
        return header;
    }

    /**
     * 检查连接
     *
     * @param message 消息
     * @return 结果
     */
    @Override
    public RestResponse echo(String message) {
        EchoRequest echoRequest = new EchoRequest();
        echoRequest.setMessage(message);

        try {
            OcpClientWebService ocpClientWebService = ocpClientWebService();
            EchoResponse echoResponse = ocpClientWebService.echo(getHeader(), echoRequest);
            return RestResponse.success("成功", echoResponse);
        } catch (FaultMessage faultMessage) {
            logger.error("echo - {}", faultMessage.getFaultInfo());
            return RestResponse.error(faultMessage.getFaultInfo());
        }
    }

    /**
     * 激活操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    // 这里进行标注为异步任务，在执行此方法的时候，会单独开启线程来执行(并指定线程池的名字)
//    @Async("threadPoolTaskExecutor")
    @Override
    public RestResponse activate(String carrier, String subscriberId, NtsUser loginUser) {
        Device device = deviceService.selectCompanyIdAndDeviceSn(loginUser.getCompanyId(), subscriberId);
        if (StringUtils.isNull(device)) {
            return RestResponse.error(ApiCode.PARAM_EXC.getCode(), "激活失败-卫星SN不存在");
        }

        // 激活传参配置
        ActivateRequest activateRequest = new ActivateRequest();
        activateRequest.setCallbackId(NtsUtil.generateOrderNumber());
        activateRequest.setCallbackEndpoint(ocpclConfig.getCallbackEndpoint());

        ActivateRequest.Activate activate = new ActivateRequest.Activate();
        if (carrier.equals(CarrierTypeActivate.INMARSATIDP.value())) { //INMARSATIDP OGI格式
            activate.setCarrier(CarrierTypeActivate.INMARSATIDP); //运营商
            activate.setSubscriberId(subscriberId); //订阅ID
            ActivateRequest.Activate.AccountSubaccount accountSubaccount = new ActivateRequest.Activate.AccountSubaccount();
            accountSubaccount.setAccount(8023); //账号
            accountSubaccount.setSubaccount(1); //子账号
            activate.setAccountSubaccount(accountSubaccount); //账号和子账号
            activate.setPricePlan("DEMOII");  //套餐
            ActivateRequest.Activate.InmarsatIdpActivateParams inmarsatIdpActivateParams = new ActivateRequest.Activate.InmarsatIdpActivateParams();
            inmarsatIdpActivateParams.setXmlGatewayAccount("NHBSMIOT");
            activate.setInmarsatIdpActivateParams(inmarsatIdpActivateParams); //INMARSATIDP-OGI相关传参
        } else if (carrier.equals(CarrierTypeActivate.ORBCOMM.value())) { //ORBCOMM OG2格式
            activate.setCarrier(CarrierTypeActivate.ORBCOMM); //运营商
            activate.setSubscriberId(subscriberId); //订阅ID
            ActivateRequest.Activate.AccountSubaccount accountSubaccount = new ActivateRequest.Activate.AccountSubaccount();
            accountSubaccount.setAccount(8023); //账号
            accountSubaccount.setSubaccount(2); //子账号
            activate.setAccountSubaccount(accountSubaccount); //账号和子账号
            activate.setPricePlan("MFG");  //套餐
            ActivateRequest.Activate.OrbcommActivateParams orbcommActivateParams = new ActivateRequest.Activate.OrbcommActivateParams();
            orbcommActivateParams.setInternetAddress("NTS123@RMS.CIMC.COM");
            orbcommActivateParams.setTerminalType(TermTypeType.MOBILE);
            orbcommActivateParams.setZone("CHN China, HongKong");
            orbcommActivateParams.setDeliveryPlan(0);
            orbcommActivateParams.setSpeedDial1("RMS@RMS.CIMC.COM");
            activate.setOrbcommActivateParams(orbcommActivateParams);
        }
        activateRequest.getActivate().add(activate);

        try {
            OcpClientWebService ocpClientWebService = ocpClientWebService();
            OperationResponse operationResponse = ocpClientWebService.operationActivate(getHeader(), activateRequest);
            OperationResponse.Operation operation = operationResponse.getOperation();

            String cacheKey = OperationType.ACTIVATE.value() + "_" + operation.getOperationId() + "_" + operation.getCallbackId();
            OcpMessage message = this.queryCacheTask(cacheKey);
            if (StringUtils.isNotNull(message)) {
                if (message.getFailed() == 0) {
                    // 激活状态，更新数据库
                    device.setActivate(Constants.ACTIVATE);
                    deviceService.updateDevice(device);
                    return RestResponse.success("激活操作成功", message);
                } else {
                    return RestResponse.object(ApiCode.FAIL.getCode(), "激活操作失败", message);
                }
            } else {
                return RestResponse.error(ApiCode.TIMEOUT_ERROR.getCode(), "激活操作超时");
            }
        } catch (FaultMessage faultMessage) {
            logger.error("activate - {}", faultMessage.getFaultInfo());
            return RestResponse.error(faultMessage.getFaultInfo());
        }
    }

    /**
     * 更改操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    @Override
    public RestResponse change(String carrier, String subscriberId, NtsUser loginUser) {
        Device device = deviceService.selectCompanyIdAndDeviceSn(loginUser.getCompanyId(), subscriberId);
        if (StringUtils.isNull(device)) {
            return RestResponse.error(ApiCode.PARAM_EXC.getCode(), "卫星SN不存在");
        }

        // 更改传参配置
        ChangeRequest changeRequest = new ChangeRequest();
        changeRequest.setCallbackId(NtsUtil.generateOrderNumber());
        changeRequest.setCallbackEndpoint(ocpclConfig.getCallbackEndpoint());

        ChangeRequest.Change change = new ChangeRequest.Change();
        if (carrier.equals(CarrierType.INMARSATIDP.value())) { //INMARSATIDP OGI格式
            change.setCarrier(CarrierType.INMARSATIDP); //运营商
            change.setSubscriberId(subscriberId); //卫星SN
            ChangeRequest.Change.InmarsatIdpChangeParams inmarsatIdpChangeParams = new ChangeRequest.Change.InmarsatIdpChangeParams();
            inmarsatIdpChangeParams.setXmlGatewayAccount("NHBSMIOT");
            change.setInmarsatIdpChangeParams(inmarsatIdpChangeParams); //INMARSATIDP-OGI相关传参
        } else if (carrier.equals(CarrierType.ORBCOMM.value())) { //ORBCOMM OG2格式
            change.setCarrier(CarrierType.ORBCOMM); //运营商
            change.setSubscriberId(subscriberId); //卫星SN
            ChangeRequest.Change.OrbcommChangeParams orbcommChangeParams = new ChangeRequest.Change.OrbcommChangeParams();
            change.setOrbcommChangeParams(orbcommChangeParams);
        }
        changeRequest.getChange().add(change);

        try {
            OcpClientWebService ocpClientWebService = ocpClientWebService();
            OperationResponse operationResponse = ocpClientWebService.operationChange(getHeader(), changeRequest);
            OperationResponse.Operation operation = operationResponse.getOperation();

            String cacheKey = OperationType.CHANGE.value() + "_" + operation.getOperationId() + "_" + operation.getCallbackId();
            OcpMessage message = this.queryCacheTask(cacheKey);
            if (StringUtils.isNotNull(message)) {
                if (message.getFailed() == 0) {
                    return RestResponse.success("更改操作成功", message);
                } else {
                    return RestResponse.object(ApiCode.FAIL.getCode(), "更改操作失败", message);
                }
            } else {
                return RestResponse.error(ApiCode.TIMEOUT_ERROR.getCode(), "更改操作超时");
            }
        } catch (FaultMessage faultMessage) {
            logger.error("change - {}", faultMessage.getFaultInfo());
            return RestResponse.error(faultMessage.getFaultInfo());
        }
    }

    /**
     * 暂停操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 卫星SN (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    @Override
    public RestResponse suspend(String carrier, String subscriberId, NtsUser loginUser) {
        Device device = deviceService.selectCompanyIdAndDeviceSn(loginUser.getCompanyId(), subscriberId);
        if (StringUtils.isNull(device)) {
            return RestResponse.error(ApiCode.PARAM_EXC.getCode(), "卫星SN不存在");
        }

        // 暂停传参配置
        SuspendRequest suspendRequest = new SuspendRequest();
        suspendRequest.setCallbackId(NtsUtil.generateOrderNumber());
        suspendRequest.setCallbackEndpoint(ocpclConfig.getCallbackEndpoint());

        SuspendRequest.Suspend suspend = new SuspendRequest.Suspend();
        suspend.setCarrier(CarrierType.fromValue(carrier));
        suspend.setSubscriberId(subscriberId);
        suspendRequest.getSuspend().add(suspend);

        try {
            OcpClientWebService ocpClientWebService = ocpClientWebService();
            OperationResponse operationResponse = ocpClientWebService.operationSuspend(getHeader(), suspendRequest);
            OperationResponse.Operation operation = operationResponse.getOperation();

            String cacheKey = OperationType.SUSPEND.value() + "_" + operation.getOperationId() + "_" + operation.getCallbackId();
            OcpMessage message = this.queryCacheTask(cacheKey);
            if (StringUtils.isNotNull(message)) {
                if (message.getFailed() == 0) {
                    // 暂停状态，更新数据库
                    device.setActivate(Constants.SUSPEND);
                    deviceService.updateDevice(device);
                    return RestResponse.success("暂停操作成功", message);
                } else {
                    return RestResponse.object(ApiCode.FAIL.getCode(), "暂停操作失败", message);
                }
            } else {
                return RestResponse.error(ApiCode.TIMEOUT_ERROR.getCode(), "暂停操作超时");
            }
        } catch (FaultMessage faultMessage) {
            logger.error("suspend - {}", faultMessage.getFaultInfo());
            return RestResponse.error(faultMessage.getFaultInfo());
        }
    }

    /**
     * 启用操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 卫星SN (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    @Override
    public RestResponse unsuspend(String carrier, String subscriberId, NtsUser loginUser) {
        Device device = deviceService.selectCompanyIdAndDeviceSn(loginUser.getCompanyId(), subscriberId);
        if (StringUtils.isNull(device)) {
            return RestResponse.error(ApiCode.PARAM_EXC.getCode(), "卫星SN不存在");
        }

        // 启用传参配置
        UnsuspendRequest unsuspendRequest = new UnsuspendRequest();
        unsuspendRequest.setCallbackId(NtsUtil.generateOrderNumber());
        unsuspendRequest.setCallbackEndpoint(ocpclConfig.getCallbackEndpoint());

        UnsuspendRequest.Unsuspend unsuspend = new UnsuspendRequest.Unsuspend();
        unsuspend.setCarrier(CarrierType.fromValue(carrier));
        unsuspend.setSubscriberId(subscriberId);
        unsuspendRequest.getUnsuspend().add(unsuspend);

        try {
            OcpClientWebService ocpClientWebService = ocpClientWebService();
            OperationResponse operationResponse = ocpClientWebService.operationUnsuspend(getHeader(), unsuspendRequest);
            OperationResponse.Operation operation = operationResponse.getOperation();

            String cacheKey = OperationType.UNSUSPEND.value() + "_" + operation.getOperationId() + "_" + operation.getCallbackId();
            OcpMessage message = this.queryCacheTask(cacheKey);
            if (StringUtils.isNotNull(message)) {
                if (message.getFailed() == 0) {
                    // 启用状态，更新数据库
                    device.setActivate(Constants.UNSUSPEND);
                    deviceService.updateDevice(device);
                    return RestResponse.success("启用操作成功", message);
                } else {
                    return RestResponse.object(ApiCode.FAIL.getCode(), "启用操作失败", message);
                }
            } else {
                return RestResponse.error(ApiCode.TIMEOUT_ERROR.getCode(), "启用操作超时");
            }
        } catch (FaultMessage faultMessage) {
            logger.error("unsuspend - {}", faultMessage.getFaultInfo());
            return RestResponse.error(faultMessage.getFaultInfo());
        }
    }

    /**
     * 禁用操作
     *
     * @param carrier      运营商 INMARSATIDP,ORBCOMM
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @param loginUser    登录用户
     * @return 结果
     */
    @Override
    public RestResponse deactivate(String carrier, String subscriberId, NtsUser loginUser) {
        Device device = deviceService.selectCompanyIdAndDeviceSn(loginUser.getCompanyId(), subscriberId);
        if (StringUtils.isNull(device)) {
            return RestResponse.error(ApiCode.PARAM_EXC.getCode(), "卫星SN不存在");
        }

        // 禁用传参配置
        DeactivateRequest deactivateRequest = new DeactivateRequest();
        deactivateRequest.setCallbackId(NtsUtil.generateOrderNumber());
        deactivateRequest.setCallbackEndpoint(ocpclConfig.getCallbackEndpoint());

        DeactivateRequest.Deactivate deactivate = new DeactivateRequest.Deactivate();
        deactivate.setCarrier(CarrierType.fromValue(carrier));
        deactivate.setSubscriberId(subscriberId);
        deactivateRequest.getDeactivate().add(deactivate);

        try {
            OcpClientWebService ocpClientWebService = ocpClientWebService();
            OperationResponse operationResponse = ocpClientWebService.operationDeactivate(getHeader(), deactivateRequest);
            OperationResponse.Operation operation = operationResponse.getOperation();

            String cacheKey = OperationType.DEACTIVATE.value() + "_" + operation.getOperationId() + "_" + operation.getCallbackId();
            OcpMessage message = this.queryCacheTask(cacheKey);
            if (StringUtils.isNotNull(message)) {
                if (message.getFailed() == 0) {
                    // 禁用状态，更新数据库
                    device.setActivate(Constants.DEACTIVATE);
                    deviceService.updateDevice(device);
                    return RestResponse.success("禁用操作成功", message);
                } else {
                    return RestResponse.object(ApiCode.FAIL.getCode(), "禁用操作成功", message);
                }
            } else {
                return RestResponse.error(ApiCode.TIMEOUT_ERROR.getCode(), "禁用操作超时");
            }
        } catch (FaultMessage faultMessage) {
            logger.error("deactivate - {}", faultMessage.getFaultInfo());
            return RestResponse.error(faultMessage.getFaultInfo());
        }
    }

    /**
     * 交换操作
     *
     * @param carrier              运营商 INMARSATIDP,ORBCOMM
     * @param existingSubscriberId 现有订阅ID
     * @param replaceSubscriberId  取换订阅ID
     * @param loginUser            登录用户
     * @return 结果
     */
    @Override
    public RestResponse swap(String carrier, String existingSubscriberId, String replaceSubscriberId, NtsUser loginUser) {
        Device device = deviceService.selectCompanyIdAndDeviceSn(loginUser.getCompanyId(), existingSubscriberId);
        if (StringUtils.isNull(device)) {
            return RestResponse.error(ApiCode.PARAM_EXC.getCode(), "卫星SN不存在");
        }

        //交换传参配置
        SwapRequest swapRequest = new SwapRequest();
        swapRequest.setCallbackId(NtsUtil.generateOrderNumber());
        swapRequest.setCallbackEndpoint(ocpclConfig.getCallbackEndpoint());

        SwapRequest.Swap swap = new SwapRequest.Swap();
        swap.setCarrier(CarrierTypeSwap.fromValue(carrier));
        swap.setExistingSubscriberId(existingSubscriberId);
        swap.setReplacementSubscriberId(replaceSubscriberId);
        swapRequest.getSwap().add(swap);

        try {
            OcpClientWebService ocpClientWebService = ocpClientWebService();
            OperationResponse operationResponse = ocpClientWebService.operationSwap(getHeader(), swapRequest);
            OperationResponse.Operation operation = operationResponse.getOperation();


            String cacheKey = OperationType.SWAP.value() + "_" + operation.getOperationId() + "_" + operation.getCallbackId();
            OcpMessage message = this.queryCacheTask(cacheKey);
            if (StringUtils.isNotNull(message)) {
                if (message.getFailed() == 0) {
                    return RestResponse.success("交换操作成功", message);
                } else {
                    return RestResponse.object(ApiCode.FAIL.getCode(), "交换操作失败", message);
                }
            } else {
                return RestResponse.error(ApiCode.TIMEOUT_ERROR.getCode(), "交换操作超时");
            }
        } catch (FaultMessage faultMessage) {
            logger.error("swap - {}", faultMessage.getFaultInfo());
            return RestResponse.error(faultMessage.getFaultInfo());
        }
    }

    /**
     * OCP Operation Callback
     *
     * @param operationCallback 回调结果
     */
    @Override
    public void callback(OperationCallback operationCallback) {
        logger.debug(operationCallback.toString());

        OcpMessage message = new OcpMessage();
        message.setOperationId(operationCallback.getOperationId());
        message.setCallbackId(operationCallback.getCallbackId());
        message.setType(operationCallback.getType());
        message.setSubmittedOn(operationCallback.getSubmittedOn().toString());
        message.setCompletedOn(operationCallback.getCompletedOn().toString());
        message.setStatus(operationCallback.getStatus());
        message.setInProgress(operationCallback.getInProgress());
        message.setSuccess(operationCallback.getSuccess());
        message.setFailed(operationCallback.getFailed());
        List<Transaction> transactionList = operationCallback.getTransactions().getTransaction();
        if (transactionList != null && transactionList.size() > 0) {
            message.setSubscriberId(transactionList.get(0).getSubscriberId());
            message.setMessage(transactionList.get(0).getMessage());
        }

        // 将回调数据缓存
        String cacheKey = message.getType() + "_" + message.getOperationId() + "_" + message.getCallbackId();
        String jsonStr = JSON.toJSONString(message);
        EhcacheUtils.getInstance().putCache(OCP_CACHE, cacheKey, jsonStr);
    }

    /**
     * 查询缓存任务
     *
     * @param cacheKey key
     * @return 结果
     */
    private OcpMessage queryCacheTask(final String cacheKey) {
        Future<OcpMessage> future = executorService.schedule(new Callable<OcpMessage>() {
            @Override
            public OcpMessage call() throws Exception {
                try {
                    for (; ; ) {
                        String jsonStr = EhcacheUtils.getInstance().getCache(OCP_CACHE, cacheKey);
                        if (StringUtils.isNotEmpty(jsonStr)) {
                            OcpMessage message = JSON.parseObject(jsonStr, OcpMessage.class);
                            return message;
                        }
                        TimeUnit.MILLISECONDS.sleep(20);
                    }
                } catch (InterruptedException e) {
                    logger.warn("queryCacheTask - {}", "任务中断");
                }
                return null;
            }
        }, 10, TimeUnit.MILLISECONDS);

        try {
            return future.get(120, TimeUnit.SECONDS); //120秒后超时
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            future.cancel(true);
            logger.error("queryCacheTask - {}", "任务超时");
        }
        return null;
    }

    /**
     * 设备列表
     *
     * @param subscriberId 订阅ID (TANMSN,Mobile ID)
     * @return 结果
     */
    @Override
    public RestResponse listSubscribers(String subscriberId) {
        ListSubscribersRequest listSubscribersRequest = new ListSubscribersRequest();
        listSubscribersRequest.setAccount(8023);
        listSubscribersRequest.setSubscriberId(subscriberId);

        try {
            OcpClientWebService ocpClientWebService = ocpClientWebService();
            OperationResponse operationResponse = ocpClientWebService.listSubscribers(getHeader(), listSubscribersRequest);
            OperationResponse.ListSubscribers listSubscribers = operationResponse.getListSubscribers();

            if (listSubscribers != null && listSubscribers.getSubscriberCount() > 0) {
                return RestResponse.success();
            } else {
                return RestResponse.error("卫星SN不存在");
            }
        } catch (FaultMessage faultMessage) {
            logger.error("listSubscribers - {}", faultMessage.getFaultInfo());
            return RestResponse.error(faultMessage.getFaultInfo());
        }
    }
}