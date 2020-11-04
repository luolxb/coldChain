package com.coldchain.project.business.dict.service.impl;

import com.coldchain.common.utils.date.DateUtils;
import com.coldchain.common.utils.text.Convert;
import com.coldchain.project.business.dict.domain.CompanyScale;
import com.coldchain.project.business.dict.mapper.CompanyScaleMapper;
import com.coldchain.project.business.dict.service.ICompanyScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 字典-企业规模Service业务层处理
 *
 * @author nts
 * @date 2019-11-23
 */
@Service
public class CompanyScaleServiceImpl implements ICompanyScaleService {
    @Autowired
    private CompanyScaleMapper companyScaleMapper;

    /**
     * 查询字典-企业规模
     *
     * @param companyScaleId 字典-企业规模ID
     * @return 字典-企业规模
     */
    @Override
    public CompanyScale selectCompanyScaleById(Integer companyScaleId) {
        return companyScaleMapper.selectCompanyScaleById(companyScaleId);
    }

    /**
     * 查询字典-企业规模列表
     *
     * @param companyScale 字典-企业规模
     * @return 字典-企业规模
     */
    @Override
    public List<CompanyScale> selectCompanyScaleList(CompanyScale companyScale) {
        return companyScaleMapper.selectCompanyScaleList(companyScale);
    }

    /**
     * 新增字典-企业规模
     *
     * @param companyScale 字典-企业规模
     * @return 结果
     */
    @Override
    public int insertCompanyScale(CompanyScale companyScale) {
        companyScale.setCreateTime(DateUtils.getNowDate());
        return companyScaleMapper.insertCompanyScale(companyScale);
    }

    /**
     * 修改字典-企业规模
     *
     * @param companyScale 字典-企业规模
     * @return 结果
     */
    @Override
    public int updateCompanyScale(CompanyScale companyScale) {
        companyScale.setUpdateTime(DateUtils.getNowDate());
        return companyScaleMapper.updateCompanyScale(companyScale);
    }

    /**
     * 删除字典-企业规模对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCompanyScaleByIds(String ids) {
        return companyScaleMapper.deleteCompanyScaleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除字典-企业规模信息
     *
     * @param companyScaleId 字典-企业规模ID
     * @return 结果
     */
    @Override
    public int deleteCompanyScaleById(Integer companyScaleId) {
        return companyScaleMapper.deleteCompanyScaleById(companyScaleId);
    }
}
