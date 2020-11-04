package com.coldchain.project.business.dict.service;

import com.coldchain.project.business.dict.domain.Industry;

import java.util.List;

/**
 * 字典-行业Service接口
 * 
 * @author nts
 * @date 2019-11-23
 */
public interface IIndustryService
{
    /**
     * 查询字典-行业
     * 
     * @param industryId 字典-行业ID
     * @return 字典-行业
     */
    public Industry selectIndustryById(Integer industryId);

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
     * 批量删除字典-行业
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteIndustryByIds(String ids);

    /**
     * 删除字典-行业信息
     * 
     * @param industryId 字典-行业ID
     * @return 结果
     */
    public int deleteIndustryById(Integer industryId);
}
