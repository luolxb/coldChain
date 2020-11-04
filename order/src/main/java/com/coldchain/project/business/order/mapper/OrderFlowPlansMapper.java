package com.coldchain.project.business.order.mapper;

import com.coldchain.project.business.order.domain.OrderFlowPlans;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单流量价格套餐Mapper接口
 *
 * @author nts
 * @date 2019-11-29
 */
public interface OrderFlowPlansMapper {
    /**
     * 查询订单流量价格套餐
     *
     * @param orderFlowPlansId 订单流量价格套餐ID
     * @return 订单流量价格套餐
     */
    public OrderFlowPlans selectOrderFlowPlansById(@Param("orderFlowPlansId") Long orderFlowPlansId);

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
     * 删除订单流量价格套餐
     *
     * @param orderFlowPlansId 订单流量价格套餐ID
     * @return 结果
     */
    public int deleteOrderFlowPlansById(@Param("orderFlowPlansId") Long orderFlowPlansId);

    /**
     * 批量删除订单流量价格套餐
     *
     * @param orderFlowPlansIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderFlowPlansByIds(String[] orderFlowPlansIds);

    /**
     * 根据订单ID和订单类型查询订单流量价格套餐
     *
     * @param orderId   订单ID
     * @param orderType 订单类型
     * @return 订单流量价格套餐
     */
    OrderFlowPlans queryByOrderIdAndOrderType(@Param("orderId") Long orderId,
                                              @Param("orderType") Integer orderType);
}
