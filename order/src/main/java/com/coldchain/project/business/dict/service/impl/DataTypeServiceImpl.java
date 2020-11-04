package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.DataType;
import com.coldchain.project.business.dict.mapper.DataTypeMapper;
import com.coldchain.project.business.dict.service.IDataTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-数据类别Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class DataTypeServiceImpl implements IDataTypeService {
    @Autowired
    private DataTypeMapper dataTypeMapper;

    /**
     * 查询字典-数据类别
     *
     * @param dataTypeId 字典-数据类别ID
     * @return 字典-数据类别
     */
    @Override
    public DataType selectDataTypeById(Integer dataTypeId) {
        return dataTypeMapper.selectDataTypeById(dataTypeId);
    }

    /**
     * 查询字典-数据类别列表
     *
     * @param dataType 字典-数据类别
     * @return 字典-数据类别
     */
    @Override
    public List<DataType> selectDataTypeList(DataType dataType) {
        return dataTypeMapper.selectDataTypeList(dataType);
    }

    /**
     * 新增字典-数据类别
     *
     * @param dataType 字典-数据类别
     * @return 结果
     */
    @Override
    public int insertDataType(DataType dataType) {
        dataType.setCreateTime(DateUtils.getNowDate());
        return dataTypeMapper.insertDataType(dataType);
    }

    /**
     * 修改字典-数据类别
     *
     * @param dataType 字典-数据类别
     * @return 结果
     */
    @Override
    public int updateDataType(DataType dataType) {
        dataType.setUpdateTime(DateUtils.getNowDate());
        return dataTypeMapper.updateDataType(dataType);
    }

    /**
     * 删除字典-数据类别对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDataTypeByIds(String ids) {
        return dataTypeMapper.deleteDataTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-数据类别信息
     *
     * @param dataTypeId 字典-数据类别ID
     * @return 结果
     */
    @Override
    public int deleteDataTypeById(Integer dataTypeId) {
        return dataTypeMapper.deleteDataTypeById(dataTypeId);
    }
}
