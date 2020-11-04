package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.CompanyScale;
import com.coldchain.project.business.dict.service.ICompanyScaleService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-企业规模Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictCompanyScale")
public class CompanyScaleController extends BaseController
{
    private String prefix = "business/dictCompanyScale";

    @Autowired
    private ICompanyScaleService dictCompanyScaleService;

    //("business:dictCompanyScale:view")
    @GetMapping()
    public String dictCompanyScale()
    {
        return prefix + "/dictCompanyScale";
    }

    /**
     * 查询字典-企业规模列表
     */
    //("business:dictCompanyScale:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CompanyScale companyScale)
    {
        startPage();
        List<CompanyScale> list = dictCompanyScaleService.selectCompanyScaleList(companyScale);
        return getDataTable(list);
    }

    /**
     * 导出字典-企业规模列表
     */
    //("business:dictCompanyScale:export")
    @Log(title = "字典-企业规模", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CompanyScale companyScale)
    {
        List<CompanyScale> list = dictCompanyScaleService.selectCompanyScaleList(companyScale);
        ExcelUtil<CompanyScale> util = new ExcelUtil<CompanyScale>(CompanyScale.class);
        return util.exportExcel(list, "dictCompanyScale");
    }

    /**
     * 新增字典-企业规模
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-企业规模
     */
    //("business:dictCompanyScale:add")
    @Log(title = "字典-企业规模", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CompanyScale companyScale)
    {
        return toAjax(dictCompanyScaleService.insertCompanyScale(companyScale));
    }

    /**
     * 修改字典-企业规模
     */
    @GetMapping("/edit/{companyScaleId}")
    public String edit(@PathVariable("companyScaleId") Integer companyScaleId, ModelMap mmap)
    {
        CompanyScale companyScale = dictCompanyScaleService.selectCompanyScaleById(companyScaleId);
        mmap.put("companyScale", companyScale);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-企业规模
     */
    //("business:dictCompanyScale:edit")
    @Log(title = "字典-企业规模", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CompanyScale companyScale)
    {
        return toAjax(dictCompanyScaleService.updateCompanyScale(companyScale));
    }

    /**
     * 删除字典-企业规模
     */
    //("business:dictCompanyScale:remove")
    @Log(title = "字典-企业规模", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictCompanyScaleService.deleteCompanyScaleByIds(ids));
    }
}
