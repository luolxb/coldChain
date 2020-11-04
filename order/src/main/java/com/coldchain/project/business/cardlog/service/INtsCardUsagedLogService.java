package com.coldchain.project.business.cardlog.service;

import com.coldchain.project.business.cardlog.domain.NtsCardUsagedLog;

import java.util.List;

/**
 * 物联网卡使用日志Service接口
 *
 * @author nts
 * @date 2020-04-14
 */
public interface INtsCardUsagedLogService {
    /**
     * 查询物联网卡使用日志
     *
     * @param id 物联网卡使用日志ID
     * @return 物联网卡使用日志
     */
    public NtsCardUsagedLog selectNtsCardUsagedLogById(Long id);

    /**
     * 查询物联网卡使用日志列表
     *
     * @param ntsCardUsagedLog 物联网卡使用日志
     * @return 物联网卡使用日志集合
     */
    public List<NtsCardUsagedLog> selectNtsCardUsagedLogList(NtsCardUsagedLog ntsCardUsagedLog);

    /**
     * 新增物联网卡使用日志
     *
     * @param ntsCardUsagedLog 物联网卡使用日志
     * @return 结果
     */
    public int insertNtsCardUsagedLog(NtsCardUsagedLog ntsCardUsagedLog);

    /**
     * 修改物联网卡使用日志
     *
     * @param ntsCardUsagedLog 物联网卡使用日志
     * @return 结果
     */
    public int updateNtsCardUsagedLog(NtsCardUsagedLog ntsCardUsagedLog);

    /**
     * 批量删除物联网卡使用日志
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNtsCardUsagedLogByIds(String ids);

    /**
     * 删除物联网卡使用日志信息
     *
     * @param id 物联网卡使用日志ID
     * @return 结果
     */
    public int deleteNtsCardUsagedLogById(Long id);

    /**
     * 物联卡用量日志
     * 物联卡当月或指定月份用量日志查询
     *
     * @return
     */
    List getCardUsagelog(String date);
}
