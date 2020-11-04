package com.coldchain.project.business.dict.service;

import com.coldchain.project.business.dict.domain.DeviceVendor;

import java.util.List;

/**
 * 字典-设备制造商Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IDeviceVendorService
{
    /**
     * 查询字典-设备制造商
     * 
     * @param deviceVendorId 字典-设备制造商ID
     * @return 字典-设备制造商
     */
    public DeviceVendor selectDeviceVendorById(Integer deviceVendorId);

    /**
     * 查询字典-设备制造商列表
     * 
     * @param deviceVendor 字典-设备制造商
     * @return 字典-设备制造商集合
     */
    public List<DeviceVendor> selectDeviceVendorList(DeviceVendor deviceVendor);

    /**
     * 新增字典-设备制造商
     * 
     * @param deviceVendor 字典-设备制造商
     * @return 结果
     */
    public int insertDeviceVendor(DeviceVendor deviceVendor);

    /**
     * 修改字典-设备制造商
     * 
     * @param deviceVendor 字典-设备制造商
     * @return 结果
     */
    public int updateDeviceVendor(DeviceVendor deviceVendor);

    /**
     * 批量删除字典-设备制造商
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceVendorByIds(String ids);

    /**
     * 删除字典-设备制造商信息
     * 
     * @param deviceVendorId 字典-设备制造商ID
     * @return 结果
     */
    public int deleteDeviceVendorById(Integer deviceVendorId);
}
