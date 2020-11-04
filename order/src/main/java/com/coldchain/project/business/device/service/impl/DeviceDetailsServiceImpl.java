package com.coldchain.project.business.device.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.device.domain.DeviceDetails;
import com.coldchain.project.business.device.mapper.DeviceDetailsMapper;
import com.coldchain.project.business.device.service.IDeviceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备详情Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class DeviceDetailsServiceImpl implements IDeviceDetailsService {
    @Autowired
    private DeviceDetailsMapper deviceDetailsMapper;

    /**
     * 查询设备详情
     *
     * @param deviceDetailsId 设备详情ID
     * @return 设备详情
     */
    @Override
    public DeviceDetails selectDeviceDetailsById(Long deviceDetailsId) {
        return deviceDetailsMapper.selectDeviceDetailsById(deviceDetailsId);
    }

    /**
     * 查询设备详情列表
     *
     * @param deviceDetails 设备详情
     * @return 设备详情
     */
    @Override
    public List<DeviceDetails> selectDeviceDetailsList(DeviceDetails deviceDetails) {
        return deviceDetailsMapper.selectDeviceDetailsList(deviceDetails);
    }

    /**
     * 新增设备详情
     *
     * @param deviceDetails 设备详情
     * @return 结果
     */
    @Override
    public int insertDeviceDetails(DeviceDetails deviceDetails) {
        deviceDetails.setCreateTime(DateUtils.getNowDate());
        return deviceDetailsMapper.insertDeviceDetails(deviceDetails);
    }

    /**
     * 修改设备详情
     *
     * @param deviceDetails 设备详情
     * @return 结果
     */
    @Override
    public int updateDeviceDetails(DeviceDetails deviceDetails) {
        deviceDetails.setUpdateTime(DateUtils.getNowDate());
        return deviceDetailsMapper.updateDeviceDetails(deviceDetails);
    }

    /**
     * 删除设备详情对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceDetailsByIds(String ids) {
        return deviceDetailsMapper.deleteDeviceDetailsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备详情信息
     *
     * @param deviceDetailsId 设备详情ID
     * @return 结果
     */
    @Override
    public int deleteDeviceDetailsById(Long deviceDetailsId) {
        return deviceDetailsMapper.deleteDeviceDetailsById(deviceDetailsId);
    }

    /**
     * 根据设备ID查询
     *
     * @param deviceId 设备ID
     * @return 结果
     */
    @Override
    public DeviceDetails queryByDeviceId(Long deviceId) {
        return deviceDetailsMapper.queryByDeviceId(deviceId);
    }
}
