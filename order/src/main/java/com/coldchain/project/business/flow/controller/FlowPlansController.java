package com.coldchain.project.business.flow.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.flow.domain.FlowPlans;
import com.coldchain.project.business.flow.service.IFlowPlansService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 流量价格套餐Controller
 *
 * @author flows
 * @date 2019-11-29
 */
@Controller
@RequestMapping("/business/flowPlans")
public class                                                                                                                                                                                                          FlowPlansController extends BaseController {
    private String prefix = "business/flowPlans";

    @Autowired
    private IFlowPlansService flowPlansService;

    //("business:flowPlans:view")
    @GetMapping()
    public String flowPlans() {
        return prefix + "/flowPlans";
    }

    /**
     * 查询流量价格套餐列表
     */
    //("business:flowPlans:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FlowPlans flowPlans) {
        startPage();
        List<FlowPlans> list = flowPlansService.selectFlowPlansList(flowPlans);
        return getDataTable(list);
    }

    /**
     * 导出流量价格套餐列表
     */
    //("business:flowPlans:export")
    @Log(title = "流量价格套餐", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FlowPlans flowPlans) {
        List<FlowPlans> list = flowPlansService.selectFlowPlansList(flowPlans);
        ExcelUtil<FlowPlans> util = new ExcelUtil<FlowPlans>(FlowPlans.class);
        return util.exportExcel(list, "flowPlans");
    }

    /**
     * 新增流量价格套餐
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存流量价格套餐
     */
    //("business:flowPlans:add")
    @Log(title = "流量价格套餐", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FlowPlans flowPlans) {
        return toAjax(flowPlansService.insertFlowPlans(flowPlans));
    }

    /**
     * 修改流量价格套餐
     */
    @GetMapping("/edit/{flowPlansId}")
    public String edit(@PathVariable("flowPlansId") Long flowPlansId, ModelMap mmap) {
        FlowPlans flowPlans = flowPlansService.selectFlowPlansById(flowPlansId);
        mmap.put("flowPlans", flowPlans);
        return prefix + "/edit";
    }

    /**
     * 修改保存流量价格套餐
     */
    //("business:flowPlans:edit")
    @Log(title = "流量价格套餐", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FlowPlans flowPlans) {
        return toAjax(flowPlansService.updateFlowPlans(flowPlans));
    }

    /**
     * 删除流量价格套餐
     */
    //("business:flowPlans:remove")
    @Log(title = "流量价格套餐", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(flowPlansService.deleteFlowPlansByIds(ids));
    }
}
