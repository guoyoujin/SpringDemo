package com.trycatch.eureka.service.req.remote.txdiag;

import com.trycatch.eureka.service.req.remote.txdiag.impl.UserRemote;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import com.trycatch.service.client.controller.api.ApiResult;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component("com.trycatch.eureka.service.req.remote.txdiag.UserRemoteHystrix")
public class UserRemoteHystrix implements FallbackFactory<UserRemote> {

    @Override
    public UserRemote create(Throwable throwable) {
        return new UserRemote() {
            @Override
            public ApiResult list() {
                return new ApiResult<>().setMsg(throwable.getMessage());
            }
        };
    }
}