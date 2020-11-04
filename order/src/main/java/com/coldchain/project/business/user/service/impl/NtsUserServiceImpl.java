package com.coldchain.project.business.user.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.NtsUtil;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.project.business.company.domain.Company;
import com.coldchain.project.business.company.domain.CompanyFlowPool;
import com.coldchain.project.business.company.service.ICompanyFlowPoolService;
import com.coldchain.project.business.company.service.ICompanyService;
import com.coldchain.project.business.company.vo.CompanyListServerVo;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.business.user.mapper.NtsUserMapper;
import com.coldchain.project.business.user.service.INtsUserService;
import com.coldchain.project.business.user.vo.*;
import com.coldchain.project.business.wallet.domain.Wallet;
import com.coldchain.project.business.wallet.service.IWalletService;
import com.coldchain.service.IAuthenticationFacade;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 企业用户Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class NtsUserServiceImpl implements INtsUserService {
    @Autowired
    private NtsUserMapper ntsUserMapper;
    @Autowired
    private ICompanyService companyService;
    @Autowired
    private IWalletService walletService;
    @Autowired
    private ICompanyFlowPoolService companyFlowPoolService;

    @Autowired
    private IAuthenticationFacade authentication;


    /**
     * 查询企业用户
     *
     * @param userId 企业用户ID
     * @return 企业用户
     */
    @Override
    public NtsUser selectNtsUserById(Long userId) {
        return ntsUserMapper.selectNtsUserById(userId);
    }

    /**
     * 查询企业用户列表
     *
     * @param ntsUser 企业用户
     * @return 企业用户
     */
    @Override
    public List<NtsUser> selectNtsUserList(NtsUser ntsUser) {
        return ntsUserMapper.selectNtsUserList(ntsUser);
    }

    /**
     * 新增企业用户
     *
     * @param ntsUser 企业用户
     * @return 结果
     */
    @Override
    public int insertNtsUser(NtsUser ntsUser) {
        ntsUser.setCreateTime(DateUtils.getNowDate());
        return ntsUserMapper.insertNtsUser(ntsUser);
    }

    /**
     * 修改企业用户
     *
     * @param ntsUser 企业用户
     * @return 结果
     */
    @Override
    public int updateNtsUser(NtsUser ntsUser) {
        ntsUser.setUpdateTime(DateUtils.getNowDate());
        return ntsUserMapper.updateNtsUser(ntsUser);
    }

    /**
     * 删除企业用户对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNtsUserByIds(String ids) {
        return ntsUserMapper.deleteNtsUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业用户信息
     *
     * @param userId 企业用户ID
     * @return 结果
     */
    @Override
    public int deleteNtsUserById(Long userId) {
        return ntsUserMapper.deleteNtsUserById(userId);
    }

    /**
     * 根据手机号查询
     *
     * @param mobile 手机号
     * @return 结果
     */
    @Override
    public NtsUser queryByMobile(String mobile) {
        return ntsUserMapper.queryByMobile(mobile);
    }


    /**
     * 根据账号查询
     *
     * @param username 手机号
     * @return 结果
     */
    @Override
    public NtsUser queryByUsername(String username) {
        return ntsUserMapper.queryByUsername(username);
    }

    /**
     * 注企业用户
     *
     * @param registerVo registerVo
     * @param clientIp   客户端IP
     * @return 结果
     */
    @Transactional
    @Override
    public RestResponse register(RegisterVo registerVo, String clientIp) {
        //查询公司有没有被注册
        Company company = companyService.queryByName(registerVo.getCompanyName());
        if (StringUtils.isNotNull(company)) {
            return RestResponse.error("公司已经存在，不能重新注册");
        }
        //查询手机号码是否被占用
        NtsUser resultUser = queryByMobile(registerVo.getMobile());
        if (StringUtils.isNotNull(resultUser)) {
            return RestResponse.error("手机号码已被注册，不能注册了！");
        }

        //保存公司
        company = new Company();
        company.setName(registerVo.getCompanyName());
        company.setAddress(registerVo.getAddress());
        int result1 = companyService.insertCompany(company);
        if (result1 <= 0) {
            return RestResponse.error("注册账号失败,保存公司出错！");
        }

        //保存用户
        NtsUser user = new NtsUser();
        user.setUsername(registerVo.getUsername());
        //盐加密
        String salt = NtsUtil.generateSalt();
        user.setSalt(salt);
        user.setPassword(DigestUtils.sha256Hex(registerVo.getPassword() + salt));
        user.setMobile(registerVo.getMobile());
        user.setCompanyId(company.getCompanyId());
        user.setRegisterIp(clientIp);
        user.setRegisterTime(new Date());
        int result2 = insertNtsUser(user);
        if (result2 <= 0) {
            return RestResponse.error("注册账号失败，保存用户出错！");
        }

        //创建企业余额
        Wallet wallet = new Wallet();
        wallet.setCompanyId(company.getCompanyId());
        wallet.setMoney(new BigDecimal(0));
        wallet.setCreateUserId(user.getUserId());
        int result3 = walletService.insertWallet(wallet);
        if (result3 <= 0) {
            return RestResponse.error("注册账号失败，保存用户出错！");
        }

        return RestResponse.success("注册账号成功！");
    }



    /**
     * 添加企业用户
     *
     * @param companyUserRq 企业用户
     * @param loginUser     企业ID
     * @param clientIp      客户端IP
     * @return 结果
     */
    @Transactional
    @Override
    public RestResponse addCompanyUser(CompanyUserRq companyUserRq, NtsUser loginUser, String clientIp) {
        //查询公司有没有被注册
        Company company = companyService.queryByName(companyUserRq.getCompanyName());
        if (StringUtils.isNotNull(company)) {
            return RestResponse.error("公司已经存在，不能重新注册");
        }

        NtsUser user = queryByUsername(companyUserRq.getUsername());
        if (StringUtils.isNotNull(user)) {
            throw new NtsException("用户名已经存在");
        }
        NtsUser user1 = queryByMobile(companyUserRq.getMobile());
        if (StringUtils.isNotNull(user1)) {
            throw new NtsException("手机号已经存在");
        }

        //保存企业
        company = new Company();
        company.setName(companyUserRq.getCompanyName());
        company.setAddress(companyUserRq.getAddress());
        int result1 = companyService.insertCompany(company);
        if (result1 <= 0) {
            return RestResponse.error("注册账号失败,保存公司出错！");
        }


        //保存用户
        user = new NtsUser();
        user.setUsername(companyUserRq.getUsername());
        //盐加密
        String salt = NtsUtil.generateSalt();
        user.setSalt(salt);
        user.setPassword(DigestUtils.sha256Hex(companyUserRq.getPassword() + salt));
        user.setMobile(companyUserRq.getMobile());
        user.setMailLeader(companyUserRq.getMailLeader());
        user.setPrimaryAccount(org.apache.commons.lang3.StringUtils.isBlank(companyUserRq.getPrimaryAccount()) ? loginUser.getUsername() : companyUserRq.getPrimaryAccount());
        user.setCompanyId(company.getCompanyId());
        user.setRegisterIp(clientIp);
        user.setRegisterTime(new Date());
        user.setAccountTypeId(companyUserRq.getAccountTypeId());
        user.setRemark(companyUserRq.getRemark());
        user.setBusinessLeader(companyUserRq.getBusinessLeader());
        int result2 = insertNtsUser(user);
        if (result2 <= 0) {
            return RestResponse.error("注册账号失败，保存用户出错！");
        }

        // 创建企业余额
        Wallet wallet = new Wallet();
        wallet.setCompanyId(company.getCompanyId());
        wallet.setMoney(new BigDecimal(0));
        wallet.setCreateUserId(user.getUserId());
        int result3 = walletService.insertWallet(wallet);
        if (result3 <= 0) {
            return RestResponse.error("注册账号失败，保存用户出错！");
        }

        // 创建企业流量池
        CompanyFlowPool companyFlowPool = new CompanyFlowPool();
        companyFlowPool.setCompanyId(company.getCompanyId());
        companyFlowPool.setSurplusFlow(10240d); // 默认企业流量池10KB
        companyFlowPool.setUsedFlow(0d); // 默认使用0b
        int result4 = companyFlowPoolService.insertCompanyFlowPool(companyFlowPool);
        if (result4 <= 0) {
            return RestResponse.error("注册账号失败，保存用户出错！");
        }

        return RestResponse.success("添加企业用户成功！");
    }

    /**
     * 获取个人信息
     *
     * @param loginUser 登录用户
     * @return 结果
     */
    @Override
    public RestResponse getUserInfo(NtsUser loginUser) {
        UserInfoVo userInfo = new UserInfoVo();
        // 用户
        userInfo.setUsername(loginUser.getUsername());
        userInfo.setNickname(loginUser.getNickname());
        userInfo.setMobile(loginUser.getMobile());
        userInfo.setAvatar(loginUser.getAvatar());
        userInfo.setRegisterTime(loginUser.getRegisterTime());
        // 企业
        Company company = companyService.selectCompanyById(loginUser.getCompanyId());
        if (StringUtils.isNotNull(company)) {
            userInfo.setCompanyName(company.getName());
            userInfo.setCompanyAlias(company.getAlias());
            userInfo.setCompanyAddress(company.getAddress());
            userInfo.setEmail(company.getEmail());
            userInfo.setAuditStatus(company.getAuditStatus());
        }
        // 企业钱包
        Wallet wallet = walletService.selectWalletByCompanyId(loginUser.getCompanyId());
        if (StringUtils.isNotNull(wallet)) {
            userInfo.setMoney(wallet.getMoney());
        }
        // 企业流量
        CompanyFlowPool companyFlowPool = companyFlowPoolService.queryByCompanyId(loginUser.getCompanyId());
        if (StringUtils.isNotNull(companyFlowPool)) {
            userInfo.setSurplusFlow(companyFlowPool.getSurplusFlow());
        }
        return RestResponse.success(userInfo);
    }

    /**
     * 查询企业用户列表
     *
     * @return
     */
    @Override
    public List<CompanyUserVo> queryCompanyUserList(CompanyUserVo companyUserVo) {
        List<CompanyUserVo> companyUserVoList = ntsUserMapper.selectCompanyUserVo(companyUserVo);
        return companyUserVoList;

    }

    /**
     * 修改企业用户信息
     *
     * @param companyUserRq
     * @param loginUser
     * @param clientIp
     * @return
     */
    @Transactional
    @Override
    public RestResponse updateCompanyUser(CompanyUserRq companyUserRq, NtsUser loginUser, String clientIp) {
        //查询公司有没有被注册
        Company company = companyService.queryByName(companyUserRq.getCompanyName());
        if (StringUtils.isNull(company)) {
            return RestResponse.error("公司不存在，请确认信息");
        }

        NtsUser user = queryByUsername(companyUserRq.getUsername());
        if (StringUtils.isNull(user)) {
            throw new NtsException("用户名不存在");
        }
        if (!org.apache.commons.lang3.StringUtils.equals(user.getMobile(), companyUserRq.getMobile())) {
            NtsUser user1 = queryByMobile(companyUserRq.getMobile());
            if (StringUtils.isNotNull(user1)) {
                throw new NtsException("手机号已经存在");
            }
        }

        // 判断地址不为空，则更新企业
        if (StringUtils.isNotEmpty(companyUserRq.getAddress())) {
            company.setAddress(companyUserRq.getAddress());
            companyService.updateCompany(company);
        }

        //保存用户
        user = new NtsUser();
        //盐加密
        String salt = NtsUtil.generateSalt();
        user.setSalt(companyUserRq.getPassword() != null ? salt : null);
        user.setPassword(companyUserRq.getPassword() != null ? DigestUtils.sha256Hex(companyUserRq.getPassword() + salt) : null);
        user.setMobile(companyUserRq.getMobile());
        user.setMailLeader(companyUserRq.getMailLeader());
        user.setRemark(companyUserRq.getRemark());
        user.setBusinessLeader(companyUserRq.getBusinessLeader());
        user.setNickname(companyUserRq.getNickName());
        user.setUserId(companyUserRq.getUserId());
        user.setCompanyId(companyUserRq.getCompanyId());
        int result2 = updateNtsUser(user);
        if (result2 <= 0) {
            return RestResponse.error("修改信息出错！");
        }
        return RestResponse.success("修改信息成功！");
    }

    /**
     * 删除企业信息
     *
     * @param loginUser
     * @param companyIds
     * @return
     */
    @Override
    @Transactional
    public RestResponse deleteCompany(NtsUser loginUser, String companyIds) {
        if (org.apache.commons.lang3.StringUtils.isBlank(companyIds)) {
            throw new NtsException("请选择删除项");
        }

        JSONObject jsonObject = JSONObject.parseObject(companyIds);
        String ids = (String) jsonObject.get("companyIds");
        if (org.apache.commons.lang3.StringUtils.isBlank(ids)) {
            throw new NtsException("请选择删除项");
        }
        String[] split = ids.split(",");
        // 判断删除企业中是否包含登录人信息
        for (String companyId : split) {
            if (org.apache.commons.lang3.StringUtils.equals(companyId, String.valueOf(loginUser.getCompanyId()))) {
                throw new NtsException("删除企业中包含登录人企业，操作失败");
            }
            // 删除用户信息 修改删除标记
            NtsUser ntsUser = new NtsUser();
            ntsUser.setCompanyId(Long.parseLong(companyId));
            ntsUser.setDeleteFlag(2);
            int i = ntsUserMapper.updateNtsUser(ntsUser);
            if (i <= 0) {
                throw new NtsException("删除用户失败");
            }

            // 删除企业信息 修改删除标记
            Company company = new Company();
            company.setDeleteFlag(2);
            company.setCompanyId(Long.parseLong(companyId));
            int i1 = companyService.updateCompany(company);
            if (i1 <= 0) {
                throw new NtsException("删除企业失败");
            }
//            // 删除钱包 修改删除标记
//            Wallet wallet = new Wallet();
//            wallet.setCompanyId(Long.parseLong(companyId));

        }
        return RestResponse.success("删除企业成功！");
    }

    @Override
    public List<CompanyListServerVo> getCompanyListServer(NtsUser loginUser, String startDate, String overDate, String companyName) {
        return ntsUserMapper.getCompanyListServer(loginUser, startDate, overDate, companyName);
    }
}
