package com.coldchain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.User;
import com.coldchain.entity.UserExtend;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dyr
 * @since 2019-08-20
 */
public interface UserExtendService extends IService<UserExtend> {

    void saveInvoice(User user, UserExtend userExtend);
}
