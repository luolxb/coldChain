package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.BusinessType;
import com.coldchain.project.business.dict.mapper.BusinessTypeMapper;
import com.coldchain.project.business.dict.service.IBusinessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-业务类别Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class BusinessTypeServiceImpl implements IBusinessTypeService
{
    @Autowired
    private BusinessTypeMapper businessTypeMapper;

    /**
     * 查询字典-业务类别
     * 
     * @param businessTypeId 字典-业务类别ID
     * @return 字典-业务类别
     */
    @Override
    public BusinessType selectBusinessTypeById(Integer businessTypeId)
    {
        return businessTypeMapper.selectBusinessTypeById(businessTypeId);
    }

    /**
     * 查询字典-业务类别列表
     * 
     * @param businessType 字典-业务类别
     * @return 字典-业务类别
     */
    @Override
    public List<BusinessType> selectBusinessTypeList(BusinessType businessType)
    {
        return businessTypeMapper.selectBusinessTypeList(businessType);
    }

    /**
     * 新增字典-业务类别
     * 
     * @param businessType 字典-业务类别
     * @return 结果
     */
    @Override
    public int insertBusinessType(BusinessType businessType)
    {
        businessType.setCreateTime(DateUtils.getNowDate());
        return businessTypeMapper.insertBusinessType(businessType);
    }

    /**
     * 修改字典-业务类别
     * 
     * @param businessType 字典-业务类别
     * @return 结果
     */
    @Override
    public int updateBusinessType(BusinessType businessType)
    {
        businessType.setUpdateTime(DateUtils.getNowDate());
        return businessTypeMapper.updateBusinessType(businessType);
    }

    /**
     * 删除字典-业务类别对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBusinessTypeByIds(String ids)
    {
        return businessTypeMapper.deleteBusinessTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-业务类别信息
     * 
     * @param businessTypeId 字典-业务类别ID
     * @return 结果
     */
    @Override
    public int deleteBusinessTypeById(Integer businessTypeId)
    {
        return businessTypeMapper.deleteBusinessTypeById(businessTypeId);
    }
}
