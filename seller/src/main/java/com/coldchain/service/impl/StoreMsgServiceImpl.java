package com.coldchain.service.impl;

import com.coldchain.dao.StoreMsgMapper;
import com.coldchain.entity.StoreMsg;
import com.coldchain.service.StoreMsgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 店铺消息表 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2020-03-19
 */
@Service
public class StoreMsgServiceImpl extends ServiceImpl<StoreMsgMapper, StoreMsg> implements StoreMsgService {

}
