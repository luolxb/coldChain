package com.coldchain.project.business.device.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.device.domain.DeviceFlowAgg;
import com.coldchain.project.business.device.service.IDeviceFlowAggService;
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
@RequestMapping("/business/deviceFlowAgg")
public class DeviceFlowAggController extends BaseController
{
    private String prefix = "business/deviceFlowAgg";

    @Autowired
    private IDeviceFlowAggService deviceFlowAggService;

    //("business:deviceFlowAgg:view")
    @GetMapping()
    public String deviceFlowAgg()
    {
        return prefix + "/deviceFlowAgg";
    }

    /**
     * 查询设备流量日志统计列表
     */
    //("business:deviceFlowAgg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceFlowAgg deviceFlowAgg)
    {
        startPage();
        List<DeviceFlowAgg> list = deviceFlowAggService.selectDeviceFlowAggList(deviceFlowAgg);
        return getDataTable(list);
    }

    /**
     * 导出设备流量日志统计列表
     */
    //("business:deviceFlowAgg:export")
    @Log(title = "设备流量日志统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceFlowAgg deviceFlowAgg)
    {
        List<DeviceFlowAgg> list = deviceFlowAggService.selectDeviceFlowAggList(deviceFlowAgg);
        ExcelUtil<DeviceFlowAgg> util = new ExcelUtil<DeviceFlowAgg>(DeviceFlowAgg.class);
        return util.exportExcel(list, "deviceFlowAgg");
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
    //("business:deviceFlowAgg:add")
    @Log(title = "设备流量日志统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeviceFlowAgg deviceFlowAgg)
    {
        return toAjax(deviceFlowAggService.insertDeviceFlowAgg(deviceFlowAgg));
    }

    /**
     * 修改设备流量日志统计
     */
    @GetMapping("/edit/{deviceFlowAggId}")
    public String edit(@PathVariable("deviceFlowAggId") Long deviceFlowAggId, ModelMap mmap)
    {
        DeviceFlowAgg deviceFlowAgg = deviceFlowAggService.selectDeviceFlowAggById(deviceFlowAggId);
        mmap.put("deviceFlowAgg", deviceFlowAgg);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备流量日志统计
     */
    //("business:deviceFlowAgg:edit")
    @Log(title = "设备流量日志统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceFlowAgg deviceFlowAgg)
    {
        return toAjax(deviceFlowAggService.updateDeviceFlowAgg(deviceFlowAgg));
    }

    /**
     * 删除设备流量日志统计
     */
    //("business:deviceFlowAgg:remove")
    @Log(title = "设备流量日志统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceFlowAggService.deleteDeviceFlowAggByIds(ids));
    }
}
