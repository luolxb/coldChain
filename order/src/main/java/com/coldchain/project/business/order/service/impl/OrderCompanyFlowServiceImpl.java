package com.coldchain.project.business.order.service.impl;

import com.coldchain.common.constant.Constants;
import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.NtsUtil;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.project.business.company.domain.CompanyFlowPool;
import com.coldchain.project.business.company.service.ICompanyFlowPoolService;
import com.coldchain.project.business.flow.domain.FlowPlans;
import com.coldchain.project.business.flow.service.IFlowPlansService;
import com.coldchain.project.business.order.domain.OrderCompanyFlow;
import com.coldchain.project.business.order.domain.OrderFlowPlans;
import com.coldchain.project.business.order.mapper.OrderCompanyFlowMapper;
import com.coldchain.project.business.order.service.IOrderCompanyFlowService;
import com.coldchain.project.business.order.service.IOrderFlowPlansService;
import com.coldchain.project.business.order.vo.OrderCompanyFlowVo;
import com.coldchain.project.business.user.domain.NtsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 企业流量订单Service业务层处理
 *
 * @author nts
 * @date 2020-03-23
 */
@Service
public class OrderCompanyFlowServiceImpl implements IOrderCompanyFlowService {
    @Autowired
    private OrderCompanyFlowMapper orderCompanyFlowMapper;

    @Autowired
    private IFlowPlansService flowPlansService;

    @Autowired
    private IOrderFlowPlansService orderFlowPlansService;

    @Autowired
    private ICompanyFlowPoolService companyFlowPoolService;

    /**
     * 查询企业流量订单
     *
     * @param orderCompanyFlowId 企业流量订单ID
     * @return 企业流量订单
     */
    @Override
    public OrderCompanyFlow selectOrderCompanyFlowById(Long orderCompanyFlowId) {
        return orderCompanyFlowMapper.selectOrderCompanyFlowById(orderCompanyFlowId);
    }

    /**
     * 查询企业流量订单列表
     *
     * @param orderCompanyFlow 企业流量订单
     * @return 企业流量订单
     */
    @Override
    public List<OrderCompanyFlow> selectOrderCompanyFlowList(OrderCompanyFlow orderCompanyFlow) {
        return orderCompanyFlowMapper.selectOrderCompanyFlowList(orderCompanyFlow);
    }

    /**
     * 新增企业流量订单
     *
     * @param orderCompanyFlow 企业流量订单
     * @return 结果
     */
    @Override
    public int insertOrderCompanyFlow(OrderCompanyFlow orderCompanyFlow) {
        orderCompanyFlow.setCreateTime(DateUtils.getNowDate());
        return orderCompanyFlowMapper.insertOrderCompanyFlow(orderCompanyFlow);
    }

    /**
     * 修改企业流量订单
     *
     * @param orderCompanyFlow 企业流量订单
     * @return 结果
     */
    @Override
    public int updateOrderCompanyFlow(OrderCompanyFlow orderCompanyFlow) {
        orderCompanyFlow.setUpdateTime(DateUtils.getNowDate());
        return orderCompanyFlowMapper.updateOrderCompanyFlow(orderCompanyFlow);
    }

    /**
     * 删除企业流量订单对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOrderCompanyFlowByIds(String ids) {
        return orderCompanyFlowMapper.deleteOrderCompanyFlowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除企业流量订单信息
     *
     * @param orderCompanyFlowId 企业流量订单ID
     * @return 结果
     */
    @Override
    public int deleteOrderCompanyFlowById(Long orderCompanyFlowId) {
        return orderCompanyFlowMapper.deleteOrderCompanyFlowById(orderCompanyFlowId);
    }

    /**
     * 企业流量订单添加
     *
     * @param flowPlansId 流量套餐ID
     * @param flowNumber  流量数量
     * @param loginUser   登录用户
     * @return 结果
     */

    /**
     * 企业流量订单添加
     *
     * @param flowPlansId 流量套餐ID
     * @param flowNumber  流量数量
     * @param loginUser   登录用户
     * @return 结果
     */
    @Transactional
    @Override
    public Map<String, Object> orderCompanyFlowAdd(Long flowPlansId, Double flowNumber, NtsUser loginUser) {
        FlowPlans flowPlans = flowPlansService.selectFlowPlansById(flowPlansId);
        NtsAssert.isNull(flowPlans, "流量套餐ID不存在");


        // 统计商品总价
        BigDecimal flowTotalPrice = new BigDecimal(0);
        //套餐类型 0-自定义流量 1-流量阶梯 2-按月缴费
        if (flowPlans.getPlansType() == 0) {
            if (flowNumber == null || flowNumber == 0) {
                throw new NtsException("自定义套餐流量数量必须>0");
            } else {
                //计算流量总价
                flowTotalPrice = flowTotalPrice.add(flowPlans.getUnitPrice());
                //logger.info("add:" + flowTotalPrice);
                flowTotalPrice = flowTotalPrice.multiply(new BigDecimal(flowNumber));
                //logger.info("multiply:" + flowTotalPrice.toString());
            }
        } else if (flowPlans.getPlansType() == 1) {
            flowTotalPrice = flowTotalPrice.add(flowPlans.getTotalPrice());
        }

        Map<String, Object> resultObj = new HashMap<String, Object>();

        //创建订单
        OrderCompanyFlow orderCompanyFlow = new OrderCompanyFlow();
        orderCompanyFlow.setCompanyId(loginUser.getCompanyId());
        orderCompanyFlow.setCreateUserId(loginUser.getUserId());
        orderCompanyFlow.setOrderCode(Constants.CF_TAG + "_" + NtsUtil.generateOrderNumber());
        //订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后 5-付款失败
        orderCompanyFlow.setOrderStatus(0);
        orderCompanyFlow.setFlowPrice(flowTotalPrice); //流量总价
        orderCompanyFlow.setOrderPrice(flowTotalPrice); //订单总价
        orderCompanyFlow.setActualPrice(flowTotalPrice); //实际需要支付的金额
        insertOrderCompanyFlow(orderCompanyFlow);

        //创建订单流量套餐
        OrderFlowPlans orderFlowPlans = new OrderFlowPlans();
        orderFlowPlans.setOrderId(orderCompanyFlow.getOrderCompanyFlowId());
        orderFlowPlans.setOrderType(2); //订单类型 1-设备流量订单 2-企业流订单
        orderFlowPlans.setPlansName(flowPlans.getPlansName());
        orderFlowPlans.setPlansType(flowPlans.getPlansType());
        orderFlowPlans.setPlansDesc(flowPlans.getPlansDesc());
        orderFlowPlans.setUnitPrice(flowPlans.getUnitPrice());
        orderFlowPlans.setTotalPrice(flowPlans.getTotalPrice());
        //如果是自定义套餐保存充值流量数  套餐类型 0-自定义流量 1-流量阶梯 2-按月缴费
        if (flowPlans.getPlansType() == 0
                && flowNumber != null && flowNumber != 0) {
            orderFlowPlans.setFlowNumber(flowNumber);
            orderFlowPlans.setTotalPrice(flowTotalPrice);
        } else if (flowPlans.getPlansType() == 1) {
            orderFlowPlans.setFlowNumber(flowPlans.getFlowNumber());
        }
        orderFlowPlans.setMonths(flowPlans.getMonths());
        orderFlowPlansService.insertOrderFlowPlans(orderFlowPlans);

        // 返回组装
        resultObj.put("code", 0);
        resultObj.put("msg", "创建订单成功");
        Map<String, Object> resultObjMap = new HashMap<>();
        resultObjMap.put("orderId", orderCompanyFlow.getOrderCompanyFlowId());
        resultObjMap.put("orderCode", orderCompanyFlow.getOrderCode());
        resultObjMap.put("actualPrice", orderCompanyFlow.getActualPrice());
        resultObj.put("data", resultObjMap);
        return resultObj;
    }

    /**
     * 根据公司ID查询设备流量订单
     *
     * @param companyId 公司ID
     * @return 结果
     */
    @Override
    public List<OrderCompanyFlowVo> queryByCompanyId(Long companyId,
                                                     String search,
                                                     String startDate,
                                                     String overDate) {
        return orderCompanyFlowMapper.queryByCompanyId(companyId, search, startDate, overDate);
    }

    /**
     * 根据订单编号查询订单
     *
     * @param orderCode 设备编号
     * @return 结果
     */
    @Override
    public OrderCompanyFlow queryOrderCompanyFlowByOrderCode(String orderCode) {
        return orderCompanyFlowMapper.queryOrderCompanyFlowByOrderCode(orderCode);
    }

    /**
     * 更新企业流量订单/设备流量池由支付成功后
     *
     * @param orderCompanyFlow 企业流量订单
     */
    @Override
    public void updateOrderCompanyFlowByPayOk(OrderCompanyFlow orderCompanyFlow) {
        //支付回调成功后，更改订单相关状态
        orderCompanyFlow.setOrderStatus(2); //订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后 5-付款失败
        orderCompanyFlow.setPayStatus(2); //支付状态 0-初始化 1-付款中,2-支付成功,3-支付失败
        orderCompanyFlow.setPayCallback(1); //支付回调状态 0-初始化 1-成功,-1-失败
        orderCompanyFlow.setPayTime(DateUtils.getNowDate());
        //更新企业流量订单
        updateOrderCompanyFlow(orderCompanyFlow);

        //更新企业流量池业务逻辑 订单类型 2-企业流订单
        OrderFlowPlans orderFlowPlans = orderFlowPlansService.queryByOrderIdAndOrderType(orderCompanyFlow.getOrderCompanyFlowId(), 2);
        if (StringUtils.isNull(orderFlowPlans)) return;
        // 查询流量池
        CompanyFlowPool companyFlowPool = companyFlowPoolService.queryByCompanyId(orderCompanyFlow.getCompanyId());
        if (StringUtils.isNotNull(companyFlowPool)) {
            Double surplusFlow = companyFlowPool.getSurplusFlow();
            surplusFlow = surplusFlow + (orderFlowPlans.getFlowNumber() * 1024); //累加，kb 转换成 b(字节)
            companyFlowPool.setSurplusFlow(surplusFlow);
            //更新企业流量池
            companyFlowPoolService.updateCompanyFlowPool(companyFlowPool);
        } else {
            companyFlowPool = new CompanyFlowPool();
            companyFlowPool.setCompanyId(orderCompanyFlow.getCompanyId());
            Double surplusFlow = orderFlowPlans.getFlowNumber() * 1024; //累加，kb 转换成 b(字节)
            companyFlowPool.setSurplusFlow(surplusFlow);
            //新增企业流量池
            companyFlowPoolService.insertCompanyFlowPool(companyFlowPool);
        }
    }
}
