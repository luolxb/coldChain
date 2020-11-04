package com.coldchain.domain.vo;

import com.coldchain.common.annotation.Excel;
import com.coldchain.common.annotation.Excel.ColumnType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 字典类型表 sys_dict_type
 * 
 * @author nts
 */
@Data
@ApiModel(value = "字典类型")
public class SysDictTypeVo{


    /** 字典主键 */
    @Excel(name = "字典主键", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(name = "dictId", value = "字典ID", required = false, dataType = "Long")
    private Long dictId;

    /** 字典名称 */
    @Excel(name = "字典名称")
    @ApiModelProperty(name = "dictName", value = "字典名称", required = false, dataType = "String")
    private String dictName;

    /** 字典类型 */
    @Excel(name = "字典类型")
    @ApiModelProperty(name = "dictType", value = "字典类型", required = false, dataType = "String")
    private String dictType;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    @ApiModelProperty(name = "status", value = "状态", required = false, dataType = "String")
    private String status;


    @ApiModelProperty(name = "beginTime", value = "时间段查询-起始时间", dataType = "String")
    private String beginTime;
    @ApiModelProperty(name = "endTime", value = "时间段查询-结束时间", dataType = "String")
    private String endTime;


}
