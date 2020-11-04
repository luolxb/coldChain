package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.FlowValuationRatio;
import com.coldchain.project.business.dict.mapper.FlowValuationRatioMapper;
import com.coldchain.project.business.dict.service.IFlowValuationRatioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-流量计价比率Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class FlowValuationRatioServiceImpl implements IFlowValuationRatioService
{
    @Autowired
    private FlowValuationRatioMapper flowValuationRatioMapper;

    /**
     * 查询字典-流量计价比率
     * 
     * @param flowValuationRatioId 字典-流量计价比率ID
     * @return 字典-流量计价比率
     */
    @Override
    public FlowValuationRatio selectFlowValuationRatioById(Integer flowValuationRatioId)
    {
        return flowValuationRatioMapper.selectFlowValuationRatioById(flowValuationRatioId);
    }

    /**
     * 查询字典-流量计价比率列表
     * 
     * @param flowValuationRatio 字典-流量计价比率
     * @return 字典-流量计价比率
     */
    @Override
    public List<FlowValuationRatio> selectFlowValuationRatioList(FlowValuationRatio flowValuationRatio)
    {
        return flowValuationRatioMapper.selectFlowValuationRatioList(flowValuationRatio);
    }

    /**
     * 新增字典-流量计价比率
     * 
     * @param flowValuationRatio 字典-流量计价比率
     * @return 结果
     */
    @Override
    public int insertFlowValuationRatio(FlowValuationRatio flowValuationRatio)
    {
        flowValuationRatio.setCreateTime(DateUtils.getNowDate());
        return flowValuationRatioMapper.insertFlowValuationRatio(flowValuationRatio);
    }

    /**
     * 修改字典-流量计价比率
     * 
     * @param flowValuationRatio 字典-流量计价比率
     * @return 结果
     */
    @Override
    public int updateFlowValuationRatio(FlowValuationRatio flowValuationRatio)
    {
        flowValuationRatio.setUpdateTime(DateUtils.getNowDate());
        return flowValuationRatioMapper.updateFlowValuationRatio(flowValuationRatio);
    }

    /**
     * 删除字典-流量计价比率对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFlowValuationRatioByIds(String ids)
    {
        return flowValuationRatioMapper.deleteFlowValuationRatioByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-流量计价比率信息
     * 
     * @param flowValuationRatioId 字典-流量计价比率ID
     * @return 结果
     */
    @Override
    public int deleteFlowValuationRatioById(Integer flowValuationRatioId)
    {
        return flowValuationRatioMapper.deleteFlowValuationRatioById(flowValuationRatioId);
    }
}
