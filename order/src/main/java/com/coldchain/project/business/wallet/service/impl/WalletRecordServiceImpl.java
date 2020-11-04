package com.coldchain.project.business.wallet.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.wallet.domain.WalletRecord;
import com.coldchain.project.business.wallet.mapper.WalletRecordMapper;
import com.coldchain.project.business.wallet.service.IWalletRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 钱包交易记录Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class WalletRecordServiceImpl implements IWalletRecordService
{
    @Autowired
    private WalletRecordMapper walletRecordMapper;

    /**
     * 查询钱包交易记录
     * 
     * @param walletRecordId 钱包交易记录ID
     * @return 钱包交易记录
     */
    @Override
    public WalletRecord selectWalletRecordById(Long walletRecordId)
    {
        return walletRecordMapper.selectWalletRecordById(walletRecordId);
    }

    /**
     * 查询钱包交易记录列表
     * 
     * @param walletRecord 钱包交易记录
     * @return 钱包交易记录
     */
    @Override
    public List<WalletRecord> selectWalletRecordList(WalletRecord walletRecord)
    {
        return walletRecordMapper.selectWalletRecordList(walletRecord);
    }

    /**
     * 新增钱包交易记录
     * 
     * @param walletRecord 钱包交易记录
     * @return 结果
     */
    @Override
    public int insertWalletRecord(WalletRecord walletRecord)
    {
        walletRecord.setCreateTime(DateUtils.getNowDate());
        return walletRecordMapper.insertWalletRecord(walletRecord);
    }

    /**
     * 修改钱包交易记录
     * 
     * @param walletRecord 钱包交易记录
     * @return 结果
     */
    @Override
    public int updateWalletRecord(WalletRecord walletRecord)
    {
        return walletRecordMapper.updateWalletRecord(walletRecord);
    }

    /**
     * 删除钱包交易记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWalletRecordByIds(String ids)
    {
        return walletRecordMapper.deleteWalletRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除钱包交易记录信息
     * 
     * @param walletRecordId 钱包交易记录ID
     * @return 结果
     */
    @Override
    public int deleteWalletRecordById(Long walletRecordId)
    {
        return walletRecordMapper.deleteWalletRecordById(walletRecordId);
    }
}
