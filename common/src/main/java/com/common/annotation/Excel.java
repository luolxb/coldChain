package com.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义 Excel 注解
 *
 * @author Administrator
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface Excel {

    /**
     * Excel中的列名
     *
     * @return
     */
    public String name();

    /**
     * 列名对应的A,B,C,D...,不指定按照默认顺序排序
     *
     * @return
     */
    public String column() default "";

    /**
     * 提示信息
     *
     * @return
     */
    public String prompt() default "";

    /**
     * 设置只能选择不能输入的列内容
     *
     * @return
     */
    public String[] combo() default {};

    /**
     * 是否导出数据
     *
     * @return
     */
    public boolean isExport() default true;

    /**
     * 是否为重要字段（整列标红,着重显示）
     *
     * @return
     */
    public boolean isMark() default false;

    /**
     * 是否合计当前列
     *
     * @return
     */
    public boolean isSum() default false;
}
