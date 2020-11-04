package com.coldchain.controller;

import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.framework.aspectj.lang.annotation.LoginUser;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.device.service.IDeviceService;
import com.coldchain.project.business.device.vo.DeviceListVo;
import com.coldchain.project.business.device.vo.DeviceVo;
import com.coldchain.project.business.dict.domain.DeviceType;
import com.coldchain.project.business.dict.service.IDeviceTypeService;
import com.coldchain.project.business.user.domain.NtsUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * 设备
 */
@Api(tags = "03.设备管理")
@RestController
@RequestMapping("/api/device")
public class ApiDeviceController extends ApiBaseController {

    @Autowired
    private IDeviceService deviceService;
    @Autowired
    private IDeviceTypeService deviceTypeService;

    @ApiOperation(value = "添加设备【管理端】")
    @PostMapping("addServer")
    public RestResponse addServer(@RequestBody DeviceVo deviceVo,
                                  @ApiIgnore @LoginUser NtsUser loginUser) {
//        NtsAssert.isBlank(deviceVo.getDeviceName(), "设备名称不能为空");
//        NtsAssert.isBlank(deviceVo.getDeviceSn(), "设备SN不能为空");
        NtsAssert.isNull(deviceVo.getDeviceTypeId(), "设备类型ID不能为空");
//        NtsAssert.isNull(deviceVo.getCarrierId(), "服务商ID不能为空");

        return deviceService.addDevice(deviceVo, loginUser);
    }

    @ApiOperation("设备列表【客户端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceTypeIds", value = "设备类型ID", required = false, dataType = "String", paramType = "query", example = "1,2,3"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("list")
    public TableDataInfo list(String deviceTypeIds,
                              @ApiIgnore @LoginUser NtsUser loginUser) {

        String[] deviceTypeIdList = StringUtils.isNotEmpty(deviceTypeIds) ? deviceTypeIds.split(",") : null;
        startPage();
        List<DeviceListVo> deviceList = deviceService.queryDeviceList(loginUser.getCompanyId(), deviceTypeIdList);
        return getDataTable(deviceList);
    }

    @ApiOperation("设备列表【管理端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deviceTypeIds", value = "设备类型ID", required = false, dataType = "String", paramType = "query", example = "1,2,3"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("listServer")
    public TableDataInfo listServer(String deviceTypeIds) {

        String[] deviceTypeIdList = StringUtils.isNotEmpty(deviceTypeIds) ? deviceTypeIds.split(",") : null;
        startPage();
        List<DeviceListVo> deviceList = deviceService.queryDeviceList(null, deviceTypeIdList);
        return getDataTable(deviceList);
    }

    @ApiOperation("模糊查询【客户端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "info", value = "检索信息", required = true, dataType = "String", paramType = "query", example = "GHAD216130455"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("search")
    public TableDataInfo search(String info,
                                @ApiIgnore @LoginUser NtsUser loginUser) {
        NtsAssert.isBlank(info, "搜索内容不能为空");
        startPage();
        List<DeviceListVo> deviceList = deviceService.search(loginUser.getCompanyId(), info);
        return getDataTable(deviceList);
    }

    @ApiOperation("模糊查询【管理端】")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "info", value = "检索信息", required = true, dataType = "String", paramType = "query", example = "GHAD216130455"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "String", paramType = "query", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "分页总数", required = false, dataType = "String", paramType = "query", example = "10")
    })
    @GetMapping("searchServer")
    public TableDataInfo searchServer(String info) {
        NtsAssert.isBlank(info, "搜索内容不能为空");
        startPage();
        List<DeviceListVo> deviceList = deviceService.search(null, info);
        return getDataTable(deviceList);
    }

    @ApiOperation("设备分类")
    @GetMapping("type")
    public RestResponse deviceType() {
        List<DeviceType> deviceTypeList = deviceTypeService.selectDeviceTypeList(new DeviceType());

        return RestResponse.success(deviceTypeList);
    }

}
