package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.Carrier;
import com.coldchain.project.business.dict.mapper.CarrierMapper;
import com.coldchain.project.business.dict.service.ICarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-服务商Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class CarrierServiceImpl implements ICarrierService
{
    @Autowired
    private CarrierMapper carrierMapper;

    /**
     * 查询字典-服务商
     * 
     * @param carrierId 字典-服务商ID
     * @return 字典-服务商
     */
    @Override
    public Carrier selectCarrierById(Integer carrierId)
    {
        return carrierMapper.selectCarrierById(carrierId);
    }

    /**
     * 查询字典-服务商列表
     * 
     * @param carrier 字典-服务商
     * @return 字典-服务商
     */
    @Override
    public List<Carrier> selectCarrierList(Carrier carrier)
    {
        return carrierMapper.selectCarrierList(carrier);
    }

    /**
     * 新增字典-服务商
     * 
     * @param carrier 字典-服务商
     * @return 结果
     */
    @Override
    public int insertCarrier(Carrier carrier)
    {
        carrier.setCreateTime(DateUtils.getNowDate());
        return carrierMapper.insertCarrier(carrier);
    }

    /**
     * 修改字典-服务商
     * 
     * @param carrier 字典-服务商
     * @return 结果
     */
    @Override
    public int updateCarrier(Carrier carrier)
    {
        carrier.setUpdateTime(DateUtils.getNowDate());
        return carrierMapper.updateCarrier(carrier);
    }

    /**
     * 删除字典-服务商对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCarrierByIds(String ids)
    {
        return carrierMapper.deleteCarrierByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-服务商信息
     * 
     * @param carrierId 字典-服务商ID
     * @return 结果
     */
    @Override
    public int deleteCarrierById(Integer carrierId)
    {
        return carrierMapper.deleteCarrierById(carrierId);
    }
}
