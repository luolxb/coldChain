package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.Industry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-行业Mapper接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IndustryMapper
{
    /**
     * 查询字典-行业
     * 
     * @param industryId 字典-行业ID
     * @return 字典-行业
     */
    public Industry selectIndustryById(@Param("industryId") Integer industryId);

    /**
     * 查询字典-行业列表
     * 
     * @param industry 字典-行业
     * @return 字典-行业集合
     */
    public List<Industry> selectIndustryList(Industry industry);

    /**
     * 新增字典-行业
     * 
     * @param industry 字典-行业
     * @return 结果
     */
    public int insertIndustry(Industry industry);

    /**
     * 修改字典-行业
     * 
     * @param industry 字典-行业
     * @return 结果
     */
    public int updateIndustry(Industry industry);

    /**
     * 删除字典-行业
     * 
     * @param industryId 字典-行业ID
     * @return 结果
     */
    public int deleteIndustryById(@Param("industryId") Integer industryId);

    /**
     * 批量删除字典-行业
     * 
     * @param industryIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteIndustryByIds(String[] industryIds);
}
