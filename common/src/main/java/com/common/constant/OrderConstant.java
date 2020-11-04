package com.common.constant;

import java.util.HashSet;
import java.util.Set;

public class OrderConstant {
    public static final int NOT_CONFIRMED = 0;
    public static final int CONFIRMED = 1;
    public static final int DELIVERY = 2;
    public static final int CANCELLED = 3;
    public static final int COMMENTED = 4;
    public static final int INVALID = 5;
    public static final int NOT_PAY = 0;
    public static final int PAYED = 1;
    public static final int PRE_PAY = 2;
    public static final int REFUND = 3;
    public static final int CUSTOMER = 2;
    public static final int SELLER = 1;
    public static final int ADMIN = 1;
    public static final int FINALLY_PAY_TIME = 86400;
    private static final Set<String> thirdPayCode = new HashSet();

    public OrderConstant() {
    }

    public static Set<String> getThirdPayCode() {
        return thirdPayCode;
    }

    static {
        thirdPayCode.add("weixin");
        thirdPayCode.add("miniAppPay");
        thirdPayCode.add("appWeixinPay");
    }
}
