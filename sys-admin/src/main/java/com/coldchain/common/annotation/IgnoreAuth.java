package com.coldchain.common.annotation;


import java.lang.annotation.*;

/**
 * api登录校验
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {
}
