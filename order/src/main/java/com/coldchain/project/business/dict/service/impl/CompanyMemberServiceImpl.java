package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.CompanyMember;
import com.coldchain.project.business.dict.mapper.CompanyMemberMapper;
import com.coldchain.project.business.dict.service.ICompanyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-企业会员Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class CompanyMemberServiceImpl implements ICompanyMemberService
{
    @Autowired
    private CompanyMemberMapper companyMemberMapper;

    /**
     * 查询字典-企业会员
     * 
     * @param companyMemberId 字典-企业会员ID
     * @return 字典-企业会员
     */
    @Override
    public CompanyMember selectCompanyMemberById(Integer companyMemberId)
    {
        return companyMemberMapper.selectCompanyMemberById(companyMemberId);
    }

    /**
     * 查询字典-企业会员列表
     * 
     * @param companyMember 字典-企业会员
     * @return 字典-企业会员
     */
    @Override
    public List<CompanyMember> selectCompanyMemberList(CompanyMember companyMember)
    {
        return companyMemberMapper.selectCompanyMemberList(companyMember);
    }

    /**
     * 新增字典-企业会员
     * 
     * @param companyMember 字典-企业会员
     * @return 结果
     */
    @Override
    public int insertCompanyMember(CompanyMember companyMember)
    {
        companyMember.setCreateTime(DateUtils.getNowDate());
        return companyMemberMapper.insertCompanyMember(companyMember);
    }

    /**
     * 修改字典-企业会员
     * 
     * @param companyMember 字典-企业会员
     * @return 结果
     */
    @Override
    public int updateCompanyMember(CompanyMember companyMember)
    {
        companyMember.setUpdateTime(DateUtils.getNowDate());
        return companyMemberMapper.updateCompanyMember(companyMember);
    }

    /**
     * 删除字典-企业会员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCompanyMemberByIds(String ids)
    {
        return companyMemberMapper.deleteCompanyMemberByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-企业会员信息
     * 
     * @param companyMemberId 字典-企业会员ID
     * @return 结果
     */
    @Override
    public int deleteCompanyMemberById(Integer companyMemberId)
    {
        return companyMemberMapper.deleteCompanyMemberById(companyMemberId);
    }
}
