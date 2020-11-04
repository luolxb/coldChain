package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * 联系人实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("联系人实体类")
public class NtsContactPersonRq {

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
    @NotBlank(message = "联系人不能为空")
    @ApiModelProperty("联系人")
    private String name;


    /**
     * 电话
     */
    @NotBlank(message = "电话号码不能为空")
    @ApiModelProperty("电话")
    private String mobile;

    /**
     * 邮箱
     */
    @NotBlank(message = "邮箱不能为空")
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 微信
     */
    @ApiModelProperty("微信")
    private String wechat;

}
