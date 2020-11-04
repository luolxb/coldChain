package com.coldchain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.CpTrigger;
import com.coldchain.entity.vo.ActiveAlarmVo;
import com.coldchain.entity.vo.AlarmHistoryInfoDto;
import com.coldchain.entity.vo.AlarmInfoDto;
import com.coldchain.entity.vo.TriggerVo;
import com.common.vo.SBApi;

/**
 * (CpTrigger)表服务接口
 *
 * @author chenqingshan
 * @since 2020-10-12 09:11:47
 */
public interface CpTriggerService extends IService<CpTrigger> {

    SBApi addAlarms(TriggerVo alarmInfoVo);

    SBApi getAlarmsHistory(AlarmHistoryInfoDto alarmHistoryInfoDto);

    SBApi updateAlarms(TriggerVo alarmInfoVo);

    SBApi deleteAlarms(String alarmId,String userId);

    SBApi activeAlarms(ActiveAlarmVo activeAlarmVo);

    SBApi getAlarms(AlarmInfoDto alarmInfoDto);

    SBApi getLocalAlarms(AlarmInfoDto alarmInfoDto);
}