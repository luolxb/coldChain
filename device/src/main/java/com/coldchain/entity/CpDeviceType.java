package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 设备类型表(CpDeviceType)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:49:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cp_device_type")
public class CpDeviceType {

    /**
    * 主键ID
    */
    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    private String id;
    /**
    * 设备厂商
    */
    private String deviceFirm;
    /**
     * 设备类型名称
     */
    private String deviceTypeName;
    /**
    * 设备品牌
    */
    private String deviceBrand;
    /**
    * 备注
    */
    private String remark;
    /**
    * 创建时间
    */
    private Date createDate;
    /**
    * 创建人
    */
    private String createBy;
    /**
    * 修改时间
    */
    private Date updateDate;
    /**
    * 修改人
    */
    private String updateBy;
    /**
     * 设备企业
     */
    private String deviceCompany;
    /**
     * 设备状态
     */
    private Integer status;




}