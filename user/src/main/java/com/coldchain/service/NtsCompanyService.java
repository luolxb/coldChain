package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.NtsCompany;
import com.coldchain.entity.vo.NtsCompanyRq;
import com.coldchain.entity.vo.NtsCompanyVo;
import com.common.dto.NtsCompanyDto;

import java.util.List;

public interface NtsCompanyService extends IService<NtsCompany> {
    List<NtsCompanyVo> tree(Long companyId,Long userId,String companyName);

    void add(NtsCompanyRq companyRq);

    NtsCompanyDto getGroupCompany(Integer userId);

    NtsCompanyDto getCompany( Long companyId);

    NtsCompanyVo userManagerCompanyDetail(Integer userId);

    Page<NtsCompanyVo> serverPage(String companyName, String companyPhone, Integer status, Integer start, Integer end, Integer page, Integer size);

    void audit(NtsCompanyRq companyRq);
}
