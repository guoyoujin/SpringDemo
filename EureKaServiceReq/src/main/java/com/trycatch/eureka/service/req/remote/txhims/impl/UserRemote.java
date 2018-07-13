package com.trycatch.eureka.service.req.remote.txhims.impl;

import com.trycatch.eureka.service.req.config.OpenFeignConfiguration;
import com.trycatch.eureka.service.req.remote.txhims.UserRemoteHystrix;
import com.trycatch.service.client.controller.api.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-client", path = "/api/txhims/users", fallback = UserRemoteHystrix.class,configuration = OpenFeignConfiguration.class)
public interface UserRemote {
    @RequestMapping(method = RequestMethod.GET, value = "/list",consumes = "application/json")
    ApiResult list();
}
