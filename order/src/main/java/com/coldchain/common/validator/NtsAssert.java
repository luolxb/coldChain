package com.coldchain.common.validator;

import com.coldchain.common.exception.NtsException;
import com.coldchain.common.utils.StringUtils;

/**
 * 数据校验
 */
public class NtsAssert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new NtsException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new NtsException(message);
        }
    }
}
