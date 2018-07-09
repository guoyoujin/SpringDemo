package com.trycatch.eureka.service.req.remote.txhims;

import com.trycatch.eureka.service.req.remote.txhims.impl.UserRemote;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import com.trycatch.service.client.controller.api.ApiResult;
import org.springframework.stereotype.Component;

@Component("com.trycatch.eureka.service.req.remote.txhims.UserRemoteHystrix")
public class UserRemoteHystrix implements UserRemote {
    @Override
    public ApiResult list() {
        return new ApiResult<UserEntity>();
    }
}