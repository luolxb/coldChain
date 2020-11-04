package com.coldchain.project.business.dict.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.dict.domain.AccountType;
import com.coldchain.project.business.dict.service.IAccountTypeService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典-账号类别Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/dictAccountType")
public class AccountTypeController extends BaseController
{
    private String prefix = "business/dictAccountType";

    @Autowired
    private IAccountTypeService dictAccountTypeService;

    //("business:dict:view")
    @GetMapping()
    public String dictAccountType()
    {
        return prefix + "/dictAccountType";
    }

    /**
     * 查询字典-账号类别列表
     */
    //("business:dict:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AccountType accountType)
    {
        startPage();
        List<AccountType> list = dictAccountTypeService.selectAccountTypeList(accountType);
        return getDataTable(list);
    }

    /**
     * 导出字典-账号类别列表
     */
    //("business:dict:export")
    @Log(title = "字典-账号类别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AccountType accountType)
    {
        List<AccountType> list = dictAccountTypeService.selectAccountTypeList(accountType);
        ExcelUtil<AccountType> util = new ExcelUtil<AccountType>(AccountType.class);
        return util.exportExcel(list, "dictAccountType");
    }

    /**
     * 新增字典-账号类别
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典-账号类别
     */
    //("business:dict:add")
    @Log(title = "字典-账号类别", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AccountType accountType)
    {
        return toAjax(dictAccountTypeService.insertAccountType(accountType));
    }

    /**
     * 修改字典-账号类别
     */
    @GetMapping("/edit/{accountTypeId}")
    public String edit(@PathVariable("accountTypeId") Integer accountTypeId, ModelMap mmap)
    {
        AccountType accountType = dictAccountTypeService.selectAccountTypeById(accountTypeId);
        mmap.put("accountType", accountType);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典-账号类别
     */
    //("business:dict:edit")
    @Log(title = "字典-账号类别", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AccountType accountType)
    {
        return toAjax(dictAccountTypeService.updateAccountType(accountType));
    }

    /**
     * 删除字典-账号类别
     */
    //("business:dict:remove")
    @Log(title = "字典-账号类别", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictAccountTypeService.deleteAccountTypeByIds(ids));
    }
}
