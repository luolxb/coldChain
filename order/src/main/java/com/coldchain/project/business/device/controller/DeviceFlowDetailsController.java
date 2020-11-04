package com.coldchain.project.business.device.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.device.domain.DeviceFlowDetails;
import com.coldchain.project.business.device.service.IDeviceFlowDetailsService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 设备流量日志统计Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/deviceFlowDetails")
public class DeviceFlowDetailsController extends BaseController
{
    private String prefix = "business/deviceFlowDetails";

    @Autowired
    private IDeviceFlowDetailsService deviceFlowDetailsService;

    //("business:deviceFlowDetails:view")
    @GetMapping()
    public String deviceFlowDetails()
    {
        return prefix + "/deviceFlowDetails";
    }

    /**
     * 查询设备流量日志统计列表
     */
    //("business:deviceFlowDetails:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceFlowDetails deviceFlowDetails)
    {
        startPage();
        List<DeviceFlowDetails> list = deviceFlowDetailsService.selectDeviceFlowDetailsList(deviceFlowDetails);
        return getDataTable(list);
    }

    /**
     * 导出设备流量日志统计列表
     */
    //("business:deviceFlowDetails:export")
    @Log(title = "设备流量日志统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceFlowDetails deviceFlowDetails)
    {
        List<DeviceFlowDetails> list = deviceFlowDetailsService.selectDeviceFlowDetailsList(deviceFlowDetails);
        ExcelUtil<DeviceFlowDetails> util = new ExcelUtil<DeviceFlowDetails>(DeviceFlowDetails.class);
        return util.exportExcel(list, "deviceFlowDetails");
    }

    /**
     * 新增设备流量日志统计
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备流量日志统计
     */
    //("business:deviceFlowDetails:add")
    @Log(title = "设备流量日志统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeviceFlowDetails deviceFlowDetails)
    {
        return toAjax(deviceFlowDetailsService.insertDeviceFlowDetails(deviceFlowDetails));
    }

    /**
     * 修改设备流量日志统计
     */
    @GetMapping("/edit/{deviceFlowDetailsId}")
    public String edit(@PathVariable("deviceFlowDetailsId") Long deviceFlowDetailsId, ModelMap mmap)
    {
        DeviceFlowDetails deviceFlowDetails = deviceFlowDetailsService.selectDeviceFlowDetailsById(deviceFlowDetailsId);
        mmap.put("deviceFlowDetails", deviceFlowDetails);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备流量日志统计
     */
    //("business:deviceFlowDetails:edit")
    @Log(title = "设备流量日志统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceFlowDetails deviceFlowDetails)
    {
        return toAjax(deviceFlowDetailsService.updateDeviceFlowDetails(deviceFlowDetails));
    }

    /**
     * 删除设备流量日志统计
     */
    //("business:deviceFlowDetails:remove")
    @Log(title = "设备流量日志统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceFlowDetailsService.deleteDeviceFlowDetailsByIds(ids));
    }
}
