package com.coldchain.mapper.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Region {
    private Integer id;
    private Byte level;
    private Integer parentId;
    private Byte isHot;
    private String name;
}