package com.coldchain.project.business.company.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.company.domain.Company;
import com.coldchain.project.business.company.mapper.CompanyMapper;
import com.coldchain.project.business.company.service.ICompanyService;
import com.coldchain.project.business.company.vo.CompanyVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 企业Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 查询企业
     *
     * @param companyId 企业ID
     * @return 企业
     */
    @Override
    public Company selectCompanyById(Long companyId) {
        return companyMapper.selectCompanyById(companyId);
    }

    /**
     * 查询企业列表
     *
     * @param company 企业
     * @return 企业
     */
    @Override
    public List<Company> selectCompanyList(Company company) {
        return companyMapper.selectCompanyList(company);
    }

    /**
     * 新增企业
     *
     * @param company 企业
     * @return 结果
     */
    @Override
    public int insertCompany(Company company) {
        company.setCreateTime(DateUtils.getNowDate());
        return companyMapper.insertCompany(company);
    }

    /**
     * 修改企业
     *
     * @param company 企业
     * @return 结果
     */
    @Override
    public int updateCompany(Company company) {
        company.setUpdateTime(DateUtils.getNowDate());
        return companyMapper.updateCompany(company);
    }

    /**
     * 删除企业对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCompanyByIds(String ids) {
        return companyMapper.deleteCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业信息
     *
     * @param companyId 企业ID
     * @return 结果
     */
    @Override
    public int deleteCompanyById(Long companyId) {
        return companyMapper.deleteCompanyById(companyId);
    }

    /**
     * 根据企业名查询公司
     *
     * @param name 公司名称
     * @return 结果
     */
    @Override
    public Company queryByName(String name) {
        return companyMapper.queryByName(name);
    }

    /**
     * 模糊查询企业列表
     *
     * @param search 搜索内容
     * @return 企业集合
     */
    @Override
    public List<CompanyVo> selectListByLike(String search) {
        List<CompanyVo> companyVoList = new ArrayList<>();
        List<Company> companyList = companyMapper.selectListByLike(search);
        if (companyList != null && companyList.size() > 0) {
            for (Company company : companyList) {
                CompanyVo companyVo = new CompanyVo();
                BeanUtils.copyProperties(company, companyVo);
                companyVoList.add(companyVo);
            }
        }
        return companyVoList;
    }
}
