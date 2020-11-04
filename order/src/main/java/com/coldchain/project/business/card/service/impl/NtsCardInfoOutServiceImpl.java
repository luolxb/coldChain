package com.coldchain.project.business.card.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.coldchain.common.exception.NtsException;
import com.coldchain.project.business.card.service.NtsCardInfoOutService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;

/**
 * @PackageName: com.coldchain.project.business.card.service.impl
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-13 17:46
 **/
@Slf4j
@Service
public class NtsCardInfoOutServiceImpl implements NtsCardInfoOutService {

    @Autowired
    private RestTemplate restTemplate;

    private static final Integer SUCCESS_CODE = 200;

    /**
     * 使用基于API_KEY和API_SECRET的API认证。用户首先需要在 物联卡管理平台上申请自己的API_KEY和API_SECRET.
     */
    @Value("${app.secret}")
    private String SECRET;

    @Value("${app.apiKey}")
    private String API_KEY;

    /**
     * 基本URL
     */
    @Value("${app.base.url}")
    private String BASE_URL;

    /**
     * 获取所有的卡号 url
     */
    @Value("${cardNoListUrl}")
    private String cardNoListUrl;

    /**
     * 物联卡信息 url
     * 单张物联卡信息查询
     */
    @Value("${cardInfoUrl}")
    private String cardInfoUrl;

    /**
     * 物联卡用量日志  url
     * 物联卡当月或指定月份用量日志查询
     */
    @Value("${cardUsagelogUrl}")
    private String cardUsagelogUrl;

    @Value("${cardUsagelogUrl2}")
    private String cardUsagelogUrl2;

    /**
     * 物联卡每日使用量  url
     * 物联卡查询指定月份每日使用量
     */
    @Value("${cardUsagedeltaUrl}")
    private String cardUsagedeltaUrl;

    /**
     * 查询物联卡实时开关机状态和移动网络在线状态 url
     */
    @Value("${statusUrl}")
    private String statusUrl;

    /**
     * 账户余额查询 url
     * 获取用户账户下流量充值的余额及短信条数余额。
     */
    @Value("${balanceUrl}")
    private String balanceUrl;

    /**
     * 物联卡充值产品查询
     */
    @Value("${chargeProductsUrl}")
    private String chargeProductsUrl;

    /**
     * 公告
     */
    @Value("${noticeUrl}")
    private String noticeUrl;

    /**
     * 实名认证状态查询
     */
    @Value("${realnameStatusUrl}")
    private String realnameStatusUrl;


    /**
     * 获取所有的卡号
     */
    @Override
    public List getCardNoList() {
        //MD5 加密
        String encode = getMD5String(SECRET);
        String url = cardNoListUrl + encode;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("获取获取所有的卡号==>{}", jsonObject);
        JSONObject data = (JSONObject) jsonObject.get("data");
        List<JSONObject> rows = (List) data.get("rows");
        return rows;
    }


    /**
     * 物联卡信息
     * 单张物联卡信息查询
     *
     * @param iccid
     * @return
     */
    @Override
    public Object getCardInfo(String iccid) {
        String formatUrl = String.format(cardInfoUrl, iccid);
        //MD5 加密
        String encode = getMD5String(SECRET);
        String url = formatUrl + encode;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("单张物联卡信息查询==>{}", jsonObject);
        JSONObject data = (JSONObject) jsonObject.get("data");
        return data;
    }

    /**
     * * 物联卡用量日志
     * * 物联卡当月或指定月份用量日志查询
     *
     * @param iccid
     * @return
     */
    @Override
    public List getCardUsagelog(String iccid, String date) {
        String formatUrl = null;
        if (StringUtils.isBlank(date)) {
            formatUrl = String.format(cardUsagelogUrl, iccid);
        } else {
            formatUrl = String.format(cardUsagelogUrl2, iccid, date);
        }
        //MD5 加密
        String encode = getMD5String(SECRET);
        String url = formatUrl + encode;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("物联卡用量日志==>{}", jsonObject);

        JSONObject data = (JSONObject) jsonObject.get("data");
        List<JSONObject> rows = (List) data.get("rows");
        return rows;
    }

    /**
     * * 物联卡每日使用量
     * * 物联卡查询指定月份每日使用量
     *
     * @param iccid
     * @param date
     * @return
     */
    @Override
    public Object getCardUsagedelta(String iccid, String date) {
        String formatUrl = String.format(cardUsagedeltaUrl, iccid, date);
        //MD5 加密
        String encode = getMD5String(SECRET);
        String url = formatUrl + encode;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("物联卡每日使用量==>{}", jsonObject);

        JSONObject data = (JSONObject) jsonObject.get("data");
        List<JSONObject> rows = (List) data.get("rows");
        return rows;
    }

    /**
     * 查询物联卡实时开关机状态和移动网络在线状态
     *
     * @param iccid
     * @return
     */
    @Override
    public Object getStatus(String iccid) {
        String formatUrl = String.format(statusUrl, iccid);
        //MD5 加密
        String encode = getMD5String(SECRET);
        String url = formatUrl + encode;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("查询物联卡实时开关机状态和移动网络在线状态==>{}", jsonObject);
        JSONObject data = (JSONObject) jsonObject.get("data");
        return data;
    }

    /**
     * 账户余额查询
     * 获取用户账户下流量充值的余额及短信条数余额。
     *
     * @return
     */
    @Override
    public Object getBalance() {
        String secret = getMD5String(SECRET);
        String url = balanceUrl + secret;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("账户余额查询==>{}", jsonObject);
        JSONObject data = (JSONObject) jsonObject.get("data");
        return data;
    }

    /**
     * 物联卡充值产品查询
     *
     * @return
     */
    @Override
    public List chargeProducts(String iccid) {
        String secret = getMD5String(SECRET);
        String formatUrl = String.format(chargeProductsUrl, iccid);
        String url = formatUrl + secret;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("物联卡充值产品查询==>{}", jsonObject);
        JSONObject data = (JSONObject) jsonObject.get("data");
        List<JSONObject> rows = (List<JSONObject>) data.get("rows");
        return rows;
    }

    /**
     * 公告
     *
     * @return
     */
    @Override
    public Object notice() {
        String secret = getMD5String(SECRET);
        String url = noticeUrl + secret;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("公告==>{}", jsonObject);
        return jsonObject.get("data");
    }

    /**
     * 实名认证状态查询
     *
     * @param iccid
     * @return
     */
    @Override
    public Object realnameStatus(String iccid) {
        String secret = getMD5String(SECRET);
        String formatUrl = String.format(realnameStatusUrl, iccid);
        String url = formatUrl + secret;
        JSONObject jsonObject = getRequestHttpMethod(url, HttpMethod.GET);
        log.info("实名认证状态查询==>{}", jsonObject);
        return jsonObject.get("data");
    }

    /**
     * get HttpMethod请求方法
     *
     * @param url
     * @param method
     * @return
     */
    public JSONObject getRequestHttpMethod(String url, HttpMethod method) {
        HttpHeaders headers = new HttpHeaders();
        // 设置请求头 Content-Type 为 application/json
        headers.set("Content-Type", "application/json");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, method, entity, String.class);
        JSONObject jsonObject = JSONObject.parseObject(responseEntity.getBody());
        log.info("HttpMethod请求方法 返回信息 ==>{}", jsonObject);
        Integer code = (Integer) jsonObject.get("code");
        if (!SUCCESS_CODE.equals(code)) {
            log.error("getRequestHttpMethod error==>{}", url + jsonObject.get("msg"));
            throw new NtsException((String) jsonObject.get("msg"),code );
        }
        return jsonObject;
    }

    /**
     * MD5加密方法
     *
     * @param str
     * @return
     */
    public static String getMD5String(String str) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
