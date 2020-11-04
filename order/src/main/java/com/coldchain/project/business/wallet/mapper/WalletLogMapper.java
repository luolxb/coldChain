package com.coldchain.project.business.wallet.mapper;

import com.coldchain.project.business.wallet.domain.WalletLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 钱包变动日志Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface WalletLogMapper
{
    /**
     * 查询钱包变动日志
     * 
     * @param walletLogId 钱包变动日志ID
     * @return 钱包变动日志
     */
    public WalletLog selectWalletLogById(@Param("walletLogId") Long walletLogId);

    /**
     * 查询钱包变动日志列表
     * 
     * @param walletLog 钱包变动日志
     * @return 钱包变动日志集合
     */
    public List<WalletLog> selectWalletLogList(WalletLog walletLog);

    /**
     * 新增钱包变动日志
     * 
     * @param walletLog 钱包变动日志
     * @return 结果
     */
    public int insertWalletLog(WalletLog walletLog);

    /**
     * 修改钱包变动日志
     * 
     * @param walletLog 钱包变动日志
     * @return 结果
     */
    public int updateWalletLog(WalletLog walletLog);

    /**
     * 删除钱包变动日志
     * 
     * @param walletLogId 钱包变动日志ID
     * @return 结果
     */
    public int deleteWalletLogById(@Param("walletLogId") Long walletLogId);

    /**
     * 批量删除钱包变动日志
     * 
     * @param walletLogIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWalletLogByIds(String[] walletLogIds);
}
