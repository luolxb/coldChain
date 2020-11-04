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
 * (CpDeviceGroup)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:48:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("cp_device_group")
public class CpDeviceGroup {

    /**
    * 主键
    */
    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    private String id;

    /**
    * 分组名称
    */
    private String groupName;
    /**
    * 所属企业ID
    */
    private String groupCompany;
    /**
    * 所属用户ID
    */
    private String groupUser;
    /**
    * 备注
    */
    private String remark;
    /**
    * 创建时间
    */
    private Date createDate;
    /**
    * 创建者
    */
    private String createBy;
    /**
    * 修改时间
    */
    private Date updateDate;
    /**
    * 修改者
    */
    private String updateBy;



}