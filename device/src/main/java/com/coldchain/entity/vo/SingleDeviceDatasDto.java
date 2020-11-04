package com.coldchain.entity.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SingleDeviceDatasDto implements Serializable {

    @JsonProperty("userId")
    private Long userId;
    @JsonProperty("deviceId")
    private String deviceId;
    @JsonProperty("deviceNo")
    private String deviceNo;
    @NotNull
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("size")
    private Integer size;
}
