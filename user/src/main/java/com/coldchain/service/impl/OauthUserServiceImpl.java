package com.coldchain.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.coldchain.dao.OauthUsersMapper;
import com.coldchain.entity.MiniappConfig;
import com.coldchain.entity.OauthUser;
import com.coldchain.service.MallService;
import com.coldchain.service.OauthUserService;
import com.common.constant.ShopConstant;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.common.utils.WechatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2020-03-25
 */
@Service("oauthUserService")
public class OauthUserServiceImpl extends ServiceImpl<OauthUsersMapper, OauthUser> implements OauthUserService {
    @Autowired
    private MallService mallService;
    @Autowired
    private ShopConstant shopConstant;

    @Override
    public OauthUser getOauthUserByCode(String jsCode) {
        MiniappConfig miniappConfig = mallService.miniappConfig();
        JSONObject wxLoginResult = WechatUtil.getSessionKeyOrOpenId(jsCode, miniappConfig.getAppId(), miniappConfig.getAppSecret());
        log.warn("微信小程序登录接口返回：" + wxLoginResult.toString());
        String errCode = wxLoginResult.getString("errcode");
        if (!StringUtils.isEmpty(errCode) && Integer.parseInt(errCode) != 0) {
            throw new ShopException(ResultEnum.WX_MINI_APP_LOGIN_ERROR);//小程序登录失败
        }
        OauthUser oauthUser = new OauthUser();
        oauthUser.setUnionid(wxLoginResult.getString("unionid"));
        oauthUser.setOpenid(wxLoginResult.getString("openid"));
        oauthUser.setOauth(shopConstant.getMiniAppOauth());
        return oauthUser;
    }
}
