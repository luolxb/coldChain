package com.coldchain.project.business.company.service;

import com.coldchain.project.business.company.domain.CompanyFlowPool;
import com.coldchain.project.business.company.vo.UsageFlowVo;

import java.util.List;

/**
 * 企业流量池Service接口
 *
 * @author nts
 * @date 2020-03-23
 */
public interface ICompanyFlowPoolService {
    /**
     * 查询企业流量池
     *
     * @param companyFlowPoolId 企业流量池ID
     * @return 企业流量池
     */
    public CompanyFlowPool selectCompanyFlowPoolById(Long companyFlowPoolId);

    /**
     * 查询企业流量池列表
     *
     * @param companyFlowPool 企业流量池
     * @return 企业流量池集合
     */
    public List<CompanyFlowPool> selectCompanyFlowPoolList(CompanyFlowPool companyFlowPool);

    /**
     * 新增企业流量池
     *
     * @param companyFlowPool 企业流量池
     * @return 结果
     */
    public int insertCompanyFlowPool(CompanyFlowPool companyFlowPool);

    /**
     * 修改企业流量池
     *
     * @param companyFlowPool 企业流量池
     * @return 结果
     */
    public int updateCompanyFlowPool(CompanyFlowPool companyFlowPool);

    /**
     * 批量删除企业流量池
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyFlowPoolByIds(String ids);

    /**
     * 删除企业流量池信息
     *
     * @param companyFlowPoolId 企业流量池ID
     * @return 结果
     */
    public int deleteCompanyFlowPoolById(Long companyFlowPoolId);

    /**
     * 根据企业ID查询
     *
     * @param companyId 企业ID
     * @return 结果
     */
    CompanyFlowPool queryByCompanyId(Long companyId);

    /**
     * 计算企业使用流量
     */
    void calculatedUsageFlow(List<UsageFlowVo> usageFlowList);
}
