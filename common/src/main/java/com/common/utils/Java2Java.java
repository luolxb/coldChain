package com.common.utils;

import com.common.annotation.PushJavaJsonElement;
import com.common.annotation.PushJavaJsonSerializable;
import com.common.exception.ShopException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
public class Java2Java {

    /**
     * 检查对象是否使用PushMq注解
     */
    private void checkifAddAnnotation(Object object) {
        if (Objects.isNull(object)) {
            throw new ShopException(-1,"实体不存在");
        }
        Class<?> clz = object.getClass();
        if (!clz.isAnnotationPresent(PushJavaJsonSerializable.class)) {
            throw new ShopException(-1,clz.getSimpleName() + "没有添加pushMq注解");
        }
    }

    /**
     * 获取字段名
     *
     * @param field
     * @return
     */
    private String getKey(Field field) {
        String value = field.getAnnotation(PushJavaJsonElement.class).value();
        return value.isEmpty() ? field.getName() : value;
    }

    /**
     * 日期格式化
     *
     * @param pattern
     * @param date
     * @return
     */
    private String dateFormat(String pattern, Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String format = dateFormat.format(date);
        return format;
    }

    /**
     * 获取字段值
     *
     * @param field
     * @param object
     * @param mapList
     * @return
     */
    private Object getValue(Field field, Object object, List<Map<String, Object>> mapList) throws Exception {
        if (List.class.isAssignableFrom(field.getType())) {
            List list = (List) field.get(object);

            if (mapList == null) {
                mapList = new ArrayList<>();
            }
            if (null != list) {
                for (Object o : list) {
                    Map<String, Object> maps = getFields(o, mapList, null);
                    mapList.add(maps);
                }
            }
            return mapList;
        }

        String pattern = field.getAnnotation(PushJavaJsonElement.class).dateFormat();

        if (Date.class.isAssignableFrom(field.getType())) {
            Date date = (Date) field.get(object);
            if (null != date) {
                return dateFormat(pattern, date);
            }
        }
        return field.get(object);
    }

    /**
     * 获取字段名与值
     *
     * @param obj
     * @param mapList
     * @param exclusionOtherFiled
     * @return
     */
    private Map<String, Object> getFields(Object obj, List<Map<String, Object>> mapList, String exclusionOtherFiled) throws Exception {
        Class<?> clazz = obj.getClass();

        PushJavaJsonSerializable pushMqJsonSerializable = clazz.getAnnotation(PushJavaJsonSerializable.class);
        String[] exclusions = pushMqJsonSerializable.exclusions();

        List<Field> fieldList = new ArrayList<>();

        while (null != clazz) {
            fieldList.addAll(Arrays.asList(clazz.getDeclaredFields()));
            clazz = clazz.getSuperclass();
        }

        Map<String, Object> jsonElements = new LinkedHashMap<>();

        kkk:
        for (Field field : fieldList) {
            String fieldName = field.getName();
            if (exclusions.length > 0) {
                for (String exclusion : exclusions) {
                    if (exclusion.equals(fieldName)) {
                        break kkk;
                    }
                }
            } else if (null != exclusionOtherFiled) {
                String exclusion = "";
                if ("save".equals(exclusionOtherFiled)) {
                    exclusion = "updateBy";
                } else if ("update".equals(exclusionOtherFiled)) {
                    exclusion = "createBy";
                }
                if (exclusion.equals(fieldName)) {
                    continue;
                }
            }
            field.setAccessible(true);
            if (field.isAnnotationPresent(PushJavaJsonElement.class)) {
                jsonElements.put(getKey(field), getValue(field, obj, mapList));
            }
        }
        return jsonElements;
    }

    /**
     * json->String
     *
     * @param object
     * @param operate
     * @return
     */
    public String getJsonToString(Object object, String operate) throws Exception {
        checkifAddAnnotation(object);
        Map<String, Object> fields = getFields(object, null, operate);

        if (object != null) {
            fields.put("operate", operate);
        }
        return new ObjectMapper().writeValueAsString(fields);
    }
}
