package com.coldchain.entity.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmHistoryInfoDto {
    @JsonProperty("userId")
    private String userId;

    @JsonProperty("deviceId")
    private String deviceId;

    @JsonProperty("sensorId")
    private String sensorId;

    @JsonProperty("currPage")
    private Integer currPage;

    @JsonProperty("pageSize")
    private Integer pageSize;
}