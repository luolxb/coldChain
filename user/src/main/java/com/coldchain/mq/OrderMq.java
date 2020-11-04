package com.coldchain.mq;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coldchain.entity.*;
import com.coldchain.service.*;

import com.common.constant.OrderConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Component
public class OrderMq {
    @Autowired
    private AccountLogService accountLogService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserExtendService userExtendService;
    @Autowired
    private UserLevelService userLevelService;
    @Autowired
    private OrderService orderService;

    @RabbitListener(queues = "create_order.user")
    public void createOrdersAfter(List<Order> orders) {

    }

    @RabbitListener(queues = "pay_order.user")
    public void userMoneyPayOrders(List<Order> orders) {

    }

    @RabbitListener(queues = "cancelled_order.user")
    public void cancelOrderAfter(Order order) {
        if (order.getPayStatus() == OrderConstant.NOT_PAY) {
            if (order.getUserMoney().compareTo(BigDecimal.ZERO) > 0 || order.getIntegral() > 0) {
                AccountLog accountLog = AccountLog.builder().userId(order.getUserId()).userMoney(order.getUserMoney())
                        .payPoints(order.getIntegral()).changeTime(System.currentTimeMillis() / 1000).desc("订单取消，返还余额和积分")
                        .orderSn(order.getOrderSn()).orderId(order.getOrderId()).build();
                accountLogService.save(accountLog);
            }
        }
    }

    @RabbitListener(queues = "cancelled_order.user")
    public void cancelOrderAfter(List<Order> orders) {
        List<AccountLog> accountLogs = new ArrayList<>();
        for(Order order : orders){
            if (order.getPayStatus() == OrderConstant.NOT_PAY) {
                if (order.getUserMoney().compareTo(BigDecimal.ZERO) > 0 || order.getIntegral() > 0) {
                    accountLogs.add(AccountLog.builder().userId(order.getUserId()).userMoney(order.getUserMoney())
                            .payPoints(order.getIntegral()).changeTime(System.currentTimeMillis() / 1000).desc("订单取消，返还余额和积分")
                            .orderSn(order.getOrderSn()).orderId(order.getOrderId()).build());
                }
            }
        }
        if(accountLogs.size() > 0){
            accountLogService.saveBatch(accountLogs);
        }
    }

    @RabbitListener(queues = "receive_order.user")
    public void receiveOrderAfter(Order order) {
        User user = userService.getById(order.getUserId());
        BigDecimal totalAmount = user.getTotalAmount().add(order.getOrderAmount().add(order.getUserMoney()));
        user.setTotalAmount(totalAmount);
        UserLevel userLevel = userLevelService.getOne((new QueryWrapper<UserLevel>()).le("amount", user.getTotalAmount())
                .orderByDesc("amount").last("LIMIT 1"));
        if (userLevel != null) {
            user.setLevel(userLevel.getLevelId());
            user.setDiscount(BigDecimal.valueOf(userLevel.getDiscount() / 100));
        }
        userService.updateById(user);
    }

    @RabbitListener(queues = "receive_order.user")
    public void receiveOrdersAfter(List<Order> orders) {
        Set<Integer> userIds = orders.stream().map(Order::getUserId).collect(Collectors.toSet());
        List<User> users = userService.list((new QueryWrapper<User>()).in("user_id", userIds));
        Map<Integer, User> userMap = users.stream().collect(Collectors.toMap(User::getUserId, user -> user));
        for (Order order : orders) {
            if (userMap.containsKey(order.getUserId())) {
                User user = userMap.get(order.getUserId());
                user.setTotalAmount(user.getTotalAmount().add(order.getOrderAmount().add(order.getUserMoney())));
            }
        }
        List<UserLevel> userLevels = userLevelService.list((new QueryWrapper<UserLevel>())
                .orderByDesc("amount"));
        List<User> updateUserList = new ArrayList<>();
        for (Map.Entry<Integer, User> entry : userMap.entrySet()) {
            User user = entry.getValue();
            if (userLevels.size() > 0) {
                for (int i = 0; i < userLevels.size(); i++) {
                    if (i == 0) {
                        //初始等级
                        user.setLevel(userLevels.get(i).getLevelId());
                        user.setDiscount(BigDecimal.valueOf(userLevels.get(i).getDiscount() / 100));
                    }
                    if (user.getTotalAmount().compareTo(userLevels.get(i).getAmount()) >= 0) {
                        //打怪升级
                        user.setLevel(userLevels.get(i).getLevelId());
                        user.setDiscount(BigDecimal.valueOf(userLevels.get(i).getDiscount() / 100));
                    }
                    if (user.getTotalAmount().compareTo(userLevels.get(i).getAmount()) < 0) {
                        //打不过了，退出
                        break;
                    }
                }
            }
            updateUserList.add(user);
        }
        if (updateUserList.size() > 0) {
            userService.updateBatchById(updateUserList);
        }
    }

    @RabbitListener(queues = "confirm_rebate.user")
    public void confirmRebateAfter(List<RebateLog> rebateLogs) {
        Set<Integer> userIds = new HashSet<>();
        List<AccountLog> accountLogs = new ArrayList<>();
        for (RebateLog rebateLog : rebateLogs) {
            accountLogs.add(AccountLog.builder().userId(rebateLog.getUserId()).userMoney(rebateLog.getMoney())
                    .payPoints(0).changeTime(System.currentTimeMillis() / 1000).desc("订单:" + rebateLog.getOrderSn() + "分佣")
                    .orderSn(rebateLog.getOrderSn())
                    .orderId(rebateLog.getOrderId()).build());
            userIds.add(rebateLog.getUserId());
        }
        Map<Integer, User> userMap = userService.list(new QueryWrapper<User>().in("user_id", userIds)).stream()
                .collect(Collectors.toMap(User::getUserId, item -> item));
        List<DistributLevel> distributLevels = orderService.distributLevelList().stream()
                .sorted(Comparator.comparing(DistributLevel::getOrderMoney)).collect(Collectors.toList());
        if (accountLogs.size() > 0) {
            accountLogService.saveBatch(accountLogs);
            for (AccountLog accountLog : accountLogs) {
                if (userMap.containsKey(accountLog.getUserId())) {
                    User user = userMap.get(accountLog.getUserId());
                    user.setDistributMoney(user.getDistributMoney().add(accountLog.getUserMoney()));
                    for (DistributLevel distributLevel : distributLevels) {
                        if (user.getDistributMoney().compareTo(distributLevel.getOrderMoney()) > 0) {
                            user.setDistributLevel(distributLevel.getLevelId());
                        }
                    }

                }
            }
            userService.updateBatchById(userMap.values());
        }

    }
}
