package com.coldchain.project.business.dict.service;

import com.coldchain.project.business.dict.domain.CurrencyType;

import java.util.List;

/**
 * 字典-货币类别Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface ICurrencyTypeService
{
    /**
     * 查询字典-货币类别
     * 
     * @param currencyTypeId 字典-货币类别ID
     * @return 字典-货币类别
     */
    public CurrencyType selectCurrencyTypeById(Integer currencyTypeId);

    /**
     * 查询字典-货币类别列表
     * 
     * @param currencyType 字典-货币类别
     * @return 字典-货币类别集合
     */
    public List<CurrencyType> selectCurrencyTypeList(CurrencyType currencyType);

    /**
     * 新增字典-货币类别
     * 
     * @param currencyType 字典-货币类别
     * @return 结果
     */
    public int insertCurrencyType(CurrencyType currencyType);

    /**
     * 修改字典-货币类别
     * 
     * @param currencyType 字典-货币类别
     * @return 结果
     */
    public int updateCurrencyType(CurrencyType currencyType);

    /**
     * 批量删除字典-货币类别
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCurrencyTypeByIds(String ids);

    /**
     * 删除字典-货币类别信息
     * 
     * @param currencyTypeId 字典-货币类别ID
     * @return 结果
     */
    public int deleteCurrencyTypeById(Integer currencyTypeId);
}
