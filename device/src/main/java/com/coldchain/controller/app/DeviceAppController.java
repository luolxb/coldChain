package com.coldchain.controller.app;

import com.coldchain.service.CpDeviceService;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "app设备数据")
@RestController
@RequestMapping("app/device")
public class DeviceAppController {

    @Autowired
    private CpDeviceService cpDeviceService;

    /**
     * 获取地图设备数据
     *
     * @return
     */
    @ApiOperation("获取地图设备")
    @GetMapping
    public SBApi device() {
        return new SBApi(cpDeviceService.deviceApp());
    }

    @ApiOperation("搜索地图设备")
    @GetMapping("search")
    public SBApi search(@ApiParam("搜索条件 设备ID/设备名称") @RequestParam(value = "search", required = false) String search) {
        return new SBApi(cpDeviceService.search(search));
    }

    @ApiOperation("设备分页")
    @GetMapping("page")
    public SBApi page(@ApiParam("设备分组ID") @RequestParam(value = "groupId",required = false) String groupId,
                      @ApiParam("搜索条件 设备ID/设备名称") @RequestParam(value = "search", required = false) String search,
                      @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
                      @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new SBApi(cpDeviceService.devicePageApp(groupId, page, size,search));
    }

    @ApiOperation("获取轨迹")
    @GetMapping("track")
    public SBApi track(@ApiParam("搜索条件 设备ID/设备名称") @RequestParam(value = "search") String search,
                       @ApiParam("开始时间 时间戳 秒") @RequestParam(value = "start") Long start,
                       @ApiParam("结束时间 时间戳 秒") @RequestParam(value = "end") Long end) {
        return new SBApi(cpDeviceService.track(search, start, end));
    }


}
