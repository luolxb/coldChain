package com.coldchain.project.business.device.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.device.domain.DeviceFlowDetails;
import com.coldchain.project.business.device.mapper.DeviceFlowDetailsMapper;
import com.coldchain.project.business.device.service.IDeviceFlowDetailsService;
import com.coldchain.project.business.device.vo.DeviceFlowDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设备流量日志统计Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class DeviceFlowDetailsServiceImpl implements IDeviceFlowDetailsService {
    @Autowired
    private DeviceFlowDetailsMapper deviceFlowDetailsMapper;

    /**
     * 查询设备流量日志统计
     *
     * @param deviceFlowDetailsId 设备流量日志统计ID
     * @return 设备流量日志统计
     */
    @Override
    public DeviceFlowDetails selectDeviceFlowDetailsById(Long deviceFlowDetailsId) {
        return deviceFlowDetailsMapper.selectDeviceFlowDetailsById(deviceFlowDetailsId);
    }

    /**
     * 查询设备流量日志统计列表
     *
     * @param deviceFlowDetails 设备流量日志统计
     * @return 设备流量日志统计
     */
    @Override
    public List<DeviceFlowDetails> selectDeviceFlowDetailsList(DeviceFlowDetails deviceFlowDetails) {
        return deviceFlowDetailsMapper.selectDeviceFlowDetailsList(deviceFlowDetails);
    }

    /**
     * 新增设备流量日志统计
     *
     * @param deviceFlowDetails 设备流量日志统计
     * @return 结果
     */
    @Override
    public int insertDeviceFlowDetails(DeviceFlowDetails deviceFlowDetails) {
        deviceFlowDetails.setCreateTime(DateUtils.getNowDate());
        return deviceFlowDetailsMapper.insertDeviceFlowDetails(deviceFlowDetails);
    }

    /**
     * 修改设备流量日志统计
     *
     * @param deviceFlowDetails 设备流量日志统计
     * @return 结果
     */
    @Override
    public int updateDeviceFlowDetails(DeviceFlowDetails deviceFlowDetails) {
        return deviceFlowDetailsMapper.updateDeviceFlowDetails(deviceFlowDetails);
    }

    /**
     * 删除设备流量日志统计对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceFlowDetailsByIds(String ids) {
        return deviceFlowDetailsMapper.deleteDeviceFlowDetailsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备流量日志统计信息
     *
     * @param deviceFlowDetailsId 设备流量日志统计ID
     * @return 结果
     */
    @Override
    public int deleteDeviceFlowDetailsById(Long deviceFlowDetailsId) {
        return deviceFlowDetailsMapper.deleteDeviceFlowDetailsById(deviceFlowDetailsId);
    }

    /**
     * 批量新增设备流量日志统计
     *
     * @param deviceFlowDetailsList 设备流量日志统计列表
     * @return 结果
     */
    @Override
    public int addDeviceFlowDetails(List<DeviceFlowDetails> deviceFlowDetailsList) {
        return deviceFlowDetailsMapper.addDeviceFlowDetails(deviceFlowDetailsList);
    }

    /**
     * 根据订阅ID(设备SN)，开始日期和结束日期查询设备流量日志详情列表
     *
     * @param subscriberId 订阅ID(设备SN)
     * @param startDate    起始日期 年月日 2019-12-09
     * @param overDate     截止日期 年月日 2019-12-09
     * @return 设备流量日志详情集合
     */
    @Override
    public List<DeviceFlowDetailsVo> queryFlowDetailsList(Long companyId, String subscriberId, String startDate, String overDate) {
        return deviceFlowDetailsMapper.queryFlowDetailsList(companyId, subscriberId, startDate, overDate);
    }
}
