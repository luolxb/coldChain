package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsUserCompanyMapper;
import com.coldchain.entity.NtsUserCompany;
import com.coldchain.service.NtsUserCompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NtsUserCompanyServiceImpl extends ServiceImpl<NtsUserCompanyMapper,NtsUserCompany> implements NtsUserCompanyService {
}
