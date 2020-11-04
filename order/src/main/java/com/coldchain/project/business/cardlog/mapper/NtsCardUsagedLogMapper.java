package com.coldchain.project.business.cardlog.mapper;

import com.coldchain.project.business.cardlog.domain.NtsCardUsagedLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 物联网卡使用日志Mapper接口
 * 
 * @author nts
 * @date 2020-04-14
 */
public interface NtsCardUsagedLogMapper 
{
    /**
     * 查询物联网卡使用日志
     * 
     * @param id 物联网卡使用日志ID
     * @return 物联网卡使用日志
     */
    public NtsCardUsagedLog selectNtsCardUsagedLogById(@Param("id") Long id);

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
     * 删除物联网卡使用日志
     * 
     * @param id 物联网卡使用日志ID
     * @return 结果
     */
    public int deleteNtsCardUsagedLogById(@Param("id") Long id);

    /**
     * 批量删除物联网卡使用日志
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNtsCardUsagedLogByIds(String[] ids);
}
