package com.coldchain.project.business.device.service;

import com.coldchain.project.business.device.domain.DeviceDataReport;

import java.util.List;

/**
 * 设备数据上报Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IDeviceDataReportService
{
    /**
     * 查询设备数据上报
     * 
     * @param deviceDataReportId 设备数据上报ID
     * @return 设备数据上报
     */
    public DeviceDataReport selectDeviceDataReportById(Long deviceDataReportId);

    /**
     * 查询设备数据上报列表
     * 
     * @param deviceDataReport 设备数据上报
     * @return 设备数据上报集合
     */
    public List<DeviceDataReport> selectDeviceDataReportList(DeviceDataReport deviceDataReport);

    /**
     * 新增设备数据上报
     * 
     * @param deviceDataReport 设备数据上报
     * @return 结果
     */
    public int insertDeviceDataReport(DeviceDataReport deviceDataReport);

    /**
     * 修改设备数据上报
     * 
     * @param deviceDataReport 设备数据上报
     * @return 结果
     */
    public int updateDeviceDataReport(DeviceDataReport deviceDataReport);

    /**
     * 批量删除设备数据上报
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceDataReportByIds(String ids);

    /**
     * 删除设备数据上报信息
     * 
     * @param deviceDataReportId 设备数据上报ID
     * @return 结果
     */
    public int deleteDeviceDataReportById(Long deviceDataReportId);

    /**
     * 根据设备SN查询最新一条数据
     *
     * @param deviceSn 设备SN
     * @return 结果
     */
    DeviceDataReport queryByDeviceSnLimit(String deviceSn);
}
