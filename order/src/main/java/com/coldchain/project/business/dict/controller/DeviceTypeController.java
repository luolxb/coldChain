package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.DeviceType;
import com.coldchain.project.business.dict.service.IDeviceTypeService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-设备类别Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictDeviceType")
public class DeviceTypeController extends BaseController
{
    private String prefix = "business/dictDeviceType";

    @Autowired
    private IDeviceTypeService dictDeviceTypeService;

    //("business:dictDeviceType:view")
    @GetMapping()
    public String dictDeviceType()
    {
        return prefix + "/dictDeviceType";
    }

    /**
     * 查询字典-设备类别列表
     */
    //("business:dictDeviceType:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceType deviceType)
    {
        startPage();
        List<DeviceType> list = dictDeviceTypeService.selectDeviceTypeList(deviceType);
        return getDataTable(list);
    }

    /**
     * 导出字典-设备类别列表
     */
    //("business:dictDeviceType:export")
    @Log(title = "字典-设备类别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceType deviceType)
    {
        List<DeviceType> list = dictDeviceTypeService.selectDeviceTypeList(deviceType);
        ExcelUtil<DeviceType> util = new ExcelUtil<DeviceType>(DeviceType.class);
        return util.exportExcel(list, "dictDeviceType");
    }

    /**
     * 新增字典-设备类别
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-设备类别
     */
    //("business:dictDeviceType:add")
    @Log(title = "字典-设备类别", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeviceType deviceType)
    {
        return toAjax(dictDeviceTypeService.insertDeviceType(deviceType));
    }

    /**
     * 修改字典-设备类别
     */
    @GetMapping("/edit/{deviceTypeId}")
    public String edit(@PathVariable("deviceTypeId") Integer deviceTypeId, ModelMap mmap)
    {
        DeviceType deviceType = dictDeviceTypeService.selectDeviceTypeById(deviceTypeId);
        mmap.put("deviceType", deviceType);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-设备类别
     */
    //("business:dictDeviceType:edit")
    @Log(title = "字典-设备类别", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceType deviceType)
    {
        return toAjax(dictDeviceTypeService.updateDeviceType(deviceType));
    }

    /**
     * 删除字典-设备类别
     */
    //("business:dictDeviceType:remove")
    @Log(title = "字典-设备类别", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictDeviceTypeService.deleteDeviceTypeByIds(ids));
    }
}
