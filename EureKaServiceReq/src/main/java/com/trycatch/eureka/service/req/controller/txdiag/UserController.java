package com.trycatch.eureka.service.req.controller.txdiag;

import com.trycatch.eureka.service.req.remote.txdiag.impl.UserRemote;
import com.trycatch.service.client.controller.api.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("com.trycatch.eureka.service.req.controller.txdiag.UserController")
@RequestMapping(value = "/api/txdiag/users")
public class UserController {

    @Autowired
    private UserRemote userRemote;

    @RequestMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResult list(){
        return userRemote.list();
    }
}
