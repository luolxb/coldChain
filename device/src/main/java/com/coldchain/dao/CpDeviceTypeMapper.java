package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.CpDeviceType;
import com.coldchain.entity.NtsProjectDevice;
import com.coldchain.entity.vo.CpDeviceTypeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备类型表(CpDeviceType)表数据库访问层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:13
 */
public interface CpDeviceTypeMapper extends BaseMapper<CpDeviceType> {


    List<CpDeviceTypeVo> deviceTypePage(Page<CpDeviceTypeVo> deviceTypeVoPage,
                                        @Param("start") Long start,
                                        @Param("end") Long end,
                                        @Param("deviceTypeName") String deviceTypeName);
}