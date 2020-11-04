package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.Carrier;
import com.coldchain.project.business.dict.service.ICarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-服务商Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictCarrier")
public class CarrierController extends BaseController
{
    private String prefix = "business/dictCarrier";

    @Autowired
    private ICarrierService dictCarrierService;

    //("business:dictCarrier:view")
    @GetMapping()
    public String dictCarrier()
    {
        return prefix + "/dictCarrier";
    }

    /**
     * 查询字典-服务商列表
     */
    //("business:dictCarrier:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Carrier carrier)
    {
        startPage();
        List<Carrier> list = dictCarrierService.selectCarrierList(carrier);
        return getDataTable(list);
    }

    /**
     * 导出字典-服务商列表
     */
    //("business:dictCarrier:export")
    @Log(title = "字典-服务商", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Carrier carrier)
    {
        List<Carrier> list = dictCarrierService.selectCarrierList(carrier);
        ExcelUtil<Carrier> util = new ExcelUtil<Carrier>(Carrier.class);
        return util.exportExcel(list, "dictCarrier");
    }

    /**
     * 新增字典-服务商
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-服务商
     */
    //("business:dictCarrier:add")
    @Log(title = "字典-服务商", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Carrier carrier)
    {
        return toAjax(dictCarrierService.insertCarrier(carrier));
    }

    /**
     * 修改字典-服务商
     */
    @GetMapping("/edit/{carrierId}")
    public String edit(@PathVariable("carrierId") Integer carrierId, ModelMap mmap)
    {
        Carrier carrier = dictCarrierService.selectCarrierById(carrierId);
        mmap.put("dictCarrier", carrier);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-服务商
     */
    //("business:dictCarrier:edit")
    @Log(title = "字典-服务商", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Carrier carrier)
    {
        return toAjax(dictCarrierService.updateCarrier(carrier));
    }

    /**
     * 删除字典-服务商
     */
    //("business:dictCarrier:remove")
    @Log(title = "字典-服务商", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictCarrierService.deleteCarrierByIds(ids));
    }
}
