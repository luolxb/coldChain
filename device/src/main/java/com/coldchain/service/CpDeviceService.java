package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpDeviceGroup;
import com.coldchain.entity.CpSensor;
import com.coldchain.entity.vo.*;

import com.common.dto.CpDeviceMapDto;
import com.common.vo.SBApi;
import org.apache.ibatis.annotations.Param;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * 设备表(CpDevice)表服务接口
 *
 * @author chenqingshan
 * @since 2020-10-10 11:39:41
 */
public interface CpDeviceService extends IService<CpDevice> {


    /**
     *添加设备
     */
    SBApi insertDevice(CpDevice cpDevice);

    /**
     * 分页获取用户设备(不包含传感器数据)
     * @return
     */
    SBApi getDeviceByUserId( CpDeviceDto cpDeviceDto);

    /**
     * 分页获取用户设备(包含传感器数据)
     * @return
     */
    SBApi getDeviceSensorDatas(CpDeviceDto cpDeviceDto);

    /**
     *删除设备
     */
    SBApi deleteDevcie(CpDevice cpDevice);

    /**
     *修改设备
     */
    SBApi update(CpDevice cpDevice);

    /**
     *获取单个设备的传感器数据
     */
    SBApi getSingleDeviceDatas(SingleDeviceDatasDto singleDeviceDatasDto);


    Page<com.common.dto.CpDeviceDto> devicePageByProjectId(Integer page, Integer size, Long projectId, String deviceName, Long start, Long end);

    List<com.common.dto.CpDeviceDto> devicePageByProjectId( Long projectId);


    /**
     * 获取未绑定的设备
     * @return
     */
    List<CpDeviceVo> noUseDevice();



    CpDeviceNumberStatisticsVo getDeviceNumberTotal();


    /**
     * 获取设备实时位置
     *
     */
    List<CpDeviceVo> getDeviceRealTimeLocation(String deviceName, @Param("deviceSn")String deviceSn,Integer status);

    /**
     * 根据企业id,获取分组设备
     */
    List<CpGroupDeviceVo> getGroupDeviceByCompany(@Param("companyId")String companyId);

    /**
     * 数据更新接口用于定时数据采集更新设备数据 (禁删!!!!!!!!!)
     * @param cpDevice
     * @return
     */
    Integer update1(CpDevice cpDevice);

    List<com.common.dto.CpDeviceDto> getDeviceListByGroupId(String deviceGroupId);
    /**
     * 根据公司ID获取所属的所有的设备
     */
    List<CpDevice> getDeviceByCompanyId(String companyId);
    /**
     * 根据公司ID统计所属的所有的设备
     */
    CpDeviceNumberStatisticsVo getDeviceNumberTotalByCompanyId(String companyId);

    void deleteDeviceList(String ids);

    List<CpDevice> getDeviceByUid(String Uid);

    Page<CpDevice> devicePageByOemId(Long start, Long end, String deviceName, Integer page, Integer size,Integer oemId,String deviceCompany, String deviceType);

    Page<CpDevice> devicePage(Long start, Long end, String deviceName, Integer page, Integer size,String deviceCompany, String deviceType);

    void addByDeviceSn(CpDeviceBindRq cpDevice);

    void updateByDeviceSn(CpDeviceBindRq cpDevice);


    CpdeviceNumberStatisticsByCompanyVo getDeviceNumberTotalByCompany(Integer deviceCompany);


    CpDeviceMapDto deviceApp();

    List<com.common.dto.CpDeviceDto> search(String search);

    List<com.common.dto.CpDeviceDto> track(String search, Long start, Long end);

    Page<com.common.dto.CpDeviceDto> devicePageApp(String groupId, Integer page, Integer size,String search);

    List<CpDeviceVo> getDeviceByUser(Integer adminId, Integer oemId, Integer uid);
}