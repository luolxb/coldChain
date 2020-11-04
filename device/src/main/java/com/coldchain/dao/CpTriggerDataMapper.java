package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.CpTriggerData;
import com.coldchain.entity.vo.AlarmRecordVo;
import com.coldchain.entity.vo.CpTriggerDataVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 触发器报警记录表(CpTriggerData)表数据库访问层
 *
 * @author chenqingshan
 * @since 2020-10-12 11:16:27
 */
public interface CpTriggerDataMapper extends BaseMapper<CpTriggerData> {

    List<CpTriggerDataVo> getCpTriggerDataHistoryByMonth(@Param("sensorId")String sensorId);

    List<AlarmRecordVo> alarmRecord(Page<AlarmRecordVo> alarmRecordVoPage,
                                    @Param("deviceId") String deviceId);
}