package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.AccountType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-账号类别Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface AccountTypeMapper
{
    /**
     * 查询字典-账号类别
     * 
     * @param accountTypeId 字典-账号类别ID
     * @return 字典-账号类别
     */
    public AccountType selectAccountTypeById(@Param("accountTypeId") Integer accountTypeId);

    /**
     * 查询字典-账号类别列表
     * 
     * @param accountType 字典-账号类别
     * @return 字典-账号类别集合
     */
    public List<AccountType> selectAccountTypeList(AccountType accountType);

    /**
     * 新增字典-账号类别
     * 
     * @param accountType 字典-账号类别
     * @return 结果
     */
    public int insertAccountType(AccountType accountType);

    /**
     * 修改字典-账号类别
     * 
     * @param accountType 字典-账号类别
     * @return 结果
     */
    public int updateAccountType(AccountType accountType);

    /**
     * 删除字典-账号类别
     * 
     * @param accountTypeId 字典-账号类别ID
     * @return 结果
     */
    public int deleteAccountTypeById(@Param("accountTypeId") Integer accountTypeId);

    /**
     * 批量删除字典-账号类别
     * 
     * @param accountTypeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteAccountTypeByIds(String[] accountTypeIds);
}
