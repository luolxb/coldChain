package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * 企业类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("企业请求类")
public class NtsCompanyRq {

    /**
     * 主键
     */
    @ApiModelProperty("企业ID")
    private Long id;

    /**
     * 企业类型
     */
    @ApiModelProperty("企业类型")
    @NotBlank(message = "企业类型不能为空")
    private String companyType;
    /**
     * 企业名称
     */
    @ApiModelProperty("企业ID")
    @NotBlank(message = "企业名称")
    private String companyName;

    /**
     * 公司LOGO
     */
    @ApiModelProperty("公司LOGO")
    @NotBlank(message = "公司LOGO不能为空")
    private String logo;

    /**
     * 公司营业执照
     */
    @ApiModelProperty("公司营业执照")
    @NotBlank(message = "公司营业执照不能为空")
    private String businessLicense;

    /**
     * 社会信用代码
     */
    @ApiModelProperty("社会信用代码")
    @NotBlank(message = "社会信用代码不能为空")
    private String socialCreditCode;
    /**
     * 地址
     */
    @ApiModelProperty("地址")
    @NotBlank(message = "地址不能为空")
    private String companyAddress;

    /**
     * 公司简介
     */
    @ApiModelProperty("公司简介")
    @NotBlank(message = "公司简介不能为空")
    private String companyProfile;

    /**
     * 联系电话
     */
    @ApiModelProperty("联系电话")
    @NotBlank(message = "联系电话不能为空")
    private String companyPhone;

    /**
     * 父节点ID
     */
    @ApiModelProperty("父节点ID")
    private Long parentId;
}
