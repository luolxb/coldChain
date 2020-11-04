package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.NtsProject;
import com.coldchain.entity.vo.NtsProjectRq;
import com.coldchain.entity.vo.NtsProjectVo;
import com.common.dto.CpDeviceDto;
import com.common.dto.CpDeviceGroupDto;
import com.common.dto.NtsProjectDto;

import java.util.List;

public interface NtsProjectService extends IService<NtsProject> {

    void add(NtsProjectRq projectRq);

    void update(NtsProjectRq projectRq);

    void delByIds(String ids);

    Page<NtsProjectVo> projectDevicePage(Integer page, Integer size, String projectName, String projectType);

    Page<CpDeviceGroupDto> dataDeviceGroup(Integer page, Integer size, Integer userId, Long companyId);

    NtsProjectDto detailDeviceList(Long projectId, String deviceName, Long start, Long end, Integer page, Integer size);

    NtsProjectVo detailDevice(Long projectId);
}
