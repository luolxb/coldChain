package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.CompanyMember;
import com.coldchain.project.business.dict.service.ICompanyMemberService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-企业会员Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictCompanyMember")
public class CompanyMemberController extends BaseController
{
    private String prefix = "business/dictCompanyMember";

    @Autowired
    private ICompanyMemberService dictCompanyMemberService;

    //("business:dictCompanyMember:view")
    @GetMapping()
    public String dictCompanyMember()
    {
        return prefix + "/dictCompanyMember";
    }

    /**
     * 查询字典-企业会员列表
     */
    //("business:dictCompanyMember:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CompanyMember companyMember)
    {
        startPage();
        List<CompanyMember> list = dictCompanyMemberService.selectCompanyMemberList(companyMember);
        return getDataTable(list);
    }

    /**
     * 导出字典-企业会员列表
     */
    //("business:dictCompanyMember:export")
    @Log(title = "字典-企业会员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CompanyMember companyMember)
    {
        List<CompanyMember> list = dictCompanyMemberService.selectCompanyMemberList(companyMember);
        ExcelUtil<CompanyMember> util = new ExcelUtil<CompanyMember>(CompanyMember.class);
        return util.exportExcel(list, "dictCompanyMember");
    }

    /**
     * 新增字典-企业会员
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-企业会员
     */
    //("business:dictCompanyMember:add")
    @Log(title = "字典-企业会员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CompanyMember companyMember)
    {
        return toAjax(dictCompanyMemberService.insertCompanyMember(companyMember));
    }

    /**
     * 修改字典-企业会员
     */
    @GetMapping("/edit/{companyMemberId}")
    public String edit(@PathVariable("companyMemberId") Integer companyMemberId, ModelMap mmap)
    {
        CompanyMember companyMember = dictCompanyMemberService.selectCompanyMemberById(companyMemberId);
        mmap.put("companyMember", companyMember);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-企业会员
     */
    //("business:dictCompanyMember:edit")
    @Log(title = "字典-企业会员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CompanyMember companyMember)
    {
        return toAjax(dictCompanyMemberService.updateCompanyMember(companyMember));
    }

    /**
     * 删除字典-企业会员
     */
    //("business:dictCompanyMember:remove")
    @Log(title = "字典-企业会员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictCompanyMemberService.deleteCompanyMemberByIds(ids));
    }
}
