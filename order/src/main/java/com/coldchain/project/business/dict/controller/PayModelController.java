package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.PayModel;
import com.coldchain.project.business.dict.service.IPayModelService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-支付方式Controller
 *
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictPayModel")
public class PayModelController extends BaseController {
    private String prefix = "business/dictPayModel" ;

    @Autowired
    private IPayModelService dictPayModelService;

    //("business:dictPayModel:view")
    @GetMapping()
    public String dictPayModel() {
        return prefix + "/dictPayModel" ;
    }

    /**
     * 查询字典-支付方式列表
     */
    //("business:dictPayModel:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PayModel payModel) {
        startPage();
        List<PayModel> list = dictPayModelService.selectPayModelList(payModel);
        return getDataTable(list);
    }

    /**
     * 导出字典-支付方式列表
     */
    //("business:dictPayModel:export")
    @Log(title = "字典-支付方式" , businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PayModel payModel) {
        List<PayModel> list = dictPayModelService.selectPayModelList(payModel);
        ExcelUtil<PayModel> util = new ExcelUtil<PayModel>(PayModel.class);
        return util.exportExcel(list, "dictPayModel");
    }

    /**
     * 新增字典-支付方式
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add" ;
    }

    /**
     * 新增保存字典-支付方式
     */
    //("business:dictPayModel:add")
    @Log(title = "字典-支付方式" , businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PayModel payModel) {
        return toAjax(dictPayModelService.insertPayModel(payModel));
    }

    /**
     * 修改字典-支付方式
     */
    @GetMapping("/edit/{payModelId}")
    public String edit(@PathVariable("payModelId") Integer payModelId, ModelMap mmap) {
        PayModel payModel = dictPayModelService.selectPayModelById(payModelId);
        mmap.put("payModel" , payModel);
        return prefix + "/edit" ;
    }

    /**
     * 修改保存字典-支付方式
     */
    //("business:dictPayModel:edit")
    @Log(title = "字典-支付方式" , businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PayModel payModel) {
        return toAjax(dictPayModelService.updatePayModel(payModel));
    }

    /**
     * 删除字典-支付方式
     */
    //("business:dictPayModel:remove")
    @Log(title = "字典-支付方式" , businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(dictPayModelService.deletePayModelByIds(ids));
    }
}
