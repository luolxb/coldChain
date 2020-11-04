package com.coldchain.project.business.device.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.device.domain.DeviceDataReport;
import com.coldchain.project.business.device.service.IDeviceDataReportService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 设备数据上报Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/deviceDataReport")
public class DeviceDataReportController extends BaseController
{
    private String prefix = "business/deviceDataReport";

    @Autowired
    private IDeviceDataReportService deviceDataReportService;

    //("business:deviceDataReport:view")
    @GetMapping()
    public String deviceDataReport()
    {
        return prefix + "/deviceDataReport";
    }

    /**
     * 查询设备数据上报列表
     */
    //("business:deviceDataReport:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeviceDataReport deviceDataReport)
    {
        startPage();
        List<DeviceDataReport> list = deviceDataReportService.selectDeviceDataReportList(deviceDataReport);
        return getDataTable(list);
    }

    /**
     * 导出设备数据上报列表
     */
    //("business:deviceDataReport:export")
    @Log(title = "设备数据上报", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeviceDataReport deviceDataReport)
    {
        List<DeviceDataReport> list = deviceDataReportService.selectDeviceDataReportList(deviceDataReport);
        ExcelUtil<DeviceDataReport> util = new ExcelUtil<DeviceDataReport>(DeviceDataReport.class);
        return util.exportExcel(list, "deviceDataReport");
    }

    /**
     * 新增设备数据上报
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备数据上报
     */
    //("business:deviceDataReport:add")
    @Log(title = "设备数据上报", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeviceDataReport deviceDataReport)
    {
        return toAjax(deviceDataReportService.insertDeviceDataReport(deviceDataReport));
    }

    /**
     * 修改设备数据上报
     */
    @GetMapping("/edit/{deviceDataReportId}")
    public String edit(@PathVariable("deviceDataReportId") Long deviceDataReportId, ModelMap mmap)
    {
        DeviceDataReport deviceDataReport = deviceDataReportService.selectDeviceDataReportById(deviceDataReportId);
        mmap.put("deviceDataReport", deviceDataReport);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备数据上报
     */
    //("business:deviceDataReport:edit")
    @Log(title = "设备数据上报", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeviceDataReport deviceDataReport)
    {
        return toAjax(deviceDataReportService.updateDeviceDataReport(deviceDataReport));
    }

    /**
     * 删除设备数据上报
     */
    //("business:deviceDataReport:remove")
    @Log(title = "设备数据上报", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deviceDataReportService.deleteDeviceDataReportByIds(ids));
    }
}
