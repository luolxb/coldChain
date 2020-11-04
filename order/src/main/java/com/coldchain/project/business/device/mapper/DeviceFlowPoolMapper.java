package com.coldchain.project.business.device.mapper;

import com.coldchain.project.business.card.domain.IndexFlowOrderDeviceCountVo;
import com.coldchain.project.business.device.domain.DeviceFlowPool;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 设备流量池Mapper接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface DeviceFlowPoolMapper {
    /**
     * 查询设备流量池
     *
     * @param flowPoolId 设备流量池ID
     * @return 设备流量池
     */
    public DeviceFlowPool selectDeviceFlowPoolById(@Param("flowPoolId") Long flowPoolId);

    /**
     * 查询设备流量池列表
     *
     * @param deviceFlowPool 设备流量池
     * @return 设备流量池集合
     */
    public List<DeviceFlowPool> selectDeviceFlowPoolList(DeviceFlowPool deviceFlowPool);

    /**
     * 新增设备流量池
     *
     * @param deviceFlowPool 设备流量池
     * @return 结果
     */
    public int insertDeviceFlowPool(DeviceFlowPool deviceFlowPool);

    /**
     * 修改设备流量池
     *
     * @param deviceFlowPool 设备流量池
     * @return 结果
     */
    public int updateDeviceFlowPool(DeviceFlowPool deviceFlowPool);

    /**
     * 删除设备流量池
     *
     * @param flowPoolId 设备流量池ID
     * @return 结果
     */
    public int deleteDeviceFlowPoolById(@Param("flowPoolId") Long flowPoolId);

    /**
     * 批量删除设备流量池
     *
     * @param flowPoolIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceFlowPoolByIds(String[] flowPoolIds);

    /**
     * 根据设备ID查询
     *
     * @param deviceId 设备ID
     * @return 结果
     */
    DeviceFlowPool queryByDeviceId(@Param("deviceId") Long deviceId);

    /**
     * 获取流量信息,流量订单数，设备数量
     */
    IndexFlowOrderDeviceCountVo getFlowOrderDeviceCount(@Param("companyId") Long companyId);

    /**
     * 获取最近七天购买流量订单数量
     *
     * @param userId
     * @param date
     * @return
     */
    List<Map<String, Object>> getBuyFlowOrderCount(@Param("userId") Long userId,
                                                   @Param("date") String date);
}
