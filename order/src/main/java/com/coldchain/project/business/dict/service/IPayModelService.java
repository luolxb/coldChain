package com.coldchain.project.business.dict.service;

import com.coldchain.project.business.dict.domain.PayModel;

import java.util.List;

/**
 * 字典-支付方式Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IPayModelService
{
    /**
     * 查询字典-支付方式
     * 
     * @param payModelId 字典-支付方式ID
     * @return 字典-支付方式
     */
    public PayModel selectPayModelById(Integer payModelId);

    /**
     * 查询字典-支付方式列表
     * 
     * @param payModel 字典-支付方式
     * @return 字典-支付方式集合
     */
    public List<PayModel> selectPayModelList(PayModel payModel);

    /**
     * 新增字典-支付方式
     * 
     * @param payModel 字典-支付方式
     * @return 结果
     */
    public int insertPayModel(PayModel payModel);

    /**
     * 修改字典-支付方式
     * 
     * @param payModel 字典-支付方式
     * @return 结果
     */
    public int updatePayModel(PayModel payModel);

    /**
     * 批量删除字典-支付方式
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePayModelByIds(String ids);

    /**
     * 删除字典-支付方式信息
     * 
     * @param payModelId 字典-支付方式ID
     * @return 结果
     */
    public int deletePayModelById(Integer payModelId);
}
