package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 设备数据下载实体类
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("nts_device_data_down")
public class DeviceDataDown {

    /**
     * 表主键ID
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
     * 设备ID
     */
    private String deviceId;
    /**
     * 开始下载时间
     */
    private Date downStart;
    /**
     * 结束下载时间
     */
    private Date downEnd;
    /**
     * 接收方式
     */
    private String receivingMethod;
    /**
     * 下载状态：0：待生成；1：已生成；2：生成失败
     */
    private Integer downStatus;
    /**
     * 本地保存路径
     */
    private String path;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 删除标记0：正常 ；1：删除
     */
    private Long deleteFlag;

    private Integer userId;


}
