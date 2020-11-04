package com.coldchain.project.business.company.service;

import com.coldchain.project.business.company.domain.Company;
import com.coldchain.project.business.company.vo.CompanyVo;

import java.util.List;

/**
 * 企业Service接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface ICompanyService {
    /**
     * 查询企业
     *
     * @param companyId 企业ID
     * @return 企业
     */
    public Company selectCompanyById(Long companyId);

    /**
     * 查询企业列表
     *
     * @param company 企业
     * @return 企业集合
     */
    public List<Company> selectCompanyList(Company company);

    /**
     * 新增企业
     *
     * @param company 企业
     * @return 结果
     */
    public int insertCompany(Company company);

    /**
     * 修改企业
     *
     * @param company 企业
     * @return 结果
     */
    public int updateCompany(Company company);

    /**
     * 批量删除企业
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyByIds(String ids);

    /**
     * 删除企业信息
     *
     * @param companyId 企业ID
     * @return 结果
     */
    public int deleteCompanyById(Long companyId);

    /**
     * 根据企业名查询公司
     *
     * @param name 公司名称
     * @return 结果
     */
    Company queryByName(String name);

    /**
     * 模糊查询企业列表
     *
     * @param search 搜索内容
     * @return 企业集合
     */
    List<CompanyVo> selectListByLike(String search);
}
