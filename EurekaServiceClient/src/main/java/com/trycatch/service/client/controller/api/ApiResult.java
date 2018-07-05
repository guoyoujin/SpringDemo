package com.trycatch.service.client.controller.api;

import com.trycatch.custom.util.BaseResult;

public class ApiResult<T> extends BaseResult{

    public ApiResult(String msg, boolean success, T data, int code) {
        super(msg, success, data, code);
    }
}
