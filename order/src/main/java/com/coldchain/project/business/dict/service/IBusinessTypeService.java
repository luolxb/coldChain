package com.coldchain.project.business.dict.service;

import com.coldchain.project.business.dict.domain.BusinessType;

import java.util.List;

/**
 * 字典-业务类别Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IBusinessTypeService
{
    /**
     * 查询字典-业务类别
     * 
     * @param businessTypeId 字典-业务类别ID
     * @return 字典-业务类别
     */
    public BusinessType selectBusinessTypeById(Integer businessTypeId);

    /**
     * 查询字典-业务类别列表
     * 
     * @param businessType 字典-业务类别
     * @return 字典-业务类别集合
     */
    public List<BusinessType> selectBusinessTypeList(BusinessType businessType);

    /**
     * 新增字典-业务类别
     * 
     * @param businessType 字典-业务类别
     * @return 结果
     */
    public int insertBusinessType(BusinessType businessType);

    /**
     * 修改字典-业务类别
     * 
     * @param businessType 字典-业务类别
     * @return 结果
     */
    public int updateBusinessType(BusinessType businessType);

    /**
     * 批量删除字典-业务类别
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusinessTypeByIds(String ids);

    /**
     * 删除字典-业务类别信息
     * 
     * @param businessTypeId 字典-业务类别ID
     * @return 结果
     */
    public int deleteBusinessTypeById(Integer businessTypeId);
}
