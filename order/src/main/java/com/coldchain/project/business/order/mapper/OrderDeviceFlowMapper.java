package com.coldchain.project.business.order.mapper;

import com.coldchain.project.business.order.domain.OrderDeviceFlow;
import com.coldchain.project.business.order.vo.OrderDeviceFlowVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 设备流量订单Mapper接口
 *
 * @author nts
 * @date 2019-11-29
 */
public interface OrderDeviceFlowMapper {
    /**
     * 查询设备流量订单
     *
     * @param orderDeviceFlowId 设备流量订单ID
     * @return 设备流量订单
     */
    public OrderDeviceFlow selectOrderDeviceFlowById(@Param("orderDeviceFlowId") Long orderDeviceFlowId);

    /**
     * 查询设备流量订单列表
     *
     * @param OrderDeviceFlow 设备流量订单
     * @return 设备流量订单集合
     */
    public List<OrderDeviceFlow> selectOrderDeviceFlowList(OrderDeviceFlow OrderDeviceFlow);

    /**
     * 新增设备流量订单
     *
     * @param OrderDeviceFlow 设备流量订单
     * @return 结果
     */
    public int insertOrderDeviceFlow(OrderDeviceFlow OrderDeviceFlow);

    /**
     * 修改设备流量订单
     *
     * @param OrderDeviceFlow 设备流量订单
     * @return 结果
     */
    public int updateOrderDeviceFlow(OrderDeviceFlow OrderDeviceFlow);

    /**
     * 删除设备流量订单
     *
     * @param orderDeviceFlowId 设备流量订单ID
     * @return 结果
     */
    public int deleteOrderDeviceFlowById(@Param("orderDeviceFlowId") Long orderDeviceFlowId);

    /**
     * 批量删除设备流量订单
     *
     * @param orderDeviceFlowIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderDeviceFlowByIds(String[] orderDeviceFlowIds);

    /**
     * 根据公司ID查询设备流量订单
     *
     * @param companyId 公司ID
     * @return 结果
     */
    List<OrderDeviceFlowVo> queryByCompanyId(@Param("companyId") Long companyId);

    /**
     * 根据订单编号查询订单
     *
     * @param orderCode 设备编号
     * @return 结果
     */
    OrderDeviceFlow queryOrderDeviceFlowByOrderCode(@Param("orderCode") String orderCode);
}
