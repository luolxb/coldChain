package com.coldchain.project.business.order.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.order.domain.OrderFlowPlans;
import com.coldchain.project.business.order.mapper.OrderFlowPlansMapper;
import com.coldchain.project.business.order.service.IOrderFlowPlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单流量价格套餐Service业务层处理
 *
 * @author nts
 * @date 2019-11-29
 */
@Service
public class OrderFlowPlansServiceImpl implements IOrderFlowPlansService {
    @Autowired
    private OrderFlowPlansMapper orderFlowPlansMapper;

    /**
     * 查询订单流量价格套餐
     *
     * @param orderFlowPlansId 订单流量价格套餐ID
     * @return 订单流量价格套餐
     */
    @Override
    public OrderFlowPlans selectOrderFlowPlansById(Long orderFlowPlansId) {
        return orderFlowPlansMapper.selectOrderFlowPlansById(orderFlowPlansId);
    }

    /**
     * 查询订单流量价格套餐列表
     *
     * @param orderFlowPlans 订单流量价格套餐
     * @return 订单流量价格套餐
     */
    @Override
    public List<OrderFlowPlans> selectOrderFlowPlansList(OrderFlowPlans orderFlowPlans) {
        return orderFlowPlansMapper.selectOrderFlowPlansList(orderFlowPlans);
    }

    /**
     * 新增订单流量价格套餐
     *
     * @param orderFlowPlans 订单流量价格套餐
     * @return 结果
     */
    @Override
    public int insertOrderFlowPlans(OrderFlowPlans orderFlowPlans) {
        orderFlowPlans.setCreateTime(DateUtils.getNowDate());
        return orderFlowPlansMapper.insertOrderFlowPlans(orderFlowPlans);
    }

    /**
     * 修改订单流量价格套餐
     *
     * @param orderFlowPlans 订单流量价格套餐
     * @return 结果
     */
    @Override
    public int updateOrderFlowPlans(OrderFlowPlans orderFlowPlans) {
        orderFlowPlans.setUpdateTime(DateUtils.getNowDate());
        return orderFlowPlansMapper.updateOrderFlowPlans(orderFlowPlans);
    }

    /**
     * 删除订单流量价格套餐对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOrderFlowPlansByIds(String ids) {
        return orderFlowPlansMapper.deleteOrderFlowPlansByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单流量价格套餐信息
     *
     * @param orderFlowPlansId 订单流量价格套餐ID
     * @return 结果
     */
    @Override
    public int deleteOrderFlowPlansById(Long orderFlowPlansId) {
        return orderFlowPlansMapper.deleteOrderFlowPlansById(orderFlowPlansId);
    }

    /**
     * 根据订单ID和订单类型查询订单流量价格套餐
     *
     * @param orderId   订单ID
     * @param orderType 订单类型
     * @return 订单流量价格套餐
     */
    @Override
    public OrderFlowPlans queryByOrderIdAndOrderType(Long orderId, Integer orderType) {
        return orderFlowPlansMapper.queryByOrderIdAndOrderType(orderId, orderType);
    }
}
