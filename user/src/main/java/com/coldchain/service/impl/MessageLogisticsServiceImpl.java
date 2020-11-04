package com.coldchain.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.MessageLogisticsMapper;
import com.coldchain.entity.MessageLogistics;
import com.coldchain.entity.UserMessage;
import com.coldchain.service.MessageLogisticsService;
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
public class MessageLogisticsServiceImpl extends ServiceImpl<MessageLogisticsMapper, MessageLogistics> implements MessageLogisticsService {


    @Override
    public IPage<MessageLogistics> userMessagePage(Page<MessageLogistics> page, Integer userId) {
        UserMessage userMessage = new UserMessage();
        userMessage.setUserId(userId);
        userMessage.setDeleted(0);
        return getBaseMapper().selectUserMessagePage(page, userMessage);
    }
}
