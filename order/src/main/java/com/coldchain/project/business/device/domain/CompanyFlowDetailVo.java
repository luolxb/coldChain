package com.coldchain.project.business.device.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PackageName: com.coldchain.project.business.device.domain
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-24 10:39
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Api
public class CompanyFlowDetailVo {

    @ApiModelProperty(name = "sumSat", value = "卫星消耗流量", dataType = "String", example = "123")
    private String sumSat;

    @ApiModelProperty(name = "satNum", value = "卫星数量", dataType = "String", example = "123")
    private String satNum;

    @ApiModelProperty(name = "sumCard", value = "物联卡消耗流量", dataType = "String", example = "123")
    private String sumCard;

    @ApiModelProperty(name = "cardNum", value = "物联卡数量", dataType = "String", example = "123")
    private String cardNum;




}
