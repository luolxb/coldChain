package com.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IpUtil {

    public String getIp() {
        String url = "https://httpbin.org/ip";
        JSONObject forObject = new RestTemplate().getForObject(url, JSONObject.class);
        return forObject.get("origin").toString();
    }

}
