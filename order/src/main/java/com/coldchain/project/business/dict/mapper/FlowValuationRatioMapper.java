package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.FlowValuationRatio;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-流量计价比率Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface FlowValuationRatioMapper
{
    /**
     * 查询字典-流量计价比率
     * 
     * @param flowValuationRatioId 字典-流量计价比率ID
     * @return 字典-流量计价比率
     */
    public FlowValuationRatio selectFlowValuationRatioById(@Param("flowValuationRatioId") Integer flowValuationRatioId);

    /**
     * 查询字典-流量计价比率列表
     * 
     * @param flowValuationRatio 字典-流量计价比率
     * @return 字典-流量计价比率集合
     */
    public List<FlowValuationRatio> selectFlowValuationRatioList(FlowValuationRatio flowValuationRatio);

    /**
     * 新增字典-流量计价比率
     * 
     * @param flowValuationRatio 字典-流量计价比率
     * @return 结果
     */
    public int insertFlowValuationRatio(FlowValuationRatio flowValuationRatio);

    /**
     * 修改字典-流量计价比率
     * 
     * @param flowValuationRatio 字典-流量计价比率
     * @return 结果
     */
    public int updateFlowValuationRatio(FlowValuationRatio flowValuationRatio);

    /**
     * 删除字典-流量计价比率
     * 
     * @param flowValuationRatioId 字典-流量计价比率ID
     * @return 结果
     */
    public int deleteFlowValuationRatioById(@Param("flowValuationRatioId") Integer flowValuationRatioId);

    /**
     * 批量删除字典-流量计价比率
     * 
     * @param flowValuationRatioIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteFlowValuationRatioByIds(String[] flowValuationRatioIds);
}
