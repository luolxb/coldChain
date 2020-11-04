package com.coldchain.service.impl;

import com.coldchain.entity.Admin;
import com.coldchain.dao.AdminMapper;
import com.coldchain.service.AdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
