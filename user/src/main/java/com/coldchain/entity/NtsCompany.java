package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 企业类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("nts_company")
public class NtsCompany {

    /**
     * 主键
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    /**
     * 企业类型
     */
    private String companyType;
    /**
     * 企业名称
     */
    private String companyName;
    private String companyCode;


    /**
     * 公司LOGO
     */
    private String logo;

    /**
     * 公司营业执照
     */
    private String businessLicense;

    /**
     * 社会信用代码
     */
    private String socialCreditCode;
    /**
     * 地址
     */
    private String companyAddress;

    /**
     * 公司简介
     */
    private String companyProfile;

    /**
     * 联系电话
     */
    private String companyPhone;
    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;

    /**
     * 状态 1：启用  2：禁用
     */
    private Integer status;

    /**
     * 审核状态 1：待审核，2：已审核
     */
    private Integer auditStatus;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核人
     */
    private String auditBy;

    /**
     * 父节点ID
     */
    private Long parentId;
}
