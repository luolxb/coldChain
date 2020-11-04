package com.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
import org.slf4j.LoggerFactory;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.slf4j.LoggerFactory;


public class WechatUtil {

    public static JSONObject getSessionKeyOrOpenId(String code, String appid, String secret) {

        //微信端登录code值
        String wxCode = code.trim();
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";//resource.getString("url");  //请求地址 https://api.weixin.qq.com/sns/jscode2session
        Map<String, String> requestUrlParam = new HashMap<String, String>();
        requestUrlParam.put("appid", appid.trim());//"wxa1d1f519b7d51fc7");//resource.getString("appId"));  //开发者设置中的appId
        requestUrlParam.put("secret", secret.trim());//"4d2d87a85cbfb470eda7a05224c5b9a5");//resource.getString("appSecret")); //开发者设置中的appSecret
        requestUrlParam.put("js_code", wxCode); //小程序调用wx.login返回的code
        requestUrlParam.put("grant_type", "authorization_code");//resource.getString("grantType"));    //默认参数 authorization_code
        //发送post请求读取调用微信 https://api.weixin.qq.com/sns/jscode2session 接口获取openid用户唯一标识
        JSONObject jsonObject = JSON.parseObject(sendPost(requestUrl, requestUrlParam));
        return jsonObject;
    }

    public static String ALLATORIxDEMO(String a) {

        int var10000 = (2 ^ 5) << 4;
        int var10002 = 3 << 3 ^ 2;
        String str;
        int var10003 = (str = (String) a).length();
        char[] var10004 = new char[var10003];
        boolean var10006 = true;
        int var5 = var10003 - 1;
        var10003 = var10002;
        int var3;
        var10002 = var3 = var5;
        char[] var1 = var10004;
        int var4 = var10003;
        var10003 = var10002;
        var10002 = var10000;
        boolean var10001 = true;
        var10000 = var10003;

        for (int var2 = var10002; var10000 >= 0; var10000 = var3) {
            int var6 = var3;
            char var7 = str.charAt(var3);
            --var3;
            var1[var6] = (char) (var7 ^ var2);
            if (var3 < 0) {
                break;
            }

            var10002 = var3--;
            var1[var10002] = (char) (str.charAt(var10002) ^ var4);
        }

        return new String(var1);
    }

    public static JSONObject getUserInfo(String encryptedData, String sessionKey, String iv) {
        // 被加密的数据
        byte[] dataByte = Base64Utils.decode(encryptedData.getBytes());
        // 加密秘钥
        byte[] keyByte = Base64Utils.decode(sessionKey.getBytes());
        // 偏移量
        byte[] ivByte = Base64Utils.decode(iv.getBytes());
        try {

            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, "UTF-8");
                return JSON.parseObject(result);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }


    public WechatUtil() {
    }

    public static String getCookie(HttpServletRequest http, String a) {
        Cookie[] var2;
        if ((var2 = http.getCookies()) != null) {
            int var3 = (var2 = var2).length;

            int var4;
            for (int var10000 = var4 = 0; var10000 < var3; var10000 = var4) {
                Cookie var5;
                if ((var5 = var2[var4]).getName().equals(a)) {
                    return var5.getValue();
                }

                ++var4;
            }
        }

        return null;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url 发送请求的 URL
     * @return 所代表远程资源的响应结果
     */
    private static String sendPost(String url, Map<String, ?> paramMap) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";

        String param = "";
        Iterator<String> it = paramMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            param += key + "=" + paramMap.get(key) + "&";
        }

        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("Accept-Charset", "utf-8");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

}
