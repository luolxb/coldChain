package com.coldchain.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.*;
import com.common.enums.UserIdentityEnum;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.coldchain.service.*;
import com.coldchain.service.impl.AuthenticationFacade;
import com.common.utils.NtsUtil;
import com.common.vo.SBApi;
import com.coldchain.vo.StoreAddVo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 卖家用户表 前端控制器
 * </p>
 *
 * @author dyrdd
 * @since 2019-11-14
 */
@Slf4j
@RestController
public class SellerController {

    @Autowired
    private SellerService sellerService;
    @Autowired
    private AuthenticationFacade authenticationFacade;
    @Autowired
    private StoreBindClassService storeBindClassService;
    @Autowired
    private UserService userService;
    @Autowired
    private DepositCertificateService depositCertificateService;

    @Value("${security.salt}")
    private String salt;

    @Autowired
    private StoreService storeService;

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    //这里是认证服务要用用户信息，不要乱修改
    @GetMapping("/credential")
    @ApiOperation(value = "获取用户凭证")
    public Seller credential(@RequestParam(value = "seller_name", required = false) String sellerName,
                             @RequestParam(value = "user_id", required = false) Integer userId) {
        QueryWrapper<Seller> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("seller_id,seller_name,user_id,store_id");
        if (null != sellerName) {
            queryWrapper.eq("seller_name", sellerName);
        }
        if (null != userId) {
            queryWrapper.eq("user_id", userId);
        }
        return sellerService.getOne(queryWrapper);
    }



    @PreAuthorize("hasAnyRole('SELLER')")
    @GetMapping("/current")
    public Seller getSelf() {
        return sellerService.getById((authenticationFacade.getPrincipal(Seller.class)).getSellerId());
    }

    @GetMapping("/list")
    public List<Seller> sellers(@RequestParam(value = "seller_ids", required = false) Set<Integer> sellerIds) {
        return sellerService.list();
    }



    @PreAuthorize("hasAnyRole('SELLER')")
    @PutMapping("/open_teach")
    public SBApi updateOpenTeach(@RequestParam("open_teach") Integer openTeach) {
        sellerService.update(new UpdateWrapper<Seller>().set("open_teach", openTeach)
                .eq("seller_id", getSelf().getSellerId()));
        return new SBApi();
    }

    @PreAuthorize("hasAnyRole('SELLER')")
    @GetMapping("/seller/page")
    public Page<Seller> sellerPage(@RequestParam(value = "seller_name", required = false) String sellerName,
                                   @RequestParam(value = "p", defaultValue = "1") Integer page,
                                   @RequestParam(value = "size", defaultValue = "20") Integer size) {
        Seller seller = authenticationFacade.getPrincipal(Seller.class);
        QueryWrapper<Seller> sellerQueryWrapper = new QueryWrapper<>();
        sellerQueryWrapper.select("seller_id,seller_name,add_time,enabled,is_admin,user_id");
        sellerQueryWrapper.eq("store_id", seller.getStoreId());
        if (!StringUtils.isEmpty(sellerName)) {
            sellerQueryWrapper.like("seller_name", sellerName);
        }
        return (Page<Seller>) sellerService.page((new Page<>(page, size)), sellerQueryWrapper);
    }

    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/seller/list")
    public Page<Seller> getSellerList(@RequestParam(value = "seller_name", required = false) String sellerName,
                                      @RequestParam(value = "p", defaultValue = "1") Integer page,
                                      @RequestParam(value = "size", defaultValue = "20") Integer size) {
        QueryWrapper<Seller> sellerQueryWrapper = new QueryWrapper<>();
        sellerQueryWrapper.select("seller_id,seller_name,add_time,enabled,is_admin,user_id");
        if (!StringUtils.isEmpty(sellerName)) {
            sellerQueryWrapper.like("seller_name", sellerName);
        }
        return (Page<Seller>) sellerService.page((new Page<>(page, size)), sellerQueryWrapper);
    }

    @PreAuthorize("hasAnyRole('SELLER')")
    @PostMapping("/seller")
    public SBApi addSeller(@RequestBody Seller seller) {
        if (sellerService.count(new QueryWrapper<Seller>().eq("seller_name", seller.getSellerName())) > 0) {
            throw new ShopException(ResultEnum.SAME_SELLER_NAME);
        }
        User user = userService.getUserByMobileOrEmail(seller.getMobile(), seller.getEmail());
        if (user != null) {
            if (!passwordEncoder.matches(seller.getPassword(), user.getPassword().replace(salt, ""))) {
                //登陆密码错误
                throw new ShopException(ResultEnum.USER_PWD_ERROR);
            }
            if (sellerService.count(new QueryWrapper<Seller>().eq("user_id", user.getUserId())) > 0) {
                //该用户已经添加过店铺管理员
                throw new ShopException(ResultEnum.SELLER_USER_EXISTS);
            }
            seller.setAddTime(System.currentTimeMillis() / 1000);
            seller.setUserId(user.getUserId());
            sellerService.save(seller);
        } else {
            //请先注册前台会员
            throw new ShopException(ResultEnum.USER_NOT_EXISTS);
        }
        return new SBApi();
    }

    @PostMapping("member/add")
    public SBApi addSellerByInner(@RequestBody final OEMUser applyer) {
        Seller seller = new Seller();
        if (sellerService.count(new QueryWrapper<Seller>().eq("seller_name", applyer.getNikename())) > 0) {
            throw new ShopException(ResultEnum.SAME_SELLER_NAME);
        }
        if(applyer.getNikename()==null){
            applyer.setNikename(applyer.getMobile());
        }
        User user = userService.getUserByMobileOrEmail(applyer.getMobile(), applyer.getEmail());
        if (user != null) {
            if (!passwordEncoder.matches(applyer.getPassword(), user.getPassword().replace(salt, ""))) {
                //登陆密码错误
                throw new ShopException(ResultEnum.USER_PWD_ERROR);
            }
            if (sellerService.count(new QueryWrapper<Seller>().eq("user_id", user.getUserId())) > 0) {
                throw new ShopException(ResultEnum.SELLER_USER_EXISTS);
            }
            seller = sellerService.getOne(new QueryWrapper<Seller>().eq("seller_name",applyer.getNikename()));
            seller.setAddTime(System.currentTimeMillis() / 1000);
            seller.setUserId(user.getUserId());
            sellerService.save(seller);
            SBApi sb= new SBApi();
            sb.setStatus(-1);
            return sb;
        }
        UserInfo userInfo= new UserInfo();
        userInfo.setNickName(applyer.getNikename());
        userInfo.setMobile(applyer.getMobile());
        userInfo.setPassword(applyer.getPassword());
        userInfo.setEmail(applyer.getEmail());
        Integer userId= userService.addInnerSeller(userInfo);
        user = userService.getUserByMobileOrEmail(applyer.getMobile(), applyer.getEmail());
        seller.setUserId(userId);
        seller.setSellerName((applyer.getMobile()!=null)?applyer.getNikename():applyer.getMobile());
        seller.setPassword(user.getPassword());
        seller.setAddTime(user.getRegTime());
        seller.setMobile(user.getMobile());
        sellerService.save(seller);
        return new SBApi();

    }

    @PreAuthorize("hasAnyRole('SELLER')")
    @PutMapping("/seller/update")
    public SBApi updateSeller(@RequestBody Seller seller) {
        User user = userService.getUserById(seller.getUserId());
        if (null != user) {
            if (!passwordEncoder.matches(seller.getPassword(), user.getPassword().replace(salt, ""))) {
                //登陆密码错误
                throw new ShopException(ResultEnum.USER_PWD_ERROR);
            }
            if (!seller.getNewPwd().equals(seller.getCheckNewPwd())) {
                throw new ShopException(ResultEnum.USER_PWD_NOT_SAME);
            }
            user.setPassword(salt + passwordEncoder.encode(seller.getNewPwd()));
            userService.updateUser(user);
            sellerService.updateById(seller);
        } else {
            throw new ShopException(ResultEnum.ACCOUNT_NOT_EXISTS);
        }
        return new SBApi();
    }

    @PreAuthorize("hasAnyRole('SELLER','ADMIN')")
    @GetMapping("/seller/{seller_id}")
    public Seller getSeller(@PathVariable(value = "seller_id") Integer sellerId) {
        return sellerService.getById(sellerId);
    }

    @PreAuthorize("hasAnyRole('SELLER')")
    @DeleteMapping("/seller/assign")
    public SBApi deleteSeller(@PathVariable(value = "seller_id") Integer sellerId) {
        sellerService.removeById(sellerId);
        return new SBApi();
    }

    @GetMapping("/update_depositCertificate")
    public SBApi updateDepositCertificateStatus(@RequestParam(value = "user_id", required = true) Integer userId,
                                                @RequestParam(value = "dc_id", required = true) Integer dcId,
                                                @RequestParam(value = "sale_status", required = false) Integer saleStatus,
                                                @RequestParam(value = "send_status", required = false) Integer sendStatus) {

        DepositCertificate depositCertificate = depositCertificateService.getOne(new QueryWrapper<DepositCertificate>().eq("id", dcId));



        return new SBApi();
    }

    @GetMapping("/depositCertificate/user_id")
    public List<DepositCertificate> getDepositCertificateByUserId(@RequestParam("user_id") Integer userId) {
        QueryWrapper<DepositCertificate> wrapper = new QueryWrapper<DepositCertificate>();
        wrapper.eq("owner_id", userId);
        return depositCertificateService.list(wrapper);
    }


}
