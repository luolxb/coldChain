package com.coldchain.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsUserProjectMapper;
import com.coldchain.entity.NtsUserProject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NtsUserProjectServiceImpl extends ServiceImpl<NtsUserProjectMapper,NtsUserProject> implements NtsUserProjectService {
}
