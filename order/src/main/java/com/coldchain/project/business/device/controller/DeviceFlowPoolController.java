package com.coldchain.project.business.device.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.device.domain.DeviceFlowPool;
import com.coldchain.project.business.device.service.IDeviceFlowPoolService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 设备流量池Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/deviceFlowPool")
public class DeviceFlowPoolController extends BaseController
{
    private String prefix = "business/deviceFlowPool";

    @Autowired
    private IDeviceFlowPoolService deviceFlowPoolService;

    //("business:deviceFlowPool:view")
    @GetMapping()
    public String deviceFlowPool()
    {
        return prefix + "/deviceFlowPool";
    }

    /**
     * 查询设备流量池列表
     */
    //("business:deviceFlowPool:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceFlowPool deviceFlowPool)
    {
        startPage();
        List<DeviceFlowPool> list = deviceFlowPoolService.selectDeviceFlowPoolList(deviceFlowPool);
        return getDataTable(list);
    }

    /**
     * 导出设备流量池列表
     */
    //("business:deviceFlowPool:export")
    @Log(title = "设备流量池", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceFlowPool deviceFlowPool)
    {
        List<DeviceFlowPool> list = deviceFlowPoolService.selectDeviceFlowPoolList(deviceFlowPool);
        ExcelUtil<DeviceFlowPool> util = new ExcelUtil<DeviceFlowPool>(DeviceFlowPool.class);
        return util.exportExcel(list, "deviceFlowPool");
    }

    /**
     * 新增设备流量池
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备流量池
     */
    //("business:deviceFlowPool:add")
    @Log(title = "设备流量池", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeviceFlowPool deviceFlowPool)
    {
        return toAjax(deviceFlowPoolService.insertDeviceFlowPool(deviceFlowPool));
    }

    /**
     * 修改设备流量池
     */
    @GetMapping("/edit/{flowPoolId}")
    public String edit(@PathVariable("flowPoolId") Long flowPoolId, ModelMap mmap)
    {
        DeviceFlowPool deviceFlowPool = deviceFlowPoolService.selectDeviceFlowPoolById(flowPoolId);
        mmap.put("deviceFlowPool", deviceFlowPool);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备流量池
     */
    //("business:deviceFlowPool:edit")
    @Log(title = "设备流量池", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceFlowPool deviceFlowPool)
    {
        return toAjax(deviceFlowPoolService.updateDeviceFlowPool(deviceFlowPool));
    }

    /**
     * 删除设备流量池
     */
    //("business:deviceFlowPool:remove")
    @Log(title = "设备流量池", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceFlowPoolService.deleteDeviceFlowPoolByIds(ids));
    }
}
