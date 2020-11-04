package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.CurrencyType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-货币类别Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface CurrencyTypeMapper
{
    /**
     * 查询字典-货币类别
     * 
     * @param currencyTypeId 字典-货币类别ID
     * @return 字典-货币类别
     */
    public CurrencyType selectCurrencyTypeById(@Param("currencyTypeId") Integer currencyTypeId);

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
     * 删除字典-货币类别
     * 
     * @param currencyTypeId 字典-货币类别ID
     * @return 结果
     */
    public int deleteCurrencyTypeById(@Param("currencyTypeId") Integer currencyTypeId);

    /**
     * 批量删除字典-货币类别
     * 
     * @param currencyTypeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCurrencyTypeByIds(String[] currencyTypeIds);
}
