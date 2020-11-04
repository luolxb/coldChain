package com.coldchain.domain.vo;

import com.coldchain.common.annotation.Excel;
import com.coldchain.common.annotation.Excel.ColumnType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 字典数据表 sys_dict_data
 * 
 * @author nts
 */
@Data
@ApiModel(value = "字典数据")
public class SysDictDataVo{



    /** 字典编码 */
    @Excel(name = "字典编码", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(name = "dictCode", value = "字典编码", required = false, dataType = "Long")
    private Long dictCode;

    /** 字典排序 */
    @Excel(name = "字典排序", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(name = "dictSort", value = "字典排序", required = false, dataType = "Long")
    private Long dictSort;

    /** 字典标签 */
    @Excel(name = "字典标签")
    @ApiModelProperty(name = "dictLabel", value = "字典标签", required = false, dataType = "String")
    private String dictLabel;

    /** 字典键值 */
    @Excel(name = "字典键值")
    @ApiModelProperty(name = "dictValue", value = "字典键值", required = false, dataType = "String")
    private String dictValue;

    /** 字典类型 */
    @Excel(name = "字典类型")
    @ApiModelProperty(name = "dictType", value = "字典类型", required = false, dataType = "String")
    private String dictType;

    /** 样式属性（其他样式扩展） */
    @Excel(name = "字典样式")
    @ApiModelProperty(name = "cssClass", value = "样式属性（其他样式扩展）", required = false, dataType = "String")
    private String cssClass;

    /** 表格字典样式 */
    @ApiModelProperty(name = "listClass", value = "表格字典样式", required = false, dataType = "String")
    private String listClass;

    /** 是否默认（Y是 N否） */
    @Excel(name = "是否默认", readConverterExp = "Y=是,N=否")
    @ApiModelProperty(name = "isDefault", value = "是否默认（Y是 N否）", required = false, dataType = "String")
    private String isDefault;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    @ApiModelProperty(name = "status", value = "状态（0正常 1停用）", required = false, dataType = "String")
    private String status;


    @ApiModelProperty(name = "beginTime", value = "时间段查询-起始时间", dataType = "String")
    private String beginTime;
    @ApiModelProperty(name = "endTime", value = "时间段查询-结束时间", dataType = "String")
    private String endTime;


}
