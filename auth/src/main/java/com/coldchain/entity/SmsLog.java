package com.coldchain.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SmsLog {

    private String mobile;

    private Long addTime;

    private String code;

}
