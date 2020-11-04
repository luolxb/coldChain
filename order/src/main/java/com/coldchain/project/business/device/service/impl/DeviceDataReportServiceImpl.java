package com.coldchain.project.business.device.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.device.domain.DeviceDataReport;
import com.coldchain.project.business.device.mapper.DeviceDataReportMapper;
import com.coldchain.project.business.device.service.IDeviceDataReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备数据上报Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class DeviceDataReportServiceImpl implements IDeviceDataReportService {
    @Autowired
    private DeviceDataReportMapper deviceDataReportMapper;

    /**
     * 查询设备数据上报
     *
     * @param deviceDataReportId 设备数据上报ID
     * @return 设备数据上报
     */
    @Override
    public DeviceDataReport selectDeviceDataReportById(Long deviceDataReportId) {
        return deviceDataReportMapper.selectDeviceDataReportById(deviceDataReportId);
    }

    /**
     * 查询设备数据上报列表
     *
     * @param deviceDataReport 设备数据上报
     * @return 设备数据上报
     */
    @Override
    public List<DeviceDataReport> selectDeviceDataReportList(DeviceDataReport deviceDataReport) {
        return deviceDataReportMapper.selectDeviceDataReportList(deviceDataReport);
    }

    /**
     * 新增设备数据上报
     *
     * @param deviceDataReport 设备数据上报
     * @return 结果
     */
    @Override
    public int insertDeviceDataReport(DeviceDataReport deviceDataReport) {
        deviceDataReport.setCreateTime(DateUtils.getNowDate());
        return deviceDataReportMapper.insertDeviceDataReport(deviceDataReport);
    }

    /**
     * 修改设备数据上报
     *
     * @param deviceDataReport 设备数据上报
     * @return 结果
     */
    @Override
    public int updateDeviceDataReport(DeviceDataReport deviceDataReport) {
        return deviceDataReportMapper.updateDeviceDataReport(deviceDataReport);
    }

    /**
     * 删除设备数据上报对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceDataReportByIds(String ids) {
        return deviceDataReportMapper.deleteDeviceDataReportByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备数据上报信息
     *
     * @param deviceDataReportId 设备数据上报ID
     * @return 结果
     */
    @Override
    public int deleteDeviceDataReportById(Long deviceDataReportId) {
        return deviceDataReportMapper.deleteDeviceDataReportById(deviceDataReportId);
    }

    /**
     * 根据设备SN查询最新一条数据
     *
     * @param deviceSn 设备SN
     * @return 结果
     */
    @Override
    public DeviceDataReport queryByDeviceSnLimit(String deviceSn) {
        return deviceDataReportMapper.queryByDeviceSnLimit(deviceSn);
    }
}
