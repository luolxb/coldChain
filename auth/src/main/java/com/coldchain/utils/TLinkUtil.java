package com.coldchain.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

public class TLinkUtil {

    private final static String BASE_URL = "https://app.dtuip.com/oauth/token?grant_type=password&username=%s&password=%s";

    public final static String USERNAME = "新时空智能";
    public final static String PASSWORD = "tp500123";
    public final static String CLIENTID = "e56fcaf336a24baf8071c509dbe1fb73";
    public final static String SECRET = "80019efa962e47ebb76c85ae83a323b9";

    public static String getoken() {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(BASE_URL, USERNAME, PASSWORD);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("authorization", "Basic " + Base64.getEncoder().encodeToString((CLIENTID + ":" + SECRET).getBytes()));
        httpHeaders.add("Content-Type", "text/plain");
        httpHeaders.add("cache-control", "no-cache");
        HttpEntity httpEntity = new HttpEntity<>(null, httpHeaders);
        String s = restTemplate.postForObject(url, httpEntity, String.class);
        JSONObject jsonObject = JSONObject.parseObject(s);
        return (String) jsonObject.get("access_token");
    }

    public static void main(String[] args) {
        System.out.println(getoken());
    }
}
