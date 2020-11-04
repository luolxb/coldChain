package com.coldchain.project.business.dict.mapper;

import com.coldchain.project.business.dict.domain.CompanyScale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 字典-企业规模Mapper接口
 *
 * @author nts
 * @date 2019-11-23
 */
public interface CompanyScaleMapper {
    /**
     * 查询字典-企业规模
     *
     * @param companyScaleId 字典-企业规模ID
     * @return 字典-企业规模
     */
    public CompanyScale selectCompanyScaleById(@Param("companyScaleId") Integer companyScaleId);

    /**
     * 查询字典-企业规模列表
     *
     * @param companyScale 字典-企业规模
     * @return 字典-企业规模集合
     */
    public List<CompanyScale> selectCompanyScaleList(CompanyScale companyScale);

    /**
     * 新增字典-企业规模
     *
     * @param companyScale 字典-企业规模
     * @return 结果
     */
    public int insertCompanyScale(CompanyScale companyScale);

    /**
     * 修改字典-企业规模
     *
     * @param companyScale 字典-企业规模
     * @return 结果
     */
    public int updateCompanyScale(CompanyScale companyScale);

    /**
     * 删除字典-企业规模
     *
     * @param companyScaleId 字典-企业规模ID
     * @return 结果
     */
    public int deleteCompanyScaleById(@Param("companyScaleId") Integer companyScaleId);

    /**
     * 批量删除字典-企业规模
     *
     * @param companyScaleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyScaleByIds(String[] companyScaleIds);
}