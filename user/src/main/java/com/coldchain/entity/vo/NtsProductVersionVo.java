package com.coldchain.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("产品版本实体类")
public class NtsProductVersionVo {

    /**
     * 主键ID 产品ID
     */
    @ApiModelProperty("主键ID 产品ID")
    private Long id;

    /**
     * 产品名称
     */
    @ApiModelProperty("产品名称")
    private String productName;

    /**
     * 产品名称
     */
    @ApiModelProperty("产品名称")
    private String productContent;

    /**
     * 产品价格
     */
    @ApiModelProperty("产品价格")
    private BigDecimal productPrice;

}
