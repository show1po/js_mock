package com.js.mock.web.exceptions;

/**
 * 業務異常
 * Created by Show on 2017/5/31.
 */
public class Exception extends RuntimeException {
    public Exception(String message) {
        super(message);
    }

    public Exception(String message, Throwable throwable) {
        super(message, throwable);
    }
}
