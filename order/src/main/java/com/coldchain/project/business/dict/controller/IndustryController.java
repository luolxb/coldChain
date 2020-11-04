package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.Industry;
import com.coldchain.project.business.dict.service.IIndustryService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-行业Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictIndustry")
public class IndustryController extends BaseController
{
    private String prefix = "business/dictIndustry";

    @Autowired
    private IIndustryService dictIndustryService;

    //("business:dictIndustry:view")
    @GetMapping()
    public String dictIndustry()
    {
        return prefix + "/dictIndustry";
    }

    /**
     * 查询字典-行业列表
     */
    //("business:dictIndustry:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Industry industry)
    {
        startPage();
        List<Industry> list = dictIndustryService.selectIndustryList(industry);
        return getDataTable(list);
    }

    /**
     * 导出字典-行业列表
     */
    //("business:dictIndustry:export")
    @Log(title = "字典-行业", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Industry industry)
    {
        List<Industry> list = dictIndustryService.selectIndustryList(industry);
        ExcelUtil<Industry> util = new ExcelUtil<Industry>(Industry.class);
        return util.exportExcel(list, "dictIndustry");
    }

    /**
     * 新增字典-行业
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-行业
     */
    //("business:dictIndustry:add")
    @Log(title = "字典-行业", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Industry industry)
    {
        return toAjax(dictIndustryService.insertIndustry(industry));
    }

    /**
     * 修改字典-行业
     */
    @GetMapping("/edit/{industryId}")
    public String edit(@PathVariable("industryId") Integer industryId, ModelMap mmap)
    {
        Industry industry = dictIndustryService.selectIndustryById(industryId);
        mmap.put("industry", industry);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-行业
     */
    //("business:dictIndustry:edit")
    @Log(title = "字典-行业", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Industry industry)
    {
        return toAjax(dictIndustryService.updateIndustry(industry));
    }

    /**
     * 删除字典-行业
     */
    //("business:dictIndustry:remove")
    @Log(title = "字典-行业", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictIndustryService.deleteIndustryByIds(ids));
    }
}
