package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("nts_project")
public class NtsProject {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 项目地址
     */
    private String projectAddress;
    /**
     * 图片地址
     */
    private String image;
    /**
     * 项目类型
     */
    private String projectType;

    /**
     * 备注
     */
    private String remark;

    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
    /**
     * 删除标记0：正常 1：删除
     */
    private Long deleteFlag;

}
