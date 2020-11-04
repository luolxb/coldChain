package com.coldchain.domain.vo;

import com.coldchain.common.annotation.Excel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "岗位参数模块")
public class SysPostVo {

    /** 岗位序号 */
    @Excel(name = "岗位序号", cellType = Excel.ColumnType.NUMERIC)
    @ApiModelProperty(name = "postId", value = "岗位序号", required = false, dataType = "Long")
    private Long postId;

    /** 岗位编码 */
    @Excel(name = "岗位编码")
    @ApiModelProperty(name = "postCode", value = "岗位编码", required = false, dataType = "String")
    private String postCode;

    /** 岗位名称 */
    @Excel(name = "岗位名称")
    @ApiModelProperty(name = "postName", value = "岗位名称", required = false, dataType = "String")
    private String postName;

    /** 岗位排序 */
    @Excel(name = "岗位排序", cellType = Excel.ColumnType.NUMERIC)
    @ApiModelProperty(name = "postSort", value = "岗位排序", required = false, dataType = "String")
    private String postSort;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    @ApiModelProperty(name = "status", value = "状态", required = false, dataType = "String")
    private String status;
}
