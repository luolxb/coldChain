package com.coldchain.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.common.vo.SBApi;
import com.coldchain.entity.DcGoodInfo;
import com.coldchain.entity.DepositCertificate;
import com.coldchain.entity.Goods;
import com.coldchain.entity.Seller;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.AuthService;
import com.coldchain.service.DepositCertificateService;
import com.coldchain.service.MallService;
import com.coldchain.service.SellerService;
import com.coldchain.service.impl.AuthenticationFacade;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import netscape.javascript.JSObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

@RestController
@Slf4j
public class IndexController {

    @Value("${security.oauth2.client.scope}")
    private String scope;
    @Value("${security.oauth2.client.id}")
    private String clientId;
    @Value("${security.oauth2.client.client-secret}")
    private String clientSecret;
    @Autowired
    private AuthService authService;
    @Autowired
    private SellerService sellerService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private DepositCertificateService depositCertificateService;

    @Autowired
    private MallService mallService;

    @PreAuthorize("hasAnyRole('ROLE_SELLER')")
    @GetMapping("/index")
    public String index() {

        System.out.println("IndexController ==> index");
        return "你好~";
    }

    @PostMapping("/login")
    public String login(@RequestBody Seller loginSeller) {
//        if (!authService.verify(loginSeller.getVerification())) {
//            throw new ShopException(ResultEnum.VERIFY_ERROR);
//        }
        String resultStr = authService.getToken("password", scope, clientId,
                clientSecret, "{seller}" + loginSeller.getSellerName(), loginSeller.getPassword());
        sellerService.update((new UpdateWrapper<Seller>()).set("last_login_time", System.currentTimeMillis() / 1000)
                .eq("seller_name", loginSeller.getSellerName()));
        if(checkExist(loginSeller.getSellerName())==true){
            Seller seller= sellerService.getOne(new QueryWrapper<Seller>().eq("seller_name",loginSeller.getSellerName()));
            JSONObject obj= JSONObject.parseObject(resultStr);
            obj.put("userId",seller.getUserId());
            obj.put("userName",seller.getSellerName());
            obj.put("mobile",seller.getMobile());
            resultStr = obj.toJSONString();
        }
        return resultStr;
    }

    @GetMapping("/check")
    public Boolean checkExist(@RequestParam String SellerName){
        return sellerService.count(new QueryWrapper<Seller>().eq("seller_name",SellerName))>=1?true:false;
    }


}
