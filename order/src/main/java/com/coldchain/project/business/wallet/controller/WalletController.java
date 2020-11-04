package com.coldchain.project.business.wallet.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.wallet.domain.Wallet;
import com.coldchain.project.business.wallet.service.IWalletService;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 企业钱包Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/wallet")
public class WalletController extends BaseController
{
    private String prefix = "business/wallet";

    @Autowired
    private IWalletService walletService;

    //("business:wallet:view")
    @GetMapping()
    public String wallet()
    {
        return prefix + "/wallet";
    }

    /**
     * 查询企业钱包列表
     */
    //("business:wallet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Wallet wallet)
    {
        startPage();
        List<Wallet> list = walletService.selectWalletList(wallet);
        return getDataTable(list);
    }

    /**
     * 导出企业钱包列表
     */
    //("business:wallet:export")
    @Log(title = "企业钱包", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Wallet wallet)
    {
        List<Wallet> list = walletService.selectWalletList(wallet);
        ExcelUtil<Wallet> util = new ExcelUtil<Wallet>(Wallet.class);
        return util.exportExcel(list, "wallet");
    }

    /**
     * 新增企业钱包
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存企业钱包
     */
    //("business:wallet:add")
    @Log(title = "企业钱包", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Wallet wallet)
    {
        return toAjax(walletService.insertWallet(wallet));
    }

    /**
     * 修改企业钱包
     */
    @GetMapping("/edit/{walletId}")
    public String edit(@PathVariable("walletId") Long walletId, ModelMap mmap)
    {
        Wallet wallet = walletService.selectWalletById(walletId);
        mmap.put("wallet", wallet);
        return prefix + "/edit";
    }

    /**
     * 修改保存企业钱包
     */
    //("business:wallet:edit")
    @Log(title = "企业钱包", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Wallet wallet)
    {
        return toAjax(walletService.updateWallet(wallet));
    }

    /**
     * 删除企业钱包
     */
    //("business:wallet:remove")
    @Log(title = "企业钱包", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(walletService.deleteWalletByIds(ids));
    }
}
