package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.CurrencyType;
import com.coldchain.project.business.dict.mapper.CurrencyTypeMapper;
import com.coldchain.project.business.dict.service.ICurrencyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-货币类别Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class CurrencyTypeServiceImpl implements ICurrencyTypeService
{
    @Autowired
    private CurrencyTypeMapper currencyTypeMapper;

    /**
     * 查询字典-货币类别
     * 
     * @param currencyTypeId 字典-货币类别ID
     * @return 字典-货币类别
     */
    @Override
    public CurrencyType selectCurrencyTypeById(Integer currencyTypeId)
    {
        return currencyTypeMapper.selectCurrencyTypeById(currencyTypeId);
    }

    /**
     * 查询字典-货币类别列表
     * 
     * @param currencyType 字典-货币类别
     * @return 字典-货币类别
     */
    @Override
    public List<CurrencyType> selectCurrencyTypeList(CurrencyType currencyType)
    {
        return currencyTypeMapper.selectCurrencyTypeList(currencyType);
    }

    /**
     * 新增字典-货币类别
     * 
     * @param currencyType 字典-货币类别
     * @return 结果
     */
    @Override
    public int insertCurrencyType(CurrencyType currencyType)
    {
        currencyType.setCreateTime(DateUtils.getNowDate());
        return currencyTypeMapper.insertCurrencyType(currencyType);
    }

    /**
     * 修改字典-货币类别
     * 
     * @param currencyType 字典-货币类别
     * @return 结果
     */
    @Override
    public int updateCurrencyType(CurrencyType currencyType)
    {
        currencyType.setUpdateTime(DateUtils.getNowDate());
        return currencyTypeMapper.updateCurrencyType(currencyType);
    }

    /**
     * 删除字典-货币类别对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCurrencyTypeByIds(String ids)
    {
        return currencyTypeMapper.deleteCurrencyTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-货币类别信息
     * 
     * @param currencyTypeId 字典-货币类别ID
     * @return 结果
     */
    @Override
    public int deleteCurrencyTypeById(Integer currencyTypeId)
    {
        return currencyTypeMapper.deleteCurrencyTypeById(currencyTypeId);
    }
}
