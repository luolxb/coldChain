package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsProject;
import com.coldchain.entity.vo.NtsProjectVo;
import com.common.dto.NtsProjectDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NtsProjectMapper extends BaseMapper<NtsProject> {
    List<NtsProjectVo> projectDevicePage(Page<NtsProjectVo> projectVoPage,
                                         @Param("userId") Integer userId,
                                         @Param("projectName")String projectName,
                                         @Param("projectType")String projectType);

    List<NtsProjectDto> dataProjectPage(Page<NtsProjectDto> ntsProjectDtoPage,
                                        @Param("userId") Integer userId);

}
