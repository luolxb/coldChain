package com.coldchain.mq;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

import com.coldchain.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Component
public class OrderMq {

}
