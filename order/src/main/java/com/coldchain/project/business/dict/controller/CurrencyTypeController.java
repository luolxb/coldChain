package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.CurrencyType;
import com.coldchain.project.business.dict.service.ICurrencyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-货币类别Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictCurrencyType")
public class CurrencyTypeController extends BaseController
{
    private String prefix = "business/dictCurrencyType";

    @Autowired
    private ICurrencyTypeService dictCurrencyTypeService;

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping()
    public String dictCurrencyType()
    {
        return prefix + "/dictCurrencyType";
    }

    /**
     * 查询字典-货币类别列表
     */
    @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CurrencyType currencyType)
    {
        startPage();
        List<CurrencyType> list = dictCurrencyTypeService.selectCurrencyTypeList(currencyType);
        return getDataTable(list);
    }

    /**
     * 导出字典-货币类别列表
     */
    @PreAuthorize("hasAnyRole('ADMIN')")
    @Log(title = "字典-货币类别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CurrencyType currencyType)
    {
        List<CurrencyType> list = dictCurrencyTypeService.selectCurrencyTypeList(currencyType);
        ExcelUtil<CurrencyType> util = new ExcelUtil<CurrencyType>(CurrencyType.class);
        return util.exportExcel(list, "dictCurrencyType");
    }

    /**
     * 新增字典-货币类别
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-货币类别
     */
    @PreAuthorize("hasAnyRole('USER')")
    @Log(title = "字典-货币类别", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CurrencyType currencyType)
    {
        return toAjax(dictCurrencyTypeService.insertCurrencyType(currencyType));
    }

    /**
     * 修改字典-货币类别
     */
    @GetMapping("/edit/{currencyTypeId}")
    public String edit(@PathVariable("currencyTypeId") Integer currencyTypeId, ModelMap mmap)
    {
        CurrencyType currencyType = dictCurrencyTypeService.selectCurrencyTypeById(currencyTypeId);
        mmap.put("currencyType", currencyType);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-货币类别
     */
    @PreAuthorize("hasAnyRole('ADMIN')")
    @Log(title = "字典-货币类别", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CurrencyType currencyType)
    {
        return toAjax(dictCurrencyTypeService.updateCurrencyType(currencyType));
    }

    /**
     * 删除字典-货币类别
     */
    @PreAuthorize("hasAnyRole('ADMIN')")
    @Log(title = "字典-货币类别", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictCurrencyTypeService.deleteCurrencyTypeByIds(ids));
    }
}
