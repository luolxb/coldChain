package com.coldchain.entity.vo;

import com.common.dto.CpDeviceDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("设备数据下载")
public class DeviceDataDownRq {

    @ApiModelProperty("开始时间")
    private Long startTime;
    @ApiModelProperty("结束时间")
    private Long endTime;

    @ApiModelProperty("邮箱")
    @Email
    private String mail;

    @ApiModelProperty("设备")
    @Size(message = "设备不能为空")
    List<CpDeviceDto> deviceList;



}
