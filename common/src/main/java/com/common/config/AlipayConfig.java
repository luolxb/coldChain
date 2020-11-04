package com.common.config;


import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

public class AlipayConfig {
    /**
     * 应用号
     */
    public static String APP_ID = "2016102500754971";
    /**
     * 商户的私钥
     */
    public static String APP_PRIVATE_KEY = "sLJNiDC9803yIF+qGKW9Yg==";
    /**
     * 编码
     */
    public static String CHARSET = "UTF-8";
    public static String RSA_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCkOwEcxyJyIDlN6sVw0BcClKy01pONRMjw2ukHccwNbDraRouhTgRcpBadTc0rDQRfbJ8LIrKKq02jx8nGJZCHvStxE09s5VExHeeyOkiaFg2hRZQwiHGA145tynGLMCyaWoAxltBu+ylmEXicwdEbDCszYR5jx74DnkCXPFILtKpc228b8ydOEKcU+j+AISGO9VjWKTrz6SOq6VFb6BmQ9YludTIogTJL9w4TSLgjpZOauzNmqb2VvXDXdk05lBiOR+/2mHsFnfacmwFRHJ7Qw8qWy0qMc8WY12NKyj0LnjezgyEWHDgrnY8SsAbug3b2f2hjomofUTX7SZFt8XElAgMBAAECggEBAI5siTtuysWUgn27Az0hiUL4soolqFKT+3s9LWgCXUaqvKM9GKxr30aEGwSSS0JxiIBEz+y1S4cMpklJ4wdO3neJK1plt7SlbnMdDyk2eG4AgBODJs+sFFr7FQ7LyQo/Xf8CSzg2JU6JzE4zCplPUEuXkwN8zwETYQr8O+GsMy7oOq1OTa60dh4uxXnnu966Ypj1GnvSoNyZ3nm+bL6I3LIO2v+aWpvBtUn1rQh6kgAl0ixieQOGLnj/zqv0y6tbN/bKmHT0/f3jWgwWpXVLUm7A10+xJa35MvXe6LRjSNe3bpdNx0cigeobXdgZFrIJupoIjD8+KNjtlSvwjZbBESUCgYEA4Z9AepnmzwxLdGkAI5S5zjOhnoTUmdpl1fc5YvDOO4lC3ZT0IGsZrv+Gp32MrhxZHpP/+e0EiY8WKrmpAQ5QtS9GL8prFu/OFUpMht+ARPU6TfuAgs8F0EwyLeeDsEVBCQJFzhP/aKXPuj4pBPzqsUHSBfVyfn5Yb+Mrp5CLr28CgYEAule0kihEvlRnqxqUDEK44N7JEitT3EjhiE3dPfbB8o5ufEYDzycdEhcAJ4iSAfi93l3dDL0i6a6oI+O58JwuY0kWKIwlz31vhnIpgBQyn6Mn6j8/9rynxCl7Kun+ZkbiDEEAJQnAs+G4qVpYTcSbMnwhSqF9LDXobWhH0HkP3qsCgYEAotPsk854HVrRJb0VhZgzFBZ9AEr6p+JO9kEKYFZLb/oakJGMMc05ZuswgbYBDjKVOpUy+mrMiH4EUGdXCdUL+AabD6h06sO8Je9OFVQ9XQbhwh/M2hqQJoim+iwIBPGmAttqB1S1Ug/AP7fWoKvqsGxBJ13A+Hs0VeNLwQ13Ue8CgYBMegxo48/60UdOyPSz53pbB/Q72b5sLRkqyNIhSTGmK+Cabl3H2gSrVPdCQmGyH3VFWv6K6OD4SS9Gs4Kvhlnfc7J9Z69o7dEku5verets6xhJojXNPPYZovCi1zAKp9LENrUpfkwxR1VzY9nT6PnNCXbcW1S1HVbL+D1pCRaDSwKBgQCf9ADXJ/iL3KbemY755dJ9Ifz6g4xF5ROUuJbDZp8xecmSee4xJ1yP3OPtn5nieJDA6/8wdTfmrfHjjsd87BJn5itY9lofA/rJ+9ZtpZ0Cr5jWboK8aVbD89mFU+rdfln/+wO2Utt1vhsd6eKcO16rTyC/jFSleYU+OW5jz8PibQ==";


    public static String SIGNTYPE = "RSA2";
    /**
     * 支付宝公钥
     */
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApDsBHMciciA5TerFcNAXApSstNaTjUTI8NrpB3HMDWw62kaLoU4EXKQWnU3NKw0EX2yfCyKyiqtNo8fJxiWQh70rcRNPbOVRMR3nsjpImhYNoUWUMIhxgNeObcpxizAsmlqAMZbQbvspZhF4nMHRGwwrM2EeY8e+A55AlzxSC7SqXNtvG/MnThCnFPo/gCEhjvVY1ik68+kjqulRW+gZkPWJbnUyKIEyS/cOE0i4I6WTmrszZqm9lb1w13ZNOZQYjkfv9ph7BZ32nJsBURye0MPKlstKjHPFmNdjSso9C543s4MhFhw4K52PErAG7oN29n9oY6JqH1E1+0mRbfFxJQIDAQAB";
    /**
     * 支付宝网关地址
     */
    private static String GATEWAY = "https://openapi.alipaydev.com/gateway.do";
    /**
     * 成功付款回调
     */
    public static String PAY_NOTIFY = "https://openapi.alipay.com/gateway.do";
    /**
     * 支付成功回调
     */
    public static String REFUND_NOTIFY = "https://openapi.alipay.com/gateway.do";
    /**
     * 前台通知地址
     */
    public static String RETURN_URL = "https://openapi.alipay.com/gateway.do";
    /**
     * 参数类型
     */
    public static String PARAM_TYPE = "json";
    /**
     * 成功标识
     */
    public static final String SUCCESS_REQUEST = "TRADE_SUCCESS";
    /**
     * 交易关闭回调(当该笔订单全部退款完毕,则交易关闭)
     */
    public static final String TRADE_CLOSED = "TRADE_CLOSED";
    /**
     * 收款方账号
     */
    public static final String SELLER_ID = "18687269789";
    /**
     * 支付宝请求客户端入口
     */
    private volatile static AlipayClient alipayClient = null;

    /**
     * 不可实例化
     */
    private AlipayConfig(){};

    /**
     * 双重锁单例
     * @return 支付宝请求客户端实例
     */
    public static AlipayClient getInstance(){
        if (alipayClient == null){
            synchronized (AlipayConfig.class){
                if (alipayClient == null){
                    alipayClient = new DefaultAlipayClient(GATEWAY,APP_ID,RSA_PRIVATE_KEY,PARAM_TYPE,CHARSET,ALIPAY_PUBLIC_KEY,SIGNTYPE);
                }
            }
        }
        return alipayClient;
    }
}
