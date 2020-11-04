package com.coldchain.project.business.wallet.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.wallet.domain.WalletLog;
import com.coldchain.project.business.wallet.mapper.WalletLogMapper;
import com.coldchain.project.business.wallet.service.IWalletLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 钱包变动日志Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class WalletLogServiceImpl implements IWalletLogService
{
    @Autowired
    private WalletLogMapper walletLogMapper;

    /**
     * 查询钱包变动日志
     * 
     * @param walletLogId 钱包变动日志ID
     * @return 钱包变动日志
     */
    @Override
    public WalletLog selectWalletLogById(Long walletLogId)
    {
        return walletLogMapper.selectWalletLogById(walletLogId);
    }

    /**
     * 查询钱包变动日志列表
     * 
     * @param walletLog 钱包变动日志
     * @return 钱包变动日志
     */
    @Override
    public List<WalletLog> selectWalletLogList(WalletLog walletLog)
    {
        return walletLogMapper.selectWalletLogList(walletLog);
    }

    /**
     * 新增钱包变动日志
     * 
     * @param walletLog 钱包变动日志
     * @return 结果
     */
    @Override
    public int insertWalletLog(WalletLog walletLog)
    {
        walletLog.setCreateTime(DateUtils.getNowDate());
        return walletLogMapper.insertWalletLog(walletLog);
    }

    /**
     * 修改钱包变动日志
     * 
     * @param walletLog 钱包变动日志
     * @return 结果
     */
    @Override
    public int updateWalletLog(WalletLog walletLog)
    {
        return walletLogMapper.updateWalletLog(walletLog);
    }

    /**
     * 删除钱包变动日志对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWalletLogByIds(String ids)
    {
        return walletLogMapper.deleteWalletLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除钱包变动日志信息
     * 
     * @param walletLogId 钱包变动日志ID
     * @return 结果
     */
    @Override
    public int deleteWalletLogById(Long walletLogId)
    {
        return walletLogMapper.deleteWalletLogById(walletLogId);
    }
}
