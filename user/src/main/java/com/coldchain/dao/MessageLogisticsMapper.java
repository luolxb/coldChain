package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.MessageLogistics;
import com.coldchain.entity.UserMessage;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dyr
 * @since 2019-08-26
 */
public interface MessageLogisticsMapper extends BaseMapper<MessageLogistics> {

    IPage<MessageLogistics> selectUserMessagePage(Page<MessageLogistics> page, UserMessage userMessage);
}
