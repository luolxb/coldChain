package com.common.exception;


import com.common.utils.TimeUtil;

public enum ResultEnum {
    NO_LOGIN_ERROR(-100, "没有登录错误"),
    VERIFY_ERROR(-60001,"验证错误"),
    OLD_PASSWORD_ERROR(-10030, "旧密码错误"),
    WX_MINI_APP_LOGIN_ERROR(-10001, "小程序登陆错误"),
    TEAM_HAVE_FOUND_ORDER(-60133,"团队没找到"),
    FIRST_LEADER_NOT_EXISTS(-10101, "没有找到"),
    DOC_CODE_EXISTS(-20005, "文档已经存在"),
    NO_FIND_FOUND(-40102, "没找到"),
    ERROR_ORDER(-10080, "错误订单"),
    UPLOAD_FAIL_OSS_ERROR(-15000, "上传失败"),
    NO_USE_MSG_REG(-10082, "无用户注册信息"),
    SUBDOMAINS_EXISTS(-60114, "子域名存在"),
    INVALID_TOKEN(-10000, "无效token"),
    SPEC_HAVE_GOODS(-41002, "有特殊商品"),
    GOODS_CATEGORY_LEVEL_ERROR(-20010, "商品分配级别错误"),
    NOT_BIND_MOBILE(-10028, "无绑定手机号"),
    TOO_MANY_ADDRESS(-10014, "太多地址"),
    LITTLE_ORDER_GOODS_NO_SHIPPING(-40005, "小单不包邮"),
    CANNOT_RETURN_GOODS(-10104, "无返回商品"),
    ORDER_PAY_ERROR(-40012, "订单支付失败"),
    GOODS_STATE_ERROR(-41008, "商品状态错误"),
    FAIL(-1, "失败"),
    IN_REVIEW(-60127, "重新查看"),
    TEAM_HAD_LOTTERY(-40107, "团队有此爱好"),
    COMPLAIN_HAVE_BENN_APPLY(-10106, "抱怨应用"),
    NO_PAY_PWD(-40007, "无支付密码"),
    PAY_PSW_ERROR(-40009, "支付密码错误"),
    NOT_AGREE_REFUND(-10089, "无同意退款"),
    VERIFY_CODE_ERROR(-10005, "验证码错误"),
    ACTIVITY_TIME_IS_OVER(-10035, "激活超时"),
    UPLOAD_WX_IMG_MAX_SIZE_ERROR(-10100, "上传图片尺寸错误"),
    COUPON_ILLEGAL(-10051, "奖券非法"),
    USER_COUPON_EXISTS(-10037, "用户已存在奖券"),
    LOGIN_ERROR(-10010, "登陆错误"),
    ADD_SPEC_ERROR(-10081, "添加特别商品错误"),
    MOBILE_IS_BINDING(-10031, "手机已经绑定"),
    ORDER_GOODS_ON_RETURN(-10079, "订单商品在返还中"),
    UNKNOWN_ERROR(0,"未知错误"),
    ACCOUNT_NOT_EXISTS(-10046,"账号不存在"),
    SAME_SELLER_NAME(-60128,"商家重名"),
    USER_PWD_ERROR(-60130, "用户密码错误"),
    SELLER_USER_EXISTS(-60132, "商家已存在"),
    USER_NOT_EXISTS(-60129, "用户不存在"),
    USER_PWD_NOT_SAME(-60131, "两次密码不一致"),
    ADD_USER_FROZEN_MONEY_ERROR(-60132,"账户冻结"),
    ADD_USER_MONEY_ERROR(-60133,"充值错误"),
    ADD_USER_PAY_POINTS_ERROR(-60134,"用户付款错误"),
    EXCELTYPEENUM_CAN_NOT_NULL(-10060, "枚举类型不能为空"),
    DERIVED_ANOMALY(-10059, "驱动异常"),
    FILE_FORMAT_ERROR(-10060, "文件格式错误"),
    NO_EXIST_SMS_TEMP(-10061, "不存在消息模板"),
    NO_VERIFY_CODE(-10062, "没有验证码"),
    VERIFY_CODE_TIME_OUT(-10063, "验证码超时"),
    EMAIL_IN_USE(-10064, "使用中的电子邮件"),
    ACCOUNT_PARAM_ERROR(-10065, "账号参数错误"),
    ACCOUNT_EXISTS(-10066, "账号存在"),
    ACCOUNT_IS_BINDIND(-10067, "帐户已绑定"),
    NEED_BIND_ACCOUNT(-10068, "需要绑定账号"),
    SIGN_CONFIG_NO_ON(-10070, "登录配置"),
    SIGN_REPEAT(-10071, "重复签名"),
    NOT_DISTRIBUTORS(-10072, "不是分销商"),
    WITHDRAWAL_DISABLE(-10073, "提款禁用"),
    FREEZING_OF_FUND(-10074, "冻结资金"),
    NOT_SUFFICIENT_FUNDS(-10075, "没有足够的资金"),
    MIN_CASH(-10076, "最低现金"),
    MAX_CASH(-10077, "最低高现金"),
    TAXFEE_ERROR(-10078, "税费错误"),
    MAX_WITHDRAWALS_COUNT(-10079, "最大提款数量"),
    PAYPWD_NOT_SET(-10080, "支付密码没有设置"),
    INVALID_PAY_PWD(-10081, "发票支付密码没有设置"),
    SAME_USER_NAME(-10082, "相同的用户名"),
    USER_HAVE_STORE(-10083, "用户需要商铺");

    private ResultEnum(int code, String msg) {
        this.code=code;
        this.msg=msg;
    };

    private String msg;
    private int code;


    public String getMsg()
    {
        return this.msg;
    }
    public int getCode() {
        return this.code;
    }


}
