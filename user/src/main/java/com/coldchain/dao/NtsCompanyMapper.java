package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.NtsCompany;
import com.coldchain.entity.vo.NtsCompanyVo;
import com.common.dto.NtsCompanyDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NtsCompanyMapper extends BaseMapper<NtsCompany> {
    List<NtsCompanyVo> tree(@Param("companyId") Long companyId,
                            @Param("userId") Long userId,
                            @Param("companyName") String companyName);

    NtsCompanyDto getGroupCompany(@Param("userId") Integer userId,
                                  @Param("companyId") Long companyId);

    NtsCompanyVo userManagerCompanyDetail(@Param("userId") Integer userId);

    List<NtsCompanyVo> serverPage(Page<NtsCompanyVo> ntsCompanyVoPage,
                                  @Param("companyName") String companyName,
                                  @Param("companyPhone") String companyPhone,
                                  @Param("status") Integer status,
                                  @Param("start") Integer start,
                                  @Param("end") Integer end);
}
