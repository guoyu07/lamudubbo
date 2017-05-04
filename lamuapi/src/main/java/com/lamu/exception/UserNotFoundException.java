package com.lamu.exception;


/**
 * Created by songliang on 16/6/9.
 */
public class UserNotFoundException extends LamuException {

    public UserNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
