package com.coldchain.service;

import com.coldchain.entity.OauthUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dyr
 * @since 2020-03-25
 */
public interface OauthUserService extends IService<OauthUser> {
    OauthUser getOauthUserByCode(String jsCode);
}
