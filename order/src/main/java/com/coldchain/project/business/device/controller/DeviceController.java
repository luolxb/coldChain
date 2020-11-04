package com.coldchain.project.business.device.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.device.domain.Device;
import com.coldchain.project.business.device.service.IDeviceService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 设备Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/device")
public class DeviceController extends BaseController
{
    private String prefix = "business/device";

    @Autowired
    private IDeviceService deviceService;

    //("business:device:view")
    @GetMapping()
    public String device()
    {
        return prefix + "/device";
    }

    /**
     * 查询设备列表
     */
    //("business:device:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Device device)
    {
        startPage();
        List<Device> list = deviceService.selectDeviceList(device);
        return getDataTable(list);
    }

    /**
     * 导出设备列表
     */
    //("business:device:export")
    @Log(title = "设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Device device)
    {
        List<Device> list = deviceService.selectDeviceList(device);
        ExcelUtil<Device> util = new ExcelUtil<Device>(Device.class);
        return util.exportExcel(list, "device");
    }

    /**
     * 新增设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备
     */
    //("business:device:add")
    @Log(title = "设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Device device)
    {
        return toAjax(deviceService.insertDevice(device));
    }

    /**
     * 修改设备
     */
    @GetMapping("/edit/{deviceId}")
    public String edit(@PathVariable("deviceId") Long deviceId, ModelMap mmap)
    {
        Device device = deviceService.selectDeviceById(deviceId);
        mmap.put("device", device);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备
     */
    //("business:device:edit")
    @Log(title = "设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Device device)
    {
        return toAjax(deviceService.updateDevice(device));
    }

    /**
     * 删除设备
     */
    //("business:device:remove")
    @Log(title = "设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceService.deleteDeviceByIds(ids));
    }
}
