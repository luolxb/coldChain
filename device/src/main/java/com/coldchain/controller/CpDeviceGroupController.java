package com.coldchain.controller;

import com.coldchain.entity.CpDeviceGroup;
import com.coldchain.entity.vo.CpDeviceGroupRq;
import com.coldchain.service.CpDeviceGroupService;
import com.coldchain.service.CpDeviceService;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * (CpDeviceGroup)表控制层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:48:49
 */
@RestController
@RequestMapping("cpDeviceGroup")
@Api(value = "设备分组管理", tags = {"设备中心-设备分组相关接口"})
public class CpDeviceGroupController {

    @Autowired
    private CpDeviceGroupService cpDeviceGroupService;

    @ApiOperation("设备分组分页")
    @GetMapping("page")
    public SBApi deviceGroupPage(@ApiParam("开始时间") @RequestParam(value = "start", required = false) Long start,
                                 @ApiParam("结束时间") @RequestParam(value = "end", required = false) Long end,
                                 @ApiParam("分组名称") @RequestParam(value = "groupName",required = false) String groupName,
                                 @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
                                 @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new SBApi(cpDeviceGroupService.deviceGroupPage(start, end, groupName, page, size));
    }

    @ApiOperation("获取设备分组")
    @PostMapping("get")
    public List<CpDeviceGroup> getGroupByCompanyName(@RequestParam String groupCompany) {
        return cpDeviceGroupService.getGroupByCompanyName(groupCompany);
    }
    @ApiOperation("新增设备分组")
    @PostMapping("add")
    public SBApi add(@Valid @RequestBody CpDeviceGroupRq cpDeviceGroupRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        cpDeviceGroupService.add(cpDeviceGroupRq);
        return new SBApi();
    }

    @ApiOperation("修改设备分组")
    @PostMapping("update")
    public SBApi update(@Valid @RequestBody CpDeviceGroupRq cpDeviceGroupRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        cpDeviceGroupService.update(cpDeviceGroupRq);
        return new SBApi();
    }


    @ApiOperation("删除设备分组")
    @PostMapping("delete")
    public SBApi delete(@RequestBody String ids) {
        cpDeviceGroupService.delete(ids);
        return new SBApi();
    }


}