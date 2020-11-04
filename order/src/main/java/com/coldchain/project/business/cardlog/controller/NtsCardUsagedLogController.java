package com.coldchain.project.business.cardlog.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.cardlog.domain.NtsCardUsagedLog;
import com.coldchain.project.business.cardlog.service.INtsCardUsagedLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 物联网卡使用日志Controller
 * 
 * @author nts
 * @date 2020-04-14
 */
@Controller
@RequestMapping("/business/log")
public class NtsCardUsagedLogController extends BaseController
{
    private String prefix = "business/log";

    @Autowired
    private INtsCardUsagedLogService ntsCardUsagedLogService;

    @PreAuthorize("hasAnyRole('SELLER')")
    @GetMapping()
    public String log()
    {
        return prefix + "/log";
    }

    /**
     * 查询物联网卡使用日志列表
     */
    @PreAuthorize("hasAnyRole('SELLER')")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NtsCardUsagedLog ntsCardUsagedLog)
    {
        startPage();
        List<NtsCardUsagedLog> list = ntsCardUsagedLogService.selectNtsCardUsagedLogList(ntsCardUsagedLog);
        return getDataTable(list);
    }

    /**
     * 导出物联网卡使用日志列表
     */
    @PreAuthorize("hasAnyRole('SELLER')")
    @Log(title = "物联网卡使用日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NtsCardUsagedLog ntsCardUsagedLog)
    {
        List<NtsCardUsagedLog> list = ntsCardUsagedLogService.selectNtsCardUsagedLogList(ntsCardUsagedLog);
        ExcelUtil<NtsCardUsagedLog> util = new ExcelUtil<NtsCardUsagedLog>(NtsCardUsagedLog.class);
        return util.exportExcel(list, "log");
    }

    /**
     * 新增物联网卡使用日志
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存物联网卡使用日志
     */
    @PreAuthorize("hasAnyRole('SELLER')")
    @Log(title = "物联网卡使用日志", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NtsCardUsagedLog ntsCardUsagedLog)
    {
        return toAjax(ntsCardUsagedLogService.insertNtsCardUsagedLog(ntsCardUsagedLog));
    }

    /**
     * 修改物联网卡使用日志
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        NtsCardUsagedLog ntsCardUsagedLog = ntsCardUsagedLogService.selectNtsCardUsagedLogById(id);
        mmap.put("ntsCardUsagedLog", ntsCardUsagedLog);
        return prefix + "/edit";
    }

    /**
     * 修改保存物联网卡使用日志
     */
    @PreAuthorize("hasAnyRole('SELLER')")
    @Log(title = "物联网卡使用日志", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NtsCardUsagedLog ntsCardUsagedLog)
    {
        return toAjax(ntsCardUsagedLogService.updateNtsCardUsagedLog(ntsCardUsagedLog));
    }

    /**
     * 删除物联网卡使用日志
     */
    @PreAuthorize("hasAnyRole('SELLER')")
    @Log(title = "物联网卡使用日志", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ntsCardUsagedLogService.deleteNtsCardUsagedLogByIds(ids));
    }
}
