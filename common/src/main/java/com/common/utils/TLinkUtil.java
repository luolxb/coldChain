package com.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.common.exception.ShopException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class TLinkUtil {

    private final static String BASE_URL = "https://app.dtuip.com/oauth/token?grant_type=password&username=%s&password=%s";
    private static final String LOGIN_API_URL = "https://app.dtuip.com/api/user/userLogin";
    public final static String USER_ID = "49139";
    public final static String API_KEY = "9aca313746514a87b2daf9240a9aa468";
    public final static String USERNAME = "新时空智能";
    public final static String PASSWORD = "tp500123";
    public final static String CLIENTID = "e56fcaf336a24baf8071c509dbe1fb73";
    public final static String SECRET = "80019efa962e47ebb76c85ae83a323b9";
    public final static String SUCCESS_FLAG= "00";
    public final static String FLAG= "flag";
    public final static String UserId= "49139";


    public static String toUtf8(String str) {
        try {
            return new String(str.getBytes("UTF-8"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new ShopException(-10, e.getMessage());
        }
    }
    public static String getoken() {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(BASE_URL, toUtf8(USERNAME), PASSWORD);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("authorization", "Basic " + Base64.getEncoder().encodeToString((CLIENTID + ":" + SECRET).getBytes()));
        httpHeaders.add("Content-Type", "text/plain");
        httpHeaders.add("cache-control", "no-cache");
        HttpEntity httpEntity = new HttpEntity<>(null, httpHeaders);
        String s = restTemplate.postForObject(url, httpEntity, String.class);
        JSONObject jsonObject = JSONObject.parseObject(s);
        return (String) jsonObject.get("access_token");
    }


    public static Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<String, String>();
        header.put("accesstoken", "Bearer" + TLinkUtil.getoken());
        header.put("clientId", TLinkUtil.CLIENTID);
        return header;
    }

    public static  String getTLinkUserId(){
        return USER_ID;
    }

}
