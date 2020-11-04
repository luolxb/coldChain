package com.coldchain.project.business.device.mapper;

import com.coldchain.project.business.card.domain.Index4GStaUseDataVo;
import com.coldchain.project.business.device.domain.CompanyFlowDetailVo;
import com.coldchain.project.business.device.domain.DeviceFlowAgg;
import com.coldchain.project.business.device.vo.FlowAggListVo;
import com.coldchain.project.business.device.vo.FlowAggSumVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备流量日志统计Mapper接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface DeviceFlowAggMapper {
    /**
     * 查询设备流量日志统计
     *
     * @param deviceFlowAggId 设备流量日志统计ID
     * @return 设备流量日志统计
     */
    public DeviceFlowAgg selectDeviceFlowAggById(@Param("deviceFlowAggId") Long deviceFlowAggId);

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
     * 删除设备流量日志统计
     *
     * @param deviceFlowAggId 设备流量日志统计ID
     * @return 结果
     */
    public int deleteDeviceFlowAggById(@Param("deviceFlowAggId") Long deviceFlowAggId);

    /**
     * 批量删除设备流量日志统计
     *
     * @param deviceFlowAggIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceFlowAggByIds(String[] deviceFlowAggIds);

    /**
     * 根据流量统计列表
     *
     * @param deviceSn  设备SN
     * @param companyId 公司ID
     * @return 结果
     */
    List<FlowAggListVo> queryFlowAggList(@Param("deviceSn") String deviceSn, @Param("companyId") Long companyId);

    /**
     * 批量新增设备流量日志统计
     *
     * @param deviceFlowAggList 设备流量日志统计列表
     * @return 结果
     */
    public int addDeviceFlowAgg(@Param("deviceFlowAggList") List<DeviceFlowAgg> deviceFlowAggList);

    /**
     * 查询流量统计累计
     *
     * @param subscriberId 设备SN
     * @param startDate    起始日期
     * @param overDate     截止日期
     * @return 结果
     */
    List<FlowAggSumVo> queryFlowAggSum(@Param("subscriberId") String subscriberId,
                                       @Param("startDate") String startDate,
                                       @Param("overDate") String overDate,
                                       @Param("companyId")Long companyId);

    /**
     * 根据订阅ID(设备SN）流量统计日志列表
     *
     * @param subscriberId 设备SN
     * @param startDate    起始日期
     * @param overDate     截止日期
     * @return 结果
     */
    List<FlowAggSumVo> queryFlowAggSumLog(@Param("subscriberId") String subscriberId,
                                          @Param("startDate") String startDate,
                                          @Param("overDate") String overDate
    );

    /**
     * 获取4G卫星流量使用
     *
     * @param userId
     * @return
     */
    List<Index4GStaUseDataVo> get4GSatUseData(@Param("userId") Long userId,
                                              @Param("startDate") String startDate,
                                              @Param("endDate") String endDate);

    /**
     * 获取4G卫星流量使用详情
     *
     * @param deviceSn
     * @return
     */
    List<Index4GStaUseDataVo> get4GSatUseFlow(@Param("deviceSn") String deviceSn,
                                              @Param("companyId") Long companyId,
                                              @Param("startDate") String startDate,
                                              @Param("overDate") String overDate);

    List<FlowAggSumVo> get4GSatUseFlow2(@Param("deviceSn") String deviceSn,
                                        @Param("companyId") Long companyId);

    /**
     * 获取企业流量详情
     *
     * @param companyId
     * @param startDate
     * @param overDate
     * @return
     */
    List<Index4GStaUseDataVo> getCompanyFlowDetail(@Param("companyId") String companyId,
                                                   @Param("startDate") String startDate,
                                                   @Param("overDate") String overDate);

    CompanyFlowDetailVo getCompanyFlowDetail2(@Param("companyId") String companyId,
                                              @Param("startDate") String startDate,
                                              @Param("overDate") String overDate);
}
