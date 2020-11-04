package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ApiModel("用户对象")
public class UserManagerLockRq implements Serializable {


    @ApiModelProperty("用户id数组")
    @Size(message = "用户id数组不能为空")
    private List<Integer> userId;

    @NotEmpty(message = "状态不能为空")
    @ApiModelProperty("是否被锁定冻结 0 否，1 是")
    private Integer isLock;



}
