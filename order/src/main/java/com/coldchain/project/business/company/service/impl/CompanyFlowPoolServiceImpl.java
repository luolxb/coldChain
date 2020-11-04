package com.coldchain.project.business.company.service.impl;

import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.company.domain.CompanyFlowPool;
import com.coldchain.project.business.company.mapper.CompanyFlowPoolMapper;
import com.coldchain.project.business.company.service.ICompanyFlowPoolService;
import com.coldchain.project.business.company.vo.UsageFlowVo;
import com.coldchain.project.business.device.domain.Device;
import com.coldchain.project.business.device.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 企业流量池Service业务层处理
 *
 * @author nts
 * @date 2020-03-23
 */
@Service
public class CompanyFlowPoolServiceImpl implements ICompanyFlowPoolService {
    @Autowired
    private CompanyFlowPoolMapper companyFlowPoolMapper;

    @Autowired
    private IDeviceService deviceService;

    /**
     * 查询企业流量池
     *
     * @param companyFlowPoolId 企业流量池ID
     * @return 企业流量池
     */
    @Override
    public CompanyFlowPool selectCompanyFlowPoolById(Long companyFlowPoolId) {
        return companyFlowPoolMapper.selectCompanyFlowPoolById(companyFlowPoolId);
    }

    /**
     * 查询企业流量池列表
     *
     * @param companyFlowPool 企业流量池
     * @return 企业流量池
     */
    @Override
    public List<CompanyFlowPool> selectCompanyFlowPoolList(CompanyFlowPool companyFlowPool) {
        return companyFlowPoolMapper.selectCompanyFlowPoolList(companyFlowPool);
    }

    /**
     * 新增企业流量池
     *
     * @param companyFlowPool 企业流量池
     * @return 结果
     */
    @Override
    public int insertCompanyFlowPool(CompanyFlowPool companyFlowPool) {
        companyFlowPool.setCreateTime(DateUtils.getNowDate());
        return companyFlowPoolMapper.insertCompanyFlowPool(companyFlowPool);
    }

    /**
     * 修改企业流量池
     *
     * @param companyFlowPool 企业流量池
     * @return 结果
     */
    @Override
    public int updateCompanyFlowPool(CompanyFlowPool companyFlowPool) {
        companyFlowPool.setUpdateTime(DateUtils.getNowDate());
        return companyFlowPoolMapper.updateCompanyFlowPool(companyFlowPool);
    }

    /**
     * 删除企业流量池对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCompanyFlowPoolByIds(String ids) {
        return companyFlowPoolMapper.deleteCompanyFlowPoolByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业流量池信息
     *
     * @param companyFlowPoolId 企业流量池ID
     * @return 结果
     */
    @Override
    public int deleteCompanyFlowPoolById(Long companyFlowPoolId) {
        return companyFlowPoolMapper.deleteCompanyFlowPoolById(companyFlowPoolId);
    }

    /**
     * 根据企业ID查询
     *
     * @param companyId 企业ID
     * @return 结果
     */
    @Override
    public CompanyFlowPool queryByCompanyId(Long companyId) {
        return companyFlowPoolMapper.queryByCompanyId(companyId);
    }

    /**
     * 计算企业使用流量
     *
     * @param usageFlowList 使用流量列表
     */
    @Override
    public void calculatedUsageFlow(List<UsageFlowVo> usageFlowList) {
        for (UsageFlowVo usageFlow : usageFlowList) {
            if (StringUtils.isNotEmpty(usageFlow.getSubscriberId())) {
                if (StringUtils.isNotNull(usageFlow.getUsageFlow())
                        && usageFlow.getUsageFlow() > 0) {
                    this.doUsageFlow(usageFlow);
                }
            }
        }
    }

    /**
     * 处理使用流量计算
     *
     * @param usageFlow 使用流量
     */
    private void doUsageFlow(UsageFlowVo usageFlow) {
        Device device = deviceService.queryByDeviceSn(usageFlow.getSubscriberId());
        if (device == null) return; // 判断设备是否存在，否则退出
        CompanyFlowPool companyFlowPool = this.queryByCompanyId(device.getCompanyId());
        if (companyFlowPool == null) return; // 判断企业流量池是否存在，否则退出
        // 计算企业剩余流量池
        double surplusFlow = companyFlowPool.getSurplusFlow() - usageFlow.getUsageFlow();
        companyFlowPool.setSurplusFlow(surplusFlow);
        // 计算企业已经使用流量
        double usedFlow = companyFlowPool.getUsedFlow() + usageFlow.getUsageFlow();
        companyFlowPool.setUsedFlow(usedFlow);
        // 更新企业流量池
        this.updateCompanyFlowPool(companyFlowPool);
    }
}
