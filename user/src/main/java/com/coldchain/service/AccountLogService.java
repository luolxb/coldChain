package com.coldchain.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.AccountLog;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dyr
 * @since 2019-08-29
 */
public interface AccountLogService extends IService<AccountLog> {
    void saveAccountLog(AccountLog accountLog);
}
