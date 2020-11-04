package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.DeviceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-设备类别Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface DeviceTypeMapper
{
    /**
     * 查询字典-设备类别
     * 
     * @param deviceTypeId 字典-设备类别ID
     * @return 字典-设备类别
     */
    public DeviceType selectDeviceTypeById(@Param("deviceTypeId") Integer deviceTypeId);

    /**
     * 查询字典-设备类别列表
     * 
     * @param deviceType 字典-设备类别
     * @return 字典-设备类别集合
     */
    public List<DeviceType> selectDeviceTypeList(DeviceType deviceType);

    /**
     * 新增字典-设备类别
     * 
     * @param deviceType 字典-设备类别
     * @return 结果
     */
    public int insertDeviceType(DeviceType deviceType);

    /**
     * 修改字典-设备类别
     * 
     * @param deviceType 字典-设备类别
     * @return 结果
     */
    public int updateDeviceType(DeviceType deviceType);

    /**
     * 删除字典-设备类别
     * 
     * @param deviceTypeId 字典-设备类别ID
     * @return 结果
     */
    public int deleteDeviceTypeById(@Param("deviceTypeId") Integer deviceTypeId);

    /**
     * 批量删除字典-设备类别
     * 
     * @param deviceTypeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceTypeByIds(String[] deviceTypeIds);
}
