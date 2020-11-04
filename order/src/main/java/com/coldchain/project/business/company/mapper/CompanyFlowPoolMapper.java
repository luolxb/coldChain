package com.coldchain.project.business.company.mapper;

import com.coldchain.project.business.company.domain.CompanyFlowPool;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业流量池Mapper接口
 *
 * @author nts
 * @date 2020-03-23
 */
public interface CompanyFlowPoolMapper {
    /**
     * 查询企业流量池
     *
     * @param companyFlowPoolId 企业流量池ID
     * @return 企业流量池
     */
    public CompanyFlowPool selectCompanyFlowPoolById(@Param("companyFlowPoolId") Long companyFlowPoolId);

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
     * 删除企业流量池
     *
     * @param companyFlowPoolId 企业流量池ID
     * @return 结果
     */
    public int deleteCompanyFlowPoolById(@Param("companyFlowPoolId") Long companyFlowPoolId);

    /**
     * 批量删除企业流量池
     *
     * @param companyFlowPoolIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyFlowPoolByIds(String[] companyFlowPoolIds);

    /**
     * 根据企业ID查询
     *
     * @param companyId 设备ID
     * @return 结果
     */
    CompanyFlowPool queryByCompanyId(@Param("companyId") Long companyId);
}
