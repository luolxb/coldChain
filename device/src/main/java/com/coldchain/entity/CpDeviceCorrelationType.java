package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 设备-设备类型关联表(CpDeviceCorrelationType)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:50:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cp_device_correlation_type")
public class CpDeviceCorrelationType {
    /**
    * 主键
    */
    @TableId
    private String id;
    /**
    * 设备编号（主键）
    */
    private String deviceId;
    /**
    * 设备类型编号（主键）
    */
    private String deviceTypeId;

}