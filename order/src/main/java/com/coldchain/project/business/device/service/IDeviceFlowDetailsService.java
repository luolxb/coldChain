package com.coldchain.project.business.device.service;

import com.coldchain.project.business.device.domain.DeviceFlowDetails;
import com.coldchain.project.business.device.vo.DeviceFlowDetailsVo;

import java.util.List;

/**
 * 设备流量日志详情Service接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface IDeviceFlowDetailsService {
    /**
     * 查询设备流量日志详情
     *
     * @param deviceFlowDetailsId 设备流量日志详情ID
     * @return 设备流量日志详情
     */
    public DeviceFlowDetails selectDeviceFlowDetailsById(Long deviceFlowDetailsId);

    /**
     * 查询设备流量日志详情列表
     *
     * @param deviceFlowDetails 设备流量日志详情
     * @return 设备流量日志详情集合
     */
    public List<DeviceFlowDetails> selectDeviceFlowDetailsList(DeviceFlowDetails deviceFlowDetails);

    /**
     * 新增设备流量日志详情
     *
     * @param deviceFlowDetails 设备流量日志详情
     * @return 结果
     */
    public int insertDeviceFlowDetails(DeviceFlowDetails deviceFlowDetails);

    /**
     * 修改设备流量日志详情
     *
     * @param deviceFlowDetails 设备流量日志详情
     * @return 结果
     */
    public int updateDeviceFlowDetails(DeviceFlowDetails deviceFlowDetails);

    /**
     * 批量删除设备流量日志详情
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceFlowDetailsByIds(String ids);

    /**
     * 删除设备流量日志详情信息
     *
     * @param deviceFlowDetailsId 设备流量日志详情ID
     * @return 结果
     */
    public int deleteDeviceFlowDetailsById(Long deviceFlowDetailsId);

    /**
     * 批量新增设备流量日志详情
     *
     * @param deviceFlowDetailsList 设备流量日志详情列表
     * @return 结果
     */
    int addDeviceFlowDetails(List<DeviceFlowDetails> deviceFlowDetailsList);

    /**
     * 根据订阅ID(设备SN)，开始日期和结束日期查询设备流量日志详情列表
     *
     * @param subscriberId 订阅ID(设备SN)
     * @param startDate    起始日期 年月日 2019-12-09
     * @param overDate     截止日期 年月日 2019-12-09
     * @return 设备流量日志详情集合
     */
    List<DeviceFlowDetailsVo> queryFlowDetailsList(Long companyId, String subscriberId, String startDate, String overDate);
}
