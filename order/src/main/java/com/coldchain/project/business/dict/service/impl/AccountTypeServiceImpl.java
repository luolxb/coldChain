package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.AccountType;
import com.coldchain.project.business.dict.mapper.AccountTypeMapper;
import com.coldchain.project.business.dict.service.IAccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-账号类别Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class AccountTypeServiceImpl implements IAccountTypeService
{
    @Autowired
    private AccountTypeMapper accountTypeMapper;

    /**
     * 查询字典-账号类别
     * 
     * @param accountTypeId 字典-账号类别ID
     * @return 字典-账号类别
     */
    @Override
    public AccountType selectAccountTypeById(Integer accountTypeId)
    {
        return accountTypeMapper.selectAccountTypeById(accountTypeId);
    }

    /**
     * 查询字典-账号类别列表
     * 
     * @param accountType 字典-账号类别
     * @return 字典-账号类别
     */
    @Override
    public List<AccountType> selectAccountTypeList(AccountType accountType)
    {
        return accountTypeMapper.selectAccountTypeList(accountType);
    }

    /**
     * 新增字典-账号类别
     * 
     * @param accountType 字典-账号类别
     * @return 结果
     */
    @Override
    public int insertAccountType(AccountType accountType)
    {
        accountType.setCreateTime(DateUtils.getNowDate());
        return accountTypeMapper.insertAccountType(accountType);
    }

    /**
     * 修改字典-账号类别
     * 
     * @param accountType 字典-账号类别
     * @return 结果
     */
    @Override
    public int updateAccountType(AccountType accountType)
    {
        accountType.setUpdateTime(DateUtils.getNowDate());
        return accountTypeMapper.updateAccountType(accountType);
    }

    /**
     * 删除字典-账号类别对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAccountTypeByIds(String ids)
    {
        return accountTypeMapper.deleteAccountTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-账号类别信息
     * 
     * @param accountTypeId 字典-账号类别ID
     * @return 结果
     */
    @Override
    public int deleteAccountTypeById(Integer accountTypeId)
    {
        return accountTypeMapper.deleteAccountTypeById(accountTypeId);
    }
}
