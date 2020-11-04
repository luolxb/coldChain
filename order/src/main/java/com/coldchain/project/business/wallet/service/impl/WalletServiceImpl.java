package com.coldchain.project.business.wallet.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.wallet.domain.Wallet;
import com.coldchain.project.business.wallet.mapper.WalletMapper;
import com.coldchain.project.business.wallet.service.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 企业钱包Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class WalletServiceImpl implements IWalletService {
    @Autowired
    private WalletMapper walletMapper;

    /**
     * 查询企业钱包
     *
     * @param walletId 企业钱包ID
     * @return 企业钱包
     */
    @Override
    public Wallet selectWalletById(Long walletId) {
        return walletMapper.selectWalletById(walletId);
    }

    /**
     * 查询企业钱包列表
     *
     * @param wallet 企业钱包
     * @return 企业钱包
     */
    @Override
    public List<Wallet> selectWalletList(Wallet wallet) {
        return walletMapper.selectWalletList(wallet);
    }

    /**
     * 新增企业钱包
     *
     * @param wallet 企业钱包
     * @return 结果
     */
    @Override
    public int insertWallet(Wallet wallet) {
        wallet.setCreateTime(DateUtils.getNowDate());
        return walletMapper.insertWallet(wallet);
    }

    /**
     * 修改企业钱包
     *
     * @param wallet 企业钱包
     * @return 结果
     */
    @Override
    public int updateWallet(Wallet wallet) {
        wallet.setUpdateTime(DateUtils.getNowDate());
        return walletMapper.updateWallet(wallet);
    }

    /**
     * 删除企业钱包对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWalletByIds(String ids) {
        return walletMapper.deleteWalletByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业钱包信息
     *
     * @param walletId 企业钱包ID
     * @return 结果
     */
    @Override
    public int deleteWalletById(Long walletId) {
        return walletMapper.deleteWalletById(walletId);
    }

    /**
     * 根据企业ID查询企业钱包
     *
     * @param companyId 企业ID
     * @return 企业钱包
     */
    @Override
    public Wallet selectWalletByCompanyId(Long companyId) {
        return walletMapper.selectWalletByCompanyId(companyId);
    }

    /**
     * 删除企业信息
     *
     * @param companyIds
     * @return
     */
    @Override
    public int deleteWalletByCompanyIds(String[] companyIds) {
        return walletMapper.deleteWalletByCompanyIds(companyIds);
    }
}
