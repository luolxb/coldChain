package com.coldchain.config.security;

import com.common.exception.ResultEnum;
import com.common.vo.SBApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;

@Slf4j
public class Auth2ResponseExceptionTranslator implements WebResponseExceptionTranslator {

    @Override
    public ResponseEntity<OAuth2Exception> translate(Exception e) {
        log.error("Auth2异常");
        Throwable throwable = e.getCause();
        SBApi sbApi = new SBApi();
        if (throwable instanceof InvalidTokenException) {
            sbApi.setStatus(ResultEnum.INVALID_TOKEN.getCode());
            sbApi.setMsg(ResultEnum.INVALID_TOKEN.getMsg());
            log.info("token失效");
            return new ResponseEntity(sbApi, HttpStatus.OK);
        }
        sbApi.setStatus(ResultEnum.UNKNOWN_ERROR.getCode());
        sbApi.setMsg(ResultEnum.UNKNOWN_ERROR.getMsg());
        return new ResponseEntity(sbApi, HttpStatus.METHOD_NOT_ALLOWED);
    }
}

//
///**
// * @Description WebResponseExceptionTranslator
// * @Author wwz
// * @Date 2019/07/30
// * @Param
// * @Return
// */
//@Slf4j
//public class Auth2ResponseExceptionTranslator implements WebResponseExceptionTranslator<OAuth2Exception> {
//
//    private ThrowableAnalyzer throwableAnalyzer = new DefaultThrowableAnalyzer();
//
//    @Override
//    public ResponseEntity<OAuth2Exception> translate(Exception e) throws Exception {
//
//        // Try to extract a SpringSecurityException from the stacktrace
//        Throwable[] causeChain = throwableAnalyzer.determineCauseChain(e);
//
//        // 异常栈获取 OAuth2Exception 异常
//        Exception ase = (OAuth2Exception) throwableAnalyzer.getFirstThrowableOfType(
//                OAuth2Exception.class, causeChain);
//
//        // 异常栈中有OAuth2Exception
//        if (ase != null) {
//            return handleOAuth2Exception((OAuth2Exception) ase);
//        }
//        ase = (AuthenticationException) throwableAnalyzer.getFirstThrowableOfType(AuthenticationException.class,
//                causeChain);
//        if (ase != null) {
//            return handleOAuth2Exception(new UnauthorizedException(e.getMessage(), e));
//        }
//
//        ase = (AccessDeniedException) throwableAnalyzer
//                .getFirstThrowableOfType(AccessDeniedException.class, causeChain);
//        if (ase instanceof AccessDeniedException) {
//            return handleOAuth2Exception(new ForbiddenException(ase.getMessage(), ase));
//        }
//
//        ase = (HttpRequestMethodNotSupportedException) throwableAnalyzer
//                .getFirstThrowableOfType(HttpRequestMethodNotSupportedException.class, causeChain);
//        if (ase instanceof HttpRequestMethodNotSupportedException) {
//            return handleOAuth2Exception(new MethodNotAllowed(ase.getMessage(), ase));
//        }
//        Throwable throwable = e.getCause();
//        SBApi sbApi = new SBApi();
//        if (throwable instanceof InvalidTokenException) {
//            sbApi.setStatus(ResultEnum.INVALID_TOKEN.getCode());
//            sbApi.setMsg(ResultEnum.INVALID_TOKEN.getMsg());
//            log.info("token失效");
//            return new ResponseEntity(sbApi, HttpStatus.OK);
//        }
//
//        return handleOAuth2Exception(new ServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), e));
//    }
//
//    private ResponseEntity<OAuth2Exception> handleOAuth2Exception(OAuth2Exception e) throws IOException {
//
//        int status = e.getHttpErrorCode();
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Cache-Control", "no-store");
//        headers.set("Pragma", "no-cache");
//        if (status == HttpStatus.UNAUTHORIZED.value() || (e instanceof InsufficientScopeException)) {
//            headers.set("WWW-Authenticate", String.format("%s %s", OAuth2AccessToken.BEARER_TYPE, e.getSummary()));
//        }
//
//        MyOAuth2Exception exception = new MyOAuth2Exception(e.getMessage(), e);
//
//        ResponseEntity<OAuth2Exception> response = new ResponseEntity<OAuth2Exception>(exception, headers,
//                HttpStatus.valueOf(status));
//
//        return response;
//
//    }
//
//    public void setThrowableAnalyzer(ThrowableAnalyzer throwableAnalyzer) {
//        this.throwableAnalyzer = throwableAnalyzer;
//    }
//
//    /**
//     * @Description 异常格式
//     * @Author wwz
//     * @Date 2019/07/30
//     * @Param
//     * @Return
//     */
//    @JsonSerialize(using = MyOAuthExceptionJacksonSerializer.class)
//    public class MyOAuth2Exception extends OAuth2Exception {
//        public MyOAuth2Exception(String msg, Throwable t) {
//            super(msg, t);
//
//        }
//        public MyOAuth2Exception(String msg) {
//            super(msg);
//
//        }
//    }
//
//    /**
//     * @Description 定义异常MyOAuth2Exception的序列化
//     * @Author wwz
//     * @Date 2019/07/11
//     * @Param
//     * @Return
//     */
//    public class MyOAuthExceptionJacksonSerializer extends StdSerializer<MyOAuth2Exception> {
//
//        protected MyOAuthExceptionJacksonSerializer() {
//            super(MyOAuth2Exception.class);
//        }
//
//
//        @Override
//        public void serialize(MyOAuth2Exception e, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
//            jsonGenerator.writeStartObject();
//            jsonGenerator.writeObjectField("code", e.getHttpErrorCode());
//            jsonGenerator.writeStringField("msg", e.getSummary());
//            jsonGenerator.writeEndObject();
//        }
//    }
//
//    @SuppressWarnings("serial")
//    private static class ForbiddenException extends OAuth2Exception {
//
//        public ForbiddenException(String msg, Throwable t) {
//            super(msg, t);
//        }
//
//        public String getOAuth2ErrorCode() {
//            return "access_denied";
//        }
//
//        public int getHttpErrorCode() {
//            return 403;
//        }
//
//    }
//
//    @SuppressWarnings("serial")
//    private static class ServerErrorException extends OAuth2Exception {
//
//        public ServerErrorException(String msg, Throwable t) {
//            super(msg, t);
//        }
//
//        public String getOAuth2ErrorCode() {
//            return "server_error";
//        }
//
//        public int getHttpErrorCode() {
//            return 500;
//        }
//
//    }
//
//    @SuppressWarnings("serial")
//    private static class UnauthorizedException extends OAuth2Exception {
//
//        public UnauthorizedException(String msg, Throwable t) {
//            super(msg, t);
//        }
//
//        public String getOAuth2ErrorCode() {
//            return "unauthorized";
//        }
//
//        public int getHttpErrorCode() {
//            return 401;
//        }
//
//    }
//
//    @SuppressWarnings("serial")
//    private static class MethodNotAllowed extends OAuth2Exception {
//
//        public MethodNotAllowed(String msg, Throwable t) {
//            super(msg, t);
//        }
//
//        public String getOAuth2ErrorCode() {
//            return "method_not_allowed";
//        }
//
//        public int getHttpErrorCode() {
//            return 405;
//        }
//
//    }
//}
