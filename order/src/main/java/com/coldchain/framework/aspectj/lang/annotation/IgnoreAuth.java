package com.coldchain.framework.aspectj.lang.annotation;

import java.lang.annotation.*;

/**
 * app登录校验
 * 创建时间：2019年11月20日
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreAuth {
}
