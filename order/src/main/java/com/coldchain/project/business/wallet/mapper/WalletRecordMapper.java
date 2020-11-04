package com.coldchain.project.business.wallet.mapper;

import com.coldchain.project.business.wallet.domain.WalletRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 钱包交易记录Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface WalletRecordMapper
{
    /**
     * 查询钱包交易记录
     * 
     * @param walletRecordId 钱包交易记录ID
     * @return 钱包交易记录
     */
    public WalletRecord selectWalletRecordById(@Param("walletRecordId") Long walletRecordId);

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
     * 删除钱包交易记录
     * 
     * @param walletRecordId 钱包交易记录ID
     * @return 结果
     */
    public int deleteWalletRecordById(@Param("walletRecordId") Long walletRecordId);

    /**
     * 批量删除钱包交易记录
     * 
     * @param walletRecordIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWalletRecordByIds(String[] walletRecordIds);
}
