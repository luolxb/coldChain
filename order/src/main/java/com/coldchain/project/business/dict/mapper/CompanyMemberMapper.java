package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.CompanyMember;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-企业会员Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface CompanyMemberMapper
{
    /**
     * 查询字典-企业会员
     * 
     * @param companyMemberId 字典-企业会员ID
     * @return 字典-企业会员
     */
    public CompanyMember selectCompanyMemberById(@Param("companyMemberId") Integer companyMemberId);

    /**
     * 查询字典-企业会员列表
     * 
     * @param companyMember 字典-企业会员
     * @return 字典-企业会员集合
     */
    public List<CompanyMember> selectCompanyMemberList(CompanyMember companyMember);

    /**
     * 新增字典-企业会员
     * 
     * @param companyMember 字典-企业会员
     * @return 结果
     */
    public int insertCompanyMember(CompanyMember companyMember);

    /**
     * 修改字典-企业会员
     * 
     * @param companyMember 字典-企业会员
     * @return 结果
     */
    public int updateCompanyMember(CompanyMember companyMember);

    /**
     * 删除字典-企业会员
     * 
     * @param companyMemberId 字典-企业会员ID
     * @return 结果
     */
    public int deleteCompanyMemberById(@Param("companyMemberId") Integer companyMemberId);

    /**
     * 批量删除字典-企业会员
     * 
     * @param companyMemberIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyMemberByIds(String[] companyMemberIds);
}
