package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.NtsDictCarrier;
import com.coldchain.project.business.dict.service.INtsDictCarrierService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-服务商Controller
 * 
 * @author nts
 * @date 2020-04-16
 */
@Controller
@RequestMapping("/business/carrier")
public class NtsDictCarrierController extends BaseController
{
    private String prefix = "business/carrier";

    @Autowired
    private INtsDictCarrierService ntsDictCarrierService;

    //("business:carrier:view")
    @GetMapping()
    public String carrier()
    {
        return prefix + "/carrier";
    }

    /**
     * 查询字典-服务商列表
     */
    //("business:carrier:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NtsDictCarrier ntsDictCarrier)
    {
        startPage();
        List<NtsDictCarrier> list = ntsDictCarrierService.selectNtsDictCarrierList(ntsDictCarrier);
        return getDataTable(list);
    }

    /**
     * 导出字典-服务商列表
     */
    //("business:carrier:export")
    @Log(title = "字典-服务商", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NtsDictCarrier ntsDictCarrier)
    {
        List<NtsDictCarrier> list = ntsDictCarrierService.selectNtsDictCarrierList(ntsDictCarrier);
        ExcelUtil<NtsDictCarrier> util = new ExcelUtil<NtsDictCarrier>(NtsDictCarrier.class);
        return util.exportExcel(list, "carrier");
    }

    /**
     * 新增字典-服务商
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-服务商
     */
    //("business:carrier:add")
    @Log(title = "字典-服务商", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NtsDictCarrier ntsDictCarrier)
    {
        return toAjax(ntsDictCarrierService.insertNtsDictCarrier(ntsDictCarrier));
    }

    /**
     * 修改字典-服务商
     */
    @GetMapping("/edit/{carrierId}")
    public String edit(@PathVariable("carrierId") Integer carrierId, ModelMap mmap)
    {
        NtsDictCarrier ntsDictCarrier = ntsDictCarrierService.selectNtsDictCarrierById(carrierId);
        mmap.put("ntsDictCarrier", ntsDictCarrier);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-服务商
     */
    //("business:carrier:edit")
    @Log(title = "字典-服务商", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NtsDictCarrier ntsDictCarrier)
    {
        return toAjax(ntsDictCarrierService.updateNtsDictCarrier(ntsDictCarrier));
    }

    /**
     * 删除字典-服务商
     */
    //("business:carrier:remove")
    @Log(title = "字典-服务商", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ntsDictCarrierService.deleteNtsDictCarrierByIds(ids));
    }
}
