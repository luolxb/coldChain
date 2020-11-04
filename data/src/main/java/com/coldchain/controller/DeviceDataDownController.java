package com.coldchain.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.DeviceDataDown;
import com.coldchain.entity.vo.DeviceDataDownRq;
import com.coldchain.entity.vo.DeviceDataDownVo;
import com.coldchain.service.DeviceDataDownService;
import com.coldchain.service.DeviceService;
import com.coldchain.service.impl.AuthenticationFacade;
import com.common.dto.CpDeviceGroupDto;
import com.common.dto.NtsProjectDto;
import com.common.dto.UserDto;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("deviceDataDown")
@RestController
@Api(tags = "设备数据")
public class DeviceDataDownController {

    @Autowired
    private DeviceDataDownService deviceDataDownService;

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @ApiOperation("设备分组分页")
    @GetMapping("/page")
    public SBApi page(@ApiParam("企业ID") @RequestParam(value = "companyId",required = false) Long companyId,
                      @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
                      @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        UserDto user = authenticationFacade.getUser();
        Page<CpDeviceGroupDto> cpDeviceGroupDto = deviceService.dataDeviceGroup(page, size, user.getUserId(),companyId);
        return new SBApi(cpDeviceGroupDto);

    }

    @ApiModelProperty("下载")
    @PostMapping("/down")
    public SBApi down(@Valid @RequestBody DeviceDataDownRq deviceDataDownRq,  BindingResult BindingResult) {
        if (BindingResult.hasErrors()) {
            throw new ShopException(-1, BindingResult.getFieldError().getDefaultMessage());
        }
        deviceDataDownService.down(deviceDataDownRq);
        return new SBApi();
    }

    @ApiOperation("数据下载列表")
    @GetMapping("/deviceDataDownPage")
    public SBApi deviceDataDownPage(
            @ApiParam("搜索") @RequestParam(value = "search", required = false) String search,
            @ApiParam("状态") @RequestParam(value = "downStatus", required = false) Integer downStatus,
            @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
            @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Page<DeviceDataDownVo> deviceDataDownPage = deviceDataDownService.deviceDataDownPage(search, downStatus, page, size);
        return new SBApi(deviceDataDownPage);
    }

    @ApiModelProperty("删除")
    @PostMapping("/delete")
    public SBApi delete(@RequestBody String ids) {
        deviceDataDownService.delete(ids);
        return new SBApi();
    }


}
