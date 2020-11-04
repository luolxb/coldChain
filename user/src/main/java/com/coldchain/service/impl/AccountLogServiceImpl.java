package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.AccountLogMapper;
import com.coldchain.entity.AccountLog;
import com.coldchain.entity.User;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.AccountLogService;
import com.coldchain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountLogServiceImpl extends ServiceImpl<AccountLogMapper, AccountLog> implements AccountLogService {

    @Autowired
    private UserService userService;

    @Override
    public void saveAccountLog(AccountLog accountLog){
        User user = userService.getById(accountLog.getUserId());
        BigDecimal frozenMoney = accountLog.getFrozenMoney();
        int payPoints = user.getPayPoints() + accountLog.getPayPoints();
        BigDecimal userMoney;
        if (frozenMoney.equals(BigDecimal.ZERO)) {//冻结资金和用户资金不能同时操作
            userMoney = user.getUserMoney().add(accountLog.getUserMoney());
            if (userMoney.compareTo(BigDecimal.ZERO) >= 0) {
                user.setUserMoney(userMoney);
            } else {
                throw new ShopException(ResultEnum.ADD_USER_MONEY_ERROR);
            }
        } else {
            BigDecimal fMoney = user.getFrozenMoney().add(accountLog.getFrozenMoney());
            if (fMoney.compareTo(BigDecimal.ZERO) >= 0) {
                user.setFrozenMoney(fMoney);
                userMoney = user.getUserMoney().subtract(accountLog.getFrozenMoney());
                user.setUserMoney(userMoney);
            } else {
                throw new ShopException(ResultEnum.ADD_USER_FROZEN_MONEY_ERROR);
            }
        }
        if (payPoints >= 0) {
            user.setPayPoints(payPoints);
        } else {
            throw new ShopException(ResultEnum.ADD_USER_PAY_POINTS_ERROR);
        }
        userService.updateById(user);
        accountLog.setChangeTime(System.currentTimeMillis() / 1000);
        save(accountLog);
    }
}
