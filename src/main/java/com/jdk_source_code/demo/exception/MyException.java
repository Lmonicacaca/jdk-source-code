package com.jdk_source_code.demo.exception;

import org.springframework.stereotype.Component;

/**
 * @author lilin
 * @date 2019-09-30
 */
@Component
public class MyException extends RuntimeException {
    public MyException() {
        super();
    }

    public MyException(String message){
        super(message);
    }



    public MyException(String message, Throwable cause) {
        super(message, cause);
    }



    public MyException(Throwable cause) {
        super(cause);
    }

    protected MyException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
