package com.coldchain.project.business.order.service;

import com.coldchain.project.business.order.domain.OrderCompanyFlow;
import com.coldchain.project.business.order.vo.OrderCompanyFlowVo;
import com.coldchain.project.business.user.domain.NtsUser;

import java.util.List;
import java.util.Map;

/**
 * 企业流量订单Service接口
 *
 * @author nts
 * @date 2020-03-23
 */
public interface IOrderCompanyFlowService {
    /**
     * 查询企业流量订单
     *
     * @param orderCompanyFlowId 企业流量订单ID
     * @return 企业流量订单
     */
    public OrderCompanyFlow selectOrderCompanyFlowById(Long orderCompanyFlowId);

    /**
     * 查询企业流量订单列表
     *
     * @param orderCompanyFlow 企业流量订单
     * @return 企业流量订单集合
     */
    public List<OrderCompanyFlow> selectOrderCompanyFlowList(OrderCompanyFlow orderCompanyFlow);

    /**
     * 新增企业流量订单
     *
     * @param orderCompanyFlow 企业流量订单
     * @return 结果
     */
    public int insertOrderCompanyFlow(OrderCompanyFlow orderCompanyFlow);

    /**
     * 修改企业流量订单
     *
     * @param orderCompanyFlow 企业流量订单
     * @return 结果
     */
    public int updateOrderCompanyFlow(OrderCompanyFlow orderCompanyFlow);

    /**
     * 批量删除企业流量订单
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderCompanyFlowByIds(String ids);

    /**
     * 删除企业流量订单信息
     *
     * @param orderCompanyFlowId 企业流量订单ID
     * @return 结果
     */
    public int deleteOrderCompanyFlowById(Long orderCompanyFlowId);

    /**
     * 企业流量订单添加
     *
     * @param flowPlansId 流量套餐ID
     * @param flowNumber  流量数量
     * @param loginUser   登录用户
     * @return 结果
     */
    Map<String, Object> orderCompanyFlowAdd(Long flowPlansId, Double flowNumber, NtsUser loginUser);


    /**
     * 根据公司ID查询设备流量订单
     *
     * @param companyId 公司ID
     * @return 结果
     */
    List<OrderCompanyFlowVo> queryByCompanyId(Long companyId,
                                              String search,
                                              String startDate,
                                              String overDate);

    /**
     * 根据订单编号查询订单
     *
     * @param orderCode 设备编号
     * @return 结果
     */
    OrderCompanyFlow queryOrderCompanyFlowByOrderCode(String orderCode);

    /**
     * 更新企业流量订单/设备流量池由支付成功后
     *
     * @param orderCompanyFlow 企业流量订单
     */
    void updateOrderCompanyFlowByPayOk(OrderCompanyFlow orderCompanyFlow);
}
