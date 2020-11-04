package com.coldchain.entity.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 传感器新增参数
 *
 * @author chenqingshan
 * @since 2020-10-17 11:39:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpSenSorDo {
     /**
      * 主键
      */
     @TableId
     private String id;
     /**
      * 传感器名称
      */
     private String sensorName;
     /**
      * 数据类型
      */
     private String sensorType;

     /**
      * 数据类型ID
      */
     private Integer sensorTypeId;
     /**
      * 小数点
      */
     private String decimal;
     /**
      * 数据单位
      */
     private String unit;
     /**
      * 数据内容
      */
     private String value;

     private Integer ordernum; //显示顺序 可选
     private String decimalPlacse; //小数位传感器类型为1（值类型时必填，其它可选）
}
