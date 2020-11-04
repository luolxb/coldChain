package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.CpDeviceGroup;
import com.coldchain.entity.vo.CpDeviceGroupRq;
import com.coldchain.entity.vo.CpDeviceGroupVo;
import com.coldchain.entity.vo.CpGroupDeviceVo;
import com.common.dto.CpDeviceGroupDto;

import java.util.List;

/**
 * (CpDeviceGroup)表服务接口
 *
 * @author chenqingshan
 * @since 2020-10-10 11:48:49
 */
public interface CpDeviceGroupService extends IService<CpDeviceGroup> {

    Page<CpDeviceGroupVo> deviceGroupPage(Long start, Long end, String groupName, Integer page, Integer size);

    void add(CpDeviceGroupRq cpDeviceGroupRq);

    void update(CpDeviceGroupRq cpDeviceGroupRq);

    void delete(String ids);

    List<CpDeviceGroup> getGroupByCompanyName(String groupCampany);

    List<CpGroupDeviceVo> getGroupByCompany(String companyId);

    List<CpDeviceGroupDto> getDeviceGroupByUserId(Page<CpDeviceGroupDto> deviceGroupDtoPage, Integer userId);

    Page<CpDeviceGroupVo> deviceGroupAppPage(String groupName, Integer page, Integer size);
}