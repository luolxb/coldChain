package com.coldchain.project.business.order.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.order.domain.OrderDeviceFlow;
import com.coldchain.project.business.order.service.IOrderDeviceFlowService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 设备流量订单Controller
 *
 * @author nts
 * @date 2019-11-29
 */
@Controller
@RequestMapping("/business/orderDeviceFlow")
public class OrderDeviceFlowController extends BaseController {
    private String prefix = "business/orderDeviceFlow";

    @Autowired
    private IOrderDeviceFlowService OrderDeviceFlowService;

    //("business:orderDeviceFlow:view")
    @GetMapping()
    public String orderDeviceFlow() {
        return prefix + "/orderDeviceFlow";
    }

    /**
     * 查询设备流量订单列表
     */
    //("business:orderDeviceFlow:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrderDeviceFlow OrderDeviceFlow) {
        startPage();
        List<OrderDeviceFlow> list = OrderDeviceFlowService.selectOrderDeviceFlowList(OrderDeviceFlow);
        return getDataTable(list);
    }

    /**
     * 导出设备流量订单列表
     */
    //("business:orderDeviceFlow:export")
    @Log(title = "设备流量订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrderDeviceFlow OrderDeviceFlow) {
        List<OrderDeviceFlow> list = OrderDeviceFlowService.selectOrderDeviceFlowList(OrderDeviceFlow);
        ExcelUtil<OrderDeviceFlow> util = new ExcelUtil<OrderDeviceFlow>(OrderDeviceFlow.class);
        return util.exportExcel(list, "orderDeviceFlow");
    }

    /**
     * 新增设备流量订单
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存设备流量订单
     */
    //("business:orderDeviceFlow:add")
    @Log(title = "设备流量订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrderDeviceFlow OrderDeviceFlow) {
        return toAjax(OrderDeviceFlowService.insertOrderDeviceFlow(OrderDeviceFlow));
    }

    /**
     * 修改设备流量订单
     */
    @GetMapping("/edit/{orderDeviceFlowId}")
    public String edit(@PathVariable("orderDeviceFlowId") Long orderDeviceFlowId, ModelMap mmap) {
        OrderDeviceFlow OrderDeviceFlow = OrderDeviceFlowService.selectOrderDeviceFlowById(orderDeviceFlowId);
        mmap.put("OrderDeviceFlow", OrderDeviceFlow);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备流量订单
     */
    //("business:orderDeviceFlow:edit")
    @Log(title = "设备流量订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrderDeviceFlow OrderDeviceFlow) {
        return toAjax(OrderDeviceFlowService.updateOrderDeviceFlow(OrderDeviceFlow));
    }

    /**
     * 删除设备流量订单
     */
    //("business:orderDeviceFlow:remove")
    @Log(title = "设备流量订单", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(OrderDeviceFlowService.deleteOrderDeviceFlowByIds(ids));
    }
}
