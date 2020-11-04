package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.NtsDictCarrier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-服务商Mapper接口
 * 
 * @author nts
 * @date 2020-04-16
 */
public interface NtsDictCarrierMapper 
{
    /**
     * 查询字典-服务商
     * 
     * @param carrierId 字典-服务商ID
     * @return 字典-服务商
     */
    public NtsDictCarrier selectNtsDictCarrierById(@Param("carrierId") Integer carrierId);

    /**
     * 查询字典-服务商列表
     * 
     * @param ntsDictCarrier 字典-服务商
     * @return 字典-服务商集合
     */
    public List<NtsDictCarrier> selectNtsDictCarrierList(NtsDictCarrier ntsDictCarrier);

    /**
     * 新增字典-服务商
     * 
     * @param ntsDictCarrier 字典-服务商
     * @return 结果
     */
    public int insertNtsDictCarrier(NtsDictCarrier ntsDictCarrier);

    /**
     * 修改字典-服务商
     * 
     * @param ntsDictCarrier 字典-服务商
     * @return 结果
     */
    public int updateNtsDictCarrier(NtsDictCarrier ntsDictCarrier);

    /**
     * 删除字典-服务商
     * 
     * @param carrierId 字典-服务商ID
     * @return 结果
     */
    public int deleteNtsDictCarrierById(@Param("carrierId") Integer carrierId);

    /**
     * 批量删除字典-服务商
     * 
     * @param carrierIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteNtsDictCarrierByIds(String[] carrierIds);
}
