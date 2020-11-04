package com.coldchain.project.business.card.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @PackageName: com.coldchain.project.business.card.domain
 * @program: nts
 * @author: ruosen
 * @create: 2020-04-15 18:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Index4GStaUseDataVo {

    /**
     * 日期
     */
    private String date;
    /**
     * 4G卡总数
     */
    private String sumCard;
    /**
     * 卫星总数
     */
    private String  sumSat;

}
