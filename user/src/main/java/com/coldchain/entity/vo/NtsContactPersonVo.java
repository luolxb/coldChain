package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("联系人实体类")
public class NtsContactPersonVo {

    /**
     * 主键
     */
    @ApiModelProperty("联系人ID")
    private Long id;

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Long userId;

    /**
     * 联系人
     */
    @ApiModelProperty("联系人")
    private String name;


    /**
     * 电话
     */
    @ApiModelProperty("电话")
    private String mobile;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 微信
     */
    @ApiModelProperty("微信")
    private String wechat;

    /**
     * 联系人
     */
    @ApiModelProperty("联系人")
    private String nickMame;

    /**
     * 联系人 code
     */
    @ApiModelProperty("联系人 code")
    private String code;

    private Date createTime;
    private String createBy;
    private String updateBy;
    private Date updateTime;
}
