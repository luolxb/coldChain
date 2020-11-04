package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("交易记录")
public class NtsTransactionRecordVo {

    @ApiModelProperty("交易记录ID")
    private Long id;
    /**
     * 交易编码
     */
    @ApiModelProperty("交易编码")
    private String transactionRecordCode;

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Integer userId;
    private Date createTime;
    /**
     * 交易时间
     */
    @ApiModelProperty("交易时间")
    private Date transactionTime;

    /**
     * 交易类型
     */
    @ApiModelProperty("交易类型")
    private String type;

    /**
     * 金额
     */
    @ApiModelProperty("金额")
    private BigDecimal price;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remark;

    private Date updateTime;
    private String updateBy;
    /**
     * 0：交易待确认，1：交易确认
     */
    @ApiModelProperty("0：交易待确认，1：交易确认")
    private long status;
    /**
     * 表
     */
    @ApiModelProperty("表")
    private String table;

}
