package com.lamu.exception;

/**
 * Created by songliang on 2016/1/13.
 *
 * @author songliang
 */
public class LamuException extends RuntimeException {
    public LamuException(Throwable throwable) {
        super(throwable);
    }

    public LamuException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public LamuException(String message) {
        super(message);
    }
}
