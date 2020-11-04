package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.PayModel;
import com.coldchain.project.business.dict.mapper.PayModelMapper;
import com.coldchain.project.business.dict.service.IPayModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-支付方式Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class PayModelServiceImpl implements IPayModelService
{
    @Autowired
    private PayModelMapper payModelMapper;

    /**
     * 查询字典-支付方式
     * 
     * @param payModelId 字典-支付方式ID
     * @return 字典-支付方式
     */
    @Override
    public PayModel selectPayModelById(Integer payModelId)
    {
        return payModelMapper.selectPayModelById(payModelId);
    }

    /**
     * 查询字典-支付方式列表
     * 
     * @param payModel 字典-支付方式
     * @return 字典-支付方式
     */
    @Override
    public List<PayModel> selectPayModelList(PayModel payModel)
    {
        return payModelMapper.selectPayModelList(payModel);
    }

    /**
     * 新增字典-支付方式
     * 
     * @param payModel 字典-支付方式
     * @return 结果
     */
    @Override
    public int insertPayModel(PayModel payModel)
    {
        payModel.setCreateTime(DateUtils.getNowDate());
        return payModelMapper.insertPayModel(payModel);
    }

    /**
     * 修改字典-支付方式
     * 
     * @param payModel 字典-支付方式
     * @return 结果
     */
    @Override
    public int updatePayModel(PayModel payModel)
    {
        payModel.setUpdateTime(DateUtils.getNowDate());
        return payModelMapper.updatePayModel(payModel);
    }

    /**
     * 删除字典-支付方式对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePayModelByIds(String ids)
    {
        return payModelMapper.deletePayModelByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-支付方式信息
     * 
     * @param payModelId 字典-支付方式ID
     * @return 结果
     */
    @Override
    public int deletePayModelById(Integer payModelId)
    {
        return payModelMapper.deletePayModelById(payModelId);
    }
}
