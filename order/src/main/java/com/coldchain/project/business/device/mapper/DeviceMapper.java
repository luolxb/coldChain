package com.coldchain.project.business.device.mapper;

import com.coldchain.project.business.device.domain.Device;
import com.coldchain.project.business.device.vo.DeviceListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 设备Mapper接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface DeviceMapper {
    /**
     * 查询设备
     *
     * @param deviceId 设备ID
     * @return 设备
     */
    public Device selectDeviceById(@Param("deviceId") Long deviceId);

    /**
     * 查询设备列表
     *
     * @param device 设备
     * @return 设备集合
     */
    public List<Device> selectDeviceList(Device device);

    /**
     * 新增设备
     *
     * @param device 设备
     * @return 结果
     */
    public int insertDevice(Device device);

    /**
     * 修改设备
     *
     * @param device 设备
     * @return 结果
     */
    public int updateDevice(Device device);

    /**
     * 删除设备
     *
     * @param deviceId 设备ID
     * @return 结果
     */
    public int deleteDeviceById(@Param("deviceId") Long deviceId);

    /**
     * 批量删除设备
     *
     * @param deviceIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeviceByIds(String[] deviceIds);

    /**
     * 根据设备SN查询
     *
     * @param deviceSn 设备SN
     * @return 结果
     */
    Device queryByDeviceSn(@Param("deviceSn") String deviceSn);

    /**
     * 根据设备SN查询
     *
     * @param companyId 企业ID
     * @param deviceSn  设备SN
     * @return 结果
     */
    Device selectCompanyIdAndDeviceSn(@Param("companyId") Long companyId,
                                      @Param("deviceSn") String deviceSn);

    /**
     * 模糊查询
     *
     * @param companyId 公司ID
     * @param info      检索内容
     * @return 结果
     */
    List<DeviceListVo> selectListByLike(@Param("companyId") Long companyId,
                                        @Param("info") String info);

    /**
     * 查询设备列表
     *
     * @param companyId        公司ID
     * @param deviceTypeIdList 设备类型ID数组
     * @return 结果
     */
    List<DeviceListVo> queryDeviceList(@Param("companyId") Long companyId,
                                       @Param("deviceTypeIdList") String[] deviceTypeIdList);

    /**
     * 根据设备ID统计设备数量
     *
     * @param deviceId 设备ID
     * @return 结果
     */
    int countDeviceById(@Param("deviceId") Long deviceId);


    /**
     * 设备状态
     *
     * @param userId
     * @return
     */
    Map<String, Object> getSatStatus(@Param("userId") Long userId);

    /**
     * 获取承运商用户的百分比
     *
     * @param userId
     * @return
     */
    Map<String, Object> getDeviceVendorPercentage(@Param("userId") Long userId);

    /**
     * 根据企业ID查询正在使用的设备
     * <p>
     * 激活状态为：1-已激活 3-启用
     *
     * @param companyId 企业ID
     * @return 设备
     */
    List<Device> queryDeviceUsedByCompanyId(Long companyId);

    /**
     * 批量更新设备激活状态
     *
     * @param deviceList 设备列表
     * @return 结果
     */
    int updateDeviceActivateBatch(@Param("deviceList") List<Device> deviceList);
}
