package com.coldchain.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.vo.NtsProjectRq;
import com.coldchain.entity.vo.NtsProjectVo;
import com.coldchain.service.NtsProjectService;
import com.common.dto.CpDeviceGroupDto;
import com.common.dto.NtsProjectDto;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping("/project")
@Api(tags = "项目管理")
public class NtsProjectController {

    @Autowired
    private NtsProjectService ntsProjectService;

    @ApiOperation("新增项目")
    @PostMapping("/add")
    @PreAuthorize("hasAnyRole('ROLE_SELLER')")
    public SBApi add(@Valid @RequestBody NtsProjectRq projectRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        ntsProjectService.add(projectRq);
        return new SBApi();
    }

    @ApiOperation("修改项目")
    @PostMapping("/update")
    @PreAuthorize("hasAnyRole('ROLE_SELLER')")
    public SBApi update(@Valid @RequestBody NtsProjectRq projectRq, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ShopException(-1, bindingResult.getFieldError().getDefaultMessage());
        }
        ntsProjectService.update(projectRq);
        return new SBApi();
    }

    @ApiOperation("删除项目")
    @PostMapping("/delete")
    @PreAuthorize("hasAnyRole('ROLE_SELLER')")
    public SBApi delete(@RequestBody String ids) {
        ntsProjectService.delByIds(ids);
        return new SBApi();
    }

    @ApiOperation("项目设备分页")
    @GetMapping("/page")
    @PreAuthorize("hasAnyRole('ROLE_SELLER,ROLE_ADMIN')")
    public SBApi projectDevicePage(
            @ApiParam("项目名称") @RequestParam(value = "projectName", required = false) String projectName,
            @ApiParam("项目类型") @RequestParam(value = "projectType", required = false) String projectType,
            @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
            @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Page<NtsProjectVo> projectVoPage = ntsProjectService.projectDevicePage(page, size, projectName, projectType);
        return new SBApi(projectVoPage);
    }

    @ApiOperation("设备列表")
    @GetMapping("/detail/deviceList")
    public SBApi deviceList(
            @ApiParam("项目名称") @RequestParam(value = "deviceName", required = false) String deviceName,
            @ApiParam("开始时间") @RequestParam(value = "start", required = false) Long start,
            @ApiParam("结束时间") @RequestParam(value = "end", required = false) Long end,
            @ApiParam("项目ID") @RequestParam(value = "projectId", required = false) Long projectId,
            @ApiParam("页码") @RequestParam(value = "page", defaultValue = "1") Integer page,
            @ApiParam("单页记录数") @RequestParam(value = "size", defaultValue = "10") Integer size) {
        NtsProjectDto projectVo = ntsProjectService.detailDeviceList(projectId, deviceName, start, end, page, size);
        return new SBApi(projectVo);
    }

    @ApiOperation("项目详情")
    @GetMapping("/detail/device")
    public SBApi device(@ApiParam("项目ID") @RequestParam(value = "projectId") Long projectId) {
        NtsProjectVo projectVo = ntsProjectService.detailDevice(projectId);
        return new SBApi(projectVo);
    }

    /**
     * 数据中心的 设备分组分页
     *
     * @param page
     * @param size
     * @return
     */
    @ApiOperation("数据中心 设备分组分页")
    @GetMapping("/dataDeviceGroup")
    Page<CpDeviceGroupDto> dataDeviceGroup(@RequestParam("page") Integer page,
                                           @RequestParam("size") Integer size,
                                           @RequestParam("userId") Integer userId,
                                           @RequestParam(value = "companyId", required = false) Long companyId) {
        return ntsProjectService.dataDeviceGroup(page, size, userId, companyId);
    }

}
