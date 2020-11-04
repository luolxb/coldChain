package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.common.dto.CpDeviceGroupDto;
import com.common.dto.CpSensorDataDto;
import com.common.dto.NtsProjectDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "device")
public interface DeviceService {


    @GetMapping("/project/dataDeviceGroup")
    Page<CpDeviceGroupDto> dataDeviceGroup(@RequestParam("page") Integer page,
                                           @RequestParam("size") Integer size,
                                           @RequestParam("userId") Integer userId,
                                           @RequestParam(value = "companyId",required = false)Long companyId);

    /**
     * 根据 设备ID 获取 传感器数据
     * @param deviceId
     * @param start
     * @param end
     * @return
     */
    @GetMapping("/cpSensor/getSensorDataList")
    List<CpSensorDataDto> getSensorDataList(@RequestParam("deviceId") String deviceId,
                                            @RequestParam("start")Long start,
                                            @RequestParam("end")Long end);
}
