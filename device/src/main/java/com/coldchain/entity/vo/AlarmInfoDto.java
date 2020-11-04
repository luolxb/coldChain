package com.coldchain.entity.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmInfoDto {

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
