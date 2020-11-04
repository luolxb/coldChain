package com.coldchain.entity.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpDeviceDto {

    @JsonProperty("userId")
    private String userId;

    /**
     * 设备分组条件
     */
    @JsonProperty("groupId")
    private Integer groupId;
    /**
     * 设备状态
     */
    private Integer isDelete;
    /**
     * 设备在线状态
     */
    private Integer isLine;
    /**
     * 设备是否报警
     */
    @JsonProperty("isAlarms")
    private Integer isAlarms;
    /**
     * 当前页码
     */
    @JsonProperty("currPage")
    private Integer currPage;
    /**
     * 每页的返回数据
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
}
