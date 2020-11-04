package com.coldchain.project.business.order.service;

import com.coldchain.project.business.order.domain.OrderFlowPlans;

import java.util.List;

/**
 * 订单流量价格套餐Service接口
 *
 * @author nts
 * @date 2019-11-29
 */
public interface IOrderFlowPlansService {
    /**
     * 查询订单流量价格套餐
     *
     * @param orderFlowPlansId 订单流量价格套餐ID
     * @return 订单流量价格套餐
     */
    public OrderFlowPlans selectOrderFlowPlansById(Long orderFlowPlansId);

    /**
     * 查询订单流量价格套餐列表
     *
     * @param orderFlowPlans 订单流量价格套餐
     * @return 订单流量价格套餐集合
     */
    public List<OrderFlowPlans> selectOrderFlowPlansList(OrderFlowPlans orderFlowPlans);

    /**
     * 新增订单流量价格套餐
     *
     * @param orderFlowPlans 订单流量价格套餐
     * @return 结果
     */
    public int insertOrderFlowPlans(OrderFlowPlans orderFlowPlans);

    /**
     * 修改订单流量价格套餐
     *
     * @param orderFlowPlans 订单流量价格套餐
     * @return 结果
     */
    public int updateOrderFlowPlans(OrderFlowPlans orderFlowPlans);

    /**
     * 批量删除订单流量价格套餐
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderFlowPlansByIds(String ids);

    /**
     * 删除订单流量价格套餐信息
     *
     * @param orderFlowPlansId 订单流量价格套餐ID
     * @return 结果
     */
    public int deleteOrderFlowPlansById(Long orderFlowPlansId);

    /**
     * 根据订单ID和订单类型查询订单流量价格套餐
     *
     * @param orderId   订单ID
     * @param orderType 订单类型
     * @return 订单流量价格套餐
     */
    OrderFlowPlans queryByOrderIdAndOrderType(Long orderId, Integer orderType);
}
