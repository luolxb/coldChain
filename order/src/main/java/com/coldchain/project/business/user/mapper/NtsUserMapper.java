package com.coldchain.project.business.user.mapper;

import com.coldchain.project.business.company.vo.CompanyListServerVo;
import com.coldchain.project.business.user.domain.NtsUser;
import com.coldchain.project.business.user.vo.CompanyUserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业用户Mapper接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface NtsUserMapper {
    /**
     * 查询企业用户
     *
     * @param userId 企业用户ID
     * @return 企业用户
     */
    public NtsUser selectNtsUserById(@Param("userId") Long userId);

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
     * 删除企业用户
     *
     * @param userId 企业用户ID
     * @return 结果
     */
    public int deleteNtsUserById(@Param("userId") Long userId);

    /**
     * 批量删除企业用户
     *
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteNtsUserByIds(String[] userIds);

    /**
     * 根据手机号查询
     *
     * @param mobile 手机号
     * @return 结果
     */
    NtsUser queryByMobile(@Param("mobile") String mobile);

    /**
     * 根据账号查询
     *
     * @param username 手机号
     * @return 结果
     */
    NtsUser queryByUsername(@Param("username") String username);

    List<CompanyUserVo> selectCompanyUserVo(CompanyUserVo companyUserVo);

    int deleteNtsUserByCompanyIds(String[] companyIds);

    /**
     * 服务端企业统计列表
     *
     * @param loginUser
     * @param startDate
     * @param overDate
     * @param companyName
     * @return
     */
    List<CompanyListServerVo> getCompanyListServer(NtsUser loginUser,
                                                   @Param("startDate") String startDate,
                                                   @Param("overDate") String overDate,
                                                   @Param("companyName") String companyName);
}
