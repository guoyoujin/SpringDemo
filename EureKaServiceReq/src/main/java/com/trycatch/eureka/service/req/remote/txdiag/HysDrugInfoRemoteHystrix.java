package com.trycatch.eureka.service.req.remote.txdiag;


import com.trycatch.eureka.service.req.remote.txdiag.impl.HysDrugInfoRemote;
import com.trycatch.service.client.controller.api.ApiResult;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component("com.trycatch.eureka.service.req.remote.txdiag.HysDrugInfoRemoteHystrix")

public class HysDrugInfoRemoteHystrix implements FallbackFactory<HysDrugInfoRemote> {

    @Override
    public HysDrugInfoRemote create(Throwable throwable) {
        return new HysDrugInfoRemote() {
            @Override
            public ApiResult list() {
                return new ApiResult<>().setMsg(throwable.getMessage());
            }
        };
    }
}
