package com.trycatch.eureka.service.req.controller.txdiag;

import com.trycatch.eureka.service.req.remote.txdiag.impl.HysDrugInfoRemote;
import com.trycatch.service.client.controller.api.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("com.trycatch.eureka.service.req.controller.txdiag.HysDrugInfoController")
@RequestMapping(value = "/api/txdiag/hys_drug_infos")
public class HysDrugInfoController {

    @Autowired
    private HysDrugInfoRemote hysDrugInfoRemote;

    @RequestMapping(value = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResult list(){
        return hysDrugInfoRemote.list();
    }
}
