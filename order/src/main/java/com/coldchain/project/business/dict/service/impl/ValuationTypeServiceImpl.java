package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.ValuationType;
import com.coldchain.project.business.dict.mapper.ValuationTypeMapper;
import com.coldchain.project.business.dict.service.IValuationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-计价模式Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class ValuationTypeServiceImpl implements IValuationTypeService
{
    @Autowired
    private ValuationTypeMapper valuationTypeMapper;

    /**
     * 查询字典-计价模式
     * 
     * @param valuationTypeId 字典-计价模式ID
     * @return 字典-计价模式
     */
    @Override
    public ValuationType selectValuationTypeById(Integer valuationTypeId)
    {
        return valuationTypeMapper.selectValuationTypeById(valuationTypeId);
    }

    /**
     * 查询字典-计价模式列表
     * 
     * @param valuationType 字典-计价模式
     * @return 字典-计价模式
     */
    @Override
    public List<ValuationType> selectValuationTypeList(ValuationType valuationType)
    {
        return valuationTypeMapper.selectValuationTypeList(valuationType);
    }

    /**
     * 新增字典-计价模式
     * 
     * @param valuationType 字典-计价模式
     * @return 结果
     */
    @Override
    public int insertValuationType(ValuationType valuationType)
    {
        valuationType.setCreateTime(DateUtils.getNowDate());
        return valuationTypeMapper.insertValuationType(valuationType);
    }

    /**
     * 修改字典-计价模式
     * 
     * @param valuationType 字典-计价模式
     * @return 结果
     */
    @Override
    public int updateValuationType(ValuationType valuationType)
    {
        valuationType.setUpdateTime(DateUtils.getNowDate());
        return valuationTypeMapper.updateValuationType(valuationType);
    }

    /**
     * 删除字典-计价模式对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteValuationTypeByIds(String ids)
    {
        return valuationTypeMapper.deleteValuationTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-计价模式信息
     * 
     * @param valuationTypeId 字典-计价模式ID
     * @return 结果
     */
    @Override
    public int deleteValuationTypeById(Integer valuationTypeId)
    {
        return valuationTypeMapper.deleteValuationTypeById(valuationTypeId);
    }
}
