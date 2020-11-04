package com.coldchain.common.utils;



import com.alibaba.fastjson.JSONObject;
import com.coldchain.common.utils.http.HttpUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaiDuMapUtils {

    private static  final String BAIDU_SK = "52aLztO88bhytKqPw06PW432BEFWQj0p";
    private static  final String BAIDU_AK = "7nuR9z5jmvdk0BqBRVQmrkG6QKWeNOgM";
    private static  final String BAIDU_MAP_API = "http://api.map.baidu.com/reverse_geocoding/v3/";

    public static String formattedAddress(String location) throws UnsupportedEncodingException {
        String address = null;
        Map paramsMap = new LinkedHashMap<String, String>();
        paramsMap.put("output", "json");
        paramsMap.put("coordtype", "wgs84ll");
        paramsMap.put("location", location);
        paramsMap.put("ak", BAIDU_AK);
        //获取sn
        String baiduApiSn = baiduSnCal(paramsMap);
       //拼接参数
        String paramsStr = toQueryString(paramsMap);
        String wholeStr = new String(paramsStr + "&sn="+baiduApiSn);
        address = HttpUtils.sendGet(BAIDU_MAP_API,wholeStr);
        JSONObject jsStr = JSONObject.parseObject(address);
        String result = jsStr.getString("result").toString();
        jsStr = JSONObject.parseObject(result);
        String formatted_address = jsStr.getString("formatted_address").toString();
        String addressComponent = jsStr.getString("addressComponent").toString();
        result = jsStr.getString("addressComponent").toString();
        jsStr = JSONObject.parseObject(addressComponent);
        String country = jsStr.getString("country").toString();
        address = country+formatted_address;
        return address;
    }



    private static String baiduSnCal(Map<?, ?> data) throws UnsupportedEncodingException {
        String paramsStr = toQueryString(data);
        String wholeStr = new String("/reverse_geocoding/v3/?" + paramsStr + BAIDU_SK);
        String tempStr = URLEncoder.encode(wholeStr, "UTF-8");

        return MD5(tempStr);
    }


    // 对Map内所有value作utf8编码，拼接返回结果
    private static String toQueryString(Map<?, ?> data)
            throws UnsupportedEncodingException {
        StringBuffer queryString = new StringBuffer();
        for (Map.Entry<?, ?> pair : data.entrySet()) {
            queryString.append(pair.getKey() + "=");
            String ss[] = pair.getValue().toString().split(",");
            if(ss.length>1){
                for(String s:ss){
                    queryString.append(URLEncoder.encode(s,"UTF-8") + ",");
                }
                queryString.deleteCharAt(queryString.length()-1);
                queryString.append("&");
            }
            else{
                queryString.append(URLEncoder.encode((String) pair.getValue(), "UTF-8") + "&");
            }
        }

        if (queryString.length() > 0) {

            queryString.deleteCharAt(queryString.length() - 1);

        }

        return queryString.toString();
    }

    // 来自stackoverflow的MD5计算方法，调用了MessageDigest库函数，并把byte数组结果转换成16进制
    private static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest
                    .getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {


        System.out.println(BaiDuMapUtils.formattedAddress("22.491199,113.868859"));
    }
}
