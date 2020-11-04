package com.coldchain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.Seller;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 卖家用户表 服务类
 * </p>
 *
 * @author dyr
 * @since 2019-11-14
 */
@FeignClient(name ="seller")
public interface SellerService {

    @PostMapping("login")
    String login(@RequestBody Seller loginSeller);

    @GetMapping("/credential")
    Seller credential(@RequestParam(value = "seller_name", required = false) String sellerName);
}
