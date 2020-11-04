package com.coldchain.project.business.carddetail.service;

import com.coldchain.project.business.carddetail.domain.NtsCardUsagedDetail;
import com.coldchain.project.business.device.vo.FlowAggSumVo;

import java.util.List;

/**
 * 物联卡流量使用使用详情Service接口
 *
 * @author nts
 * @date 2020-04-14
 */
public interface INtsCardUsagedDetailService {
    /**
     * 查询物联卡流量使用使用详情
     *
     * @param id 物联卡流量使用使用详情ID
     * @return 物联卡流量使用使用详情
     */
    public NtsCardUsagedDetail selectNtsCardUsagedDetailById(Long id);

    /**
     * 查询物联卡流量使用使用详情列表
     *
     * @param ntsCardUsagedDetail 物联卡流量使用使用详情
     * @return 物联卡流量使用使用详情集合
     */
    public List<NtsCardUsagedDetail> selectNtsCardUsagedDetailList(NtsCardUsagedDetail ntsCardUsagedDetail);

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

    /**
     * 批量删除物联卡流量使用使用详情
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNtsCardUsagedDetailByIds(String ids);

    /**
     * 删除物联卡流量使用使用详情信息
     *
     * @param id 物联卡流量使用使用详情ID
     * @return 结果
     */
    public int deleteNtsCardUsagedDetailById(Long id);

    /**
     * 物联卡查询指定月份每日使用量
     *
     * @param date
     * @return
     */
    List getCardUsagedelta(String date);

    /**
     * 4G流量统计日志详情
     *
     * @param iccId
     * @param startDate
     * @param overDate
     * @return
     */
    List<FlowAggSumVo> flow4GLogDetail(String iccId, String startDate, String overDate);

}
