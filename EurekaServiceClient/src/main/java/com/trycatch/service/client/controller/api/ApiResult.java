package com.trycatch.service.client.controller.api;

import com.trycatch.custom.util.BaseResult;

public class ApiResult<T> extends BaseResult<T>{

    public String msg;

    public boolean success;

    public T data;

    public int code;


    public ApiResult() {

    }

    public ApiResult(String msg, boolean success, T data, int code) {
        this.msg = msg;
        this.success = success;
        this.data = data;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public ApiResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public ApiResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public T getData() {
        return data;
    }

    public ApiResult setData(T data) {
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ApiResult setCode(int code) {
        this.code = code;
        return this;
    }

}
