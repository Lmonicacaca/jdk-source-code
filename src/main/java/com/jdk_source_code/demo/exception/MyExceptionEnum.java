package com.jdk_source_code.demo.exception;

/**
 * @author lilin
 * @date 2019-09-30
 */
public enum MyExceptionEnum {
    USER_NOT_EXIST(201,"用户不存在");
    private Integer code;
    private String msg;
    MyExceptionEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
