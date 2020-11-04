package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.MessageMapper;
import com.coldchain.entity.Message;
import com.coldchain.service.MessageService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-08-26
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

}
