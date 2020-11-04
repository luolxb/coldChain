package com.common.exception;

import com.common.vo.SBApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger ALLATORIxDEMO = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler({ShopException.class})
    @ResponseBody
    SBApi ALLATORIxDEMO(ShopException a) {
        ALLATORIxDEMO.error(a.getMessage(), a);
        SBApi var2 = new SBApi();
        var2.setStatus(a.getCode());
        var2.setMsg(a.getMessage());
        var2.setResult(a.getResult());
        return var2;
    }

    public GlobalExceptionHandler() {
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    SBApi ALLATORIxDEMO(Exception a) {
        ALLATORIxDEMO.error(a.getMessage(), a);
        SBApi var2 = new SBApi();
        var2.setStatus(ResultEnum.UNKNOWN_ERROR.getCode());
        var2.setMsg(a.toString());
        return var2;
    }


    @ExceptionHandler({AccessDeniedException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    SBApi ALLATORIxDEMO(AccessDeniedException a, HttpServletResponse a2) {
        ALLATORIxDEMO.error(a.getMessage(), a);
        SBApi var10000 = new SBApi();
        var10000.setStatus(ResultEnum.NO_LOGIN_ERROR.getCode());
        var10000.setMsg(ResultEnum.NO_LOGIN_ERROR.getMsg());
        return var10000;
    }

}
