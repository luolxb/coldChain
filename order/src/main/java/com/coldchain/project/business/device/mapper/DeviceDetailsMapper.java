package com.coldchain.project.business.device.mapper;

import com.coldchain.project.business.device.domain.DeviceDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备详情Mapper接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface DeviceDetailsMapper {
    /**
     * 查询设备详情
     *
     * @param deviceDetailsId 设备详情ID
     * @return 设备详情
     */
    public DeviceDetails selectDeviceDetailsById(@Param("deviceDetailsId") Long deviceDetailsId);

    /**
     * 查询设备详情列表
     *
     * @param deviceDetails 设备详情
     * @return 设备详情集合
     */
    public List<DeviceDetails> selectDeviceDetailsList(DeviceDetails deviceDetails);

    /**
     * 新增设备详情
     *
     * @param deviceDetails 设备详情
     * @return 结果
     */
    public int insertDeviceDetails(DeviceDetails deviceDetails);

    /**
     * 修改设备详情
     *
     * @param deviceDetails 设备详情
     * @return 结果
     */
    public int updateDeviceDetails(DeviceDetails deviceDetails);

    /**
     * 删除设备详情
     *
     * @param deviceDetailsId 设备详情ID
     * @return 结果
     */
    public int deleteDeviceDetailsById(@Param("deviceDetailsId") Long deviceDetailsId);

    /**
     * 批量删除设备详情
     *
     * @param deviceDetailsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceDetailsByIds(String[] deviceDetailsIds);

    /**
     * 根据设备ID查询
     *
     * @param deviceId 设备ID
     * @return 结果
     */
    DeviceDetails queryByDeviceId(@Param("deviceId") Long deviceId);
}
