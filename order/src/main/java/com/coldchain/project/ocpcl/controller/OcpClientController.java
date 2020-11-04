package com.coldchain.project.ocpcl.controller;

import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.JaxbBinder;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.framework.aspectj.lang.annotation.IgnoreAuth;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.ocpcl.service.OcpClientApiService;
import com.coldchain.project.ocpcl.webservice.CallbackSoapEnvelope;
import com.coldchain.project.ocpcl.webservice.CarrierType;
import com.coldchain.project.ocpcl.webservice.OperationCallback;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * OCP接口
 */
@Api(tags = "14.OCP接口")
@RestController
@RequestMapping("/api/ocp")
public class OcpClientController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OcpClientApiService ocpClientApiService;

    @ApiOperation(value = "检查连接")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "message", value = "信息", required = true, dataType = "String", paramType = "query", example = "hello")
    })
    @IgnoreAuth
    @GetMapping("echo")
    public RestResponse echo(String message) {
        NtsAssert.isBlank(message, "信息不能为空");
        return ocpClientApiService.echo(message);
    }

    @ApiOperation(value = "激活操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "carrier", value = "运营商 INMARSATIDP,ORBCOMM", required = true, dataType = "String", paramType = "query", example = "INMARSATIDP"),
            @ApiImplicitParam(name = "subscriberId", value = "订阅ID(TANMSN,Mobile ID)", required = true, dataType = "String", paramType = "query", example = "01327681SKYBD82")
    })
    @GetMapping("activate")
    public RestResponse activate(String carrier, String subscriberId,
                                 @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(carrier, "运营商不能为空");
        NtsAssert.isBlank(subscriberId, "卫星SN不能为空");
        if (carrier.equals(CarrierType.INMARSATIDP.value()) || carrier.equals(CarrierType.ORBCOMM.value())) {
            return ocpClientApiService.activate(carrier, subscriberId, loginUser);
        } else {
            throw new NtsException("运营商仅支持INMARSATIDP或ORBCOMM");
        }
    }

    @ApiOperation(value = "更改操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "carrier", value = "运营商 INMARSATIDP,ORBCOMM", required = true, dataType = "String", paramType = "query", example = "INMARSATIDP"),
            @ApiImplicitParam(name = "subscriberId", value = "订阅ID(TANMSN,Mobile ID)", required = true, dataType = "String", paramType = "query", example = "01327681SKYBD82")
    })
    @GetMapping("change")
    public RestResponse change(String carrier, String subscriberId,
                               @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(carrier, "运营商不能为空");
        NtsAssert.isBlank(subscriberId, "卫星SN不能为空");
        if (carrier.equals(CarrierType.INMARSATIDP.value()) || carrier.equals(CarrierType.ORBCOMM.value())) {
            return ocpClientApiService.change(carrier, subscriberId, loginUser);
        } else {
            throw new NtsException("运营商仅支持INMARSATIDP或ORBCOMM");
        }
    }

    @ApiOperation(value = "暂停操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "carrier", value = "运营商 INMARSATIDP,ORBCOMM", required = true, dataType = "String", paramType = "query", example = "INMARSATIDP"),
            @ApiImplicitParam(name = "subscriberId", value = "订阅ID(TANMSN,Mobile ID)", required = true, dataType = "String", paramType = "query", example = "01327681SKYBD82")
    })
    @GetMapping("suspend")
    public RestResponse suspend(String carrier, String subscriberId,
                                @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(carrier, "运营商不能为空");
        NtsAssert.isBlank(subscriberId, "卫星SN不能为空");
        if (carrier.equals(CarrierType.INMARSATIDP.value()) || carrier.equals(CarrierType.ORBCOMM.value())) {
            return ocpClientApiService.suspend(carrier, subscriberId, loginUser);
        } else {
            throw new NtsException("运营商仅支持INMARSATIDP或ORBCOMM");
        }
    }

    @ApiOperation(value = "启用操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "carrier", value = "运营商 INMARSATIDP,ORBCOMM", required = true, dataType = "String", paramType = "query", example = "INMARSATIDP"),
            @ApiImplicitParam(name = "subscriberId", value = "订阅ID(TANMSN,Mobile ID)", required = true, dataType = "String", paramType = "query", example = "01327681SKYBD82")
    })
    @GetMapping("unsuspend")
    public RestResponse unsuspend(String carrier, String subscriberId,
                                  @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(carrier, "运营商不能为空");
        NtsAssert.isBlank(subscriberId, "卫星SN不能为空");
        if (carrier.equals(CarrierType.INMARSATIDP.value()) || carrier.equals(CarrierType.ORBCOMM.value())) {
            return ocpClientApiService.unsuspend(carrier, subscriberId, loginUser);
        } else {
            throw new NtsException("运营商仅支持INMARSATIDP或ORBCOMM");
        }
    }

    @ApiOperation(value = "禁用操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "carrier", value = "运营商 INMARSATIDP,ORBCOMM", required = true, dataType = "String", paramType = "query", example = "INMARSATIDP"),
            @ApiImplicitParam(name = "subscriberId", value = "订阅ID(TANMSN,Mobile ID)", required = true, dataType = "String", paramType = "query", example = "01327681SKYBD82")
    })
    @GetMapping("deactivate")
    public RestResponse deactivate(String carrier, String subscriberId,
                                   @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(carrier, "运营商不能为空");
        NtsAssert.isBlank(subscriberId, "卫星SN不能为空");
        if (carrier.equals(CarrierType.INMARSATIDP.value()) || carrier.equals(CarrierType.ORBCOMM.value())) {
            return ocpClientApiService.deactivate(carrier, subscriberId, loginUser);
        } else {
            throw new NtsException("运营商仅支持INMARSATIDP或ORBCOMM");
        }
    }

    @ApiOperation(value = "交换操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "carrier", value = "运营商 INMARSATIDP,ORBCOMM", required = true, dataType = "String", paramType = "query", example = "INMARSATIDP"),
            @ApiImplicitParam(name = "existingSubscriberId", value = "现有订阅ID", required = true, dataType = "String", paramType = "query", example = "01327681SKYBD82"),
            @ApiImplicitParam(name = "replaceSubscriberId", value = "取换订阅ID", required = true, dataType = "String", paramType = "query", example = "01327681SKYBD86"),
    })
    @GetMapping("swap")
    public RestResponse swap(String carrier, String existingSubscriberId, String replaceSubscriberId,
                             @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(carrier, "运营商不能为空");
        NtsAssert.isBlank(existingSubscriberId, "现有卫星SN不能为空");
        NtsAssert.isBlank(replaceSubscriberId, "交换卫星SN不能为空");
        if (carrier.equals(CarrierType.ORBCOMM.value())) {
            return ocpClientApiService.swap(carrier, existingSubscriberId, replaceSubscriberId, loginUser);
        } else {
            throw new NtsException("运营商仅支持ORBCOMM");
        }
    }

    @PostMapping("callback")
    @IgnoreAuth
    public Object callback(@RequestBody String requestBody) {
        NtsAssert.isBlank(requestBody, "RequestBody为空");

        logger.debug("callback--->" + requestBody);

        try {
            JaxbBinder jaxbBinder = new JaxbBinder(CallbackSoapEnvelope.class);
            CallbackSoapEnvelope callbackSoapEnvelope = jaxbBinder.fromXml(requestBody);

            OperationCallback operationCallback = callbackSoapEnvelope.getBody().getOperationCallback();
            ocpClientApiService.callback(operationCallback);
        } catch (Exception ex) {
            throw new NtsException("XML格式错误，解析报错");
        }
        return RestResponse.success();
    }
}
