package com.coldchain.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.*;
import com.coldchain.service.*;
import com.coldchain.validation.annotation.Phone;
import com.coldchain.vo.*;

import com.coldchain.dto.StoreMemberCountDto;

import com.coldchain.service.impl.AuthenticationFacade;

import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.common.vo.SBApi;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.apache.commons.lang.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RestController
@Api(
        value = "用户控制器",
        tags = {"用户相关接口"})
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private SmsLogService smsLogService;

    @Value("${security.salt}")
    private String salt;

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    //这里是认证服务要用用户信息和密码，不要乱修改
    @GetMapping("credential")
    @ApiOperation(value = "获取用户凭证")
    public User credential(@RequestParam(value ="mobile", required = false) String mobile,
                           @RequestParam(value ="email", required = false) String email,
                           @RequestParam(value = "user_id", required = false) Integer userId) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("user_id,password,mobile,nickname,identity");
        if(!StringUtils.isEmpty(mobile)){
            userQueryWrapper.eq("mobile", mobile)
            .or()
            .eq("nickname",mobile);
        }
        if(!StringUtils.isEmpty(email)){
            userQueryWrapper.eq("email", email);
        }
        if(null != userId){
            userQueryWrapper.eq("user_id", userId);
        }
        User user =  userService.getOne(userQueryWrapper);
        return user;
    }


    @GetMapping("check")
    Integer checkUser(@RequestParam(value = "mobile", required = false) String mobile,
                      @RequestParam(value = "nickname", required = false) String nickname){
        if(!StringUtils.isEmpty(nickname)){
            QueryWrapper<User> userQueryWrapper2 = new QueryWrapper<>();
            userQueryWrapper2.eq("nickname", nickname);
            User user = userService.getOne(userQueryWrapper2);
            if(user!=null){
                return 1;
            }
        }
        if(!StringUtils.isEmpty(mobile)){
            QueryWrapper<User> userQueryWrapper1 = new QueryWrapper<>();
            userQueryWrapper1.eq("mobile", mobile);
            User user = userService.getOne(userQueryWrapper1);
            if(user!=null){
                return 1;
            }
        }
        return 0;
    }


    @GetMapping("/get/user_id")
    Integer getUserIdByMobileOrEmail(@RequestParam(value = "mobile", required = false) String mobile,
                                     @RequestParam(value = "email", required = false) String email){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("user_id,password");
        if(!StringUtils.isEmpty(mobile)){
            userQueryWrapper.eq("mobile", mobile);
        }
        if(!StringUtils.isEmpty(email)){
            userQueryWrapper.eq("email", email);
        }
        User user = userService.getOne(userQueryWrapper);
        return (user!=null)?user.getUserId():-1;
    }
    @GetMapping("/user")
    @ApiOperation(value = "根据手机或者邮箱获取用户")
    public User getUser(@RequestParam(value ="mobile", required = false) String mobile,
                           @RequestParam(value ="email", required = false) String email,
                           @RequestParam(value = "user_id", required = false) Integer userId) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("user_id,nickname,head_pic");
        if(StringUtils.isNotEmpty(mobile)){
            userQueryWrapper.eq("mobile", mobile);
        }
        if(StringUtils.isNotEmpty(email)){
            userQueryWrapper.eq("email", email);
        }
        if(null != userId){
            userQueryWrapper.eq("user_id", userId);
        }
        return userService.getOne(userQueryWrapper);
    }

    @GetMapping("/user1")
    @ApiOperation(value = "根据手机或者邮箱获取用户")
    public User getUser1(@RequestParam(value ="mobile", required = false) String mobile,
                           @RequestParam(value ="email", required = false) String email,
                           @RequestParam(value = "user_id", required = false) Integer userId) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("user_id,nickname,head_pic,user_money");

        if(StringUtils.isNotEmpty(mobile)){
            userQueryWrapper.eq("mobile", mobile);
        }
        if(StringUtils.isNotEmpty(email)){
            userQueryWrapper.eq("email", email);
        }
        if(null != userId){
            userQueryWrapper.eq("user_id", userId);
        }
        return userService.getOne(userQueryWrapper);
    }

    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("current")
    @ApiOperation(value = "获取用户信息")
    public User getUser() {
        Integer userId = authenticationFacade.getUser().getUserId();
        return userService.getById(userId);//不能把密码给屏蔽掉，订单服务要用的！！！
    }

    @PreAuthorize("hasAnyRole('SELLER')")
    @GetMapping("seller/user")
    public User getUser(
            @RequestParam(value = "user_id", required = false) Integer userId,
            @RequestParam(value = "mobile", required = false) String mobile,
            @RequestParam(value = "email", required = false) String email) {
        if (userId != null) {
            return userService.getById(userId);
        } else if (!StringUtils.isEmpty(mobile)) {
            return userService.getOne(new QueryWrapper<User>().eq("mobile", mobile));
        } else if (!StringUtils.isEmpty(email)) {
            return userService.getOne(new QueryWrapper<User>().eq("email", email));
        }
        return null;
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("admin/user")
    public User getUserByAdmin(
            @RequestParam(value = "user_id", required = false) Integer userId) {
        return userService.getById(userId);
    }

    @PutMapping("admin/user")
    public SBApi updateUser(@RequestBody User user, SBApi sBApi) {
        userService.updateById(user);
        return sBApi;
    }

    @GetMapping("/list")
    public List<User> users(@RequestParam(value = "user_ids", required = false) Set<Integer> userIds,
                            @RequestParam(value = "nickname", required = false) String nickname) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        if(null != userIds && userIds.size() > 0){
            userQueryWrapper.in("user_id", userIds);
        }
        if (!StringUtils.isEmpty(nickname)) {
            userQueryWrapper.like("nickname", nickname);
        }
        return userService.list(userQueryWrapper);
    }



    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("page")
    public IPage<User> getPage(
            @RequestParam(value = "user_id", required = false) Integer userId,
            @RequestParam(value = "account", required = false) String account,
            @RequestParam(value = "nickname", required = false) String nickname,
            @RequestParam(value = "first_leader", required = false) Integer firstLeader,
            @RequestParam(value = "second_leader", required = false) Integer secondLeader,
            @RequestParam(value = "third_leader", required = false) Integer thirdLeader,
            @RequestParam(value = "p", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        if (userId != null) {
            userQueryWrapper.eq("user_id", userId);
        }
        if (!StringUtils.isEmpty(account)) {
            userQueryWrapper.and(
                    wrapper -> wrapper.like("email", account).or().like("mobile", account));
        }
        if (!StringUtils.isEmpty(nickname)) {
            userQueryWrapper.like("nickname", nickname);
        }
        if (firstLeader != null) {
            userQueryWrapper.eq("first_leader", firstLeader);
        }
        if (secondLeader != null) {
            userQueryWrapper.eq("second_leader", secondLeader);
        }
        if (thirdLeader != null) {
            userQueryWrapper.eq("third_leader", thirdLeader);
        }
        userQueryWrapper.orderByDesc("user_id");
        return userService.page(new Page<>(page, size), userQueryWrapper);
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("更新用户基本信息")
    @PutMapping
    public SBApi user(@RequestBody User RequestUser) {
        User user = userService.getById(authenticationFacade.getPrincipal(User.class).getUserId());
        userService.updateUserBaseInfo(user, RequestUser);
        return new SBApi();
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("更新用户基本信息")
    @PutMapping("/update")
    public SBApi userUpdate(@RequestBody User requestUser) {
        userService.updateById( requestUser);
        return new SBApi();
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("修改密码")
    @PutMapping("/password")
    public SBApi changePassWord(@Validated @RequestBody UserChangePwdVo userChangePwdVo) {
        User user = userService.getById(authenticationFacade.getPrincipal(User.class).getUserId());
        if (!passwordEncoder.matches(
                userChangePwdVo.getOldPassWord(), user.getPassword().replace(salt, ""))) {
            throw new ShopException(ResultEnum.OLD_PASSWORD_ERROR);
        }
        userService.update(new UpdateWrapper<User>()
                .set("password", salt + passwordEncoder.encode(userChangePwdVo.getNewPassWord()))
                .eq("user_id", user.getUserId()));
        return new SBApi();
    }


    @ApiOperation("添加用户")
    @PostMapping("addUser")
    @PreAuthorize("hasAnyRole('ROLE_SELLER')")
    public Integer addUser(@Valid @RequestBody UserInfo userInfo) {
        Seller seller = authenticationFacade.getPrincipal(Seller.class);
        User user=new User();
        user.setMobile(userInfo.getMobile());
        user.setEmail(userInfo.getEmail());
        user.setNickname(userInfo.getNickName()==null?user.getMobile():user.getBankName());
        user.setIsDistribut(1);// 默认每个人都可以成为分销商
        user.setRegTime(System.currentTimeMillis() / 1000);
        user.setFirstLeader(seller.getUserId());
//        user.setPassword(salt + passwordEncoder.encode(userInfo.getPassword()));
        user.setPassword(userInfo.getPassword());
        userService.addUser(user);
        Integer userId= user.getUserId();
        return userId;
    }

    @ApiOperation("添加商户")
    @PostMapping
    public void addSeller(@Valid @RequestBody User user) {
        int ret = userService.addUser(user);
    }

    @ApiOperation("添加内部用户")
    @PostMapping("in-seller/add")
    public Integer addInnerSeller(@RequestBody UserInfo userInfo) {
        User user=new User();
        user.setMobile(userInfo.getMobile());
        user.setEmail(userInfo.getEmail());
        user.setRegTime(userInfo.getRegTime());
        user.setNickname(userInfo.getNickName());
        user.setPassword(salt + passwordEncoder.encode(userInfo.getPassword()));
        user.setIsDistribut(1);// 默认每个人都可以成为分销商
        user.setRegTime(System.currentTimeMillis() / 1000);
        userService.save(user);
        Integer userId= user.getUserId();
        return userId;
    }


    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/distribute/page")
    public IPage<User> pageUser(@RequestParam(value = "user_id", required = false) Integer userId,
                                @RequestParam(value = "nickname", required = false) String nickname,
                                @RequestParam(value = "is_distribut", required = false) boolean isDistribut,
                                @RequestParam(value = "p", defaultValue = "1") Integer page,
                                @RequestParam(value = "size", defaultValue = "10") Integer size) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(nickname)) {
            userQueryWrapper.like("nickname", "%" + nickname + "%");
        }
        if(isDistribut){
            userQueryWrapper.like("is_distribut", 1);
        }
        if(null != userId){
            userQueryWrapper.eq("user_id", userId);
        }
        userQueryWrapper.orderByDesc("distribut_money");
        IPage<User> userIPage = userService.page(new Page<>(page, size), userQueryWrapper);
        userService.withLeaderCount(userIPage.getRecords());
        return userIPage;
    }

    @GetMapping("report")
    public Map<String, Object> report() {
        Map<String, Object> report = new HashMap<>();
        report.put("today_count", userService.count(new QueryWrapper<User>()
                .apply("reg_time > UNIX_TIMESTAMP(CAST(SYSDATE()AS DATE))")));
        report.put("yesterday_count", userService.count(new QueryWrapper<User>()
                .apply("reg_time > UNIX_TIMESTAMP(CAST(SYSDATE()AS DATE) - INTERVAL 1 DAY)")));
        report.put("month_count", userService.count(new QueryWrapper<User>()
                .apply("reg_time > unix_timestamp(concat(date_format(LAST_DAY(now()),'%Y-%m-'),'01'))")));
        report.put("total_count", userService.count());
        report.put("total_user_money", userService.getOne((new QueryWrapper<User>())
                .select("sum(user_money) as user_money")).getUserMoney());
        report.put("output_count", userService.count(new QueryWrapper<User>().gt("total_amount", 0)));
        report.put("today_login", userService.count(new QueryWrapper<User>().apply("last_login > UNIX_TIMESTAMP(CAST(SYSDATE()AS DATE))")));
        return report;
    }

    @GetMapping("/days/report")
    public List<UserDayReport> daysReport(
            @RequestParam("start_time") Long startTime, @RequestParam("end_time") Long endTime) {
        return userService.getDaysReport(startTime, endTime);
    }

    @PreAuthorize("hasAnyRole('SELLER')")
    @GetMapping("distribute/store_member/page")
    public IPage<User> getStoreMemberPage(
            @RequestParam(value = "user_id", required = false) Integer userId,
            @RequestParam(value = "mobile", required = false) String mobile,
            @RequestParam(value = "nickname", required = false) String nickname,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size) {
        Seller seller = authenticationFacade.getPrincipal(Seller.class);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("is_store_member", seller.getStoreId());
        if (userId != null) {
            userQueryWrapper.eq("user_id", userId);
        }
        if (!StringUtils.isEmpty(mobile)) {
            userQueryWrapper.like("mobile", mobile);
        }
        if (!StringUtils.isEmpty(nickname)) {
            userQueryWrapper.like("nickname", nickname);
        }
        userQueryWrapper.orderByDesc("user_id");
        return userService.page(new Page<>(page, size), userQueryWrapper);
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("user_top/page")
    public IPage<User> getUserTopPage(
            @RequestParam(value = "start_time", required = false) Long startTime,
            @RequestParam(value = "end_time", required = false) Long endTime,
            @RequestParam(value = "mobile", required = false) Integer mobile,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "p", defaultValue = "1") Integer p,
            @RequestParam(value = "size", defaultValue = "20") Integer size) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (mobile != null) {
            queryWrapper.eq("mobile", mobile);
        }
        if (email != null) {
            queryWrapper.eq("email", email);
        }
        IPage<User> userIPage = userService.page(new Page<>(p, size), queryWrapper);
        userService.withOrderCount(userIPage.getRecords(), startTime, endTime);
        return userIPage;
    }

    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("mobile/available")
    public SBApi checkMobile(
            @RequestParam(value = "type", defaultValue = "1") Integer type, // 1:检测注册账号    2：检测绑定账号
            @RequestParam("mobile") @Phone String mobile,
            SBApi sbApi) {
        User user = authenticationFacade.getPrincipal(User.class);
        if (type == 1) {
            userService.checkRegMobile(mobile);
        }
        if (type == 2) {
            userService.checkOauthBind(user, mobile);
        }
        sbApi.setMsg("该手机号可以使用");
        return sbApi;
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("用户下线人数统计")
    @GetMapping("lower/count")
    public UserLowerStatistics lowerStatistics() {
        User user = authenticationFacade.getPrincipal(User.class);
        UserLowerStatistics userLowerStatistics = new UserLowerStatistics();
        userLowerStatistics.setFirstLowerCount(
                userService.count((new QueryWrapper<User>()).eq("first_leader", user.getUserId())));
        userLowerStatistics.setSecondLowerCount(
                userService.count(
                        (new QueryWrapper<User>()).eq("second_leader", user.getUserId())));
        userLowerStatistics.setThirdLowerCount(
                userService.count((new QueryWrapper<User>()).eq("third_leader", user.getUserId())));
        return userLowerStatistics;
    }

    //@PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("获取商户下的所有用户(通过商户的userId)")
    @GetMapping("first_lowers")
    public Page<User> firstLowerUsers(
            @RequestParam(value = "p", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "100") Integer size,
            @RequestParam(value = "userId" ) Integer userId) {
        //User user = authenticationFacade.getPrincipal(User.class);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper
                .eq("first_leader", userId)
                .orderByDesc("user_id");
        IPage<User> userIPage = userService.page(new Page<>(page, size), userQueryWrapper);
        for (User lower : userIPage.getRecords()) {
            lower.setLowerSum(
                    userService.count(
                            (new QueryWrapper<User>())
                                    .eq("first_leader", lower.getUserId())));

        }
        return (Page<User>) userIPage;
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("用户下线列表")
    @GetMapping("lowers")
    public String LowerUsers(
            @RequestParam(value = "level", defaultValue = "2") Integer level,
            @RequestParam(value = "p", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size) {
        User user = authenticationFacade.getPrincipal(User.class);
        return orderService.lowerUsers(user.getUserId(), level, page, size);
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("获取用户下线列表")
    @GetMapping("lower_level")
    public IPage<User> getUserLeaders(@RequestParam(value = "level", defaultValue = "0") Integer level,
                                      @RequestParam(value = "p", defaultValue = "1") Integer page,
                                      @RequestParam(value = "size", defaultValue = "10") Integer size) {
        User user = authenticationFacade.getPrincipal(User.class);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        if (level == 0) {
            wrapper.eq("first_leader", user.getUserId());
        }
        if (level == 1) {
            wrapper.eq("second_leader", user.getUserId());
        }
        if (level == 2) {
            wrapper.eq("third_leader", user.getUserId());
        }
        return userService.page(new Page<>(page, size), wrapper);
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("获取用户分销等级")
    @GetMapping("/distribut/level")
    public DistributLevel userDistributLevel() {
        User user = userService.getById(authenticationFacade.getPrincipal(User.class).getUserId());
        return orderService.getDistributLevel(user.getDistributLevel());
    }

    @PreAuthorize("hasAnyRole('USER')")
    @ApiOperation("获取用户下线人数")
    @GetMapping("follow/count")
    public Integer followCount() {
        User user = authenticationFacade.getPrincipal(User.class);
        return userService.count(
                (new QueryWrapper<User>())
                        .select("DISTINCT(user_id)")
                        .eq("first_leader", user.getUserId())
                        .or()
                        .eq("second_leader", user.getUserId())
                        .or()
                        .eq("third_leader", user.getUserId()));
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("store_member/count/group")
    public Map<Integer, Integer> getStoreMemberCountGroup(@RequestParam(value = "store_ids", required = false) Set<Integer> storeIds){
        List<StoreMemberCountDto> storeMemberCountDtoList = userService.getStoreMemberCountGroup(storeIds);
        if (!storeMemberCountDtoList.isEmpty()){
            return storeMemberCountDtoList.stream().collect(Collectors.toMap(StoreMemberCountDto::getStoreId, StoreMemberCountDto::getMemberCount));
        }
        return null;
    }

    @GetMapping("store_member/ids")
    public Map<Integer, Set<Integer>> getUserIdsByIsStoreMember(@RequestParam("store_ids")Set<Integer> storeIds){
        return userService.getUserIdsByIsStoreMember(storeIds);
    }

    @GetMapping("ids")
    public Set<Integer> getUserIdsByMobile(@RequestParam(value = "mobile", required = false) String mobile,
                                           @RequestParam(value = "nickname", required = false) String nickname){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(mobile)){
            queryWrapper.eq("mobile", mobile);
        }
        if (StringUtils.isNotEmpty(nickname)){
            queryWrapper.like("nickname", nickname);
        }
        return userService.list(queryWrapper).stream().map(User::getUserId).collect(Collectors.toSet());
    }



}
