package com.coldchain.project.business.user.domain;

import com.coldchain.framework.aspectj.lang.annotation.Excel;
import com.coldchain.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 企业用户对象 nts_user
 *
 * @author nts
 * @date 2019-11-23
 */
public class NtsUser extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long userId;

    /**
     * 用户名
     */
    @Excel(name = "用户名")
    private String username;

    /**
     * 密码
     */
    @Excel(name = "密码")
    private String password;

    /**
     * 盐加密
     */
    @Excel(name = "盐加密")
    private String salt;

    /**
     * 昵称
     */
    @Excel(name = "昵称")
    private String nickname;

    /**
     * 手机号
     */
    @Excel(name = "手机号")
    private String mobile;

    /**
     * 性别 1-男生，2-女生
     */
    @Excel(name = "性别 1-男生，2-女生")
    private Integer gender;

    /**
     * 头像
     */
    @Excel(name = "头像")
    private String avatar;

    /**
     * 用户类别ID
     */
    @Excel(name = "用户类别ID")
    private Integer accountTypeId;

    /**
     * 企业ID
     */
    @Excel(name = "企业ID")
    private Long companyId;

    /**
     * 微信openId
     */
    @Excel(name = "微信openId")
    private String weixinOpenid;

    /**
     * 状态 1-正常 2-暂停
     */
    @Excel(name = "状态 1-正常 2-暂停")
    private Integer status;

    /**
     * 删除标志 1-正常状态 2-已删除
     */
    @Excel(name = "删除标志 1-正常状态 2-已删除")
    private Integer deleteFlag;

    /**
     * 注册IP
     */
    @Excel(name = "注册IP")
    private String registerIp;

    /**
     * 注册时间
     */
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registerTime;

    /**
     * 最后登录IP
     */
    @Excel(name = "最后登录IP")
    private String lastLoginIp;

    /**
     * 最后登录时间
     */
    @Excel(name = "最后登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLoginTime;

    private String mailLeader;
    private String primaryAccount;
    private String businessLeader;
    /**
     * 是否是管理员 1：是 2 :不是
     */
    private Integer isAdmin;

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setBusinessLeader(String businessLeader) {
        this.businessLeader = businessLeader;
    }

    public String getBusinessLeader() {
        return businessLeader;
    }

    public void setPrimaryAccount(String primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public String getPrimaryAccount() {
        return primaryAccount;
    }

    public void setMailLeader(String mailLeader) {
        this.mailLeader = mailLeader;
    }

    public String getMailLeader() {
        return mailLeader;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getGender() {
        return gender;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid;
    }

    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("userId", getUserId())
                .append("username", getUsername())
                .append("password", getPassword())
                .append("salt", getSalt())
                .append("nickname", getNickname())
                .append("mobile", getMobile())
                .append("gender", getGender())
                .append("avatar", getAvatar())
                .append("accountTypeId", getAccountTypeId())
                .append("companyId", getCompanyId())
                .append("weixinOpenid", getWeixinOpenid())
                .append("status", getStatus())
                .append("deleteFlag", getDeleteFlag())
                .append("registerIp", getRegisterIp())
                .append("registerTime", getRegisterTime())
                .append("lastLoginIp", getLastLoginIp())
                .append("lastLoginTime", getLastLoginTime())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
