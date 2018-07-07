package com.trycatch.eureka.service.req.remote;

import com.trycatch.eureka.service.req.remote.impl.UserRemote;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import com.trycatch.service.client.controller.api.ApiResult;

public class UserRemoteHystrix implements UserRemote {

    @Override
    public ApiResult list() {
        return new ApiResult<UserEntity>();
    }
}
