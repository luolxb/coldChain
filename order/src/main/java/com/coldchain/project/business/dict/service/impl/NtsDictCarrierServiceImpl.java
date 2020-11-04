package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.NtsDictCarrier;
import com.coldchain.project.business.dict.mapper.NtsDictCarrierMapper;
import com.coldchain.project.business.dict.service.INtsDictCarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-服务商Service业务层处理
 * 
 * @author nts
 * @date 2020-04-16
 */
@Service
public class NtsDictCarrierServiceImpl implements INtsDictCarrierService 
{
    @Autowired
    private NtsDictCarrierMapper ntsDictCarrierMapper;

    /**
     * 查询字典-服务商
     * 
     * @param carrierId 字典-服务商ID
     * @return 字典-服务商
     */
    @Override
    public NtsDictCarrier selectNtsDictCarrierById(Integer carrierId)
    {
        return ntsDictCarrierMapper.selectNtsDictCarrierById(carrierId);
    }

    /**
     * 查询字典-服务商列表
     * 
     * @param ntsDictCarrier 字典-服务商
     * @return 字典-服务商
     */
    @Override
    public List<NtsDictCarrier> selectNtsDictCarrierList(NtsDictCarrier ntsDictCarrier)
    {
        return ntsDictCarrierMapper.selectNtsDictCarrierList(ntsDictCarrier);
    }

    /**
     * 新增字典-服务商
     * 
     * @param ntsDictCarrier 字典-服务商
     * @return 结果
     */
    @Override
    public int insertNtsDictCarrier(NtsDictCarrier ntsDictCarrier)
    {
        ntsDictCarrier.setCreateTime(DateUtils.getNowDate());
        return ntsDictCarrierMapper.insertNtsDictCarrier(ntsDictCarrier);
    }

    /**
     * 修改字典-服务商
     * 
     * @param ntsDictCarrier 字典-服务商
     * @return 结果
     */
    @Override
    public int updateNtsDictCarrier(NtsDictCarrier ntsDictCarrier)
    {
        ntsDictCarrier.setUpdateTime(DateUtils.getNowDate());
        return ntsDictCarrierMapper.updateNtsDictCarrier(ntsDictCarrier);
    }

    /**
     * 删除字典-服务商对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNtsDictCarrierByIds(String ids)
    {
        return ntsDictCarrierMapper.deleteNtsDictCarrierByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-服务商信息
     * 
     * @param carrierId 字典-服务商ID
     * @return 结果
     */
    @Override
    public int deleteNtsDictCarrierById(Integer carrierId)
    {
        return ntsDictCarrierMapper.deleteNtsDictCarrierById(carrierId);
    }
}
