package com.coldchain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coldchain.dao.CpDeviceCorrelationSensorMapper;
import com.coldchain.entity.CpDeviceCorrelationSensor;
import com.coldchain.entity.CpDeviceCorrelationType;
import com.coldchain.dao.CpDeviceCorrelationTypeMapper;
import com.coldchain.service.CpDeviceCorrelationTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 设备-设备类型关联表(CpDeviceCorrelationType)表服务实现类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:50:30
 */
@Service("cpDeviceCorrelationTypeService")
public class CpDeviceCorrelationTypeServiceImpl extends ServiceImpl<CpDeviceCorrelationTypeMapper, CpDeviceCorrelationType>  implements CpDeviceCorrelationTypeService {

}