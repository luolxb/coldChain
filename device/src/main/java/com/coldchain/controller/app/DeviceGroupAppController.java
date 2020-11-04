package com.coldchain.controller.app;

import com.coldchain.service.CpDeviceGroupService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * (CpDeviceGroup)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:48:49
 */
@RestController
@RequestMapping("app/deviceGroup")
@Api(value = "app端设备分组管理", tags = {"app端设备分组管理"})
public class DeviceGroupAppController {

    @Autowired
    private CpDeviceGroupService cpDeviceGroupService;

    @ApiOperation("设备分组分页  暂时不使用")
    @GetMapping("page")
    public SBApi deviceGroupPage(@ApiParam("分组名称") @RequestParam(value = "groupName", required = false) String groupName,
                                 @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
                                 @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new SBApi(cpDeviceGroupService.deviceGroupAppPage(groupName, page, size));
    }



}