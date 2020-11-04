package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsProductVersionMapper;
import com.coldchain.entity.NtsProductVersion;
import com.coldchain.service.NtsProductVersionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NtsProductVersionServiceImpl extends ServiceImpl<NtsProductVersionMapper,NtsProductVersion> implements NtsProductVersionService {
}
