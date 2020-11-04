package com.coldchain.entity.vo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class SensorHistroyDto implements Serializable {

    @NotNull
    private String userId;
    @NotNull
    private String sensorId;
    @NotNull
    private String startDate;
    @NotNull
    private String endDate;
    private String pagingState;
    @NotNull
    private String pageSize;

}
