package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.ValuationType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-计价模式Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface ValuationTypeMapper
{
    /**
     * 查询字典-计价模式
     * 
     * @param valuationTypeId 字典-计价模式ID
     * @return 字典-计价模式
     */
    public ValuationType selectValuationTypeById(@Param("valuationTypeId") Integer valuationTypeId);

    /**
     * 查询字典-计价模式列表
     * 
     * @param valuationType 字典-计价模式
     * @return 字典-计价模式集合
     */
    public List<ValuationType> selectValuationTypeList(ValuationType valuationType);

    /**
     * 新增字典-计价模式
     * 
     * @param valuationType 字典-计价模式
     * @return 结果
     */
    public int insertValuationType(ValuationType valuationType);

    /**
     * 修改字典-计价模式
     * 
     * @param valuationType 字典-计价模式
     * @return 结果
     */
    public int updateValuationType(ValuationType valuationType);

    /**
     * 删除字典-计价模式
     * 
     * @param valuationTypeId 字典-计价模式ID
     * @return 结果
     */
    public int deleteValuationTypeById(@Param("valuationTypeId") Integer valuationTypeId);

    /**
     * 批量删除字典-计价模式
     * 
     * @param valuationTypeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteValuationTypeByIds(String[] valuationTypeIds);
}
