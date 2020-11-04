package com.coldchain.service.impl;

import com.coldchain.entity.AdminLog;
import com.coldchain.dao.AdminLogMapper;
import com.coldchain.service.AdminLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-11-04
 */
@Service
public class AdminLogServiceImpl extends ServiceImpl<AdminLogMapper, AdminLog> implements AdminLogService {

}
