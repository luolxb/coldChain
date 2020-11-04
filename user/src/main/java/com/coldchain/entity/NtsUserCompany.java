package com.coldchain.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户企业关联实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("nts_user_company")
public class NtsUserCompany {

    /**
     * 主键
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 企业ID
     */
    private Long companyId;

}
