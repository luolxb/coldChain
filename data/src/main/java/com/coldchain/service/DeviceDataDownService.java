package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.coldchain.entity.DeviceDataDown;
import com.coldchain.entity.vo.DeviceDataDownRq;
import com.coldchain.entity.vo.DeviceDataDownVo;

public interface DeviceDataDownService extends IService<DeviceDataDown> {
    void down(DeviceDataDownRq deviceDataDownRq);

    Page<DeviceDataDownVo> deviceDataDownPage(String search,Integer downStatus, Integer page, Integer size);

    void delete(String ids);
}
