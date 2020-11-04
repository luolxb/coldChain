package com.coldchain.project.business.order.service.impl;

import com.coldchain.common.constant.Constants;
import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.NtsUtil;
import com.coldchain.common.utils.StringUtils;
import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.common.validator.NtsAssert;
import com.coldchain.project.business.device.domain.DeviceFlowPool;
import com.coldchain.project.business.device.service.IDeviceFlowPoolService;
import com.coldchain.project.business.device.service.IDeviceService;
import com.coldchain.project.business.flow.domain.FlowPlans;
import com.coldchain.project.business.flow.service.IFlowPlansService;
import com.coldchain.project.business.order.domain.OrderDeviceFlow;
import com.coldchain.project.business.order.domain.OrderFlowPlans;
import com.coldchain.project.business.order.mapper.OrderDeviceFlowMapper;
import com.coldchain.project.business.order.service.IOrderDeviceFlowService;
import com.coldchain.project.business.order.service.IOrderFlowPlansService;
import com.coldchain.project.business.order.vo.OrderDeviceFlowVo;
import com.coldchain.project.business.user.domain.NtsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 设备流量订单Service业务层处理
 *
 * @author nts
 * @date 2019-11-29
 */
@Service
public class OrderDeviceFlowServiceImpl implements IOrderDeviceFlowService {

    @Autowired
    private OrderDeviceFlowMapper orderDeviceFlowMapper;
    @Autowired
    private IDeviceService deviceService;
    @Autowired
    private IFlowPlansService flowPlansService;
    @Autowired
    private IOrderFlowPlansService orderFlowPlansService;
    @Autowired
    private IDeviceFlowPoolService deviceFlowPoolService;


    /**
     * 查询设备流量订单
     *
     * @param orderDeviceFlowId 设备流量订单ID
     * @return 设备流量订单
     */
    @Override
    public OrderDeviceFlow selectOrderDeviceFlowById(Long orderDeviceFlowId) {
        return orderDeviceFlowMapper.selectOrderDeviceFlowById(orderDeviceFlowId);
    }

    /**
     * 查询设备流量订单列表
     *
     * @param orderDeviceFlow 设备流量订单
     * @return 设备流量订单
     */
    @Override
    public List<OrderDeviceFlow> selectOrderDeviceFlowList(OrderDeviceFlow orderDeviceFlow) {
        return orderDeviceFlowMapper.selectOrderDeviceFlowList(orderDeviceFlow);
    }

    /**
     * 新增设备流量订单
     *
     * @param orderDeviceFlow 设备流量订单
     * @return 结果
     */
    @Override
    public int insertOrderDeviceFlow(OrderDeviceFlow orderDeviceFlow) {
        orderDeviceFlow.setCreateTime(DateUtils.getNowDate());
        return orderDeviceFlowMapper.insertOrderDeviceFlow(orderDeviceFlow);
    }

    /**
     * 修改设备流量订单
     *
     * @param orderDeviceFlow 设备流量订单
     * @return 结果
     */
    @Override
    public int updateOrderDeviceFlow(OrderDeviceFlow orderDeviceFlow) {
        orderDeviceFlow.setUpdateTime(DateUtils.getNowDate());
        return orderDeviceFlowMapper.updateOrderDeviceFlow(orderDeviceFlow);
    }

    /**
     * 删除设备流量订单对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOrderDeviceFlowByIds(String ids) {
        return orderDeviceFlowMapper.deleteOrderDeviceFlowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备流量订单信息
     *
     * @param orderDeviceFlowId 设备流量订单ID
     * @return 结果
     */
    @Override
    public int deleteOrderDeviceFlowById(Long orderDeviceFlowId) {
        return orderDeviceFlowMapper.deleteOrderDeviceFlowById(orderDeviceFlowId);
    }

    /**
     * 设备流量订单添加
     *
     * @param deviceId    设备表ID
     * @param flowPlansId 流量套餐ID
     * @param flowNumber  流量数量
     * @param loginUser   登录用户
     * @return 结果
     */
    @Transactional
    @Override
    public Map<String, Object> orderDeviceFlowAdd(Long deviceId, Long flowPlansId, Double flowNumber, NtsUser loginUser) {
        int result = deviceService.countDeviceById(deviceId);
        if (result == 0) {
            throw new NtsException("设备ID不存在");
        }
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
        OrderDeviceFlow orderDeviceFlow = new OrderDeviceFlow();
        orderDeviceFlow.setCompanyId(loginUser.getCompanyId());
        orderDeviceFlow.setDeviceId(deviceId);
        orderDeviceFlow.setCreateUserId(loginUser.getUserId());
        orderDeviceFlow.setOrderCode(Constants.DF_TAG + "_" + NtsUtil.generateOrderNumber());
        //订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后
        orderDeviceFlow.setOrderStatus(0);
        orderDeviceFlow.setFlowPrice(flowTotalPrice); //流量总价
        orderDeviceFlow.setOrderPrice(flowTotalPrice); //订单总价
        orderDeviceFlow.setActualPrice(flowTotalPrice); //实际需要支付的金额
        insertOrderDeviceFlow(orderDeviceFlow);

        //创建订单流量套餐
        OrderFlowPlans orderFlowPlans = new OrderFlowPlans();
        orderFlowPlans.setOrderId(orderDeviceFlow.getOrderDeviceFlowId());
        orderFlowPlans.setOrderType(1); //订单类型 1-设备流量订单 2-企业流订单
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
        resultObjMap.put("orderId", orderDeviceFlow.getOrderDeviceFlowId());
        resultObjMap.put("orderCode", orderDeviceFlow.getOrderCode());
        resultObjMap.put("actualPrice", orderDeviceFlow.getActualPrice());
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
    public List<OrderDeviceFlowVo> queryByCompanyId(Long companyId) {
        return orderDeviceFlowMapper.queryByCompanyId(companyId);
    }

    /**
     * 根据订单编号查询订单
     *
     * @param orderCode 设备编号
     * @return 结果
     */
    @Override
    public OrderDeviceFlow queryOrderDeviceFlowByOrderCode(String orderCode) {
        return orderDeviceFlowMapper.queryOrderDeviceFlowByOrderCode(orderCode);
    }

    /**
     * 更新设备流量订单/设备流量池由支付成功后
     *
     * @param orderDeviceFlow 设备流量订单
     */
    @Transactional
    @Override
    public void updateOrderDeviceFlowByPayOk(OrderDeviceFlow orderDeviceFlow) {
        //支付回调成功后，更改订单相关状态
        orderDeviceFlow.setOrderStatus(2); //订单状态 0-待付款 1-处理中 2-已完成 3-取消 4-售后
        orderDeviceFlow.setPayStatus(2); //支付状态 0-初始化 1-付款中,2-支付成功
        orderDeviceFlow.setPayCallback(1); //支付回调状态 0-初始化 1-成功,-1-失败
        orderDeviceFlow.setPayTime(DateUtils.getNowDate());
        //更新设备流量订单
        updateOrderDeviceFlow(orderDeviceFlow);

        //更新设备流量池业务逻辑 订单类型 1-设备流量订单
        OrderFlowPlans orderFlowPlans = orderFlowPlansService.queryByOrderIdAndOrderType(orderDeviceFlow.getOrderDeviceFlowId(), 1);
        DeviceFlowPool deviceFlowPool = deviceFlowPoolService.queryByDeviceId(orderDeviceFlow.getDeviceId());
        if (StringUtils.isNotNull(orderFlowPlans) && StringUtils.isNotNull(deviceFlowPool)) {
            Double surplusFlow = deviceFlowPool.getSurplusFlow();
            surplusFlow = surplusFlow + (orderFlowPlans.getFlowNumber() * 1024); //累加，kb 转换成 b(字节)
            deviceFlowPool.setSurplusFlow(surplusFlow);
            //更新设备流量池
            deviceFlowPoolService.updateDeviceFlowPool(deviceFlowPool);
        }
    }
}
