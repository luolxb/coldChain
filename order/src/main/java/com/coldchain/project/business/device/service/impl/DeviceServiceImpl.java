package com.coldchain.project.business.device.service.impl;

import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.card.service.NtsCardInfoService;
import com.coldchain.project.business.device.domain.Device;
import com.coldchain.project.business.device.domain.DeviceDetails;
import com.coldchain.project.business.device.domain.DeviceFlowPool;
import com.coldchain.project.business.device.mapper.DeviceMapper;
import com.coldchain.project.business.device.service.IDeviceDataReportService;
import com.coldchain.project.business.device.service.IDeviceDetailsService;
import com.coldchain.project.business.device.service.IDeviceFlowPoolService;
import com.coldchain.project.business.device.service.IDeviceService;
import com.coldchain.project.business.device.vo.DeviceListVo;
import com.coldchain.project.business.device.vo.DeviceVo;
import com.coldchain.project.business.dict.service.IDeviceTypeService;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.ocpcl.service.OcpClientApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * 设备Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
@Slf4j
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    private DeviceMapper deviceMapper;
    @Autowired
    private IDeviceDetailsService deviceDetailsService;
    @Autowired
    private IDeviceFlowPoolService deviceFlowPoolService;
    @Autowired
    private IDeviceDataReportService deviceDataReportService;
    @Autowired
    private IDeviceTypeService deviceTypeService;

    @Autowired
    private NtsCardInfoService ntsCardInfoService;
    @Autowired
    private OcpClientApiService ocpClientApiService;

    /**
     * 查询设备
     *
     * @param deviceId 设备ID
     * @return 设备
     */
    @Override
    public Device selectDeviceById(Long deviceId) {
        return deviceMapper.selectDeviceById(deviceId);
    }

    /**
     * 查询设备列表
     *
     * @param device 设备
     * @return 设备
     */
    @Override
    public List<Device> selectDeviceList(Device device) {
        return deviceMapper.selectDeviceList(device);
    }

    /**
     * 新增设备
     *
     * @param device 设备
     * @return 结果
     */
    @Override
    public int insertDevice(Device device) {
        device.setCreateTime(DateUtils.getNowDate());
        return deviceMapper.insertDevice(device);
    }

    /**
     * 修改设备
     *
     * @param device 设备
     * @return 结果
     */
    @Override
    public int updateDevice(Device device) {
        device.setUpdateTime(DateUtils.getNowDate());
        return deviceMapper.updateDevice(device);
    }

    /**
     * 删除设备对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeviceByIds(String ids) {
        return deviceMapper.deleteDeviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备信息
     *
     * @param deviceId 设备ID
     * @return 结果
     */
    @Override
    public int deleteDeviceById(Long deviceId) {
        return deviceMapper.deleteDeviceById(deviceId);
    }

    /**
     * 根据设备SN查询
     *
     * @param deviceSn 设备SN
     * @return 结果
     */
    @Override
    public Device queryByDeviceSn(String deviceSn) {
        return deviceMapper.queryByDeviceSn(deviceSn);
    }

    /**
     * 根据设备SN查询
     *
     * @param companyId 企业ID
     * @param deviceSn  设备SN
     * @return 结果
     */
    @Override
    public Device selectCompanyIdAndDeviceSn(Long companyId, String deviceSn) {
        return deviceMapper.selectCompanyIdAndDeviceSn(companyId, deviceSn);
    }

    /**
     * 模糊查询
     *
     * @param companyId 企业ID
     * @param info      检索信息 DeviceSN,cardIccId
     * @return 结果
     */
    @Override
    public List<DeviceListVo> search(Long companyId, String info) {
        return deviceMapper.selectListByLike(companyId, info);
    }

    /**
     * 查询设备列表
     *
     * @param companyId        公司ID
     * @param deviceTypeIdList 设备类型ID数组
     * @return 结果
     */
    @Override
    public List<DeviceListVo> queryDeviceList(Long companyId, String[] deviceTypeIdList) {
        return deviceMapper.queryDeviceList(companyId, deviceTypeIdList);
    }

    /**
     * 添加设备
     *
     * @param deviceVo  设备参数
     * @param loginUser 登录的用户
     * @return 结果
     */
    @Transactional
    @Override
    public RestResponse addDevice(DeviceVo deviceVo, NtsUser loginUser) {

        // 检查设备ID
        if (StringUtils.isNotEmpty(deviceVo.getDeviceSn())) {
            Device device = queryByDeviceSn(deviceVo.getDeviceSn());
            if (device != null) return RestResponse.error("设备SN不能重复添加");

            // 判断是否存在ORBCOMM库存
            RestResponse response = ocpClientApiService.listSubscribers(deviceVo.getDeviceSn());
            int code = (int) response.get("code");
            //不存在则不允许添加
            if (code != 0) return RestResponse.error("设备SN不存在或错误");
        }

        // 添加设备
        Device device = new Device();
        if (deviceVo.getCompanyId() != null && loginUser.getIsAdmin() == 1) {  // 判断是否是管理员
            device.setCompanyId(deviceVo.getCompanyId());
        } else {
            device.setCompanyId(loginUser.getCompanyId());
        }
        device.setUserId(loginUser.getUserId());
        device.setDeviceName(deviceVo.getDeviceName());
        device.setDeviceTypeId(deviceVo.getDeviceTypeId());
        device.setDeviceDesc(deviceVo.getDeviceDesc());
        device.setDeviceVendorId(deviceVo.getDeviceVendorId());
        device.setDeviceSn(deviceVo.getDeviceSn());
        device.setCardIccId(deviceVo.getCardIccId());
        insertDevice(device);

        // 如果是新增物联卡 ，将信息保存到物联卡表中
        if (StringUtils.isNotEmpty(deviceVo.getCardIccId())) {
            try {
                ntsCardInfoService.getAndInsertCardInfo(deviceVo.getCardIccId(), loginUser, device.getDeviceId());
            } catch (ParseException e) {
                e.printStackTrace();
                log.error("e", e);
                throw new NtsException("新增物联卡发生异常");
            }
        }
        if (StringUtils.isNotEmpty(deviceVo.getDeviceSn())) {
            //添加设备详情
            DeviceDetails deviceDetails = new DeviceDetails();
            deviceDetails.setDeviceId(device.getDeviceId());
            deviceDetails.setCompanyId(loginUser.getCompanyId());
            deviceDetails.setUserId(loginUser.getUserId());
            deviceDetails.setCarrierId(deviceVo.getCarrierId());
            deviceDetails.setAccount(deviceVo.getAccount());
            deviceDetails.setSubaccount(deviceVo.getSubaccount());
            deviceDetails.setPricePlan(deviceVo.getPricePlan());
            deviceDetails.setGatewayAccount(deviceVo.getGatewayAccount());
            deviceDetails.setSatelliteModule(deviceVo.getSatelliteModule());
            deviceDetails.setSatelliteSn(deviceVo.getSatelliteSn());
            deviceDetails.setSimOperator(deviceVo.getSimOperator());
            deviceDetails.setSimSn(deviceVo.getSimSn());
            deviceDetailsService.insertDeviceDetails(deviceDetails);

            //添加设备流量池
            DeviceFlowPool deviceFlowPool = new DeviceFlowPool();
            deviceFlowPool.setDeviceId(device.getDeviceId());
            deviceFlowPool.setDeviceSn(deviceVo.getDeviceSn());
            deviceFlowPool.setSurplusFlow(0.0);
            deviceFlowPool.setUsedFlow(0.0);
            deviceFlowPoolService.insertDeviceFlowPool(deviceFlowPool);
        }

        return RestResponse.success("添加设备成功");
    }

    /**
     * 根据设备ID统计设备数量
     *
     * @param deviceId 设备ID
     * @return 结果
     */
    @Override
    public int countDeviceById(Long deviceId) {
        return deviceMapper.countDeviceById(deviceId);
    }

    /**
     * 设备状态
     *
     * @param userId
     * @return
     */
    @Override
    public Map<String, Object> getSatStatus(Long userId) {
        return deviceMapper.getSatStatus(userId);
    }


    /**
     * 获取承运商用户的百分比
     *
     * @param userId
     * @return
     */
    @Override
    public Map<String, Object> getDeviceVendorPercentage(Long userId) {
        return deviceMapper.getDeviceVendorPercentage(userId);
    }

    /**
     * 根据企业ID查询正在使用的设备
     * <p>
     * 激活状态为：1-已激活 3-启用
     *
     * @param companyId 企业ID
     * @return 设备
     */
    @Override
    public List<Device> queryDeviceUsedByCompanyId(Long companyId) {
        return deviceMapper.queryDeviceUsedByCompanyId(companyId);
    }

    /**
     * 批量更新设备激活状态
     *
     * @param deviceList 设备列表
     * @return 结果
     */
    @Override
    public int updateDeviceActivateBatch(List<Device> deviceList) {
        return deviceMapper.updateDeviceActivateBatch(deviceList);
    }
}
