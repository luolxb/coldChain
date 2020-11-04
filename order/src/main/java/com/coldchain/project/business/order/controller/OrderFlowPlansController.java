package com.coldchain.project.business.order.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.order.domain.OrderFlowPlans;
import com.coldchain.project.business.order.service.IOrderFlowPlansService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单流量价格套餐Controller
 *
 * @author nts
 * @date 2019-11-29
 */
@Controller
@RequestMapping("/business/orderFlowPlans")
public class OrderFlowPlansController extends BaseController {
    private String prefix = "business/orderFlowPlans";

    @Autowired
    private IOrderFlowPlansService orderFlowPlansService;

    //("business:orderFlowPlans:view")
    @GetMapping()
    public String orderFlowPlans() {
        return prefix + "/orderFlowPlans";
    }

    /**
     * 查询订单流量价格套餐列表
     */
    //("business:orderFlowPlans:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrderFlowPlans orderFlowPlans) {
        startPage();
        List<OrderFlowPlans> list = orderFlowPlansService.selectOrderFlowPlansList(orderFlowPlans);
        return getDataTable(list);
    }

    /**
     * 导出订单流量价格套餐列表
     */
    //("business:orderFlowPlans:export")
    @Log(title = "订单流量价格套餐", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrderFlowPlans orderFlowPlans) {
        List<OrderFlowPlans> list = orderFlowPlansService.selectOrderFlowPlansList(orderFlowPlans);
        ExcelUtil<OrderFlowPlans> util = new ExcelUtil<OrderFlowPlans>(OrderFlowPlans.class);
        return util.exportExcel(list, "orderFlowPlans");
    }

    /**
     * 新增订单流量价格套餐
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存订单流量价格套餐
     */
    //("business:orderFlowPlans:add")
    @Log(title = "订单流量价格套餐", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrderFlowPlans orderFlowPlans) {
        return toAjax(orderFlowPlansService.insertOrderFlowPlans(orderFlowPlans));
    }

    /**
     * 修改订单流量价格套餐
     */
    @GetMapping("/edit/{orderFlowPlansId}")
    public String edit(@PathVariable("orderFlowPlansId") Long orderFlowPlansId, ModelMap mmap) {
        OrderFlowPlans orderFlowPlans = orderFlowPlansService.selectOrderFlowPlansById(orderFlowPlansId);
        mmap.put("orderFlowPlans", orderFlowPlans);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单流量价格套餐
     */
    //("business:orderFlowPlans:edit")
    @Log(title = "订单流量价格套餐", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrderFlowPlans orderFlowPlans) {
        return toAjax(orderFlowPlansService.updateOrderFlowPlans(orderFlowPlans));
    }

    /**
     * 删除订单流量价格套餐
     */
    //("business:orderFlowPlans:remove")
    @Log(title = "订单流量价格套餐", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(orderFlowPlansService.deleteOrderFlowPlansByIds(ids));
    }
}
