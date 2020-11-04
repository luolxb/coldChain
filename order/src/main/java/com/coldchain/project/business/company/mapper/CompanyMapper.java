package com.coldchain.project.business.company.mapper;

import com.coldchain.project.business.company.domain.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业Mapper接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface CompanyMapper {
    /**
     * 查询企业
     *
     * @param companyId 企业ID
     * @return 企业
     */
    public Company selectCompanyById(@Param("companyId") Long companyId);

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
     * 删除企业
     *
     * @param companyId 企业ID
     * @return 结果
     */
    public int deleteCompanyById(@Param("companyId") Long companyId);

    /**
     * 批量删除企业
     *
     * @param companyIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyByIds(String[] companyIds);

    /**
     * 根据企业名查询公司
     *
     * @param name 公司名称
     * @return 结果
     */
    Company queryByName(@Param("name") String name);

    /**
     * 模糊查询企业列表
     *
     * @param search 搜索内容
     * @return 企业集合
     */
    List<Company> selectListByLike(@Param("search") String search);
}
