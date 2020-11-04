package com.coldchain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("nts_project_device")
public class NtsProjectDevice {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    /**
     * 项目ID
     */
    private Long projectId;

    /**
     * 设备ID
     */
    private String deviceId;
}
