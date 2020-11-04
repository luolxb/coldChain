package com.common.exception;



public class ShopException extends RuntimeException {
    private Object obj;
    public Integer code;
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ShopException(com.common.exception.ResultEnum rs) {
        super(rs.getMsg());
        this.code = rs.getCode();
        this.msg = rs.getMsg();
    }

    public Integer getCode() {
        return this.code;
    }


    public void setResult(Object a) {
        this.obj = a;
    }

    public String getMsg() {
        return this.msg;
    }

    public ShopException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public Object getResult() {
        return this.obj;
    }

    public void setCode(Integer a) {
        this.code = a;
    }
}
