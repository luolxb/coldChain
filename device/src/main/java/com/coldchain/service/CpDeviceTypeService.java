package com.coldchain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coldchain.entity.CpDeviceType;
import com.coldchain.entity.vo.CpDeviceTypeRq;
import com.coldchain.entity.vo.CpDeviceTypeVo;

import java.util.List;

/**
 * 设备类型表(CpDeviceType)表服务接口
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:13
 */
public interface CpDeviceTypeService {


    void add(CpDeviceTypeRq cpDeviceTypeRq);


    void edit(CpDeviceTypeRq cpDeviceTypeRq);

    void delete(String ids);

    Page<CpDeviceTypeVo> deviceTypePage(Long start, Long end, String deviceTypeName, Integer page, Integer size);
}