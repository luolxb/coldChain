package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.CpDeviceGroup;
import com.coldchain.entity.NtsProjectDevice;
import com.coldchain.entity.vo.CpDeviceGroupVo;
import com.coldchain.entity.vo.CpGroupDeviceVo;
import com.common.dto.CpDeviceGroupDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (CpDeviceGroup)表数据库访问层
 *
 * @author chenqingshan
 * @since 2020-10-10 11:48:49
 */
public interface CpDeviceGroupMapper extends BaseMapper<CpDeviceGroup> {


    List<CpDeviceGroupVo> deviceGroupPage(Page<CpDeviceGroupVo> cpDeviceGroupPage,
                                          @Param("start") Long start,
                                          @Param("end") Long end,
                                          @Param("groupName") String groupName,
                                          @Param("userId") Integer userId);

    List<CpGroupDeviceVo> getGroupByCompany(@Param("companyId") String companyId);

    List<CpDeviceGroupDto> getDeviceGroupByUserId(Page<CpDeviceGroupDto> deviceGroupDtoPage,
                                                  @Param("userId") Integer userId);
}