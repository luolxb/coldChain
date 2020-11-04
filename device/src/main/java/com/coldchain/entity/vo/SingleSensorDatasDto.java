package com.coldchain.entity.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class SingleSensorDatasDto implements Serializable {
    @NotNull
    private Long userId;
    @NotNull
    private Long sensorId;
}
