package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.ValuationType;
import com.coldchain.project.business.dict.service.IValuationTypeService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-计价模式Controller
 *
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictValuationType")
public class ValuationTypeController extends BaseController {
    private String prefix = "business/dictValuationType" ;

    @Autowired
    private IValuationTypeService dictValuationTypeService;

    //("business:dictValuationType:view")
    @GetMapping()
    public String dictValuationType() {
        return prefix + "/dictValuationType" ;
    }

    /**
     * 查询字典-计价模式列表
     */
    //("business:dictValuationType:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ValuationType valuationType) {
        startPage();
        List<ValuationType> list = dictValuationTypeService.selectValuationTypeList(valuationType);
        return getDataTable(list);
    }

    /**
     * 导出字典-计价模式列表
     */
    //("business:dictValuationType:export")
    @Log(title = "字典-计价模式" , businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ValuationType valuationType) {
        List<ValuationType> list = dictValuationTypeService.selectValuationTypeList(valuationType);
        ExcelUtil<ValuationType> util = new ExcelUtil<ValuationType>(ValuationType.class);
        return util.exportExcel(list, "dictValuationType");
    }

    /**
     * 新增字典-计价模式
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add" ;
    }

    /**
     * 新增保存字典-计价模式
     */
    //("business:dictValuationType:add")
    @Log(title = "字典-计价模式" , businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ValuationType valuationType) {
        return toAjax(dictValuationTypeService.insertValuationType(valuationType));
    }

    /**
     * 修改字典-计价模式
     */
    @GetMapping("/edit/{valuationTypeId}")
    public String edit(@PathVariable("valuationTypeId") Integer valuationTypeId, ModelMap mmap) {
        ValuationType valuationType = dictValuationTypeService.selectValuationTypeById(valuationTypeId);
        mmap.put("valuationType" , valuationType);
        return prefix + "/edit" ;
    }

    /**
     * 修改保存字典-计价模式
     */
    //("business:dictValuationType:edit")
    @Log(title = "字典-计价模式" , businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ValuationType valuationType) {
        return toAjax(dictValuationTypeService.updateValuationType(valuationType));
    }

    /**
     * 删除字典-计价模式
     */
    //("business:dictValuationType:remove")
    @Log(title = "字典-计价模式" , businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(dictValuationTypeService.deleteValuationTypeByIds(ids));
    }
}
