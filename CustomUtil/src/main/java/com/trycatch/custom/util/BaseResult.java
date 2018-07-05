package com.trycatch.custom.util;

public class BaseResult<T> {
    private String msg;

    private boolean success;

    private T data;

    private int code;

    public BaseResult(String msg, boolean success, T data, int code) {
        this.msg = msg;
        this.success = success;
        this.data = data;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
