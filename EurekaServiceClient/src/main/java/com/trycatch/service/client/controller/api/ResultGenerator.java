package com.trycatch.service.client.controller.api;

import com.trycatch.custom.util.BaseConstants;
import com.trycatch.custom.util.BaseResultCode;

public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static ApiResult genSuccessResult() {
        return new ApiResult<>()
                .setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setSuccess(BaseConstants.FLAG_SUCCESS)
                .setCode(BaseResultCode.SUCCESS.code());
    }

    public static <T> ApiResult<T> genSuccessResult(T data) {
        return new ApiResult<T>()
                .setCode(BaseResultCode.SUCCESS.code())
                .setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setSuccess(BaseConstants.FLAG_SUCCESS)
                .setData(data);
    }

    public static ApiResult genFailResult(String message) {
        return new ApiResult<>()
                .setCode(BaseResultCode.FAIL.code())
                .setSuccess(BaseConstants.FLAG_FALSE)
                .setMsg(message);
    }


}
