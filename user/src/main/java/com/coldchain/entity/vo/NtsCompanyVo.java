package com.coldchain.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * 企业类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("企业类")
public class NtsCompanyVo {

    /**
     * 主键
     */
    @ApiModelProperty("企业ID")
    private Long id;

    /**
     * 企业类型
     */
    @ApiModelProperty("企业类型")
    private String companyType;
    /**
     * 企业名称
     */
    @ApiModelProperty("企业名称")
    private String companyName;

    @ApiModelProperty("企业唯一识别码")
    private String companyCode;

    /**
     * 公司LOGO
     */
    @ApiModelProperty("公司LOGO")
    private String logo;

    /**
     * 公司营业执照
     */
    @ApiModelProperty("公司营业执照")
    private String businessLicense;

    /**
     * 社会信用代码
     */
    @ApiModelProperty("社会信用代码")
    private String socialCreditCode;
    /**
     * 地址
     */
    @ApiModelProperty("地址")
    private String companyAddress;

    /**
     * 公司简介
     */
    @ApiModelProperty("公司简介")
    private String companyProfile;

    /**
     * 联系电话
     */
    private String companyPhone;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date createTime;

    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date updateTime;

    private String updateBy;

    /**
     * 状态 1：启用  2：禁用
     */
    @ApiModelProperty("状态 1：启用  2：禁用")
    private Integer status;

    /**
     * 审核状态 1：待审核，2：已审核
     */
    @ApiModelProperty("审核状态 1：待审核，2：已审核")
    private Integer auditStatus;

    /**
     * 审核时间
     */
    @ApiModelProperty("审核时间")
    private Date auditTime;

    /**
     * 审核人
     */
    @ApiModelProperty("审核人")
    private String auditBy;

    /**
     * 父节点ID
     */
    private Long parentId;

    private List<NtsCompanyVo> children;
}
