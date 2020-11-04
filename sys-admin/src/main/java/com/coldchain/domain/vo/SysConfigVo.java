package com.coldchain.domain.vo;

import com.coldchain.common.annotation.Excel;
import com.coldchain.common.annotation.Excel.ColumnType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 参数配置表 sys_config
 * 
 * @author nts
 */
@Data
@ApiModel(value = "参数配置")
public class SysConfigVo{


    /** 参数主键 */
    @Excel(name = "参数主键", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(name = "configId", value = "参数编号", required = false, dataType = "Long")
    private Long configId;

    /** 参数名称 */
    @Excel(name = "参数名称")
    @ApiModelProperty(name = "configName", value = "参数名称", required = false, dataType = "String")
    private String configName;

    /** 参数键名 */
    @Excel(name = "参数键名")
    @ApiModelProperty(name = "configKey", value = "参数键名", required = false, dataType = "String")
    private String configKey;

    /** 参数键值 */
    @Excel(name = "参数键值")
    @ApiModelProperty(name = "configValue", value = "参数键值", required = false, dataType = "String")
    private String configValue;

    /** 系统内置（Y是 N否） */
    @Excel(name = "系统内置", readConverterExp = "Y=是,N=否")
    @ApiModelProperty(name = "configType", value = "系统内置（Y是 N否）", required = false, dataType = "String")
    private String configType;

}
