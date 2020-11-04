package com.coldchain.project.business.wallet.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.wallet.domain.WalletRecord;
import com.coldchain.project.business.wallet.service.IWalletRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 钱包交易记录Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/walletRecord")
public class WalletRecordController extends BaseController
{
    private String prefix = "business/walletRecord";

    @Autowired
    private IWalletRecordService walletRecordService;


    @GetMapping()
    public String walletRecord()
    {
        return prefix + "/walletRecord";
    }

    /**
     * 查询钱包交易记录列表
     */
    @PreAuthorize("hasAnyRole('USER')")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WalletRecord walletRecord)
    {
        startPage();
        List<WalletRecord> list = walletRecordService.selectWalletRecordList(walletRecord);
        return getDataTable(list);
    }

    /**
     * 导出钱包交易记录列表
     */
    @PreAuthorize("hasAnyRole('USER')")
    @Log(title = "钱包交易记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WalletRecord walletRecord)
    {
        List<WalletRecord> list = walletRecordService.selectWalletRecordList(walletRecord);
        ExcelUtil<WalletRecord> util = new ExcelUtil<WalletRecord>(WalletRecord.class);
        return util.exportExcel(list, "walletRecord");
    }

    /**
     * 新增钱包交易记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存钱包交易记录
     */
    @PreAuthorize("hasAnyRole('USER')")
    @Log(title = "钱包交易记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WalletRecord walletRecord)
    {
        return toAjax(walletRecordService.insertWalletRecord(walletRecord));
    }

    /**
     * 修改钱包交易记录
     */
    @GetMapping("/edit/{walletRecordId}")
    public String edit(@PathVariable("walletRecordId") Long walletRecordId, ModelMap mmap)
    {
        WalletRecord walletRecord = walletRecordService.selectWalletRecordById(walletRecordId);
        mmap.put("walletRecord", walletRecord);
        return prefix + "/edit";
    }

    /**
     * 修改保存钱包交易记录
     */
    @PreAuthorize("hasAnyRole('USER')")
    @Log(title = "钱包交易记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WalletRecord walletRecord)
    {
        return toAjax(walletRecordService.updateWalletRecord(walletRecord));
    }

    /**
     * 删除钱包交易记录
     */
    @PreAuthorize("hasAnyRole('USER')")
    @Log(title = "钱包交易记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(walletRecordService.deleteWalletRecordByIds(ids));
    }
}
