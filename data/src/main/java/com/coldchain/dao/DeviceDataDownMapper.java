package com.coldchain.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.DeviceDataDown;
import com.coldchain.entity.vo.DeviceDataDownVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceDataDownMapper extends BaseMapper<DeviceDataDown> {
    List<DeviceDataDownVo> deviceDataDownPage(Page<DeviceDataDownVo> deviceDataDownVoPage,
                                              @Param("search") String search,
                                              @Param("downStatus") Integer downStatus,
                                              @Param("userId") Integer userId);
}
