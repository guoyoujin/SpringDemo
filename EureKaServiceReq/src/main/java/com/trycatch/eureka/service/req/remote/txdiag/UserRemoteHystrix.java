package com.trycatch.eureka.service.req.remote.txdiag;

import com.trycatch.eureka.service.req.remote.txdiag.impl.UserRemote;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import com.trycatch.service.client.controller.api.ApiResult;

public class UserRemoteHystrix implements UserRemote {

    @Override
    public ApiResult list() {
        return new ApiResult<UserEntity>();
    }
}
