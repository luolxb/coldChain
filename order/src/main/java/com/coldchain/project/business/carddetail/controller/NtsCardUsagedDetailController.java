package com.coldchain.project.business.carddetail.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.carddetail.domain.NtsCardUsagedDetail;
import com.coldchain.project.business.carddetail.service.INtsCardUsagedDetailService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 物联卡流量使用使用详情Controller
 * 
 * @author nts
 * @date 2020-04-14
 */
@Controller
@RequestMapping("/business/detail")
public class NtsCardUsagedDetailController extends BaseController
{
    private String prefix = "business/detail";

    @Autowired
    private INtsCardUsagedDetailService ntsCardUsagedDetailService;

    //("business:detail:view")
    @GetMapping()
    public String detail()
    {
        return prefix + "/detail";
    }

    /**
     * 查询物联卡流量使用使用详情列表
     */
    //("business:detail:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(NtsCardUsagedDetail ntsCardUsagedDetail)
    {
        startPage();
        List<NtsCardUsagedDetail> list = ntsCardUsagedDetailService.selectNtsCardUsagedDetailList(ntsCardUsagedDetail);
        return getDataTable(list);
    }

    /**
     * 导出物联卡流量使用使用详情列表
     */
    //("business:detail:export")
    @Log(title = "物联卡流量使用使用详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(NtsCardUsagedDetail ntsCardUsagedDetail)
    {
        List<NtsCardUsagedDetail> list = ntsCardUsagedDetailService.selectNtsCardUsagedDetailList(ntsCardUsagedDetail);
        ExcelUtil<NtsCardUsagedDetail> util = new ExcelUtil<NtsCardUsagedDetail>(NtsCardUsagedDetail.class);
        return util.exportExcel(list, "detail");
    }

    /**
     * 新增物联卡流量使用使用详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存物联卡流量使用使用详情
     */
    //("business:detail:add")
    @Log(title = "物联卡流量使用使用详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(NtsCardUsagedDetail ntsCardUsagedDetail)
    {
        return toAjax(ntsCardUsagedDetailService.insertNtsCardUsagedDetail(ntsCardUsagedDetail));
    }

    /**
     * 修改物联卡流量使用使用详情
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        NtsCardUsagedDetail ntsCardUsagedDetail = ntsCardUsagedDetailService.selectNtsCardUsagedDetailById(id);
        mmap.put("ntsCardUsagedDetail", ntsCardUsagedDetail);
        return prefix + "/edit";
    }

    /**
     * 修改保存物联卡流量使用使用详情
     */
    //("business:detail:edit")
    @Log(title = "物联卡流量使用使用详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(NtsCardUsagedDetail ntsCardUsagedDetail)
    {
        return toAjax(ntsCardUsagedDetailService.updateNtsCardUsagedDetail(ntsCardUsagedDetail));
    }

    /**
     * 删除物联卡流量使用使用详情
     */
    //("business:detail:remove")
    @Log(title = "物联卡流量使用使用详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ntsCardUsagedDetailService.deleteNtsCardUsagedDetailByIds(ids));
    }
}
