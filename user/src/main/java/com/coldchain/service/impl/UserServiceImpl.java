package com.coldchain.service.impl;


import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.UserMapper;
import com.coldchain.dto.StoreMemberCountDto;
import com.coldchain.dto.StoreMemberIdsDto;
import com.coldchain.entity.AccountLog;
import com.coldchain.entity.OauthUser;
import com.coldchain.entity.Seller;
import com.coldchain.entity.User;
import com.coldchain.entity.vo.*;
import com.coldchain.service.*;
import com.coldchain.utils.RedisUtils;
import com.coldchain.vo.*;
import com.common.constant.ShopConstant;
import com.common.dto.UserDto;
import com.common.enums.UserIdentityEnum;
import com.common.exception.ResultEnum;
import com.common.exception.ShopException;
import com.common.utils.NtsUtil;
import com.common.utils.RedisKey;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dyr
 * @since 2019-08-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private OrderService orderService;
    @Autowired
    private MallService mallService;
    @Autowired
    private AccountLogService accountLogService;
    @Autowired
    private OauthUserService oauthUserService;
    @Autowired
    private ShopConstant shopConstant;
    @Value("${security.salt}")
    private String salt;
    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private CommonSequenceService commonSequenceService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @Autowired
    private NtsCompanyService ntsCompanyService;

    @Autowired
    private SellerService sellerService;

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @Override
    public Integer addUser(User user) {

        if (null != adminService.credential(user.getNickname())){
            throw new ShopException(ResultEnum.ACCOUNT_EXISTS);
        }
        if (null != sellerService.credential(user.getMobile())) {
            throw new ShopException(ResultEnum.ACCOUNT_EXISTS);
        }
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        if (StringUtils.isEmpty(user.getMobile()) && StringUtils.isEmpty(user.getEmail())) {
            throw new ShopException(ResultEnum.ACCOUNT_PARAM_ERROR);
        }
        if (StringUtils.isNotEmpty(user.getEmail())) {
            userQueryWrapper.or().eq("email", user.getEmail());
        }
        if (StringUtils.isNotEmpty(user.getMobile())) {
            userQueryWrapper.or().eq("mobile", user.getMobile());
        }
        if (this.count(userQueryWrapper) > 0) {
            throw new ShopException(ResultEnum.ACCOUNT_EXISTS);
        }
        user.setNickname(user.getNickname()!=null?user.getNickname():user.getMobile());
        user.setPassword(salt + passwordEncoder.encode(user.getPassword()));
        user.setIsDistribut(1);// 默认每个人都可以成为分销商
        user.setRegTime(System.currentTimeMillis() / 1000);
        user.setCode(commonSequenceService.getCommonSequence(NtsUtil.generateCode(4) + "_u", null, 5, "\\'user'\\"));

        save(user);
        return user.getUserId();
    }

    @Override
    public void updateUserBaseInfo(User user, User updateUser) {
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.set("last_login", System.currentTimeMillis() / 1000).eq("user_id", user.getUserId());
        if (StringUtils.isNotEmpty(updateUser.getEmail())) {
            User emailUser = getOne(new QueryWrapper<User>()
                    .eq("email", updateUser.getEmail())
                    .ne("user_id", user.getUserId()));
            if (emailUser != null) {
                throw new ShopException(ResultEnum.EMAIL_IN_USE);
            }
            userUpdateWrapper.set("email", updateUser.getEmail());
        }
        if (StringUtils.isNotEmpty(updateUser.getNickname())) {
            userUpdateWrapper.set("nickname", updateUser.getNickname());
        }
        if (updateUser.getSex() != null) {
            userUpdateWrapper.set("sex", updateUser.getSex());
        }
        if (StringUtils.isNotEmpty(updateUser.getHeadPic())) {
            userUpdateWrapper.set("head_pic", updateUser.getHeadPic());
        }
        update(userUpdateWrapper);
    }

    @Override
    public void checkRegMobile(String mobile) {
        if (count(new QueryWrapper<User>().eq("mobile", mobile)) > 0) {
            throw new ShopException(ResultEnum.MOBILE_IS_BINDING);
        }
    }

    @Override
    public void checkOauthBind(User user, String mobile) {
        User mobileUser = getOne(new QueryWrapper<User>().eq("mobile", mobile));
        OauthUser oauthUser = oauthUserService.getOne(new QueryWrapper<OauthUser>()
                .eq("user_id", user.getUserId()).eq("oauth", "miniapp"));
        if (mobileUser == null || oauthUser == null) {
            throw new ShopException(ResultEnum.ACCOUNT_NOT_EXISTS);
        }

        //1.判断一个账号绑定多个QQ
        //2.判断一个QQ绑定多个账号
        OauthUser ou = oauthUserService.getOne(new QueryWrapper<OauthUser>()
                .eq("user_id", mobileUser.getUserId())
                .eq("oauth", "miniapp"));
        if (StringUtils.isNotEmpty(oauthUser.getUnionid())) {
            if (
                    (!oauthUser.getUserId().equals(mobileUser.getUserId()))
                            ||
                            (ou != null && !ou.getUnionid().equals(oauthUser.getUnionid()))
            ) {
                throw new ShopException(ResultEnum.ACCOUNT_IS_BINDIND);
            }
        } else {
            if (StringUtils.isNotEmpty(oauthUser.getOpenid()) || ou != null) {
                throw new ShopException(ResultEnum.ACCOUNT_IS_BINDIND);
            }
        }
    }

    @Override
    public List<UserDayReport> getDaysReport(Long startTime, Long endTime) {
        int dayLimit = (int) Math.ceil((double) (endTime - startTime) / 86400);
        if ((dayLimit == 1) && !DateUtil.isSameDay(new Date(startTime * 1000), new Date(endTime * 1000))) {
            dayLimit++;
        }
        return this.baseMapper.selectDayReport(startTime, endTime, dayLimit);
    }

    @Override
    public List<UserExcel> getUserExportData(QueryWrapper<UserExcel> wrapper) {
        return this.baseMapper.selectUserExportData(wrapper);
    }

    @Override
    public User loginAndGetUser(User loginUser, OauthUser oauthUser) {
        //php不做校验签名，我们也不做，因为signature（签名没传）,
        User user = getUserByRequestOauthUser(oauthUser);
        if (user == null) {
            int isBindAccount = Integer.parseInt((String) mallService.config().get("basic_is_bind_account"));
            if (isBindAccount == 1) {
                throw new ShopException(ResultEnum.NEED_BIND_ACCOUNT);//请绑定账号
            }
            register(loginUser);
        }
        assert user != null;
        OauthUser queryOauthUser = oauthUserService.getOne((new QueryWrapper<OauthUser>())
                .eq("oauth", oauthUser.getOauth()).eq("user_id", user.getUserId()));
        if (queryOauthUser != null) {
            if (!queryOauthUser.getUnionid().equals(oauthUser.getUnionid())) {
                queryOauthUser.setUnionid(oauthUser.getUnionid());
                oauthUserService.updateById(queryOauthUser);
            }
        } else {
            oauthUser.setUserId(user.getUserId());
            oauthUserService.save(oauthUser);
        }
        return user;
    }

    @Override
    public void register(User user) {
        if (user.getMobile() != null) {
            int hasCount = count((new QueryWrapper<User>()).eq("mobile", user.getMobile()));
            if (hasCount > 0) {
                throw new ShopException(ResultEnum.MOBILE_IS_BINDING);
            }
        }
        user.setRegTime(System.currentTimeMillis() / 1000);
        if (user.getFirstLeader() != null && user.getFirstLeader() > 0) {
            User firstLeaderUser = getById(user.getFirstLeader());
            if (firstLeaderUser != null) {
                user.setIsStoreMember(firstLeaderUser.getIsStoreMember());
                user.setSecondLeader(firstLeaderUser.getFirstLeader());
                user.setThirdLeader(firstLeaderUser.getSecondLeader());
                update((new UpdateWrapper<User>()).setSql("underling_number = underling_number + 1")
                        .eq("user_id", user.getFirstLeader()));
                update((new UpdateWrapper<User>()).setSql("underling_number = underling_number + 1")
                        .eq("user_id", user.getSecondLeader()));
                update((new UpdateWrapper<User>()).setSql("underling_number = underling_number + 1")
                        .eq("user_id", user.getThirdLeader()));
            }
        }
        user.setIsDistribut(1);
        user.setLastLogin(System.currentTimeMillis() / 1000);
        user.setPassword(salt + passwordEncoder.encode(user.getPassword()));
        user.setPaypwd(salt + passwordEncoder.encode(user.getPaypwd()));
        save(user);
    }

    @Override
    public User addOauthUserReturnUser(OauthUser oauthUser, User user) {
        QueryWrapper<OauthUser> oauthUserQuery = new QueryWrapper<>();
        oauthUserQuery.eq("oauth", oauthUser.getOauth()).eq("openid", oauthUser.getOpenid());
        if (StringUtils.isNotEmpty(oauthUser.getUnionid())) {
            oauthUserQuery.eq("unionid", oauthUser.getUnionid());
        }
        OauthUser exOauthUser = oauthUserService.getOne(oauthUserQuery);
        if (exOauthUser != null) {
            throw new ShopException(ResultEnum.ACCOUNT_IS_BINDIND);
        }
        User retrunUser = null;
        if (user.getPassword() != null) {
            //有密码表示先创建账号后再创建身份
            register(user);
            oauthUser.setUserId(user.getUserId());
            oauthUserService.save(oauthUser);
        } else {
            retrunUser = getOne((new QueryWrapper<User>()).eq("mobile", user.getMobile()));
            if (retrunUser == null) {
                throw new ShopException(ResultEnum.ACCOUNT_NOT_EXISTS);
            }
            oauthUser.setUserId(retrunUser.getUserId());
            oauthUserService.save(oauthUser);
        }
        return retrunUser;
    }

    @Override
    public void withLeaderCount(List<User> records) {
        if (records.size() > 0) {
            Set<Integer> userIds = records.stream().map(User::getUserId).collect(Collectors.toSet());
            List<User> userFirstLeaderCount = list((new QueryWrapper<User>()).select("first_leader, count(user_id) as first_leader_count")
                    .in("first_leader", userIds).groupBy("first_leader"));
            List<User> userSecondLeaderCount = list((new QueryWrapper<User>()).select("second_leader, count(user_id) as second_leader_count")
                    .in("second_leader", userIds).groupBy("second_leader"));
            List<User> userThirdLeaderCount = list((new QueryWrapper<User>()).select("third_leader, count(user_id) as third_leader_count")
                    .in("third_leader", userIds).groupBy("third_leader"));
            Map<Integer, Integer> firstLeaderMap = userFirstLeaderCount.stream().collect(Collectors.toMap(User::getFirstLeader, User::getFirstLeaderCount));
            Map<Integer, Integer> secondLeaderMap = userSecondLeaderCount.stream().collect(Collectors.toMap(User::getSecondLeader, User::getSecondLeaderCount));
            Map<Integer, Integer> thirdLeaderMap = userThirdLeaderCount.stream().collect(Collectors.toMap(User::getThirdLeader, User::getThirdLeaderCount));
            for (User user : records) {
                user.setFirstLeaderCount(firstLeaderMap.getOrDefault(user.getUserId(), 0));
                user.setSecondLeaderCount(secondLeaderMap.getOrDefault(user.getUserId(), 0));
                user.setThirdLeaderCount(thirdLeaderMap.getOrDefault(user.getUserId(), 0));
            }
        }
    }

    @Override
    public void withOrderCount(List<User> records, Long startTime, Long endTime) {
        if (records.size() > 0) {
            Set<Integer> userIds = records.stream().map(User::getUserId).collect(Collectors.toSet());
            List<UserOrderStatistics> userOrderStatistics = orderService.userOrderStatisticsList(userIds, startTime, endTime);
            Map<Integer, UserOrderStatistics> statisticsMap = userOrderStatistics.stream().collect(Collectors.toMap(UserOrderStatistics::getUserId, statistics -> statistics));
            for (User user : records) {
                user.setOrderNum(statisticsMap.containsKey(user.getUserId()) ? statisticsMap.get(user.getUserId()).getOrderCount() : 0);
                user.setAmount(statisticsMap.containsKey(user.getUserId()) ? statisticsMap.get(user.getUserId()).getTotalAmount() : BigDecimal.ZERO);
            }
        }
    }

    @Override
    public List<StoreMemberCountDto> getStoreMemberCountGroup(Set<Integer> storeIds) {
        return this.baseMapper.selectStoreMemberCountGroup(storeIds);
    }

    @Override
    public Map<Integer, Set<Integer>> getUserIdsByIsStoreMember(Set<Integer> storeIds) {
        List<StoreMemberIdsDto> storeMemberIdsDtoList = this.baseMapper.selectUserIdsByIsStoreMember(storeIds);
        HashMap<Integer, Set<Integer>> memberIdMap = new HashMap<>();
        storeMemberIdsDtoList.forEach(storeMemberIdsDto -> {
            Integer storeId = storeMemberIdsDto.getStoreId();
            if (memberIdMap.containsKey(storeId)) {
                memberIdMap.get(storeId).add(storeMemberIdsDto.getUserId());
            } else {
                HashSet<Integer> memberIdSet = new HashSet<>();
                memberIdSet.add(storeMemberIdsDto.getUserId());
                memberIdMap.put(storeId, memberIdSet);
            }
        });
        return memberIdMap;
    }

    /**
     * 用户注册
     *
     * @param userRq
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void register1(UserRegisterRq userRq) {
        // 校验注册参数
//        checkRegisterParam(userRq);
//
//        User user = new User();
//        user.setNickname(userRq.getNickname());
//        user.setMobile(userRq.getMobile());
//        user.setCreateTime(new Date());
//        user.setCreateBy(userRq.getNickname());
//        user.setIdentity(UserIdentityEnum.SELLER.name());
//        user.setCode(commonSequenceService.getCommonSequence(NtsUtil.generateCode(4) + "_u", null, 5, "\\'user'\\"));
//        user.setPassword(salt + passwordEncoder.encode(userRq.getPassword()));
//        save(user);
//
//        Seller seller = new Seller();
//        seller.setMobile(userRq.getMobile());
//        seller.setSellerName(userRq.getNickname());
//        seller.setUserId(user.getUserId());
//        seller.setIsAdmin(1);
//        seller.setAddTime(System.currentTimeMillis() / 1000);
//
//        //sellerService.save(seller);
//
//
//        // 删除缓存验证码
//        redisUtils.del(RedisKey.SMS_SEND + userRq.getMobile());
    }

    @Override
    public UserDto getUserInfo(Integer userId) {
        // 如果userId为空 取当前登录用户
        if (userId == null) {
            UserDto userDto = authenticationFacade.getUser();
            userId = userDto.getUserId();
        }
        User user = getById(userId);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    @Override
    public void updateHeadPic(UserRq userRq) {
        if (userRq.getUserId() == null) {
            throw new ShopException(-1, "用户ID不能为空");
        }
        if (org.apache.commons.lang3.StringUtils.isBlank(userRq.getHeadPic())) {
            throw new ShopException(-1, "头像地址不能为空");
        }

        User user = new User();
        user.setUserId(userRq.getUserId());
        user.setHeadPic(userRq.getHeadPic());
        this.updateById(user);
    }

    @Override
    public void updatePassword(UserChangePwdVo userChangePwdVo) {
        if (null == userChangePwdVo.getUserId()) {
            UserDto userDto = authenticationFacade.getUser();
            userChangePwdVo.setUserId(userDto.getUserId());
        }

        if (!org.apache.commons.lang3.StringUtils.equals(userChangePwdVo.getNewPassWord(), userChangePwdVo.getOldPassWord())) {
            throw new ShopException(-1, "两次密码不一致");
        }
        User user = this.getById(userChangePwdVo.getUserId());
        if (!passwordEncoder.matches(
                userChangePwdVo.getOldPassWord(), user.getPassword().replace(salt, ""))) {
            throw new ShopException(ResultEnum.OLD_PASSWORD_ERROR);
        }
        User user1 = new User();
        user1.setUserId(user.getUserId());
        user1.setPassword(salt + passwordEncoder.encode(userChangePwdVo.getNewPassWord()));
        this.updateById(user1);
    }

    @Override
    public void bindPhone(UserChangePhoneRq userChangePhoneRq) {
        if (org.apache.commons.lang3.StringUtils.equals(userChangePhoneRq.getMobile(), userChangePhoneRq.getOldMobile())) {
            throw new ShopException(-1, "新手机号与旧手机号不能一致");
        }
        String codeRedis = (String) redisUtils.get(RedisKey.SMS_SEND + userChangePhoneRq.getMobile());
        String oldCodeRedis = (String) redisUtils.get(RedisKey.SMS_SEND + userChangePhoneRq.getOldMobile());

        if (org.apache.commons.lang3.StringUtils.equals(userChangePhoneRq.getCode(), codeRedis)) {
            throw new ShopException(-1, "新手机验证码错误");
        }
        if (org.apache.commons.lang3.StringUtils.equals(userChangePhoneRq.getOldCode(), oldCodeRedis)) {
            throw new ShopException(-1, "旧手机验证码错误");
        }
        if (userChangePhoneRq.getUserId() == null) {
            UserDto userDto = authenticationFacade.getUser();
            userChangePhoneRq.setUserId(userDto.getUserId());
        }
        User user = this.getById(userChangePhoneRq.getUserId());
        if (!org.apache.commons.lang3.StringUtils.equals(user.getMobile(), userChangePhoneRq.getMobile())) {
            throw new ShopException(-1, "新手机号错误");
        }
        int mobile = count(new QueryWrapper<User>().eq("mobile", userChangePhoneRq.getOldMobile()));
        if (mobile > 0) {
            throw new ShopException(-1, "旧手机号已被使用");
        }
    }

    /**
     * 新增用户
     *
     * @param userManagerRq
     */
    @Override
    public void add(UserManagerRq userManagerRq) {
        checkAddParam(userManagerRq);
        UserDto userDto = authenticationFacade.getUser();
        User user = new User();
        BeanUtils.copyProperties(userManagerRq, user);
        user.setCreateTime(new Date());
        user.setLeadId(userDto.getUserId());
        user.setCreateBy(userDto.getNickname());
        user.setIdentity(UserIdentityEnum.SELLER.name());
        user.setCode(commonSequenceService.getCommonSequence(NtsUtil.generateCode(4) + "_u", null, 5, "\\'user'\\"));
        user.setPassword(salt + passwordEncoder.encode(user.getPassword()));
        this.save(user);
    }

    /**
     * 修改用户
     *
     * @param userManagerRq
     */
    @Override
    public void edit(UserManagerRq userManagerRq) {
        checkUpdateParam(userManagerRq);
        UserDto userDto = authenticationFacade.getUser();

        User user = new User();
        BeanUtils.copyProperties(userManagerRq, user);
        user.setUpdateTime(new Date());
        user.setUpdateBy(userDto.getNickname());
        if (StringUtils.isNotBlank(user.getPassword())) {
            user.setPassword(salt + passwordEncoder.encode(user.getPassword()));
        }
        // 登录账号不允许修改
        user.setNickname(null);
        this.updateById(user);
    }

    /**
     * 删除用户
     *
     * @param ids
     */
    @Override
    public void delete(String ids) {
        if (org.apache.commons.lang3.StringUtils.isBlank(ids)) {
            throw new ShopException(-1, "用户ID不能为空");
        }
        JSONObject jsonObject = JSONObject.parseObject(ids);
        List<String> list = (List<String>) jsonObject.get("ids");
        this.removeByIds(list);
    }

    /**
     * 禁用/启用 用户
     *
     * @param userManagerLockRq
     */
    @Override
    public void lock(UserManagerLockRq userManagerLockRq) {
        UserDto userDto = authenticationFacade.getUser();
        userManagerLockRq.getUserId().forEach(userId -> {
            User user = new User();
            user.setUserId(userId);
            user.setIsLock(userManagerLockRq.getIsLock());
            user.setUpdateTime(new Date());
            user.setUpdateBy(userDto.getNickname());
            this.updateById(user);
        });
    }

    /**
     * 用户管理分页
     *
     * @param realname
     * @param nickname
     * @param isLock
     * @param start
     * @param end
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<UserManagerVo> userManagerPage(String realname, String nickname, String isLock, Long start, Long end, Integer page, Integer size) {
        Page<UserManagerVo> userManagerVoPage = new Page<>(page, size);
        List<UserManagerVo> userManagerVoList = this.baseMapper.userManagerVoPage(userManagerVoPage, realname, nickname, isLock, start, end);
        return userManagerVoPage.setRecords(userManagerVoList);
    }

    /**
     * 用户管理 查看
     *
     * @param userId
     * @return
     */
    @Override
    public UserManagerVo userManagerDetail(Integer userId) {
        User user = getById(userId);
        if (null == user) {
            throw new ShopException(-1, "用户信息不存在");
        }
        UserManagerVo userManagerVo = new UserManagerVo();
        BeanUtils.copyProperties(user, userManagerVo);
        // 获取企业信息
        NtsCompanyVo companyVo = ntsCompanyService.userManagerCompanyDetail(userId);
        userManagerVo.setCompanyVo(companyVo);

        // 获取设备信息
        return userManagerVo;
    }

    @Override
    public UserDto getUserByCompanyId(Long companyId) {
        return this.baseMapper.getUserByCompanyId(companyId);
    }

    /**
     * 校验修改参数
     *
     * @param userManagerRq
     */
    private void checkUpdateParam(UserManagerRq userManagerRq) {
        if (null == userManagerRq.getUserId()) {
            throw new ShopException(-1, "用户ID不能为空");
        }
        User user = this.getById(userManagerRq.getUserId());
        if (null == user) {
            throw new ShopException(-1, "用户不存在");
        }
        User mobile = this.getOne(new QueryWrapper<User>().eq("mobile", userManagerRq.getMobile()));
        if (mobile != null &&
                !StringUtils.equals(mobile.getMobile(), user.getMobile())) {
            throw new ShopException(-1, "电话号码已经存在");
        }
        User email = this.getOne(new QueryWrapper<User>().eq("email", userManagerRq.getEmail()));
        if (email != null &&
                !StringUtils.equals(email.getEmail(), user.getEmail())) {
            throw new ShopException(-1, "邮箱已经存在");
        }
    }

    /**
     * 校验新增参数
     *
     * @param userManagerRq
     */
    private void checkAddParam(UserManagerRq userManagerRq) {
        int nickname = this.count(new QueryWrapper<User>().eq("nickname", userManagerRq.getNickname()));
        if (nickname > 0) {
            throw new ShopException(-1, "账号已经存在");
        }
        int mobile = this.count(new QueryWrapper<User>().eq("mobile", userManagerRq.getMobile()));
        if (mobile > 0) {
            throw new ShopException(-1, "电话号码已经存在");
        }
        int email = this.count(new QueryWrapper<User>().eq("email", userManagerRq.getEmail()));
        if (email > 0) {
            throw new ShopException(-1, "邮箱已经存在");
        }
    }

    /**
     * 校验注册参数
     *
     * @param userRq
     */
    private void checkRegisterParam(UserRegisterRq userRq) {
        // 判断验证码是否正确
        String code = (String) redisUtils.get(RedisKey.SMS_SEND + userRq.getMobile());
        if (!org.apache.commons.lang3.StringUtils.equals(code, userRq.getCode())) {
            throw new ShopException(-1, "验证码错误");
        }

        if (!org.apache.commons.lang3.StringUtils.equals(userRq.getPassword(), userRq.getConfirmPassword())) {
            throw new ShopException(-1, "两次密码不一致");
        }
        // 判断 用户名，手机号是否是被使用
        int nickname = this.count(new QueryWrapper<User>().eq("nickname", userRq.getNickname()));
        if (nickname > 0) {
            throw new ShopException(-1, "用户名已存在");
        }
        int mobile = this.count(new QueryWrapper<User>().eq("mobile", userRq.getMobile()));
        if (mobile > 0) {
            throw new ShopException(-1, "手机号已存在");
        }
    }

    private User getUserByRequestOauthUser(OauthUser requestOauthUser) {
        User user = null;
        if (requestOauthUser.getOauth().equals(shopConstant.getMiniAppOauth())) {
            if (StringUtils.isNotEmpty(requestOauthUser.getUnionid())) {
                OauthUser onlyOauthUser = oauthUserService.getOne((new QueryWrapper<OauthUser>())
                        .eq("unionid", requestOauthUser.getUnionid()).last("limit 1"));
                if (onlyOauthUser != null) {
                    user = getById(onlyOauthUser.getUserId());
                }
            } else {
                OauthUser onlyOauthUser = oauthUserService.getOne((new QueryWrapper<OauthUser>())
                        .eq("openid", requestOauthUser.getOpenid()).eq("oauth", requestOauthUser.getOauth()).last("limit 1"));
                if (onlyOauthUser != null) {
                    user = getById(onlyOauthUser.getUserId());
                }
            }
        }
        return user;
    }
}










