package com.coldchain.project.business.company.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.company.domain.Company;
import com.coldchain.project.business.company.service.ICompanyService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 企业Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/company")
public class CompanyController extends BaseController
{
    private String prefix = "business/company";

    @Autowired
    private ICompanyService companyService;

    //("business:company:view")
    @GetMapping()
    public String company()
    {
        return prefix + "/company";
    }

    /**
     * 查询企业列表
     */
    //("business:company:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Company company)
    {
        startPage();
        List<Company> list = companyService.selectCompanyList(company);
        return getDataTable(list);
    }

    /**
     * 导出企业列表
     */
    //("business:company:export")
    @Log(title = "企业", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Company company)
    {
        List<Company> list = companyService.selectCompanyList(company);
        ExcelUtil<Company> util = new ExcelUtil<Company>(Company.class);
        return util.exportExcel(list, "company");
    }

    /**
     * 新增企业
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业
     */
    //("business:company:add")
    @Log(title = "企业", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Company company)
    {
        return toAjax(companyService.insertCompany(company));
    }

    /**
     * 修改企业
     */
    @GetMapping("/edit/{companyId}")
    public String edit(@PathVariable("companyId") Long companyId, ModelMap mmap)
    {
        Company company = companyService.selectCompanyById(companyId);
        mmap.put("company", company);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业
     */
    //("business:company:edit")
    @Log(title = "企业", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Company company)
    {
        return toAjax(companyService.updateCompany(company));
    }

    /**
     * 删除企业
     */
    //("business:company:remove")
    @Log(title = "企业", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(companyService.deleteCompanyByIds(ids));
    }
}
