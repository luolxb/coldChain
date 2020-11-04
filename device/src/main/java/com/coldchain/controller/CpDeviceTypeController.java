package com.coldchain.controller;

import com.coldchain.entity.CpDeviceType;
import com.coldchain.entity.vo.CpDeviceTypeRq;
import com.coldchain.service.CpDeviceTypeService;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 设备类型表(CpDeviceType)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:13
 */
@RestController
@RequestMapping("cpDeviceType")
@Api(value = "设备类型管理", tags = {"设备中心-设备类型相关接口"})
public class CpDeviceTypeController {

    @Autowired
    private CpDeviceTypeService cpDeviceTypeService;

    @ApiOperation("新增设备类型")
    @PostMapping("add")
    public SBApi add(@Valid @RequestBody CpDeviceTypeRq cpDeviceTypeRq , BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        cpDeviceTypeService.add(cpDeviceTypeRq);
        return new SBApi();

    }
    @ApiOperation("修改设备类型")
    @PostMapping("update")
    public SBApi update(@Valid @RequestBody CpDeviceTypeRq cpDeviceTypeRq , BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        cpDeviceTypeService.edit(cpDeviceTypeRq);
        return new SBApi();
    }
    @ApiOperation("删除设备类型")
    @PostMapping("delete")
    public SBApi delete(@RequestBody String ids) {
        cpDeviceTypeService.delete(ids);
        return new SBApi();
    }

    @ApiOperation("设备类型分页")
    @GetMapping("page")
    public SBApi deviceTypePage(@ApiParam("开始时间") @RequestParam(value = "start", required = false) Long start,
                                 @ApiParam("结束时间") @RequestParam(value = "end", required = false) Long end,
                                 @ApiParam("设备类型") @RequestParam(value = "deviceTypeName",required = false) String deviceTypeName,
                                 @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
                                 @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new SBApi(cpDeviceTypeService.deviceTypePage(start, end, deviceTypeName, page, size));
    }




}