package com.coldchain.project.business.dict.service;

import com.coldchain.project.business.dict.domain.DataType;

import java.util.List;

/**
 * 字典-数据类别Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IDataTypeService
{
    /**
     * 查询字典-数据类别
     * 
     * @param dataTypeId 字典-数据类别ID
     * @return 字典-数据类别
     */
    public DataType selectDataTypeById(Integer dataTypeId);

    /**
     * 查询字典-数据类别列表
     * 
     * @param dataType 字典-数据类别
     * @return 字典-数据类别集合
     */
    public List<DataType> selectDataTypeList(DataType dataType);

    /**
     * 新增字典-数据类别
     * 
     * @param dataType 字典-数据类别
     * @return 结果
     */
    public int insertDataType(DataType dataType);

    /**
     * 修改字典-数据类别
     * 
     * @param dataType 字典-数据类别
     * @return 结果
     */
    public int updateDataType(DataType dataType);

    /**
     * 批量删除字典-数据类别
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDataTypeByIds(String ids);

    /**
     * 删除字典-数据类别信息
     * 
     * @param dataTypeId 字典-数据类别ID
     * @return 结果
     */
    public int deleteDataTypeById(Integer dataTypeId);
}
