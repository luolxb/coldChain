package com.coldchain.project.business.device.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.device.domain.DeviceDetails;
import com.coldchain.project.business.device.service.IDeviceDetailsService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 设备详情Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/deviceDetails")
public class DeviceDetailsController extends BaseController
{
    private String prefix = "business/deviceDetails";

    @Autowired
    private IDeviceDetailsService deviceDetailsService;

    //("business:deviceDetails:view")
    @GetMapping()
    public String deviceDetails()
    {
        return prefix + "/deviceDetails";
    }

    /**
     * 查询设备详情列表
     */
    //("business:deviceDetails:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceDetails deviceDetails)
    {
        startPage();
        List<DeviceDetails> list = deviceDetailsService.selectDeviceDetailsList(deviceDetails);
        return getDataTable(list);
    }

    /**
     * 导出设备详情列表
     */
    //("business:deviceDetails:export")
    @Log(title = "设备详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceDetails deviceDetails)
    {
        List<DeviceDetails> list = deviceDetailsService.selectDeviceDetailsList(deviceDetails);
        ExcelUtil<DeviceDetails> util = new ExcelUtil<DeviceDetails>(DeviceDetails.class);
        return util.exportExcel(list, "deviceDetails");
    }

    /**
     * 新增设备详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备详情
     */
    //("business:deviceDetails:add")
    @Log(title = "设备详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeviceDetails deviceDetails)
    {
        return toAjax(deviceDetailsService.insertDeviceDetails(deviceDetails));
    }

    /**
     * 修改设备详情
     */
    @GetMapping("/edit/{deviceDetailsId}")
    public String edit(@PathVariable("deviceDetailsId") Long deviceDetailsId, ModelMap mmap)
    {
        DeviceDetails deviceDetails = deviceDetailsService.selectDeviceDetailsById(deviceDetailsId);
        mmap.put("deviceDetails", deviceDetails);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备详情
     */
    //("business:deviceDetails:edit")
    @Log(title = "设备详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceDetails deviceDetails)
    {
        return toAjax(deviceDetailsService.updateDeviceDetails(deviceDetails));
    }

    /**
     * 删除设备详情
     */
    //("business:deviceDetails:remove")
    @Log(title = "设备详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceDetailsService.deleteDeviceDetailsByIds(ids));
    }
}
