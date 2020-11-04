package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.Industry;
import com.coldchain.project.business.dict.mapper.IndustryMapper;
import com.coldchain.project.business.dict.service.IIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-行业Service业务层处理
 * 
 * @author nts
 * @date 2019-11-23
 */
@Service
public class IndustryServiceImpl implements IIndustryService
{
    @Autowired
    private IndustryMapper industryMapper;

    /**
     * 查询字典-行业
     * 
     * @param industryId 字典-行业ID
     * @return 字典-行业
     */
    @Override
    public Industry selectIndustryById(Integer industryId)
    {
        return industryMapper.selectIndustryById(industryId);
    }

    /**
     * 查询字典-行业列表
     * 
     * @param industry 字典-行业
     * @return 字典-行业
     */
    @Override
    public List<Industry> selectIndustryList(Industry industry)
    {
        return industryMapper.selectIndustryList(industry);
    }

    /**
     * 新增字典-行业
     * 
     * @param industry 字典-行业
     * @return 结果
     */
    @Override
    public int insertIndustry(Industry industry)
    {
        industry.setCreateTime(DateUtils.getNowDate());
        return industryMapper.insertIndustry(industry);
    }

    /**
     * 修改字典-行业
     * 
     * @param industry 字典-行业
     * @return 结果
     */
    @Override
    public int updateIndustry(Industry industry)
    {
        industry.setUpdateTime(DateUtils.getNowDate());
        return industryMapper.updateIndustry(industry);
    }

    /**
     * 删除字典-行业对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteIndustryByIds(String ids)
    {
        return industryMapper.deleteIndustryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-行业信息
     * 
     * @param industryId 字典-行业ID
     * @return 结果
     */
    @Override
    public int deleteIndustryById(Integer industryId)
    {
        return industryMapper.deleteIndustryById(industryId);
    }
}
