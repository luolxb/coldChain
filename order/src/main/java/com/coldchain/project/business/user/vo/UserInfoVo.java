package com.coldchain.project.business.user.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户信息
 */
@Data
public class UserInfoVo {

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 企业别名
     */
    private String companyAlias;

    /**
     * 企业地址
     */
    private String companyAddress;

    /**
     * 企业邮箱
     */
    private String email;

    /**
     * 审核状态：0-未审核 1-审核成功 2-审核失败
     */
    private Integer auditStatus;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 剩余流量
     */
    private Double surplusFlow;
}
