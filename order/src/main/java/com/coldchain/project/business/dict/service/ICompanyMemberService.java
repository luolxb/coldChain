package com.coldchain.project.business.dict.service;

import com.coldchain.project.business.dict.domain.CompanyMember;

import java.util.List;

/**
 * 字典-企业会员Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface ICompanyMemberService
{
    /**
     * 查询字典-企业会员
     * 
     * @param companyMemberId 字典-企业会员ID
     * @return 字典-企业会员
     */
    public CompanyMember selectCompanyMemberById(Integer companyMemberId);

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
     * 批量删除字典-企业会员
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyMemberByIds(String ids);

    /**
     * 删除字典-企业会员信息
     * 
     * @param companyMemberId 字典-企业会员ID
     * @return 结果
     */
    public int deleteCompanyMemberById(Integer companyMemberId);
}
