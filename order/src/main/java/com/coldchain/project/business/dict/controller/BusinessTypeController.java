package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.BusinessType;
import com.coldchain.project.business.dict.service.IBusinessTypeService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-业务类别Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictBusinessType")
public class BusinessTypeController extends BaseController
{
    private String prefix = "business/dictBusinessType";

    @Autowired
    private IBusinessTypeService dictBusinessTypeService;

    //("business:dictBusinessType:view")
    @GetMapping()
    public String dictBusinessType()
    {
        return prefix + "/dictBusinessType";
    }

    /**
     * 查询字典-业务类别列表
     */
    //("business:businessType:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BusinessType businessType)
    {
        startPage();
        List<BusinessType> list = dictBusinessTypeService.selectBusinessTypeList(businessType);
        return getDataTable(list);
    }

    /**
     * 导出字典-业务类别列表
     */
    //("business:businessType:export")
    @Log(title = "字典-业务类别", businessType = com.coldchain.framework.aspectj.lang.enums.BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BusinessType businessType)
    {
        List<BusinessType> list = dictBusinessTypeService.selectBusinessTypeList(businessType);
        ExcelUtil<BusinessType> util = new ExcelUtil<BusinessType>(BusinessType.class);
        return util.exportExcel(list, "dictBusinessType");
    }

    /**
     * 新增字典-业务类别
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-业务类别
     */
    //("business:businessType:add")
    @Log(title = "字典-业务类别", businessType = com.coldchain.framework.aspectj.lang.enums.BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BusinessType businessType)
    {
        return toAjax(dictBusinessTypeService.insertBusinessType(businessType));
    }

    /**
     * 修改字典-业务类别
     */
    @GetMapping("/edit/{businessTypeId}")
    public String edit(@PathVariable("businessTypeId") Integer businessTypeId, ModelMap mmap)
    {
        BusinessType businessType = dictBusinessTypeService.selectBusinessTypeById(businessTypeId);
        mmap.put("businessType", businessType);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-业务类别
     */
    //("business:businessType:edit")
    @Log(title = "字典-业务类别", businessType = com.coldchain.framework.aspectj.lang.enums.BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BusinessType businessType)
    {
        return toAjax(dictBusinessTypeService.updateBusinessType(businessType));
    }

    /**
     * 删除字典-业务类别
     */
    //("business:dictBusinessType:remove")
    @Log(title = "字典-业务类别", businessType = com.coldchain.framework.aspectj.lang.enums.BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictBusinessTypeService.deleteBusinessTypeByIds(ids));
    }
}
