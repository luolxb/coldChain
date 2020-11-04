package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.DeviceType;
import com.coldchain.project.business.dict.mapper.DeviceTypeMapper;
import com.coldchain.project.business.dict.service.IDeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-设备类别Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class DeviceTypeServiceImpl implements IDeviceTypeService
{
    @Autowired
    private DeviceTypeMapper deviceTypeMapper;

    /**
     * 查询字典-设备类别
     * 
     * @param deviceTypeId 字典-设备类别ID
     * @return 字典-设备类别
     */
    @Override
    public DeviceType selectDeviceTypeById(Integer deviceTypeId)
    {
        return deviceTypeMapper.selectDeviceTypeById(deviceTypeId);
    }

    /**
     * 查询字典-设备类别列表
     * 
     * @param deviceType 字典-设备类别
     * @return 字典-设备类别
     */
    @Override
    public List<DeviceType> selectDeviceTypeList(DeviceType deviceType)
    {
        return deviceTypeMapper.selectDeviceTypeList(deviceType);
    }

    /**
     * 新增字典-设备类别
     * 
     * @param deviceType 字典-设备类别
     * @return 结果
     */
    @Override
    public int insertDeviceType(DeviceType deviceType)
    {
        deviceType.setCreateTime(DateUtils.getNowDate());
        return deviceTypeMapper.insertDeviceType(deviceType);
    }

    /**
     * 修改字典-设备类别
     * 
     * @param deviceType 字典-设备类别
     * @return 结果
     */
    @Override
    public int updateDeviceType(DeviceType deviceType)
    {
        deviceType.setUpdateTime(DateUtils.getNowDate());
        return deviceTypeMapper.updateDeviceType(deviceType);
    }

    /**
     * 删除字典-设备类别对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceTypeByIds(String ids)
    {
        return deviceTypeMapper.deleteDeviceTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-设备类别信息
     * 
     * @param deviceTypeId 字典-设备类别ID
     * @return 结果
     */
    @Override
    public int deleteDeviceTypeById(Integer deviceTypeId)
    {
        return deviceTypeMapper.deleteDeviceTypeById(deviceTypeId);
    }
}
