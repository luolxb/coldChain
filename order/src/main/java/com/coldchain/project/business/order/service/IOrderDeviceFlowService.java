package com.coldchain.project.business.order.service;

import com.coldchain.project.business.order.domain.OrderDeviceFlow;
import com.coldchain.project.business.order.vo.OrderDeviceFlowVo;
import com.coldchain.project.business.user.domain.NtsUser;

import java.util.List;
import java.util.Map;

/**
 * 设备流量订单Service接口
 *
 * @author nts
 * @date 2019-11-29
 */
public interface IOrderDeviceFlowService {
    /**
     * 查询设备流量订单
     *
     * @param orderDeviceFlowId 设备流量订单ID
     * @return 设备流量订单
     */
    public OrderDeviceFlow selectOrderDeviceFlowById(Long orderDeviceFlowId);

    /**
     * 查询设备流量订单列表
     *
     * @param orderDeviceFlow 设备流量订单
     * @return 设备流量订单集合
     */
    public List<OrderDeviceFlow> selectOrderDeviceFlowList(OrderDeviceFlow orderDeviceFlow);

    /**
     * 新增设备流量订单
     *
     * @param orderDeviceFlow 设备流量订单
     * @return 结果
     */
    public int insertOrderDeviceFlow(OrderDeviceFlow orderDeviceFlow);

    /**
     * 修改设备流量订单
     *
     * @param orderDeviceFlow 设备流量订单
     * @return 结果
     */
    public int updateOrderDeviceFlow(OrderDeviceFlow orderDeviceFlow);

    /**
     * 批量删除设备流量订单
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderDeviceFlowByIds(String ids);

    /**
     * 删除设备流量订单信息
     *
     * @param orderDeviceFlowId 设备流量订单ID
     * @return 结果
     */
    public int deleteOrderDeviceFlowById(Long orderDeviceFlowId);

    /**
     * 设备流量订单添加
     *
     * @param deviceId    设备表ID
     * @param flowPlansId 流量套餐ID
     * @param flowNumber  流量数量
     * @param loginUser   登录用户
     * @return 结果
     */
    Map<String, Object> orderDeviceFlowAdd(Long deviceId, Long flowPlansId, Double flowNumber, NtsUser loginUser);

    /**
     * 根据公司ID查询设备流量订单
     *
     * @param companyId 公司ID
     * @return 结果
     */
    List<OrderDeviceFlowVo> queryByCompanyId(Long companyId);

    /**
     * 根据订单编号查询订单
     *
     * @param orderCode 设备编号
     * @return 结果
     */
    OrderDeviceFlow queryOrderDeviceFlowByOrderCode(String orderCode);

    /**
     * 更新设备流量订单/设备流量池由支付成功后
     *
     * @param orderDeviceFlow 设备流量订单
     */
    void updateOrderDeviceFlowByPayOk(OrderDeviceFlow orderDeviceFlow);
}
