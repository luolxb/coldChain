package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.Carrier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-服务商Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface CarrierMapper
{
    /**
     * 查询字典-服务商
     * 
     * @param carrierId 字典-服务商ID
     * @return 字典-服务商
     */
    public Carrier selectCarrierById(@Param("carrierId") Integer carrierId);

    /**
     * 查询字典-服务商列表
     * 
     * @param carrier 字典-服务商
     * @return 字典-服务商集合
     */
    public List<Carrier> selectCarrierList(Carrier carrier);

    /**
     * 新增字典-服务商
     * 
     * @param carrier 字典-服务商
     * @return 结果
     */
    public int insertCarrier(Carrier carrier);

    /**
     * 修改字典-服务商
     * 
     * @param carrier 字典-服务商
     * @return 结果
     */
    public int updateCarrier(Carrier carrier);

    /**
     * 删除字典-服务商
     * 
     * @param carrierId 字典-服务商ID
     * @return 结果
     */
    public int deleteCarrierById(@Param("carrierId") Integer carrierId);

    /**
     * 批量删除字典-服务商
     * 
     * @param carrierIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCarrierByIds(String[] carrierIds);
}
