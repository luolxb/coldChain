package com.coldchain.project.business.flow.mapper;

import com.coldchain.project.business.flow.domain.FlowPlans;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 流量价格套餐Mapper接口
 *
 * @author flows
 * @date 2019-11-29
 */
public interface FlowPlansMapper {
    /**
     * 查询流量价格套餐
     *
     * @param flowPlansId 流量价格套餐ID
     * @return 流量价格套餐
     */
    public FlowPlans selectFlowPlansById(@Param("flowPlansId") Long flowPlansId);

    /**
     * 查询流量价格套餐列表
     *
     * @param flowPlans 流量价格套餐
     * @return 流量价格套餐集合
     */
    public List<FlowPlans> selectFlowPlansList(FlowPlans flowPlans);

    /**
     * 新增流量价格套餐
     *
     * @param flowPlans 流量价格套餐
     * @return 结果
     */
    public int insertFlowPlans(FlowPlans flowPlans);

    /**
     * 修改流量价格套餐
     *
     * @param flowPlans 流量价格套餐
     * @return 结果
     */
    public int updateFlowPlans(FlowPlans flowPlans);

    /**
     * 删除流量价格套餐
     *
     * @param flowPlansId 流量价格套餐ID
     * @return 结果
     */
    public int deleteFlowPlansById(@Param("flowPlansId") Long flowPlansId);

    /**
     * 批量删除流量价格套餐
     *
     * @param flowPlansIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteFlowPlansByIds(String[] flowPlansIds);
}
