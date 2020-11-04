package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.FlowValuationRatio;
import com.coldchain.project.business.dict.service.IFlowValuationRatioService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-流量计价比率Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictFlowValuationRatio")
public class FlowValuationRatioController extends BaseController
{
    private String prefix = "business/dictFlowValuationRatio";

    @Autowired
    private IFlowValuationRatioService dictFlowValuationRatioService;

    //("business:dictFlowValuationRatio:view")
    @GetMapping()
    public String dictFlowValuationRatio()
    {
        return prefix + "/dictFlowValuationRatio";
    }

    /**
     * 查询字典-流量计价比率列表
     */
    //("business:dictFlowValuationRatio:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FlowValuationRatio flowValuationRatio)
    {
        startPage();
        List<FlowValuationRatio> list = dictFlowValuationRatioService.selectFlowValuationRatioList(flowValuationRatio);
        return getDataTable(list);
    }

    /**
     * 导出字典-流量计价比率列表
     */
    //("business:dictFlowValuationRatio:export")
    @Log(title = "字典-流量计价比率", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FlowValuationRatio flowValuationRatio)
    {
        List<FlowValuationRatio> list = dictFlowValuationRatioService.selectFlowValuationRatioList(flowValuationRatio);
        ExcelUtil<FlowValuationRatio> util = new ExcelUtil<FlowValuationRatio>(FlowValuationRatio.class);
        return util.exportExcel(list, "dictFlowValuationRatio");
    }

    /**
     * 新增字典-流量计价比率
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-流量计价比率
     */
    //("business:dictFlowValuationRatio:add")
    @Log(title = "字典-流量计价比率", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FlowValuationRatio flowValuationRatio)
    {
        return toAjax(dictFlowValuationRatioService.insertFlowValuationRatio(flowValuationRatio));
    }

    /**
     * 修改字典-流量计价比率
     */
    @GetMapping("/edit/{flowValuationRatioId}")
    public String edit(@PathVariable("flowValuationRatioId") Integer flowValuationRatioId, ModelMap mmap)
    {
        FlowValuationRatio flowValuationRatio = dictFlowValuationRatioService.selectFlowValuationRatioById(flowValuationRatioId);
        mmap.put("flowValuationRatio", flowValuationRatio);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-流量计价比率
     */
    //("business:dictFlowValuationRatio:edit")
    @Log(title = "字典-流量计价比率", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FlowValuationRatio flowValuationRatio)
    {
        return toAjax(dictFlowValuationRatioService.updateFlowValuationRatio(flowValuationRatio));
    }

    /**
     * 删除字典-流量计价比率
     */
    //("business:dictFlowValuationRatio:remove")
    @Log(title = "字典-流量计价比率", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictFlowValuationRatioService.deleteFlowValuationRatioByIds(ids));
    }
}
