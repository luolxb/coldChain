package com.coldchain.project.business.wallet.controller;

import com.coldchain.common.utils.poi.ExcelUtil;
import com.coldchain.framework.aspectj.lang.annotation.Log;
import com.coldchain.framework.aspectj.lang.enums.BusinessType;
import com.coldchain.framework.web.controller.BaseController;
import com.coldchain.framework.web.domain.AjaxResult;
import com.coldchain.framework.web.page.TableDataInfo;
import com.coldchain.project.business.wallet.domain.WalletLog;
import com.coldchain.project.business.wallet.service.IWalletLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 钱包变动日志Controller
 * 
 * @author nts
 * @date 2019-11-23
 */
@Controller
@RequestMapping("/business/walletLog")
public class WalletLogController extends BaseController
{
    private String prefix = "business/walletLog";

    @Autowired
    private IWalletLogService walletLogService;


    @GetMapping()
    public String walletLog()
    {
        return prefix + "/walletLog";
    }

    /**
     * 查询钱包变动日志列表
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WalletLog walletLog)
    {
        startPage();
        List<WalletLog> list = walletLogService.selectWalletLogList(walletLog);
        return getDataTable(list);
    }

    /**
     * 导出钱包变动日志列表
     */
    @Log(title = "钱包变动日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WalletLog walletLog)
    {
        List<WalletLog> list = walletLogService.selectWalletLogList(walletLog);
        ExcelUtil<WalletLog> util = new ExcelUtil<WalletLog>(WalletLog.class);
        return util.exportExcel(list, "walletLog");
    }

    /**
     * 新增钱包变动日志
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存钱包变动日志
     */

    @Log(title = "钱包变动日志", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WalletLog walletLog)
    {
        return toAjax(walletLogService.insertWalletLog(walletLog));
    }

    /**
     * 修改钱包变动日志
     */
    @GetMapping("/edit/{walletLogId}")
    public String edit(@PathVariable("walletLogId") Long walletLogId, ModelMap mmap)
    {
        WalletLog walletLog = walletLogService.selectWalletLogById(walletLogId);
        mmap.put("walletLog", walletLog);
        return prefix + "/edit";
    }

    /**
     * 修改保存钱包变动日志
     */

    @Log(title = "钱包变动日志", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WalletLog walletLog)
    {
        return toAjax(walletLogService.updateWalletLog(walletLog));
    }

    /**
     * 删除钱包变动日志
     */
    @Log(title = "钱包变动日志", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(walletLogService.deleteWalletLogByIds(ids));
    }
}
