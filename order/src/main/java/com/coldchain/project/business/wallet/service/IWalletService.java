package com.coldchain.project.business.wallet.service;

import com.coldchain.project.business.wallet.domain.Wallet;

import java.util.List;

/**
 * 企业钱包Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IWalletService
{
    /**
     * 查询企业钱包
     * 
     * @param walletId 企业钱包ID
     * @return 企业钱包
     */
    public Wallet selectWalletById(Long walletId);

    /**
     * 查询企业钱包列表
     * 
     * @param wallet 企业钱包
     * @return 企业钱包集合
     */
    public List<Wallet> selectWalletList(Wallet wallet);

    /**
     * 新增企业钱包
     * 
     * @param wallet 企业钱包
     * @return 结果
     */
    public int insertWallet(Wallet wallet);

    /**
     * 修改企业钱包
     * 
     * @param wallet 企业钱包
     * @return 结果
     */
    public int updateWallet(Wallet wallet);

    /**
     * 批量删除企业钱包
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWalletByIds(String ids);

    /**
     * 删除企业钱包信息
     * 
     * @param walletId 企业钱包ID
     * @return 结果
     */
    public int deleteWalletById(Long walletId);

    /**
     * 根据企业ID查询企业钱包
     *
     * @param companyId 企业ID
     * @return 企业钱包
     */
    Wallet selectWalletByCompanyId(Long companyId);

    int deleteWalletByCompanyIds(String[] companyIds);
}
