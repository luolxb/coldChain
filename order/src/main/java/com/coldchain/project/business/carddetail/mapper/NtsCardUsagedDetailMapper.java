package com.coldchain.project.business.carddetail.mapper;

import com.coldchain.project.business.carddetail.domain.NtsCardUsagedDetail;
import com.coldchain.project.business.device.vo.FlowAggSumVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 物联卡流量使用使用详情Mapper接口
 *
 * @author nts
 * @date 2020-04-14
 */
public interface NtsCardUsagedDetailMapper {
    /**
     * 查询物联卡流量使用使用详情
     *
     * @param id 物联卡流量使用使用详情ID
     * @return 物联卡流量使用使用详情
     */
    public NtsCardUsagedDetail selectNtsCardUsagedDetailById(@Param("id") Long id);

    /**
     * 查询物联卡流量使用使用详情列表
     *
     * @param ntsCardUsagedDetail 物联卡流量使用使用详情
     * @return 物联卡流量使用使用详情集合
     */
    public List<NtsCardUsagedDetail> selectNtsCardUsagedDetailList(NtsCardUsagedDetail ntsCardUsagedDetail);

    public List<NtsCardUsagedDetail> selectNtsCardUsagedDetailList2(NtsCardUsagedDetail ntsCardUsagedDetail);

    /**
     * 新增物联卡流量使用使用详情
     *
     * @param ntsCardUsagedDetail 物联卡流量使用使用详情
     * @return 结果
     */
    public int insertNtsCardUsagedDetail(NtsCardUsagedDetail ntsCardUsagedDetail);

    /**
     * 修改物联卡流量使用使用详情
     *
     * @param ntsCardUsagedDetail 物联卡流量使用使用详情
     * @return 结果
     */
    public int updateNtsCardUsagedDetail(NtsCardUsagedDetail ntsCardUsagedDetail);

    int updateNtsCardUsagedDetailByIccIdAndDate(NtsCardUsagedDetail ntsCardUsagedDetail);

    /**
     * 删除物联卡流量使用使用详情
     *
     * @param id 物联卡流量使用使用详情ID
     * @return 结果
     */
    public int deleteNtsCardUsagedDetailById(@Param("id") Long id);

    /**
     * 批量删除物联卡流量使用使用详情
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNtsCardUsagedDetailByIds(String[] ids);

    /**
     * 4G流量统计日志详情
     *
     * @param iccId
     * @param startDate
     * @param overDate
     * @return
     */
    List<FlowAggSumVo> flow4GLogDetail(@Param("iccId") String iccId,
                                       @Param("startDate") String startDate,
                                       @Param("overDate") String overDate);
}
