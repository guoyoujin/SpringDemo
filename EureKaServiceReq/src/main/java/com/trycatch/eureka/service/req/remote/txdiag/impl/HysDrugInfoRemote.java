package com.trycatch.eureka.service.req.remote.txdiag.impl;

import com.trycatch.eureka.service.req.config.OpenFeignConfiguration;
import com.trycatch.eureka.service.req.remote.txdiag.HysDrugInfoRemoteHystrix;
import com.trycatch.service.client.controller.api.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-client", path = "/api/txdiag/hys_drug_infos", fallbackFactory = HysDrugInfoRemoteHystrix.class,configuration = OpenFeignConfiguration.class)
public interface HysDrugInfoRemote {
    @RequestMapping(method = RequestMethod.GET, value = "",consumes = "application/json")
    ApiResult list();
}
