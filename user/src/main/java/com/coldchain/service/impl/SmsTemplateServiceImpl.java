package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.SmsTemplateMapper;
import com.coldchain.entity.SmsTemplate;
import com.coldchain.service.SmsTemplateService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 短信模板配置表 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-10-18
 */
@Service("smsTemplateService")
public class SmsTemplateServiceImpl extends ServiceImpl<SmsTemplateMapper, SmsTemplate> implements SmsTemplateService {

    @Override
    public List<Map<String, String>> getSendScene() {

        List<Map<String, String>> mapList = new ArrayList<>();

        return mapList;
    }
}
