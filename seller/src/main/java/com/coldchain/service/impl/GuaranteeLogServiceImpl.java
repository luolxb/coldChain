package com.coldchain.service.impl;

import com.coldchain.dao.GuaranteeLogMapper;
import com.coldchain.entity.GuaranteeLog;
import com.coldchain.service.GuaranteeLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 店铺消费者保障服务日志表 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2020-03-11
 */
@Service
public class GuaranteeLogServiceImpl extends ServiceImpl<GuaranteeLogMapper, GuaranteeLog> implements GuaranteeLogService {
}
