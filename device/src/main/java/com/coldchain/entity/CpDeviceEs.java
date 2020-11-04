package com.coldchain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.List;

/**
 * 设备表(CpDevice)实体类
 *
 * @author chenqingshan
 * @since 2020-10-10 11:39:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "cold_device", type = "device", replicas = 0)
public class CpDeviceEs implements Serializable {
    /**
     * 主键
     */
    @Id
    private String id;

    @Field
    private List<CpDevice> deviceList;
}