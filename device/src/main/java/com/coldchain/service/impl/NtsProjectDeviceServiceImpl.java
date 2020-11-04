package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.NtsProjectDeviceMapper;
import com.coldchain.entity.NtsProjectDevice;
import com.coldchain.service.NtsProjectDeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NtsProjectDeviceServiceImpl extends ServiceImpl<NtsProjectDeviceMapper, NtsProjectDevice> implements NtsProjectDeviceService {
}
