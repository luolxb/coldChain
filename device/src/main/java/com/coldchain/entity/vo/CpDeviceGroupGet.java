package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpDeviceGroupGet {

    /**
     * 组id
     */
    private String id;

    /**
     * 是否默认组
     */
    private String isdefault;
    /**
     * 组名
     */
    private String name;
    /**
     * 排序
     */
    private String orderno;
    /**
     * 所属用户ID
     */
    private String userId;




}