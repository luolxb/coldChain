package com.coldchain.project.business.wallet.service;

import com.coldchain.project.business.wallet.domain.WalletRecord;

import java.util.List;

/**
 * 钱包交易记录Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IWalletRecordService
{
    /**
     * 查询钱包交易记录
     * 
     * @param walletRecordId 钱包交易记录ID
     * @return 钱包交易记录
     */
    public WalletRecord selectWalletRecordById(Long walletRecordId);

    /**
     * 查询钱包交易记录列表
     * 
     * @param walletRecord 钱包交易记录
     * @return 钱包交易记录集合
     */
    public List<WalletRecord> selectWalletRecordList(WalletRecord walletRecord);

    /**
     * 新增钱包交易记录
     * 
     * @param walletRecord 钱包交易记录
     * @return 结果
     */
    public int insertWalletRecord(WalletRecord walletRecord);

    /**
     * 修改钱包交易记录
     * 
     * @param walletRecord 钱包交易记录
     * @return 结果
     */
    public int updateWalletRecord(WalletRecord walletRecord);

    /**
     * 批量删除钱包交易记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWalletRecordByIds(String ids);

    /**
     * 删除钱包交易记录信息
     * 
     * @param walletRecordId 钱包交易记录ID
     * @return 结果
     */
    public int deleteWalletRecordById(Long walletRecordId);
}
