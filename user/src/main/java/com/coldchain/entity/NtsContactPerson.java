package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 联系人实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("nts_contact_person")
public class NtsContactPerson {

    /**
     * 主键
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 联系人
     */
    private String name;


    /**
     * 电话
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 联系人
     */
    private String nickMame;

    /**
     * 联系人 code
     */
    private String code;

    private Date createTime;
    private String createBy;
    private String updateBy;
    private Date updateTime;
}
