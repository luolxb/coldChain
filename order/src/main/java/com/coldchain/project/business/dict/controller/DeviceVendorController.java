package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.DeviceVendor;
import com.coldchain.project.business.dict.service.IDeviceVendorService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-设备制造商Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictDeviceVendor")
public class DeviceVendorController extends BaseController
{
    private String prefix = "business/dictDeviceVendor";

    @Autowired
    private IDeviceVendorService dictDeviceVendorService;

    //("business:dictDeviceVendor:view")
    @GetMapping()
    public String dictDeviceVendor()
    {
        return prefix + "/dictDeviceVendor";
    }

    /**
     * 查询字典-设备制造商列表
     */
    //("business:dictDeviceVendor:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceVendor deviceVendor)
    {
        startPage();
        List<DeviceVendor> list = dictDeviceVendorService.selectDeviceVendorList(deviceVendor);
        return getDataTable(list);
    }

    /**
     * 导出字典-设备制造商列表
     */
    //("business:dictDeviceVendor:export")
    @Log(title = "字典-设备制造商", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceVendor deviceVendor)
    {
        List<DeviceVendor> list = dictDeviceVendorService.selectDeviceVendorList(deviceVendor);
        ExcelUtil<DeviceVendor> util = new ExcelUtil<DeviceVendor>(DeviceVendor.class);
        return util.exportExcel(list, "dictDeviceVendor");
    }

    /**
     * 新增字典-设备制造商
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-设备制造商
     */
    //("business:dictDeviceVendor:add")
    @Log(title = "字典-设备制造商", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeviceVendor deviceVendor)
    {
        return toAjax(dictDeviceVendorService.insertDeviceVendor(deviceVendor));
    }

    /**
     * 修改字典-设备制造商
     */
    @GetMapping("/edit/{deviceVendorId}")
    public String edit(@PathVariable("deviceVendorId") Integer deviceVendorId, ModelMap mmap)
    {
        DeviceVendor deviceVendor = dictDeviceVendorService.selectDeviceVendorById(deviceVendorId);
        mmap.put("deviceVendor", deviceVendor);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-设备制造商
     */
    //("business:dictDeviceVendor:edit")
    @Log(title = "字典-设备制造商", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceVendor deviceVendor)
    {
        return toAjax(dictDeviceVendorService.updateDeviceVendor(deviceVendor));
    }

    /**
     * 删除字典-设备制造商
     */
    //("business:dictDeviceVendor:remove")
    @Log(title = "字典-设备制造商", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictDeviceVendorService.deleteDeviceVendorByIds(ids));
    }
}
