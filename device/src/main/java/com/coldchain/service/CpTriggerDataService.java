package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.CpTriggerData;
import com.coldchain.entity.vo.AlarmInfoDto;
import com.coldchain.entity.vo.AlarmRecordVo;
import com.coldchain.entity.vo.CpTriggerDataVo;
import com.common.vo.SBApi;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 触发器报警记录表(CpTriggerData)表服务接口
 *
 * @author chenqingshan
 * @since 2020-10-12 11:16:27
 */
public interface CpTriggerDataService {

    List<CpTriggerDataVo> getCpTriggerDataHistoryByMonth(@Param("sensorId") String sensorId);


    SBApi getAlarmsHistory(AlarmInfoDto alarmInfoDto);

    void getDeviceData();

    Page<AlarmRecordVo> alarmRecord(String deviceId, Integer page, Integer size);
}