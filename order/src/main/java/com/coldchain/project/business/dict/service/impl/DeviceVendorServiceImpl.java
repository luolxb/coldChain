package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.DeviceVendor;
import com.coldchain.project.business.dict.mapper.DeviceVendorMapper;
import com.coldchain.project.business.dict.service.IDeviceVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-设备制造商Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class DeviceVendorServiceImpl implements IDeviceVendorService {
    @Autowired
    private DeviceVendorMapper deviceVendorMapper;

    /**
     * 查询字典-设备制造商
     *
     * @param deviceVendorId 字典-设备制造商ID
     * @return 字典-设备制造商
     */
    @Override
    public DeviceVendor selectDeviceVendorById(Integer deviceVendorId) {
        return deviceVendorMapper.selectDeviceVendorById(deviceVendorId);
    }

    /**
     * 查询字典-设备制造商列表
     *
     * @param deviceVendor 字典-设备制造商
     * @return 字典-设备制造商
     */
    @Override
    public List<DeviceVendor> selectDeviceVendorList(DeviceVendor deviceVendor) {
        return deviceVendorMapper.selectDeviceVendorList(deviceVendor);
    }

    /**
     * 新增字典-设备制造商
     *
     * @param deviceVendor 字典-设备制造商
     * @return 结果
     */
    @Override
    public int insertDeviceVendor(DeviceVendor deviceVendor) {
        deviceVendor.setCreateTime(DateUtils.getNowDate());
        return deviceVendorMapper.insertDeviceVendor(deviceVendor);
    }

    /**
     * 修改字典-设备制造商
     *
     * @param deviceVendor 字典-设备制造商
     * @return 结果
     */
    @Override
    public int updateDeviceVendor(DeviceVendor deviceVendor) {
        deviceVendor.setUpdateTime(DateUtils.getNowDate());
        return deviceVendorMapper.updateDeviceVendor(deviceVendor);
    }

    /**
     * 删除字典-设备制造商对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceVendorByIds(String ids) {
        return deviceVendorMapper.deleteDeviceVendorByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-设备制造商信息
     *
     * @param deviceVendorId 字典-设备制造商ID
     * @return 结果
     */
    @Override
    public int deleteDeviceVendorById(Integer deviceVendorId) {
        return deviceVendorMapper.deleteDeviceVendorById(deviceVendorId);
    }
}
