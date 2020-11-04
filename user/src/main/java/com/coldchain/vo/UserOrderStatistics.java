package com.coldchain.vo;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class UserOrderStatistics {
    private Integer userId;
    private Integer orderCount;
    private BigDecimal totalAmount;
}