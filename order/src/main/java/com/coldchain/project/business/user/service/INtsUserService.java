package com.coldchain.project.business.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.common.utils.RestResponse;
import com.coldchain.project.business.company.vo.CompanyListServerVo;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.business.user.vo.CompanyUserRq;
import com.coldchain.project.business.user.vo.CompanyUserVo;
import com.coldchain.project.business.user.vo.LoginVo;
import com.coldchain.project.business.user.vo.RegisterVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 企业用户Service接口
 *
 * @author nts
 * @date 2019-11-23
 
*/
public interface INtsUserService {
    /**
     * 查询企业用户
     *
     * @param userId 企业用户ID
     * @return 企业用户
     */

    @GetMapping("/get/user_id")
    public NtsUser selectNtsUserById(Long userId);

    /**
     * 查询企业用户列表
     *
     * @param ntsUser 企业用户
     * @return 企业用户集合
     */
    public List<NtsUser> selectNtsUserList(NtsUser ntsUser);

    /**
     * 新增企业用户
     *
     * @param ntsUser 企业用户
     * @return 结果
     */
    public int insertNtsUser(NtsUser ntsUser);

    /**
     * 修改企业用户
     *
     * @param ntsUser 企业用户
     * @return 结果
     */
    public int updateNtsUser(NtsUser ntsUser);

    /**
     * 批量删除企业用户
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNtsUserByIds(String ids);

    /**
     * 删除企业用户信息
     *
     * @param userId 企业用户ID
     * @return 结果
     */
    public int deleteNtsUserById(Long userId);

    /**
     * 根据手机号查询
     *
     * @param mobile 手机号
     * @return 结果
     */
    NtsUser queryByMobile(String mobile);

    /**
     * 根据账号查询
     *
     * @param username 手机号
     * @return 结果
     */
    NtsUser queryByUsername(String username);

    /**
     * 企业用户注册
     *
     * @param registerVo registerVo
     * @param clientIp   客户端IP
     * @return 结果
     */
    RestResponse register(RegisterVo registerVo, String clientIp);


    /**
     * 添加企业用户
     *
     * @param companyUserVo 企业用户
     * @param loginUser     企业ID
     * @param clientIp      客户端IP
     * @return 结果
     */
    RestResponse addCompanyUser(CompanyUserRq companyUserVo, NtsUser loginUser, String clientIp);

    /**
     * 获取个人信息
     *
     * @param loginUser 登录用户
     * @return 结果
     */
    RestResponse getUserInfo(NtsUser loginUser);

    /**
     * 查询企业用户列表
     *
     * @return
     */
    List<CompanyUserVo> queryCompanyUserList(CompanyUserVo companyUserVo);

    /**
     * 修改企业用户信息
     *
     * @param companyUserRq
     * @param loginUser
     * @param clientIp
     * @return
     */
    RestResponse updateCompanyUser(CompanyUserRq companyUserRq, NtsUser loginUser, String clientIp);

    /**
     * 删除企业信息
     *
     * @param loginUser
     * @param companyIds
     * @return
     */
    RestResponse deleteCompany(NtsUser loginUser, String companyIds);

    /**
     * 服务端企业统计列表
     *
     * @param loginUser
     * @param startDate
     * @param overDate
     * @param companyName
     * @return
     */
    List<CompanyListServerVo> getCompanyListServer(NtsUser loginUser, String startDate, String overDate, String companyName);
}
