package com.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Java 实体类转换
 * @author Administrator
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PushJavaJsonElement {

    String value() default "";

    String dateFormat() default "yyyy/MM/dd";

}
