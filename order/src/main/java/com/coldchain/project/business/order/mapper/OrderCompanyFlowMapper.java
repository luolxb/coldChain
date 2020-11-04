package com.coldchain.project.business.order.mapper;

import com.coldchain.project.business.order.domain.OrderCompanyFlow;
import com.coldchain.project.business.order.vo.OrderCompanyFlowVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 企业流量订单Mapper接口
 *
 * @author nts
 * @date 2020-03-23
 */
public interface OrderCompanyFlowMapper {
    /**
     * 查询企业流量订单
     *
     * @param orderCompanyFlowId 企业流量订单ID
     * @return 企业流量订单
     */
    public OrderCompanyFlow selectOrderCompanyFlowById(@Param("orderCompanyFlowId") Long orderCompanyFlowId);

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
     * 删除企业流量订单
     *
     * @param orderCompanyFlowId 企业流量订单ID
     * @return 结果
     */
    public int deleteOrderCompanyFlowById(@Param("orderCompanyFlowId") Long orderCompanyFlowId);

    /**
     * 批量删除企业流量订单
     *
     * @param orderCompanyFlowIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderCompanyFlowByIds(String[] orderCompanyFlowIds);

    /**
     * 根据公司ID查询设备流量订单
     *
     * @param companyId 公司ID
     * @return 结果
     */
    List<OrderCompanyFlowVo> queryByCompanyId(@Param("companyId") Long companyId,
                                              @Param("search") String search,
                                              @Param("startDate") String startDate,
                                              @Param("overDate") String overDate);

    /**
     * 根据订单编号查询订单
     *
     * @param orderCode 设备编号
     * @return 结果
     */
    OrderCompanyFlow queryOrderCompanyFlowByOrderCode(@Param("orderCode") String orderCode);
}
