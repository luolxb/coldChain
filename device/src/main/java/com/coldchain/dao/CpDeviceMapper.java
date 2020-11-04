package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.CpDevice;
import com.coldchain.entity.CpSensor;
import com.coldchain.entity.vo.CpDeviceBindRq;
import com.coldchain.entity.vo.CpDeviceGroupRq;
import com.coldchain.entity.vo.CpDeviceGroupVo;
import com.coldchain.entity.vo.CpDeviceVo;
import com.common.dto.CpDeviceDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备表(CpDevice)表数据库访问层
 *
 * @author chenqingshan
 * @since 2020-10-10 13:14:10
 */
public interface CpDeviceMapper extends BaseMapper<CpDevice> {


    List<com.common.dto.CpDeviceDto> devicePageByProjectId(Page<com.common.dto.CpDeviceDto> cpDeviceDtoPage,
                                                           @Param("projectId") Long projectId,
                                                           @Param("deviceName") String deviceName,
                                                           @Param("start") Long start,
                                                           @Param("end") Long end);

    List<CpDeviceVo> noUseDevice(@Param("userId") Integer userId);


    Integer getDeviceNumberTotal(@Param("isAlarms") Integer isAlarms,
                                 @Param("isDelete") Integer isDelete,
                                 @Param("isLine") Integer isLine,
                                 @Param("adminId") Integer adminId,
                                 @Param("oemId") Integer oemId,
                                 @Param("uId") Integer uId);

    List<CpDeviceVo> getDeviceRealTimeLocation(@Param("deviceName") String deviceName,
                                               @Param("deviceSn") String deviceSn,
                                               @Param("isAlarms") Integer isAlarms,
                                               @Param("isDelete") Integer isDelete,
                                               @Param("isLine") Integer isLine,
                                               @Param("adminId") Integer adminId,
                                               @Param("oemId") Integer oemId,
                                               @Param("uId") Integer uId);

    List<CpDeviceVo> getDeviceByGroupId(@Param("groupId") String groupId);

    Integer update1(CpDevice cpDevice);

    List<CpDeviceDto> getDeviceListByGroupId(Page<com.common.dto.CpDeviceDto> cpDeviceDtoPage,
                                             @Param("deviceGroupId") String deviceGroupId,
                                             @Param("search") String search,
                                             @Param("userId") Integer userId);

    List<CpDevice> getDeviceByCompanyId(@Param("companyId") String companyId);

    Integer getDeviceNumberTotalByCompanyId(@Param("companyId") String companyId);

    List<CpDevice> devicePageByOemId(Page<CpDevice> cpDevicePage,
                                     @Param("start") Long start,
                                     @Param("end") Long end,
                                     @Param("deviceName") String deviceName,
                                     @Param("oemId") Integer oemId,
                                     @Param("deviceCompany") String deviceCompany,
                                     @Param("deviceType") String deviceType);

    List<CpDevice> devicePageByUserId(Page<CpDevice> cpDevicePage,
                                   @Param("start") Long start,
                                   @Param("end") Long end,
                                   @Param("deviceName") String deviceName,
                                   @Param("userId") Integer userId,
                                   @Param("deviceCompany") String deviceCompany,
                                   @Param("deviceType") String deviceType);

    List<CpDevice> devicePageByAdminId(Page<CpDevice> cpDevicePage,
                                       @Param("start") Long start,
                                       @Param("end") Long end,
                                       @Param("deviceName") String deviceName,
                                       @Param("deviceCompany") String deviceCompany,
                                       @Param("deviceType") String deviceType);


    void addByDeviceSn(CpDeviceBindRq cpDeviceBindRq);

    void insertLocalDevice(CpDeviceBindRq cpDeviceBindRq);

    void updateByDeviceSn(CpDeviceBindRq cpDeviceBindRq);

    List<CpDevice> getDeviceByUid(String Uid);

    Integer getDeviceNumberTotalByCompany(@Param("isAlarms") Integer isAlarms, @Param("isDelete") Integer isDelete, @Param("isLine") Integer isLine, @Param("deviceCompany") Integer deviceCompany);

    List<CpDeviceDto> deviceMapAppByUserId(@Param("userId") Integer userId,
                                           @Param("type") Integer type);

    List<CpDeviceDto> search(@Param("search") String search,
                             @Param("userId") Integer userId);

    List<CpDeviceVo> getDeviceByUser(@Param("adminId")Integer adminId, @Param("oemId") Integer oemId, @Param("uid") Integer uid);
}