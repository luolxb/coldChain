package com.coldchain.project.business.device.service;

import com.coldchain.project.business.card.domain.Index4GStaUseDataVo;
import com.coldchain.project.business.device.domain.CompanyFlowDetailVo;
import com.coldchain.project.business.device.domain.DeviceFlowAgg;
import com.coldchain.project.business.device.vo.FlowAggListVo;
import com.coldchain.project.business.device.vo.FlowAggSumVo;

import java.text.ParseException;
import java.util.List;

/**
 * 设备流量日志统计Service接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface IDeviceFlowAggService {
    /**
     * 查询设备流量日志统计
     *
     * @param deviceFlowAggId 设备流量日志统计ID
     * @return 设备流量日志统计
     */
    public DeviceFlowAgg selectDeviceFlowAggById(Long deviceFlowAggId);

    /**
     * 查询设备流量日志统计列表
     *
     * @param deviceFlowAgg 设备流量日志统计
     * @return 设备流量日志统计集合
     */
    public List<DeviceFlowAgg> selectDeviceFlowAggList(DeviceFlowAgg deviceFlowAgg);

    /**
     * 新增设备流量日志统计
     *
     * @param deviceFlowAgg 设备流量日志统计
     * @return 结果
     */
    public int insertDeviceFlowAgg(DeviceFlowAgg deviceFlowAgg);

    /**
     * 修改设备流量日志统计
     *
     * @param deviceFlowAgg 设备流量日志统计
     * @return 结果
     */
    public int updateDeviceFlowAgg(DeviceFlowAgg deviceFlowAgg);

    /**
     * 批量删除设备流量日志统计
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceFlowAggByIds(String ids);

    /**
     * 删除设备流量日志统计信息
     *
     * @param deviceFlowAggId 设备流量日志统计ID
     * @return 结果
     */
    public int deleteDeviceFlowAggById(Long deviceFlowAggId);

    /**
     * 根据流量统计列表
     *
     * @param deviceSn  设备SN
     * @param companyId 公司ID
     * @return 结果
     */
    List<FlowAggListVo> queryFlowAggList(String deviceSn, Long companyId);

    /**
     * 批量新增设备流量日志统计
     *
     * @param deviceFlowAggList 设备流量日志统计列表
     * @return 结果
     */
    int addDeviceFlowAgg(List<DeviceFlowAgg> deviceFlowAggList);

    /**
     * 查询流量统计累计
     *
     * @param subscriberId 设备SN
     * @param startDate    起始日期
     * @param overDate     截止日期
     * @return 结果
     */
    List<FlowAggSumVo> queryFlowAggSum(String subscriberId, String startDate, String overDate, Long companyId);

    /**
     * 根据订阅ID(设备SN）流量统计日志列表
     *
     * @param subscriberId 设备SN
     * @param startDate    起始日期
     * @param overDate     截止日期
     * @return 结果
     */
    List<FlowAggSumVo> queryFlowAggSumLog(String subscriberId, String startDate, String overDate);

    /**
     * 获取4G卫星流量使用
     *
     * @param userId
     * @return
     */
    List<Index4GStaUseDataVo> get4GSatUseData(Long userId) throws ParseException;

    /**
     * 获取4G卫星流量使用详情
     *
     * @param deviceSn
     * @return
     */
    List<Index4GStaUseDataVo> get4GSatUseFlow(String deviceSn, Long companyId) throws ParseException;

    List<FlowAggSumVo> get4GSatUseFlow2(String deviceSn, Long companyId);

    /**
     * 获取企业流量详情
     *
     * @param companyId
     * @return
     */
    List<Index4GStaUseDataVo> getCompanyFlowDetail(String companyId) throws ParseException;

    /**
     * 获取企业流量详情
     *
     * @param companyId
     * @return
     */
    CompanyFlowDetailVo getCompanyFlowDetail2(String companyId);
}
