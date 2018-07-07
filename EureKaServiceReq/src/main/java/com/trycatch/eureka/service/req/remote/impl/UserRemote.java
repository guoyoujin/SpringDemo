package com.trycatch.eureka.service.req.remote.impl;

import com.trycatch.eureka.service.req.config.FeignConfiguration;
import com.trycatch.eureka.service.req.remote.UserRemoteHystrix;
import com.trycatch.service.client.controller.api.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component("com.trycatch.eureka.service.req.remote.impl.UserRemote")
@FeignClient(value = "service-test", path = "/api/txdiag/users", fallback = UserRemoteHystrix.class,configuration = FeignConfiguration.class)
public interface UserRemote {
    @RequestMapping(method = RequestMethod.GET, value = "/list",consumes = "application/json")
    ApiResult list();
}
