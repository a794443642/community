package com.nuc.wcj.community.exception;

public class CustomizeException extends RuntimeException{
    private String message;
    public CustomizeException(String message) {
        this.message=message;
    }
    public CustomizeException(ICUstomizeErrorCode errorCode){
        this.message=errorCode.getmessage();
    }

    @Override
    public String getMessage() {
        return message;
    }
}
