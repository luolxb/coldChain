package com.coldchain.entity.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ActiveAlarmVo  implements Serializable {
    private  String userId;
    private  String alarmId;
    private  Integer active;
}
