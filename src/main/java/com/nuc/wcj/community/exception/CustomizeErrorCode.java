package com.nuc.wcj.community.exception;

public enum CustomizeErrorCode implements ICUstomizeErrorCode {
    QUESTION_NOT_FOUND("问题没有找到，你换个姿势试试");
    private String message;

    CustomizeErrorCode(String message) {
        this.message=message;
    }

    @Override
    public String getmessage() {
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
}
