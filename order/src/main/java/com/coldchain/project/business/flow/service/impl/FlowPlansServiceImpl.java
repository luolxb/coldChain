package com.coldchain.project.business.flow.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.flow.domain.FlowPlans;
import com.coldchain.project.business.flow.mapper.FlowPlansMapper;
import com.coldchain.project.business.flow.service.IFlowPlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 流量价格套餐Service业务层处理
 *
 * @author flows
 * @date 2019-11-29
 */
@Service
public class FlowPlansServiceImpl implements IFlowPlansService {

    @Autowired
    private FlowPlansMapper flowPlansMapper;

    /**
     * 查询流量价格套餐
     *
     * @param flowPlansId 流量价格套餐ID
     * @return 流量价格套餐
     */
    @Override
    public FlowPlans selectFlowPlansById(Long flowPlansId) {
        return flowPlansMapper.selectFlowPlansById(flowPlansId);
    }

    /**
     * 查询流量价格套餐列表
     *
     * @param flowPlans 流量价格套餐
     * @return 流量价格套餐
     */
    @Override
    public List<FlowPlans> selectFlowPlansList(FlowPlans flowPlans) {
        return flowPlansMapper.selectFlowPlansList(flowPlans);
    }

    /**
     * 新增流量价格套餐
     *
     * @param flowPlans 流量价格套餐
     * @return 结果
     */
    @Override
    public int insertFlowPlans(FlowPlans flowPlans) {
        flowPlans.setCreateTime(DateUtils.getNowDate());
        return flowPlansMapper.insertFlowPlans(flowPlans);
    }

    /**
     * 修改流量价格套餐
     *
     * @param flowPlans 流量价格套餐
     * @return 结果
     */
    @Override
    public int updateFlowPlans(FlowPlans flowPlans) {
        flowPlans.setUpdateTime(DateUtils.getNowDate());
        return flowPlansMapper.updateFlowPlans(flowPlans);
    }

    /**
     * 删除流量价格套餐对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFlowPlansByIds(String ids) {
        return flowPlansMapper.deleteFlowPlansByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除流量价格套餐信息
     *
     * @param flowPlansId 流量价格套餐ID
     * @return 结果
     */
    @Override
    public int deleteFlowPlansById(Long flowPlansId) {
        return flowPlansMapper.deleteFlowPlansById(flowPlansId);
    }
}
